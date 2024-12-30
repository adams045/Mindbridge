package Constructor;
import java.util.*;
public class student{
    private String name;
    private int age;

    student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
            student obj = new student("Adams", 20);
            obj.show();
    }
}
