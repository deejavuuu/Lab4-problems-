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

    public Student findStudentByCNE(String cne){
        for(var i:this.getStudents()){
            if(i.getCne().equals(cne)){
                return i;
            }
        }
        return null;
    }

    public boolean removeStudentByCNE(String cne){
        int index = -1;
        for(int i = 0; i<this.getStudentCount(); i++){
            if(this.getStudents()[i].getCne().equals(cne)){index = i;break;}
        }
        if(index == -1){return false;}
        else{
            if(index < this.getStudentCount()){
                Student[] newArr = new Student[this.getStudentCount()-1];
                System.arraycopy(this.getStudents(),0,newArr,0,index);
                System.arraycopy(this.getStudents(),index+1,newArr,0,this.getStudentCount()-1);
                students = newArr;
                studentCount--;
            }
            else{
                Student[] newArr = new Student[this.getStudentCount()-1];
                System.arraycopy(this.getStudents(),0,newArr,0,index);
                students = newArr;
                studentCount--;
            }
            return true;

        }
    }

    public void getOccupancyRate(){
        String res = this.getName()+" capacity: "+this.getStudents().length+" Students\nCurrent enrollment: "+this.getStudentCount()+"students\nOccupancy rate = "+(this.getStudentCount()/this.getStudents().length)+"%";
        System.out.println(res);
    }

}
