package main;

import java.util.Arrays;
import java.util.Scanner;

public class mypro {
    public static void main(String[] args) {
        Figure fig[];
        int x;
        int r;
        int z;
        Scanner _scanner = new Scanner(System.in);
        System.out.println("enter how many Figures of type circle you want to compare:");
        x = _scanner.nextInt();
        fig = new Figure[x];
        while (x > 0){
            x--;
            System.out.println("enter the 1 for circle or 2 for rectangle value please:");
            z = _scanner.nextInt();
            if (z == 1){
                System.out.println("enter the r for circle :");
                r = _scanner.nextInt();
                fig[x] = new circle(r);
            } else if (z == 2){
                System.out.println("enter the x for rectangle :");
                r = _scanner.nextInt();
                System.out.println("enter the y for rectangle :");
                z = _scanner.nextInt();
                fig[x] = new rectangle(r, z);
            }
        }
        Figure miniFig = Figure.getminiFigure(fig);
        System.out.println("the mini figure area is:");
        System.out.println(miniFig);
        System.out.println("Now we will sort the Figures");
        Arrays.sort(fig);
        for (Figure f : fig){
            System.out.println(f);
        }
    }
}
