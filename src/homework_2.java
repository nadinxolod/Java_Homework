import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите значение строки:");
        String str = iScan.nextLine();
        homework_2 hw = new homework_2();
        hw.palindrom(str);
        System.out.println(hw.palindrom(str));
    }

    public boolean palindrom (String str) {
        String rts = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rts += str.charAt(i);
        }
        if (rts.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

}
