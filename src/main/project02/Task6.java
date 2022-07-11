package main.project02;

import java.util.Scanner;

class Registration {
    private String email;
    private String username;
    private String password;

    Scanner scanner = new Scanner(System.in);

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        String email;
        do {
            System.out.println("Input email:");
            email = scanner.nextLine();
            if (email.contains("yahoo")) {
                this.email = email;
            } else {
                System.out.println("Email is not valid");
            }
        } while (!email.contains("yahoo"));

    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        String username;
        do {
            System.out.println("Input username:");
            username = scanner.nextLine();
            if (username.length() > 6) {
                this.username = username;
            } else {
                System.out.println("Username is not valid");
            }
        } while (username.length() <= 6);
    }

    public void setPassword() {
        String password;
        do {
            System.out.println("Input password:");
            password = scanner.nextLine();
            if (password.length() > 6 && !password.contains(this.username)) {
                this.password = password;
            } else {
                System.out.println("Password is not valid");
            }
        } while (password.length() <= 6 || password.contains(this.username));

    }

    public String getPassword() {
        return password;
    }
}

class Task6 {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail();
        registration.setUsername();
        registration.setPassword();
        System.out.println(registration.getEmail());
        System.out.println(registration.getUsername());
        System.out.println(registration.getPassword());
    }
}
