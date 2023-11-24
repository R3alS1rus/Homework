package src.on_lesson;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class newRequest {
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt();

        IntSupplier intSupplier = () -> random.nextInt();
        System.out.println(intSupplier.getAsInt());

        Random random1 = new Random();
        double a = random.nextDouble();

        DoubleSupplier doubleSupplier = () -> random.nextDouble();
        System.out.println(doubleSupplier.getAsDouble());


    }
}
