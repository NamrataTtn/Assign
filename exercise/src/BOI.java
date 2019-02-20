public class BOI extends Bank {

    public static void main(String[] args) {
        Bank details = new Bank();
        Bank.Address address = details.new Address("Kanpur","Uttar Pradesh", "XYZ Lane");
        Bank detailss = new Bank("BOI LKO", 9.67f, 200, address);

        detailss.getDeatils();
    }

}
