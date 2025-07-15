import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int N=n+1;
        int expectedSum=((N+1)*N)/2;
        int actualSum=0;
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            actualSum+=arr[i];
        }
        int missingNum=expectedSum-actualSum;
        System.out.println("Missing Number is:"+missingNum);

    }
}
