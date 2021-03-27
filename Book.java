package assignment;
// Samet Enes ÖRSDEMİR 150119661
public class Book { //this is book class. it stores book properties.
    private int id;
    private String title;
    private Author author;
    private boolean borrowed;


    public Book(int id, String title, Author author) throws Exception { //constructor
        if (title.length() < 3) {
            throw new Exception("Minimum character limit is 3 !!!");
        }if(id < 0){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.id = id;
            this.title = title;
            this.author = author;
        }

    }

    public Book(int id, String title) throws Exception { //constructor
        if (title.length() < 3) {
            throw new Exception("Minimum character limit is 3 !!!");
        }if(id < 0){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.id = id;
            this.title = title;

        }

    }



    public boolean borrowed(){ //it returns borrowed status.
        if(this.isBorrowed()){
            return false;
        }else{
            return true;
        }

    }

    public boolean returned(){ //it returns returned status.
        if(!borrowed){
            return false;
        }else{
            return true;
        }
    }

    public String toString(){
        return "Book name is " + this.title + ", "  + this.author;

    }


    //these are getter and setter methods.

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception{
        if (id < 0){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.id = id;
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if(title.length()<3){
            throw new Exception("Minimum character limit is 3 !!");
        }else{
            this.title = title;
        }

    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

}
