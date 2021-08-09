package com.stacey.education;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Person person = new Person();
        for (int i = 0; i < 6; i++) {
            person.learn();
        }
    }
}
