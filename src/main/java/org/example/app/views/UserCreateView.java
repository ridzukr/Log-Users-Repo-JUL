package org.example.app.views;

import java.util.Scanner;

public class UserCreateView {

    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone in format xxx xxx-xxxx: ");
        String phone = scanner.nextLine();

        System.out.print("Enter email in format example@mail.com: ");
        String email = scanner.nextLine();

        return new String[]{name, phone, email};
    }


    public void getOutput(String output) {
        System.out.println(output);
    }
}
