package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//A(65) = Rock(1) --- B(66) = paper(2) --- C(67) = Scissors(3)
//X(88) = Lose(0) --- Y(89) = draw(3) --- Z(90) = Win(6)

public class d2p2 {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("src/main/java/Day2/input");
        Scanner sc = new Scanner(input);

        int score = 0;
        while (sc.hasNext()){
            int o = sc.next().charAt(0) - '@';
            int m = (sc.next().charAt(0) - 'X') * 3;

            if (m == 0)
                score += o > 1 ? o - 1: o + 2;
            if (m == 3)
                score += m + o;
            if (m == 6)
                score += o < 3 ? m + o + 1: m + o - 2;
        }
        System.out.println(score);
    }
}
