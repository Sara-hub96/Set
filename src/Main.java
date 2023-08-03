/*Sets
        Exercise: Set
        Define a testing class with a main() method where you:
        create an HashSet with all the days of the week and print the content of the HashSet
        create another implementation of Set that preserves the insertion order of the days of the week and print it
        print the new Set
        print the answer to the question Is the first Set equal to the second one?*/


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("lunedì");
        daysOfWeek.add("martedì");
        daysOfWeek.add("mercoledì");
        daysOfWeek.add("giovedì");
        daysOfWeek.add("venerdì");
        daysOfWeek.add("sabato");
        daysOfWeek.add("domenica");

        System.out.println(daysOfWeek);

        Set<String> daysOfWeekSet = new LinkedHashSet<>();
        daysOfWeekSet.add("lunedì");
        daysOfWeekSet.add("martedì");
        daysOfWeekSet.add("mercoledì");
        daysOfWeekSet.add("giovedì");
        daysOfWeekSet.add("venerdì");
        daysOfWeekSet.add("sabato");
        daysOfWeekSet.add("domenica");

        System.out.println(daysOfWeekSet);

        boolean isTheFirstSetEqualToTheSecondOne = daysOfWeekSet.equals(daysOfWeekSet);
        System.out.println(isTheFirstSetEqualToTheSecondOne);


    }
}