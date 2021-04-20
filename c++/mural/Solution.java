import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Solution.returnInt(scanner);

        int caseCount = 1;
        while(t > 0) {
            int n = Solution.returnInt(scanner);

            int[] arrL = Solution.returnArrInt(scanner);

            int sum = 0;
            for (int i = 1; i < n - 1; i++) {
                int j = Solution.getMinPosition(Arrays.copyOfRange(arrL, i, n - 1));

                if (j < 0) {
                    continue;
                } else {
                    //reverse
                    int temp = arrL[i];
                    arrL[i] = arrL[j];
                    arrL[j] = temp;
                    sum++;
                }
            }

            System.out.println("Case #" + caseCount + ": " + sum);
            caseCount++;
            t--;
        }
    }
    

    public static int getMinPosition(int[] arr) {
        int temp = 0;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
                pos = i;
            }
        }

        return pos;
    }

    public static int[] returnArrInt(Scanner scanner) {
        String[] arr = scanner.nextLine().split(" ");
        int[] arrayInt = new int[arr.length]; 
        for (int i = 0; i < arr.length; i++) {
            arrayInt[i] = Integer.parseInt(arr[i]);
        }

        return arrayInt;
    }

    public static int returnInt(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }
}