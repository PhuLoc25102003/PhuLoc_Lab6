public class MediumPriorityConcrete implements RequestProduct{


    @Override
    public Request processRequest(Request request) {
        setExpire(request);
        setPriority(request);
        setStatus(request);
        System.out.println("Request accept, estimated completion date is 28/06/2024");

        return request;
    }

    @Override
    public void setExpire(Request request) {
        request.setExpireDay("28/06/2024");
    }

    @Override
    public void setPriority(Request request) {
        request.setPriority("Medium");
        
        
    }

    @Override
    public void setStatus(Request request) {
        request.setStatus("Accepted");
        
    }

    

}
