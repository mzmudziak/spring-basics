package com.umcs.zmudziak;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Information info = context.getBean("weatherInformation", Information.class);
    System.out.println(info.getInformation());
    System.out.println(((WeatherInformation) info).getBreakingNews());
    Information music = context.getBean("musicInformation", Information.class);
    System.out.println(music.getInformation());
    System.out.println(((MusicInformation) music).getBreakingNews());
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(InformationConfig.class);
    Information sport = ctx.getBean("sportInformation", Information.class);
    System.out.println(sport.getInformation());
    System.out.println(((SportInformation) sport).getBreakingNews());
  }
}
