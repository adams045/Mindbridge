import java.util.*;
public class employee{
    private int id;
    private String name;
    private int salary;

    employee(int id , String name , int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        employee obj = new employee(73772121,"Adams", 35000);
        obj.show();
    }
}