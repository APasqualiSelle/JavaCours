import java.util.Scanner;
public class ChallengeExercice {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){

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
        printArrays(myIntegers);

        }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values\r");
        int[] values = new int[number];

        for (int i =0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }
    public static void printArrays(int[]array){
        for(int i =0;i<array.length;i++){
            System.out.println("Element "+i+" typed values was "+array[i]);
        }

    }


    public static void sortIntegers(int[] array){

        for(int i=0;i<array.length;i++){
            if(array[i]>(array[array.length - 1 - i])){
                array[i] = array[i+0];
                int arraySorte = array[i];
            }
        }

    }


}