package rest;

public class Factorial {
    private static int factorial;

    public Factorial() {
        factorial = 1;
    }
    public Factorial(int n) {
        factorial = rest.SolveFactorial(n);
    }
    public int getFactorial(){
        return factorial;
    }
    public void setFactorial(int n){
        factorial = n;
    }
}
