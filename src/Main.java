import javax.print.attribute.standard.Sides;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  System.out.println("Переменные и типы данных");

       /* int age = 30;
        System.out.println("Age:" + age);
        age = 12;
        System.out.println(age);*/

     /*   byte age = 19;
        byte ot -128 do 127 - 1 bajt
        short ot -32768 do 32767 - 2 bajta
        int ot -2147483648 do 2147483647 - 4 bajta
        long ot -9 223 372 036 854 775 808 do 9 223 372 036 854 775 807 - 8 bajt. */

        /*float z_tochkoj = 4.4095904588f;
        double bilshe_niz_w_float = 5.43858437683935949453;

        char symbol = 'T'; // ne mozna pysat w ""
        String nabor_symbol = "#$@%^6"; // Ne mozna pysat w ''

        boolean odne_z_dwoch = true; //abo false*/

       /* Scanner in = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String user_name = in.nextLine();
        System.out.println("Привіт, " + user_name

        int n1 = in.nextInt();
        byte n2 = in.nextByte();
        boolean n3 = in.nextBoolean();
        float n4 = in.nextFloat(); */

/* Scanner in = new Scanner(System.in);

        System.out.print("Впишіть 1 число: ");
        float x = in.nextFloat();

        System.out.print("Впишіть 2 число: ");
        float y = in.nextFloat();

        float rez1 = x + y;
        float rez2 = x - y;
        float rez3 = x * y;
        float rez4 = x / y;

        System.out.println("Відповідь: ");
        System.out.println(rez1 + "\n" + rez2 + "\n" + rez3 + "\n" + rez4);
*/


        // Условні конструкції if-else
        /*int a = 13, b = 10;
        boolean isHasCar = true;
       //if(isHasCar) {
        if(isHasCar || a == b) {
            System.out.println("Да, верно");
        } else if (a >= b) {
            System.out.println("Second test");
        } else if (a > b) {
            System.out.println("3 test");
        } else if (a <= b) {
            System.out.println("4 test");
        } else if (a == b) {
            System.out.println("5 test");
        } else  { System.out.println("Нет, не верно"); }*/

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Впишіть роль: ");
        String role = scanner.nextLine();
        System.out.print("Впишіть пароль: ");
        String password = scanner.nextLine();
        if (role.equals("Admin") && password.equals("12345"))
            System.out.println("Всі користувачі");
          else {
            System.out.println("Привіт, як вас звати? ");
            String name = scanner.nextLine();
        }*/


        //Условні конструкции switch-case
       /* Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 10:
                System.out.println("Number is 10");
                break;
                default:
                    System.out.println("Default");
                    break;
        }*/

       /* Scanner in = new Scanner(System.in);
        System.out.print("Впишіть число 1: ");
        int num1 = in.nextInt();

        System.out.print("Впишіть число 2: ");
        int num2 = in.nextInt();

        int res;

        System.out.print("Дія: ");
        String s = in.nextLine();
        s = in.nextLine();

        switch (s) {
            case "+":
                res = num1 + num2;
                System.out.println("Відповідь: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Відповідь: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Відповідь: " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("Error");
                else{
                res = num1 / num2;
                    System.out.println("Відповідь: " + res);}
                break;
            default:
                System.out.println("Ви щось не правильно вписали");
        }*/


        // Цикли
        //for(float i = 100; i > 5; i /= 2) {
        //   System.out.println("Element: " + i);}

       /* int i = 0;
        while (i <= 10) {
            System.out.println("Element: " + i);
            i++;
        }*/


       /* int i = 0;
        do {
            System.out.println("Element: " + i);
            i++;
        } while (i <= 10);*/


        // Оператори в циклах break i continue
        /*for(int i = 5; i < 25; i += 2) {
            if(i % 3 == 0)
                continue;
            if(i > 17)
                break;
            System.out.println("Element: " + i);
        }*/


        //       Массивы данных

      /*  int[] nums = new int[10];
        nums[0] = 15;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;
        int res = nums[2] + nums[3];
        System.out.println(res);

        float[] nums2 = new float[] {5.0f, 6.45f, 34.5232f};
        System.out.println(nums2[1]);

        for(int i = 0; i < nums2.length; i++) {
            System.out.println("Element: " + nums2[i]);
        }*/



        /*       int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            System.out.print("Wpisz liczbe: ");
            int val = sc.nextInt();
            arr[i] = val;
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimum: " + min);*/

        // Многомерные массивы данных
      /*  char[][] syms = new char[4][4];
        syms[0][0] = 'V';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][]{
                {5, 7},
                {13, 8},
                {45, 4},
        };
        nums[1][1] = 30;
        System.out.println(nums[1][1]);*/


        // Колекции в Java
   /*     ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(13);
        numbers.add(1, 30);

     //   System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        numbers.remove(1);
     //   numbers.clear();
        for (Integer el : numbers) {
            System.out.println(el);
        }
        */


    /*    LinkedList<Float> num = new LinkedList<>();

        num.add(5.6f);
        num.add(3.0f);
        num.add(5.0f);
        num.add(5.3f);

        for(Float el : num);
        System.out.println(num);

     */
//    InfoDate("Hello");
//    String java = "Java";
//    InfoDate(java);
//    InfoDate("");

//    short num = 7;
//    int result1 = Summa((short) 5, num);
//
//
//    short num2 = 10;
//    int rezult2 = Summa((short) 5, num2);
//    InfoDate(String.valueOf(rezult2));


        // Методы в Java

//    public static int Summa(short a, short b) {
//        int res = a + b;
//        String result = "Result: " + res;
//        InfoDate(result);
//        return res;
//    }
//    public static void InfoDate(String word) {
//        System.out.print(word);
//        System.out.println("!");
//    }

    byte[] numws1 = new byte[] {5, 10, 32, 1, 4};
    int sum1 = SummaArray(numws1);
    System.out.println("Summa 1: " + sum1);

    byte[] numws2 = new byte[] {5, 10, 32, 1, 4, 3, 13, 34, 2};
    int sum2 = SummaArray(numws2);
    System.out.println("Summa 2: " + sum2);
    }
    public static int SummaArray(byte[] array){
        int sum = 0;
        for(byte i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
}
