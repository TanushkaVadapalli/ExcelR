import java.util.Scanner;
public class Demo018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int roundedNumber = ((number + 50) / 100) * 100;
        System.out.println("The number rounded off to the nearest multiple of 100 is: " + roundedNumber);
        scanner.close();




    }
}
