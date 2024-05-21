public class Contact {
    private String contactID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    public Contact(String contactID, String propertyID, String tenantID, double rentAmount) {
        this.contactID = contactID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString(){
        return this.contactID + " " + this.propertyID + " " + this.tenantID + " " + this.rentAmount + "\n";
    }

    
}
