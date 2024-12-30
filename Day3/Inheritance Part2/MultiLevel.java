package com.java.day3;

class rectangle extends MultiLevel{
    public int length;
    public int breadth;

    rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void area(){
        System.out.println(length*breadth);
    }
}
class square extends  rectangle{

    int side;

    square(int side){
        super(side,side);
    }
}

public class MultiLevel {
    public void area(){
        System.out.println("Area has been called");
    }
    public static void main(String[] args){
        MultiLevel obj=new rectangle(3,4);
        MultiLevel obj2=new square(5);

        obj.area();
        obj2.area();

    }
}
