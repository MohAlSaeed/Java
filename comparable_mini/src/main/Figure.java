package main;

abstract public class Figure implements Comparable<Figure>{
    abstract double getarea();

    public static Figure getminiFigure(Figure figs[]){
        double miniarea = 0;
        Figure miniFigure = null;
        for (Figure f : figs){
            if (f.getarea() < miniarea || miniarea == 0){
                miniarea = f.getarea();
                miniFigure = f;
            }
        }
        return miniFigure;
    }

    @Override
    public int compareTo(Figure figure) {
        double diff = getarea() - figure.getarea();
        if(diff > 0) return 1;
        else if (diff < 0) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Area: " + String.format("%6.3f", getarea());
    }
}
