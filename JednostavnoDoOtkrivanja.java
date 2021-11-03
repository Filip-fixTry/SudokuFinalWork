package zavrsnirad;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;

/**
 *
 * @author Filip Božović
 */
public class JednostavnoDoOtkrivanja {

    private int n = 0;
    public static int tempRed;
    public static int tempKol;
    private boolean prosao = false;

    public void pretraziJednostavno() {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            proveraBrKandida(9);
            if (!this.prosao) {
                proveraBrKandida(8);
            }
            if (!this.prosao) {
                proveraBrKandida(7);
            }
            if (!this.prosao) {
                proveraBrKandida(6);
            }
            if (!this.prosao) {
                proveraBrKandida(5);
            }
            if (!this.prosao) {
                proveraBrKandida(4);
            }
            if (!this.prosao) {
                proveraBrKandida(3);
            }
            if (!this.prosao) {
                proveraBrKandida(2);
            }
            if (!this.prosao) {
                proveraBrKandida(1);
            }
            if (!_3_sudoku9x9.trag) {
                _3_sudoku9x9.matSudoku[tempRed][tempKol].setBroj(this.n);
                _3_sudoku9x9.matSudoku[tempRed][tempKol].setPronadjen(true);
                _3_sudoku9x9.matSudoku[tempRed][tempKol].getJtf().setFont(new Font("Monospaced", 1, 24));
                _3_sudoku9x9.matSudoku[tempRed][tempKol].getJtf().setBackground(new Color(217, 254, 217));
                ukloniKandidataKolona(tempKol, this.n);
                ukloniKandidataReda(tempRed, this.n);
                ukloniKandidataKocke(tempRed, tempKol, this.n);
                _3_sudoku9x9.matSudoku[tempRed][tempKol].getJtf().setText(" " + this.n);
                tempRed = 0;
                tempKol = 0;
                _3_sudoku9x9.resenihKocki++;
            } else {
                _3_sudoku9x9.matSudoku[tempRed][tempKol].getJtf().setBackground(new Color(250, 250, 175));
                _3_sudoku9x9.matSudoku[tempRed][tempKol].getJtf().setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                _3_sudoku9x9.reseniBrojLabel.setText("" + this.n);
            }
            _3_sudoku9x9.puneCelijeLabel.setText("Popunjene celije " + _3_sudoku9x9.resenihKocki);
        } else {
            proveraBrKandida(6);
            if (!this.prosao) {
                proveraBrKandida(5);
            }
            if (!this.prosao) {
                proveraBrKandida(4);
            }
            if (!this.prosao) {
                proveraBrKandida(3);
            }
            if (!this.prosao) {
                proveraBrKandida(2);
            }
            if (!this.prosao) {
                proveraBrKandida(1);
            }
            if (!_4_sudoku6x6.trag1) {
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].setBroj(this.n);
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].setPronadjen(true);
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].getJtf().setFont(new Font("Monospaced", 1, 24));
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].getJtf().setBackground(new Color(217, 254, 217));
                ukloniKandidataKolona(tempKol, this.n);
                ukloniKandidataReda(tempRed, this.n);
                ukloniKandidataKocke(tempRed, tempKol, this.n);
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].getJtf().setText(" " + this.n);
                tempRed = 0;
                tempKol = 0;
                _4_sudoku6x6.resenihKocki1++;
            } else {
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].getJtf().setBackground(new Color(250, 250, 175));
                _4_sudoku6x6.matSudoku1[tempRed][tempKol].getJtf().setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                _4_sudoku6x6.reseniBrojLabel1.setText("" + this.n);
            }
            _4_sudoku6x6.puneCelijeLabel1.setText("Popunjene celije " + _4_sudoku6x6.resenihKocki1);
        }
    }

    void ukloniKandidataKocke(int red, int kolona, int broj) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int r = red / 3 * 3; r < red / 3 * 3 + 3; r++) {
                for (int k = kolona / 3 * 3; k < kolona / 3 * 3 + 3; k++) {
                    for (int i = 0; i < _3_sudoku9x9.matSudoku[r][k].getKandidati().size(); i++) {
                        if (broj == ((Integer) _3_sudoku9x9.matSudoku[r][k].getKandidati().get(i)).intValue()) {
                            _3_sudoku9x9.matSudoku[r][k].obrisiKandidata(_3_sudoku9x9.matSudoku[r][k].getKandidati().get(i));
                            if (_3_sudoku9x9.kandidatiCheckBox.isSelected()
                                    && _3_sudoku9x9.kandidatiCheckBox.isSelected() && !_3_sudoku9x9.novaIgra) {
                                _3_sudoku9x9.matSudoku[r][k].getJtf().setText((String) null);
                                for (int h = 0; h < _3_sudoku9x9.matSudoku[r][k].getKandidati().size(); h++) {
                                    _3_sudoku9x9.matSudoku[r][k].getJtf().append(" " + _3_sudoku9x9.matSudoku[r][k].getKandidati().get(h));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int r = red / 2 * 2; r < red / 2 * 2 + 2; r++) {
                for (int k = kolona / 3 * 3; k < kolona / 3 * 3 + 3; k++) {
                    for (int i = 0; i < _4_sudoku6x6.matSudoku1[r][k].getKandidati().size(); i++) {
                        if (broj == ((Integer) _4_sudoku6x6.matSudoku1[r][k].getKandidati().get(i)).intValue()) {
                            _4_sudoku6x6.matSudoku1[r][k].obrisiKandidata(_4_sudoku6x6.matSudoku1[r][k].getKandidati().get(i));
                            if (_4_sudoku6x6.kandidatiCheckBox1.isSelected()
                                    && _4_sudoku6x6.kandidatiCheckBox1.isSelected() && !_4_sudoku6x6.novaIgra1) {
                                _4_sudoku6x6.matSudoku1[r][k].getJtf().setText((String) null);
                                for (int h = 0; h < _4_sudoku6x6.matSudoku1[r][k].getKandidati().size(); h++) {
                                    _4_sudoku6x6.matSudoku1[r][k].getJtf().append(" " + _4_sudoku6x6.matSudoku1[r][k].getKandidati().get(h));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    void ukloniKandidataReda(int red, int broj) {
        ArrayList<Integer> temp = null;
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < 9; i++) {
                temp = _3_sudoku9x9.matSudoku[red][i].getKandidati();
                for (int j = 0; j < temp.size(); j++) {
                    if (broj == ((Integer) temp.get(j)).intValue()) {
                        _3_sudoku9x9.matSudoku[red][i].obrisiKandidata(temp.get(j));
                        if (_3_sudoku9x9.kandidatiCheckBox.isSelected() && !_3_sudoku9x9.novaIgra) {
                            ispisiKandidate(red, i);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < 6; i++) {
                temp = _4_sudoku6x6.matSudoku1[red][i].getKandidati();
                for (int j = 0; j < temp.size(); j++) {
                    if (broj == ((Integer) temp.get(j)).intValue()) {
                        _4_sudoku6x6.matSudoku1[red][i].obrisiKandidata(temp.get(j));
                        if (_4_sudoku6x6.kandidatiCheckBox1.isSelected() && !_4_sudoku6x6.novaIgra1) {
                            ispisiKandidate(red, i);
                        }
                    }
                }
            }
        }
    }

    public void ukloniKandidataKolona(int kol, int broj) {
        ArrayList<Integer> temp = null;
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < 9; i++) {
                temp = _3_sudoku9x9.matSudoku[i][kol].getKandidati();
                for (int j = 0; j < temp.size(); j++) {
                    if (broj == ((Integer) temp.get(j)).intValue()) {
                        _3_sudoku9x9.matSudoku[i][kol].obrisiKandidata(temp.get(j));
                        if (_3_sudoku9x9.kandidatiCheckBox.isSelected() && !_3_sudoku9x9.novaIgra) {
                            ispisiKandidate(i, kol);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < 6; i++) {
                temp = _4_sudoku6x6.matSudoku1[i][kol].getKandidati();
                for (int j = 0; j < temp.size(); j++) {
                    if (broj == ((Integer) temp.get(j)).intValue()) {
                        _4_sudoku6x6.matSudoku1[i][kol].obrisiKandidata(temp.get(j));
                        if (_4_sudoku6x6.kandidatiCheckBox1.isSelected() && !_4_sudoku6x6.novaIgra1) {
                            ispisiKandidate(i, kol);
                        }
                    }
                }
            }
        }
    }

    public void ispisiKandidate(int red, int kol) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            if (!_3_sudoku9x9.matSudoku[red][kol].isPronadjen()) {
                _3_sudoku9x9.matSudoku[red][kol].getJtf().setText((String) null);
            }
            for (int i = 0; i < _3_sudoku9x9.matSudoku[red][kol].getKandidati().size(); i++) {
                _3_sudoku9x9.matSudoku[red][kol].getJtf().append(" " + _3_sudoku9x9.matSudoku[red][kol].getKandidati().get(i));
            }
        } else {
            if (!_4_sudoku6x6.matSudoku1[red][kol].isPronadjen()) {
                _4_sudoku6x6.matSudoku1[red][kol].getJtf().setText((String) null);
            }
            for (int i = 0; i < _4_sudoku6x6.matSudoku1[red][kol].getKandidati().size(); i++) {
                _4_sudoku6x6.matSudoku1[red][kol].getJtf().append(" " + _4_sudoku6x6.matSudoku1[red][kol].getKandidati().get(i));
            }
        }
    }

    public void proveraBrKandida(int broj) {
        boolean nasao = false;
        this.prosao = false;
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int red = 0; red < 9
                    && nasao != true; red++) {
                for (int kol = 0; kol < 9; kol++) {
                    if (!_3_sudoku9x9.matSudoku[red][kol].isPronadjen() && _3_sudoku9x9.matSudoku[red][kol].getKandidati().size() == broj) {
                        for (int i = 0; i < _3_sudoku9x9.matSudoku[red][kol].getKandidati().size(); i++) {
                            this.n = ((Integer) _3_sudoku9x9.matSudoku[red][kol].getKandidati().get(i)).intValue();
                            if (_3_sudoku9x9.matrica[red][kol] == this.n) {
                                nasao = true;
                                this.prosao = true;
                                tempRed = red;
                                tempKol = kol;
                                break;
                            }
                        }
                        if (nasao == true) {
                            break;
                        }
                    }
                }
            }
        } else {
            for (int red = 0; red < 6
                    && nasao != true; red++) {
                for (int kol = 0; kol < 6; kol++) {
                    if (!_4_sudoku6x6.matSudoku1[red][kol].isPronadjen() && _4_sudoku6x6.matSudoku1[red][kol].getKandidati().size() == broj) {
                        for (int i = 0; i < _4_sudoku6x6.matSudoku1[red][kol].getKandidati().size(); i++) {
                            this.n = ((Integer) _4_sudoku6x6.matSudoku1[red][kol].getKandidati().get(i)).intValue();
                            if (_4_sudoku6x6.matrica1[red][kol] == this.n) {
                                nasao = true;
                                this.prosao = true;
                                tempRed = red;
                                tempKol = kol;
                                break;
                            }
                        }
                        if (nasao == true) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
