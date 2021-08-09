package com.stacey.education;

import com.stacey.education.learner.Learner;
import com.stacey.education.learner.NullState;

public class Person {
    private Learner currentState;

    public Person() {
        currentState = new NullState();
    }

    public void changeState(Learner learner) {
        currentState = learner;
    }

    public void learn() {
        currentState.learn(this);
    }
}
