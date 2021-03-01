import java.util.*;

public class Xbonacci {
    private List<Double> list = new ArrayList<>();
    
    public double[] tribonacci(double[] s, int n) {
        if (n == 0 || n < 1) {
            return new double[0];
        }
        
        for (int k = 0; ; k++) {
            // save the elements i the list
            int lastIndex = s.length - 1;
            
            if (list.isEmpty()) {
                for (int i = 0; i < s.length; i++) {
                    list.add(s[i]);
                }
            } else {
                list.add(s[lastIndex]);
            }
            
            if (k == n) {
                double[] arr = new double[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    arr[i] = list.get(i);
                }
                
                return arr;
            }
            
            // iterate through the array to find the sum
            double sum = 0;
            for (int i = 0; i < s.length; i++) {
                sum += s[i];
            }
            
            // insertion sort to put the new value in the array
            for (int i = 0; i < s.length; i++) {
                if (i == s.length - 1) {
                    s[i] = sum;
                    break;
                } else {
                    s[i] = s[i + 1];
                }
            }
        }
    }

    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();
        double[] arr = xbonacci.tribonacci(new double []{3.0, 3.0, 1.0},43);

        int count = 0;
        for (double elem : arr) {
            System.out.println(count + ": " + elem + " ");
            count++;
        }
    }
}
