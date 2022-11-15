import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Main mn =  new Main();
//        mn.task1();
//        mn.task2();
//        mn.task3();
//        mn.task4();
//        mn.task5();
        mn.task6();

    }
    public void task1(){
        //1.Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.println("Введите число n:");
        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        Main main = new Main();
        System.out.println("сумма чисел от 1 до n равна: " + main.Sum(n));
        System.out.println();
        System.out.println("Введите число m:");
        int m = iScanner.nextInt();
        System.out.printf("произведение чисел от 1 до m равна: " + main.mult(m));
        iScanner.close();
        }
        int Sum (int n){
            int sum = 0;
            for (int  i = 1; i <= n; i++) {
                sum = sum + i;
            }
            return sum;
        }
        int mult (int m){
            int mult = 1;
            for (int  i = 1; i <= m; i++) {
                mult = mult * i;
            }
            return mult;
        }

    public void task2() {
//2.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        System.out.println("Введите число a:");
        Scanner iScanner = new Scanner(System.in);
        int a = iScanner.nextInt();
        System.out.println("Введите число b:");
        int b = iScanner.nextInt();
        iScanner.close();
        System.out.println(a+b>=10 && a+b<=20? true:false);
    }

    public void task3(){
//3.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        System.out.println("Введите число:");
        Scanner iScanner = new Scanner(System.in);
        int z = iScanner.nextInt();
        iScanner.close();
        System.out.println(z>=0? "положительное":"отрицательное");

    }

    public void task4(){
//4.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println("Введите число:");
        Scanner iScanner = new Scanner(System.in);
        int z = iScanner.nextInt();
        iScanner.close();
        System.out.println(z>=0? false:true);
    }

    public void task5(){
//5.Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
        System.out.println("ведите строку для повтора:");
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        System.out.println("Введите число:");
        int k = iScanner.nextInt();
        Main main = new Main();
        main.string(k,str);
        iScanner.close();
    }
    void string (int k, String stri){
        for (int i = 0; i < k; i++) {
            System.out.println(stri);
        }

    }

    public void task6() {
//7.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
        String array1 = Arrays.toString(array);
        System.out.println(array1);
    }
}

