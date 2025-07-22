import java.util.*;
public class Problem514A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String ans="";
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (i == 0) {
                if (ch >= '5' && ch <= '8')
                    ch = (char) (9 - Integer.parseInt(ch + "") + '0');
            } else {
                if (ch >= '5' && ch <= '9')
                    ch = (char) (9 - Integer.parseInt(ch + "") + '0');
            }
            ans += ch;
        }

        System.out.println(ans);

    }
}