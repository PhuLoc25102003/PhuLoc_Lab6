public class MediumPriorityConcrete implements RequestProduct{


    @Override
    public void processRequest(Request request) {
        request.setProcessRequest("Request accept, estimated completion date is 28/5/2024");
        
    }

    @Override
    public void setExpire(Request request) {
        request.setExpireDay("28/06/2024");
    }

    @Override
    public void setPriority() {
        this.priority = "Medium";
        
        
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
        
    }

    

}
