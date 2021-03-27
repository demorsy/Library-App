package assignment;
// Samet Enes ÖRSDEMİR 150119661
public class Author extends Person { //this is author class. it stores author properties.
    private String publisher;

    public Author(String name, int birthDate, String publisher) throws Exception { //constructor
        super(name, birthDate);
        if(publisher.length() < 3){
            throw new Exception("Minimum character limit is 3!");
        }else{
            this.publisher = publisher;
        }

    }

    // these are getter and setter methods.
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws Exception {
        if(publisher.length() < 3){
            throw new Exception("Minimum character limit is 3!");
        }else{
            this.publisher = publisher;
        }
    }

    @Override
    public String toString() {
        return "Author is " + this.getName();
    }
}
