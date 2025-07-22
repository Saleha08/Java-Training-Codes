import java.util.*;
public class Problem155A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int best=arr[0];
        int worst=arr[0];
        int count=0;
        for(int i=1;i<n;i++){
            if(arr[i]>best){
                count++;
                best=arr[i];
            }
            else if(arr[i]<worst){
                count++;
                worst=arr[i];
            }
        }
        System.out.println(count);
    }
}