package com.chtti.demo.demo1;

public class pointOfInterest {
    private String location;
    private String weather;

    public pointOfInterest(String location, String weather) {
        this.location = location;
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "pointOfInterest{" +
                "location='" + location + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
