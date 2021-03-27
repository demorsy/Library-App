package assignment;

import java.util.ArrayList;


// Purpose of the program is that customers can borrow or return their books that belongs library on system. There are 7 classes.
// In addition, user can create an object about books, libraries, customers and authors. Then, users can do their operations with using these datas.

// Samet Enes ÖRSDEMİR 150119661


public class Test {
    public static void main(String[] args) throws Exception { //my main method

        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("221B Baker St.");

        // create four authors
        Author author1 = new Author("Dan Brown",1964,"Doubleday");
        Author author2 = new Author("Antoine de Saint-Exupery", 1900,"Gallimard");
        Author author3 = new Author("Charles Dickens",  1812,"Chapman & Hall");
        Author author4 = new Author("J. R. R. Tolkien",  1892,"George Allen & Unwin");

        // Add five books and a dictionary to the first library
        firstLibrary.addBook(new Book(1, "The Da Vinci Code", author1));
        firstLibrary.addBook(new Book(2, "Le Petit Prince", author2));
        firstLibrary.addBook(new Book(3, "A Tale of Two Cities", author3));
        firstLibrary.addBook(new Book(4, "The Lord of the Rings", author4));
        firstLibrary.addBook(new Book(5, "The Lord of the Rings", author4));
        firstLibrary.addBook(new Dictionary(6, "Oxford Dictionary of English", 6000));



        // Add three customers to the first library
        firstLibrary.addCustomer(new Customer("Ayse Caliskan",  1995,"Istanbul", "10 Green Brier Blv."));
        firstLibrary.addCustomer(new Customer("Mehmet Ari", "10 Liberty St."));
        firstLibrary.addCustomer(new Customer("Ela Kara", 1980, "17 Main St."));

        // Add a customer to the second library
        secondLibrary.addCustomer(new Customer("Ismail Celik",  1986,"Antalya", "18 Green Brier Blv."));


        // Add a customer to libraries
        Customer customer = new Customer("Selin Ergul", 1987);
        firstLibrary.addCustomer(customer);
        secondLibrary.addCustomer(customer);



        // Print opening hours and the addresses

        Library.printOpeningHours();


        System.out.println("First library address:");
        firstLibrary.printAddress();


        // print all books in the first library
        System.out.println("Books in the first library:");
        ArrayList<Book> list = firstLibrary.getBooks();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.get(i).toString());
        } else {
            System.out.println("No book in catalog");
        }
        System.out.println();

        // print all customers in the first library
        System.out.println("Customers in the first library:");
        ArrayList<Customer> listCust = firstLibrary.getCustomers();
        if (!listCust.isEmpty()) {
            for (int i = 0; i < listCust.size(); i++)
                System.out.println(listCust.get(i).toString());
        } else {
            System.out.println("No customer in the library");
        }
        System.out.println();

        System.out.println("Second Library address:");
        secondLibrary.printAddress();


        // print all books in the second library
        System.out.println("Books in the second library:");
        ArrayList<Book> list2 = secondLibrary.getBooks();
        if (!list2.isEmpty()) {
            for (int i = 0; i < list2.size(); i++)
                System.out.println(list2.get(i).toString());
        } else {
            System.out.println("No book in catalog");
        }
        System.out.println();

        // print all customers in the second library
        System.out.println("Customers in the second library:");
        ArrayList<Customer> listCust2 = secondLibrary.getCustomers();
        if (!listCust2.isEmpty()) {
            for (int i = 0; i < listCust2.size(); i++)
                System.out.println(listCust2.get(i).toString());
        } else {
            System.out.println("No customer in the library");
        }
        System.out.println();




        System.out.println("Borrowing The Lord of the Rings by Ayse Caliskan from the first library:");
        firstLibrary.borrowBook("The Lord of the Rings", "Ayse Caliskan");
        System.out.println();

        System.out.println("Borrowing The Lord of the Rings by Mehmet Ari from the first library:");
        firstLibrary.borrowBook("The Lord of the Rings", "Mehmet Ari");
        System.out.println();

        System.out.println("Borrowing The Lord of the Rings by Ela Kara from the first library:");
        firstLibrary.borrowBook("The Lord of the Rings", "Ela Kara");
        System.out.println();

        System.out.println("Borrowing Le Petit Prince by Ayse Caliskan from the first library");
        firstLibrary.borrowBook("Le Petit Prince", "Ayse Caliskan");
        System.out.println();

        System.out.println("Borrowing A Tale of Two Cities by Emre Kiraz from the first library:");
        firstLibrary.borrowBook("A Tale of Two Cities", "Emre Kiraz");
        System.out.println();

        System.out.println("Borrowing Angels and Demons by Selin Ergul from the first library:");
        firstLibrary.borrowBook("Angels and Demons", "Selin Ergul");
        System.out.println();

        System.out.println("Borrowing Le Petit Prince by Ismail Celik from the second library:");
        secondLibrary.borrowBook("Le Petit Prince", "Ismail Celik");
        System.out.println();


        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        System.out.println("Returning the book which is borrowed by Ayse Caliskan to the first library:");
        firstLibrary.returnBook("Ayse Caliskan");
        System.out.println();

        System.out.println("Returning the book which is borrowed by Ismail Celik to the second library:");
        secondLibrary.returnBook("Ismail Celik");
        System.out.println();

        System.out.println("Returning the book which is borrowed by Mehmet Ari to the second library:");
        secondLibrary.returnBook("Mehmet Ari");
        System.out.println();

        System.out.println("Borrowing Le Petit Prince by Ayse Caliskan from the first library:");
        firstLibrary.borrowBook("Le Petit Prince", "Ayse Caliskan");
        System.out.println();

        System.out.println("Borrowing Le Petit Prince by Selin Ergul from the second library:");
        secondLibrary.borrowBook("The Lord of the Rings", "Selin Ergul");
        System.out.println();

        System.out.println("Borrowing The Lord of the Rings by Selin Ergul from the first library:");
        firstLibrary.borrowBook("The Lord of the Rings", "Selin Ergul");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();


    }
}
