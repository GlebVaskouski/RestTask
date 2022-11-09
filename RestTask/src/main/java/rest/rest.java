package rest;

import java.util.ArrayList;

public class rest {

        public static int SolveFactorial(int n){
            if (n == 1 || n == 0){
                return 1;
            }
            return n * SolveFactorial(n-1);
        }

        public static ArrayList<Integer> SolveArray(int n){
            ArrayList<Integer> mas = new ArrayList<Integer>();
            if(n == 0){
                mas.add(SolveFactorial(0));
            }
            for(int i = 0; i < n; i++){
                mas.add(SolveFactorial(i + 1));
            }
            return mas;
        }

        public static void main(String[] args){

        }
}
