class Arithmetic {
    public int add(int num1,int num2){
        return num1+num2;
    }
}
class Adder extends Arithmetic{
    public int add(int num1,int num2){
        return super.add(num1, num2);
    }
}
public class Solution{
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(10, 8));
    }
}