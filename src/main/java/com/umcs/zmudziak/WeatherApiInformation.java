package com.umcs.zmudziak;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;

public class WeatherApiInformation implements Information {
  private final OWM owm;

  public WeatherApiInformation(String apiKey) {
    owm = new OWM(apiKey);
  }

  @Override
  public String getInformation() {
    return "Using apiKey: " + owm.getApiKey();
  }

  public String getTemperature(String city) throws APIException {
    CurrentWeather cwd = owm.currentWeatherByCityName(city);
    owm.setUnit(OWM.Unit.METRIC);
    return String.valueOf(cwd.getMainData().getTemp());

  }
}
