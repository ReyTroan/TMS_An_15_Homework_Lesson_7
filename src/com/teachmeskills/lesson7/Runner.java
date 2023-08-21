package com.teachmeskills.lesson7;


public class Runner {
    public static void main(String[] args) {
        Phone phone1 = new Phone(447793915, "Model1", 0.8);
        Phone phone2 = new Phone(292750317, "Model2");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println("Phone1: " + phone1.getNumber());
        System.out.println("Phone2: " + phone2.getNumber());
        System.out.println("Phone3: " + phone3.getNumber());


        phone1.receiveCall("Andrey");
        phone2.receiveCall("Inna", 292343345);
        phone3.receiveCall("Rey", 256787907);

        phone1.sendMessage(254567453, 294563455, 447796745);
    }
}
