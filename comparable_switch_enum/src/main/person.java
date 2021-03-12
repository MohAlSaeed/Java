package main;

import java.util.Comparator;

public class person implements Comparable<person>{

    private  String name;
    private int year;

    person(String n, int y){
        this.name = n;
        this.year = y;
    }

    String getname(){return name;}
    int getyear(){return year;}



    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(person p) {
        int diff = p.year - this.year;
        if (diff != 0){
            return diff;
        } else {
            return p.name.compareToIgnoreCase(this.name);
        }
    }
}
