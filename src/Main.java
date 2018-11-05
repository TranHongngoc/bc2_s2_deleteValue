import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] deleteValue(int [] array,int value){
            int index = 0;
            for (int i = 0; i<array.length-2; i++){
                if (array[i] == value){
                    index = i;
                    break;
                }
            }

            for (int i = index; i<array.length-1;i++){
                array[i] = array[i+1];
            }
             array[array.length-1] = 0;
            return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of array: ");
        int size = scanner.nextInt();

        int[]array = new int[size];

        for (int i=0;i<size; i++){
            System.out.println("the " + (i+1) + " number is: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the value: ");
        int value = scanner.nextInt();

        System.out.println("Before array is: " + Arrays.toString(array));

        System.out.println("After array is: " + Arrays.toString(deleteValue(array,value)));
    }

}
