package student;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;

    public Major(String code, String name) {
        this.id = nextId++;
        this.name = name;
        this.code = code;
        students = new Student[50];


    }
    public Major(String code) {
        this.id = nextId++;
        this.name = "Computer Science";
        this.code = code;
        students = new Student[50];

    }


    // Method to add a student
    public void addStudent(Student s) {
        if(studentCount < 50){
            students[studentCount] = s;
            studentCount++;
        }


    }

    // Getters
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public Student[] getStudents(){return this.students;}
    public int getStudentCount(){return this.studentCount;}


    // Display all students in the major
    public void displayStudents() {
        for(int i = 0; i<this.getStudentCount();i++){
            System.out.println(this.getStudents()[i].getId()+". "+this.getStudents()[i].getCne()+" "+this.getStudents()[i].getSecondName()+ " "+this.getStudents()[i].getFirstName());
        }
    }


}
