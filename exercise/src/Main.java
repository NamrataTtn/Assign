public class Main {

    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        StringClass str=new StringClass();

        System.out.println("Output of Q1");
        System.out.println("");
        str.replaceSubstring("Hi Welcome to To The New ","Hi","Hello");
        System.out.println("");
        System.out.println("");



        System.out.println("Output of Q2");
        System.out.println("");
        str.dublicate("Hi Welcome to To The New");
        System.out.println("");
        System.out.println("");



        System.out.println("Output of Q3");
        System.out.println("");
        str.occurenceOfCharacter("HI Welcome to To The New","e");
        System.out.println("");
        System.out.println("");


        System.out.println("Output of Q4");
        System.out.println("");
        str.characterPercentage("My e-mail : eMail_Address321@gmail.com");
        System.out.println("");
        System.out.println("");



        System.out.println("Output of Q5");
        System.out.println("");
        int[] arr1 = new int[]{ 1,4,5,6,7,8,9,10 };
        int[] arr2 = new int[]{ 43,31,1,2,3,4 };
        str.findCommonElement(arr1,arr2);
        System.out.println("");
        System.out.println("");




        System.out.println("Output of Q6");
        System.out.println("");
        int[] arr = new int[]{ 4,1,2,3,4,2,1 };
        str.findMissing(arr);
        System.out.println("");
        System.out.println("");



        System.out.println("Output of Q8");
        System.out.println("");
        str.reverseStr("namrata singh");
        System.out.println("");
        System.out.println("");




        System.out.println("Output of Q9");
        System.out.println("");
        System.out.println("All House prices:");
        for (House.HouseDetails h : House.HouseDetails.values())
            System.out.println(h + " costs " + h.getPrice() + " lakhs.");
        System.out.println("");
        System.out.println("");



        System.out.println("Output of Q10");
        System.out.println("");
        p.add(22,22);
        p.add(22.2,22.2);
        p.multiply(2,3);
        p.multiply(2,3,4);
        p.concat("Tothe","New");
        p.concat("To","The","New");


    }
}
