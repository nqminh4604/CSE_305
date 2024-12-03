import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Document {
    private String extension;
    private String encryption;

    public Document(String extension, String encryption) throws Exception {
        this.extension = extension;

        if (extension.equals("zip")) {
            this.encryption = encrypt(encryption, genSecretKey());
        } else if (extension.equals("txt")) {
            this.encryption = encryption;
        }
    }

    private static SecretKey genSecretKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }

    private static String encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] cryptoBytes = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(cryptoBytes);
    }

    private static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptoBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptoBytes);
    }

    @Override
    public String toString() {
        return "Document:\n extension = " + extension + "\n encryption = " + encryption;
    }

}
