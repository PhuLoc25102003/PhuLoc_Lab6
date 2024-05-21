public class NormalDoc extends DocumentBuilder {

    @Override
    public Document buildDoc() {
        return new Document(extension, encyption);
    }

    @Override
    public void setEncyption(boolean encyption) {
        this.encyption = encyption;

    }

    @Override
    public void setExtension(String extension) {
        this.extension = extension;

    }

}