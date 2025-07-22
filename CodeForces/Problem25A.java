import java.util.*;
public class Problem25A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int number;
        int oddIndex=0;
        int  evenIndex=0;
        int counter=0;
        for(int i=1;i<=n;i++){
            number=sc.nextInt();
            if(number%2==0){
                evenIndex=i;
                counter++;
            }else{
                oddIndex=i;
                counter--;
            }
        }
        if(counter>0){
            System.out.println(oddIndex);
        }
        else{
            System.out.println(evenIndex);
        }
    }

}