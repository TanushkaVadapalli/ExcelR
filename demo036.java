import java.util.Scanner;

public class demo036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        
       
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num3) {
            System.out.println(num2 + " is greater than " + num3);
        } else if (num3>num1) {
            System.out.println(num3 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
        
        scanner.close();
}
}