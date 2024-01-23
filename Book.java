package com.LibraryManagement;

public class Book {

    String ISBN;
    String title;
    String Author;
    String Generation;
    boolean AvailabilityStatus;

    public Book(String ISBN, String title, String author, String generation, boolean availabilityStatus) {
        this.ISBN = ISBN;
        this.title = title;
        Author = author;
        Generation = generation;
        AvailabilityStatus = availabilityStatus;
    }
    public  void DisplayBookDetails()
    {
        System.out.println(" the ISBN is :"+ISBN);
        System.out.println(" Title of the book is : "+ title);
        System.out.println(" Author of this book is :"+ Author);
        System.out.println(" Generation of the book is : "+ Generation);
        System.out.println(" Availability of book is :"+ AvailabilityStatus);
    }
    public boolean CheckAvailability()
    {
        return AvailabilityStatus;

    }
    public void UpdateAvailabilityStatus(boolean status)
    {
        AvailabilityStatus=status;

    }

    public void add(Book book) {
        System.out.println(" This will show the newly added books details " +book.title);

    }
}
