public class varargs {
    int sum=0;
    public int add(int... number){
        for(int i:number){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        varargs v = new varargs();
        System.out.println(v.add(3,4,5));
        System.out.println(v.add(1,2,3));
        System.out.println(v.add(4,5,6,7,8));
    }
}
