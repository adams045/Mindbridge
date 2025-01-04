public class langObjects{
    public static void main(String[] args) {

        name obj = new name("Adams");
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
    }
}
class name{
    private String value;
    
    public name(String value){
        this.value=value;
    }
    @Override
    public String toString() {   
        return value;
    }
}
