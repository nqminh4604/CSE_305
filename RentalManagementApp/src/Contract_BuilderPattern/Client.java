public class Client {

    public static void newDocument() throws Exception{
        String extension = "zip";
        String encryption = "this is the content";
        ConfidentialDoc conDoc = new ConfidentialDoc();
        conDoc.SetEncryption(encryption);
        conDoc.SetExtension(extension);
        Document doc = conDoc.buildDoc();
        System.out.println(doc);
    }

    public static void requestCreateRentalContract() {
        String ContractId = "1";
        String PropertyId = "1";
        String TenantId = "1";
        double RentAmount = 10;
        LongTerm contract = new LongTerm();
        contract.BuildContractID(ContractId);
        contract.BuildPropertyID(PropertyId);
        contract.BuildTenantID(TenantId);
        contract.BuildRentAmount(RentAmount);
        Contract c = contract.SignContract();
        System.out.println(c);
    }

    public static void main(String[] args) throws Exception{
        newDocument();
    }
}
