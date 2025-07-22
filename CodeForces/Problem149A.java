import java.util.*;

public class Problem149A
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int arr[] = new int[12];
        for(int i=0;i<12;i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        if(k == 0){
            System.out.println("0");
        }else {

            int sum = 0, count = 0;
            int flag = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                sum += arr[i];
                count++;

                if (sum >= k) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("-1");
            } else {
                System.out.println(count);
            }
        }
    }
}