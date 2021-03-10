package main;

import java.util.*;

public class mypro {
    public static void main(String[] args) {
    person[] per = new person[4];
    testperson(per);
    for (person x : per){
        System.out.println(x);
    }
        System.out.println("normal comparing");
    Arrays.sort(per);
        for (person x : per){
            System.out.println(x);
        }
        System.out.println("comparing person by height, age and name..");
    Arrays.sort(per, new my_comparator());
        for (person x : per){
            System.out.println(x);
        }

        List<person> per_list = new ArrayList<>();
        testperson_compar_list(per_list);
        testperson_compar_list_lambda(per_list);
        testperson_compar_list_anonymous_comparator(per_list);
    }

    public static void testperson(person[] p){
        p[0] = new person("moh", 1982, 176);
        p[1] = new person("thu", 1984, 163);
        p[2] = new person("bas", 2009, 156);
        p[3] = new person("dan", 2014, 132);
    }


    public static void testperson_compar_list (List<person> per){
        per.add(new person("moh", 1982, 176));
        per.add(new person("thu", 1984, 163));
        per.add(new person("bas", 2009, 156));
        per.add(new person("dan", 2014, 132));
        System.out.println("print list before sort");
        for (person p: per){System.out.println(p);}
        Collections.sort(per, new my_comparator());
        System.out.println("print list after sort");
        for (person p: per){System.out.println(p);}
    }

    public static void testperson_compar_list_lambda (List<person> per){
        // here we can use lamda since we know the comparator void method takes two objects
        // and return an integer value as a result....
        Collections.sort(per, (x,y) -> x.birthyear-y.birthyear);
        System.out.println("print list after sort using lambda via age comparing");
        for (person p: per){System.out.println(p);}
    }

    public static void testperson_compar_list_anonymous_comparator (List<person> per){
        // you can use a direct anonymous comparator directly here in the sort () input entities.
        Collections.sort(per, new Comparator<person>() {
            @Override
            public int compare(person p1, person p2) {
                int k = p1.name.compareToIgnoreCase(p2.name);
                if (k != 0) return k;
                k = p1.height - p2.height;
                if (k != 0) return k;
                return p1.birthyear - p2.birthyear;
            }
        });
        System.out.println("print list after sort via anonymous comparator");
        for (person p: per){System.out.println(p);}
    }

}