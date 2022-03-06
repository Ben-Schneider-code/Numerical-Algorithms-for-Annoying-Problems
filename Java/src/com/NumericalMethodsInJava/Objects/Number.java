package com.NumericalMethodsInJava.Objects;

public class Number {

    public double value;

    public Number(double value){this.value = value;}

    public void set(double val){value = val;}

    public double get(){return value;}

    public Number copy(){return new Number(value);}

    public String toString(){return ""+value;}
}
