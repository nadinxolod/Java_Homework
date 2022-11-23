//import java.io.*;
//import java.lang.reflect.Field;
//import java.util.*;
//
////3.* Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//public class PhoneBook {
//    Map<String,String> book = new LinkedHashMap<>();
//    public static void main(String[] args) {
//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.add("John", "33344");
//        phoneBook.add("Peter", "344");
//        phoneBook.add("Philipp", "344");
//        phoneBook.add("Philipp", "122");
//        System.out.println(phoneBook.book);
//        List<String> strings = phoneBook.get("Philipp");
//        System.out.println(strings);
//    }
//    public void add(String number, String name) {
//        book.put(number, name);
//    }
//
//    public List<String> get(String name) {
//
//        return null;
//    }
//}
