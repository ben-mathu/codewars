package reverse;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    private static int range = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Solution.returnInt(scanner);

        int caseCount = 1;
        while(t > 0) {
            int n = Solution.returnInt(scanner);

            int[] arrL = Solution.returnArrInt(scanner);

            int sum = 0;
            for (int i = 0; i < n; i++) {
                int[] rangeArr = Arrays.copyOfRange(arrL, i, n);
                int j = Solution.getMinPosition(rangeArr);

                if (j < 0) {
                    continue;
                } else {
                    sum += Solution.reverse(Arrays.copyOfRange(arrL, i, range));
                }
            }

            System.out.println("Case #" + caseCount + ": " + sum);
            caseCount++;
            t--;
        }
    }

    public static int reverse(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                return count;
            }

            if (arr[i] > arr[i+1]) {
                //reverse
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
                count++;
            }
        }

        return count;
    }

    public static int getMinPosition(int[] arr) {
        int temp = arr[0];
        int pos = -1;
        range = 1;
        for (int i = 0; i < arr.length; i++) {
            if (temp > arr[i]) {
                temp = arr[i];
                pos = i;
                range++;
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