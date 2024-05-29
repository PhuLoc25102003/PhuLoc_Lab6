public class LowPriorityConcrete implements RequestProduct {
    
    @Override
    public Request processRequest(Request request) {
        setExpire(request);
        setStatus(request);
        setPriority(request);
        System.out.println("Request Denied");

        return  request;
    }

    @Override
    public void setExpire(Request request) {
        request.setExpireDay("28/05/2024");
        
    }

    @Override
    public void setPriority(Request request) {
        request.setPriority("Ignore");

    }

    @Override
    public void setStatus(Request request) {
       request.setStatus("Done"); 
        
    }

   
    

}
