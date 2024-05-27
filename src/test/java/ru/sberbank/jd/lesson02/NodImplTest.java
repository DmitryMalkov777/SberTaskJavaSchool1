package ru.sberbank.jd.lesson02;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class NodImplTest {
    private NodImpl nod = Mockito.mock(NodImpl.class);

    @Test
    public void testCalculate_PositiveNumbers() {
        Mockito.when(nod.calculate(12, 18)).thenReturn(6);
        assertEquals(6, nod.calculate(12, 18));    }

    @Test
    public void testCalculate_NegativeNumbers() {
        Mockito.when(nod.calculate(-12, -18)).thenReturn(6);
        assertEquals(6, nod.calculate(-12, -18));
    }

    @Test
    public void testCalculate_Zero() {
        Mockito.when(nod.calculate(12, 0)).thenReturn(12);
        assertEquals(12, nod.calculate(12, 0));
    }

    @Test
    public void testCalculate_SameNumbers() {
        Mockito.when(nod.calculate(12, 12)).thenReturn(12);
        assertEquals(12, nod.calculate(12, 12));
    }
}