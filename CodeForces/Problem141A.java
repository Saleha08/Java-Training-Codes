import java.util.Arrays;
import java.util.Scanner;
public class Problem141A{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String guest=sc.nextLine();
        String host=sc.nextLine();
        String shuffled= sc.nextLine();
        String wholeInput=guest+host;
        char[] arr1=wholeInput.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=shuffled.toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}