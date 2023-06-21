import java.util.Scanner;
// работы выполнил Даниэль Шультайс
public class LessonThreeHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cколько коробок вы хотите отправить?");
        int howManyBoxes = scanner.nextInt();

        System.out.println("Cколько весит каждая коробка в килограммах?");
        double boxWeight = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите имя и фамилию получателя посылки через пробел.");
        String receiverName = scanner1.nextLine();

        System.out.println("Введите адрес получателя посылки.");
        String receiverAddress = scanner1.nextLine();

        System.out.println("\n Проверка информации...\n");

        System.out.println("Получатель: " + "\"" + receiverName.toUpperCase() + "\"");
        System.out.println("Адрес получателя: " + receiverAddress.toUpperCase());
        System.out.println("Вес посылки: " + howManyBoxes * boxWeight + "\n");

        System.out.println("Все верно? True/False");
        Scanner scanner2 = new Scanner(System.in);
        boolean boolean1 = scanner2.nextBoolean();








    }


}