import java.util.Scanner;

public class BasicJavaHomework {
    public static void main(String[] args){
        // Nr. 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выполнил: Даниэль Шультайс\n");
        System.out.println("Задание 1. проверяет, является ли введенное число положительным, отрицательным или равняется нулю.");
        System.out.print("Введите число: ");
        double enteredNumberTask1 = scanner.nextDouble();
        numberEffect(enteredNumberTask1);

        // Nr.2
        System.out.println("\nЗадание 2. определяет, является ли заданное число чётным или нечётным.");
        System.out.print("Введите число: ");
        int enteredNumberTask2 = scanner.nextInt();
        halfNumber(enteredNumberTask2);

        // Nr. 5
        System.out.println("\nЗадание 5. определяет время года (весна, лето, осень, зима) в зависимости от заданного месяца.");
        System.out.print("Введите месяц буквами: ");
        String enteredMonthTask5L = scanner.next();
        timeOfTheYear(enteredMonthTask5L);

    }

    // Nr. 1
    static void numberEffect(double enteredNumberTask1){
        if(enteredNumberTask1 > 0){
            System.out.println("Число " + enteredNumberTask1 + " является положительным.");
        } else if (enteredNumberTask1 < 0) {
            System.out.println("Число " + enteredNumberTask1 + " является отрицательным.");
        } else if (enteredNumberTask1 == 0){
            System.out.println("Число " + enteredNumberTask1 + " равно нулю.");
        } else {
            System.out.println("Что то пошло не так!");
        }


    }

    // Nr. 2
    static void halfNumber(int enteredNumberTask2){
        if (enteredNumberTask2 % 2 == 0){
            System.out.println("Число " + enteredNumberTask2 + " является чётным.");
        } else if (enteredNumberTask2 % 2 != 0) {
            System.out.println("Число " + enteredNumberTask2 + " является нечётным.");
        } else {
            System.out.println("Что то пошло не так!");
        }
    }

    // Nr. 5
    static String timeOfTheYear(String enteredMonthTask5L){
        if (enteredMonthTask5L == "декабрь"){
            System.out.println("Время года в декабре, зима.");
        } else if (enteredMonthTask5L.equalsIgnoreCase("январь")) {
            System.out.println("Время года в январе, зима.");
        } else if (enteredMonthTask5L.equalsIgnoreCase("февраль")) {
            System.out.println("Время года в феврале, зима.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("март")) {
            System.out.println("Время года в марте, весна.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("апрель")) {
            System.out.println("Время года в апреле, весна.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("май")) {
            System.out.println("Время года в мае, весна.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("июнь")) {
            System.out.println("Время года в июне, лето.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("июль")) {
            System.out.println("Время года в июле, лето.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("август")) {
            System.out.println("Время года в августе, лето.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("сентябрь")) {
            System.out.println("Время года в сентябре, осень.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("октябрь")) {
            System.out.println("Время года в октябре, осень.");
        }else if (enteredMonthTask5L.equalsIgnoreCase("ноябрь")) {
            System.out.println("Время года в ноябре, осень.");
        } else {
            System.out.println("Что то пошло не так. Скорее всего у вас была опечатка!");
        }
        return enteredMonthTask5L;
    }


}
