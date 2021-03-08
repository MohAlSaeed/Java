package main;

public class mypro {
    public static void main(String[] args) {
        teststack(new MyArray(10));

    }
    public static void teststack(stack stk){
        stk.push(12);
        stk.push(15);
        stk.push(876);
        while (!stk.empty()){
            System.out.println(stk.pop());
        }
    }
}
