package zavrsnirad;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author Filip Božović
 */
public class Sudoku {

    private boolean pronadjen;
    private boolean ukloni;
    private int broj = 0;
    private ArrayList<Integer> kandidati;
    private JTextArea jtf;

    public Sudoku(boolean pronadjen, int broj, JTextArea jtBrKocke) {
        this.pronadjen = pronadjen;
        this.broj = broj;
        this.kandidati = new ArrayList<>();
        this.jtf = jtBrKocke;
        this.ukloni = true;
    }

    public boolean isPronadjen() {        return this.pronadjen;    }
    public boolean isUkloni() {        return this.ukloni;    }
    public int getBroj() {        return this.broj;    }
    public ArrayList<Integer> getKandidati() {        return this.kandidati;    }
    public JTextArea getJtf() {        return this.jtf;    }
    public void setPronadjen(boolean pronadjen) {        this.pronadjen = pronadjen;    }
    public void setUkloni(boolean ukloni) {        this.ukloni = ukloni;    }
    public void setBroj(int broj) {        this.broj = broj;    }
    public void setKandidati(ArrayList<Integer> kandidati) {        this.kandidati = kandidati;    }
    public void setJtf(JTextArea jtf) {        this.jtf = jtf;    }
    
    public void dodajBroj(int br) {
        this.kandidati.add(Integer.valueOf(br));
    }

    public void obrisiKandidata(Integer kandidat) {
        this.kandidati.remove(kandidat);
    }
}
