//Задание выполнил Daniel Schultais
//Note: Были проблемы с первыми двумя заданиями, справился с помощью подсказок.

package basic;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        // Nr 1.
        System.out.println(canWalk(true, false));

        // Nr 2.
        canBuy(true, true);

        //Nr 3.
        System.out.println(isWorkingCorrect(115, 97));

        //Nr *.
        timeLeft(1670);
    }




    //Nr 1.
    static boolean canWalk(boolean isWeekend, boolean isRain){
        boolean canWalk = isWeekend && !isRain;
        return canWalk;
    }

    //Nr 2.
    static void canBuy(boolean isEdekaOpen, boolean isReweOpen){
        boolean canBuy = (isEdekaOpen || isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);;
    }

    //Nr 3.
    static boolean isWorkingCorrect(double temperature1, double temperature2){
        boolean isWorkingCorrect = (temperature1 > 100 && temperature2 < 100);
        return isWorkingCorrect;
    }

    //Nr *.
    static void timeLeft(int n){
        int timeLeft = n;
        System.out.println("Осталось " + timeLeft + " секунд/a/ы.");
        int timeLeftHours = n / 60;
        System.out.println("Осталось " + timeLeftHours + " час/а/ов.");
    }
}
