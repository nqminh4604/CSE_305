public interface DocumentBuilder {

    public void SetExtension(String extension);

    public void SetEncryption(String encrypt);

    public Document buildDoc() throws Exception;
}
