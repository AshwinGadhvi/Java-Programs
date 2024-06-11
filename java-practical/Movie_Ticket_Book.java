import java.util.ArrayList;
import java.util.Scanner;

//Design a program for a movie booking ticket system in Java. The program should allow users to
//view available movies, select a movie, choose a showtime, specify the number of tickets they want
//to purchase, and make a booking. Ensure that the program keeps track of available seats for each
//showtime and prevents overbooking.8



public class Movie_Ticket_Book {

    String name;
    int price;
    public Movie_Ticket_Book(String name1,int price1)
    {
        name=name1;
        price=price1;
    }
    public static void main(String[] args) {
        Movie_Ticket_Book ob1 = new Movie_Ticket_Book("Avatar",150);
        Movie_Ticket_Book ob2 = new Movie_Ticket_Book("Avengers",100);
        Movie_Ticket_Book ob3 = new Movie_Ticket_Book("IronMan",300);
        Movie_Ticket_Book ob4 = new Movie_Ticket_Book("Thor",200);
        Movie_Ticket_Book ob5 = new Movie_Ticket_Book("F10",400);
        int choice;
        ArrayList a = new ArrayList();
        a.add(ob1);
        a.add(ob2);
        a.add(ob3);
        a.add(ob4);
        a.add(ob5);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("-----------Movie Ticket Booking System----------");
            System.out.println("1.For View Available Movies : ");
            System.out.println("2.For Select A Movie : ");
            System.out.println("3.Choose A Showtime For Movie : ");
            System.out.println("4.For Booking The Movie Tickets : ");
            System.out.println("5.For Show Available Seat : ");
            System.out.println("6.For Exit From Console : ");
            System.out.print("Enter Your Choice : ");
            choice= sc.nextInt();
            switch(choice)
            {
                case 1:
                	ArrayList op = new ArrayList();
                	op=a;
                    for (Object x:op)
                    {
                        System.out.println((String)x);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter Valid Choice : ");
                    break;
            }
        }
    }
}
