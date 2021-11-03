package zavrsnirad;

import java.util.ArrayList;

/**
 *
 * @author Filip Božović
 */
public class IzbrisiKandidate {

    public static void ukloniRed(int broj, int red, Sudoku[][] m) {
        ArrayList<Integer> temp = null;
        for (int k = 0; k < 9; k++) {
            temp = m[red][k].getKandidati();
            for (int j = 0; j < temp.size(); j++) {
                if (broj == ((Integer) temp.get(j)).intValue() && !m[red][k].isPronadjen()) {
                    m[red][k].obrisiKandidata(temp.get(j));
                    break;
                }
            }
        }
    }

    public static void ukloniKolonu(int broj, int kolona, Sudoku[][] m) {
        ArrayList<Integer> temp = null;
        for (int r = 0; r < 9; r++) {
            temp = m[r][kolona].getKandidati();
            for (int j = 0; j < temp.size(); j++) {
                if (broj == ((Integer) temp.get(j)).intValue() && !m[r][kolona].isPronadjen()) {
                    m[r][kolona].obrisiKandidata(temp.get(j));
                    break;
                }
            }
        }
    }

    public static void ukloniRegion(int broj, int red, int kolona, Sudoku[][] m) {
        for (int r = red / 3 * 3; r < red / 3 * 3 + 3; r++) {
            for (int k = kolona / 3 * 3; k < kolona / 3 * 3 + 3; k++) {
                if (!m[r][k].isPronadjen()) {
                    ArrayList<Integer> temp = m[r][k].getKandidati();
                    for (int i = 0; i < temp.size(); i++) {
                        if (((Integer) temp.get(i)).intValue() == broj) {
                            m[r][k].obrisiKandidata(temp.get(i));
                            break;
                        }
                    }
                }
            }
        }
    }
}
