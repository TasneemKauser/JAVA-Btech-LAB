package Pattern_practice;
import java.util.Arrays;
public class sor_array {
        public static void main (String [] args) {
            int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
            System.out.println("The original array is :");
            for (int j=0;j< array.length;j++){
                System.out.print(array[j]+" ");
            }
            Arrays. sort(array);
            System.out.println("\nThe Sorted array is :");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
        }
}
