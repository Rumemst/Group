package filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class LearnReadFile {
    public static void main(String[] args) {
        String filePath="C:\\Users\\shaha\\IdeaProjects\\Group\\src\\filereader\\Sample.txt1";
        readFile(filePath);
    }

    public static void readFile(String filePath){
        FileReader fileReader=null;//read holl file
        BufferedReader bufferedReader=null;//read line by line
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine())!=null){
                System.out.println(data);
            }
        }catch (Exception e){
           //e.printStackTrace();
            System.out.println("File not Found");
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            }catch (Exception e){
                System.out.println("File already closed");
            }
        }

    }
}
