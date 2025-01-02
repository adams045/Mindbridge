import com.sun.jdi.Value;

import javax.swing.plaf.PanelUI;

public class GenericClass<K,V> {
    private K key;
    private V value;

    public GenericClass(K key, V value){
        this.key=key;
        this.value=value;
    }
    public void display(){
        System.out.println(key);
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericClass<String,Integer> genericClass = new GenericClass<>("Adams",21);
        genericClass.display();
    }
}
