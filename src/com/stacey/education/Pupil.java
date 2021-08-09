package com.stacey.education;

public class Pupil implements Learner {
    public void learn(Person person) {
        System.out.println("I'm studying at school");
        person.changeState(new Student());
    }
}
