import java.util.Arrays;

public class Demo065 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 

        
        System.out.println("Array elements: " + Arrays.toString(arr));

    
        System.out.print("Array elements using loop: ");
        for (int num : arr) {
          System.out.print(num + " ");
}
}
}