package ru.sberbank.jd.lesson02;

public class NodImpl implements Nod{
    /**
     * {@inheritDoc}
     */
    @Override
    public int calculate(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculate(b, a % b);
    }
}
