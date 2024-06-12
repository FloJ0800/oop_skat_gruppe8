package hwr.oop.skat;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class DataManagerTest {

    @Test
    public void createFileTest()
    {
        String path = "./Save.txt";
        File file = new File(path);
        DataManager dataManager = new DataManager();
        dataManager.save("test");

        assertThat(file.exists()).isTrue();

    }

    @Test
    public void saveTest(){
        DataManager dataManager = new DataManager();
        dataManager.save("123");
        assertThat(dataManager.load().toList().getFirst()).isEqualTo("123");
    }

}
