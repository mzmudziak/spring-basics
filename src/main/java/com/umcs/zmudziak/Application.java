package com.umcs.zmudziak;

import net.aksingh.owmjapis.api.APIException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) throws APIException {
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
    Information api = context.getBean("apiInformation", Information.class);
    System.out.println(api.getInformation());
    System.out.println(((WeatherApiInformation) api).getTemperature("London"));
  }
}
