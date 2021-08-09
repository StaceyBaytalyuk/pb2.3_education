package com.stacey.education.learner;

import com.stacey.education.Person;

public class NullState implements Learner {
    public void learn(Person person) {
        System.out.println("I wanna study!");
        person.changeState(new Pupil());
    }
}
