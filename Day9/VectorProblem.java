import java.util.Vector;

public class VectorProblem{
    public static void main(String[] args){
        Vector<Integer> vector = new Vector<>();
        vector.add(78);
        vector.add(85);
        vector.add(92);
        vector.add(67);
        vector.add(88);

        int max=0;
        int min  = Integer.MAX_VALUE;
        System.out.println("Added Grades: "+ vector.toString());
        vector.remove(2);
        System.out.println("After Removed: "+ vector.toString());
        for(int i: vector){
            if(i>max){
                max =i;
            }
            if(i<min){
                min = i;
            }
        }
        System.out.println("Highest Grade: "+ max);
        System.out.println("Lowest Grade: "+ min);
    }
}