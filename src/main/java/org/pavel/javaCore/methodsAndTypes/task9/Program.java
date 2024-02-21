package org.pavel.javaCore.methodsAndTypes.task9;

public class Program {

    public static void main(String[] args) {

        //Switch
        //Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый
        //номер дня недели и отобразить на экране то, что запланировано на этот день

        getWeekRoutine(8);

    }

    static void getWeekRoutine(int numberDay) {

        switch (numberDay) {

            case 1:
                System.out.println("Сегодня Понедельник! В первую половину дня учить Java,\n" +
                        "Во вторую половину дня отдохнуть и на пробежку");
                break;
            case 2:
                System.out.println("Сегодня вторник! Поучить Java, потом, sql, позже приготовить ужин.");
                break;
            case 3:
                System.out.println("Сегодня среда! С утра в бассейн, после обеда подучить Linux.");
                break;
            case 4:
                System.out.println("Сегодня четверг! Учим English и java.");
                break;
            case 5:
                System.out.println("Сегодня ПЯТНИЦА :) После изучения Java отдыхаем с друзьями!");
                break;
            case 6:
                System.out.println("Сегодня суббота. Спим до обеда, а дальше как пойдёт )");
                break;
            case 7:
                System.out.println("Воскресение сегодня! Строим планы на следующую неделю\n" +
                        "и не немного поиграть за компьютером.");
                break;
            default:
                System.out.println("Нет такого дня с номером недели.");
        }

    }

}
