package com.company;
import java.util.Arrays;

class Processor {
    public void process(int i, int j){
        System.out.println("Processing two integers : "+i+" "+j);
    }
    public void process(int[] ints){
        System.out.println("Adding integer Array : "+ Arrays.toString(ints));
    }
    public void process(Object[] objs){
        System.out.println("Adding integer Array : "+ Arrays.toString(objs));
    }
}

class MathProcessor extends Processor{
    @Override
    public void process(int i, int j) {
        System.out.println("Sum of integer is : "+ (i+j));
    }

    @Override
    public void process(int[] ints) {
        int sum=0;
        for(int i: ints){
            sum+=i;
        }
        System.out.println("Sum of integer array is : "+ sum);
    }
}
public class Que3 {
    public void main(String[] args){
        int a=7,b=3;
        MathProcessor.process(a,b);
        int[] arr;
        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        MathProcessor.process(arr);
    }
}