import java.util.*;
public class overloadingShapes {
    private float radius;
    private float length;
    private float height;
    private float breadth;
    private float width;

    public void rectangle(float length, float width){
        this.length=length;
        this.width =width;
        System.out.println(length*width);
    }


    public void triangle(float breadth, float height){
        this.height=height;
        this.breadth =breadth;
        System.out.println(0.5*length*width);
    }

    public void circle(float radius){
        this.radius=radius;
        System.out.println(3.14*radius*radius);
    }

    public static void main(String[] args) {
        overloadingShapes obj = new overloadingShapes();
        obj.rectangle(20, 10);
        obj.triangle(10, 5);
        obj.circle(9);
    }
}