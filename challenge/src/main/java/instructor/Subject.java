package instructor;

import java.util.Locale;
import student.*;
public class Subject {
    int id;
    String code;
    String title;
    Instructor instructor;

    public Subject(int id, String code,String title, Instructor instructor){
        this.id = id;
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }
    public void normalizeCode(){
        String temp = "";
        for(int i = 0; i<code.length(); i++){
            if(this.code.charAt(i) !=' '){
                temp = temp + code.charAt(i);

            }
        }
        code = temp.toUpperCase();

    }

    public String properTitle(){
        String[] temp = title.split(" ");
        for(int i = 0; i<temp.length;i++){
            temp[i] = Character.toUpperCase(temp[i].charAt(0))+temp[i].substring(1);

        }
        String res = "";
        for(var i:temp){
            res.concat(i);
        }
        return res;

    }

    public boolean isIntroCourse(){
        if(this.code.length()>=6){
            if("INTRO-".equals(this.code.substring(0,6))){
                return true;
            }
        }
        if(title.length()>=5){
            for(int i = 0; i<title.length() - 5; i++ ){
                if(title.substring(i,i+5).equalsIgnoreCase("intro")){
                    return true;
                }
            }
        }
        return false;
    }

    public String syllabusLine(){
        StringBuilder res = new StringBuilder();
        res.append("<").append(this.code).append("> - <").append(this.title).append("> ").append("(Instructor: <").
                append(this.instructor.getSecondName()).append("> <").append(this.instructor.getSecondName()).append(">)");
        return res.toString();

    }



}
