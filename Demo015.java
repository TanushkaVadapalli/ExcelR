import java.util.Scanner;

public class Demo015{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // int a = 10;
        //int b = 9;
        System.out.println("number1 before swapping: ");
        int a = scanner.nextInt();
        System.out.println("number2 before swapping: ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("number1 after swapping: " + a);
        System.out.println("number2 after swapping: " + b);


}
}