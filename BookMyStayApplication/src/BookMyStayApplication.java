/**
 /*
 ================================================================
 USE CASE 8: BOOKING HISTORY & REPORTING
 ================================================================

 DESCRIPTION:
 This program maintains a record of confirmed reservations
 and generates reports from stored booking history.

 ================================================================
 version 8.0
 @author Abishek JS
*/

// CODE ->
class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }
}

class BookingHistory {
    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}

class BookingReportService {

    public void generateReport(BookingHistory history) {

        System.out.println("Booking History Report");

        for (Reservation r : history.getConfirmedReservations()) {
            System.out.println("Guest: " + r.getGuestName() + ", Room Type: " + r.getRoomType());
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        Reservation r1 = new Reservation("Abhi", "Single");
        Reservation r2 = new Reservation("Subha", "Double");
        Reservation r3 = new Reservation("Vanmathi", "Suite");

        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        BookingReportService reportService = new BookingReportService();

        System.out.println("Booking History and Reporting");
        System.out.println();

        reportService.generateReport(history);
    }
}
        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "Single-1";

        Service s1 = new Service("Breakfast", 500.0);
        Service s2 = new Service("Spa", 700.0);
        Service s3 = new Service("Airport Pickup", 300.0);

        manager.addService(reservationId, s1);
        manager.addService(reservationId, s2);
        manager.addService(reservationId, s3);

        double totalCost = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Add-On Service Selection");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}
