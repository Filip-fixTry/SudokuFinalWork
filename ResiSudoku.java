package zavrsnirad;

/**
 *
 * @author Filip Božović
 */
public class ResiSudoku {

    private static final int SIZE1 = 9;
    private static final int SIZE2 = 6;

    public static void ispisiSudoku() {
        for (int i = 0; i < _3_sudoku9x9.matrica.length; i++) {
            for (int j = 0; j < (_3_sudoku9x9.matrica[i]).length; j++) {
                System.out.print(String.valueOf(_3_sudoku9x9.matrica[i][j]) + "  ");
            }
            System.out.println("");
        }
    }

    private static int[] neDodeljenjiBroj(int red, int kol) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            int j = 0;
            for (int k = 0; k < 9; k++) {
                for (int m = 0; m < 9; m++) {
                    if (_3_sudoku9x9.matrica[k][m] == 0) {
                        red = k;
                        kol = m;
                        j = 1;
                        int[] arrayOfInt1 = {j, red, kol};
                        return arrayOfInt1;
                    }
                }
            }
            int[] arrayOfInt = {j, -1, -1};
            return arrayOfInt;
        }
        int nedodBr = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (_4_sudoku6x6.matrica1[i][j] == 0) {
                    red = i;
                    kol = j;
                    nedodBr = 1;
                    int[] arrayOfInt = {nedodBr, red, kol};
                    return arrayOfInt;
                }
            }
        }
        int[] a = {nedodBr, -1, -1};
        return a;
    }

    private static boolean bezbedanJe(int br, int red, int kol) {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            int m;
            for (m = 0; m < 9; m++) {
                if (_3_sudoku9x9.matrica[red][m] == br) {
                    return false;
                }
            }
            for (m = 0; m < 9; m++) {
                if (_3_sudoku9x9.matrica[m][kol] == br) {
                    return false;
                }
            }
            int k = red / 3 * 3;
            int n = kol / 3 * 3;
            for (int i1 = k; i1 < k + 3; i1++) {
                for (int i2 = n; i2 < n + 3; i2++) {
                    if (_3_sudoku9x9.matrica[i1][i2] == br) {
                        return false;
                    }
                }
            }
            return true;
        }
        int i;
        for (i = 0; i < 6; i++) {
            if (_4_sudoku6x6.matrica1[red][i] == br) {
                return false;
            }
        }
        for (i = 0; i < 6; i++) {
            if (_4_sudoku6x6.matrica1[i][kol] == br) {
                return false;
            }
        }
        int red_start = red / 2 * 2;
        int kol_start = kol / 3 * 3;
        for (int j = red_start; j < red_start + 2; j++) {
            for (int k = kol_start; k < kol_start + 3; k++) {
                if (_4_sudoku6x6.matrica1[j][k] == br) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean resiSudoku() {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            int j = 0;
            int k = 0;
            int[] arrayOfInt = neDodeljenjiBroj(j, k);
            if (arrayOfInt[0] == 0) {
                return true;
            }
            j = arrayOfInt[1];
            k = arrayOfInt[2];
            for (int m = 1; m <= 9; m++) {
                if (bezbedanJe(m, j, k)) {
                    _3_sudoku9x9.matrica[j][k] = m;
                    if (resiSudoku()) {
                        return true;
                    }
                    _3_sudoku9x9.matrica[j][k] = 0;
                }
            }
            return false;
        }
        if (_2_Podesavanja.software) {
            _4_sudoku6x6.matrica1 = GenerisiMatricu.temp6x6mat;
        }
        int red = 0;
        int kol = 0;
        int[] a = neDodeljenjiBroj(red, kol);
        if (a[0] == 0) {
            return true;
        }
        red = a[1];
        kol = a[2];
        for (int i = 1; i <= 6; i++) {
            if (bezbedanJe(i, red, kol)) {
                _4_sudoku6x6.matrica1[red][kol] = i;
                if (resiSudoku()) {
                    return true;
                }
                _4_sudoku6x6.matrica1[red][kol] = 0;
            }
        }
        return false;
    }
}
