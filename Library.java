package com.LibraryManagement;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookArrayList;
    ArrayList<LibraryMember> libraryMembers;

    public Library() {
       this.bookArrayList=new ArrayList<>();
       this.libraryMembers=new ArrayList<>();
    }

    public void displayAllBooks() {
        System.out.println("All Books in the library: ");
            for (Book book : bookArrayList) {
                book.DisplayBookDetails();
                System.out.println(" this is your favorite book let's read and explore the world of knowledge");
            }

    }
public void addNewBook(Book book)
{
    book.add(book);
    System.out.println("New book is added in the library: "+ book.title);
}
    public void addNewMember(LibraryMember member) {
      //  boolean add = libraryMembers.add(member);
        System.out.println("New member added to the library: " + member.name);
    }

}


