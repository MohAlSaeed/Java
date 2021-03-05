package main;

import java.util.Arrays;
import java.util.Scanner;

public class mypro {
    public static void main(String[] args) {
        Figure fig[];
        int x;
        int y;
        Scanner _scanner = new Scanner(System.in);
        System.out.println("enter how many Figures of type circle you want to compare:");
        x = _scanner.nextInt();
        fig = new Figure[x];
        while (x > 0){
            x--;
            System.out.println("enter the r value please:");
            y = _scanner.nextInt();
            fig[x] = new circle(y);
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
