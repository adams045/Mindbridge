package day5.shapes;

public class rectangle {
    public int length;
    public int breadth;

    public rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public void area() {
        System.out.print(0.5 * length * breadth);
    }
}
