package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class d5p1 {
    public static String output(File input) throws FileNotFoundException {
        Scanner sc = new Scanner(input);

        ArrayList[] supplyStacks = new ArrayList[9];
        setupArraylist(sc, supplyStacks);
        stackCrates(sc, supplyStacks);

        String output = "";
        for (ArrayList supplyStack : supplyStacks) {
            output += supplyStack.remove(0);
        }
        return output;
    }

    public static void setupArraylist(Scanner sc, ArrayList[] supplyStacks) {
        for (int i = 0; i < 9; i++) {
            supplyStacks[i] = new ArrayList<>();
        }

        for (int i = 0; i < 8; i++) {
            String t = sc.nextLine();
            t = t.substring(1);

            for (int j = 0; j < t.length(); j+=4) {
                if (t.charAt(j) != ' ')
                    supplyStacks[j/4].add(t.charAt(j));
            }
        }
        sc.nextLine();
        sc.nextLine();
    }

    private static void stackCrates(Scanner sc, ArrayList[] supplyStacks) {
        int moveAmount, src, dest;

        while (sc.hasNextLine()){
            sc.next();
            moveAmount = Integer.parseInt(sc.next());
            sc.next();
            src = Integer.parseInt(sc.next());
            sc.next();
            dest = Integer.parseInt(sc.next());

            for (int i = 0; i < moveAmount; i++) {
                supplyStacks[dest - 1].add(0, supplyStacks[src -1].remove(0));
            }
        }
    }
}
