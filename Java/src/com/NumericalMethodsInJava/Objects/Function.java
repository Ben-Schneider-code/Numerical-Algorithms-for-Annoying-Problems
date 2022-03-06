package com.NumericalMethodsInJava.Objects;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Function{

	Consumer<Number> function;

	public Function(Consumer<Number> function){
		this.function = function;
	}

	public void evaluate(Number x){
		function.accept(x);
	}

}