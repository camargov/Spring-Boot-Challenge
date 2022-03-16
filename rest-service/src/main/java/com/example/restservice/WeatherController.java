package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    
    @GetMapping("/get-weather")
    public Weather getWeather(@RequestParam(value = "zipcode") String zipcode) {
        Weather temp = new Weather(zipcode);
        return new Weather(zipcode, temp.getDailyHighs(), temp.getDailyLows(), temp.getHumidity(), temp.getWind());
    }

    @PostMapping("/post-weather")
    public Weather postWeather(@RequestParam(value = "zipcode") String zipcode) {
        Weather temp = new Weather(zipcode);
        return new Weather(zipcode, temp.getDailyHighs(), temp.getDailyLows(), temp.getHumidity(), temp.getWind());
    }
}
