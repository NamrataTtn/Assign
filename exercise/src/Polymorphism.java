public class Polymorphism {


    //QNO 10

    public int add(int n1 ,int n2){
         System.out.println("sum of two Integers :"+(n1+n2));
        return 0;

    }
    public double add(double n1 ,double n2){

        System.out.println("sum of two double :"+(n1+n2));
        return 0;

    }
    public int multiply(int a, int b){
        System.out.println("Product of two Integers :"+(a*b));
        return 0;
    }
    public int multiply(int a, int b,int c){
         System.out.println("Product of three Integers :"+(a*b*c));
        return 0;
    }
    public String concat(String s1,String s2)
    {
        System.out.println("Concatination of two strings is"+s1+" "+s2);
        return (s1+s2);
    }
    public String concat(String s1,String s2,String s3)
    {
        System.out.println("Concatination of three strings is"+s1+" "+s2+" "+s3);
        return (s1+s2+s3);
    }

}
