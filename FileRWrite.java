package zavrsnirad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Filip Božović
 */
public class FileRWrite {

    public static String read(String fileName) {
        String izlaz = "";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                izlaz = izlaz + tmp + "\n";
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return izlaz;
    }

    public static void write(String fileName, String podaci) {
        try {
            Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(podaci);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String readWithInput(String fileName) {
        String izlaz = "";
        try {
            URL dat = _5_cestitamo.class.getResource(fileName);
            InputStream in = dat.openStream();
            InputStreamReader streamReader = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            while ((line = reader.readLine()) != null) {
                izlaz = izlaz + line + "\n";
            }
            reader.close();
            streamReader.close();
            in.close();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileRWrite.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileRWrite.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
        return izlaz;
    }
}
