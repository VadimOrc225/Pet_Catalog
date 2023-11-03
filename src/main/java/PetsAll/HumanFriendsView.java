package PetsAll;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class HumanFriendsView {     // View   задает интерфейс
    Scanner iScanner = new Scanner(System.in);

    public char getInputOperator() {
        System.out.println("Что Вы хотите? (Добавить животное - введите 1; Вывести список животных по дате рождения -" +
                " введите 2; Найти животное - введите 3; Вывести количество всех животных в реестре - введите 4 ");
        char op = iScanner.next().charAt(0);
        String s = "12349";
        if (s.indexOf(op) == -1) {            // проверка на ввод правильного символа операции
            System.out.println("Ввод неверный.Повторите ввод");
            getInputOperator();
        }
        return op;
    }

    public String getInputId() {
        System.out.println("Введите id животного");
        String Id = iScanner.next();
        return Id;
    }

    public String getInputName() {
        System.out.println("Введите имя животного");
        String name = iScanner.next();
        return name;
    }

    public LocalDate getInputBirthDate() {
        System.out.println("Введите дату рождения в формате гггг-мм-чч ");
        LocalDate birthDate = LocalDate.ofEpochDay(3000- 1 - 1);
        try {
            birthDate = LocalDate.parse(iScanner.next());
            return birthDate;
        } catch (DateTimeParseException ex) {
            ex.printStackTrace();
            getInputBirthDate();
            return birthDate;
        }

    }
    public ArrayList<String> getInputCommands() {
        String c = iScanner.nextLine();
        System.out.println("Введите команды, которые знает животное, через запятую ");
        ArrayList<String> commands = new ArrayList<>();
        c = iScanner.nextLine();
        for (String s : c.split(",")){
            commands.add(s);
        }
        return commands;
    }

    public String getInputNewCommand() {
        System.out.println("Введите команду, которой обучат животное");
        String c = iScanner.next();
        return c;

    }

    public void displayQuantity(int counter) {
        System.out.printf("Общее количество всех животных в реестре: %d\n", counter);
       }

    public char getInputAction() {
        System.out.println("Что Вы хотите? (Добавить новую команду - введите 1; Удалить животное из реестра - введите 2;" +
                " Выход - 9");
        char op2 = iScanner.next().charAt(0);
        String s = "129";
        if (s.indexOf(op2) == -1) {            // проверка на ввод правильного знака операции
            System.out.println("Ввод неверный.Повторите ввод");
            getInputAction();
        }
        return op2;
    }
    public char getInputPetClass() {
        System.out.println("Какое животное вы добавляете? (Собака - введите 1; Кошка - введите 2;" +
                " Хомяк - введите 3; Лошадь - введите 4; Осел - введите 5; Верблюд - введите 6; Выход - 9 ");
        char op3 = iScanner.next().charAt(0);
        String s = "1234569";
        if (s.indexOf(op3) == -1) {            // проверка на ввод правильного знака операции
            System.out.println("Ввод неверный.Повторите ввод");
            getInputAction();
        }
        return op3;
    }
    public void greetingWord() {
        System.out.println("Такого животного не найдено ");
    }

}
