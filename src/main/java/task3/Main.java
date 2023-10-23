package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
В рамках выполнения задачи необходимо:
● Создайте телефонный справочник с помощью Map - телефон это ключ, а имя
значение
● Найдите человека с самым маленьким номером телефона
● Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(1235, "AUser1");
        phoneBook.put(1234, "BUser2");
        phoneBook.put(1236, "CUser3");
        phoneBook.put(1237, "GUser4");
        phoneBook.put(1238, "DUser5");
        phoneBook.put(1239, "FUser6");

        Integer minNumber = 9999;
        for (Integer number : phoneBook.keySet()) {
            if (number < minNumber) minNumber = number;
        }
        System.out.println(minNumber);

        List<Map.Entry<Integer, String>> names = new ArrayList<>(phoneBook.entrySet());
        names.sort(Map.Entry.comparingByValue());
        System.out.println(names.get(names.size() - 1).getKey());

    }
}
