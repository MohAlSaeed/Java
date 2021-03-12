package main;

import java.util.Arrays;

public class mypro {
    public static void main(String[] args) {
        person per[] = {
                new person("Moh", 1982),
                new person("Thu", 1984),
                new person("Bas", 2009),
                new person("Dan", 2014),
        };
        Arrays.sort(per);
        System.out.println("normal sort using comparable");
        for (person p : per){
            System.out.println(p);
        }
        System.out.println("sort using comparator (name, rev_name, year, rev_year)");
        System.out.println("sort by name");
        Arrays.sort(per, new comptor_person(comptor_person.comp.by_name));
        for (person p : per){System.out.println(p);}
        System.out.println("sort by rev_name");
        Arrays.sort(per, new comptor_person(comptor_person.comp.by_name_rev));
        for (person p : per){System.out.println(p);}
        System.out.println("sort by year");
        Arrays.sort(per, new comptor_person(comptor_person.comp.by_year));
        for (person p : per){System.out.println(p);}
        System.out.println("sort by rev_year");
        Arrays.sort(per, new comptor_person(comptor_person.comp.by_year_rev));
        for (person p : per){System.out.println(p);}
    }
}
