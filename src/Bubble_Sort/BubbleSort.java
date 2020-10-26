package Bubble_Sort;

/**
 * Bubble Sort Class O(n^2)
 */

public class BubbleSort {

    public void sort(int[] array) {

        boolean isSorted;

        for (int i = 0; i < array.length; i++) {

            /*
             * Checks if the array is already sorted.
             * If it is then there won't be a reason to iterate through it
             * more than once.
             */
            isSorted = true;

            /*
             * Added the - i to the array.length so that the sort doesn't check the last digit which
             * should already be in the right position as it is the largest number in the array.
             */
            for (int j = 1; j < array.length - i; j++) {

                if (array[j] < array[j - 1]) {
                    swap(array, j, j -1);
                    isSorted = false;
                }
            }

            if (isSorted) {
                return;
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
