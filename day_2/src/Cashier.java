import java.util.Queue;
import java.util.LinkedList;
public class Cashier {

    private static Queue<Customer> order = new LinkedList<>();
    private static int token = 0;

    public Cashier(Customer c) {
        token++;
        c.setToken(token);
        System.out.println("Your Token Number Is :"+c.getToken());
        order.add(c);
    }

//    void takeOrder(Customer c)
//    {
//        token++;
//        c.setToken(token);
//        System.out.println("Your Token Number Is :"+c.getToken());
//        order.add(c);
//    }

    public static Queue<Customer> getOrder() {
        return order;
    }

    public static void setOrder(Queue<Customer> order) {
        Cashier.order = order;
    }

    public static int getToken() {
        return token;
    }

    public static void setToken(int token) {
        Cashier.token = token;
    }
}
