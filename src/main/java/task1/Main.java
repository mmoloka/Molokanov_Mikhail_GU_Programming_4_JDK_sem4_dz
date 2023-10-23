package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
В рамках выполнения задачи необходимо:
● Создайте коллекцию мужских и женских имен с помощью интерфейса List
● Отсортируйте коллекцию в алфавитном порядке
● Отсортируйте коллекцию по количеству букв в слове
● Разверните коллекцию
 */
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Алексей");
        names.add("Иван");
        names.add("Олег");
        names.add("Максим");
        names.add("Анна");
        names.add("Ольга");
        names.add("Ксения");
        names.add("Анастасия");
        names.add("Светлана");

        names.sort(null);
        System.out.println(names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() < o2.length()) return -1;
                return 0;
            }
        });
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);
    }
}
