package assignment;
// Samet Enes ÖRSDEMİR 150119661
import java.util.ArrayList;
// This is Library class. It can store library properties, customers data and books data.

public class Library {
    private String address;
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Library(String address) throws Exception {  //constructor for library object
        if(address.length() < 3){
            throw new Exception("Minimum character limit is 3 !!!");
        }else{
            this.address = address;
        }

    }

    public static void  printOpeningHours(){ //prints library opening hours
        System.out.println("Library hours:");
        System.out.println("Libraries are open daily from 9 am to 5 pm.");
        System.out.println();
    }

    public void printAddress(){ //prints library adress

        System.out.println(this.getAddress());
        System.out.println();

    }

    public boolean addBook(Book book){ //it provides creating book object in books array.
       return books.add(book);

    }

    public void addCustomer(Customer customer){ //it provides creating customer object in customers array.
        customers.add(customer);
    }

    public void borrowBook (String bookName, String personName){ //user can borrow a book from library with using this method.
        int key_for_book = -1 ; //temporary index
        int key_for_customer = 0 ; //temporary index

        ArrayList<String> bookTitles= new ArrayList<String>(); //temporary book title array.
        ArrayList<String> customerNames= new ArrayList<String>(); //temporary customer name array.
        for (int i=0; i< books.size(); i++){ //adding items into temporary lists.
            bookTitles.add(books.get(i).getTitle());
            if ((books.get(i).getTitle()).equals(bookName) && !books.get(i).isBorrowed()){

                key_for_book = i; //store the index of book
            }
        }
        for (int i=0; i< customers.size(); i++){
            customerNames.add(customers.get(i).getName());
            if(customers.get(i).getName().equals(personName)){
                key_for_customer = i; //store the index of customer
            }
        }

        try { // i used try and catch because of avoiding errors that stems from indexes.
            if (bookTitles.contains(bookName) && !books.get(key_for_book).isBorrowed() && !customers.get(key_for_customer).isBorrowABook() && customerNames.contains(personName)) {
                //book name check, is it borrowed or not, did customer borrow any book or not, customer name check

                System.out.println(personName + " successfully borrowed " + bookName + ".");

                books.get(key_for_book).setBorrowed(true); //setting borrowed for book
                customers.get(key_for_customer).setBorrowABook(true); //setting customer's borrowing status
                customers.get(key_for_customer).setBorrowedBook(books.get(key_for_book)); // adding book to customer's data.


            } else if (!customerNames.contains(personName)) {
                System.out.println("Sorry, " + personName + " is not a customer");
            } else if (!bookTitles.contains(bookName)) {
                System.out.println("Sorry, this book is not in our catalog");
            } else if (customers.get(key_for_customer).isBorrowABook()) {
                System.out.println("Sorry, " + personName + " already borrowed a book");
            } else if (books.get(key_for_book).isBorrowed()) {
                System.out.println("Sorry, this book is already borrowed");
            } else {
                System.out.println("error");
            }
        }catch (Exception e){ //if program cannot anything in lists with index, it shows this message.
            System.out.println("Sorry, this book is already borrowed");
        }






    }

    public  void returnBook(String personName){ // //user can return a book to library with using this method.
        // this method is the opposite of the borrowBook() method. All actions are same.

        int key_for_customer = 0 ;


        ArrayList<String> customerNames= new ArrayList<String>();


        for (int i=0; i< customers.size(); i++){
            customerNames.add(customers.get(i).getName());
            if(customers.get(i).getName().equals(personName)){
                key_for_customer = i;
            }
        }

        if (customers.get(key_for_customer).isBorrowABook() && customerNames.contains(personName)){

            customers.get(key_for_customer).getBorrowedBook().setBorrowed(false);
            customers.get(key_for_customer).setBorrowABook(false);
            System.out.println(personName + " successfully returned " + customers.get(key_for_customer).getBorrowedBook().getTitle());

        }
        else if(!customerNames.contains(personName)){
            System.out.println("Sorry, " + personName + " is not a customer.");

        }
        else if (!customers.get(key_for_customer).isBorrowABook()){
            System.out.println("Sorry, " + personName + " did not borrow a book");

        }




    }

    public void printAvailableBooks(){ //prints available books
        int control = 0;
        for (int i = 0; i < books.size() ; i++){
            if(!books.get(i).isBorrowed()){
                System.out.println(books.get(i).toString());
                control = 1;
            }
        }
        if(control == 0){
            System.out.println("No book in catalog.");
        }
    }


    // these are getter and setter methods.
    public ArrayList<Book> getBooks(){
       return new ArrayList<Book> (books);
    }

    public ArrayList<Customer> getCustomers(){
        return new ArrayList<Customer>(customers);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Exception{
        if(address.length() < 3){
            throw new Exception("Minimum character limit is 3 !!");
        }else{
            this.address = address;
        }

    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Library{" +
                "address='" + address + '\'' +
                ", books=" + books +
                ", customers=" + customers +
                '}';
    }
}
