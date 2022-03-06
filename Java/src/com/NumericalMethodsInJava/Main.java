package com.NumericalMethodsInJava;

import com.NumericalMethodsInJava.Objects.Function;

public class Main {

    public static void main(String[] args) {
        Double num = 5.0;
        Function temp = new Function((Double val)->{ val = val +1; });
        temp.evaluate(num);
        System.out.println(num);
    }
}
