package File_input_output_stream;

import java.io.*;

public class ExerciseCopy {
    public static void main(String[] args) throws Exception {
        InputStream ios  = new FileInputStream("source.dat") ;
        OutputStream fos = new FileOutputStream("destination.dat") ;
        byte[] buffer = new byte[1024];
        int taille =0 ;

        while ((taille = ios.read(buffer)) != -1) {
            System.out.println(taille);
            fos.write(buffer,0,taille);
        }

ios.close();
    }
}