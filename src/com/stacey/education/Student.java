package com.stacey.education;

public class Student implements Learner {
    public void learn(Person person) {
        System.out.println("I'm studying at university");
        person.changeState(new Graduate());
    }
}
