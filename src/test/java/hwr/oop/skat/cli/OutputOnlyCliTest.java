package hwr.oop.skat.cli;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class OutputOnlyCliTest {

    @Test
    void handleFullTest() {
        OutputStream outputStream = new ByteArrayOutputStream();
        final var cli = new OutputOnlyCli(outputStream);
        List<Integer> list = List.of(3, 4);
        cli.handle(list);
        String output = outputStream.toString();
        assertThat(output).contains("result: 7");
    }
    @Test
    void handleEmptyTest() {
        OutputStream outputStream = new ByteArrayOutputStream();
        final var cli = new OutputOnlyCli(outputStream);
        List<Integer> list = List.of();
        cli.handle(list);
        String output = outputStream.toString();
        assertThat(output).contains("result: ");
    }

}
