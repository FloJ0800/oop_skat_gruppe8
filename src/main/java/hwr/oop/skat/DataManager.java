package hwr.oop.skat;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class DataManager {
    String path = "/Users/dominic/Documents/DevSkat/Save.txt";
    FileOutputStream fileOutputStream;

    public DataManager(){

    }

    public void save(String pSaveData)
    {
        try{
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(pSaveData);
            fileWriter.close();

        }
        catch (Exception e){ //evtl änder in IOException oder so was
            e.printStackTrace();
        }
    }

    public Stream<String> load(){
        File file = new File(path);
        BufferedReader reader;
        Stream<String> stringStream = Stream.empty();

        try {
            FileReader fileReader = new FileReader(file);
            String temStr = Files.readString(Path.of(path), Charset.defaultCharset());
            stringStream = Stream.of(temStr.split(";"));
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stringStream;

    }
}