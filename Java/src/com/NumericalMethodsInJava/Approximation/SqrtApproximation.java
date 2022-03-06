package com.NumericalMethodsInJava.Approximation;

import com.NumericalMethodsInJava.Objects.Function;
import com.NumericalMethodsInJava.Objects.Number;

public class SqrtApproximation{

//sqrt a number >1
// Proof of correctness:
// We assume infinite FP precision
// It is sufficient to show that the true sqrt s is always between low and high
// By induction: In iteration 1 it is trivial to see that the sqrt s is between 1 and orig
// Assume in iteration n that low < s < high
// Then in iteration n+1 one of the following happens:
// case 1: curr ^ 2 > startingValue => s is still in the interval at end of iteration n+1
// as s > low in iteration n and low is unchanged => s > low and high = curr > s as s^2 = orig and curr^2 > orig
//
//	case 2: Is the same argument but made for the low instead
// => by induction that low < s < high for any number of intervals
// Error E: At the end of each interation we can see that the interval I between low and high is halved.
// As s and curr always exists in that interval I, we can see that |s - curr| = E <= I for each iteration
// => after n iterations the total error will be upper bounded by: orig / 2^n
	public static Number bisectIntervalMethod(Number orig, int iterations){
		double low = 1.0;
		double startingValue = orig.value;
		double high = startingValue;
		double curr = 0;

		for(int i = 0; i < iterations; i++){
			curr = (low+high)/2;

			if(curr * curr > startingValue)
				high = curr;
			else
				low = curr;

		}

		return new Number(curr);
	}

	//Newton-'s Method
	//The generalized newtons method we are using here solves for root of a function f(x)
	//That is f(x) = 0, here we are trying to solve for roots of n (i.e. x^2 = n)
	//To use newtons method we must rearrange our equation to be in the form f(x) = 0
	//We get: f(x) = x^2 - n = 0 <=> (x.value * x.value)- numToRoot.value [first function parameter]
	//We also need f'(x) = 2x = 0 <=> x.value = x.value * 2 [second function parameter]
	public static Number newtonMethod(Number numToRoot, int iterations){
		return RootApproximation.newtonMethod(
				numToRoot,
				new Function( (x)->{x.value = (x.value * x.value)- numToRoot.value; }),
				new Function( (x)->{x.value = x.value * 2;}),
				iterations
		);
	}
}