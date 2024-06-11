package hwr.oop.skat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.assertj.core.api.Assertions.assertThatCharSequence;

public class DataManageTest {

    @Test
    public void createFile()
    {
        String path = "./Save.txt";
        File file = new File(path);
        DataManager dataManager = new DataManager();
        dataManager.save("test");

        assertThat(file.exists()).isTrue();

    }

    @Test
    public void fileNotFoundExceptionTest()
    {
        DataManager dataManager = new DataManager();
        dataManager.save("test");
        File file = new File("./Save.txt");
        file.delete();
        dataManager.load();
        Assertions.assertThrows(FileNotFoundException.class, () -> {});
    }

}
