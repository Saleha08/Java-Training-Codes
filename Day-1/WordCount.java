//count the words in sentences
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args){
        System.out.println("Enter the sentence:");
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();

        String[] words=sentence.trim().split("\\s+");
        int count=(sentence.trim().isEmpty())?0: words.length;
        System.out.println(count);
    }
}
