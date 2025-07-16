// Program to swap two numbers without using a third variable directly
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // ------------------------------------------
        // Alternate Swap using Array (Commented out)
        // ------------------------------------------
        /*
        // Create an array of size 2
        int[] arr = new int[2];
        arr[0] = a; // Store a in index 0
        arr[1] = b; // Store b in index 1

        // Swap using array elements
        a = arr[1]; // Assign b to a
        b = arr[0]; // Assign a to b

        // Output swapped values
        System.out.println(a);
        System.out.println(b);
        */

        // ------------------------------------------
        // Swap using difference and conditional logic
        // ------------------------------------------

        // Calculate absolute difference between a and b
        int diff = Math.abs(a - b);

        // Adjust values based on which one is greater
        if (a > b) {
            a -= diff; // a = a - diff (becomes b)
            b += diff; // b = b + diff (becomes a)
        } else {
            a += diff; // a = a + diff (becomes b)
            b -= diff; // b = b - diff (becomes a)
        }

        // Output swapped values
        System.out.println(a);
        System.out.println(b);
    }
}
