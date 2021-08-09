package com.stacey.education;

public class NullState implements Learner {
    public void learn(Person person) {
        System.out.println("I wanna study!");
        person.changeState(new Pupil());
    }
}
