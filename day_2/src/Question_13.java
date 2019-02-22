class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}


public class Question_13 {
    public static void main(String args[])
    {
        try
        {
            throw new MyException("This Is A Custom Exception");
        }
        catch (MyException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex);
        }
    }
}
