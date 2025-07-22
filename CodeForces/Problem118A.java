import java.util.*;
public class Problem118A {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();
    String result = "";
        for(int i = 0;i<str.length();i++){
        char ch = str.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            continue;
        } else {
            result += "." + ch;
        }
    }
        System.out.println(result);

}
}
