package ArrayL;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

record Place(String name, int distance){

    @Override
    public String toString(){
        return String.format("%s (%d)", name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> places = new LinkedList<>();

        addPlace(places, new Place("Sydney", 0));
        addPlace(places, new Place("Brisbane", 1374));
        addPlace(places, new Place("Perth", 917));
        addPlace(places, new Place("Alice Springs", 3921));
        addPlace(places, new Place("Darwin", 2771));
        addPlace(places, new Place("Melbourne", 3972));

        System.out.println(places);

        var iterator = places.listIterator();
        Scanner sc = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

//        while (!quitLoop){
//            if(!iterator.hasPrevious()){
//                System.out.println("Originating: " + iterator.next());
//                forward = true;
//            }
//
//            if(!iterator.hasNext()){
//                System.out.println("Final: " + iterator.previous());
//                forward = false;
//            }
//
//            System.out.println("Enter Value: ");
//            String menuItem = sc.nextLine();
//
//            switch (menuItem) {
//                case "F":
//                    System.out.println("User wants to go forward");
//                    if(!forward) {
//                        forward = true;
//                        if(iterator.hasNext()){
//                            iterator.next();
//                        }
//                    }
//
//                    if (iterator.hasNext()){
//                        System.out.println(iterator.next());
//                    }
//
//                    break;
//                case "B":
//                    System.out.println("User wants to go backwards");
//                    if(forward) {
//                        forward = false;
//                        if(iterator.hasPrevious()){
//                            iterator.previous();
//                        }
//                    }
//
//                    if (iterator.hasPrevious()) {
//                        System.out.println(iterator.previous());
//                    }
//
//                    break;
//
//                case "M":
//                    printMenu();
//                    break;
//
//                case "L":
//                    System.out.println(places);
//                    break;
//
//                default:
//                    quitLoop = true;
//                    break;
//            }
    //    }

        var weekDay = DaysOfTheWeek.TUES;

        System.out.println(weekDay);

        for (int i = 0;i < 10; i++) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

        }

    }

    public static DaysOfTheWeek getRandomDay() {

        int randomInt = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();

        return allDays[randomInt];
    }

    private static void addPlace(LinkedList<Place> placesList, Place inputPlace){

        if(placesList.contains(inputPlace)) {
            System.out.println("Found duplicate: " + inputPlace);
            return;
        }

        for(Place place : placesList){
            if(place.name().equalsIgnoreCase(inputPlace.name())){
                System.out.println("Found duplicate: " + inputPlace);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listedPlace : placesList){
            if (inputPlace.distance() < listedPlace.distance()){
                placesList.add(matchedIndex, inputPlace);
                return;
            }

            matchedIndex++;
        }

        placesList.add(inputPlace);
    }

    private static void printMenu(){

        System.out.println("""
                Available actions (Select word or letter);
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }
}
