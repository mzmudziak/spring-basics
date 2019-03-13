package com.umcs.zmudziak;

public class WeatherBreakingNewsService implements BreakingNewsService {
  @Override
  public String getNews() {
    return "[weather-breaking-news-service] getNews()";
  }
}
