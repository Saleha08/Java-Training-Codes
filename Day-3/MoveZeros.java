import java.util.ArrayList;

// Program to move all zeros to the end of an array using different approaches
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 0, 2, 3, 0, 0};

        // Uncomment to use other approaches
        // int[] result = moveZero(arr);  // Two pointer approach
        // print(result);

        // System.out.println(moves2(arr)); // ArrayList approach

        int[] r = moves3(arr); // Efficient in-place approach
        print(r);
    }

    // ---------------------------------------------------
    // 1. Two Pointer Approach
    // ---------------------------------------------------
    // Moves non-zero elements to the front by swapping with zeros.
    // Works in-place with O(n) time complexity.
    public static int[] moveZero(int[] arr) {
        int start = 0;
        int end;

        for (end = 1; end < arr.length; end++) {
            // If 'start' is zero and 'end' is non-zero, swap
            if (arr[start] == 0 && arr[end] != 0) {
                arr[start] = arr[end];
                arr[end] = 0;
                start++;
            }
            // If 'start' is already non-zero, move it ahead
            else if (arr[start] != 0) {
                start++;
            }
        }
        return arr;
    }

    // ---------------------------------------------------
    // 2. ArrayList Approach (Using extra space)
    // ---------------------------------------------------
    // Adds all non-zero elements to a list, then appends required zeros.
    public static ArrayList<Integer> moves2(int[] arr) {
        int cnt = 0;
        ArrayList<Integer> nums = new ArrayList<>();

        // Collect all non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                nums.add(arr[i]);
            } else {
                cnt++; // Count zeros
            }
        }

        // Append zeros at the end
        for (int i = 0; i < cnt; i++) {
            nums.add(0);
        }

        return nums;
    }

    // ---------------------------------------------------
    // 3. Optimized In-place Approach
    // ---------------------------------------------------
    // Shifts non-zero elements forward and fills rest with zeros.
    public static int[] moves3(int[] arr) {
        int cnt = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[cnt] = arr[i];
                cnt++;
            }
        }

        // Fill remaining elements with zero
        while (cnt < arr.length) {
            arr[cnt] = 0;
            cnt++;
        }

        return arr;
    }

    // ---------------------------------------------------
    // Utility Method: Print array elements
    // ---------------------------------------------------
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
