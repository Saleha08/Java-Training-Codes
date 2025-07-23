//Program to reverse the string using stack
import java.util.*;
class Stack2 {
    char[] arr;
    int top;
    Stack2(int len){
        arr=new char[len];
        top=-1;
    }
    void push(char ch){
        if(top==arr.length-1){
            System.out.println("Stack is over-flow.");
            return;
        }
        top++;
        arr[top]=ch;
    }
    char pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
            return '\n';
        }
        char data=arr[top];
        top--;
        return data;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Stack2 s=new Stack2(name.length());
        int i=0;
        while(i!=name.length()){
            s.push(name.charAt(i));
            i++;
        }
        StringBuilder result=new StringBuilder();
        for(int j=0;j<name.length();j++){
            result.append(s.pop());
        }
        System.out.println(result);
    }
}