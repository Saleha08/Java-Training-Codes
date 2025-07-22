import java.util.*;
public class Problem236A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String userName=sc.nextLine();
        ArrayList<Character> distinct=new ArrayList<>();
        for(int i=0;i<userName.length();i++){
            char ch=userName.charAt(i);
            if(!distinct.contains(ch)){
                distinct.add(ch);
            }
        }
        if(distinct.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}