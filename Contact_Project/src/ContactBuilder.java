public interface ContactBuilder {

    void buildContactID(String contactID);
    void buildPropertyID(String propertyID);
    void buildTenantID(String tenantID);
    void buildRentAmount(double rentAmount);

    Contact signalContact();

    
}
