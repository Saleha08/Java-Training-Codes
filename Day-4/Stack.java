public class Stack {
    int[] arr;
    int top;
    Stack(int d){
        arr=new int[d];
        top=-1;
    }
    void push(int d){
        if(top==arr.length-1){
            System.out.println("Stack is overflow");
        }else{
            top++;
            arr[top]=d;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is underflow");
        }else{
            top--;
        }
    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }else{
            System.out.println(arr[top]);
        }
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Stack s=new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.peek();
        s.pop();
        s.display();

    }
}
