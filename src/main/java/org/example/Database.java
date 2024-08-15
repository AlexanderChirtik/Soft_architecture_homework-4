package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Database {
    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database() {
        for (int i = 0; i < 8; i++) {
            tickets.add(new Ticket());
        }
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public double getTicketAmount() {
        return 45;
    }
    public int createTicketOrder(int clientId) {
        return ++counter;
    }
}
