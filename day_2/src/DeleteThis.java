import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DeleteThis {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("Adish");
        al.add("Nitish");
        al.add("Ashish");
        System.out.println(al);

//        Iterator itr = al.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//            al.add("Error");
//        }

        ListIterator li = al.listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());
        }

    }
}
