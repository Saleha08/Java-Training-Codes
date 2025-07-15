import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str= sc.next();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((int)ch >=65 && (int)ch<=91){
                ch+=(char)32;
                result.append(ch);
            }
            else if((int)ch>=97 && (int)ch<=122){
                ch-=(char)32;
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
