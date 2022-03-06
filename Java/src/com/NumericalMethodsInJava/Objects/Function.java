package com.NumericalMethodsInJava.Objects;

import java.util.function.Predicate;

public class Function{

	Predicate<Double> function;

	public Function(Predicate<Double> function){
		this.function = function;
	}

	public void evaluate(double x){
		function.accept(x);
	}

}