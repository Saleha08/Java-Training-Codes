// Code to execute both if and else statement (in a clever way)
public class IF_Else {
    public static void main(String[] args){

        // 'System.out.printf("Hello")' prints "Hello" and returns a PrintStream object, not null
        // So the condition '== null' becomes false, hence the else block runs
        if(System.out.printf("Hello") == null){
            // This block will NOT execute because printf returns non-null
            System.out.println("Hello");
        }
        else{
            // This block will execute and print "World"
            System.out.println("World");
        }
    }
}
