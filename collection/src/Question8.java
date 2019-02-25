import java.text.*;
import java.util.*;
public class Question8
{
    public static void main(String[] args)
    {
        SimpleDateFormat geek = new SimpleDateFormat("dd / MMMM / yy");

        // Creating instance of the System date
        Calendar c = Calendar.getInstance();
        System.out.println("Present Date : " + c.getTime());

        // Formating Date according "dd / MM / yy"
        String formattedDate = geek.format(c.getTime());
        System.out.println("Date formatted : "+formattedDate);

    }
}
