package problem6;

public interface Forme {
    public String getSurface();

}

class Square implements Forme{
    double cote;
    public Square(double cote){
        this.cote = cote;
    }

    public String getSurface(){
        float side = (float) cote;
        String s = String.format("Square (side %.2f cm): area = %.2f",side, side*side);
        return s;
    }


}

class Circle implements Forme{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    public String getSurface(){
        float r  =(float) radius;
        String s = String.format("Square (side %.2f cm): area = %.2f",r, r*r);
        return s;
    }
}
