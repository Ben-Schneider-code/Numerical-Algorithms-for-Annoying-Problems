package com.NumericalMethodsInJava;

import com.NumericalMethodsInJava.Approximation.SqrtApproximation;

import com.NumericalMethodsInJava.Objects.Function;
import com.NumericalMethodsInJava.Objects.Number;

public class Main {

    public static void main(String[] args) {
        Number sqrt = new Number(81);
        System.out.println(SqrtApproximation.newtonMethod(sqrt, 10).value);

    }
}
