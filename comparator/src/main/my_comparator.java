package main;

import java.util.Comparator;

public class my_comparator implements Comparator<person> {
    // we are comparing person by height, age and name..
    @Override
    public int compare(person p1, person p2) {
        int k = p1.height - p2.height;
        if (k != 0) return k;
        k = p1.birthyear - p2.birthyear;
        if (k != 0) return k;
        return p1.name.compareToIgnoreCase(p2.name);
    }
}
