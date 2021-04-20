import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KGoodnessString {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        int i = 1;
        while (i <= t) {
            String[] line1 = reader.readLine().split(" ");

            int n = Integer.parseInt(line1[0]);
            int k = Integer.parseInt(line1[1]);

            char[] line2 = reader.readLine().toCharArray();
            int goodCount = 0;
            for (int j = 1; j <= n / 2; j++) {
                int index = n - j + 1;

                if (!String.valueOf(line2[j-1]).equalsIgnoreCase(String.valueOf(line2[index-1]))) {
                    goodCount++;
                }
            }

            System.out.println("Case #" + i + ": " + Math.abs((k - goodCount)));

            i++;
        }
    }
}
