public class HighPriorityConcrete implements RequestProduct {

    @Override
    public Request processRequest(Request request) {
        setExpire(request);
        setPriority(request);
        setStatus(request);
        System.out.println("Emergency request, our Administer will contact you immediately !");

        return request;

    }

    @Override
    public void setExpire(Request request) {
         request.setExpireDay("28/05/2024"); 

    }

    @Override
    public void setPriority(Request request) {
        request.setPriority("Emergency"); 

    }

    @Override
    public void setStatus(Request request) {
        request.setStatus("Accept");

    }

}
