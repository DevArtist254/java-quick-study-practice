import java.util.Arrays;

public class Storage {
    public Storage() {
        /*
        * Array - storage based system for indexed values
        *
        * Features
        * Has helper func inherited from Object.java
        * Is initialized by the type of data to be used
        * Should have a defined sized
        * Can be read by iterating through using a loop
        * Also a loop and store values by assigning them
        *
        * Binary search means dividing by 2 until the one is found this Must be always int by sort algo
        * */


    }

    public static void main(String[] args) {
        int[] numGam = {1, 20, 33, 4, 55, 6, 7, 8, 9, 10};

        Arrays.sort(numGam);
        for (int i = 0;i < numGam.length;i++){
            System.out.println(numGam[i]);
        }
    }
}
