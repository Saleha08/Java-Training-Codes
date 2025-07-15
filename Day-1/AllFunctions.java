//  Implementation of all string methods
import java.util.Scanner;

public class AllFunctions {
    public static void main(String[] args){
        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(trims(str));
        System.out.println(replaceFirstOccurrence(str,'l','m'));
        System.out.println(replaceAllOccurrence(str,'n','m'));
        System.out.println(reverse(str));
        System.out.println(startsWiths(str,"sal"));
        System.out.println(endsWiths(str,"eha"));

    }
    public static String trims(String str){
        int start=0;
        int end=str.length()-1;
        String result="";
        while(start<=end && str.charAt(start)==' '){
            start++;
        }
        while(end>=start && str.charAt(end)==' '){
            end--;
        }
        for(int i=start;i<=end;i++){
            result+=str.charAt(i);
        }
        return result;
    }
    public static String replaceFirstOccurrence(String str,char old,char newCh){
        int index=str.indexOf(old);
        if(index==-1){
            return str;
        }
        StringBuilder newStr=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i==index){
                newStr.append(newCh);
            }
            else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
    public static  String replaceAllOccurrence(String str,char old,char newCh){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==old){
                result.append(newCh);
            }else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static String reverse(String str){
        StringBuilder result=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static boolean startsWiths(String str,String prefix){
        int len=prefix.length();
        for(int i=0;i<len;i++){
            if(str.charAt(i)!=prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean endsWiths(String str,String suffix){
        int suffixLen=suffix.length();
        int offset=str.length()-suffixLen;
        for(int i=0;i<suffixLen;i++){
            if(str.charAt(i+offset)!=suffix.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
