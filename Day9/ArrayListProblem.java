import java.util.ArrayList;
public class ArrayListProblem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");
        list.add("Butter");

        System.out.println("Added Elements: "+ list.toString());

        list.remove(1);

        System.out.println("After Removed: "+ list.toString());
    }
}
