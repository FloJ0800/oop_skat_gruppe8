package hwr.oop.skat.cli;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

public class OutputOnlyCli {

    private final PrintStream out;

    public OutputOnlyCli(OutputStream out) {
        this.out = new PrintStream(out);
    }

    public String handle(List<Integer> arguments) {
        final var result = arguments.stream()
                .reduce(0, (a, b) -> a+b);

        return("result: " + result);
    }
}