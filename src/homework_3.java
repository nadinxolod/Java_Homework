import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homework_3 {
//    public static void main(String[] args) {
////1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//        List<Integer> spisok = new ArrayList<>();
//        homework_3 hw = new homework_3();
////        hw.FillList(spisok);
////        hw.Chet(spisok);
////        hw.MinMaxAverage(spisok);
//    }

    public List<Integer> FillList(List<Integer> Sp) {
        System.out.println("Введите длину списка");
        Scanner iScaner = new Scanner(System.in);
        int len = iScaner.nextInt();
        for (int i = 0; i < len; i++) {
            Sp.add(iScaner.nextInt());
        }
        System.out.println("vot takoi spisok polushilsya: " + Sp);
        iScaner.close();
        return Sp;
    }

    public void Chet(List<Integer> Sp) {
        for (int i = 0; i < Sp.size(); i++) {
            if (Sp.get(i) % 2 == 0) Sp.remove(i);
        }
        System.out.println("vot spisok bez chetnih chisel");
        System.out.println(Sp);
    }

    //    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public void MinMaxAverage(List<Integer> Sp) {
        int min = Sp.get(0);
        int max = Sp.get(0);
        double average = Sp.get(0);
        for (int i = 1; i < Sp.size(); i++) {
            if (min > Sp.get(i)) min = Sp.get(i);
            if (max < Sp.get(i)) max = Sp.get(i);
            average += Sp.get(i);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(average / Sp.size());
    }
}


