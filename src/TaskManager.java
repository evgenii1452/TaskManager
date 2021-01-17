import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** WELCOME TO TASK MANAGER ***");
        System.out.println("Список команд:");
        showCommandList();
        String command = "";

        while (!command.equals("exit")) {
            System.out.println("Введите команду:");
            command = scanner.nextLine();

            if (command.equals("add")) {
                add();
            } else if (command.equals("remove")) {
                remove();
            } else if (command.equals("edit")) {
                edit();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("help")) {
                showCommandList();
            } else if (command.equals("generate")) {
                taskGenerator();
            } else if (command.equals("exit")) {
                System.out.println("*** GOODBYE ***");
            }
            else {
                System.out.println("Неизвестная команда");
            }
        }
    }

    public static void add() {
        System.out.println("Введите задачу:");
        String title = scanner.nextLine();
        tasks.add(title);
    }

    public static void remove() {
        System.out.println("Введите номер задачи:");
        int id = Integer.parseInt(scanner.nextLine());

        tasks.remove(id + 1);
    }

    public static void edit() {
        System.out.println("Введите номер задачи:");
        int id = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Введите новое название задачи");
        String title = scanner.nextLine();

        tasks.set(id, title);
    }

    public static void list() {
        for (int i = 1; i <= tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i - 1));
        }
    }

    public static void showCommandList() {
        System.out.println("help");
        System.out.println("list");
        System.out.println("add");
        System.out.println("edit");
        System.out.println("delete");
    }

    public static void taskGenerator() {
        System.out.println("Введите кол-во задач для генерации:");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            tasks.add("Задача номер " + i);
        }
    }
}
