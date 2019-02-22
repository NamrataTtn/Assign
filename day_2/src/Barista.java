import java.util.LinkedList;
import java.util.Queue;

public class Barista {

    private static Queue<Customer> completed = new LinkedList<>();

    Barista(Queue<Customer> c){
        Customer d = c.remove();
        System.out.println("Order Number "+d.getToken()+" Is Ready !!");
        d.setOrderStatus(true);
        completed.add(d);
    }

    void prepareOrder(Queue<Customer> c){
        Customer d = c.remove();
        System.out.println("Order Number "+d.getToken()+" Is Ready !!");
        d.setOrderStatus(true);
        completed.add(d);
    }


}
