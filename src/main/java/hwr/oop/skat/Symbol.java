package hwr.oop.skat;

import java.util.Arrays;
import java.util.List;

public enum Symbol {
    SIEBEN(0), ACHT(0), NEUN(0), DAME(3), KOENIG(4), ZEHN(10), ASS(11), BUBE(2);

    private final int countValue;

    Symbol(int pCountValue) {
        this.countValue = pCountValue;
    }

    public static List<Symbol> allSymbols() {
        return Arrays.asList(Symbol.values());
    }

    public int getCountValue() {
        return countValue;
    }

}


