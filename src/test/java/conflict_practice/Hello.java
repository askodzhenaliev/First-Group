package conflict_practice;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        method();
        greetings();
    }

    public static void method() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is feature/conflict branch");
            System.out.println("we will try to merge it !");
        }
    }

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + " how are you doing!");
    }

    public static void getUserLastname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your lastname: ");
        String lastname = scanner.next();
        System.out.println("your lastname: " + lastname);
    }


}
