package main;

import java.util.Arrays;

public class mypro {
    public static void main(String[] args) {
    person[] per = new person[4];
    testperson(per);
    for (person x : per){
        System.out.println(x);
    }
        System.out.println("");
    Arrays.sort(per);
        for (person x : per){
            System.out.println(x);
        }

    }
    public static void testperson(person[] p){
        p[0] = new person("moh", 1982, 176);
        p[1] = new person("thu", 1984, 163);
        p[2] = new person("bas", 2009, 156);
        p[3] = new person("dan", 2014, 132);
    }

}
