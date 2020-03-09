package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TicketMain {

  public static void main(String[] args) {
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
    Ticket ticket1 = (Ticket) ctx.getBean("ticket");
    Ticket ticket2 = (Ticket) ctx.getBean("ticket");

    System.out.println("Ticket 1: " + ticket1.getTicketNumber());
    System.out.println("Ticket 2: " + ticket2.getTicketNumber());
    System.out.println(
        "Tickets Numbers are the same: "
            + ticket1.getTicketNumber().equals(ticket2.getTicketNumber()));
  }
}
