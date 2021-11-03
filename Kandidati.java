package zavrsnirad;

import java.util.ArrayList;

/**
 *
 * @author Filip Božović
 */
public class Kandidati {

    ArrayList<Integer> imaBroj = new ArrayList<>();
    boolean ovaKocka;
    boolean ovajRed;
    boolean ovaKolona;

    public void moguceOtkazivanje() {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    traziDostupneKandidate(i, j);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    traziDostupneKandidate(i, j);
                }
            }
        }
    }

    private void traziDostupneKandidate(int pozRed, int pozKol) {
        this.imaBroj.clear();
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            ekstrPodkockaFiksnimBrojem(pozRed, pozKol);
            for (int broj = 1; broj <= 9; broj++) {
                for (int k = pozRed * 3; k < pozRed * 3 + 3; k++) {
                    for (int i = pozKol * 3; i < pozKol * 3 + 3; i++) {
                        if (!_3_sudoku9x9.matSudoku[k][i].isPronadjen()) {
                            this.ovaKocka = imaBrojPodkocka(broj);
                            if (!this.ovaKocka) {
                                this.ovajRed = postojiRedniBroj(k, broj);
                                if (!this.ovajRed) {
                                    this.ovaKolona = postojiBrojKolone(i, broj);
                                    if (!this.ovaKolona) {
                                        _3_sudoku9x9.matSudoku[k][i].dodajBroj(broj);
                                        if (_3_sudoku9x9.kandidatiCheckBox.isSelected()) {
                                            _3_sudoku9x9.matSudoku[k][i].getJtf().append(" " + broj);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            ekstrPodkockaFiksnimBrojem(pozRed, pozKol);
            for (int broj = 1; broj <= 6; broj++) {
                for (int k = pozRed * 2; k < pozRed * 2 + 2; k++) {
                    for (int i = pozKol * 3; i < pozKol * 3 + 3; i++) {
                        if (!_4_sudoku6x6.matSudoku1[k][i].isPronadjen()) {
                            this.ovaKocka = imaBrojPodkocka(broj);
                            if (!this.ovaKocka) {
                                this.ovajRed = postojiRedniBroj(k, broj);
                                if (!this.ovajRed) {
                                    this.ovaKolona = postojiBrojKolone(i, broj);
                                    if (!this.ovaKolona) {
                                        _4_sudoku6x6.matSudoku1[k][i].dodajBroj(broj);
                                        if (_4_sudoku6x6.kandidatiCheckBox1.isSelected()) {
                                            _4_sudoku6x6.matSudoku1[k][i].getJtf().append(" " + broj);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void ekstrPodkockaFiksnimBrojem(int pozRed, int pozKol) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int red = pozRed * 3; red < pozRed * 3 + 3; red++) {
                for (int kol = pozKol * 3; kol < pozKol * 3 + 3; kol++) {
                    if (_3_sudoku9x9.matSudoku[red][kol].isPronadjen()) {
                        this.imaBroj.add(Integer.valueOf(_3_sudoku9x9.matSudoku[red][kol].getBroj()));
                    }
                }
            }
        } else {
            for (int red = pozRed * 2; red < pozRed * 2 + 2; red++) {
                for (int kol = pozKol * 3; kol < pozKol * 3 + 3; kol++) {
                    if (_4_sudoku6x6.matSudoku1[red][kol].isPronadjen()) {
                        this.imaBroj.add(Integer.valueOf(_4_sudoku6x6.matSudoku1[red][kol].getBroj()));
                    }
                }
            }
        }
    }

    private boolean imaBrojPodkocka(int broj) {
        for (int i = 0; i < this.imaBroj.size(); i++) {
            if (broj == ((Integer) this.imaBroj.get(i)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private boolean postojiRedniBroj(int red, int br) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < 9; i++) {
                if (_3_sudoku9x9.matSudoku[red][i].getBroj() == br) {
                    return true;
                }
            }
            return false;
        }
        for (int kol = 0; kol < 6; kol++) {
            if (_4_sudoku6x6.matSudoku1[red][kol].getBroj() == br) {
                return true;
            }
        }
        return false;
    }

    private boolean postojiBrojKolone(int kol, int br) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < 9; i++) {
                if (_3_sudoku9x9.matSudoku[i][kol].getBroj() == br) {
                    return true;
                }
            }
            return false;
        }
        for (int red = 0; red < 6; red++) {
            if (_4_sudoku6x6.matSudoku1[red][kol].getBroj() == br) {
                return true;
            }
        }
        return false;
    }
}
