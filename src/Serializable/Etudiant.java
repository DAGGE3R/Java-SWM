package Serializable;

import java.io.*;

public class Etudiant implements Serializable {
    private final String nom;
    private final String prenom;
    private final int N_tel ;

    public Etudiant(String nom , String prenom , int N_tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.N_tel= N_tel ;

    }

    @Override
    public String toString() {
        return "Serializable.Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", N_tel=" + N_tel +
                '}';
    }

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("ben Mohamed","Ali",9999999) ;
        Etudiant e2 = new Etudiant("ben salah" , "Mohamed", 99663322);

        try {
            FileOutputStream fs = new FileOutputStream("save.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(e1);
            os.writeObject(e2);
            os.close();
        }
        catch (Exception e){e.printStackTrace();}

        try {
            FileInputStream fis = new FileInputStream("save.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);


            e1 = (Etudiant) ois.readObject();
            e2 = (Etudiant) ois.readObject();
            /*System.out.println(((Serializable.Etudiant) ois.readObject()));*/
    
            System.out.println(e1);
            System.out.println(e2);

            ois.close();

        }catch (Exception e){ e.printStackTrace();}


    }
}
