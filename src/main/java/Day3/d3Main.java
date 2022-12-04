package Day3;

import Day1.d1p1;
import Day1.d1p2;

import java.io.File;
import java.io.FileNotFoundException;

public class d3Main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/main/java/Day3/input");
        System.out.println(d3p1.score(input));
        System.out.println(d3p2.score(input));
    }
}
