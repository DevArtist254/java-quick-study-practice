import java.util.Random;

enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;

    public double getPrice() {

        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.1;
        };
    }
}
enum DayOfTheWeek {
    SUN, MON, TUES, WED, THURS, FRI, SAT
}

public class stuEnum {

    public static void main(String[] args) {
        var weekDay = DayOfTheWeek.SAT;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if(weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a friday");
//            }

            switchDayOfWeek(weekDay);
        }

        for (Topping t : Topping.values()) {
            System.out.println(t.name() + " : " + t.getPrice() * 500);
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInt = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDay);
            case SAT -> System.out.println("Saturday is Day "+ weekDayInt);
            default -> System.out.println(
                    weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInt
            );
        }
    }
    public static DayOfTheWeek getRandomDay() {
        var ranInt = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[ranInt];
    }
}
