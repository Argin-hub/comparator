import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        User user = new User("Андрей", 19, "andryha@mail.ru");
        User user2 = new User("Олег", 25, "oleg@mail.ru");
        User user3 = new User("Андрей", 24,"opr@google.com");
        User user4 = new User("Игорь", 16, "igor@mail.ru");
        User user5 = new User("Андрей", 44,"stary@google.com");
        List<User> list = new ArrayList<>();

        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        System.out.println("-------до сортировки--------");
        for (User u : list) {
            System.out.println(u);
        }
        System.out.println("-------после сортировки-----");
        Collections.sort(list);
        for (User u : list) {
            System.out.println(u);
        }
    }
    }


