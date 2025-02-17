import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Впишіть 1 число: ");
        int num1 = sc.nextInt();

        System.out.println("Впишіть 2 число: ");
        int num2 = sc.nextInt();


        int result;

        System.out.println("Дія: ");
        String d = sc.nextLine();
        d = sc.nextLine();

        if (d.equals("+")) {
            result = num1 + num2;
            System.out.println("Відповідь: " + result);
        } else if (d.equals("-")) {
            result = num1 - num2;
            System.out.println("Відповідь: " + result);
        } else if (d.equals("*")) {
            result = num1 * num2;
            System.out.println("Відповідь: " + result);
        } else if (d.equals("/")) {
            if (num2 == 0) {
                System.out.println("Іди нахуй, на 0 не ділиться");
            }
            ;
            result = num1 / num2;
            System.out.println("Відповідь: " + result);
        }


    }
}

