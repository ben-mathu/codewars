import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.InputStreamReader;

public class CheckSum {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        int i = 1;
        while (i <= t) {

            int n = Integer.parseInt(reader.readLine());
            ArrayList<ArrayList<String>> a = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                ArrayList<String> nInts = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
                a.add(nInts);
            }

            ArrayList<ArrayList<String>> b = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                ArrayList<String> nInts = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
                b.add(nInts);
            }

            ArrayList<ArrayList<String>> r = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                ArrayList<String> nInts = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
                r.add(nInts);
            }

            ArrayList<ArrayList<String>> c = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                ArrayList<String> nInts = new ArrayList<>(Arrays.asList(reader.readLine().split(" ")));
                c.add(nInts);
            }
            
            i++;
        }
    }
}
