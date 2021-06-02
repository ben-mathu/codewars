import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'numPlayers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY scores
     */

    public static int numPlayers(int k, List<Integer> scores) {
        // Write your code here
        List<Integer> sortedList = scores.stream().sorted().collect(Collectors.toList());
        int temp = sortedList.get(0);
        int playerCount = 0;
        int actualPlayerCount = 0;
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) == temp && temp != 0) {
                playerCount++;
            }

            if (sortedList.get(i) > temp) {
                k -= playerCount;
                playerCount = 0;
            }

            if (k > 0) {
                actualPlayerCount++;
                System.out.println(actualPlayerCount);
                System.out.println();
                System.out.println(k);
                System.out.println();
                System.out.println(temp);
                System.out.println();
            }
            temp = sortedList.get(i);
        }
        return actualPlayerCount;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int scoresCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = IntStream.range(0, scoresCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.numPlayers(k, scores);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
