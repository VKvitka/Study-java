import java.lang.Math;
import java.util.Random;

public class Stulec {
    public static void main(String[] args) {
        //Лист 3 позиції
        //3 рандомні числа з 1000000
        //повинні ділиться на 3
        //найти суму цих чисел
        //тангенс котагненс
        //якшо тангенс < 3 мусить висвітиться депорт
        //Од 3 до 4.5 Вчись лісапед
        //Якшо 5 - песня
        //Якшо більше 5 - Молодець!
        Random rand = new Random();
        int[] stul = new int[3];
        System.out.print("Згенеровані числа: ");
        for (int i = 0; i < stul.length; i++) {
            stul[i] = rand.nextInt(1000000);
            System.out.print(stul[i] + " ");
            while (stul[i] < 3) {
                stul[i] = rand.nextInt(1000000);
                if (stul[i] % 3 == 0) {
                    System.out.print(stul[i] + " ");
                }
            }
        }
        int sum = stul[0];
        for (int i = 1; i < stul.length; i++) {
            sum += stul[i];
        }
        System.out.println("\nСумма чисел: " + sum);

        System.out.println("Тригонометричні значення:");
        for (int num : stul) {
            double radians = Math.toRadians(num);
            double tan = Math.tan(radians);

            System.out.printf("Число: %d -> tan = %.2f", num, tan);

            if (tan != 0) {
                double cot = 1.0 / tan;
                System.out.printf(", cot = %.2f, ", cot);
            } else {
                System.out.println(", cot не визначений(ділення на 0)");
            }
            if (tan >= 3 && tan <= 4.5) {
                System.out.println("Вчись лісапед.");
            } else if (tan < 3) {
                System.out.println("ДЕПОРТ.");
            } else if (tan == 5) {
                System.out.println("Песня.");
            } else {
                System.out.println("Молодець!");}
        }
    }
}

