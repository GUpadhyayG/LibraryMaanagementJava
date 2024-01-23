package com.LibraryManagement;

import java.lang.reflect.Member;

public class Main {
    public static void main(String[] args) {
        // Book info
        Book book1=new Book("1234RTUI","The first Code ","Sudhransh","1st",true);
        Book book2=new Book("8956RTUI","The OOps Code ","Mr Coder","2st",true);

       // LibraryMember  Info
        LibraryMember member1=new LibraryMember("1234IIT","Rahul","8932920016");
        LibraryMember member2=new LibraryMember("1234IID","Vikash","7310270526");

        //Library Info
        Library library=new Library();
        // adding member info in library
       library.addNewMember(member1);
       library.addNewMember(member2);
        // adding bookinfo in library
        library.addNewBook(book1);
        library.addNewBook(book2);

        // Display member info in library

        library.displayAllBooks();
        member1.DisplayMemberInfo();

        // Borrow the book
        member1.BorrowBook(book1);
        member2.BorrowBook(book2);

        // Update the Availability
        book1.CheckAvailability();
        // Book return
        member1.ReturnBook(book1);
        member2.ReturnBook(book2);

    }
}
