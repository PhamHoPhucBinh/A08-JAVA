package _Shop_Management.util;

import _Shop_Management.model.Domestic;
import _Shop_Management.model.Imported;
import _Shop_Management.model.Product;
import ss9_mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCSV {


    public static void writeDomesticCSV(String pathFile, List<Domestic> domesticList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Domestic d : domesticList) {
                bufferedWriter.write(d.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Domestic> readDomesticProductFromCSV(String pathFile) {
        List<Domestic> domesticList = new ArrayList<>();
        File file = new File(pathFile);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("DOMESTIC_FILE.CSV"));
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
////                array = line.split(",");
////                Domestic domestic = new Domestic( (String) array[0] , (String) array[1], (Double) array[2], (String) array[3]);
//                domesticList.add(domestic);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return domesticList;
    }

    public static void writeImportedCSV(String pathFile, ArrayList<Imported> importedArrayList, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Imported i : importedArrayList) {
                bufferedWriter.write(i.getInfoToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Imported> readImportedProductFromCSV(String pathFile) {
        List<Imported> importedList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
//                Imported imported = new Imported("PD01","PD Name",10221225.525,"nike","VN");
//                domesticList.add(domestic);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return importedList;
    }
}
