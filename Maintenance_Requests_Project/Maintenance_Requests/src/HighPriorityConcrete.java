public class HighPriorityConcrete implements RequestProduct {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void processRequest() {
        System.out.println("Emergency request, our Administer will contact you immediately !");

    }

    @Override
    public void setExpire() {
        this.expireDay = "28/05/2024";

    }

    @Override
    public void setPriority() {
        this.priority = "Emergency";

    }

    @Override
    public void setStatus() {
        this.status = "Accept";

    }

}
