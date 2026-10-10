package problem6;

public interface Person {
    public void display();
}

class Carpenter implements Person{
    String name;
    public Carpenter(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("I am "+this.name+" the Carpenter");
    }
}
class Plumber implements Person{
    String name;
    public Plumber(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("I am "+this.name+" the Plumber");
    }
}