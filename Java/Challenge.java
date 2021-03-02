import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Challenge {
    public static List<Integer> splitInteger( Integer num, Integer parts ) {

        List<Integer> coolItems = new ArrayList<>();
        if (parts == 2) {
            coolItems.addAll(Arrays.asList(num/2, num/2));
            return coolItems;
        }

        int quotient = num;
        int divident = num;
        while (quotient % parts != 0 && divident % parts != 0 && coolItems.size() != parts) {
            quotient = quotient / parts;
            divident = divident / parts;
            coolItems.add(quotient);
            coolItems.add(divident);
        }
        return coolItems;
    }

    public static void main(String[] args) {
        List<Integer> arrIntegers = Challenge.splitInteger(10, 2);
        for (Integer item: arrIntegers) {
            System.out.println(String.valueOf(item));
        }
    }
}
