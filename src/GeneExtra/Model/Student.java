package GeneExtra.Model;

import GeneExtra.utils.QueryItem;

import java.util.Random;

public class Student implements QueryItem {

    private String name;
    private String course;
    private int yearStarted;

    protected static Random ran = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
    private static String[] courses = {"C++", "Java", "Python"};

    public Student() {
        int lastNameIndex = ran.nextInt(65, 91);
        name = firstNames[ran.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[ran.nextInt(3)];
        yearStarted = ran.nextInt(2018, 2023);
    }

    public String toString() { return "%-15s %-15s %d".formatted(name, course, yearStarted);}

    public int getYearStarted() {return yearStarted;}

    @Override
    public boolean matchFieldValue(String fieldName, String value) {

        String fname = fieldName.toUpperCase();

        return switch (fname) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }
}
