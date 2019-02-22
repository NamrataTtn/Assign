import java.util.Scanner;

public class Place_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order Details(Name,CoffeeQuantity)");
        String s = sc.nextLine();
        int q = sc.nextInt();
//        Barista b = new Barista()
        createOrder(s,q);
    }

    static void createOrder(String name, int quantity)
    {
        Customer c = new Customer(name,false,(float)(100*quantity),0,quantity);
        Cashier cs = new Cashier(c);
        System.out.println("Your Order is placed.. Please Wait While it is being prepared !");
        for (long i = 0; i < 100000000l; i++);
        Barista b = new Barista(Cashier.getOrder());

    }
}
