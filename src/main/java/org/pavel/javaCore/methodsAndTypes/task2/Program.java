package org.pavel.javaCore.methodsAndTypes.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) {

        //Написать метод, который принимает на вход значение промежутка времени в секундах.
        //Метод выводит на экран этот промежуток времени в виде часов минут и секунд, суток и недель.

        ConvertSeconds convertSeconds = new ConvertSeconds();
        System.out.println(convertSeconds.getConvertSeconds());

    }


}















