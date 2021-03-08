package main;

public class MyArray implements stack{
    int[] arr;
    int pointer = 0;
    MyArray(int size){
        this.arr = new int[size];
    }

    @Override
    public int pop() {
        return arr[--pointer];
    }

    @Override
    public void push(int x) {
        arr[pointer++] = x;
    }

    @Override
    public Boolean empty() {
        return pointer == 0;
    }
}
