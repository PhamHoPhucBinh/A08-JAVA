package _16_IOTextFile.excecise.CopyFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inputdocs.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
