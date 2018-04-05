import java.util.Arrays;
import java.util.Scanner;

public class ChallengeExercice {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Create a program using arrays that sorts a list of integers descending order.
        //Descending order is highest value to lowest.
        //In other words if the array had the values in it 106, 26, 81, 5, 15, your program   should
        //ultimately have an array with 106,81,26,15,5, in it.
        //Set up the program so that the numbers to sort are read in from the keyboard.
        //Implement the following methods - getIntegers, printArray, and sortIntegers
        //getIntegers returns an array of entered integers from keyboard
        //printArray prints out the contents of the array
        //and sortIntegers should sort the array and return a new array containing the sorted numbers
        //you will have to figure out how to copy the array elements from the passed array into a new
        //array and sort them and return the new sorted array
        int[] myIntegers = getIntegers(5);
        //   printArrays(myIntegers);
        System.out.println();
        int[] sorted = sortIntegers(myIntegers);
        printArrays(sorted);
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " integer values\r");
        int[] values = new int[capacity];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] printArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " content " + array[i]);
        }
        return array;
    }


    public static int[] sortIntegers(int[] array) {

       /* int[] sortedArray= new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i]=array[i];
            }*/
       
        //methode from Java that does the same thing above in comment
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {//1,2,3
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];// temp = sorteArray[0] = 1
                    sortedArray[i] = sortedArray[i + 1]; //sorteArray[0] = sortedArray[1] = 2
                    sortedArray[i + 1] = temp; // sortedArray[1] = sortedArray[0] = 1
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


}

