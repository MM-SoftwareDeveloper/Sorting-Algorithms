package Bubble_Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {7,3,1,4,6,2,3};

        BubbleSort sorter = new BubbleSort();

        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
