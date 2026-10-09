package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {

        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = new Major("23");
        major.addStudent(this);
    }

    // Getters
    public String getCne(){return this.cne;}
    public Major getMajor(){return this.major;}
    public String getFullNameFormatted(){
        return String.format(this.getSecondName().toUpperCase(),", ",this.getFirstName());
    }

    // Setters
    public void setCne(String newCne){
        cne = newCne;
    }
    public void setMajor(Major newMajor){
        major = newMajor;
    }



}
//
