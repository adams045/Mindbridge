import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(5);
        int max = 0;
        for(int i: arrayList){
            if(i>max){
                max=i;
            }
        }
        System.out.println("Maximum element: "+ max);
    }
}
