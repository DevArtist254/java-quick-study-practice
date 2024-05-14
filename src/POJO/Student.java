package POJO;

public class Student {
    private int id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(int id, String name, String dateOfBirth, String classList){
        this.id = id;
        this.name = name;
        this.classList = classList;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString(){
        return "[name :" + name + ", " + "dateOfBirth :" + dateOfBirth + "] " ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
