public class Main {
    public static void main(String[] args) {

        Request createLowRequest = new LowPriorityConcreteCreator().createRequest(); 
        Request createMediumRequest = new MediumPriorityConcreteCreator().createRequest();
        Request createHigh = new HighPriorityConcreteCreator().createRequest();

        
    }

}
