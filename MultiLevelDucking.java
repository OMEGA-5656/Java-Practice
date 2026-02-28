import java.io.*;
public class MultiLevelDucking {
    static void readFile()throws IOException{
        FileReader fr = new FileReader("file.txt");
        System.out.println("File Opened Successfully");
    }

    static void processFile()throws IOException{
        readFile();
    }

    static void handleFile()throws IOException{
        processFile();
    }

    public static void main(String[] args){
        try{
            handleFile();
        }
        catch(IOException e){
            System.out.println("Caught exception in main: "+e.getMessage());
        }
    }
}
