package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//A(65) = Rock(1) --- B(66) = paper(2) --- C(67) = Scissors(3)
//X(88) = Rock(1) --- Y(89) = paper(2) --- Z(90) = Scissors(3)

public class d2p1 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/main/java/Day2/input");
        Scanner sc = new Scanner(input);

        int score = 0;
        while (sc.hasNext()){
            int o = sc.next().charAt(0) - '@';
            int m = sc.next().charAt(0) - 'W';

            if (Math.abs(o - m) == 0)
                score += m + 3;
            if (Math.abs(o - m) == 1)
                score += Math.max(o,m) == m ? m + 6 : m;
            if (Math.abs(o - m) == 2)
                score += Math.min(o,m) == m ? m + 6 : m;
        }
        System.out.println(score);
    }
}
