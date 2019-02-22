public abstract class Person
{
    protected int id;
    protected String password;
    protected String name;
    protected String address;
    protected int phoneNo;

    static int currentIdNumber = 0;

    Person(){}

    public Person(int dd, String n, String a, int p)
    {

    }

    // Printing Info of a Person
    public void printInfo()
    {
    }

    public void setAddress(String a)
    {
    }

    public void setPhone(int p)
    {
    }

    public void setName(String n)
    {
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhoneNumber()
    {
        return phoneNo;
    }
    public int getID()
    {
        return id;
    }

    public static void setIDCount(int n)
    {
        currentIdNumber=n;
    }

}