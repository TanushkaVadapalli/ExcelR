import java.util.Scanner;
public class Demo083 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("Enter a String: ");
         char firstChar = sc.next().charAt(0);
        
    
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
}
}