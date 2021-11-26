package com.company.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ConsoleCommands {
    Scanner s = new Scanner(System.in);
    private boolean flag = true;
    private Map<Integer, Callable<Integer>> methMap = new HashMap<>();
    private int status;

    public ConsoleCommands() {
        methMap.put(1, this::firstStepTeacher);
        methMap.put(2, this::firstStepStudent);
    }

    public int firstStep() throws Exception {
        return methMap.get(status).call();
    }

    private int firstStepTeacher() {
        int tmp = 0;
        while (flag) {
            System.out.println(
                    "0: Выход\n" +
                            "1: Вывести список студентов вашей кафедры\n" +
                            "2: Добавить нового студента\n" +
                            "3: Отчислить студента\n" +
                            "4: Перевести студента на другую кафедру\n" +
                            "5: Вывести список ваших предметов"
            );
            tmp = s.nextInt();
            if ((5 - tmp) * (tmp - 0) < 0) System.out.println("Введен неверный вариант, повторите попытку");
            else flag = false;
        }
        flag = true;
        return tmp;
    }

    private int firstStepStudent() {
        int tmp = 0;
        while (flag) {
            System.out.println(
                    "0: Выход\n" +
                            "1: Вывести номер группы\n" +
                            "2: Вывести список ваших предметов");
            tmp = s.nextInt();
            if ((tmp != 1) && (tmp != 2) && (tmp != 0))
                System.out.println("Введен неверный вариант, повторите попытку");
            else flag = false;
        }
        flag = true;
        return tmp;
    }

    public int getHumanStatus() {
        System.out.println("Университет");
        int status = -1;
        while (flag) {
            System.out.println("Вы преподаватель?\n" + "1. Да\n" + "2. Нет, я студент");
            status = s.nextInt();
            if ((status != 1) && (status != 2)) System.out.println("Введен неверный вариант, повторите попытку");
            else flag = false;
        }
        flag = true;
        this.status = status;
        return status;
    }


}

