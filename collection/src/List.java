import java.util.*;
//Question1

public class List<I extends Number> {

    public static void main(String[] args) {


        LinkedList<Double> list = new LinkedList<Double>();
        list.add(2.1);
        list.add(3.2);
        list.add(4.3);
        list.add(5.4);
        list.add(6.5);
        System.out.println("The list is "+ list);
        double sum=0;
        Iterator<Double> iterator=list.iterator();
        while(iterator.hasNext())
        {
            sum=sum+iterator.next();
        }
        System.out.println("sum is "+ sum);
    }
}
