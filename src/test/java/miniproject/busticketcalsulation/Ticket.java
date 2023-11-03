package miniproject.busticketcalsulation;
public class Ticket {
    //distance, journey type, price, seat number
    public double distance;
    public int journeyType;
    public int seatNum;
    public double price;
    // to print these values on the ticket
    public void printTicket(Bus bus){
        System.out.println(" ---  Ticket details--- ");
        System.out.println("Bus Number: " + bus.busNum);
        System.out.println("Distance: " + this.distance);
        System.out.println("Type Of Journey: " + (this.journeyType==1 ? "One Way Ticket" : "Round Trip"));
        System.out.println("Your Seat Number: " + this.seatNum);
        System.out.println("Total price: " + this.price);
        System.out.println("Have a nice trip!");
    }
}
