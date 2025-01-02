import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class Hypotenuse {
    private int length1;
    private int length2;

    Hypotenuse(int length1, int length2){
        this.length1=length1;
        this.length2=length2;
    }

    public float square(){
        return (float)(pow(length1,2)+ pow(length2,2));
    }
    public float root(){
        return (float)(sqrt(square()));
    }

    public static void main(String[] args) {
        Hypotenuse hypotenuse = new Hypotenuse(8,6);
        System.out.println(hypotenuse.root());
    }
}
