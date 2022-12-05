package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class d5p2 {
    public static String output(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        ArrayList[] supplyStacks = new ArrayList[9];
        d5p1.setupArraylist(sc, supplyStacks);
        stackCrates(sc, supplyStacks);

        String output = "";

        for (ArrayList supplyStack : supplyStacks) {
            output += supplyStack.remove(0);
        }
        return output;
    }

    private static void stackCrates(Scanner sc, ArrayList[] supplyStacks) {
        int src, dest, moveAmount;

        while (sc.hasNextLine()){
            sc.next();
            moveAmount = Integer.parseInt(sc.next());
            sc.next();
            src = Integer.parseInt(sc.next());
            sc.next();
            dest = Integer.parseInt(sc.next());

            List aux;
            aux = supplyStacks[src - 1].subList(0, moveAmount);
            aux.addAll(supplyStacks[dest - 1]);

            ArrayList tmp = new ArrayList(aux);
            supplyStacks[dest - 1] = tmp;

            aux.clear();
        }
    }
}
