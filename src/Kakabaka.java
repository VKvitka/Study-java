import java.util.Random;
import java.util.Scanner;

public class Kakabaka {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        System.out.print("Згенеровані числа: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100) + 1;
            System.out.print(numbers[i] + " ");
        }

        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];


        for(int i = 1; i < numbers.length; i++){
            sum += numbers[i];
            if(numbers[i] > max) {max = numbers[i];}
            if(numbers[i] < min) {min = numbers[i];}
        }

        int avg = sum / 10;

        System.out.println("\nСумма чисел: " + sum);
        System.out.println("Середнє значення: " + avg);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
