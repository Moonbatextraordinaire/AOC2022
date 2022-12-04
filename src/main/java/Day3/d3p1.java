package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d3p1 {
    public static int score(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        String w,f, s;
        int score = 0;

        while (sc.hasNextLine()){
            w = sc.nextLine();
            f = w.substring(0,(w.length()/2));
            s = w.substring((w.length()/2));

            for (int i = 1; i <= f.length(); i++) {
                if (s.contains(f.substring(i -1,i))){
                    score += f.charAt(i - 1) < '`' ? (f.charAt(i - 1) - '&') : (f.charAt(i - 1) - '`');
                    break;
                }
            }
        }
        return score;
    }
}
