public class Demo3 {
    public static void main(String[] args) {
        // Define three numbers
        int num1 = 45;
        int num2 = 78;
        int num3 = 32;

        // Determine the greatest number
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Display the greatest number
        System.out.println("The greatest number is: " + greatest);
    }
}
