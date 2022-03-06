package com.NumericalMethodsInJava.Approximation;

import com.NumericalMethodsInJava.Objects.Function;
import com.NumericalMethodsInJava.Objects.Number;

public class RootApproximation {

    //Newton-Raphson Method
    //This has about a million times the overhead that it should, but I enjoy using the goofy java Lambda stuff
    public static Number newtonMethod(Number guess, Function func, Function funcDerivative, int iterations){
        Number iterativeGuess = new Number(guess.value);

        for(int i = 0; i < iterations; i++){
            Number fx = iterativeGuess.copy();
            func.evaluate(fx);

            Number fxDerivative = iterativeGuess.copy();
            funcDerivative.evaluate(fxDerivative);

            iterativeGuess.value = iterativeGuess.value - (fx.value / fxDerivative.value);

        }


        return iterativeGuess;
    }

}
