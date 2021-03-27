package assignment;
// Samet Enes ÖRSDEMİR 150119661
public class Dictionary extends Book { // this is dictionary class. it stores dict. properties.
    private int definitions;

    public Dictionary(int id, String title, Author author, int definitions) throws Exception{ //constructor
        super(id, title, author);

        if(definitions < 0 ){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.definitions = definitions;
        }

    }

    public Dictionary(int id, String title, int definitions) throws Exception { //constructor
        super(id, title);
        if(definitions < 0){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.definitions = definitions;
        }

    }

    //these are getter and setter methods.
    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) throws Exception {
        if(definitions < 0){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.definitions = definitions;
        }

    }

    @Override
    public String toString() {
        return "Dictionary Name is " + this.getTitle() + ", "  + "definitions: " + this.getDefinitions();
    }
}
