class Thirteen {
    private static final long[] arrRem = new long[]{1, 10, 9, 12, 3, 4};
    
    public static long thirt(long n) {
        
        for (int k = 0; ; k++) {
            String num = String.valueOf(n);
            long[] arrValues = new long[num.length()];
            int count = 0;
            for (int i = num.length() - 1; i >= 0 ; i--) {
                arrValues[count] = Long.parseLong(num.charAt(i) + "");
                count++;
            }
            long temp = 0;
            
            count = 0;
            for (int i = 0; i < arrValues.length; i++) {
                long rem = arrRem[count];
                long numValue = arrValues[i];
                temp += numValue * rem;
                count++;
                if (count == arrRem.length) {
                    count = 0;
                }
            }

            if (temp == n) {
                return n;
            }

            n = temp;
        }
    }

    public static void main(String[] args) {
        long n = 1234567;
        long num  = Thirteen.thirt(n);

        System.out.println("Value: " + num);
    }
}