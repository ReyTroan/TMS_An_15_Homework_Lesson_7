package com.teachmeskills.lesson7;

/**
 * Реализовал метод receiveCall для вывода имени звонящего;
 * Реализовал метод getNumber, который возвращает номер телефона;
 * Добавить конструктор в класс Phone, который принимает на вход три/два/без параметров
 * для инициализации переменных класса;
 * Добавил перегруженный метод receiveCall, который принимает два
 * параметра - имя звонящего и номер телефона звонящего;
 * Создал метод sendMessage. Данный метод принимает на вход номера телефонов, которым будет отправлено
 * сообщение. Метод выводит на консоль номера этих телефонов;
 */
public class Phone {
     private int number = 11111111;
     private String model = "Model";
     private double weight = 8;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int callNumber) {
        System.out.println("Звонит " + name + ", номер телефона звонящего: " + callNumber);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(int... numbers) {
        System.out.println("Сообщения отправляются на следующие номера:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone: [" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ']';
    }
}
