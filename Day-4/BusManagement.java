//Program for bus booking system using oops concept
import java.util.Scanner;
class Seat {
    static int[] seats = new int[10];
    boolean booked = false;

    void checkAvailability(int seat){
        if(seats[seat - 1] == 0){
            seats[seat - 1] = 1;
            booked = true;
        }
        else{
            System.out.println("Already booked..");
            booked=false;

        }
    }
    void displaySeats() {
        int count=0;
        for (int i = 0; i < 10; i++) {
            if(seats[i]==0){
                count++;
            }

        }
        System.out.println("Availbale Seats:"+count);
    }

    private String name;
    private int age;
    private String source;
    private String destination;
    private long mobileNo;
    private String mail;

    void setAge(int age){ this.age = age; }
    void setName(String name){ this.name = name; }
    void setMobile(long no){ this.mobileNo = no; }
    void setSource(String src){ this.source = src; }
    void setDestination(String des){ this.destination = des; }
    void setMail(String mail){ this.mail = mail; }

    void getName(){ System.out.println(this.name); }
    void getAge(){ System.out.println(this.age); }
    void getSource(){ System.out.println(this.source); }
    void getDestination(){ System.out.println(this.destination); }
    void getMobile(){ System.out.println(this.mobileNo); }
    void getMail(){ System.out.println(this.mail); }
}

public class BusManagement {
    public static void main(String[] args){
        System.out.println("..Bus Booking System..");
        Scanner sc=new Scanner(System.in);
        Seat s = new Seat();
        int choice;
        do{
            System.out.println("\n1. Book Seat");
            System.out.println("2. Show Seats");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter seat number:");
                    int n=sc.nextInt();
                    s.checkAvailability(n);
                    if(s.booked){
                        sc.nextLine();
                        System.out.print("Enter your name: ");
                        s.setName(sc.nextLine());

                        System.out.print("Enter age: ");
                        s.setAge(sc.nextInt());

                        System.out.print("Enter mobile number: ");
                        s.setMobile(sc.nextLong());
                        sc.nextLine();

                        System.out.print("Enter source: ");
                        s.setSource(sc.nextLine());

                        System.out.print("Enter destination: ");
                        s.setDestination(sc.nextLine());

                        System.out.print("Enter mail id: ");
                        s.setMail(sc.nextLine());

                        System.out.println("\nBooking Confirmed:");
                        s.getName();
                        s.getAge();
                        s.getMobile();
                        s.getSource();
                        s.getDestination();
                        s.getMail();
                    }
                    break;
                case 2:
                    s.displaySeats();
                    break;
                case 3:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid Choice..");
                    break;

            }

        }while(choice != 3);

    }
}

