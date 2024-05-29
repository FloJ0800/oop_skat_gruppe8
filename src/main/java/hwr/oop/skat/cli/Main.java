package hwr.oop.skat.cli;

import hwr.oop.skat.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        System.out.println("gnampf!");
        final var cli = new OutputOnlyCli(System.out);
        UserInterface ui = new UserInterface();
        ui.menu();

    }

}



