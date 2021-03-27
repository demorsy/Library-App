package assignment;
// Samet Enes ÖRSDEMİR 150119661
public class Person  { //this is person class. it stores person properties.
    private String name;
    private String birthDate;
    private String birthPlace;

    public Person(String name, int birthDate, String birthPlace) { //constructor
        this.name = name;
        this.birthDate = String.valueOf(birthDate);
        this.birthPlace = birthPlace;
    }

    public Person(String name, int birthDate) throws Exception{ //constructor
        if (name.length() < 3){

            throw new Exception("Minimum character limit is 3!");
        }
        if (birthDate < 0){
            throw new Exception("Integer values cannot be negative!");
        }
        else{
            this.name = name;
            this.birthDate = String.valueOf(birthDate);
        }

    }

    public Person(String name) throws Exception{ //constructor
        if(name.length()<3){
            throw new Exception("Minimum character limit is 3!");
        }else{
            this.name = name;
        }

    }

    // these are getter and setter methods.
    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.length() < 3){
            throw new Exception("Minimum character limit is 3!");
        }else{
            this.name = name;
        }

    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) throws Exception {
        if (birthDate < 0){
            throw new Exception("Integer values cannot be negative!");
        }else{
            this.birthDate = String.valueOf(birthDate);
        }


    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) throws Exception {
        if (birthPlace.length() < 3){
            throw new Exception("Minimum character limit is 3!");
        }else{
            this.birthPlace = birthPlace;
        }

    }

    public String toString(){
        if (this.birthPlace.isEmpty()){
            return "Name: " + this.name + ", " + "Birth Date: " + this.birthDate+ ", " + "Birth Place: " + "-";
        }else{
            return "Name: " + this.name + ", " + "Birth Date: " + this.birthDate+ ", " + "Birth Place: " + this.birthPlace;
        }

    }
}
