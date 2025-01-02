public class GenericMethod {

    public <T> void show(T[] arr){
        for(T t: arr){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();


        String[] strings = {"Adams","Gogul","Vishnu"};
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {2.0 ,4.6 ,7.9};

        genericMethod.show(strings);
        genericMethod.show(integers);
        genericMethod.show(doubles);

    }

}
