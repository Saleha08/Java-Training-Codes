// Program to reverse only the vowels in a given string using a Stack

import java.util.Scanner;
import java.util.Stack;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        reverseName(name);
    }

    // Method to reverse only the vowels in the string
    public static void reverseName(String name) {
        Stack<Character> st = new Stack<>();

        // First pass: push all vowels into the stack
        for (char ch : name.toCharArray()) {
            if (isVowel(ch)) {
                st.push(ch);
            }
        }

        // Second pass: replace vowels with popped vowels from stack (reverse order)
        StringBuilder result = new StringBuilder();
        for (char ch : name.toCharArray()) {
            if (isVowel(ch)) {
                result.append(st.pop());
            } else {
                result.append(ch);
            }
        }

        System.out.println("Name after reversing vowels: " + result);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        String str = "aeiouAEIOU";
        return str.indexOf(ch) != -1;
    }
}
