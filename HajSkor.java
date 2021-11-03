package zavrsnirad;

/**
 *
 * @author Filip Božović
 */
public class HajSkor {

    private String nadimak;
    private String vreme;
    private String nivo;
    private String tipIgre;

    public HajSkor() {
        this.nadimak = "";
        this.vreme = "";
        this.nivo = "";
        this.tipIgre = "";
    }

    public HajSkor(String nadimak, String vreme, String nivo) {
        this.nadimak = nadimak;
        this.vreme = vreme;
        this.nivo = nivo;
    }

    public HajSkor(String nadimak, String vreme, String nivo, String tipIgre) {
        this.nadimak = nadimak;
        this.vreme = vreme;
        this.nivo = nivo;
        this.tipIgre = tipIgre;
    }

    public String getNadimak() {
        return this.nadimak;
    }

    public String getVreme() {
        return this.vreme;
    }

    public String getNivo() {
        return this.nivo;
    }

    public String getTipIgre() {
        return this.tipIgre;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    public void setVreme(String vreme) {
        this.vreme = vreme;
    }

    public void setNivo(String nivo) {
        this.nivo = nivo;
    }

    public void setTipIgre(String tipIgre) {
        this.tipIgre = tipIgre;
    }

    public String toString() {
        return "Ime: " + this.nadimak + ", vreme: " + this.vreme + ", nivo: " + this.nivo + ", tipSudoku: " + this.tipIgre;
    }
}
