package day5.shapes;

public class Employee extends  person{

        public Employee(String name,int age, String address , int salary){
            super(name, age, address, salary);
        }
        public void display(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(address);
            //System.out.println(salary);//not accessible;
        }
}
