public class Permanent implements ContactBuilder {
    private String contactID;
    private double rentAmount;
    private String tenantID;
    private String propertyID;

    @Override
    public void buildContactID(String contactID) {
       this.contactID = contactID;
        
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
        
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
        
    }

    @Override
    public Contact signalContact() {
        return new Contact(contactID, propertyID, tenantID, rentAmount);
    }
    
    
}
