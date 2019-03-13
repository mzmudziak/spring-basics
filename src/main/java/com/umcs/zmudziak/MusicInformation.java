package com.umcs.zmudziak;

public class MusicInformation implements Information {
  private BreakingNewsService newsService;
  private String name;
  private String description;

  @Override
  public String getInformation() {
    return "[music-information] getInformation()";
  }

  public String getBreakingNews() {
    return newsService.getNews();
  }

  public BreakingNewsService getNewsService() {
    return newsService;
  }

  public void setNewsService(BreakingNewsService newsService) {
    this.newsService = newsService;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
