package main;

public class circle extends Figure{

    double r;
    circle(int r){
        this.r = r;
    }

    @Override
    double getarea() {
        return r*r*Math.PI;
    }

    @Override
    public String toString() {
        return "circle{" + "r=" + r + " " + super.toString() + " }";
    }
}
