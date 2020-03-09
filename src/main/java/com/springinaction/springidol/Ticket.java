package com.springinaction.springidol;

import java.util.UUID;

public class Ticket {

  private String ticketNumber;

  public Ticket() {
    this.ticketNumber = UUID.randomUUID().toString();
  }

  public String getTicketNumber() {
    return ticketNumber;
  }

  public void setTicketNumber(String ticketNumber) {
    this.ticketNumber = ticketNumber;
  }
}
