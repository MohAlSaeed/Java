package main;

import java.util.Calendar;

public class person implements Comparable<person> {

    int currentyear = Calendar.getInstance().get(Calendar.YEAR);
    String name;
    int birthyear;
    int height;

    person(String n, int y, int h){
        name = n;
        birthyear = y;
        height = h;
    }


    @Override
    public int compareTo(person p) {
        int k = name.compareToIgnoreCase(p.name);
        if (k != 0) return k;
        k = birthyear - p.birthyear;
        if (k != 0) return k;
        return height - p.height;
    }

    @Override
    public String toString() {
        return "person{" +
                ", name=" + name +
                ", age=" + (currentyear-birthyear) +
                ", height=" + height +
                '}';
    }
}
