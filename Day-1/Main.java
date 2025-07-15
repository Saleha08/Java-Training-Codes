//Array operations
import java.util.Scanner;

class Main {
    int capacity;
    int size;
    int[] arr;
    Main(int c){
        capacity=c;
        arr=new int[capacity];
        size=0;
    }
    void insert(int data){
        if(size<capacity) {
            arr[size] = data;
            size++;
            System.out.println("Element inserted successfully");
        }
    }
    void delete(int index){
        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
        System.out.println("Element of index "+index+"deleted successfully ");
    }
    void print(){
        System.out.println("Printing array element");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    void update(int index,int element){

        arr[index]=element;
        System.out.println("Updated the element at index "+index+" with "+element);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main(10);
        while (true){
            System.out.println("\nChoose operation:");
            System.out.println("1. Insert element");
            System.out.println("2. Delete element");
            System.out.println("3. Update element");
            System.out.println("4. Print array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1://insert
                    System.out.println("*****Insertion*****");
                    System.out.println("Enter data to be inserted:");
                    int data= sc.nextInt();
                    m.insert(data);
                    break;
                case 2://delete
                    System.out.println("****Deletion****");
                    System.out.println("Enter index of element to be deleted:");
                    int index=sc.nextInt();
                    m.delete(index);
                    break;
                case 3://update
                    System.out.println("****Updation****");
                    System.out.println("Enter the index of element to be updated:");
                    int ind=sc.nextInt();
                    System.out.println("Enter the new element:");
                    int num= sc.nextInt();
                    m.update(ind,num);
                    break;
                case 4://print
                    System.out.println("****printing****");
                    m.print();
                    break;
                case 5: // Exit
                    System.out.println("Exiting.");
                    sc.close();
                    return;
            }
        }

    }
}
 