package assignment;
// Samet Enes ÖRSDEMİR 150119661
public class Customer extends Person { // this is customer class. it stores customer properties.
    private String address;
    private Book borrowedBook;
    private boolean borrowABook = false;

    public Customer(String name, int birthDate, String birthPlace, String address) throws Exception { //constructor
        super(name, birthDate, birthPlace);
        if(address.length() < 3){
            throw new Exception("Minimum character limit is 3 !!!");
        }else{
            this.address = address;
        }

    }

    public Customer(String name, int birthDate, String address) throws Exception { //constructor
        super(name, birthDate);

        if(address.length() < 3){
            throw new Exception("Minimum character limit is 3 !!!");
        }else{
            this.address = address;
        }
    }

    public Customer(String name, String address) throws Exception { //constructor
        super(name);
        if(address.length() < 3){
            throw new Exception("Minimum character limit is 3 !!!");
        }else{
            this.address = address;
        }
    }

    public Customer(String name, int birthDate) throws Exception {
        super(name, birthDate);
    }


    // these are getter and setter methods.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws Exception {
        if(address.length() < 3){
            throw new Exception("Minimum character limit is 3 !!!");
        }else{
            this.address = address;
        }

    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public boolean isBorrowABook() {
        return borrowABook;
    }

    public void setBorrowABook(boolean borrowABook) {
        this.borrowABook = borrowABook;
    }

    @Override
    public String toString() {

        if(this.getAddress()==null && this.getBirthPlace() == null && this.getBirthDate()==null){
            return "Name: " + this.getName() + ", " + "Birth Date: " + "-" + ", " + "Birth Place: " + "-" + "\nAddress: " + "-";
        }
        else if (this.getAddress()==null && this.getBirthPlace() == null){
            return "Name: " + this.getName() + ", " + "Birth Date: " + this.getBirthDate() + ", " + "Birth Place: " + "-" + "\nAddress: " + "-";
        }
        else if(this.getBirthDate()==null && this.getBirthPlace() == null){
            return "Name: " + this.getName() + ", " + "Birth Date: " + "-" + ", " + "Birth Place: " + "-" + "\nAddress: " + this.getAddress();
        }
        else if(this.getAddress() == null)
        return "Name: " + this.getName() + ", " + "Birth Date: " + this.getBirthDate() + ", " + "Birth Place: " + this.getBirthPlace() + "\nAddress: " + "-";
        else if(this.getBirthPlace()==null){
            return "Name: " + this.getName() + ", " + "Birth Date: " + this.getBirthDate() + ", " + "Birth Place: " + "-" + "\nAddress: " + this.getAddress();
        }else if(this.getBirthDate()==null){
            return "Name: " + this.getName() + ", " + "Birth Date: " + "-" + ", " + "Birth Place: " + this.getBirthPlace() + "\nAddress: " + this.getAddress();
        }
        else{
            return "Name: " + this.getName() + ", " + "Birth Date: " + this.getBirthDate() + ", " + "Birth Place: " + this.getBirthPlace() + "\nAddress: " + this.getAddress();
        }
    }
}
