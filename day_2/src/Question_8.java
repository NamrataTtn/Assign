import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        //Using While loop
//        s = sc.next();
//        while (!s.equals("done")){
//            if (s.charAt(0)==s.charAt(s.length()-1))
//                System.out.println("First Letter Is Equal To last");
//            s = sc.next();
//        }
//      using Do-While loop
        do{
            s = sc.next();

            if (s.charAt(0)==s.charAt(s.length()-1))
                System.out.println("First Letter Is Equal To last");
            else
                System.out.println("First Letter Is Not Equal To last");
        }while (!s.equals("done"));
    }
}
