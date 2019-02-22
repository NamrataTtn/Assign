import java.io.*;
import java.util.*;

public class Borrower extends Person
{
    private ArrayList<Book> borrowedBooks;          //Those books which are currently borrowed by this borrower

    public Borrower(int id,String n, String a, int p)
    {

    }

    @Override
    public void printInfo()
    {
    }

    // Printing Book's Info Borrowed by Borrower
    public void printBorrowedBooks()
    {

    }

    // Updating Borrower's Info
    public void updateBorrowerInfo()
    {
    }

    /*-- Adding and Removing from Borrowed Books---*/
    public void addBorrowedBook(Book b)
    {

    }

    public void removeBorrowedBook(Book b)
    {

    }

    public ArrayList<Book> getBorrowedBooks()
    {
        return borrowedBooks;
    }

}