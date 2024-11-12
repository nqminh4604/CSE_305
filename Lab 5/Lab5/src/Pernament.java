public class Pernament implements ContractBuilder {

    private String ContractID;
    private double RentAmount;
    private String TenantId;
    private String PropertyId;

    public Pernament(String contractID, double rentAmount, String tenantId, String propertyId) {
        ContractID = contractID;
        RentAmount = rentAmount;
        TenantId = tenantId;
        PropertyId = propertyId;
    }

    @Override
    public void BuildContractID(String id) {
        this.ContractID = id;
    }

    @Override
    public void BuildPropertyID(String id) {
        this.PropertyId = id;
    }

    @Override
    public void BuildTenantID(String id) {
        this.TenantId = id;
    }

    @Override
    public void BuildRentAmount(double amount) {
        this.RentAmount = amount;
    }

    @Override
    public Contract SignContract() {
        return new Contract(ContractID, RentAmount, TenantId, PropertyId);
    }
    
}
