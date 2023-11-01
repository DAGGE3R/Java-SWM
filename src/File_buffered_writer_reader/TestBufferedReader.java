package File_buffered_writer_reader;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBufferedReader {
    public static void main(String[] args) throws Exception {
        FileReader f0 = new FileReader("print.txt");
        BufferedReader r = new BufferedReader(f0) ;
        String s = r.readLine();
        while (s !=null){
            System.out.println(s);
            s = r.readLine();
        }
        r.close();
    }
}
