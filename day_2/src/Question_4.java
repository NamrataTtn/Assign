public class Question_4 {

    public String s;
    private static Question_4 single_instance = null;

    private Question_4()
    {
        s = "Hello From Singleton";
    }

    public static Question_4 getInstance(){
        if(single_instance == null)
            single_instance = new Question_4();
        return single_instance;
    }

    public static void main(String[] args) {
        Question_4 a = Question_4.getInstance();
        Question_4 b = Question_4.getInstance();

        System.out.println(a.s);
        a.s = a.s.toUpperCase();
        System.out.println(b.s);
    }
}
