import java.util.ArrayList;

public class Library {

    private String name;                                // name of library
    private Librarian librarian;                        // object of Librarian (only one)
    private ArrayList<Person> persons;                 // all clerks and borrowers
    private ArrayList<Book> booksInLibrary;            // all books in library are here!
    public int book_return_deadline;                   //return deadline after which fine will be generated each day
    public double per_day_fine;

    private static Library obj;

    private Library(){}

    public static Library getInstance()
    {
        return obj;
    }

    public void setReturnDeadline(int deadline)
    {
        book_return_deadline = deadline;
    }

    public void setFine(double perDayFine)
    {
        per_day_fine = perDayFine;
    }

    public ArrayList<Person> getPersons()
    {
        return persons;
    }

    public Librarian getLibrarian()
    {
        return librarian;
    }

    public String getLibraryName()
    {
        return name;
    }

    public ArrayList<Book> getBooks()
    {
        return booksInLibrary;
    }

    /*-----Adding all People in Library----*/
    public boolean addLibrarian(Librarian lib){return true;}

    public void addBorrower(Borrower b)
    {
        persons.add(b);
    }

    public Borrower findBorrower(){return null;}

    public void addBookinLibrary(Book b)
    {
        booksInLibrary.add(b);
    }

    public void removeBookfromLibrary(Book b){}


    public ArrayList<Book> searchForBooks() {return null;}

    public void viewAllBooks(){}


}
