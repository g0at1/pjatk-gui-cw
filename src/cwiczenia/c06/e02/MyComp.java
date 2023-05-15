package cwiczenia.c06.e02;

import java.util.Comparator;

public
    class MyComp
    implements Comparator<Integer> {

    public static final int
            BY_VAL=0, BY_VAL_REV=1,
            BY_NUM_OF_DIVS=2, BY_SUM_OF_DIGS=3;

    private int criteria;
    public MyComp(int criteria) {
        this.criteria = criteria;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return switch(this.criteria) {
            case 0 -> Integer.compare(o1, o2);
            case 1 -> Integer.compare(o2, o1);
            case 2 -> Integer.compare(numOfDivs(o1), numOfDivs(o2));
            case 3 -> Integer.compare(sumOfDigits(o1), sumOfDigits(o2));
            default -> throw new IllegalStateException("Unexpected value: " + this.criteria);
        };
    }

    public int numOfDivs(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                num++;
            }
        }
        return num;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
