package week10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<String> getAllFunctions(File Path) {
        List<String> a = new ArrayList<String>();
        try {
            FileInputStream fileInputStream = new FileInputStream(Path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader br=new BufferedReader(inputStreamReader);
            while(br.readLine()!=null)
            {
                if(br.readLine().contains("static")==true)
                    a.add(br.readLine());
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return a;
    }
    public static String FindFunctionByName(String Name){
        try {
            File file=new File("src/week9/Utils.java");
            if(!file.exists())
                return "file khong ton tai";
            FileInputStream fileInputStream = new FileInputStream(file);

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader br=new BufferedReader(inputStreamReader);
            String line=br.readLine();
            String[] name=Name.split(",String");
            while(line!=null)
            {
//                String[] word=null;
//                word=br.readLine().split(" ");
                if(line.contains(name[0])==true) {
                   return line;
                }
            }
            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("may dien");
        return "khong tim thay phuong thuc";

    }

    public static void main(String[] args) {
        System.out.println(FindFunctionByName( "findFileByName(String,String)"));
    }



}

