package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d4p2 {
    public static int score(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        int score = 0;

        while(sc.hasNextLine()){

            String p = sc.nextLine();
            p = p.replace('-',' ');
            p = p.replace(',', ' ');

            Scanner isC = new Scanner(p);
            int bot1 = Integer.parseInt(isC.next());
            int top1 = Integer.parseInt(isC.next());
            int bot2 = Integer.parseInt(isC.next());
            int top2 = Integer.parseInt(isC.next());

            if (bot1 <= top2 && top1 >= bot2 ) {
                score++;
            }
        }
        return score;
    }
}
