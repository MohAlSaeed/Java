package main;

public class rectangle extends Figure{
    int x;
    int y;
    rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    double getarea() {
        return x*y;
    }

    @Override
    public String toString() {
        return "rectangle{" + "x=" + x + ", y=" + y + super.toString() + "}";
    }
}
