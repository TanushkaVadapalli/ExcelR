public class Ltcode003 {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        
        s = s.trim();

        
        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1; 
        int index = 0; 
        int n = s.length();

        
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        
        int result = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';

            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        ltcode003 converter = new ltcode003();

      
        System.out.println(converter.myAtoi("42"));
        System.out.println(converter.myAtoi("   -42")); 
        System.out.println(converter.myAtoi("4193 with words")); 
        System.out.println(converter.myAtoi("words and 987")); 
        System.out.println(converter.myAtoi("-91283472332")); 
    }
}
