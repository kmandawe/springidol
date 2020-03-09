package com.springinaction.springidol;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

  public static void main(String[] args) throws PerformanceException {
    AbstractApplicationContext ctx =
        new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
    ctx.registerShutdownHook();
    Instrumentalist kenny = (Instrumentalist) ctx.getBean("kenny");
    kenny.perform();
  }
}
