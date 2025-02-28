package Train_Ticket_Booking_Problem;

import java.util.List;

public class TicketSystem {
	private List<String> seats;

    public TicketSystem(List<String> seats) {
        this.seats = seats;
    }

    public synchronized void bookTicket(String customer) {
        if (!seats.isEmpty()) {
            String seat = seats.remove(0);
            System.out.println(customer + " đã đặt ghế " + seat);
        } else {
            System.out.println(customer + " thất bại: Hết vé!");
        }
    }
}
