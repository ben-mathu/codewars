import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadWrite {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        String s;
        try {
            s = br.readLine();
            
            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
