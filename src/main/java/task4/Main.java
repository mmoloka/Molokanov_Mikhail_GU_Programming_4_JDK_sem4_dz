package task4;

/*
Задание 1. Создать справочник сотрудников
Необходимо:
● Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен
 иметь следующие атрибуты:
    ○ Табельный номер
    ○ Номер телефона
    ○ Имя
    ○ Стаж
● Добавить метод, который ищет сотрудника по стажу(может быть список)
● Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
● Добавить метод, который ищет сотрудника по табельному номеру
● Добавить метод добавление нового сотрудника в справочник
 */
public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.add(new Employee(1000, "89000000000", "Ivan", 10));
        directory.add(new Employee(1001, "89000000001", "Oleg", 5));
        directory.add(new Employee(1002, "89000000002", "Aleksandr", 2));
        directory.add(new Employee(1003, "89000000003", "Olga", 11));
        directory.add(new Employee(1004, "89000000004", "Aleksandr", 4));
        directory.add(new Employee(1005, "89000000005", "Anastasiya", 9));
        directory.add(new Employee(1006, "89000000006", "Svetlana", 1));
        directory.add(new Employee(1007, "89000000007", "Maksim", 18));
        directory.add(new Employee(1008, "89000000008", "Kseniya", 15));
        directory.add(new Employee(1009, "89000000009", "Fedor", 5));

        System.out.println(directory.getEmployeeByExperience(5));
        System.out.println(directory.getPhoneByName("Aleksandr"));
        System.out.println(directory.getEmployeeById(1007));
    }
}
