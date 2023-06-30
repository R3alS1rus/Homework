package basic;

import java.util.Scanner;



public class BasicJava {
    public static void main(String[] args) {

        //Задание 1.
        System.out.println("Задание 1. начало");
        System.out.println("Введите первую строку.");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку.");
        String str2 = scanner.nextLine();

        returnNewWord(str1, str2);

        System.out.println(returnNewWord(str1, str2));
        System.out.println("Задание 1. выполнено \n");


//        Задание 2. (не получилось из-за восприятия задания по другому ...
//        ... и моя логика должна использовать if, else которые к времени задачи данного домашнего задания мы еще не проходили)
//        System.out.println("Задание 2. начало");
//        System.out.println("Введите первое число.");
//        double num1 = scanner.nextDouble();
//        System.out.println("Введите второе число.");
//        double num2 = scanner.nextDouble();
//        System.out.println("Что вы хотите сделать? \n 1 = Сложить \n 2 = Вычесть \n 3 = Умножить \n 4 = Поделить");
//        double answerWhich = scanner.nextDouble();
//        ...

        //Задание 2. с помощью решений
        System.out.println("Задание 2. начало");
        System.out.println("Введите первое число.");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число.");
        double num2 = scanner.nextDouble();
        System.out.println("Результат сложения: " + add(num1, num2));
        System.out.println("Результат вычитания: " + subtract(num1, num2));
        System.out.println("Результат умножения: " + multiply(num1, num2));
        System.out.println("Результат деления: " + divide(num1, num2));
        System.out.println("Задание 2. выполнено \n");


        //Задание 3.
        System.out.println("Задание 3. начало");
        System.out.println("Сколько евро вы хотите обменять на доллары?");
        double eur = scanner.nextDouble();
        System.out.println("Введите курс 1€ = ...$");
        double course = scanner.nextDouble();
        moneyChange(eur, course);
        System.out.println("Задание 3. выполнено \n");
    }
    //Метод для задания 1.
    public static String returnNewWord(String str1, String str2){

        int a =  str1.length();
        int aa = (a / 2);


        int b = str2.length();
        int bb = (b / 2);

        String vv = str1.substring(0, aa) + str2.substring(0, bb);
        return vv;
    }
    //Методы для задания 2.
    public static double add(double num1, double num2){

        return(num1 + num2);
    }
    public static double subtract(double num1, double num2){

        return(num1 - num2);
    }
    public static double multiply(double num1, double num2){

        return(num1 * num2);
    }
    public static double divide(double num1, double num2){

        return(num1 / num2);
    }

    //Метод для задания 3.
    public static void moneyChange(double eur, double course){
        double changeSum = eur * course;
        System.out.println("при курсе " + course + "$ за 1€, при обмене " + eur + "€, вы получите " + changeSum + "$");

    }
}
