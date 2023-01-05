package _Shop_Management.util;
import _Shop_Management.model.Domestic;
import _Shop_Management.model.Product;
import ss9_mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadWriteCSV {
//    public static void writeCSV(String pathFile, List<Product> productList,boolean append) {
//        File file = new File(pathFile);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, append);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Product p : productList) {
//                bufferedWriter.write(p.getInfoToCSV());
//                bufferedWriter.newLine();
//            }
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    public static void writeCSV(String pathFile, List<Domestic> domesticList, boolean append) {
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
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Domestic domestic = new Domestic("PD01","PD Name",10221225.525,"nike","VN");
                domesticList.add(domestic);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return domesticList;
    }

}
