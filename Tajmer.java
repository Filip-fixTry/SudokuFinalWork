package zavrsnirad;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Filip Božović
 */
public class Tajmer extends Thread {

    private int sekundi;
    private int minuta;
    private int sati;
    private Thread timer;
    private DecimalFormat df = new DecimalFormat("00");
    
    public Tajmer() {
    }

    public Tajmer(JLabel vremeLabel) {
        this.sekundi = 0;
        this.minuta = 0;
        this.sati = 0;
        this.timer = new Thread(this);
        this.timer.start();
    }

    public void run() {
        if (_2_Podesavanja.tipSudoku.equals("9x9")) {
            while (true) {
                try {
                    this.sekundi++;
                    if (_3_sudoku9x9.kandidatiCheckBox.isSelected()) {
                        _3_sudoku9x9.dodajVreme(9);
                    }
                    while (this.sekundi >= 60) {
                        this.sekundi -= 60;
                        this.minuta++;
                    }
                    if (this.minuta >= 60) {
                        this.sati++;
                        this.minuta -= 60;
                    }
                    _3_sudoku9x9.vremeLabel.setText(this.sati + ":" + this.df.format(this.minuta) + ":" + this.df.format(this.sekundi));
                    Thread.sleep(1000L);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Tajmer.class.getName()).log(Level.SEVERE, (String) null, ex);
                }
            }
        }
        while (true) {
            try {
                this.sekundi++;
                if (_4_sudoku6x6.kandidatiCheckBox1.isSelected()) {
                    _4_sudoku6x6.dodajVreme1(14);
                }
                while (this.sekundi >= 60) {
                    this.sekundi -= 60;
                    this.minuta++;
                }
                if (this.minuta >= 60) {
                    this.sati++;
                    this.minuta -= 60;
                }
                _4_sudoku6x6.vremeLabel1.setText(this.sati + ":" + this.df.format(this.minuta) + ":" + this.df.format(this.sekundi));
                Thread.sleep(1000L);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tajmer.class.getName()).log(Level.SEVERE, (String) null, ex);
            }
        }
    }

    public int getSekundi() {        return this.sekundi;    }
    public int getMinuta() {        return this.minuta;    }
    public int getSati() {        return this.sati;    }
    public Thread getTimer() {        return this.timer;    }
    public void setSekundi(int sekundi) {       this.sekundi = sekundi;    }
    public void setMinuta(int minuta) {        this.minuta = minuta;    }
    public void setSati(int sati) {        this.sati = sati;    }
    public void setTimer(Thread timer) {        this.timer = timer;    }
    public void stopirajTajmer() {        this.timer.stop();    }    
    public void suspenduj() {        this.timer.suspend();    }
    public void nastavi() {        this.timer.resume();    }
    public void stopirajThread() {        this.timer.stop();    }
}
