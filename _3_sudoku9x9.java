package zavrsnirad;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author Filip Božović
 */
public class _3_sudoku9x9 extends javax.swing.JFrame implements KeyListener{

    public static Clip clip;
    public static ArrayList<Clip> listaClip = new ArrayList<>();
    public static Sudoku[][] matSudoku = new Sudoku[9][9];
    public static int resenihKocki;
    public static Tajmer vreme;
    public static Clip clipMuzika;
    private int red;
    private int kolona;
    public static int tempBrMatrice;
    public static int tmpAudio;
    public JTextArea aux = br1;
    private Color boja1 = new Color(205, 205, 255);
    private Color boja4 = new Color(204, 255, 204);
    private Color boja5 = new Color(255, 179, 179);
    public static Color boja2 = new Color(155, 235, 235);
    public static Color boja3 = new Color(255, 255, 255);
    boolean imaResenja = true;
    public static boolean nivoTesko = false;
    public static boolean novaIgra = false;
    public static boolean trag = false;
    public static int[][] matrica;
    private int greskeBrojac;
    public static Font fontNaslov;
    public static Font fontIgre;
    public static Font font25;
    public static Font fontIgre1;
    public static Font fontIgre2;
    public static Font fontIgre3;
    public static Font fontNazad;
    public static Font fontNivoi;
    public static Font font6x6;
    public static Font fontDugme;
    public static Font font16;
    public static JTextArea br1;
    public static JTextArea br10;
    public static JTextArea br11;
    public static JTextArea br12;
    public static JTextArea br13;
    public static JTextArea br14;
    public static JTextArea br15;
    public static JTextArea br16;
    public static JTextArea br17;
    public static JTextArea br18;
    public static JTextArea br19;
    public static JTextArea br2;
    public static JTextArea br20;
    public static JTextArea br21;
    public static JTextArea br22;
    public static JTextArea br23;
    public static JTextArea br24;
    public static JTextArea br25;
    public static JTextArea br26;
    public static JTextArea br27;
    public static JTextArea br28;
    public static JTextArea br29;
    public static JTextArea br3;
    public static JTextArea br30;
    public static JTextArea br31;
    public static JTextArea br32;
    public static JTextArea br33;
    public static JTextArea br34;
    public static JTextArea br35;
    public static JTextArea br36;
    public static JTextArea br37;
    public static JTextArea br38;
    public static JTextArea br39;
    public static JTextArea br4;
    public static JTextArea br40;
    public static JTextArea br41;
    public static JTextArea br42;
    public static JTextArea br43;
    public static JTextArea br44;
    public static JTextArea br45;
    public static JTextArea br46;
    public static JTextArea br47;
    public static JTextArea br48;
    public static JTextArea br49;
    public static JTextArea br5;
    public static JTextArea br50;
    public static JTextArea br51;
    public static JTextArea br52;
    public static JTextArea br53;
    public static JTextArea br54;
    public static JTextArea br55;
    public static JTextArea br56;
    public static JTextArea br57;
    public static JTextArea br58;
    public static JTextArea br59;
    public static JTextArea br6;
    public static JTextArea br60;
    public static JTextArea br61;
    public static JTextArea br62;
    public static JTextArea br63;
    public static JTextArea br64;
    public static JTextArea br65;
    public static JTextArea br66;
    public static JTextArea br67;
    public static JTextArea br68;
    public static JTextArea br69;
    public static JTextArea br7;
    public static JTextArea br70;
    public static JTextArea br71;
    public static JTextArea br72;
    public static JTextArea br73;
    public static JTextArea br74;
    public static JTextArea br75;
    public static JTextArea br76;
    public static JTextArea br77;
    public static JTextArea br78;
    public static JTextArea br79;
    public static JTextArea br8;
    public static JTextArea br80;
    public static JTextArea br81;
    public static JTextArea br9;
    private JButton dugmeNazad;
    private JButton dugmePomoc;
    private JButton dugme_1;
    private JButton dugme_2;
    private JButton dugme_3;
    private JButton dugme_4;
    private JButton dugme_5;
    private JButton dugme_6;
    private JButton dugme_7;
    private JButton dugme_8;
    private JButton dugme_9;
    private JButton dugme__;
    private JLabel greskaLabel;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel11;
    private JPanel jPanel13;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel8;
    private JPanel jPanel9;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    public static JCheckBox kandidatiCheckBox;
    private JLabel nivoLabel;
    private JLabel pauzaLabel;
    public static JLabel puneCelijeLabel;
    public static JLabel reseniBrojLabel;
    public static JLabel vremeLabel;
    private JLabel zvukLabel;

