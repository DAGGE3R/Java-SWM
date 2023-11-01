package File_input_output_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestFileInputStream {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("print.txt");
        int bufferSize = 64 ;
        byte [] buffer = new byte[bufferSize] ;
        int n = 0;
        int total = 0 ;
        int loops = 0 ;

        do {
            n = is.read(buffer);
            total +=n;
            loops++;
        }while(n!=-1);
        total++;

        System.out.println("nombre d'octet lus au total = " +total+" en "+loops+" boucles");

        is.close();

    }
}

