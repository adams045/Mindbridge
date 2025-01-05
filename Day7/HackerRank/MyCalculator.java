interface AdvancedArithmetic {
    public int divisor_sum(int n);
}
public class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        System.out.println(myCalculator.divisor_sum(6));
    }
}

