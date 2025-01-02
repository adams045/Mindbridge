public class Enum_methods {
    enum weather{
        WINTER(0),
        SPRING(20),
        SUMMER(36);

        private final int aveTemp;

        weather(int aveTemp){
            this.aveTemp=aveTemp;
        }

        public int getTemperature(){
            return aveTemp;
        }
    }

    public static void main(String[] args) {
        for(weather w: weather.values()){
            System.out.println(w.getTemperature());
        }
    }
}
