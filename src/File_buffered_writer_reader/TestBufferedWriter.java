package File_buffered_writer_reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;

public class TestBufferedWriter {
    public static void main(String[] args) throws Exception {
        int nombre = 123 ;
        BufferedWriter fichier = new BufferedWriter(new FileWriter("print.txt"));
        fichier.write("bonjour tout le monde") ;
        fichier.newLine();
        fichier.write("Nous sommes le "+ new Date());
        fichier.write(", le nombre magique est"+nombre);
        fichier.flush();
        fichier.close();

    }
}
