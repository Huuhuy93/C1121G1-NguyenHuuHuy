package ss4_class_and_oop_in_java.exercise.stop_watch;

import java.util.Arrays;
import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        int[] array1 = new int[100000];
        for (int i = 0; i < array1.length-1; i++) {
            array1[i] = (int) (Math.random()*100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        stopWatch.selectionSort(array1);
        stopWatch.stop();
        System.out.println("thời gian là:"+ Math.floor(stopWatch.getElapsedTime()/1000));


    }
}
