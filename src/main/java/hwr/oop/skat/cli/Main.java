package hwr.oop.skat.cli;

import hwr.oop.skat.*;

import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
import java.util.stream.Stream;

public class Main {

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        final var cli = new OutputOnlyCli(System.out);
        List<Integer> list = List.of(1, 2);
        cli.handle(list);
        Game game = new Game();
        game.loadData();
    }
}