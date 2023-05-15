package cwiczenia.c07.e01;

import java.util.Iterator;
import java.util.Random;

public
    class Roll
    implements Iterable<Integer> {

    private Random random = new Random();

    @Override
    public Iterator<Integer> iterator() {
        return new MyRollIterator();
    }

    private class MyRollIterator
        implements Iterator<Integer> {

        private int sum = 0;
        private int[] rolls = new int[3];

        @Override
        public boolean hasNext() {
            return sum != 11;
        }

        @Override
        public Integer next() {
            int roll = random.nextInt(6) + 1;
            sum -= rolls[0];
            sum += roll;
            rolls[0] = rolls[1];
            rolls[1] = rolls[2];
            rolls[2] = roll;

            return roll;
        }
    }
}
