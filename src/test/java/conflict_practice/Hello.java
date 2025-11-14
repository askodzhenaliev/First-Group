package conflict_practice;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        greetings();
        for (int i = 0; i < 5; i++) {
            System.out.println("New changes");
        }
    }

    public static void createForLoop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }

    public static void greetings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + " how are you doing!");
        System.out.println("Hello conflict solvers");
    }

    public static void merge() {
        System.out.println("HEllo world");
    }
}
