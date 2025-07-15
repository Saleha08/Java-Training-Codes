public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {7, 9, 2, 5, 3};
        System.out.println(getNthLargest(arr, 3));
    }

    public static int getNthLargest(int[] arr, int n) {
        int[] newArr = arr.clone();
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;

            for (int j = 0; j < newArr.length; j++) {
                if (newArr[j] > max) {
                    max = newArr[j];
                    index = j;
                }
            }

            result = max;
            newArr[index] = Integer.MIN_VALUE;
        }

        return result;
    }
}
