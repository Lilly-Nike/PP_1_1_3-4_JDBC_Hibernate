package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Lilly", "Nikulina", (byte) 32);
        System.out.println("User с именем – Lilly добавлен в базу данных");
        userService.saveUser("Dima", "Nikulin", (byte) 33);
        System.out.println("User с именем – Dima добавлен в базу данных");
        userService.saveUser("Alex", "Nikulina", (byte) 4);
        System.out.println("User с именем – Alex добавлен в базу данных");
        userService.saveUser("Bony", "Dog", (byte) 7);
        System.out.println("User с именем – Bony добавлен в базу данных");

        List<User> userList = userService.getAllUsers();
        userList.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
