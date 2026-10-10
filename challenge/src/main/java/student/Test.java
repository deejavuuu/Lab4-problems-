package student;

public class Test {
    public static void main(String[] args) {
    Major m1 = new Major("124","Calculus");
    Major m2 = new Major("23");
    Student s1 = new Student("SAFI","Amal","22885676","amal@gmail.com","qq85741",m2);
    Student s2 = new Student("SAFOUR","Jamel","22885963","JAMEL@gmail.com","PP95712",m2);


    // Display computer science students
   m2.displayStudents();
   System.out.println(m2.findStudentByCNE("PP95712")+"\n");
   System.out.println("Student Count: "+m2.getStudentCount()+"\n");
   System.out.println(m2.getStudentListAsString()+"\n");
   m2.getOccupancyRate();
   System.out.println("\n");

    }
}

