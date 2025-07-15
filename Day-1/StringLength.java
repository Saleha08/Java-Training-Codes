//code to find length of String without using inbuilt method
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args){
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str+='$';
        int count=0;
        for(int i=0;str.charAt(i)!='$';i++){
            count++;
        }
        System.out.println("The length of the string is:"+count);

    }
}
