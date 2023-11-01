package File_writer_reader;

import java.io.FileWriter ;
import java.io.IOException ;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter myFile = new FileWriter("a_ecrire.txt") ;
        myFile.write("voila ma premier ligne dans un fichier");
        myFile.close();
    }
}