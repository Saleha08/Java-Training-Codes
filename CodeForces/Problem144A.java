import java.util.*;

public class Problem144A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int result = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            result--;
        }
        System.out.println(result);
    }
}
