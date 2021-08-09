package com.stacey.education.learner;

import com.stacey.education.Person;

public class Student implements Learner {
    public void learn(Person person) {
        System.out.println("I'm studying at university");
        person.changeState(new Graduate());
    }
}
