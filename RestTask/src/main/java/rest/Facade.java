package rest;

import java.util.ArrayList;

public class Facade {
    Factorial fact;
    ArrayOfFactorials arr;
    Facade(){}
    Facade(int n){
        fact = new Factorial(n);
        arr = new ArrayOfFactorials(n);
    }
    public int getFactorial(){
        return fact.getFactorial();
    }
    public ArrayList<Integer> getArray(){
        return arr.getArray();
    }

}
