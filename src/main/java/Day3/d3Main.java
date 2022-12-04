package Day3;

import Day1.d1p1;
import Day1.d1p2;

import java.io.File;
import java.io.FileNotFoundException;

public class d3Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inputd1 = new File("src/main/java/Day1/input");
        File inputd2 = new File("src/main/java/Day2/input");

        File inputd3 = new File("src/main/java/Day3/input");

        long start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            d1p1.score(inputd1);
            d1p2.score(inputd1);
        }
        double end = (System.nanoTime() - start) / 100.0;
        System.out.println("D1 - Solved in " + end/1000000.0 + " ms");


        start = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            d3p1.score(inputd3);
            d3p2.score(inputd3);
        }
        end = (System.nanoTime() - start) / 100.0;
        System.out.println("D3 - Solved in " + end/1000000.0 + " ms");

    }
}
