package _16_IOTextFile.excecise.CopyFile;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("inputdocs.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("copytufilemau.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);
                writer.write(line);
                writer.newLine();
                
            }
            System.out.println(bufferedReader.readLine());
            writer.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
