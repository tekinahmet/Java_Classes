package miniproject.busticketcalsulation;
import java.util.Scanner;
/*
    Project: app that calculates bus ticket price based on distance and conditions
        Distance from User (KM), age and trip type (One-Way) OR  Round-trip (Going&Returning)
        Get seat number information.
        All buses should have a seat number in total "32".
        Take the payment as 1 USD / km per distance. (*2 for Round-trip trip)
        First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;
        Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
        Otherwise, "You Have Entered Wrong Data!" or Any warning should be given.
    1- If the person has chosen the "Journey Type" Round-trip trip, 20% discount is applied on the ticket price.
    2- Single Seat Fee:
        If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.
    3- Age discount:
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
 */
public class TicketReservation {
    public static void main(String[] args) {
        // create bus object
        Bus bus = new Bus("Hounslow 222");

        // create ticket object
        Ticket ticket = new Ticket();
        start(bus, ticket);
    }
    // cretae a method to get input from the user
    public static void start(Bus bus, Ticket ticket){
        Scanner scan = new Scanner(System.in);
        int select;
        do{
            System.out.println("--- Welcome to Our Ticket Reservation Desk ---");
            System.out.println("Enter the distance (in KM) you want to travel");
            double distance = scan.nextDouble();

            System.out.println("Enter the type of journey");
            System.out.println("1- One Way \n2- Round Trip");
            int type = scan.nextInt();

            System.out.println("Enter your age!");
            int age = scan.nextInt();

            System.out.println("Choose the seat number");
            System.out.println("Single seat is 20% more expensive than others");
            System.out.println(bus.seats); // ["1", "2", "3", "4", ..... "32"]
            int seat = scan. nextInt();
            // remove the reserved seat from the List
            bus.seats.remove(seat);//String.valueOf(seat)
            //check if the values are valid or not
            //for journey type, distance and age
            // Conditions:
            boolean check = type==1 || type==2;
            if (distance>0 && age>0 && check ){
                // calculate the ticket price
                ticket.journeyType= type;
                ticket.distance = distance;
                ticket.seatNum = seat;
                ticket.price = calculatePrice(ticket, age);
                ticket.printTicket(bus);
            }else {
                System.out.println("You Have Entered Wrong Data!");
            }
            // option to restart or quit
            System.out.println("Press any number to Restart or press 0 to quit");
            select = scan.nextInt();
        }while (select !=0);
    }
    // create a method to calculate the Ticket Price
    public static double calculatePrice(Ticket ticket, int age){
        double distance = ticket.distance;
        int type = ticket.journeyType;
        int seat = ticket.seatNum;
        double total = 0;

        // journeyType and seat(single or not ) conditions
        switch (type) {
            case 1:  // one way
                if (seat % 3 == 0) {  // in case user chooses single seat
                    total = distance * 1.2;
                } else {
                    total = distance * 1;
                }
                System.out.println("Total Price: " + total + " £");
                break;
            case 2:  // Round Trip
                if (seat % 3 == 0) {  // in case user chooses single seat
                    total = distance * 2.4;
                } else {
                    total = distance * 2;
                }
                System.out.println("Total Price: " + total + " £");
                total = total * 0.8;  // 20% discount overall for choosing a Round Trip
                System.out.println("Total Price after Discount: " + total + " £");
                break;
        }
        // age discount
        if (age>0 && age<12){
            total = total*0.5;  // 50% discount
            System.out.println("Total Price After Age Discount: " + total);
        }else if (age<25){//age>=12 && age<=24
            total = total*0.9;  // 10% discount
            System.out.println("Total Price After Age Discount: " + total);
        }else if (age>=65 && age<=120){
            total = total*0.7;  // 30% discount
            System.out.println("Total Price After Age Discount: " + total);
        }
        return total;
    }
}
