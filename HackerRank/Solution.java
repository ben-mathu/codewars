import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static long nearlySimilarRectangles(List<List<Long>> sides) {
        int count = 0;
        Long tempNumerator = 0L;
        Long temp2Numerator = 0L;
        label:for (int i = 0; i < sides.size(); i++) {
            tempNumerator = sides.get(i).get(0);
            temp2Numerator = sides.get(i).get(1);
            for (int j = i+1; j < sides.size(); j++) {
                if (j == sides.size()) {
                    break;
                }

                double div1 = tempNumerator / sides.get(j).get(0);
                double div2 = temp2Numerator / sides.get(j).get(1);
                boolean isEqual = div1 == div2;
                if (isEqual) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<Long>> sides = Arrays.asList(Arrays.asList(4L,8L),
            Arrays.asList(15L,30L),
            Arrays.asList(25L,50L));
        Long count = Solution.nearlySimilarRectangles(sides);
        System.out.println(count);
    }
}