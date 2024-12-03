public class ConfidentialDoc implements DocumentBuilder {
    private String extension;
    private String encryption;

    public ConfidentialDoc() {
    }

    @Override
    public void SetExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void SetEncryption(String encrypt) {
        this.encryption = encrypt;
    }

    @Override
    public Document buildDoc() throws Exception{
        return new Document(extension, encryption);
    }

}
