public class Contract {

    private String ContractID;
    private double RentAmount;
    private String TenantId;
    private String PropertyId;

    public Contract(String contractID, double reantAmount, String tenantId, String propertyId) {
        ContractID = contractID;
        RentAmount = reantAmount;
        TenantId = tenantId;
        PropertyId = propertyId;
    }

    @Override
    public String toString() {
        return "Contract [ContractID = " + ContractID + ", RentAmount = " + RentAmount + ", TenantId = " + TenantId
                + ", PropertyId = " + PropertyId + "]";
    }

}
