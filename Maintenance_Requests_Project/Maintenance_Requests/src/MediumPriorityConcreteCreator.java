public class MediumPriorityConcreteCreator implements RequestCreator{

    @Override
    public Request createRequest() {
        Request request = new Request();
        MediumPriorityConcrete build = new MediumPriorityConcrete();
        build.processRequest(request);
        return request;
    }
    


}
