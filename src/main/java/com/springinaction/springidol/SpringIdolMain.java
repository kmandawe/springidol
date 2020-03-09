package com.springinaction.springidol;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

  public static void main(String[] args) throws PerformanceException {
    AbstractApplicationContext ctx =
        new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
    ctx.registerShutdownHook();
    Stage theStage = (Stage) ctx.getBean("theStage");
    System.out.println(theStage != null);
  }
}
