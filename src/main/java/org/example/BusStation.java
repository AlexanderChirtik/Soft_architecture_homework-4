package org.example;

public class BusStation {
    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrcode) {
        return ticketProvider.checkTicket(qrcode);
    }
}
