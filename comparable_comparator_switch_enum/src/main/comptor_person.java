package main;

import java.util.Comparator;

public class comptor_person implements Comparator<person> {
    public static enum comp {by_name, by_name_rev, by_year, by_year_rev}
    comp cmp;

    comptor_person(comp cp){
        this.cmp = cp;
    }

    @Override
    public int compare(person p1, person p2) {
        int r_year = p1.getyear() - p2.getyear();
        int r_name = p1.getname().compareToIgnoreCase(p2.getname());

        int result = 0;

        switch (cmp){
            case by_name -> {result = r_name != 0 ? r_name : r_year; break;}
            case by_name_rev -> {result = r_name != 0 ? -r_name : r_year; break;}
            case by_year -> {result = r_year != 0 ? r_year : r_name; break;}
            case by_year_rev -> {result = r_year != 0 ? -r_year : r_name; break;}
        }
        return result;
    }
}
