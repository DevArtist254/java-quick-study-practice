package GeneExtra;

import GeneExtra.Model.LPAStudent;
import GeneExtra.Model.Student;
import GeneExtra.utils.QueryList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int studentCount = 10;
        List<Student> students = new ArrayList<>();
        for(int i = 0;i < studentCount; i++){
            students.add(new Student());
        }

        students.add(new LPAStudent());
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++){
            lpaStudents.add(new LPAStudent());
        }

        printMoreLists(lpaStudents);

        testList(new ArrayList<>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<>(List.of(1, 2, 3)));

        var students2021 = QueryList.getMatches(students, "YearStarted", "2021");

        printMoreLists(students2021);
    }

    private static void printMoreLists(List<? extends Student> students){

        for (var s : students){
            System.out.println(s);
        }
        System.out.println();
    }

    private static void testList(List<?> list) {

        for (var el : list){
            if(el instanceof String s) {
                System.out.println("String: " + s.toUpperCase());
            } else if (el instanceof Integer i) {
                System.out.println("Integer: " + i.floatValue());
            }
        }
    }

//    private static void printList(List students){
//
//        for (var s : students){
//            System.out.println(s);
//        }
//
//        System.out.println();
//    }
}
