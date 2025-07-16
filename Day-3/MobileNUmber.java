// Program to validate a mobile number based on length and starting digit range

import java.util.Scanner;

public class MobileNUmber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        long mobileNo = sc.nextLong();

        // Check if number has exactly 10 digits
        if (getLength(mobileNo) == 10) {
            // Check if number starts from 6 to 9 (i.e., >=6000000000 and <10000000000)
            if (mobileNo >= 6000000000L && mobileNo < 10000000000L) {
                System.out.println("Valid Number");
            } else {
                System.out.println("Invalid Number");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }

    // Method to calculate number of digits in a long number
    public static int getLength(long no){
        int len = 0;
        while (no > 0) {
            len++;
            no /= 10;
        }
        return len;
    }
}
