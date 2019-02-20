public class SBI extends Bank {

    public static void main(String[] args) {
        Bank details = new Bank();
        Bank.Address address = details.new Address("Lucknow","Uttar Pradesh", "Lav Kush Marg");
        Bank detailss = new Bank("SBI LKO", 9.67f, 200, address);

        detailss.getDeatils();
    }

}