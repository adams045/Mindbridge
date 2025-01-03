public class measureTime{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0;i<100;i++){
            System.out.println("Hii");
        }
        long end =System.currentTimeMillis();

        System.out.println(end-start+ " milliseconds");
    }    
}