package Constructor;
import java.util.*;
public class book{
    private String title;
    private String author;

    book(){
        title="Atomic Habit";
        author = "James clear";
    }
    public void show(){
        System.out.println(author);
        System.out.println(title);
    }

    public static void main(String[] args) {
        book obj=new book();
        obj.show();
    }
}
