package com.umcs.zmudziak;

public class WeatherInformation implements Information {
  private BreakingNewsService newsService;

  public WeatherInformation(BreakingNewsService newsService) {
    this.newsService = newsService;
  }

  @Override
  public String getInformation() {
    return "[weather-information] getInformation()";
  }

  public String getBreakingNews() {
    return newsService.getNews();
  }
}
