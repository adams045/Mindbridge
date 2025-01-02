package day5Main;
import day5.shapes.*;
public class test {
    public static void main(String[] args) {
        person p = new person("Adams",19,"Erode",18000);
        Employee e = new Employee("Adams",19,"Erode",18000);
        e.display();
        System.out.println(p.name);
        //System.out.println(p.age);//not accessible;
        //System.out.println(p.address);//not accessible;
        //System.out.println(p.salary);//not accessible;
    }
}
