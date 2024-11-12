public interface ContractBuilder {

    public void BuildContractID(String id);

    public void BuildPropertyID(String id);

    public void BuildTenantID(String id);

    public void BuildRentAmount(double amount);

    public Contract SignContract();
}
