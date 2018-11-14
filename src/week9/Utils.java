package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path) {
        String a = "";
        File file = new File(path);
        if (!file.exists()) {
            return "file chua tonn tai";
        }
        try {

            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            a = bufferedReader.readLine();
            bufferedReader.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return a;
    }

    public static void writeContentToFile(String path) {// ghi vao file ,xoas file truoc khi ghi vao neu nhuw fil da co du lieu
        File file = new File(path);
        try {
            String b = "Xin chao moi nguoi!";
            //FileOutputStream fos=new FileOutputStream(file);
            //OutputStreamWriter osw=new OutputStreamWriter(fos)
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(b);
            bufferedWriter.close();

        } catch (FileNotFoundException a) {
            System.out.println(a);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
//ghi vao file neu nhu file da co du lieu thi ghi them vao file ma khong xoa du lieu cu di
    //khac nhau o ham filewriter mot cai co doi so la true day thi neu la true thi ghi them neu la false thi ghi de
    public static void addContentToFile(String path) {
        // String b="rat vui duoc gap moi nguoi";
        try {
            String b = "rat vui duoc gap moi nguoi";
            FileWriter fileWrite = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fileWrite);
            bw.write(b);

            bw.close();

        } catch (IOException e) {
            System.out.println("loi");
        }
    }
//tim file trong mot thu muc neu co return ra file neu khong return ra null
    public static File findFileByName(String folderPath, String fileName)
    {
        File dir = new File(folderPath);
        if(!dir.exists())// day la kiem tra xem thu muc ton tai hay k
            return null;
        for (File file : dir.listFiles()) {//ham listfile la de truy cap vao danh sach cac file trong thu muc
            //System.out.println(file.getName());
            if(file.getName().equals(fileName))
            return file;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap duong truyen vao file");
        String a = scanner.next();
        System.out.println(readContentFromFile(a));
        writeContentToFile(a);
        System.out.println(readContentFromFile(a));
        addContentToFile(a);
        System.out.println(readContentFromFile(a));
        System.out.println(findFileByName("C:\\Users\\dell\\D", "week9.txt"));//day la th thu muc khong ton taii

    }

}
