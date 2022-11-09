package rest;

import java.util.ArrayList;

public class ArrayOfFactorials {
    private ArrayList<Integer> mas;
    public ArrayOfFactorials() {
        mas = new ArrayList<Integer>();
        mas.add(1);
    }
    public ArrayOfFactorials(int n){
        mas = rest.SolveArray(n);
    }
    public ArrayList<Integer> getArray(){
        return mas;
    }
}
