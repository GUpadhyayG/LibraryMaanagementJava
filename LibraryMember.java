package com.LibraryManagement;

public class LibraryMember {

     String MemberID;
     String name;
      String ContactInfo;

    public LibraryMember(String memberID, String name, String contactInfo) {
        MemberID = memberID;
        this.name = name;
        ContactInfo = contactInfo;
    }

   public void DisplayMemberInfo(){
        System.out.println(" Member ID is : "+MemberID);
        System.out.println(" Name of the member id is : "+ name);
        System.out.println(" Contact info of "+ name +"is : "+ ContactInfo);

    }
   public void BorrowBook(Book book)
   {
       if(book.CheckAvailability())
       {
           System.out.println(book.title + " is borrowed by " +name);

       }
       else {
           System.out.println("Sorry!! "+ book.title + "  is not available at this time ");
       }

   }
   public void ReturnBook(Book book) {
       System.out.println(book.title +" is returned by "+ name);
       book.UpdateAvailabilityStatus(true);
   }
}
