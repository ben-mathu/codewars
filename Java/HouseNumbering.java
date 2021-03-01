import java.util.HashMap;
import java.util.Map;

public class HouseNumbering {
    public static void main(String[] args) {
        int[] values = HouseNumbering.prepareDigits(1, 9);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    public static int[] prepareDigits(int firstHouse, int numberOfHouses) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }

        for (int j = firstHouse; j < (firstHouse + numberOfHouses * 2); j += 2) {
            String item = String.valueOf(j);
            for (int k = 0; k < item.toCharArray().length; k++) {
                int value = map.get(Integer.parseInt(String.valueOf(item.toCharArray()[k])));
                value++;
                map.put(Integer.parseInt(String.valueOf(item.toCharArray()[k])), value++);
            }
        }

        int[] purchasedHouseNumber = new int[map.size()];
        int count = 0;
        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            purchasedHouseNumber[count] = entrySet.getValue();
            count++;
        }
        return purchasedHouseNumber;
    }
}