package instructor;
import student.*;
public class Instructor extends Person {
    String employeeNumber;
    public Instructor(String nom, String prenom, String telephone, String email, String employeeNumber){

        super(nom, prenom, telephone,email);
        this.employeeNumber = employeeNumber;
    }

    public void trimWhiteSpace(){
        String temp = "";
        for(int i = 0; i<employeeNumber.length(); i++){
            if(this.employeeNumber.charAt(i) !=' '){
                temp = temp + employeeNumber.charAt(i);

            }
        }
        employeeNumber = temp;

    }



    public String summaryLine(){
        return String.format("Instructor[employeeNumber = %s, LastName = %s, FirstName = %s",this.employeeNumber,this.getSecondName(),this.getFirstName());
    }
    public String toCard(){
        StringBuilder card = new StringBuilder();
        card.append("Instructor\n");
        card.append("------------\n");
        card.append("Employee#:<"+this.employeeNumber+">\n");
        card.append("Name:<"+this.getSecondName()+">,<"+this.getSecondName()+">\n");
        card.append("Email:<").append(this.getEmail()).append(">\n");
        card.append("Phone: <").append(this.getPhone()).append(">\n");
        return card.toString();
    }

    public String displayName(){

        if(this.getFirstName().isEmpty()){
            if(this.getSecondName().isEmpty()){
                return "";
            }
            return this.getSecondName();
        }
        if(this.getSecondName().isEmpty()){
            if(this.getFirstName().isEmpty()){
                return "";
            }
            return this.getFirstName();
        }
        return this.getFirstName()+" "+this.getSecondName();
    }

}
