package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //removeElements(placesToVisit);
        //System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary(placesToVisit);
        printItinerary2(placesToVisit);
        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack methods
        list.push("Alice springs");
    }

    private static void removeElements(LinkedList<String> list) {

        //Deletion
        list.remove(4);
        list.remove("Brisbane");

        String s1 = list.remove();
        System.out.println(s1 + "was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + "was removed");

        String s3 = list.remove();
        System.out.println(s3 + "was removed");

        //Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + "was removed");
        String p2 = list.pollFirst();
        System.out.println(p2 + "was removed");
        String p3 = list.pollLast();
        System.out.println(p3 + "was removed");
    }

    private static void gettingElements(LinkedList<String> list) {

        //Retrieval by index
        System.out.println("Retrieved Element = " + list.get(4));

        //First and last Retrieval
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        //Data retrieval by index
        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue retrieval
        System.out.println("Element from element() = " + list.element());

        //Stack retrieval
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

    }

    private static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());

        for (int i = 1;i < list.size(); i++) {
            System.out.println("--> from: " + list.get(i - 1) + " to " + list.get(i));
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list) {

        System.out.println("-".repeat(30));

        System.out.println("Trip starts at " + list.getFirst());
        String prevTown = list.getFirst();

        for (String town : list) {
            System.out.println("--> From: " + prevTown + " to " + town);
            prevTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list){

        System.out.println("-".repeat(30));

        System.out.println("Trip starts at " + list.getFirst());
        String prevTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + prevTown + " to " + town);
            prevTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){

        var iterator = list.listIterator();

        while (iterator.hasNext()){

            if (iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var i2 = list.listIterator(3);
        System.out.println(i2.previous());
    }
}
