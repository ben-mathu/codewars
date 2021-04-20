import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LShapedPlots {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        int i = 0;
        while (i<t) {
            String[] line1 = reader.readLine().split(" ");

            int r = Integer.parseInt(line1[0]);
            int c = Integer.parseInt(line1[1]);

            String[] rows = new String[r];
            for (int j = 0; j < r; j++) {
                rows[j] = reader.readLine();
            }
            i++;
        }
    }
}
