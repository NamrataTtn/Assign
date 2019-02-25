   import java.text.DateFormat;
        import java.util.*;
   public class Question9  {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is "+ d1.toString());
        Locale locItalian = new Locale("it","ch");
        DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language in Switzerland Format : "+ dff.format(d1));


        DateFormat df;
        int style = DateFormat.MEDIUM;
        df = DateFormat.getDateInstance(style, Locale.UK);
        System.out.println("United Kingdom: " + df.format(d1));
        df = DateFormat.getDateInstance(style, Locale.US);
        System.out.println("USA: " + df.format(d1));
        df = DateFormat.getDateInstance(style, Locale.FRANCE);
        System.out.println("France: " + df.format(d1));
        df = DateFormat.getDateInstance(style, Locale.ITALY);
        System.out.println("Italy: " + df.format(d1));
        df = DateFormat.getDateInstance(style, Locale.JAPAN);
        System.out.println("Japan: " + df.format(d1));
    }
}
