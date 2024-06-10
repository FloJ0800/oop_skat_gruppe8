package hwr.oop.skat.cli;

import hwr.oop.skat.*;

import java.io.PrintStream;
import java.util.stream.Stream;

public class Main {

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        System.out.println("gnampf!");
        final var cli = new OutputOnlyCli(System.out);
        DataManager dataManager = new DataManager();
        dataManager.save("Java ist nice und Try-Catch ist gut vor allem meine :D Save ");
        Stream<String> dataStream = dataManager.load();
        dataStream.forEach(System.out::println);


    }

}



