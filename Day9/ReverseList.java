import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Added Elements: "+ arrayList.toString());
        Collections.reverse(arrayList);
        System.out.println("Reversed List: "+ arrayList.toString());
    }
}
