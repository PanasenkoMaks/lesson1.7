package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        task3();
        task2();
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullNam = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullNam);
    }

    public static void task2() {
        System.out.println("Taks 2");
        String fullNam = "Ivanov Ivan Ivanovich";
        String fullNam1 = fullNam.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNam1);
    }
    public static void task3(){
        System.out.println("Task 3");
        String fullName = "Иванов Семён Семёнович";
        char[] c = fullName.toCharArray();
        for (int i = 0; i < c.length; i++){
            if (c[i] == 'ё'){
                c[i] = 'е';
            }
        }
        System.out.println(c);
        //String c = fullName.replace('ё', 'е');
        //System.out.println(c);
    }
}
