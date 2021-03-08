package main;

public class MyList implements stack{

    class _MyList{
        int data;
        _MyList tail;
        _MyList(int x){
            this.data = x;
            this.tail = null;
        }
        _MyList(int x, _MyList tail){
            this.data = x;
            this.tail = tail;
        }
    }

    _MyList tmp = null;

    @Override
    public int pop() {
        int x = tmp.data;
        tmp = tmp.tail;
        return x;
    }

    @Override
    public void push(int x) {
        tmp = new _MyList(x, tmp);
    }

    @Override
    public Boolean empty() {
        return tmp == null;
    }
}
