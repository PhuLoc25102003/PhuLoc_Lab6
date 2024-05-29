public class LowPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void processRequest() {
        System.out.println("Request Denied");
    }

    @Override
    public void setExpire() {
        this.expireDay = "28/05/2024";
        
    }

    @Override
    public void setPriority() {
        this.priority = "Ignore";
        
    }

    @Override
    public void setStatus() {
       this.status = "Done";
        
    }

   
    

}
