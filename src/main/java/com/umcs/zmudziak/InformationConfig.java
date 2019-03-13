package com.umcs.zmudziak;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("information.properties")
@ComponentScan("com.umcs.zmudziak")
public class InformationConfig {
  @Bean
  public SportBreakingNewsService sportBreakingNewsService() {
    return new SportBreakingNewsService();
  }

  @Bean
  public SportInformation sportInformation() {
    return new SportInformation();
  }
}
