package UNIT01;

public class Shape {
    public void draw(double x,double y){
        double area = x*y;
        System.out.println("Rectacngle Area is : "+area);
    }
    public void draw(double x){
        double area = 3.14*x*x;
        System.out.println("Circle Area is : "+area);
    }
}
