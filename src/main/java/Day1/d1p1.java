package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d1p1 {
    public static int score(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        int totCal = 0;

        while (sc.hasNextLine()) {
            String buf = sc.nextLine();
            if (buf.equals("")) {
                totCal = 0;
            } else {
                totCal += Integer.parseInt(buf);
            }
        }
        return totCal;
    }
}
