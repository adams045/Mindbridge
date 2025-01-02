import java.util.Arrays;
import java.util.Scanner;

public class basic_enum_usage {

    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    public void show(Day day){
        switch (day){
            case SUNDAY:
                System.out.println("WEEKEND");
                break;

            case SATURDAY:
                System.out.println("WEEKEND");
                break;

            default:
                System.out.println("WEEKDAYS");
                break;
        }
    }
    public static void main(String[] args) {
        basic_enum_usage b = new basic_enum_usage();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        b.show(Day.SATURDAY );
        b.show(Day.FRIDAY);
        b.show(Day.SUNDAY);
        b.show(Day.MONDAY);
    }
}
