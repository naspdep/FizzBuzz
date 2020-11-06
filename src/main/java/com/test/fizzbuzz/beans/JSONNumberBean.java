package com.test.fizzbuzz.beans;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class JSONNumberBean implements Serializable {
    private int number;

    public JSONNumberBean() {}

    public int getNumber() {
        return number;
    }

    public void setNumber(int num) {
        number = num;
    }
}
