public class Question_5 implements Cloneable {

    int a ;
    String s ;

    Question_5(int a, String s){
        this.a = a;
        this.s = s;
    }

    Question_5(Question_5 copy)
    {
        a = copy.a;
        s = copy.s;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try{
            Question_5 x = new Question_5(5,"Adish");
            Question_5 using_cloneable = (Question_5)x.clone();
            Question_5 using_copy_constructor = new Question_5(x);
        }
        catch (Exception e){

        }
    }
}
