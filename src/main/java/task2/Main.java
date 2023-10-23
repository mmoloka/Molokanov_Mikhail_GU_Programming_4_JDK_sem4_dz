package task2;

/*В рамках выполнения задачи необходимо:
● Создайте коллекцию мужских и женских имен с помощью интерфейса List -
добавьте повторяющиеся значения
● Получите уникальный список Set на основании List
● Определите наименьший элемент (алфавитный порядок)
● Определите наибольший элемент (по количеству букв в слове но в обратном
порядке)
● Удалите все элементы содержащие букву ‘A’
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Алексей");
        names.add("Иван");
        names.add("Иван");
        names.add("Олег");
        names.add("Максим");
        names.add("Анна");
        names.add("Анна");
        names.add("Ольга");
        names.add("Ольга");
        names.add("Ксения");
        names.add("Анастасия");
        names.add("Светлана");
        System.out.println(names);

        Set<String> setNames = new HashSet<>(names);
        System.out.println(setNames);

        names.sort(null);
        System.out.println(names.get(0));

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return -1;
                else if (o1.length() < o2.length()) return 1;
                return 0;
            }
        });
        System.out.println(names.get(names.size() - 1));

        List<String> names2 = new ArrayList<>();
        for (String name : names) {
            if (!name.contains("А") && !name.contains("а")) names2.add(name);
        }
        System.out.println(names2);
    }
}
