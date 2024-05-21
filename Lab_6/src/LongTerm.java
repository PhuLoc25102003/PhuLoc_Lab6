public class LongTerm implements ContactBuilder {
    private String contactID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;
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
