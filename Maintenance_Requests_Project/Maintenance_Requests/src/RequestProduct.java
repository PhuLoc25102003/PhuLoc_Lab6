public interface RequestProduct {

    public void setStatus(Request request);

    public void setExpire(Request request);

    public void setPriority(Request request);

    public void processRequest(Request request);

}
