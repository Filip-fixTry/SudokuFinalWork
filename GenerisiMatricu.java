package zavrsnirad;

/**
 *
 * @author Filip Božović
 */
public class GenerisiMatricu {

    public static int[][] temp6x6mat = new int[6][6];
    public static int[][] genMatrica;
    private int brKolRed;
    private int korenBrKolRed;
    private int brPraznih;

    public GenerisiMatricu(int brKolRed, int brPraznih) {
        this.brKolRed = brKolRed;
        this.brPraznih = brPraznih;
        Double kBrKR = Double.valueOf(Math.sqrt(brKolRed));
        this.korenBrKolRed = kBrKR.intValue();
        genMatrica = new int[brKolRed][brKolRed];
        popuniVrednosti();
    }

    private void popuniVrednosti() {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            popuniDijagonalno();
            popuniPreostale(0, this.korenBrKolRed);
            obrisibrPraznihCifra();
        } else {
            popuniDijagonalno();
            temp6x6mat = genMatrica;
            ResiSudoku.resiSudoku();
            obrisibrPraznihCifra();
        }
    }

    private void popuniDijagonalno() {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < this.brKolRed; i += this.korenBrKolRed) {
                popuniKutiju(i, i);
            }
        } else {
            for (int i = 0; i < this.brKolRed; i += this.korenBrKolRed) {
                if (i == 2) {
                    popuniKutiju(i, i + 1);
                } else {
                    if (i == 4) {
                        break;
                    }
                    popuniKutiju(i, i);
                }
            }
        }
    }

    private boolean nekoriscenUKutiji(int pocetakReda, int pocetakKolone, int broj) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int j = 0; j < this.korenBrKolRed; j++) {
                for (int k = 0; k < this.korenBrKolRed; k++) {
                    if (genMatrica[pocetakReda + j][pocetakKolone + k] == broj) {
                        return false;
                    }
                }
            }
            return true;
        }
        for (int i = 0; i < this.korenBrKolRed; i++) {
            for (int j = 0; j <= this.korenBrKolRed; j++) {
                if (genMatrica[pocetakReda + i][pocetakKolone + j] == broj) {
                    return false;
                }
            }
        }
        return true;
    }

    private void popuniKutiju(int red, int kol) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            for (int i = 0; i < this.korenBrKolRed; i++) {
                for (int j = 0; j < this.korenBrKolRed;) {
                    while (true) {
                        int broj = randomGenerator(this.brKolRed);
                        if (nekoriscenUKutiji(red, kol, broj)) {
                            genMatrica[red + i][kol + j] = broj;
                            break;
                        }
                    }
                    j++;
                }
            }
        } else {
            for (int i = 0; i < this.korenBrKolRed; i++) {
                for (int j = 0; j <= this.korenBrKolRed;) {
                    while (true) {
                        int broj = randomGenerator(this.brKolRed);
                        if (nekoriscenUKutiji(red, kol, broj)) {
                            genMatrica[red + i][kol + j] = broj;
                            break;
                        }
                    }
                    j++;
                }
            }
        }
    }

    private int randomGenerator(int broj) {
        return (int) Math.floor(Math.random() * broj + 1.0D);
    }

    private boolean proveriJelBezebedan(int i, int j, int broj) {
        return (neiskoriscenURedu(i, broj)
                && neiskoriscenUKoloni(j, broj)
                && nekoriscenUKutiji(i - i % this.korenBrKolRed, j - j % this.korenBrKolRed, broj));
    }

    private boolean neiskoriscenURedu(int i, int broj) {
        for (int j = 0; j < this.brKolRed; j++) {
            if (genMatrica[i][j] == broj) {
                return false;
            }
        }
        return true;
    }

    private boolean neiskoriscenUKoloni(int j, int broj) {
        for (int i = 0; i < this.brKolRed; i++) {
            if (genMatrica[i][j] == broj) {
                return false;
            }
        }
        return true;
    }

    private boolean popuniPreostale(int i, int j) {
        if (j >= this.brKolRed && i < this.brKolRed - 1) {
            i++;
            j = 0;
        }
        if (i >= this.brKolRed && j >= this.brKolRed) {
            return true;
        }
        if (i < this.korenBrKolRed) {
            if (j < this.korenBrKolRed) {
                j = this.korenBrKolRed;
            }
        } else if (i < this.brKolRed - this.korenBrKolRed) {
            if (j == i / this.korenBrKolRed * this.korenBrKolRed) {
                j += this.korenBrKolRed;
            }
        } else if (j == this.brKolRed - this.korenBrKolRed) {
            i++;
            j = 0;
            if (i >= this.brKolRed) {
                return true;
            }
        }
        for (int broj = 1; broj <= this.brKolRed; broj++) {
            if (proveriJelBezebedan(i, j, broj)) {
                genMatrica[i][j] = broj;
                if (popuniPreostale(i, j + 1)) {
                    return true;
                }
                genMatrica[i][j] = 0;
            }
        }
        return false;
    }

    public void obrisibrPraznihCifra() {
        int brojac = this.brPraznih;
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            while (brojac != 0) {
                int idKocke = randomGenerator(this.brKolRed * this.brKolRed) - 1;
                int i = idKocke / this.brKolRed;
                int j = idKocke % 9;
                if (genMatrica[i][j] != 0) {
                    brojac--;
                    genMatrica[i][j] = 0;
                }
            }
        } else {
            while (brojac != 0) {
                int idKocke = randomGenerator(this.brKolRed * this.brKolRed) - 1;
                int i = idKocke / this.brKolRed;
                int j = idKocke % 6;
                if (genMatrica[i][j] != 0) {
                    brojac--;
                    genMatrica[i][j] = 0;
                }
            }
        }
    }

    public void printSudoku() {
        for (int i = 0; i < this.brKolRed; i++) {
            for (int j = 0; j < this.brKolRed; j++) {
                System.out.print(genMatrica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
