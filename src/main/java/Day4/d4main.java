package Day4;

import java.io.File;
import java.io.FileNotFoundException;

public class d4main {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/main/java/Day4/input");
        System.out.println(d4p1.score(input));
        System.out.println(d4p2.score(input));
    }
}
