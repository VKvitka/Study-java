import java.util.Scanner;

public class Statistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Запишіть кількість студентів: ");
        int students = sc.nextInt();
        sc.nextLine();

        int[] array = new int[students];

        for (int i = 0; i < students; i++) {
            System.out.print("Запишіть оцінку для студента " + (i + 1) + ": ");
            array[i] = sc.nextInt();

            while (array[i] < 0 || array[i] > 100) {

                if (array[i] > 100) {
                    System.out.println("Error: Оцінка завелика");

                } else if (array[i] < 0) {
                    System.out.println("Error: Оцінка замала");
                } else ;

                System.out.print("Запишіть оцінку ще раз: ");
                array[i] = sc.nextInt();
            }
        }

        int average = Average(array);
        System.out.println("Середня оцінка студентів: " + average );

        int min = Min(array);
        int max = Max(array);
        System.out.println("Мінімальна оцінка: " + min + ", Максимальна оцінка: " + max + ".");

        int zdano = Zdano(array);
        System.out.println("Кількість студентів здавших екзамен: " + zdano);
    }

    public static int Average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int Min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        } return min;
    }
    static int Max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        } return max;
    }
    static int Zdano(int[] array) {
        int zdano = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 50) {
                zdano++;
            }
        } return zdano;
    }
}
