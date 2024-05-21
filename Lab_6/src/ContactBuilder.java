public interface ContactBuilder {

    void buildContactID();
    void buildPropertyID();
    void buildTenantID();
    void buildRentAmount();

    Contact signalContact();

    
}
