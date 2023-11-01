package File_writer_reader;

import java.io.FileReader;
import java.io.IOException;

public class TestFileRead {
    public static void main(String[] args)throws IOException {
        FileReader r = new FileReader("print.txt");
        int c = r.read();
        int nb = 0 ;
        while(c!=-1) {
            nb++;
            c = r.read();
        }
        r.close();
        System.out.println("taille "+ nb +" caractere");
    }
}
