import java.util.*;
public class car{
        Scanner sc=new Scanner(System.in);
        private String brand;
        private String model;
        double  price;
    
        public car(String brand, String model,int price){
            this.brand=brand;
            this.model=model;
            this.price=price;
        }
        public void display(){
            System.out.println(brand);
            System.out.println(model);
            System.out.println(price);
        }
        public void discount(){
            double discount;
            discount= price -(price*(0.05));
            System.out.println(discount);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand=sc.nextLine();
        String model = sc.nextLine();
        int price = sc.nextInt();
        car obj = new car(brand,model,price);
        obj.display();
        obj.discount();
    }
}