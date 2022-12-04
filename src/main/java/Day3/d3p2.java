package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d3p2 {
    public static int score(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        String fE,sE, tE;
        int score = 0;

        while (sc.hasNextLine()){
            fE = sc.nextLine();
            sE = sc.nextLine();
            tE = sc.nextLine();

            for (int i = 1; i <= fE.length(); i++) {
                if (sE.contains(fE.substring(i - 1,i)) && tE.contains(fE.substring(i - 1,i))) {
                    score += fE.charAt(i - 1) < '`' ? (fE.charAt(i - 1) - '&') : (fE.charAt(i - 1) - '`');
                    break;
                }
            }
        }
        return score;
    }
}

