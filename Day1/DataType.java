package Day1;

public class DataType {

    public static void main(String[] args) {
        byte b = 100;         
        short s = 3000;       
        int i = 50000;       
        long l = 100000L;     
        float f = 5.75f;      
        double d = 19.99;     
        char c = 'A';         
        boolean bool = true;  
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        int convertedInt = (int) d; 
        System.out.println("Converted double to int: " + convertedInt);
    }
}