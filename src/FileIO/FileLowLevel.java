package FileIO;

import java.io.*;

public class FileLowLevel {
    public static void main(String[] args) throws IOException {
        //Lesen und Schreiben in Datenströmen



        try (InputStream fin= new FileInputStream("LoremIpsum.txt");
        OutputStream fout = new FileOutputStream( "LoremIpsum.txt"))

        {


            int c = 0;
            while ((c = fin.read()) != -1)
            {
                fout.write(c);
            }
        }catch(FileNotFoundException){

        }
//        fin.close();
//        fout.close();

    }
}
