package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    public static String readContentFromFile(String path)  {
        String a="";
        File file = new File(path);
       if(!file.exists()){
          return "file chua tonn tai";}
     try{
            FileInputStream fis=new FileInputStream(file);
            InputStreamReader fileReader=new InputStreamReader(fis);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            a=bufferedReader.readLine();
            bufferedReader.close();
        }catch(java.io.IOException e){
            e.printStackTrace();
        }
    return a;
    }
    public static void  writeContentToFile(String path) {
        //String b="Xin chao moi nguoi!";
        File file=new File(path);
        try{
            String b="Xin chao moi nguoi!";
            //FileOutputStream fos=new FileOutputStream(file);
            //OutputStreamWriter osw=new OutputStreamWriter(fos)
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(b);
            bufferedWriter.close();

        } catch(FileNotFoundException a)  {
            System.out.println(a);
        } catch(java.io.IOException e){
            e.printStackTrace();
        }
    }
    public static void  addContentToFile(String path)
    {
       // String b="rat vui duoc gap moi nguoi";
        try{
            String b="rat vui duoc gap moi nguoi";
            FileWriter fileWrite=new FileWriter(path,true);
            BufferedWriter bw=new BufferedWriter(fileWrite);
           // FileWriter
            bw.write(b);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        File dir=new File("foderPath");
        File[] children=dir.listFiles();
        for(File file:children)
        {
            if(file.getAbsoluteFile().equals("fileName"));
            return file;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap duong truyen vao file");
        String a=scanner.next();
        System.out.println(readContentFromFile(a));
        writeContentToFile(a);
        System.out.println(readContentFromFile(a));
        addContentToFile(a);
        System.out.println(readContentFromFile(a));
    }

}
