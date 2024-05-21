public abstract class DocumentBuilder {
    protected String extension;
    protected boolean encyption;

    abstract public void setExtension(String extension);
    abstract public void setEncyption(boolean encyption);
    abstract public Document buildDoc();

    
} 






