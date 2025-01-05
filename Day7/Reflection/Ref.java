import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
public class Ref {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Load");
            Method[] method = cls.getDeclaredMethods();
            Field[] field = cls.getDeclaredFields();
            Constructor[] constructor = cls.getDeclaredConstructors();
            for(int i=0;i< method.length;i++){
                System.out.print(method[i]+" ");
            }
            System.out.println();
            for(int i=0;i< field.length;i++){
                System.out.print(field[i]+" ");
            }
            System.out.println();
            for(int i=0;i< constructor.length;i++){
                System.out.print(constructor[i]+" ");
            }
        }
        catch (Exception e){

        }
    }
}
