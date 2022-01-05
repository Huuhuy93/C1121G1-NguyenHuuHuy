package ss4_class_and_oop_in_java.exercise.stop_watch;

import java.util.Arrays;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start() {
        return this.starTime=System.currentTimeMillis();
    }

    public long stop() {
        return this.endTime=System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime-starTime;
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }


}
