package com.umcs.zmudziak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportInformation implements Information {

  private BreakingNewsService newsService;
  @Value("${sport.name}")
  private String name;

  @Override
  public String getInformation() {
    return "[sport-information] getInformation()";
  }

  public String getBreakingNews() {
    return newsService.getNews();
  }


  @Autowired
  @Qualifier("sportBreakingNewsService")
  public void setNewsService(BreakingNewsService newsService) {
    this.newsService = newsService;
  }
}
