package org.pavel.classesAndObjects.task1;

/**
 * -- Создайте класс Phone, который содержит поля number, model и weight
 * -- Создайте три объекта (экземпляра) этого класса.
 * -- Выведите в консоль значения полей объектов.
 * -- Добавьте в класс Phone методы:
 *    receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”.
 *    getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов
 * -- Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер
 *    телефона звонящего. Вызвать этот метод.
 * -- Создать метод sendMessage с входным параметром - массив номеров телефонов, которым надо отправить сообщение.
 *   Метод выводит на консоль номера этих телефонов.
 */
public class Program {

    public static void main(String[] args) {
        Phone phone1 = new Phone("+798888", "Apple 6s", 10);
        Phone phone2 = new Phone();
        phone2.setNumber("+189655");
        phone2.setModel("Samsung A10");
        phone2.setWeight(15);
        Phone phone3 = new Phone("+8965572", "Nocia", 20);
        System.out.println();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();
        System.out.println(phone1.receiveCall() + phone1.getNumber());
        System.out.println(phone2.receiveCall() + phone2.getNumber());
        System.out.println(phone3.receiveCall() + phone3.getNumber());
        System.out.println();
        System.out.println(phone1.receiveCall("Pavel", "+9632145"));
        System.out.println(phone2.receiveCall("Ira", "4569988472"));
        System.out.println(phone3.receiveCall("Misha", "85220"));
        System.out.println();
        System.out.println(phone1.sendMessage(phone1.getNumber()));
        System.out.println(phone2.sendMessage(phone2.getNumber()));
        System.out.println(phone3.sendMessage(phone3.getNumber()));

    }
}
