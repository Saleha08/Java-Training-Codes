// Program to validate an Indian PAN number based on format: 5 uppercase letters, 4 digits, and 1 uppercase letter

import java.util.Scanner;

public class PanNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PAN number:");
        String pan = sc.nextLine();
        boolean valid = true;

        // Check total length is exactly 10 characters
        if (pan.length() != 10) {
            valid = false;
        } else {

            // First 5 characters must be uppercase letters
            for (int i = 0; i < 5; i++) {
                char ch = pan.charAt(i);
                if (!(ch >= 'A' && ch <= 'Z')) {
                    valid = false;
                    break;
                }
            }

            // Next 4 characters must be digits
            for (int i = 5; i < 9 && valid; i++) {
                char ch = pan.charAt(i);
                if (!(ch >= '0' && ch <= '9')) {
                    valid = false;
                    break;
                }
            }

            // Last character must be an uppercase letter
            if (!(pan.charAt(9) >= 'A' && pan.charAt(9) <= 'Z')) {
                valid = false;
            }
        }

        // Output result
        if (valid) {
            System.out.println("Valid PAN number");
        } else {
            System.out.println("Not a valid PAN number");
        }
    }
}
