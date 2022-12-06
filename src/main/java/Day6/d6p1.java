package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d6p1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/Day6/input");
        Scanner sc = new Scanner(file);
        String input = sc.nextLine();
        int signalLength = 6;
        markerFinder(input, signalLength);
    }

    public static void markerFinder(String input, int signalLength) {
        String compare;
        String output = "";
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < signalLength; j++) {
                compare = input.substring(i,i+ signalLength);
                for (int k = j+1; k < signalLength; k++) {
                    if (compare.charAt(j) != compare.charAt(k))
                        counter++;
                }
                if(counter == compare.substring(j + 1).length()){
                    output += String.valueOf(compare.charAt(j));
                    counter = 0;
                }
                else {
                    counter = 0;
                    output = "";
                    break;
                }
            }
            if(output.length() == signalLength){
                System.out.println(i + signalLength);
                break;
            }
        }
    }
}