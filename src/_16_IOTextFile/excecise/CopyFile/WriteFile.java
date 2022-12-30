package _16_IOTextFile.excecise.CopyFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFile {
    public static void main(String[] args) {
        {
            String[] datas = {"data1", "data2", "data3"};
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("outputdocs.txt"));
                writer.write("content1");
                writer.write("\ncontent2");
                writer.write("test");
                for (String data : datas) {
                    writer.write("\n" + data);
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

