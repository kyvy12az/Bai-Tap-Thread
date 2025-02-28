package Train_Ticket_Booking_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketBookingProblem {
	public static void main(String[] args) {
        List<String> seats = new ArrayList<>(Arrays.asList("A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3"));
        TicketSystem system = new TicketSystem(seats);

        for (int i = 1; i <= 10; i++) {
            String customer = "Khách " + i;
            new Thread(() -> system.bookTicket(customer)).start();
        }
    }
}
