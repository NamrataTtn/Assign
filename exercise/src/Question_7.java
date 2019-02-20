public class Question_7 {


    static String fname = "Adish";
    static String lname = "Jain";
    static int age = 23;
    static {
        System.out.println("In Static Block !!");
        System.out.println("FirstName : "+fname+"\nLastName : "+lname+"\nAge : "+age);
        System.out.println();
    }

    static void Detail()
    {
        System.out.println("In Static Method !!");
        System.out.println("FirstName : "+fname+"\nLastName : "+lname+"\nAge : "+age);
        System.out.println();

    }
    public static void main(String[] args) {
        System.out.println("In Main Using Static Variables !!");
        System.out.println("FirstName : "+fname+"\nLastName : "+lname+"\nAge : "+age);
        System.out.println();
        Detail();

    }
}