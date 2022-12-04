package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class d1p2 {
    public static int score(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        int highest = 0;
        int second = 0;
        int third = 0;
        int totCal = 0;

        while (sc.hasNextLine()) {
            String buf = sc.nextLine();
            if (buf.equals("")){
                if (totCal > highest){
                    third = second;
                    second = highest;
                    highest = totCal;
                } else if (totCal > second) {
                    third = second;
                    second = totCal;
                } else if (totCal > third) {
                    third = totCal;
                }
                totCal = 0;
            } else {
                totCal+=Integer.parseInt(buf);
            }
        }
        int total = highest + second + third;
        return total;
    }
}

