package edu.neu.coe.info6205.sort.elementary;
import edu.neu.coe.info6205.util.Timer;

import java.util.Random;

public class InsertionSortBenchMarkTest {
    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();} // storing random integers in an array
        Timer timer = new Timer();
        final double mean = timer.repeat(50, () -> arr, t -> {
            InsertionSort.sort(t);
            return null;
        });
        System.out.println(" Mean:" + mean);
        System.out.println("Random numbers");
        for (int i: arr){
            System.out.println(i);
        }

    }
}
