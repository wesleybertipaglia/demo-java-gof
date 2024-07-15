package com.wesleybertipaglia.gof.behavior;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherDisplay weatherDisplay = new WeatherDisplay();

        weatherStation.register(weatherDisplay);

        weatherStation.setTemperature(25);

        weatherStation.unregister(weatherDisplay);

        weatherStation.setTemperature(30);
    }
}

interface ObserverInterface {
    void update(int temperature);
}

interface Subject {
    void register(ObserverInterface observer);

    void unregister(ObserverInterface observer);

    void notifyObservers();
}

class WeatherStation implements Subject {
    private int temperature;
    private List<ObserverInterface> observers = new ArrayList<>();

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void register(ObserverInterface observer) {
        observers.add(observer);
    }

    public void unregister(ObserverInterface observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ObserverInterface observer : observers) {
            observer.update(temperature);
        }
    }
}

class WeatherDisplay implements ObserverInterface {
    public void update(int temperature) {
        System.out.println("Weather Display: Temperature is " + temperature + " degrees");
    }
}