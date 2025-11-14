package conflict_practice;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name + " how are you doing!");

        for (int i = 0; i < 10; i++) {
            System.out.println("This is feature/conflict branch");
            System.out.println("we will try to merge it !");
        }

    }
}
