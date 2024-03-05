package org.pavel.OOP.task5;

import java.util.Scanner;

public enum Weather {
    WINTER("Зима", 90), SPRING("Веснa", 92),
    SUMMER("Лето", 90), AUTUMN("Осень", 90);

    private final String description;
    private final int countOfDays;
    private static final Scanner scanner = new Scanner(System.in);

    Weather(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public static void getWeatherDescription() {
        System.out.println("Введите время года: WINTER, SPRING, SUMMER, AUTUMN");
        String res = scanner.nextLine();
        Weather weather = Weather.valueOf(res.toUpperCase());

        if (weather == Weather.valueOf("WINTER")) {
            System.out.println(SPRING + " " + Weather.SPRING.description + " " + Weather.SPRING.countOfDays);
        } else if (weather == Weather.valueOf("SPRING")) {
            System.out.println(SUMMER + " " + Weather.SUMMER.description + " " + Weather.SUMMER.countOfDays);
        } else if (weather == Weather.valueOf("SUMMER")) {
            System.out.println(AUTUMN + " " + Weather.WINTER.description + " " + Weather.AUTUMN.countOfDays);
        } else {
            System.out.println(WINTER + " " + Weather.WINTER.description + " " + Weather.WINTER.countOfDays);
        }
    }
    public static void getWeather() {
        for (Weather weather : Weather.values()) {
            System.out.println(weather);
        }
    }
}
