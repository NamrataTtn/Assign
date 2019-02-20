public class ICICI extends Bank {

    public static void main(String[] args) {
        Bank details = new Bank();
        Bank.Address address = details.new Address("Noida","Uttar Pradesh", "ABCKD Road");
        Bank detailss = new Bank("ICICI LKO", 9.67f, 200, address);

        detailss.getDeatils();
    }


}