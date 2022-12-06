package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d6p2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/Day6/input");
        Scanner sc = new Scanner(file);
        String input = sc.nextLine();
        d6p1.markerFinder(input,14);
    }
}