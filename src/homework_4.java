import java.util.*;

public class homework_4 {
    public static void main(String[] args) {
//        0.1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
//        0.2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
        homework_4 mn =  new homework_4();
        Scanner iScanner = new Scanner(System.in);
//        int [] array = new int [5];
//        for (int i = 0; i < array.length; i++) {
//            array [i] = iScanner.nextInt();
//        }


        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            list.add(iScanner.nextInt());
        }

//        Stack<Integer> stack = mn.addStack(array);
//        Queue<Integer> queue = mn.addQueue(array);
        System.out.println(list);
        List<Integer> reverse = mn.reverse(list);

//        queue.poll();stack.pop();

//        System.out.println(stack);
//        System.out.println(queue);

        System.out.println(reverse);
    }
     public Stack<Integer> addStack(int[] array1){
         Stack<Integer> stack = new Stack<>();
         for (int i = 0; i < array1.length; i++) {
             stack.add(array1[i]);
         }
         return stack;
     }

    public Queue<Integer> addQueue(int[] array2){
        Queue<Integer> queue = new ArrayDeque<>() {
        };
        for (int i = 0; i < array2.length; i++) {
            queue.add(array2[i]);
        }
        return queue;
   }

    //1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    public List<Integer> reverse (LinkedList<Integer> source){
         List<Integer> reverse1 = new LinkedList<>();
        while (source.size() !=0) {
            reverse1.add(source.pollLast());
        }
        return reverse1;
    }

}
