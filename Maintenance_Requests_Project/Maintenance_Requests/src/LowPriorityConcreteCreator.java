public class LowPriorityConcreteCreator implements RequestCreator {

    @Override
    public Request createRequest() {
        Request request = new Request();
        LowPriorityConcrete build = new LowPriorityConcrete();
        build.processRequest(request);
        return request;
    }

}