    /**
     * Creates new form _3_sudoku9x9
     */
    public _3_sudoku9x9() {
        initComponents();
        (new KreirajMatricu()).krejtMatricu();
        for (JTextArea jt : KreirajMatricu.jtaLista) {
            jt.addKeyListener(this);
        }
        this.greskeBrojac = 0;
        if (clipMuzika.isRunning()) {
            this.zvukLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOn.png")));
        } else {
            this.zvukLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOff.png")));
        }
        if (_2_Podesavanja.greska) {
            this.greskaLabel.setEnabled(true);
        } else {
            this.greskaLabel.setEnabled(false);
        }
        this.aux = br1;
        vreme = new Tajmer(vremeLabel);
        if (_2_Podesavanja.software) {
            generisiMatricu();
            matrica = GenerisiMatricu.genMatrica;
            krejtSaBazom();
        } else {
            restartuj();
            randomBazaMatrice();
            krejtSaBazom();
        }
        for (int i = 1; i < matrica.length; i++) {
            ugasiDugme(i);
        }
        ResiSudoku.resiSudoku();
        setPozadina();
        podesiJezik();
        ispisiGresku();
        ugasiDugme();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

			this.jPanel1 = new JPanel();
		this.jPanel2 = new JPanel();
		this.jPanel3 = new JPanel();
		br1 = new JTextArea();
		br2 = new JTextArea();
		br3 = new JTextArea();
		br10 = new JTextArea();
		br11 = new JTextArea();
		br12 = new JTextArea();
		br19 = new JTextArea();
		br20 = new JTextArea();
		br21 = new JTextArea();
		this.jPanel4 = new JPanel();
		br4 = new JTextArea();
		br5 = new JTextArea();
		br6 = new JTextArea();
		br13 = new JTextArea();
		br14 = new JTextArea();
		br15 = new JTextArea();
		br22 = new JTextArea();
		br23 = new JTextArea();
		br24 = new JTextArea();
		this.jPanel5 = new JPanel();
		br7 = new JTextArea();
		br8 = new JTextArea();
		br9 = new JTextArea();
		br16 = new JTextArea();
		br17 = new JTextArea();
		br18 = new JTextArea();
		br25 = new JTextArea();
		br26 = new JTextArea();
		br27 = new JTextArea();
		this.jPanel6 = new JPanel();
		br28 = new JTextArea();
		br29 = new JTextArea();
		br30 = new JTextArea();
		br37 = new JTextArea();
		br38 = new JTextArea();
		br39 = new JTextArea();
		br46 = new JTextArea();
		br47 = new JTextArea();
		br48 = new JTextArea();
		this.jPanel7 = new JPanel();
		br31 = new JTextArea();
		br32 = new JTextArea();
		br33 = new JTextArea();
		br40 = new JTextArea();
		br41 = new JTextArea();
		br42 = new JTextArea();
		br49 = new JTextArea();
		br50 = new JTextArea();
		br51 = new JTextArea();
		this.jPanel8 = new JPanel();
		br34 = new JTextArea();
		br35 = new JTextArea();
		br36 = new JTextArea();
		br43 = new JTextArea();
		br44 = new JTextArea();
		br45 = new JTextArea();
		br52 = new JTextArea();
		br53 = new JTextArea();
		br54 = new JTextArea();
		this.jPanel9 = new JPanel();
		br55 = new JTextArea();
		br56 = new JTextArea();
		br57 = new JTextArea();
		br64 = new JTextArea();
		br65 = new JTextArea();
		br66 = new JTextArea();
		br73 = new JTextArea();
		br74 = new JTextArea();
		br75 = new JTextArea();
		this.jPanel10 = new JPanel();
		br58 = new JTextArea();
		br59 = new JTextArea();
		br60 = new JTextArea();
		br67 = new JTextArea();
		br68 = new JTextArea();
		br69 = new JTextArea();
		br76 = new JTextArea();
		br77 = new JTextArea();
		br78 = new JTextArea();
		this.jPanel11 = new JPanel();
		br61 = new JTextArea();
		br62 = new JTextArea();
		br63 = new JTextArea();
		br70 = new JTextArea();
		br71 = new JTextArea();
		br72 = new JTextArea();
		br79 = new JTextArea();
		br80 = new JTextArea();
		br81 = new JTextArea();
		this.jPanel13 = new JPanel();
		this.dugmePomoc = new JButton();
		reseniBrojLabel = new JLabel();
		this.jSeparator1 = new JSeparator();
		this.dugme_1 = new JButton();
		this.dugme_2 = new JButton();
		this.dugme_3 = new JButton();
		this.dugme_4 = new JButton();
		this.dugme_5 = new JButton();
		this.dugme_6 = new JButton();
		this.dugme_7 = new JButton();
		this.dugme_8 = new JButton();
		this.dugme_9 = new JButton();
		this.dugme__ = new JButton();
		this.jSeparator2 = new JSeparator();
		this.zvukLabel = new JLabel();
		this.pauzaLabel = new JLabel();
		this.greskaLabel = new JLabel();
		this.dugmeNazad = new JButton();
		vremeLabel = new JLabel();
		this.nivoLabel = new JLabel();
		kandidatiCheckBox = new JCheckBox();
		puneCelijeLabel = new JLabel();
		setDefaultCloseOperation(3);
		setTitle("Sudoku 9x9");
		setCursor(new Cursor(0));
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			  public void windowActivated(WindowEvent evt) {
				_3_sudoku9x9.this.formWindowActivated(evt);
			  }
			  
			  public void windowDeactivated(WindowEvent evt) {
				_3_sudoku9x9.this.formWindowDeactivated(evt);
			  }
			  
			  public void windowDeiconified(WindowEvent evt) {
				_3_sudoku9x9.this.formWindowDeiconified(evt);
			  }
			});
		this.jPanel1.setBorder(new SoftBevelBorder(0));
		this.jPanel1.setPreferredSize(new Dimension(450, 450));
		this.jPanel2.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(0, 0, 0)));
		this.jPanel2.setPreferredSize(new Dimension(40, 40));
		this.jPanel3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel3.setPreferredSize(new Dimension(150, 152));
		br1.setEditable(false);
		br1.setColumns(20);
		br1.setFont(new Font("Calibri", 0, 12));
		br1.setLineWrap(true);
		br1.setRows(3);
		br1.setText("8");
		br1.setAlignmentY(0.2F);
		br1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br1.setFocusTraversalPolicyProvider(true);
		br1.setMinimumSize(new Dimension(50, 18));
		br1.setName("1");
		br1.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br1MousePressed(evt);
			  }
			});
		br1.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br1KeyTyped(evt);
			  }
			});
		br2.setEditable(false);
		br2.setColumns(20);
		br2.setFont(new Font("Calibri", 0, 12));
		br2.setLineWrap(true);
		br2.setRows(3);
		br2.setAlignmentY(0.2F);
		br2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br2.setFocusTraversalPolicyProvider(true);
		br2.setName("1");
		br2.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br2MousePressed(evt);
			  }
			});
		br2.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br2KeyTyped(evt);
			  }
			});
		br3.setEditable(false);
		br3.setColumns(20);
		br3.setFont(new Font("Calibri", 0, 12));
		br3.setLineWrap(true);
		br3.setRows(3);
		br3.setAlignmentY(0.2F);
		br3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br3.setFocusTraversalPolicyProvider(true);
		br3.setName("1");
		br3.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br3MousePressed(evt);
			  }
			});
		br3.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br3KeyTyped(evt);
			  }
			});
		br10.setEditable(false);
		br10.setColumns(20);
		br10.setFont(new Font("Calibri", 0, 12));
		br10.setLineWrap(true);
		br10.setRows(3);
		br10.setAlignmentY(0.2F);
		br10.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br10.setFocusTraversalPolicyProvider(true);
		br10.setName("1");
		br10.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br10MousePressed(evt);
			  }
			});
		br10.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br10KeyTyped(evt);
			  }
			});
		br11.setEditable(false);
		br11.setColumns(20);
		br11.setFont(new Font("Calibri", 0, 12));
		br11.setLineWrap(true);
		br11.setRows(3);
		br11.setAlignmentY(0.2F);
		br11.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br11.setFocusTraversalPolicyProvider(true);
		br11.setName("1");
		br11.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br11MousePressed(evt);
			  }
			});
		br11.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br11KeyTyped(evt);
			  }
			});
		br12.setEditable(false);
		br12.setColumns(20);
		br12.setFont(new Font("Calibri", 0, 12));
		br12.setLineWrap(true);
		br12.setRows(3);
		br12.setAlignmentY(0.2F);
		br12.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br12.setFocusTraversalPolicyProvider(true);
		br12.setName("1");
		br12.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br12MousePressed(evt);
			  }
			});
		br12.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br12KeyTyped(evt);
			  }
			});
		br19.setEditable(false);
		br19.setColumns(20);
		br19.setFont(new Font("Calibri", 0, 12));
		br19.setLineWrap(true);
		br19.setRows(3);
		br19.setAlignmentY(0.2F);
		br19.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br19.setFocusTraversalPolicyProvider(true);
		br19.setName("1");
		br19.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br19MousePressed(evt);
			  }
			});
		br19.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br19KeyTyped(evt);
			  }
			});
		br20.setEditable(false);
		br20.setColumns(20);
		br20.setFont(new Font("Calibri", 0, 12));
		br20.setLineWrap(true);
		br20.setRows(3);
		br20.setText("9");
		br20.setAlignmentY(0.2F);
		br20.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br20.setFocusTraversalPolicyProvider(true);
		br20.setName("1");
		br20.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br20MousePressed(evt);
			  }
			});
		br20.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br20KeyTyped(evt);
			  }
			});
		br21.setEditable(false);
		br21.setColumns(20);
		br21.setFont(new Font("Calibri", 0, 12));
		br21.setLineWrap(true);
		br21.setRows(3);
		br21.setAlignmentY(0.2F);
		br21.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br21.setFocusTraversalPolicyProvider(true);
		br21.setName("1");
		br21.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br21MousePressed(evt);
			  }
			});
		br21.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br21KeyTyped(evt);
			  }
			});
		GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
		this.jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel3Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
				  .addComponent(br1, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br2, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br3, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
					  .addComponent(br19, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br20, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br21, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
					  .addComponent(br10, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br11, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br12, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel3Layout.setVerticalGroup(jPanel3Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel3Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br3, -2, 50, -2)
				.addComponent(br1, -2, 50, -2)
				.addComponent(br2, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br12, -2, 50, -2)
				.addComponent(br10, -2, 50, -2)
				.addComponent(br11, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br21, -2, 50, -2)
				.addComponent(br19, -2, 50, -2)
				.addComponent(br20, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel4.setPreferredSize(new Dimension(150, 152));
		br4.setEditable(false);
		br4.setColumns(20);
		br4.setFont(new Font("Calibri", 0, 12));
		br4.setLineWrap(true);
		br4.setRows(3);
		br4.setAlignmentY(0.2F);
		br4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br4.setFocusTraversalPolicyProvider(true);
		br4.setName("1");
		br4.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br4MousePressed(evt);
			  }
			});
		br4.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br4KeyTyped(evt);
			  }
			});
		br5.setEditable(false);
		br5.setColumns(20);
		br5.setFont(new Font("Calibri", 0, 12));
		br5.setLineWrap(true);
		br5.setRows(3);
		br5.setText("1");
		br5.setAlignmentY(0.2F);
		br5.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br5.setFocusTraversalPolicyProvider(true);
		br5.setName("1");
		br5.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br5MousePressed(evt);
			  }
			});
		br5.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br5KeyTyped(evt);
			  }
			});
		br6.setEditable(false);
		br6.setColumns(20);
		br6.setFont(new Font("Calibri", 0, 12));
		br6.setLineWrap(true);
		br6.setRows(3);
		br6.setAlignmentY(0.2F);
		br6.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br6.setFocusTraversalPolicyProvider(true);
		br6.setName("1");
		br6.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br6MousePressed(evt);
			  }
			});
		br6.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br6KeyTyped(evt);
			  }
			});
		br13.setEditable(false);
		br13.setColumns(20);
		br13.setFont(new Font("Calibri", 0, 12));
		br13.setLineWrap(true);
		br13.setRows(3);
		br13.setAlignmentY(0.2F);
		br13.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br13.setFocusTraversalPolicyProvider(true);
		br13.setName("1");
		br13.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br13MousePressed(evt);
			  }
			});
		br13.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br13KeyTyped(evt);
			  }
			});
		br14.setEditable(false);
		br14.setColumns(20);
		br14.setFont(new Font("Calibri", 0, 12));
		br14.setLineWrap(true);
		br14.setRows(3);
		br14.setAlignmentY(0.2F);
		br14.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br14.setFocusTraversalPolicyProvider(true);
		br14.setName("1");
		br14.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br14MousePressed(evt);
			  }
			});
		br14.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br14KeyTyped(evt);
			  }
			});
		br15.setEditable(false);
		br15.setColumns(20);
		br15.setFont(new Font("Calibri", 0, 12));
		br15.setLineWrap(true);
		br15.setRows(3);
		br15.setText("2");
		br15.setAlignmentY(0.2F);
		br15.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br15.setFocusTraversalPolicyProvider(true);
		br15.setName("1");
		br15.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br15MousePressed(evt);
			  }
			});
		br15.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br15KeyTyped(evt);
			  }
			});
		br22.setEditable(false);
		br22.setColumns(20);
		br22.setFont(new Font("Calibri", 0, 12));
		br22.setLineWrap(true);
		br22.setRows(3);
		br22.setAlignmentY(0.2F);
		br22.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br22.setFocusTraversalPolicyProvider(true);
		br22.setName("1");
		br22.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br22MousePressed(evt);
			  }
			});
		br22.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br22KeyTyped(evt);
			  }
			});
		br23.setEditable(false);
		br23.setColumns(20);
		br23.setFont(new Font("Calibri", 0, 12));
		br23.setLineWrap(true);
		br23.setRows(3);
		br23.setAlignmentY(0.2F);
		br23.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br23.setFocusTraversalPolicyProvider(true);
		br23.setName("1");
		br23.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br23MousePressed(evt);
			  }
			});
		br23.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br23KeyTyped(evt);
			  }
			});
		br24.setEditable(false);
		br24.setColumns(20);
		br24.setFont(new Font("Calibri", 0, 12));
		br24.setLineWrap(true);
		br24.setRows(3);
		br24.setAlignmentY(0.2F);
		br24.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br24.setFocusTraversalPolicyProvider(true);
		br24.setName("1");
		br24.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br24MousePressed(evt);
			  }
			});
		br24.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br24KeyTyped(evt);
			  }
			});
		GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
		this.jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel4Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
				  .addComponent(br4, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br5, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br6, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
					  .addComponent(br22, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br23, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br24, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
					  .addComponent(br13, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br14, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br15, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel4Layout.setVerticalGroup(jPanel4Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel4Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br6, -2, 50, -2)
				.addComponent(br4, -2, 50, -2)
				.addComponent(br5, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br15, -2, 50, -2)
				.addComponent(br13, -2, 50, -2)
				.addComponent(br14, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br24, -2, 50, -2)
				.addComponent(br22, -2, 50, -2)
				.addComponent(br23, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel5.setPreferredSize(new Dimension(150, 152));
		br7.setEditable(false);
		br7.setColumns(20);
		br7.setFont(new Font("Calibri", 0, 12));
		br7.setLineWrap(true);
		br7.setRows(3);
		br7.setText(" 1");
		br7.setAlignmentY(0.2F);
		br7.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br7.setFocusTraversalPolicyProvider(true);
		br7.setName("1");
		br7.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br7MousePressed(evt);
			  }
			});
		br7.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br7KeyTyped(evt);
			  }
			});
		br8.setEditable(false);
		br8.setColumns(20);
		br8.setFont(new Font("Calibri", 0, 12));
		br8.setLineWrap(true);
		br8.setRows(3);
		br8.setAlignmentY(0.2F);
		br8.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br8.setFocusTraversalPolicyProvider(true);
		br8.setName("1");
		br8.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br8MousePressed(evt);
			  }
			});
		br8.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br8KeyTyped(evt);
			  }
			});
		br9.setEditable(false);
		br9.setColumns(20);
		br9.setFont(new Font("Calibri", 0, 12));
		br9.setLineWrap(true);
		br9.setRows(3);
		br9.setText("3 6");
		br9.setAlignmentY(0.2F);
		br9.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br9.setFocusTraversalPolicyProvider(true);
		br9.setName("1");
		br9.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br9MousePressed(evt);
			  }
			});
		br9.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br9KeyTyped(evt);
			  }
			});
		br16.setEditable(false);
		br16.setColumns(20);
		br16.setFont(new Font("Calibri", 0, 12));
		br16.setLineWrap(true);
		br16.setRows(3);
		br16.setAlignmentY(0.2F);
		br16.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br16.setFocusTraversalPolicyProvider(true);
		br16.setName("1");
		br16.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br16MousePressed(evt);
			  }
			});
		br16.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br16KeyTyped(evt);
			  }
			});
		br17.setEditable(false);
		br17.setColumns(20);
		br17.setFont(new Font("Calibri", 0, 12));
		br17.setLineWrap(true);
		br17.setRows(3);
		br17.setAlignmentY(0.2F);
		br17.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br17.setFocusTraversalPolicyProvider(true);
		br17.setName("1");
		br17.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br17MousePressed(evt);
			  }
			});
		br17.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br17KeyTyped(evt);
			  }
			});
		br18.setEditable(false);
		br18.setColumns(20);
		br18.setFont(new Font("Calibri", 0, 12));
		br18.setLineWrap(true);
		br18.setRows(3);
		br18.setAlignmentY(0.2F);
		br18.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br18.setFocusTraversalPolicyProvider(true);
		br18.setName("1");
		br18.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br18MousePressed(evt);
			  }
			});
		br18.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br18KeyTyped(evt);
			  }
			});
		br25.setEditable(false);
		br25.setColumns(20);
		br25.setFont(new Font("Calibri", 0, 12));
		br25.setLineWrap(true);
		br25.setRows(3);
		br25.setAlignmentY(0.2F);
		br25.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br25.setFocusTraversalPolicyProvider(true);
		br25.setName("1");
		br25.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br25MousePressed(evt);
			  }
			});
		br25.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br25KeyTyped(evt);
			  }
			});
		br26.setEditable(false);
		br26.setColumns(20);
		br26.setFont(new Font("Calibri", 0, 12));
		br26.setLineWrap(true);
		br26.setRows(3);
		br26.setAlignmentY(0.2F);
		br26.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br26.setFocusTraversalPolicyProvider(true);
		br26.setName("1");
		br26.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br26MousePressed(evt);
			  }
			});
		br26.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br26KeyTyped(evt);
			  }
			});
		br27.setEditable(false);
		br27.setColumns(20);
		br27.setFont(new Font("Calibri", 0, 12));
		br27.setLineWrap(true);
		br27.setRows(3);
		br27.setAlignmentY(0.2F);
		br27.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br27.setFocusTraversalPolicyProvider(true);
		br27.setName("1");
		br27.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br27MousePressed(evt);
			  }
			});
		br27.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br27KeyTyped(evt);
			  }
			});
		GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
		this.jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel5Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup()
				  .addComponent(br7, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br8, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br9, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
					  .addComponent(br25, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br26, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br27, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
					  .addComponent(br16, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br17, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br18, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel5Layout.setVerticalGroup(jPanel5Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel5Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br9, -2, 50, -2)
				.addComponent(br7, -2, 50, -2)
				.addComponent(br8, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br18, -2, 50, -2)
				.addComponent(br16, -2, 50, -2)
				.addComponent(br17, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br27, -2, 50, -2)
				.addComponent(br25, -2, 50, -2)
				.addComponent(br26, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel6.setPreferredSize(new Dimension(150, 152));
		br28.setEditable(false);
		br28.setColumns(20);
		br28.setFont(new Font("Calibri", 0, 12));
		br28.setLineWrap(true);
		br28.setRows(3);
		br28.setAlignmentY(0.2F);
		br28.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br28.setFocusTraversalPolicyProvider(true);
		br28.setName("1");
		br28.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br28MousePressed(evt);
			  }
			});
		br28.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br28KeyTyped(evt);
			  }
			});
		br29.setEditable(false);
		br29.setColumns(20);
		br29.setFont(new Font("Calibri", 0, 12));
		br29.setLineWrap(true);
		br29.setRows(3);
		br29.setAlignmentY(0.2F);
		br29.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br29.setFocusTraversalPolicyProvider(true);
		br29.setName("1");
		br29.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br29MousePressed(evt);
			  }
			});
		br29.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br29KeyTyped(evt);
			  }
			});
		br30.setEditable(false);
		br30.setColumns(20);
		br30.setFont(new Font("Calibri", 0, 12));
		br30.setLineWrap(true);
		br30.setRows(3);
		br30.setAlignmentY(0.2F);
		br30.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br30.setFocusTraversalPolicyProvider(true);
		br30.setName("1");
		br30.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br30MousePressed(evt);
			  }
			});
		br30.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br30KeyTyped(evt);
			  }
			});
		br37.setEditable(false);
		br37.setColumns(20);
		br37.setFont(new Font("Calibri", 0, 12));
		br37.setLineWrap(true);
		br37.setRows(3);
		br37.setAlignmentY(0.2F);
		br37.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br37.setFocusTraversalPolicyProvider(true);
		br37.setName("1");
		br37.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br37MousePressed(evt);
			  }
			});
		br37.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br37KeyTyped(evt);
			  }
			});
		br38.setEditable(false);
		br38.setColumns(20);
		br38.setFont(new Font("Calibri", 0, 12));
		br38.setLineWrap(true);
		br38.setRows(3);
		br38.setText(" 1");
		br38.setAlignmentY(0.2F);
		br38.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br38.setFocusTraversalPolicyProvider(true);
		br38.setName("1");
		br38.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br38MousePressed(evt);
			  }
			});
		br38.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br38KeyTyped(evt);
			  }
			});
		br39.setEditable(false);
		br39.setColumns(20);
		br39.setFont(new Font("Calibri", 0, 12));
		br39.setLineWrap(true);
		br39.setRows(3);
		br39.setAlignmentY(0.2F);
		br39.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br39.setFocusTraversalPolicyProvider(true);
		br39.setName("1");
		br39.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br39MousePressed(evt);
			  }
			});
		br39.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br39KeyTyped(evt);
			  }
			});
		br46.setEditable(false);
		br46.setColumns(20);
		br46.setFont(new Font("Calibri", 0, 12));
		br46.setLineWrap(true);
		br46.setRows(3);
		br46.setAlignmentY(0.2F);
		br46.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br46.setFocusTraversalPolicyProvider(true);
		br46.setName("1");
		br46.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br46MousePressed(evt);
			  }
			});
		br46.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br46KeyTyped(evt);
			  }
			});
		br47.setEditable(false);
		br47.setColumns(20);
		br47.setFont(new Font("Calibri", 0, 12));
		br47.setLineWrap(true);
		br47.setRows(3);
		br47.setAlignmentY(0.2F);
		br47.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br47.setFocusTraversalPolicyProvider(true);
		br47.setName("1");
		br47.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br47MousePressed(evt);
			  }
			});
		br47.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br47KeyTyped(evt);
			  }
			});
		br48.setEditable(false);
		br48.setColumns(20);
		br48.setFont(new Font("Calibri", 0, 12));
		br48.setLineWrap(true);
		br48.setRows(3);
		br48.setAlignmentY(0.2F);
		br48.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br48.setFocusTraversalPolicyProvider(true);
		br48.setName("1");
		br48.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br48MousePressed(evt);
			  }
			});
		br48.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br48KeyTyped(evt);
			  }
			});
		GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
		this.jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel6Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
				  .addComponent(br28, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br29, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br30, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
					  .addComponent(br46, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br47, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br48, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
					  .addComponent(br37, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br38, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br39, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel6Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br30, -2, 50, -2)
				.addComponent(br28, -2, 50, -2)
				.addComponent(br29, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br39, -2, 50, -2)
				.addComponent(br37, -2, 50, -2)
				.addComponent(br38, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br48, -2, 50, -2)
				.addComponent(br46, -2, 50, -2)
				.addComponent(br47, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel7.setPreferredSize(new Dimension(150, 152));
		br31.setEditable(false);
		br31.setColumns(20);
		br31.setFont(new Font("Calibri", 0, 12));
		br31.setLineWrap(true);
		br31.setRows(3);
		br31.setText(" 5 6 9");
		br31.setAlignmentY(0.2F);
		br31.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br31.setFocusTraversalPolicyProvider(true);
		br31.setName("1");
		br31.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br31MousePressed(evt);
			  }
			});
		br31.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br31KeyTyped(evt);
			  }
			});
		br32.setEditable(false);
		br32.setColumns(20);
		br32.setFont(new Font("Calibri", 0, 12));
		br32.setLineWrap(true);
		br32.setRows(3);
		br32.setAlignmentY(0.2F);
		br32.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br32.setFocusTraversalPolicyProvider(true);
		br32.setName("1");
		br32.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br32MousePressed(evt);
			  }
			});
		br32.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br32KeyTyped(evt);
			  }
			});
		br33.setEditable(false);
		br33.setColumns(20);
		br33.setFont(new Font("Calibri", 0, 12));
		br33.setLineWrap(true);
		br33.setRows(3);
		br33.setAlignmentY(0.2F);
		br33.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br33.setFocusTraversalPolicyProvider(true);
		br33.setName("1");
		br33.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br33MousePressed(evt);
			  }
			});
		br33.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br33KeyTyped(evt);
			  }
			});
		br40.setEditable(false);
		br40.setColumns(20);
		br40.setFont(new Font("Calibri", 0, 12));
		br40.setLineWrap(true);
		br40.setRows(3);
		br40.setAlignmentY(0.2F);
		br40.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br40.setFocusTraversalPolicyProvider(true);
		br40.setName("1");
		br40.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br40MousePressed(evt);
			  }
			});
		br40.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br40KeyTyped(evt);
			  }
			});
		br41.setEditable(false);
		br41.setColumns(20);
		br41.setFont(new Font("Calibri", 0, 12));
		br41.setLineWrap(true);
		br41.setRows(3);
		br41.setText("2 4 8");
		br41.setAlignmentY(0.2F);
		br41.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br41.setFocusTraversalPolicyProvider(true);
		br41.setName("1");
		br41.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br41MousePressed(evt);
			  }
			});
		br41.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br41KeyTyped(evt);
			  }
			});
		br42.setEditable(false);
		br42.setColumns(20);
		br42.setFont(new Font("Calibri", 0, 12));
		br42.setLineWrap(true);
		br42.setRows(3);
		br42.setAlignmentY(0.2F);
		br42.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br42.setFocusTraversalPolicyProvider(true);
		br42.setName("1");
		br42.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br42MousePressed(evt);
			  }
			});
		br42.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br42KeyTyped(evt);
			  }
			});
		br49.setEditable(false);
		br49.setColumns(20);
		br49.setFont(new Font("Calibri", 0, 12));
		br49.setLineWrap(true);
		br49.setRows(3);
		br49.setAlignmentY(0.2F);
		br49.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br49.setFocusTraversalPolicyProvider(true);
		br49.setName("1");
		br49.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br49MousePressed(evt);
			  }
			});
		br49.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br49KeyTyped(evt);
			  }
			});
		br50.setEditable(false);
		br50.setColumns(20);
		br50.setFont(new Font("Calibri", 0, 12));
		br50.setLineWrap(true);
		br50.setRows(3);
		br50.setAlignmentY(0.2F);
		br50.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br50.setFocusTraversalPolicyProvider(true);
		br50.setName("1");
		br50.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br50MousePressed(evt);
			  }
			});
		br50.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br50KeyTyped(evt);
			  }
			});
		br51.setEditable(false);
		br51.setColumns(20);
		br51.setFont(new Font("Calibri", 0, 12));
		br51.setLineWrap(true);
		br51.setRows(3);
		br51.setAlignmentY(0.2F);
		br51.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br51.setFocusTraversalPolicyProvider(true);
		br51.setName("1");
		br51.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br51MousePressed(evt);
			  }
			});
		br51.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br51KeyTyped(evt);
			  }
			});
		GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
		this.jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel7Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
				  .addComponent(br31, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br32, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br33, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
					  .addComponent(br49, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br50, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br51, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
					  .addComponent(br40, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br41, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br42, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel7Layout.setVerticalGroup(jPanel7Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel7Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br33, -2, 50, -2)
				.addComponent(br31, -2, 50, -2)
				.addComponent(br32, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br42, -2, 50, -2)
				.addComponent(br40, -2, 50, -2)
				.addComponent(br41, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br51, -2, 50, -2)
				.addComponent(br49, -2, 50, -2)
				.addComponent(br50, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel8.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel8.setPreferredSize(new Dimension(150, 152));
		br34.setEditable(false);
		br34.setColumns(20);
		br34.setFont(new Font("Calibri", 0, 12));
		br34.setLineWrap(true);
		br34.setRows(3);
		br34.setAlignmentY(0.2F);
		br34.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br34.setFocusTraversalPolicyProvider(true);
		br34.setName("1");
		br34.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br34MousePressed(evt);
			  }
			});
		br34.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br34KeyTyped(evt);
			  }
			});
		br35.setEditable(false);
		br35.setColumns(20);
		br35.setFont(new Font("Calibri", 0, 12));
		br35.setLineWrap(true);
		br35.setRows(3);
		br35.setText("1");
		br35.setAlignmentY(0.2F);
		br35.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br35.setFocusTraversalPolicyProvider(true);
		br35.setName("1");
		br35.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br35MousePressed(evt);
			  }
			});
		br35.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br35KeyTyped(evt);
			  }
			});
		br36.setEditable(false);
		br36.setColumns(20);
		br36.setFont(new Font("Calibri", 0, 12));
		br36.setLineWrap(true);
		br36.setRows(3);
		br36.setAlignmentY(0.2F);
		br36.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br36.setFocusTraversalPolicyProvider(true);
		br36.setName("1");
		br36.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br36MousePressed(evt);
			  }
			});
		br36.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br36KeyTyped(evt);
			  }
			});
		br43.setEditable(false);
		br43.setColumns(20);
		br43.setFont(new Font("Calibri", 0, 12));
		br43.setLineWrap(true);
		br43.setRows(3);
		br43.setAlignmentY(0.2F);
		br43.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br43.setFocusTraversalPolicyProvider(true);
		br43.setName("1");
		br43.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br43MousePressed(evt);
			  }
			});
		br43.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br43KeyTyped(evt);
			  }
			});
		br44.setEditable(false);
		br44.setColumns(20);
		br44.setFont(new Font("Calibri", 0, 12));
		br44.setLineWrap(true);
		br44.setRows(3);
		br44.setAlignmentY(0.2F);
		br44.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br44.setFocusTraversalPolicyProvider(true);
		br44.setName("1");
		br44.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br44MousePressed(evt);
			  }
			});
		br44.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br44KeyTyped(evt);
			  }
			});
		br45.setEditable(false);
		br45.setColumns(20);
		br45.setFont(new Font("Calibri", 0, 12));
		br45.setLineWrap(true);
		br45.setRows(3);
		br45.setAlignmentY(0.2F);
		br45.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br45.setFocusTraversalPolicyProvider(true);
		br45.setName("1");
		br45.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br45MousePressed(evt);
			  }
			});
		br45.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br45KeyTyped(evt);
			  }
			});
		br52.setEditable(false);
		br52.setColumns(20);
		br52.setFont(new Font("Calibri", 0, 12));
		br52.setLineWrap(true);
		br52.setRows(3);
		br52.setAlignmentY(0.2F);
		br52.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br52.setFocusTraversalPolicyProvider(true);
		br52.setName("1");
		br52.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br52MousePressed(evt);
			  }
			});
		br52.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br52KeyTyped(evt);
			  }
			});
		br53.setEditable(false);
		br53.setColumns(20);
		br53.setFont(new Font("Calibri", 0, 12));
		br53.setLineWrap(true);
		br53.setRows(3);
		br53.setAlignmentY(0.2F);
		br53.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br53.setFocusTraversalPolicyProvider(true);
		br53.setName("1");
		br53.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br53MousePressed(evt);
			  }
			});
		br53.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br53KeyTyped(evt);
			  }
			});
		br54.setEditable(false);
		br54.setColumns(20);
		br54.setFont(new Font("Calibri", 0, 12));
		br54.setLineWrap(true);
		br54.setRows(3);
		br54.setText("1");
		br54.setAlignmentY(0.2F);
		br54.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br54.setFocusTraversalPolicyProvider(true);
		br54.setName("1");
		br54.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br54MousePressed(evt);
			  }
			});
		br54.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br54KeyTyped(evt);
			  }
			});
		GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
		this.jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel8Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel8Layout.createSequentialGroup()
				  .addComponent(br34, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br35, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br36, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
					  .addComponent(br52, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br53, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br54, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
					  .addComponent(br43, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br44, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br45, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel8Layout.setVerticalGroup(jPanel8Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel8Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br36, -2, 50, -2)
				.addComponent(br34, -2, 50, -2)
				.addComponent(br35, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br45, -2, 50, -2)
				.addComponent(br43, -2, 50, -2)
				.addComponent(br44, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br54, -2, 50, -2)
				.addComponent(br52, -2, 50, -2)
				.addComponent(br53, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel9.setPreferredSize(new Dimension(150, 152));
		br55.setEditable(false);
		br55.setColumns(20);
		br55.setFont(new Font("Calibri", 0, 12));
		br55.setLineWrap(true);
		br55.setRows(3);
		br55.setText("1");
		br55.setAlignmentY(0.2F);
		br55.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br55.setFocusTraversalPolicyProvider(true);
		br55.setName("1");
		br55.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br55MousePressed(evt);
			  }
			});
		br55.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br55KeyTyped(evt);
			  }
			});
		br56.setEditable(false);
		br56.setColumns(20);
		br56.setFont(new Font("Calibri", 0, 12));
		br56.setLineWrap(true);
		br56.setRows(3);
		br56.setAlignmentY(0.2F);
		br56.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br56.setFocusTraversalPolicyProvider(true);
		br56.setName("1");
		br56.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br56MousePressed(evt);
			  }
			});
		br56.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br56KeyTyped(evt);
			  }
			});
		br57.setEditable(false);
		br57.setColumns(20);
		br57.setFont(new Font("Calibri", 0, 12));
		br57.setLineWrap(true);
		br57.setRows(3);
		br57.setAlignmentY(0.2F);
		br57.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br57.setFocusTraversalPolicyProvider(true);
		br57.setName("1");
		br57.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br57MousePressed(evt);
			  }
			});
		br57.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br57KeyTyped(evt);
			  }
			});
		br64.setEditable(false);
		br64.setColumns(20);
		br64.setFont(new Font("Calibri", 0, 12));
		br64.setLineWrap(true);
		br64.setRows(3);
		br64.setAlignmentY(0.2F);
		br64.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br64.setFocusTraversalPolicyProvider(true);
		br64.setName("1");
		br64.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br64MousePressed(evt);
			  }
			});
		br64.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br64KeyTyped(evt);
			  }
			});
		br65.setEditable(false);
		br65.setColumns(20);
		br65.setFont(new Font("Calibri", 0, 12));
		br65.setLineWrap(true);
		br65.setRows(3);
		br65.setAlignmentY(0.2F);
		br65.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br65.setFocusTraversalPolicyProvider(true);
		br65.setName("1");
		br65.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br65MousePressed(evt);
			  }
			});
		br65.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br65KeyTyped(evt);
			  }
			});
		br66.setEditable(false);
		br66.setColumns(20);
		br66.setFont(new Font("Calibri", 0, 12));
		br66.setLineWrap(true);
		br66.setRows(3);
		br66.setAlignmentY(0.2F);
		br66.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br66.setFocusTraversalPolicyProvider(true);
		br66.setName("1");
		br66.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br66MousePressed(evt);
			  }
			});
		br66.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br66KeyTyped(evt);
			  }
			});
		br73.setEditable(false);
		br73.setColumns(20);
		br73.setFont(new Font("Calibri", 0, 12));
		br73.setLineWrap(true);
		br73.setRows(3);
		br73.setAlignmentY(0.2F);
		br73.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br73.setFocusTraversalPolicyProvider(true);
		br73.setName("1");
		br73.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br73MousePressed(evt);
			  }
			});
		br73.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br73KeyTyped(evt);
			  }
			});
		br74.setEditable(false);
		br74.setColumns(20);
		br74.setFont(new Font("Calibri", 0, 12));
		br74.setLineWrap(true);
		br74.setRows(3);
		br74.setAlignmentY(0.2F);
		br74.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br74.setFocusTraversalPolicyProvider(true);
		br74.setName("1");
		br74.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br74MousePressed(evt);
			  }
			});
		br74.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br74KeyTyped(evt);
			  }
			});
		br75.setEditable(false);
		br75.setColumns(20);
		br75.setFont(new Font("Calibri", 0, 12));
		br75.setLineWrap(true);
		br75.setRows(3);
		br75.setAlignmentY(0.2F);
		br75.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br75.setFocusTraversalPolicyProvider(true);
		br75.setName("1");
		br75.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br75MousePressed(evt);
			  }
			});
		br75.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br75KeyTyped(evt);
			  }
			});
		GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
		this.jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel9Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup()
				  .addComponent(br55, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br56, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br57, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
					  .addComponent(br73, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br74, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br75, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
					  .addComponent(br64, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br65, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br66, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel9Layout.setVerticalGroup(jPanel9Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel9Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br57, -2, 50, -2)
				.addComponent(br55, -2, 50, -2)
				.addComponent(br56, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br66, -2, 50, -2)
				.addComponent(br64, -2, 50, -2)
				.addComponent(br65, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br75, -2, 50, -2)
				.addComponent(br73, -2, 50, -2)
				.addComponent(br74, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel10.setPreferredSize(new Dimension(150, 152));
		br58.setEditable(false);
		br58.setColumns(20);
		br58.setFont(new Font("Calibri", 0, 12));
		br58.setLineWrap(true);
		br58.setRows(3);
		br58.setText("3");
		br58.setAlignmentY(0.2F);
		br58.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br58.setFocusTraversalPolicyProvider(true);
		br58.setName("1");
		br58.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br58MousePressed(evt);
			  }
			});
		br58.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br58KeyTyped(evt);
			  }
			});
		br59.setEditable(false);
		br59.setColumns(20);
		br59.setFont(new Font("Calibri", 0, 12));
		br59.setLineWrap(true);
		br59.setRows(3);
		br59.setAlignmentY(0.2F);
		br59.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br59.setFocusTraversalPolicyProvider(true);
		br59.setName("1");
		br59.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br59MousePressed(evt);
			  }
			});
		br59.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br59KeyTyped(evt);
			  }
			});
		br60.setEditable(false);
		br60.setColumns(20);
		br60.setFont(new Font("Calibri", 0, 12));
		br60.setLineWrap(true);
		br60.setRows(3);
		br60.setAlignmentY(0.2F);
		br60.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br60.setFocusTraversalPolicyProvider(true);
		br60.setName("1");
		br60.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br60MousePressed(evt);
			  }
			});
		br60.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br60KeyTyped(evt);
			  }
			});
		br67.setEditable(false);
		br67.setColumns(20);
		br67.setFont(new Font("Calibri", 0, 12));
		br67.setLineWrap(true);
		br67.setRows(3);
		br67.setText("9");
		br67.setAlignmentY(0.2F);
		br67.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br67.setFocusTraversalPolicyProvider(true);
		br67.setName("1");
		br67.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br67MousePressed(evt);
			  }
			});
		br67.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br67KeyTyped(evt);
			  }
			});
		br68.setEditable(false);
		br68.setColumns(20);
		br68.setFont(new Font("Calibri", 0, 12));
		br68.setLineWrap(true);
		br68.setRows(3);
		br68.setAlignmentY(0.2F);
		br68.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br68.setFocusTraversalPolicyProvider(true);
		br68.setName("1");
		br68.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br68MousePressed(evt);
			  }
			});
		br68.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br68KeyTyped(evt);
			  }
			});
		br69.setEditable(false);
		br69.setColumns(20);
		br69.setFont(new Font("Calibri", 0, 12));
		br69.setLineWrap(true);
		br69.setRows(3);
		br69.setAlignmentY(0.2F);
		br69.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br69.setFocusTraversalPolicyProvider(true);
		br69.setName("1");
		br69.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br69MousePressed(evt);
			  }
			});
		br69.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br69KeyTyped(evt);
			  }
			});
		br76.setEditable(false);
		br76.setColumns(20);
		br76.setFont(new Font("Calibri", 0, 12));
		br76.setLineWrap(true);
		br76.setRows(3);
		br76.setAlignmentY(0.2F);
		br76.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br76.setFocusTraversalPolicyProvider(true);
		br76.setName("1");
		br76.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br76MousePressed(evt);
			  }
			});
		br76.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br76KeyTyped(evt);
			  }
			});
		br77.setEditable(false);
		br77.setColumns(20);
		br77.setFont(new Font("Calibri", 0, 12));
		br77.setLineWrap(true);
		br77.setRows(3);
		br77.setText("5");
		br77.setAlignmentY(0.2F);
		br77.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br77.setFocusTraversalPolicyProvider(true);
		br77.setName("1");
		br77.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br77MousePressed(evt);
			  }
			});
		br77.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br77KeyTyped(evt);
			  }
			});
		br78.setEditable(false);
		br78.setColumns(20);
		br78.setFont(new Font("Calibri", 0, 12));
		br78.setLineWrap(true);
		br78.setRows(3);
		br78.setAlignmentY(0.2F);
		br78.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br78.setFocusTraversalPolicyProvider(true);
		br78.setName("1");
		br78.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br78MousePressed(evt);
			  }
			});
		br78.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br78KeyTyped(evt);
			  }
			});
		GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
		this.jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel10Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
				  .addComponent(br58, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br59, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br60, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
					  .addComponent(br76, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br77, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br78, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
					  .addComponent(br67, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br68, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br69, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel10Layout.setVerticalGroup(jPanel10Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel10Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br60, -2, 50, -2)
				.addComponent(br58, -2, 50, -2)
				.addComponent(br59, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br69, -2, 50, -2)
				.addComponent(br67, -2, 50, -2)
				.addComponent(br68, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br78, -2, 50, -2)
				.addComponent(br76, -2, 50, -2)
				.addComponent(br77, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		this.jPanel11.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel11.setPreferredSize(new Dimension(150, 152));
		br61.setEditable(false);
		br61.setColumns(20);
		br61.setFont(new Font("Calibri", 0, 12));
		br61.setLineWrap(true);
		br61.setRows(3);
		br61.setText("8");
		br61.setAlignmentY(0.2F);
		br61.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br61.setFocusTraversalPolicyProvider(true);
		br61.setName("1");
		br61.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br61MousePressed(evt);
			  }
			});
		br61.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br61KeyTyped(evt);
			  }
			});
		br62.setEditable(false);
		br62.setColumns(20);
		br62.setFont(new Font("Calibri", 0, 12));
		br62.setLineWrap(true);
		br62.setRows(3);
		br62.setAlignmentY(0.2F);
		br62.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br62.setFocusTraversalPolicyProvider(true);
		br62.setName("1");
		br62.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br62MousePressed(evt);
			  }
			});
		br62.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br62KeyTyped(evt);
			  }
			});
		br63.setEditable(false);
		br63.setColumns(20);
		br63.setFont(new Font("Calibri", 0, 12));
		br63.setLineWrap(true);
		br63.setRows(3);
		br63.setAlignmentY(0.2F);
		br63.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br63.setFocusTraversalPolicyProvider(true);
		br63.setName("1");
		br63.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br63MousePressed(evt);
			  }
			});
		br63.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br63KeyTyped(evt);
			  }
			});
		br70.setEditable(false);
		br70.setColumns(20);
		br70.setFont(new Font("Calibri", 0, 12));
		br70.setLineWrap(true);
		br70.setRows(3);
		br70.setAlignmentY(0.2F);
		br70.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br70.setFocusTraversalPolicyProvider(true);
		br70.setName("1");
		br70.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br70MousePressed(evt);
			  }
			});
		br70.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br70KeyTyped(evt);
			  }
			});
		br71.setEditable(false);
		br71.setColumns(20);
		br71.setFont(new Font("Calibri", 0, 12));
		br71.setLineWrap(true);
		br71.setRows(3);
		br71.setText("5");
		br71.setAlignmentY(0.2F);
		br71.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br71.setFocusTraversalPolicyProvider(true);
		br71.setName("1");
		br71.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br71MousePressed(evt);
			  }
			});
		br71.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br71KeyTyped(evt);
			  }
			});
		br72.setEditable(false);
		br72.setColumns(20);
		br72.setFont(new Font("Calibri", 0, 12));
		br72.setLineWrap(true);
		br72.setRows(3);
		br72.setAlignmentY(0.2F);
		br72.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br72.setFocusTraversalPolicyProvider(true);
		br72.setName("1");
		br72.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br72MousePressed(evt);
			  }
			});
		br72.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br72KeyTyped(evt);
			  }
			});
		br79.setEditable(false);
		br79.setColumns(20);
		br79.setFont(new Font("Calibri", 0, 12));
		br79.setLineWrap(true);
		br79.setRows(3);
		br79.setAlignmentY(0.2F);
		br79.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br79.setFocusTraversalPolicyProvider(true);
		br79.setName("1");
		br79.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br79MousePressed(evt);
			  }
			});
		br79.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br79KeyTyped(evt);
			  }
			});
		br80.setEditable(false);
		br80.setColumns(20);
		br80.setFont(new Font("Calibri", 0, 12));
		br80.setLineWrap(true);
		br80.setRows(3);
		br80.setAlignmentY(0.2F);
		br80.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br80.setFocusTraversalPolicyProvider(true);
		br80.setName("1");
		br80.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br80MousePressed(evt);
			  }
			});
		br80.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br80KeyTyped(evt);
			  }
			});
		br81.setEditable(false);
		br81.setColumns(20);
		br81.setFont(new Font("Calibri", 0, 12));
		br81.setLineWrap(true);
		br81.setRows(3);
		br81.setText("2");
		br81.setAlignmentY(0.2F);
		br81.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		br81.setFocusTraversalPolicyProvider(true);
		br81.setName("1");
		br81.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.br81MousePressed(evt);
			  }
			});
		br81.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_3_sudoku9x9.this.br81KeyTyped(evt);
			  }
			});
		GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
		this.jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout.setHorizontalGroup(jPanel11Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel11Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup()
				  .addComponent(br61, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br62, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(br63, -2, 50, -2)
				  .addGap(0, 0, 32767))
				.addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
				  .addGap(0, 0, 32767)
				  .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
					  .addComponent(br79, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br80, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br81, -2, 50, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
					  .addComponent(br70, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br71, -2, 50, -2)
					  .addGap(2, 2, 2)
					  .addComponent(br72, -2, 50, -2)))))
			  .addContainerGap()));
		jPanel11Layout.setVerticalGroup(jPanel11Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel11Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br63, -2, 50, -2)
				.addComponent(br61, -2, 50, -2)
				.addComponent(br62, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br72, -2, 50, -2)
				.addComponent(br70, -2, 50, -2)
				.addComponent(br71, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(br81, -2, 50, -2)
				.addComponent(br79, -2, 50, -2)
				.addComponent(br80, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
		this.jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
			  .addComponent(this.jPanel3, -2, 160, -2)
			  .addGap(0, 0, 0)
			  .addComponent(this.jPanel4, -2, 160, -2)
			  .addGap(0, 0, 0)
			  .addComponent(this.jPanel5, -2, 160, -2)
			  .addGap(0, 0, 32767))
			.addGroup(jPanel2Layout.createSequentialGroup()
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
				  .addComponent(this.jPanel6, -2, 160, -2)
				  .addGap(0, 0, 0)
				  .addComponent(this.jPanel7, -2, 160, -2)
				  .addGap(0, 0, 0)
				  .addComponent(this.jPanel8, -2, 160, -2))
				.addGroup(jPanel2Layout.createSequentialGroup()
				  .addComponent(this.jPanel9, -2, 160, -2)
				  .addGap(0, 0, 0)
				  .addComponent(this.jPanel10, -2, 160, -2)
				  .addGap(0, 0, 0)
				  .addComponent(this.jPanel11, -2, 160, -2)))
			  .addContainerGap(-1, 32767)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel4, -2, 160, -2)
				.addComponent(this.jPanel5, -2, 160, -2)
				.addComponent(this.jPanel3, -2, 160, -2))
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel6, -2, 160, -2)
				.addComponent(this.jPanel7, -2, 160, -2)
				.addComponent(this.jPanel8, GroupLayout.Alignment.TRAILING, -2, 160, -2))
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel9, -2, 160, -2)
				.addComponent(this.jPanel10, -2, 160, -2)
				.addComponent(this.jPanel11, -2, 160, -2))
			  .addContainerGap(-1, 32767)));
		GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
			  .addGap(5, 5, 5)
			  .addComponent(this.jPanel2, -2, 484, -2)
			  .addGap(5, 5, 5)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
			  .addGap(5, 5, 5)
			  .addComponent(this.jPanel2, -2, 484, -2)
			  .addGap(5, 5, 5)));
		this.dugmePomoc.setFont(fontDugme);
		this.dugmePomoc.setText("Pomoć");
		this.dugmePomoc.setFocusable(false);
		this.dugmePomoc.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_3_sudoku9x9.this.dugmePomocActionPerformed(evt);
			  }
			});
		reseniBrojLabel.setFont(fontDugme);
		reseniBrojLabel.setHorizontalAlignment(0);
		reseniBrojLabel.setText("--");
		reseniBrojLabel.setBorder(BorderFactory.createBevelBorder(0));
		this.dugme_1.setFont(fontDugme);
		this.dugme_1.setText("1");
		this.dugme_1.setFocusable(false);
		this.dugme_1.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_1MousePressed(evt);
			  }
			});
		this.dugme_2.setFont(fontDugme);
		this.dugme_2.setText("2");
		this.dugme_2.setFocusable(false);
		this.dugme_2.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_2MousePressed(evt);
			  }
			});
		this.dugme_3.setFont(fontDugme);
		this.dugme_3.setText("3");
		this.dugme_3.setFocusable(false);
		this.dugme_3.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_3MousePressed(evt);
			  }
			});
		this.dugme_4.setFont(fontDugme);
		this.dugme_4.setText("4");
		this.dugme_4.setFocusable(false);
		this.dugme_4.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_4MousePressed(evt);
			  }
			});
		this.dugme_5.setFont(fontDugme);
		this.dugme_5.setText("5");
		this.dugme_5.setFocusable(false);
		this.dugme_5.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_5MousePressed(evt);
			  }
			});
		this.dugme_6.setFont(fontDugme);
		this.dugme_6.setText("6");
		this.dugme_6.setFocusable(false);
		this.dugme_6.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_6MousePressed(evt);
			  }
			});
		this.dugme_7.setFont(fontDugme);
		this.dugme_7.setText("7");
		this.dugme_7.setFocusable(false);
		this.dugme_7.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_7MousePressed(evt);
			  }
			});
		this.dugme_8.setFont(fontDugme);
		this.dugme_8.setText("8");
		this.dugme_8.setFocusable(false);
		this.dugme_8.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_8MousePressed(evt);
			  }
			});
		this.dugme_9.setFont(fontDugme);
		this.dugme_9.setText("9");
		this.dugme_9.setFocusable(false);
		this.dugme_9.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.dugme_9MousePressed(evt);
			  }
			});
		this.dugme__.setFont(fontDugme);
		this.dugme__.setText("--");
		this.dugme__.setFocusable(false);
		this.dugme__.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_3_sudoku9x9.this.dugme__ActionPerformed(evt);
			  }
			});
		this.zvukLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOn.png")));
		this.zvukLabel.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.zvukLabelMousePressed(evt);
			  }
			});
		this.pauzaLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/pauza.png")));
		this.pauzaLabel.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_3_sudoku9x9.this.pauzaLabelMousePressed(evt);
			  }
			});
		this.greskaLabel.setFont(fontDugme);
		this.greskaLabel.setHorizontalAlignment(0);
		this.greskaLabel.setText("Greške: 0");
		this.dugmeNazad.setFont(fontDugme);
		this.dugmeNazad.setText("Nazad");
		this.dugmeNazad.setFocusable(false);
		this.dugmeNazad.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_3_sudoku9x9.this.dugmeNazadActionPerformed(evt);
			  }
			});
		GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
		this.jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addComponent(this.jSeparator1, GroupLayout.Alignment.TRAILING)
			.addComponent(this.jSeparator2, GroupLayout.Alignment.TRAILING)
			.addGroup(jPanel13Layout.createSequentialGroup()
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addContainerGap()
				  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(this.dugmePomoc, -1, -1, 32767)
					.addGroup(jPanel13Layout.createSequentialGroup()
					  .addComponent(this.dugme_1, -2, 45, -2)
					  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
					  .addComponent(this.dugme_2, -2, 45, -2))
					.addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
					  .addComponent(this.dugme_3, -2, 45, -2)
					  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
					  .addComponent(this.dugme_4, -2, 45, -2))
					.addGroup(jPanel13Layout.createSequentialGroup()
					  .addComponent(this.dugme_5, -2, 45, -2)
					  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
					  .addComponent(this.dugme_6, -2, 45, -2))
					.addGroup(jPanel13Layout.createSequentialGroup()
					  .addComponent(this.dugme_7, -2, 45, -2)
					  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
					  .addComponent(this.dugme_8, -2, 45, -2))
					.addGroup(jPanel13Layout.createSequentialGroup()
					  .addComponent(this.dugme_9, -2, 45, -2)
					  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
					  .addComponent(this.dugme__, -2, 45, -2))
					.addGroup(jPanel13Layout.createSequentialGroup()
					  .addComponent(this.pauzaLabel, -2, 48, -2)
					  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
					  .addComponent(this.zvukLabel, -2, 32, -2)
					  .addGap(4, 4, 4))))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addGap(30, 30, 30)
				  .addComponent(reseniBrojLabel, -2, 56, -2)
				  .addGap(0, 0, 32767))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addContainerGap()
				  .addComponent(this.greskaLabel, -1, -1, 32767))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addContainerGap()
				  .addComponent(this.dugmeNazad, -1, -1, 32767)))
			  .addContainerGap()));
		jPanel13Layout.setVerticalGroup(jPanel13Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel13Layout.createSequentialGroup()
			  .addContainerGap()
			  .addComponent(this.dugmePomoc, -2, 31, -2)
			  .addGap(18, 18, 18)
			  .addComponent(reseniBrojLabel, -2, 38, -2)
			  .addGap(18, 18, 18)
			  .addComponent(this.jSeparator1, -2, -1, -2)
			  .addGap(8, 8, 8)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_1, -2, 45, -2)
				.addComponent(this.dugme_2, -2, 45, -2))
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_3, -2, 45, -2)
				.addComponent(this.dugme_4, -2, 45, -2))
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_5, -2, 45, -2)
				.addComponent(this.dugme_6, -2, 45, -2))
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_7, -2, 45, -2)
				.addComponent(this.dugme_8, -2, 45, -2))
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_9, -2, 45, -2)
				.addComponent(this.dugme__, -2, 45, -2))
			  .addGap(10, 10, 10)
			  .addComponent(this.jSeparator2, -2, 10, -2)
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.pauzaLabel, -2, 48, -2)
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addGap(9, 9, 9)
				  .addComponent(this.zvukLabel, -2, 32, -2)))
			  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			  .addComponent(this.greskaLabel)
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
			  .addComponent(this.dugmeNazad)));
		vremeLabel.setFont(fontDugme);
		vremeLabel.setHorizontalAlignment(0);
		vremeLabel.setText("Vreme");
		vremeLabel.setBorder(BorderFactory.createEtchedBorder());
		vremeLabel.setOpaque(true);
		vremeLabel.setPreferredSize(new Dimension(41, 21));
		this.nivoLabel.setFont(fontNivoi);
		this.nivoLabel.setHorizontalAlignment(0);
		this.nivoLabel.setText("Nivo: ");
		this.nivoLabel.setBorder(BorderFactory.createEtchedBorder());
		kandidatiCheckBox.setFont(font16);
		kandidatiCheckBox.setText("Prikaži moguće brojeve");
		kandidatiCheckBox.setBorder(BorderFactory.createEtchedBorder());
		kandidatiCheckBox.setFocusable(false);
		kandidatiCheckBox.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_3_sudoku9x9.this.kandidatiCheckBoxActionPerformed(evt);
			  }
			});
		puneCelijeLabel.setFont(font16);
		puneCelijeLabel.setHorizontalAlignment(0);
		puneCelijeLabel.setText("popunjenCelija");
		puneCelijeLabel.setBorder(BorderFactory.createEtchedBorder());
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			  .addContainerGap(-1, 32767)
			  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addComponent(this.jPanel1, -2, 500, -2)
				.addGroup(layout.createSequentialGroup()
				  .addComponent(kandidatiCheckBox, -2, 162, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(puneCelijeLabel, -2, 151, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.nivoLabel, -2, 157, -2)
				  .addGap(10, 10, 10)))
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel13, -1, -1, 32767)
				.addComponent(vremeLabel, -2, 115, -2))
			  .addContainerGap()));
		layout.setVerticalGroup(layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			  .addContainerGap()
			  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
				  .addComponent(this.jPanel1, -2, 500, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
					.addComponent(kandidatiCheckBox, -1, -1, 32767)
					.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
					  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(this.nivoLabel, -2, 45, -2)
						.addComponent(puneCelijeLabel, -1, -1, 32767))
					  .addGap(2, 2, 2))))
				.addGroup(layout.createSequentialGroup()
				  .addComponent(this.jPanel13, -2, -1, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(vremeLabel, -2, 25, -2)))
			  .addContainerGap(-1, 32767)));
		pack();
		setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kandidatiCheckBoxActionPerformed(ActionEvent evt) {
        vratiBoju();
        if (!kandidatiCheckBox.isSelected()) {
            playSound("radio.wav");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (!matSudoku[i][j].isPronadjen() && matSudoku[i][j].getJtf().getBackground().equals(boja3)) {
                        matSudoku[i][j].getJtf().setText((String) null);
                    }
                }
            }
            if (_1_Menu.jezik) {
                kandidatiCheckBox.setText("Prikaži moguće brojeve");
            } else {
                kandidatiCheckBox.setText("Show possible numbers");
            }
        } else {
            playSound("check.wav");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (!matSudoku[i][j].isPronadjen()) {
                        for (int k = 0; k < matSudoku[i][j].getKandidati().size(); k++) {
                            matSudoku[i][j].getJtf().append(" " + matSudoku[i][j].getKandidati().get(k));
                        }
                    }
                }
            }
            if (_1_Menu.jezik) {
                kandidatiCheckBox.setText("Sakrij moguće brojeve");
            } else {
                kandidatiCheckBox.setText("Hide possible numbers");
            }
        }
    }

    private void br1MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br1);
            this.red = 0;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br2MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br2);
            this.red = 0;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br3MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br3);
            this.red = 0;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br4MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br4);
            this.red = 0;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br5MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br5);
            this.red = 0;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br6MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br6);
            this.red = 0;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br7MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br7);
            this.red = 0;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br8MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br8);
            this.red = 0;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br9MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br9);
            this.red = 0;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br10MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br10);
            this.red = 1;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br11MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br11);
            this.red = 1;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br12MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br12);
            this.red = 1;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br13MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br13);
            this.red = 1;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br14MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br14);
            this.red = 1;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br15MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br15);
            this.red = 1;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br16MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br16);
            this.red = 1;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br17MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br17);
            this.red = 1;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br18MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br18);
            this.red = 1;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br19MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br19);
            this.red = 2;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br20MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br20);
            this.red = 2;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br21MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br21);
            this.red = 2;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br22MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br22);
            this.red = 2;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br23MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br23);
            this.red = 2;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br24MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br24);
            this.red = 2;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br25MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br25);
            this.red = 2;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br26MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br26);
            this.red = 2;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br27MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br27);
            this.red = 2;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br28MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br28);
            this.red = 3;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br29MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br29);
            this.red = 3;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br30MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br30);
            this.red = 3;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br31MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br31);
            this.red = 3;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br32MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br32);
            this.red = 3;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br33MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br33);
            this.red = 3;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br34MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br34);
            this.red = 3;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br35MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br35);
            this.red = 3;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br36MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br36);
            this.red = 3;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br37MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br37);
            this.red = 4;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br38MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br38);
            this.red = 4;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br39MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br39);
            this.red = 4;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br40MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br40);
            this.red = 4;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br41MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br41);
            this.red = 4;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br42MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br42);
            this.red = 4;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br43MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br43);
            this.red = 4;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br44MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br44);
            this.red = 4;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br45MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br45);
            this.red = 4;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br46MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br46);
            this.red = 5;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br47MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br47);
            this.red = 5;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br48MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br48);
            this.red = 5;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br49MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br49);
            this.red = 5;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br50MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br50);
            this.red = 5;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br51MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br51);
            this.red = 5;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br52MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br52);
            this.red = 5;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br53MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br53);
            this.red = 5;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br54MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br54);
            this.red = 5;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br55MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br55);
            this.red = 6;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br56MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br56);
            this.red = 6;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br57MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br57);
            this.red = 6;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br58MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br58);
            this.red = 6;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br59MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br59);
            this.red = 6;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br60MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br60);
            this.red = 6;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br61MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br61);
            this.red = 6;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br62MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br62);
            this.red = 6;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br63MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br63);
            this.red = 6;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br64MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br64);
            this.red = 7;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br65MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br65);
            this.red = 7;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br66MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br66);
            this.red = 7;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br67MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br67);
            this.red = 7;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br68MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br68);
            this.red = 7;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br69MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br69);
            this.red = 7;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br70MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br70);
            this.red = 7;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br71MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br71);
            this.red = 7;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br72MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br72);
            this.red = 7;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void br73MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br73);
            this.red = 8;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void br74MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br74);
            this.red = 8;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void br75MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br75);
            this.red = 8;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void br76MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br76);
            this.red = 8;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void br77MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br77);
            this.red = 8;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void br78MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br78);
            this.red = 8;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void br79MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br79);
            this.red = 8;
            this.kolona = 6;
            pretraziIsteBrojeve();
        }
    }

    private void br80MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br80);
            this.red = 8;
            this.kolona = 7;
            pretraziIsteBrojeve();
        }
    }

    private void br81MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(br81);
            this.red = 8;
            this.kolona = 8;
            pretraziIsteBrojeve();
        }
    }

    private void dugmePomocActionPerformed(ActionEvent evt) {
        vratiBoju();
        playSound("klik.wav");
        if (resenihKocki < 81) {
            trag = true;
            dodajVreme(10);
            (new JednostavnoDoOtkrivanja()).pretraziJednostavno();
            trag = false;
        }
        this.red = JednostavnoDoOtkrivanja.tempRed;
        this.kolona = JednostavnoDoOtkrivanja.tempKol;
        matSudoku[this.red][this.kolona].getJtf().requestFocus();
    }

    private void br1KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br1);
    }

    private void br2KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br2);
    }

    private void br3KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br3);
    }

    private void br4KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br4);
    }

    private void br5KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br5);
    }

    private void br6KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br6);
    }

    private void br7KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br7);
    }

    private void br8KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br8);
    }

    private void br9KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br9);
    }

    private void br10KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br10);
    }

    private void br11KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br11);
    }

    private void br12KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br12);
    }

    private void br13KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br13);
    }

    private void br14KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br14);
    }

    private void br15KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br15);
    }

    private void br16KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br16);
    }

    private void br17KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br17);
    }

    private void br18KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br18);
    }

    private void br19KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br19);
    }

    private void br20KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br20);
    }

    private void br21KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br21);
    }

    private void br22KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br22);
    }

    private void br23KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br23);
    }

    private void br24KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br24);
    }

    private void br25KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br25);
    }

    private void br26KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br26);
    }

    private void br27KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br27);
    }

    private void br28KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br28);
    }

    private void br29KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br29);
    }

    private void br30KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br30);
    }

    private void br31KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br31);
    }

    private void br32KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br32);
    }

    private void br33KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br33);
    }

    private void br34KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br34);
    }

    private void br35KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br35);
    }

    private void br36KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br36);
    }

    private void br37KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br37);
    }

    private void br38KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br38);
    }

    private void br39KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br39);
    }

    private void br40KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br40);
    }

    private void br41KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br41);
    }

    private void br42KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br42);
    }

    private void br43KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br43);
    }

    private void br44KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br44);
    }

    private void br45KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br45);
    }

    private void br46KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br46);
    }

    private void br47KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br47);
    }

    private void br48KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br48);
    }

    private void br49KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br49);
    }

    private void br50KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br50);
    }

    private void br51KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br51);
    }

    private void br52KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br52);
    }

    private void br53KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br53);
    }

    private void br54KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br54);
    }

    private void br55KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br55);
    }

    private void br56KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br56);
    }

    private void br57KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br57);
    }

    private void br58KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br58);
    }

    private void br59KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br59);
    }

    private void br60KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br60);
    }

    private void br61KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br61);
    }

    private void br62KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br62);
    }

    private void br63KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br63);
    }

    private void br64KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br64);
    }

    private void br65KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br65);
    }

    private void br66KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br66);
    }

    private void br67KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br67);
    }

    private void br68KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br68);
    }

    private void br69KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br69);
    }

    private void br70KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br70);
    }

    private void br71KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br71);
    }

    private void br72KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br72);
    }

    private void br73KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br73);
    }

    private void br74KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br74);
    }

    private void br75KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br75);
    }

    private void br76KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br76);
    }

    private void br77KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br77);
    }

    private void br78KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br78);
    }

    private void br79KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br79);
    }

    private void br80KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br80);
    }

    private void br81KeyTyped(KeyEvent evt) {
        upisiBroj(evt, br81);
    }

    private void dugme__ActionPerformed(ActionEvent evt) {
        playSound("klik.wav");
        vratiBoju();
    }

    private void formWindowDeactivated(WindowEvent evt) {
        vreme.suspenduj();
    }

    private void formWindowActivated(WindowEvent evt) {
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/pauza.png");
        if (this.pauzaLabel.getIcon().toString().equals(ikonPath.toString())) {
            vreme.nastavi();
        }
    }

    private void formWindowDeiconified(WindowEvent evt) {
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/pauza.png");
        if (this.pauzaLabel.getIcon().toString().equals(ikonPath.toString())) {
            vreme.nastavi();
        }
    }

    private void pauzaLabelMousePressed(MouseEvent evt) {
        playSound("klik.wav");
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/pauza.png");
        if (this.pauzaLabel.getIcon().toString().equals(ikonPath.toString())) {
            this.pauzaLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/play.png")));
            vreme.suspenduj();
            for (int i = 0; i < matSudoku.length; i++) {
                for (int j = 0; j < matSudoku.length; j++) {
                    matSudoku[i][j].getJtf().setVisible(false);
                }
            }
        } else {
            this.pauzaLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/pauza.png")));
            vreme.nastavi();
            for (int i = 0; i < matSudoku.length; i++) {
                for (int j = 0; j < matSudoku.length; j++) {
                    matSudoku[i][j].getJtf().setVisible(true);
                }
            }
        }
    }

    private void zvukLabelMousePressed(MouseEvent evt) {
        playSound("klik.wav");
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/zvukOn.png");
        if (clipMuzika != null) {
            if (this.zvukLabel.getIcon().toString().equals(ikonPath.toString())) {
                playSound("muzika.wav", "pauza");
                this.zvukLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOff.png")));
            } else {
                playSound("muzika.wav", "nastavi");
                this.zvukLabel.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOn.png")));
            }
        }
    }

    private void dugmeNazadActionPerformed(ActionEvent evt) {
        _1_Menu m = new _1_Menu();
        playSound("klik.wav");
        sacuvajMatricu();
        dispose();
        m.setVisible(true);
        vreme.stopirajThread();
    }

    private void dugme_1MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(1);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(1);
            dodajVreme(5);
        }
    }

    private void dugme_2MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(2);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(2);
            dodajVreme(5);
        }
    }

    private void dugme_3MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(3);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(3);
            dodajVreme(5);
        }
    }

    private void dugme_4MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(4);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(4);
            dodajVreme(5);
        }
    }

    private void dugme_5MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(5);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(5);
            dodajVreme(5);
        }
    }

    private void dugme_6MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(6);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(6);
            dodajVreme(5);
        }
    }

    private void dugme_7MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(7);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(7);
            dodajVreme(5);
        }
    }

    private void dugme_8MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(8);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(8);
            dodajVreme(5);
        }
    }

    private void dugme_9MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(9);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(9);
            dodajVreme(5);
        }
    }

    private void bojaKocke(JTextArea bk) {
        playSound("tak.wav");
        if (resenihKocki < 81) {
            if (matSudoku[this.red][this.kolona].isPronadjen()) {
                if (matSudoku[this.red][this.kolona].getJtf().getBackground().equals(this.boja4) || (matSudoku[this.red][this.kolona]
                        .getJtf().getBackground().equals(this.boja1) && matSudoku[this.red][this.kolona]
                        .getJtf().getForeground().equals(new Color(51, 204, 51)))) {
                    this.aux.setBackground(this.boja4);
                } else {
                    this.aux.setBackground(boja2);
                }
            } else if (matSudoku[this.red][this.kolona].getJtf().getBackground().equals(this.boja5) || (matSudoku[this.red][this.kolona]
                    .getJtf().getBackground().equals(this.boja1) && matSudoku[this.red][this.kolona]
                    .getJtf().getForeground().equals(new Color(255, 51, 51)))) {
                this.aux.setBackground(this.boja5);
            } else {
                this.aux.setBackground(boja3);
            }
            vratiBoju();
            bk.setBackground(this.boja1);
            this.aux = bk;
        }
    }

    private void bojaKockeStrelicom() {
        playSound("tak.wav");
        if (resenihKocki < 81) {
            matSudoku[this.red][this.kolona].getJtf().setBackground(this.boja1);
            matSudoku[this.red][this.kolona].getJtf().requestFocus();
        }
    }

    private void vratiBoju() {
        Color temp0 = new Color(171, 241, 171);
        Color temp1 = new Color(250, 250, 175);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((matSudoku[i][j].getJtf().getBackground().equals(temp0) || matSudoku[i][j]
                        .getJtf().getBackground().equals(temp1)) && matSudoku[i][j]
                        .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                    matSudoku[i][j].getJtf().setBackground(this.boja5);
                } else if (matSudoku[i][j].getJtf().getBackground().equals(temp0) || matSudoku[i][j]
                        .getJtf().getBackground().equals(temp1)) {
                    matSudoku[i][j].getJtf().setBackground(boja3);
                } else if (matSudoku[i][j].isPronadjen() && matSudoku[i][j]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku[i][j].getJtf().setBackground(boja2);
                } else if (matSudoku[i][j].isPronadjen() && matSudoku[i][j]
                        .getJtf().getForeground().equals(new Color(51, 204, 51))) {
                    matSudoku[i][j].getJtf().setBackground(this.boja4);
                } else if (!matSudoku[i][j].isPronadjen() && matSudoku[i][j]
                        .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                    matSudoku[i][j].getJtf().setBackground(this.boja5);
                } else if (!matSudoku[i][j].isPronadjen() && matSudoku[i][j]
                        .getJtf().getBackground().equals(this.boja1)) {
                    matSudoku[i][j].getJtf().setBackground(boja3);
                } else if (!matSudoku[i][j].isPronadjen() && (matSudoku[i][j]
                        .getJtf().getBackground().equals(this.boja1) || matSudoku[i][j]
                        .getJtf().getBackground().equals(boja2))) {
                    matSudoku[i][j].getJtf().setBackground(boja3);
                } else if (!matSudoku[i][j].isPronadjen() && matSudoku[i][j]
                        .getJtf().getBackground().equals(this.boja5) && matSudoku[i][j]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku[i][j].getJtf().setBackground(boja3);
                } else if (!matSudoku[i][j].isPronadjen() && matSudoku[i][j]
                        .getJtf().getBackground().equals(this.boja4) && matSudoku[i][j]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku[i][j].getJtf().setBackground(boja3);
                }
                matSudoku[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(0, 97, 0)));
            }
        }
    }

    private void upisiBroj(KeyEvent evt, JTextArea jta) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        } else if (!matSudoku[this.red][this.kolona].isPronadjen() && c != '0') {
            if (matrica[this.red][this.kolona] == Integer.parseInt(String.valueOf(c))) {
                playSound("good.wav");
                jta.setText(" " + c);
                matSudoku[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(c)));
                matSudoku[this.red][this.kolona].setPronadjen(true);
                jta.setFont(new Font("Monospaced", 1, 27));
                matSudoku[this.red][this.kolona].getJtf().setEditable(false);
                jta.setBackground(this.boja4);
                jta.setForeground(new Color(51, 204, 51));
                matSudoku[this.red][this.kolona].getKandidati().clear();
                matSudoku[this.red][this.kolona].dodajBroj(Integer.parseInt(String.valueOf(c)));
                ukloniKolonu(Integer.parseInt(String.valueOf(c)));
                ukloniBrRed(Integer.parseInt(String.valueOf(c)));
                ukloniKocku(Integer.parseInt(String.valueOf(c)));
                resenihKocki++;
                if (_1_Menu.jezik) {
                    puneCelijeLabel.setText("Popunjene ćelije: " + resenihKocki);
                } else {
                    puneCelijeLabel.setText("Filled cells: " + resenihKocki);
                }
                reseniBrojLabel.setText("--");
                ugasiDugme(c);
            } else {
                playSound("bad.wav");
                dodajVreme(5);
                this.greskeBrojac++;
                jta.setText(" " + c);
                matSudoku[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(c)));
                matSudoku[this.red][this.kolona].setPronadjen(false);
                jta.setFont(new Font("Monospaced", 1, 27));
                matSudoku[this.red][this.kolona].getJtf().setEditable(false);
                jta.setBackground(this.boja5);
                jta.setForeground(new Color(255, 51, 51));
                reseniBrojLabel.setText("--");
            }
            vratiBoju();
            pretraziIsteBrojeve();
            ispisiGresku();
            if (resenihKocki == 81) {
                sacuvajMatricu();
                _5_cestitamo cestitamo = new _5_cestitamo();
                vreme.stopirajTajmer();
                dispose();
                cestitamo.setVisible(true);
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        matSudoku[i][j].getJtf().setEnabled(false);
                    }
                }
            }
        }
    }

    private void upisiBrojSaMisem(int broj) {
        if (!matSudoku[this.red][this.kolona].isPronadjen()) {
            if (matrica[this.red][this.kolona] == Integer.parseInt(String.valueOf(broj))) {
                playSound("good.wav");
                matSudoku[this.red][this.kolona].getJtf().setText(" " + broj);
                matSudoku[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(broj)));
                matSudoku[this.red][this.kolona].setPronadjen(true);
                matSudoku[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 1, 27));
                matSudoku[this.red][this.kolona].getJtf().setEditable(false);
                matSudoku[this.red][this.kolona].getJtf().setBackground(this.boja4);
                matSudoku[this.red][this.kolona].getJtf().setForeground(new Color(51, 204, 51));
                matSudoku[this.red][this.kolona].getKandidati().clear();
                matSudoku[this.red][this.kolona].dodajBroj(Integer.parseInt(String.valueOf(broj)));
                ukloniKolonu(Integer.parseInt(String.valueOf(broj)));
                ukloniBrRed(Integer.parseInt(String.valueOf(broj)));
                ukloniKocku(Integer.parseInt(String.valueOf(broj)));
                resenihKocki++;
                if (_1_Menu.jezik) {
                    puneCelijeLabel.setText("Popunjene ćelije: " + resenihKocki);
                } else {
                    puneCelijeLabel.setText("Filled cells: " + resenihKocki);
                }
                reseniBrojLabel.setText("--");
                ugasiDugme(broj);
            } else {
                playSound("bad.wav");
                dodajVreme(5);
                this.greskeBrojac++;
                matSudoku[this.red][this.kolona].getJtf().setText(" " + broj);
                matSudoku[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(broj)));
                matSudoku[this.red][this.kolona].setPronadjen(false);
                matSudoku[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 1, 27));
                matSudoku[this.red][this.kolona].getJtf().setEditable(false);
                matSudoku[this.red][this.kolona].getJtf().setBackground(this.boja5);
                matSudoku[this.red][this.kolona].getJtf().setForeground(new Color(255, 51, 51));
                reseniBrojLabel.setText("--");
            }
            vratiBoju();
            pretraziIsteBrojeve();
            ispisiGresku();
            if (resenihKocki == 81) {
                sacuvajMatricu();
                _5_cestitamo cestitamo = new _5_cestitamo();
                vreme.stopirajTajmer();
                dispose();
                cestitamo.setVisible(true);
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        matSudoku[i][j].getJtf().setEnabled(false);
                    }
                }
            }
        }
    }

    private void pretraziIsteBrojeve() {
        reseniBrojLabel.setText("--");
        int br = matSudoku[this.red][this.kolona].getBroj();
        if (!_2_Podesavanja.pomocIgra) {
            if (matSudoku[this.red][this.kolona].isPronadjen()) {
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (matSudoku[i][j].isPronadjen() && matSudoku[i][j].getBroj() == br && matSudoku[i][j]
                                .getJtf().getBackground().equals(this.boja1)) {
                            matSudoku[i][j].getJtf().setBackground(this.boja1);
                            matSudoku[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(15, 15, 255), 2));
                        } else if (matSudoku[i][j].isPronadjen() && matSudoku[i][j].getBroj() == br && matSudoku[i][j]
                                .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                            matSudoku[i][j].getJtf().setBackground(new Color(115, 220, 255));
                            matSudoku[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(15, 15, 255), 2));
                        } else if (matSudoku[i][j].isPronadjen() && matSudoku[i][j].getBroj() == br && matSudoku[i][j]
                                .getJtf().getForeground().equals(new Color(51, 204, 51))) {
                            matSudoku[i][j].getJtf().setBackground(new Color(130, 235, 255));
                            matSudoku[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(15, 15, 255), 2));
                        }
                    }
                }
            }
            if (!matSudoku[this.red][this.kolona].isPronadjen() && matSudoku[this.red][this.kolona]
                    .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                pretraziRazlogBrojeva(br, this.red, this.kolona);
            }
        }
    }

    private void pretraziRazlogBrojeva(int br, int red, int kol) {
        int i;
        for (i = 0; i < 9; i++) {
            if (matSudoku[red][i].isPronadjen() && matSudoku[red][i].getBroj() == br) {
                matSudoku[red][i].getJtf().setBorder(BorderFactory.createLineBorder(new Color(255, 15, 15), 2));
                matSudoku[red][i].getJtf().setBackground(new Color(255, 222, 222));
            }
        }
        for (i = 0; i < 9; i++) {
            if (matSudoku[i][kol].isPronadjen() && matSudoku[i][kol].getBroj() == br) {
                matSudoku[i][kol].getJtf().setBorder(BorderFactory.createLineBorder(new Color(255, 15, 15), 2));
                matSudoku[i][kol].getJtf().setBackground(new Color(255, 222, 222));
            }
        }
        int red_start = red / 3 * 3;
        int kol_start = kol / 3 * 3;
        for (int j = red_start; j < red_start + 3; j++) {
            for (int k = kol_start; k < kol_start + 3; k++) {
                if (matSudoku[j][k].isPronadjen() && matSudoku[j][k].getBroj() == br) {
                    matSudoku[j][k].getJtf().setBorder(BorderFactory.createLineBorder(new Color(255, 15, 15), 2));
                    matSudoku[j][k].getJtf().setBackground(new Color(255, 222, 222));
                }
            }
        }
    }

    private void ugasiDugme(char br) {
        int broj = Character.getNumericValue(br);
        int brojac = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matSudoku[i][j].isPronadjen() && matSudoku[i][j].getBroj() == broj) {
                    brojac++;
                }
            }
        }
        if (brojac == 9) {
            switch (broj) {
                case 1:
                    this.dugme_1.setEnabled(false);
                    break;
                case 2:
                    this.dugme_2.setEnabled(false);
                    break;
                case 3:
                    this.dugme_3.setEnabled(false);
                    break;
                case 4:
                    this.dugme_4.setEnabled(false);
                    break;
                case 5:
                    this.dugme_5.setEnabled(false);
                    break;
                case 6:
                    this.dugme_6.setEnabled(false);
                    break;
                case 7:
                    this.dugme_7.setEnabled(false);
                    break;
                case 8:
                    this.dugme_8.setEnabled(false);
                    break;
                case 9:
                    this.dugme_9.setEnabled(false);
                    break;
            }
        }
    }

    private void ugasiDugme(int br) {
        int broj = br;
        int brojac = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matSudoku[i][j].isPronadjen() && matSudoku[i][j].getBroj() == broj) {
                    brojac++;
                }
            }
        }
        if (brojac == 9) {
            switch (broj) {
                case 1:
                    this.dugme_1.setEnabled(false);
                    break;
                case 2:
                    this.dugme_2.setEnabled(false);
                    break;
                case 3:
                    this.dugme_3.setEnabled(false);
                    break;
                case 4:
                    this.dugme_4.setEnabled(false);
                    break;
                case 5:
                    this.dugme_5.setEnabled(false);
                    break;
                case 6:
                    this.dugme_6.setEnabled(false);
                    break;
                case 7:
                    this.dugme_7.setEnabled(false);
                    break;
                case 8:
                    this.dugme_8.setEnabled(false);
                    break;
                case 9:
                    this.dugme_9.setEnabled(false);
                    break;
            }
        }
    }

    private void sacuvajMatricu() {
        int[][] temporarni = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrica[i][j] = 0;
                if (matSudoku[i][j].isPronadjen() && matSudoku[i][j].getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    temporarni[i][j] = matSudoku[i][j].getBroj();
                    matSudoku[i][j].setPronadjen(false);
                    matSudoku[i][j].getKandidati().clear();
                    matSudoku[i][j].setBroj(0);
                    matSudoku[i][j].getJtf().setFont(new Font("Monospaced", 0, 12));
                    matSudoku[i][j].getJtf().setBackground(boja3);
                    matSudoku[i][j].getJtf().setText((String) null);
                    matrica[i][j] = temporarni[i][j];
                }
            }
        }
    }

    private void filtriraj(int broj) {
        playSound("klik.wav");
        for (int r = 0; r < 9; r++) {
            for (int k = 0; k < 9; k++) {
                if (matSudoku[r][k].isPronadjen() && matSudoku[r][k]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku[r][k].getJtf().setBackground(boja2);
                } else if (matSudoku[r][k].isPronadjen() && matSudoku[r][k]
                        .getJtf().getForeground().equals(new Color(51, 204, 51))) {
                    matSudoku[r][k].getJtf().setBackground(this.boja4);
                } else if (!matSudoku[r][k].isPronadjen() && matSudoku[r][k]
                        .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                    matSudoku[r][k].getJtf().setBackground(this.boja5);
                } else {
                    matSudoku[r][k].getJtf().setBackground(boja3);
                }
                if (!matSudoku[r][k].isPronadjen()) {
                    ArrayList<Integer> tmp = matSudoku[r][k].getKandidati();
                    for (int i = 0; i < tmp.size(); i++) {
                        if (((Integer) tmp.get(i)).intValue() == broj) {
                            matSudoku[r][k].getJtf().setBackground(new Color(171, 241, 171));
                            break;
                        }
                    }
                }
            }
        }
    }

    public void ukloniKolonu(int br) {
        ArrayList<Integer> temp1 = null;
        for (int i = 0; i < 9; i++) {
            temp1 = matSudoku[i][this.kolona].getKandidati();
            for (int j = 0; j < temp1.size(); j++) {
                if (br == ((Integer) temp1.get(j)).intValue() && !matSudoku[i][this.kolona].isPronadjen()) {
                    matSudoku[i][this.kolona].obrisiKandidata(temp1.get(j));
                    if (kandidatiCheckBox.isSelected()) {
                        moguceStampanje(i, this.kolona);
                    }
                    break;
                }
            }
        }
    }

    private void ukloniBrRed(int broj) {
        ArrayList<Integer> temp = null;
        for (int i = 0; i < 9; i++) {
            temp = matSudoku[this.red][i].getKandidati();
            for (int j = 0; j < temp.size(); j++) {
                if (broj == ((Integer) temp.get(j)).intValue() && !matSudoku[this.red][i].isPronadjen()) {
                    matSudoku[this.red][i].obrisiKandidata(temp.get(j));
                    if (kandidatiCheckBox.isSelected()) {
                        moguceStampanje(this.red, i);
                    }
                    break;
                }
            }
        }
    }

    private void ukloniKocku(int broj) {
        for (int r = this.red / 3 * 3; r < this.red / 3 * 3 + 3; r++) {
            for (int k = this.kolona / 3 * 3; k < this.kolona / 3 * 3 + 3; k++) {
                if (!matSudoku[r][k].isPronadjen()) {
                    ArrayList<Integer> temp = matSudoku[r][k].getKandidati();
                    for (int i = 0; i < temp.size(); i++) {
                        if (((Integer) temp.get(i)).intValue() == broj) {
                            matSudoku[r][k].obrisiKandidata(temp.get(i));
                            if (kandidatiCheckBox.isSelected()
                                    && !matSudoku[r][k].isPronadjen() && matSudoku[r][k].getJtf().getBackground().equals(boja3)) {
                                matSudoku[r][k].getJtf().setText((String) null);
                                for (int j = 0; j < matSudoku[r][k].getKandidati().size(); j++) {
                                    matSudoku[r][k].getJtf().append(" " + matSudoku[r][k].getKandidati().get(j));
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }

    private void moguceStampanje(int red, int kol) {
        if (!matSudoku[red][kol].isPronadjen() && matSudoku[red][kol].getJtf().getBackground().equals(boja3)) {
            matSudoku[red][kol].getJtf().setText((String) null);
        }
        for (int i = 0; i < matSudoku[red][kol].getKandidati().size(); i++) {
            if (!matSudoku[red][kol].isPronadjen() && matSudoku[red][kol].getJtf().getBackground().equals(boja3)) {
                matSudoku[red][kol].getJtf().append(" " + matSudoku[red][kol].getKandidati().get(i));
            }
        }
    }

    private void restartuj() {
        resenihKocki = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matSudoku[i][j].setPronadjen(false);
                matSudoku[i][j].getKandidati().clear();
                matSudoku[i][j].setBroj(0);
                matSudoku[i][j].getJtf().setFont(new Font("Calibri", 0, 12));
                matSudoku[i][j].getJtf().setBackground(boja3);
                matSudoku[i][j].getJtf().setText((String) null);
            }
        }
    }

    private void krejtSaBazom() {
        restartuj();
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < (matrica[i]).length; j++) {
                if (matrica[i][j] != 0) {
                    matSudoku[i][j].dodajBroj(matrica[i][j]);
                    matSudoku[i][j].setBroj(matrica[i][j]);
                    matSudoku[i][j].setPronadjen(true);
                    matSudoku[i][j].getJtf().setFont(new Font("Monospaced", 1, 27));
                    matSudoku[i][j].getJtf().setText(" " + matrica[i][j]);
                    matSudoku[i][j].getJtf().setBackground(boja2);
                    matSudoku[i][j].getJtf().setForeground(new Color(0, 0, 0));
                    resenihKocki++;
                } else {
                    matSudoku[i][j].setPronadjen(false);
                    matSudoku[i][j].getKandidati().clear();
                    matSudoku[i][j].setBroj(0);
                    matSudoku[i][j].getJtf().setFont(new Font("Monospaced", 0, 12));
                    matSudoku[i][j].getJtf().setBackground(boja3);
                    matSudoku[i][j].getJtf().setForeground(new Color(0, 0, 0));
                    matSudoku[i][j].getJtf().setText((String) null);
                }
            }
        }
        (new Kandidati()).moguceOtkazivanje();
        if (_1_Menu.jezik) {
            puneCelijeLabel.setText("Popunjene ćelije: " + resenihKocki);
        } else {
            puneCelijeLabel.setText("Filled cells: " + resenihKocki);
        }
        vreme.setMinuta(0);
        vreme.setSati(0);
        vreme.setSekundi(0);
        if (_2_Podesavanja.nivo.equals("laganom")) {
            if (_1_Menu.jezik) {
                this.nivoLabel.setText("Nivo: Lagan");
            } else {
                this.nivoLabel.setText("Level: Easy");
            }
        } else if (_2_Podesavanja.nivo.equals("srednjem")) {
            if (_1_Menu.jezik) {
                this.nivoLabel.setText("Nivo: Srednji");
            } else {
                this.nivoLabel.setText("Leved: Medium");
            }
        } else if (_1_Menu.jezik) {
            this.nivoLabel.setText("Nivo: Težak");
        } else {
            this.nivoLabel.setText("Leved: Hard");
        }
    }

    private void randomBazaMatrice() {
        Random rnd = new Random();
        int broj = rnd.nextInt(5) + 1;
        int i = 0;
        if (i < 5
                && tempBrMatrice == broj) {
            broj = rnd.nextInt(5) + 1;
            if (broj == tempBrMatrice && broj <= 5) {
                broj++;
            }
        }
        switch (broj) {
            case 1:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica = BazaMatrice9x9.matrica1easy;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica = BazaMatrice9x9.matrica1medium;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica = BazaMatrice9x9.matrica1hard;
                    tempBrMatrice = broj;
                }
                break;
            case 2:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica = BazaMatrice9x9.matrica2easy;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica = BazaMatrice9x9.matrica2medium;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica = BazaMatrice9x9.matrica2hard;
                    tempBrMatrice = broj;
                }
                break;
            case 3:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica = BazaMatrice9x9.matrica3easy;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica = BazaMatrice9x9.matrica3medium;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica = BazaMatrice9x9.matrica3hard;
                    tempBrMatrice = broj;
                }
                break;
            case 4:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica = BazaMatrice9x9.matrica4easy;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica = BazaMatrice9x9.matrica4medium;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica = BazaMatrice9x9.matrica4hard;
                    tempBrMatrice = broj;
                }
                break;
            case 5:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica = BazaMatrice9x9.matrica5easy;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica = BazaMatrice9x9.matrica5medium;
                    tempBrMatrice = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica = BazaMatrice9x9.matrica5hard;
                    tempBrMatrice = broj;
                }
                break;
        }
    }

    public static void dodajVreme(int brSekundi) {
        vreme.setSekundi(vreme.getSekundi() + brSekundi);
    }

    public static void playSound(String url) {
        try {
            InputStream audioPath = _3_sudoku9x9.class.getResourceAsStream("/zavrsnirad/audio/" + url);
            InputStream bufferedIn = new BufferedInputStream(audioPath);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bufferedIn);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            bufferedIn.close();
            audioInputStream.close();
            if (url.equals("muzika.wav")) {
                clipMuzika = clip;
                clipMuzika.start();
                clipMuzika.loop(-1);
                clip = null;
            } else {
                clip.start();
                if (!url.equals("Bravo1.wav")) {
                    listaClip.add(clip);
                }
            }
        } catch (IOException | javax.sound.sampled.LineUnavailableException | javax.sound.sampled.UnsupportedAudioFileException ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        } catch (SecurityException ex) {
            Logger.getLogger(_3_sudoku9x9.class.getName()).log(Level.SEVERE, (String) null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(_3_sudoku9x9.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
    }

    public static void playSound(String url, String opcija) {
        try {
            if (opcija.equals("pauza")) {
                int vremePozicijeKlipa = clipMuzika.getFramePosition();
                System.out.println(clipMuzika.getFrameLength() + " i trenutno je na " + clipMuzika.getFramePosition());
                if (vremePozicijeKlipa > clipMuzika.getFrameLength()) {
                    tmpAudio = vremePozicijeKlipa % clipMuzika.getFrameLength();
                } else {
                    tmpAudio = vremePozicijeKlipa;
                }
                System.out.println(tmpAudio);
                clipMuzika.stop();
            } else if (opcija.equals("nastavi")) {
                clipMuzika.setFramePosition(tmpAudio);
                clipMuzika.start();
                clipMuzika.loop(-1);
            }
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    private void setPozadina() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/zavrsnirad/slike/ikonica.png")));
    }

    private void ispisiGresku() {
        if (this.greskaLabel.isEnabled()) {
            int obavestenje;
            _2_Podesavanja p;
            switch (_2_Podesavanja.nivo) {
                case "laganom":
                    if (this.greskeBrojac < 3) {
                        if (_1_Menu.jezik) {
                            this.greskaLabel.setText("Greške: " + this.greskeBrojac + " / 3");
                            break;
                        }
                        this.greskaLabel.setText("Errors: " + this.greskeBrojac + " / 3");
                        break;
                    }
                    if (_1_Menu.jezik) {
                        this.greskaLabel.setText("Greške: " + this.greskeBrojac + " / 3");
                    } else {
                        this.greskaLabel.setText("Errors: " + this.greskeBrojac + " / 3");
                    }
                    if (_1_Menu.jezik) {
                        obavestenje = JOptionPane.showConfirmDialog(this, "Izgubili ste jer ste napravili 3 greške.\n          Biće bolje sledeći put.\n    Da li želite ponovo da igrate?", "Obaveštenje o greškama", 0, 1);
                    } else {
                        obavestenje = JOptionPane.showConfirmDialog(this, "You lost because you made 3 mistakes.\n          Better luck next time.\n    Do you want to play again?", "Obaveštenje o greškama", 0, 1);
                    }
                    if (obavestenje == 0) {
                        dispose();
                        sacuvajMatricu();
                        vreme.stopirajThread();
                        _3_sudoku9x9 s = new _3_sudoku9x9();
                        s.setVisible(true);
                        break;
                    }
                    p = new _2_Podesavanja();
                    sacuvajMatricu();
                    vreme.stopirajThread();
                    dispose();
                    p.setVisible(true);
                    break;
                case "srednjem":
                    if (this.greskeBrojac < 4) {
                        if (_1_Menu.jezik) {
                            this.greskaLabel.setText("Greške: " + this.greskeBrojac + " / 4");
                            break;
                        }
                        this.greskaLabel.setText("Errors: " + this.greskeBrojac + " / 4");
                        break;
                    }
                    if (_1_Menu.jezik) {
                        this.greskaLabel.setText("Greške: " + this.greskeBrojac + " / 4");
                    } else {
                        this.greskaLabel.setText("Errors: " + this.greskeBrojac + " / 4");
                    }
                    if (_1_Menu.jezik) {
                        obavestenje = JOptionPane.showConfirmDialog(this, "Izgubili ste jer ste napravili 4 greške.\n          Biće bolje sledeći put.\n    Da li želite ponovo da igrate?", "Obaveštenje o greškama", 0, 1);
                    } else {
                        obavestenje = JOptionPane.showConfirmDialog(this, "You lost because you made 4 mistakes.\n          Better luck next time.\n    Do you want to play again?", "Error notification", 0, 1);
                    }
                    if (obavestenje == 0) {
                        dispose();
                        sacuvajMatricu();
                        vreme.stopirajThread();
                        _3_sudoku9x9 s = new _3_sudoku9x9();
                        s.setVisible(true);
                        break;
                    }
                    p = new _2_Podesavanja();
                    sacuvajMatricu();
                    vreme.stopirajThread();
                    dispose();
                    p.setVisible(true);
                    break;
                case "teškom":
                    if (this.greskeBrojac < 5) {
                        if (_1_Menu.jezik) {
                            this.greskaLabel.setText("Greške: " + this.greskeBrojac + " / 5");
                            break;
                        }
                        this.greskaLabel.setText("Errors: " + this.greskeBrojac + " / 5");
                        break;
                    }
                    if (_1_Menu.jezik) {
                        this.greskaLabel.setText("Greške: " + this.greskeBrojac + " / 5");
                    } else {
                        this.greskaLabel.setText("Errors: " + this.greskeBrojac + " / 5");
                    }
                    if (_1_Menu.jezik) {
                        obavestenje = JOptionPane.showConfirmDialog(this, "Izgubili ste jer ste napravili 5 greške.\n          Biće bolje sledeći put.\n    Da li želite ponovo da igrate?", "Obaveštenje o greškama", 0, 1);
                    } else {
                        obavestenje = JOptionPane.showConfirmDialog(this, "You lost because you made 5 mistakes.\n          Better luck next time.\n    Do you want to play again?", "Error notification", 0, 1);
                    }
                    if (obavestenje == 0) {
                        dispose();
                        sacuvajMatricu();
                        vreme.stopirajThread();
                        _3_sudoku9x9 s = new _3_sudoku9x9();
                        s.setVisible(true);
                        break;
                    }
                    p = new _2_Podesavanja();
                    sacuvajMatricu();
                    vreme.stopirajThread();
                    dispose();
                    p.setVisible(true);
                    break;
            }
        }
    }

    private void generisiMatricu() {
        if (_2_Podesavanja.nivo.equals("laganom") && _2_Podesavanja.software) {
            GenerisiMatricu generisiMatricu = new GenerisiMatricu(9, 40);
        } else if (_2_Podesavanja.nivo.equals("srednjem") && _2_Podesavanja.software) {
            GenerisiMatricu generisiMatricu = new GenerisiMatricu(9, 50);
        } else {
            GenerisiMatricu generisiMatricu = new GenerisiMatricu(9, 60);
        }
    }

    public static void podesiFont() {
        try {
            InputStream stream = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream1 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream2 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream3 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream7 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            fontNaslov = Font.createFont(0, stream7).deriveFont(2, 58.0F);
            fontIgre = Font.createFont(0, stream).deriveFont(3, 40.0F);
            fontIgre1 = Font.createFont(0, stream1).deriveFont(34.0F);
            fontIgre2 = Font.createFont(0, stream2).deriveFont(30.0F);
            fontIgre3 = Font.createFont(0, stream3).deriveFont(2, 22.0F);
            InputStream stream4 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream5 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream6 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            font6x6 = Font.createFont(0, stream6).deriveFont(1, 36.0F);
            fontNazad = Font.createFont(0, stream4).deriveFont(2, 20.0F);
            fontNivoi = Font.createFont(0, stream5).deriveFont(20.0F);
            InputStream stream8 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream9 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            InputStream stream10 = _3_sudoku9x9.class.getResourceAsStream("BuxtonSketch.ttf");
            fontDugme = Font.createFont(0, stream8).deriveFont(18.0F);
            font16 = Font.createFont(0, stream9).deriveFont(16.0F);
            font25 = Font.createFont(0, stream10).deriveFont(25.0F);
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(_3_sudoku9x9.class.getName()).log(Level.SEVERE, (String) null, ex);
        }
    }

    private void podesiJezik() {
        if (_1_Menu.jezik) {
            this.dugmeNazad.setText("Nazad");
            this.dugmePomoc.setText("Pomoć");
            this.greskaLabel.setText("Greške: 0");
            kandidatiCheckBox.setText("Prikaži moguće brojeve");
        } else {
            this.dugmeNazad.setText("Back");
            this.dugmePomoc.setText("Help");
            this.greskaLabel.setText("Errors: 0");
            kandidatiCheckBox.setText("Show possible numbers");
        }
    }

    private void ugasiDugme() {
        if (_2_Podesavanja.pomocIgra) {
            this.dugmePomoc.setEnabled(false);
            this.dugme__.setEnabled(false);
            kandidatiCheckBox.setEnabled(false);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_3_sudoku9x9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3_sudoku9x9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3_sudoku9x9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3_sudoku9x9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _3_sudoku9x9().setVisible(true);
            }
        });
    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        int pritisnuto = e.getKeyCode();
        if (!Character.isDigit(c) && !Character.isAlphabetic(pritisnuto)) {
            switch (pritisnuto) {
                case 37:
                    if (this.kolona >= 1 && this.kolona <= 8) {
                        vratiBoju();
                        this.kolona--;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 39:
                    if (this.kolona >= 0 && this.kolona < 8) {
                        vratiBoju();
                        this.kolona++;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 38:
                    if (this.red >= 1 && this.red <= 8) {
                        vratiBoju();
                        this.red--;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 40:
                    if (this.red >= 0 && this.red < 8) {
                        vratiBoju();
                        this.red++;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 127:
                    if (matSudoku[this.red][this.kolona].getBroj() != 0
                            && !matSudoku[this.red][this.kolona].isPronadjen() && matSudoku[this.red][this.kolona]
                            .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                        matSudoku[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 0, 12));
                        matSudoku[this.red][this.kolona].getJtf().setBackground(boja3);
                        matSudoku[this.red][this.kolona].getJtf().setForeground(new Color(0, 0, 0));
                        matSudoku[this.red][this.kolona].getJtf().setText((String) null);
                        if (kandidatiCheckBox.isSelected()
                                && !matSudoku[this.red][this.kolona].isPronadjen()) {
                            for (int k = 0; k < matSudoku[this.red][this.kolona].getKandidati().size(); k++) {
                                matSudoku[this.red][this.kolona].getJtf().append(" " + matSudoku[this.red][this.kolona].getKandidati().get(k));
                            }
                        }
                    }
                    vratiBoju();
                    e.consume();
                    break;
                case 8:
                    if (matSudoku[this.red][this.kolona].getBroj() != 0
                            && !matSudoku[this.red][this.kolona].isPronadjen() && matSudoku[this.red][this.kolona]
                            .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                        matSudoku[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 0, 12));
                        matSudoku[this.red][this.kolona].getJtf().setBackground(boja3);
                        matSudoku[this.red][this.kolona].getJtf().setForeground(new Color(0, 0, 0));
                        matSudoku[this.red][this.kolona].getJtf().setText((String) null);
                        if (kandidatiCheckBox.isSelected()
                                && !matSudoku[this.red][this.kolona].isPronadjen()) {
                            for (int k = 0; k < matSudoku[this.red][this.kolona].getKandidati().size(); k++) {
                                matSudoku[this.red][this.kolona].getJtf().append(" " + matSudoku[this.red][this.kolona].getKandidati().get(k));
                            }
                        }
                    }
                    vratiBoju();
                    e.consume();
                    break;
                case 9:
                    System.out.println("TAB pritisnut");
                    break;
            }
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
