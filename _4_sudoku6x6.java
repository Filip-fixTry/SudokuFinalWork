package zavrsnirad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
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
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class _4_sudoku6x6 extends javax.swing.JFrame implements KeyListener {

    public static Sudoku[][] matSudoku1 = new Sudoku[6][6];
    public static int resenihKocki1;
    public static Tajmer vreme1;
    private int red;
    private int kolona;
    public static int tempBrMatrice1;
    public JTextArea aux = bra1;
    private Color boja1 = new Color(205, 205, 255);
    private Color boja4 = new Color(204, 255, 204);
    private Color boja5 = new Color(255, 179, 179);
    public static Color boja2 = new Color(155, 235, 235);
    public static Color boja3 = new Color(255, 255, 255);
    int[][] temp = new int[6][6];
    boolean imaResenja = true;
    public static boolean nivoTesko = false;
    public static boolean novaIgra1 = false;
    public static boolean trag1 = false;
    public static int[][] matrica1;
    private int greskeBrojac1;
    public static JTextArea bra1;
    public static JTextArea bra10;
    public static JTextArea bra11;
    public static JTextArea bra12;
    public static JTextArea bra13;
    public static JTextArea bra14;
    public static JTextArea bra15;
    public static JTextArea bra16;
    public static JTextArea bra17;
    public static JTextArea bra18;
    public static JTextArea bra19;
    public static JTextArea bra2;
    public static JTextArea bra20;
    public static JTextArea bra21;
    public static JTextArea bra22;
    public static JTextArea bra23;
    public static JTextArea bra24;
    public static JTextArea bra25;
    public static JTextArea bra26;
    public static JTextArea bra27;
    public static JTextArea bra28;
    public static JTextArea bra29;
    public static JTextArea bra3;
    public static JTextArea bra30;
    public static JTextArea bra31;
    public static JTextArea bra32;
    public static JTextArea bra33;
    public static JTextArea bra34;
    public static JTextArea bra35;
    public static JTextArea bra36;
    public static JTextArea bra4;
    public static JTextArea bra5;
    public static JTextArea bra6;
    public static JTextArea bra7;
    public static JTextArea bra8;
    public static JTextArea bra9;
    private JButton dugmeNazad1;
    private JButton dugmePomoc;
    private JButton dugme_1;
    private JButton dugme_2;
    private JButton dugme_3;
    private JButton dugme_4;
    private JButton dugme_5;
    private JButton dugme_6;
    private JLabel greskaLabel1;
    private JPanel jPanel1;
    private JPanel jPanel10;
    private JPanel jPanel12;
    private JPanel jPanel13;
    private JPanel jPanel2;
    private JPanel jPanel4;
    private JPanel jPanel6;
    private JPanel jPanel7;
    private JPanel jPanel9;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    public static JCheckBox kandidatiCheckBox1;
    private JLabel nivoLabel1;
    private JLabel pauzaLabel1;
    public static JLabel puneCelijeLabel1;
    public static JLabel reseniBrojLabel1;
    public static JLabel vremeLabel1;
    private JLabel zvukLabel1;

    /**
     * Creates new form _4_sudoku6x6
     */
    public _4_sudoku6x6() {
        initComponents();
        (new KreirajMatricu()).krejtMatricu();
        for (JTextArea jt : KreirajMatricu.jtaLista) {
            jt.addKeyListener(this);
        }
        this.greskeBrojac1 = 0;
        if (_3_sudoku9x9.clipMuzika.isRunning()) {
            this.zvukLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOn.png")));
        } else {
            this.zvukLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOff.png")));
        }
        this.aux = bra1;
        vreme1 = new Tajmer(vremeLabel1);
        if (_2_Podesavanja.greska) {
            this.greskaLabel1.setEnabled(true);
        } else {
            this.greskaLabel1.setEnabled(false);
        }
        if (_2_Podesavanja.software) {
            generisiMatricu();
            matrica1 = GenerisiMatricu.genMatrica;
            krejtSaBazom();
        } else {
            restartuj();
            randomBazaMatrice();
            krejtSaBazom();
        }
        for (int i = 1; i <= matrica1.length; i++) {
            ugasiDugmeInt(i);
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
		this.jPanel12 = new JPanel();
		this.jPanel2 = new JPanel();
		bra1 = new JTextArea();
		bra2 = new JTextArea();
		bra7 = new JTextArea();
		bra8 = new JTextArea();
		bra3 = new JTextArea();
		bra9 = new JTextArea();
		this.jPanel4 = new JPanel();
		bra4 = new JTextArea();
		bra10 = new JTextArea();
		bra5 = new JTextArea();
		bra6 = new JTextArea();
		bra11 = new JTextArea();
		bra12 = new JTextArea();
		this.jPanel6 = new JPanel();
		bra13 = new JTextArea();
		bra14 = new JTextArea();
		bra19 = new JTextArea();
		bra20 = new JTextArea();
		bra15 = new JTextArea();
		bra21 = new JTextArea();
		this.jPanel7 = new JPanel();
		bra16 = new JTextArea();
		bra22 = new JTextArea();
		bra17 = new JTextArea();
		bra18 = new JTextArea();
		bra23 = new JTextArea();
		bra24 = new JTextArea();
		this.jPanel9 = new JPanel();
		bra25 = new JTextArea();
		bra26 = new JTextArea();
		bra31 = new JTextArea();
		bra32 = new JTextArea();
		bra27 = new JTextArea();
		bra33 = new JTextArea();
		this.jPanel10 = new JPanel();
		bra28 = new JTextArea();
		bra34 = new JTextArea();
		bra29 = new JTextArea();
		bra35 = new JTextArea();
		bra30 = new JTextArea();
		bra36 = new JTextArea();
		this.jPanel13 = new JPanel();
		this.dugmePomoc = new JButton();
		reseniBrojLabel1 = new JLabel();
		this.jSeparator1 = new JSeparator();
		vremeLabel1 = new JLabel();
		this.jSeparator2 = new JSeparator();
		this.jSeparator3 = new JSeparator();
		this.dugme_1 = new JButton();
		this.dugme_2 = new JButton();
		this.dugme_3 = new JButton();
		this.dugme_4 = new JButton();
		this.dugme_5 = new JButton();
		this.dugme_6 = new JButton();
		this.pauzaLabel1 = new JLabel();
		this.zvukLabel1 = new JLabel();
		this.greskaLabel1 = new JLabel();
		kandidatiCheckBox1 = new JCheckBox();
		puneCelijeLabel1 = new JLabel();
		this.nivoLabel1 = new JLabel();
		this.dugmeNazad1 = new JButton();
		setDefaultCloseOperation(3);
		setTitle("Sudoku 6x6");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			  public void windowActivated(WindowEvent evt) {
				_4_sudoku6x6.this.formWindowActivated(evt);
			  }
			  
			  public void windowDeactivated(WindowEvent evt) {
				_4_sudoku6x6.this.formWindowDeactivated(evt);
			  }
			  
			  public void windowDeiconified(WindowEvent evt) {
				_4_sudoku6x6.this.formWindowDeiconified(evt);
			  }
			});
		this.jPanel1.setBorder(new SoftBevelBorder(0));
		this.jPanel12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel2.setPreferredSize(new Dimension(150, 152));
		bra1.setEditable(false);
		bra1.setColumns(20);
		bra1.setFont(new Font("Calibri", 0, 12));
		bra1.setLineWrap(true);
		bra1.setRows(3);
		bra1.setText("4");
		bra1.setAlignmentY(0.2F);
		bra1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra1.setFocusTraversalPolicyProvider(true);
		bra1.setName("1");
		bra1.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra1MousePressed(evt);
			  }
			});
		bra1.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra1KeyTyped(evt);
			  }
			});
		bra2.setEditable(false);
		bra2.setColumns(20);
		bra2.setFont(new Font("Calibri", 0, 12));
		bra2.setLineWrap(true);
		bra2.setRows(3);
		bra2.setAlignmentY(0.2F);
		bra2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra2.setFocusTraversalPolicyProvider(true);
		bra2.setName("1");
		bra2.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra2MousePressed(evt);
			  }
			});
		bra2.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra2KeyTyped(evt);
			  }
			});
		bra7.setEditable(false);
		bra7.setColumns(20);
		bra7.setFont(new Font("Calibri", 0, 12));
		bra7.setLineWrap(true);
		bra7.setRows(3);
		bra7.setAlignmentY(0.2F);
		bra7.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra7.setFocusTraversalPolicyProvider(true);
		bra7.setName("1");
		bra7.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra7MousePressed(evt);
			  }
			});
		bra7.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra7KeyTyped(evt);
			  }
			});
		bra8.setEditable(false);
		bra8.setColumns(20);
		bra8.setFont(new Font("Calibri", 0, 12));
		bra8.setLineWrap(true);
		bra8.setRows(3);
		bra8.setText("3");
		bra8.setAlignmentY(0.2F);
		bra8.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra8.setFocusTraversalPolicyProvider(true);
		bra8.setName("1");
		bra8.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra8MousePressed(evt);
			  }
			});
		bra8.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra8KeyTyped(evt);
			  }
			});
		bra3.setEditable(false);
		bra3.setColumns(20);
		bra3.setFont(new Font("Calibri", 0, 12));
		bra3.setLineWrap(true);
		bra3.setRows(3);
		bra3.setText("3");
		bra3.setAlignmentY(0.2F);
		bra3.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra3.setFocusTraversalPolicyProvider(true);
		bra3.setName("1");
		bra3.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra3MousePressed(evt);
			  }
			});
		bra3.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra3KeyTyped(evt);
			  }
			});
		bra9.setEditable(false);
		bra9.setColumns(20);
		bra9.setFont(new Font("Calibri", 0, 12));
		bra9.setLineWrap(true);
		bra9.setRows(3);
		bra9.setAlignmentY(0.2F);
		bra9.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra9.setFocusTraversalPolicyProvider(true);
		bra9.setName("1");
		bra9.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra9MousePressed(evt);
			  }
			});
		bra9.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra9KeyTyped(evt);
			  }
			});
		GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
		this.jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
				  .addComponent(bra7, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra8, -2, 50, -2))
				.addGroup(jPanel2Layout.createSequentialGroup()
				  .addComponent(bra1, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra2, -2, 50, -2)))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra3, -2, 50, -2)
				.addComponent(bra9, -2, 50, -2))
			  .addGap(2, 2, 2)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
				  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra1, -2, 50, -2)
					.addComponent(bra2, -2, 50, -2))
				  .addGap(2, 2, 2)
				  .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra7, -2, 50, -2)
					.addComponent(bra8, -2, 50, -2)))
				.addGroup(jPanel2Layout.createSequentialGroup()
				  .addComponent(bra3, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra9, -2, 50, -2)))));
		this.jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel4.setPreferredSize(new Dimension(150, 152));
		bra4.setEditable(false);
		bra4.setColumns(20);
		bra4.setFont(new Font("Calibri", 0, 12));
		bra4.setLineWrap(true);
		bra4.setRows(3);
		bra4.setAlignmentY(0.2F);
		bra4.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra4.setFocusTraversalPolicyProvider(true);
		bra4.setName("1");
		bra4.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra4MousePressed(evt);
			  }
			});
		bra4.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra4KeyTyped(evt);
			  }
			});
		bra10.setEditable(false);
		bra10.setColumns(20);
		bra10.setFont(new Font("Calibri", 0, 12));
		bra10.setLineWrap(true);
		bra10.setRows(3);
		bra10.setAlignmentY(0.2F);
		bra10.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra10.setFocusTraversalPolicyProvider(true);
		bra10.setName("1");
		bra10.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra10MousePressed(evt);
			  }
			});
		bra10.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra10KeyTyped(evt);
			  }
			});
		bra5.setEditable(false);
		bra5.setColumns(20);
		bra5.setFont(new Font("Calibri", 0, 12));
		bra5.setLineWrap(true);
		bra5.setRows(3);
		bra5.setAlignmentY(0.2F);
		bra5.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra5.setFocusTraversalPolicyProvider(true);
		bra5.setName("1");
		bra5.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra5MousePressed(evt);
			  }
			});
		bra5.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra5KeyTyped(evt);
			  }
			});
		bra6.setEditable(false);
		bra6.setColumns(20);
		bra6.setFont(new Font("Calibri", 0, 12));
		bra6.setLineWrap(true);
		bra6.setRows(3);
		bra6.setText("1 ");
		bra6.setAlignmentY(0.2F);
		bra6.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra6.setFocusTraversalPolicyProvider(true);
		bra6.setName("1");
		bra6.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra6MousePressed(evt);
			  }
			});
		bra6.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra6KeyTyped(evt);
			  }
			});
		bra11.setEditable(false);
		bra11.setColumns(20);
		bra11.setFont(new Font("Calibri", 0, 12));
		bra11.setLineWrap(true);
		bra11.setRows(3);
		bra11.setAlignmentY(0.2F);
		bra11.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra11.setFocusTraversalPolicyProvider(true);
		bra11.setName("1");
		bra11.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra11MousePressed(evt);
			  }
			});
		bra11.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra11KeyTyped(evt);
			  }
			});
		bra12.setEditable(false);
		bra12.setColumns(20);
		bra12.setFont(new Font("Calibri", 0, 12));
		bra12.setLineWrap(true);
		bra12.setRows(3);
		bra12.setAlignmentY(0.2F);
		bra12.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra12.setFocusTraversalPolicyProvider(true);
		bra12.setName("1");
		bra12.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra12MousePressed(evt);
			  }
			});
		bra12.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra12KeyTyped(evt);
			  }
			});
		GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
		this.jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel4Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra4, -2, 50, -2)
				.addComponent(bra10, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
				  .addComponent(bra5, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra6, -2, 50, -2))
				.addGroup(jPanel4Layout.createSequentialGroup()
				  .addComponent(bra11, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra12, -2, 50, -2)))
			  .addContainerGap(-1, 32767)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel4Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createSequentialGroup()
				  .addComponent(bra4, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra10, -2, 50, -2))
				.addGroup(jPanel4Layout.createSequentialGroup()
				  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra5, -2, 50, -2)
					.addComponent(bra6, -2, 50, -2))
				  .addGap(2, 2, 2)
				  .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra11, -2, 50, -2)
					.addComponent(bra12, -2, 50, -2))))
			  .addContainerGap(-1, 32767)));
		this.jPanel6.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel6.setPreferredSize(new Dimension(150, 152));
		bra13.setEditable(false);
		bra13.setColumns(20);
		bra13.setFont(new Font("Calibri", 0, 12));
		bra13.setLineWrap(true);
		bra13.setRows(3);
		bra13.setAlignmentY(0.2F);
		bra13.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra13.setFocusTraversalPolicyProvider(true);
		bra13.setName("1");
		bra13.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra13MousePressed(evt);
			  }
			});
		bra13.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra13KeyTyped(evt);
			  }
			});
		bra14.setEditable(false);
		bra14.setColumns(20);
		bra14.setFont(new Font("Calibri", 0, 12));
		bra14.setLineWrap(true);
		bra14.setRows(3);
		bra14.setText("6");
		bra14.setAlignmentY(0.2F);
		bra14.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra14.setFocusTraversalPolicyProvider(true);
		bra14.setName("1");
		bra14.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra14MousePressed(evt);
			  }
			});
		bra14.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra14KeyTyped(evt);
			  }
			});
		bra19.setEditable(false);
		bra19.setColumns(20);
		bra19.setFont(new Font("Calibri", 0, 12));
		bra19.setLineWrap(true);
		bra19.setRows(3);
		bra19.setAlignmentY(0.2F);
		bra19.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra19.setFocusTraversalPolicyProvider(true);
		bra19.setName("1");
		bra19.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra19MousePressed(evt);
			  }
			});
		bra19.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra19KeyTyped(evt);
			  }
			});
		bra20.setEditable(false);
		bra20.setColumns(20);
		bra20.setFont(new Font("Calibri", 0, 12));
		bra20.setLineWrap(true);
		bra20.setRows(3);
		bra20.setAlignmentY(0.2F);
		bra20.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra20.setFocusTraversalPolicyProvider(true);
		bra20.setName("1");
		bra20.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra20MousePressed(evt);
			  }
			});
		bra20.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra20KeyTyped(evt);
			  }
			});
		bra15.setEditable(false);
		bra15.setColumns(20);
		bra15.setFont(new Font("Calibri", 0, 12));
		bra15.setLineWrap(true);
		bra15.setRows(3);
		bra15.setAlignmentY(0.2F);
		bra15.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra15.setFocusTraversalPolicyProvider(true);
		bra15.setName("1");
		bra15.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra15MousePressed(evt);
			  }
			});
		bra15.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra15KeyTyped(evt);
			  }
			});
		bra21.setEditable(false);
		bra21.setColumns(20);
		bra21.setFont(new Font("Calibri", 0, 12));
		bra21.setLineWrap(true);
		bra21.setRows(3);
		bra21.setAlignmentY(0.2F);
		bra21.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra21.setFocusTraversalPolicyProvider(true);
		bra21.setName("1");
		bra21.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra21MousePressed(evt);
			  }
			});
		bra21.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra21KeyTyped(evt);
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
				  .addComponent(bra19, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra20, -2, 50, -2))
				.addGroup(jPanel6Layout.createSequentialGroup()
				  .addComponent(bra13, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra14, -2, 50, -2)))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra15, -2, 50, -2)
				.addComponent(bra21, -2, 50, -2))
			  .addContainerGap(-1, 32767)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel6Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup()
				  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra13, -2, 50, -2)
					.addComponent(bra14, -2, 50, -2))
				  .addGap(2, 2, 2)
				  .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra19, -2, 50, -2)
					.addComponent(bra20, -2, 50, -2)))
				.addGroup(jPanel6Layout.createSequentialGroup()
				  .addComponent(bra15, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra21, -2, 50, -2)))));
		this.jPanel7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel7.setPreferredSize(new Dimension(150, 152));
		bra16.setEditable(false);
		bra16.setColumns(20);
		bra16.setFont(new Font("Calibri", 0, 12));
		bra16.setLineWrap(true);
		bra16.setRows(3);
		bra16.setAlignmentY(0.2F);
		bra16.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra16.setFocusTraversalPolicyProvider(true);
		bra16.setName("1");
		bra16.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra16MousePressed(evt);
			  }
			});
		bra16.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra16KeyTyped(evt);
			  }
			});
		bra22.setEditable(false);
		bra22.setColumns(20);
		bra22.setFont(new Font("Calibri", 0, 12));
		bra22.setLineWrap(true);
		bra22.setRows(3);
		bra22.setAlignmentY(0.2F);
		bra22.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra22.setFocusTraversalPolicyProvider(true);
		bra22.setName("1");
		bra22.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra22MousePressed(evt);
			  }
			});
		bra22.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra22KeyTyped(evt);
			  }
			});
		bra17.setEditable(false);
		bra17.setColumns(20);
		bra17.setFont(new Font("Calibri", 0, 12));
		bra17.setLineWrap(true);
		bra17.setRows(3);
		bra17.setAlignmentY(0.2F);
		bra17.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra17.setFocusTraversalPolicyProvider(true);
		bra17.setName("1");
		bra17.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra17MousePressed(evt);
			  }
			});
		bra17.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra17KeyTyped(evt);
			  }
			});
		bra18.setEditable(false);
		bra18.setColumns(20);
		bra18.setFont(new Font("Calibri", 0, 12));
		bra18.setLineWrap(true);
		bra18.setRows(3);
		bra18.setAlignmentY(0.2F);
		bra18.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra18.setFocusTraversalPolicyProvider(true);
		bra18.setName("1");
		bra18.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra18MousePressed(evt);
			  }
			});
		bra18.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra18KeyTyped(evt);
			  }
			});
		bra23.setEditable(false);
		bra23.setColumns(20);
		bra23.setFont(new Font("Calibri", 0, 12));
		bra23.setLineWrap(true);
		bra23.setRows(3);
		bra23.setText("6");
		bra23.setAlignmentY(0.2F);
		bra23.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra23.setFocusTraversalPolicyProvider(true);
		bra23.setName("1");
		bra23.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra23MousePressed(evt);
			  }
			});
		bra23.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra23KeyTyped(evt);
			  }
			});
		bra24.setEditable(false);
		bra24.setColumns(20);
		bra24.setFont(new Font("Calibri", 0, 12));
		bra24.setLineWrap(true);
		bra24.setRows(3);
		bra24.setAlignmentY(0.2F);
		bra24.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra24.setFocusTraversalPolicyProvider(true);
		bra24.setName("1");
		bra24.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra24MousePressed(evt);
			  }
			});
		bra24.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra24KeyTyped(evt);
			  }
			});
		GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
		this.jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel7Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra16, -2, 50, -2)
				.addComponent(bra22, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
				  .addComponent(bra17, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra18, -2, 50, -2))
				.addGroup(jPanel7Layout.createSequentialGroup()
				  .addComponent(bra23, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra24, -2, 50, -2)))
			  .addGap(2, 2, 2)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel7Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup()
				  .addComponent(bra16, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra22, -2, 50, -2))
				.addGroup(jPanel7Layout.createSequentialGroup()
				  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra17, -2, 50, -2)
					.addComponent(bra18, -2, 50, -2))
				  .addGap(2, 2, 2)
				  .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra23, -2, 50, -2)
					.addComponent(bra24, -2, 50, -2))))
			  .addContainerGap()));
		this.jPanel9.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel9.setPreferredSize(new Dimension(150, 152));
		bra25.setEditable(false);
		bra25.setColumns(20);
		bra25.setFont(new Font("Calibri", 0, 12));
		bra25.setLineWrap(true);
		bra25.setRows(3);
		bra25.setAlignmentY(0.2F);
		bra25.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra25.setFocusTraversalPolicyProvider(true);
		bra25.setName("1");
		bra25.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra25MousePressed(evt);
			  }
			});
		bra25.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra25KeyTyped(evt);
			  }
			});
		bra26.setEditable(false);
		bra26.setColumns(20);
		bra26.setFont(new Font("Calibri", 0, 12));
		bra26.setLineWrap(true);
		bra26.setRows(3);
		bra26.setAlignmentY(0.2F);
		bra26.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra26.setFocusTraversalPolicyProvider(true);
		bra26.setName("1");
		bra26.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra26MousePressed(evt);
			  }
			});
		bra26.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra26KeyTyped(evt);
			  }
			});
		bra31.setEditable(false);
		bra31.setColumns(20);
		bra31.setFont(new Font("Calibri", 0, 12));
		bra31.setLineWrap(true);
		bra31.setRows(3);
		bra31.setAlignmentY(0.2F);
		bra31.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra31.setFocusTraversalPolicyProvider(true);
		bra31.setName("1");
		bra31.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra31MousePressed(evt);
			  }
			});
		bra31.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra31KeyTyped(evt);
			  }
			});
		bra32.setEditable(false);
		bra32.setColumns(20);
		bra32.setFont(new Font("Calibri", 0, 12));
		bra32.setLineWrap(true);
		bra32.setRows(3);
		bra32.setAlignmentY(0.2F);
		bra32.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra32.setFocusTraversalPolicyProvider(true);
		bra32.setName("1");
		bra32.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra32MousePressed(evt);
			  }
			});
		bra32.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra32KeyTyped(evt);
			  }
			});
		bra27.setEditable(false);
		bra27.setColumns(20);
		bra27.setFont(new Font("Calibri", 0, 12));
		bra27.setLineWrap(true);
		bra27.setRows(3);
		bra27.setText("3 6 7");
		bra27.setAlignmentY(0.2F);
		bra27.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra27.setFocusTraversalPolicyProvider(true);
		bra27.setName("1");
		bra27.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra27MousePressed(evt);
			  }
			});
		bra27.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra27KeyTyped(evt);
			  }
			});
		bra33.setEditable(false);
		bra33.setColumns(20);
		bra33.setFont(new Font("Calibri", 0, 12));
		bra33.setLineWrap(true);
		bra33.setRows(3);
		bra33.setAlignmentY(0.2F);
		bra33.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra33.setFocusTraversalPolicyProvider(true);
		bra33.setName("1");
		bra33.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra33MousePressed(evt);
			  }
			});
		bra33.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra33KeyTyped(evt);
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
				  .addComponent(bra25, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra26, -2, 50, -2))
				.addGroup(jPanel9Layout.createSequentialGroup()
				  .addComponent(bra31, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra32, -2, 50, -2)))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra27, -2, 50, -2)
				.addComponent(bra33, -2, 50, -2))
			  .addGap(2, 2, 2)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel9Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup()
				  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra25, -2, 50, -2)
					.addComponent(bra26, -2, 50, -2))
				  .addGap(2, 2, 2)
				  .addGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(bra31, -2, 50, -2)
					.addComponent(bra32, -2, 50, -2)))
				.addGroup(jPanel9Layout.createSequentialGroup()
				  .addComponent(bra27, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra33, -2, 50, -2)))
			  .addContainerGap(-1, 32767)));
		this.jPanel10.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
		this.jPanel10.setPreferredSize(new Dimension(150, 152));
		bra28.setEditable(false);
		bra28.setColumns(20);
		bra28.setFont(new Font("Calibri", 0, 12));
		bra28.setLineWrap(true);
		bra28.setRows(3);
		bra28.setAlignmentY(0.2F);
		bra28.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra28.setFocusTraversalPolicyProvider(true);
		bra28.setName("1");
		bra28.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra28MousePressed(evt);
			  }
			});
		bra28.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra28KeyTyped(evt);
			  }
			});
		bra34.setEditable(false);
		bra34.setColumns(20);
		bra34.setFont(new Font("Calibri", 0, 12));
		bra34.setLineWrap(true);
		bra34.setRows(3);
		bra34.setAlignmentY(0.2F);
		bra34.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra34.setFocusTraversalPolicyProvider(true);
		bra34.setName("1");
		bra34.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra34MousePressed(evt);
			  }
			});
		bra34.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra34KeyTyped(evt);
			  }
			});
		bra29.setEditable(false);
		bra29.setColumns(20);
		bra29.setFont(new Font("Calibri", 0, 12));
		bra29.setLineWrap(true);
		bra29.setRows(3);
		bra29.setAlignmentY(0.2F);
		bra29.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra29.setFocusTraversalPolicyProvider(true);
		bra29.setName("1");
		bra29.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra29MousePressed(evt);
			  }
			});
		bra29.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra29KeyTyped(evt);
			  }
			});
		bra35.setEditable(false);
		bra35.setColumns(20);
		bra35.setFont(new Font("Calibri", 0, 12));
		bra35.setLineWrap(true);
		bra35.setRows(3);
		bra35.setText(" 3 4 5");
		bra35.setAlignmentY(0.2F);
		bra35.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra35.setFocusTraversalPolicyProvider(true);
		bra35.setName("1");
		bra35.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra35MousePressed(evt);
			  }
			});
		bra35.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra35KeyTyped(evt);
			  }
			});
		bra30.setEditable(false);
		bra30.setColumns(20);
		bra30.setFont(new Font("Calibri", 0, 12));
		bra30.setLineWrap(true);
		bra30.setRows(3);
		bra30.setAlignmentY(0.2F);
		bra30.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra30.setFocusTraversalPolicyProvider(true);
		bra30.setName("1");
		bra30.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra30MousePressed(evt);
			  }
			});
		bra30.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra30KeyTyped(evt);
			  }
			});
		bra36.setEditable(false);
		bra36.setColumns(20);
		bra36.setFont(new Font("Calibri", 0, 12));
		bra36.setLineWrap(true);
		bra36.setRows(3);
		bra36.setAlignmentY(0.2F);
		bra36.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 97, 0)));
		bra36.setFocusTraversalPolicyProvider(true);
		bra36.setName("1");
		bra36.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.bra36MousePressed(evt);
			  }
			});
		bra36.addKeyListener(new KeyAdapter() {
			  public void keyTyped(KeyEvent evt) {
				_4_sudoku6x6.this.bra36KeyTyped(evt);
			  }
			});
		GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
		this.jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel10Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra28, -2, 50, -2)
				.addComponent(bra34, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra29, -2, 50, -2)
				.addComponent(bra35, -2, 50, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(bra30, -2, 50, -2)
				.addComponent(bra36, -2, 50, -2))
			  .addGap(2, 2, 2)));
		jPanel10Layout.setVerticalGroup(jPanel10Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel10Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup()
				  .addComponent(bra28, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra34, -2, 50, -2))
				.addGroup(jPanel10Layout.createSequentialGroup()
				  .addComponent(bra30, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra36, -2, 50, -2))
				.addGroup(jPanel10Layout.createSequentialGroup()
				  .addComponent(bra29, -2, 50, -2)
				  .addGap(2, 2, 2)
				  .addComponent(bra35, -2, 50, -2)))
			  .addContainerGap()));
		GroupLayout jPanel12Layout = new GroupLayout(this.jPanel12);
		this.jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout.setHorizontalGroup(jPanel12Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel12Layout.createSequentialGroup()
			  .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
				.addGroup(jPanel12Layout.createSequentialGroup()
				  .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
					.addComponent(this.jPanel6, -2, 160, 32767)
					.addComponent(this.jPanel2, -1, 160, 32767))
				  .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
					.addComponent(this.jPanel4, -2, 161, -2)
					.addComponent(this.jPanel7, -1, 161, 32767)))
				.addGroup(jPanel12Layout.createSequentialGroup()
				  .addComponent(this.jPanel9, -2, 160, -2)
				  .addGap(0, 0, 0)
				  .addComponent(this.jPanel10, -1, 161, 32767)))
			  .addGap(0, 0, 0)));
		jPanel12Layout.setVerticalGroup(jPanel12Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel12Layout.createSequentialGroup()
			  .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel2, -2, 108, -2)
				.addComponent(this.jPanel4, -2, 108, -2))
			  .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel6, -2, 108, -2)
				.addComponent(this.jPanel7, -2, 108, -2))
			  .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(this.jPanel9, -2, 108, -2)
				.addComponent(this.jPanel10, -2, 108, -2))
			  .addGap(0, 0, 32767)));
		GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
		this.jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
			  .addContainerGap()
			  .addComponent(this.jPanel12, -1, -1, 32767)
			  .addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
			  .addGap(10, 10, 10)
			  .addComponent(this.jPanel12, -1, -1, 32767)
			  .addGap(10, 10, 10)));
		this.dugmePomoc.setFont(_3_sudoku9x9.fontDugme);
		this.dugmePomoc.setText("Pomoć");
		this.dugmePomoc.setFocusable(false);
		this.dugmePomoc.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_4_sudoku6x6.this.dugmePomocActionPerformed(evt);
			  }
			});
		reseniBrojLabel1.setFont(_3_sudoku9x9.fontDugme);
		reseniBrojLabel1.setHorizontalAlignment(0);
		reseniBrojLabel1.setText("--");
		reseniBrojLabel1.setBorder(BorderFactory.createBevelBorder(0));
		vremeLabel1.setFont(_3_sudoku9x9.fontNivoi);
		vremeLabel1.setHorizontalAlignment(0);
		vremeLabel1.setText("Vreme");
		vremeLabel1.setBorder(BorderFactory.createEtchedBorder());
		vremeLabel1.setOpaque(true);
		vremeLabel1.setPreferredSize(new Dimension(41, 21));
		this.dugme_1.setFont(_3_sudoku9x9.fontDugme);
		this.dugme_1.setText("1");
		this.dugme_1.setFocusable(false);
		this.dugme_1.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.dugme_1MousePressed(evt);
			  }
			});
		this.dugme_2.setFont(_3_sudoku9x9.fontDugme);
		this.dugme_2.setText("2");
		this.dugme_2.setFocusable(false);
		this.dugme_2.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.dugme_2MousePressed(evt);
			  }
			});
		this.dugme_3.setFont(_3_sudoku9x9.fontDugme);
		this.dugme_3.setText("3");
		this.dugme_3.setFocusable(false);
		this.dugme_3.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.dugme_3MousePressed(evt);
			  }
			});
		this.dugme_4.setFont(_3_sudoku9x9.fontDugme);
		this.dugme_4.setText("4");
		this.dugme_4.setFocusable(false);
		this.dugme_4.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.dugme_4MousePressed(evt);
			  }
			});
		this.dugme_5.setFont(_3_sudoku9x9.fontDugme);
		this.dugme_5.setText("5");
		this.dugme_5.setFocusable(false);
		this.dugme_5.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.dugme_5MousePressed(evt);
			  }
			});
		this.dugme_6.setFont(_3_sudoku9x9.fontDugme);
		this.dugme_6.setText("6");
		this.dugme_6.setFocusable(false);
		this.dugme_6.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.dugme_6MousePressed(evt);
			  }
			});
		this.pauzaLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/pauza.png")));
		this.pauzaLabel1.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.pauzaLabel1MousePressed(evt);
			  }
			});
		this.zvukLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOn.png")));
		this.zvukLabel1.addMouseListener(new MouseAdapter() {
			  public void mousePressed(MouseEvent evt) {
				_4_sudoku6x6.this.zvukLabel1MousePressed(evt);
			  }
			});
		this.greskaLabel1.setFont(_3_sudoku9x9.fontNivoi);
		this.greskaLabel1.setHorizontalAlignment(0);
		this.greskaLabel1.setText("Greške: 0");
		GroupLayout jPanel13Layout = new GroupLayout(this.jPanel13);
		this.jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addComponent(this.jSeparator1)
			.addComponent(this.jSeparator2)
			.addComponent(this.jSeparator3)
			.addGroup(jPanel13Layout.createSequentialGroup()
			  .addGap(2, 2, 2)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addComponent(this.dugme_1, -2, 45, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.dugme_2, -2, 45, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.dugme_3, -2, 45, -2))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addComponent(this.dugme_4, -2, 45, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.dugme_5, -2, 45, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.dugme_6, -2, 45, -2)))
			  .addGap(0, 0, 32767))
			.addGroup(jPanel13Layout.createSequentialGroup()
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addContainerGap()
				  .addComponent(vremeLabel1, -1, -1, 32767))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addGap(29, 29, 29)
				  .addComponent(this.pauzaLabel1, -2, 48, -2)
				  .addGap(16, 16, 16)
				  .addComponent(this.zvukLabel1, -2, 32, -2)
				  .addGap(0, 0, 32767))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addContainerGap()
				  .addComponent(this.dugmePomoc)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
				  .addComponent(reseniBrojLabel1, -2, 56, -2))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addContainerGap()
				  .addComponent(this.greskaLabel1, -1, -1, 32767)))
			  .addContainerGap()));
		jPanel13Layout.setVerticalGroup(jPanel13Layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
			  .addGap(16, 16, 16)
			  .addComponent(this.jSeparator3, -2, -1, -2)
			  .addGap(6, 6, 6)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugmePomoc, -2, 31, -2)
				.addComponent(reseniBrojLabel1, -2, 38, -2))
			  .addGap(18, 18, 18)
			  .addComponent(this.greskaLabel1, -2, 29, -2)
			  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			  .addComponent(this.jSeparator1, -2, 10, -2)
			  .addGap(2, 2, 2)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_1, -2, 45, -2)
				.addComponent(this.dugme_2, -2, 45, -2)
				.addComponent(this.dugme_3, -2, 45, -2))
			  .addGap(2, 2, 2)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(this.dugme_4, -2, 45, -2)
				.addComponent(this.dugme_5, -2, 45, -2)
				.addComponent(this.dugme_6, -2, 45, -2))
			  .addGap(7, 7, 7)
			  .addComponent(this.jSeparator2, -2, 8, -2)
			  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			  .addComponent(vremeLabel1, -2, 28, -2)
			  .addGroup(jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				  .addComponent(this.pauzaLabel1, -2, 48, -2))
				.addGroup(jPanel13Layout.createSequentialGroup()
				  .addGap(20, 20, 20)
				  .addComponent(this.zvukLabel1, -2, 32, -2)))
			  .addContainerGap()));
		kandidatiCheckBox1.setFont(_3_sudoku9x9.font16);
		kandidatiCheckBox1.setText("Prikaži moguće brojeve");
		kandidatiCheckBox1.setFocusable(false);
		kandidatiCheckBox1.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_4_sudoku6x6.this.kandidatiCheckBox1ActionPerformed(evt);
			  }
			});
		puneCelijeLabel1.setFont(_3_sudoku9x9.font16);
		puneCelijeLabel1.setHorizontalAlignment(0);
		puneCelijeLabel1.setText("popunjenCelija");
		this.nivoLabel1.setFont(_3_sudoku9x9.fontNivoi);
		this.nivoLabel1.setHorizontalAlignment(0);
		this.nivoLabel1.setText("Nivo: ");
		this.dugmeNazad1.setFont(_3_sudoku9x9.fontDugme);
		this.dugmeNazad1.setText("Nazad");
		this.dugmeNazad1.setFocusable(false);
		this.dugmeNazad1.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				_4_sudoku6x6.this.dugmeNazad1ActionPerformed(evt);
			  }
			});
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			  .addContainerGap()
			  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
				  .addComponent(this.jPanel1, -2, -1, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.jPanel13, -2, -1, -2))
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
				  .addComponent(kandidatiCheckBox1, -2, 165, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				  .addComponent(puneCelijeLabel1, -2, 135, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.nivoLabel1, -2, 109, -2)
				  .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				  .addComponent(this.dugmeNazad1)))
			  .addContainerGap()));
		layout.setVerticalGroup(layout
			.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
			  .addContainerGap()
			  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
				.addComponent(this.jPanel13, -1, -1, 32767)
				.addComponent(this.jPanel1, -1, -1, 32767))
			  .addGap(6, 6, 6)
			  .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(kandidatiCheckBox1)
				.addComponent(puneCelijeLabel1, -1, -1, 32767)
				.addComponent(this.nivoLabel1, -2, 25, -2)
				.addComponent(this.dugmeNazad1, -2, 31, -2))
			  .addContainerGap(-1, 32767)));
		pack();
		setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dugmePomocActionPerformed(ActionEvent evt) {
        vratiBoju();
        _3_sudoku9x9.playSound("klik.wav");
        if (resenihKocki1 < 36) {
            trag1 = true;
            dodajVreme1(10);
            (new JednostavnoDoOtkrivanja()).pretraziJednostavno();
            trag1 = false;
        }
        this.red = JednostavnoDoOtkrivanja.tempRed;
        this.kolona = JednostavnoDoOtkrivanja.tempKol;
        matSudoku1[this.red][this.kolona].getJtf().requestFocus();
    }

    private void bra1MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra1);
            this.red = 0;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void bra1KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra1);
    }

    private void bra2MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra2);
            this.red = 0;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void bra2KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra2);
    }

    private void bra3MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra3);
            this.red = 0;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void bra3KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra3);
    }

    private void bra4MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra4);
            this.red = 0;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void bra4KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra4);
    }

    private void bra5MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra5);
            this.red = 0;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void bra5KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra5);
    }

    private void bra6MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra6);
            this.red = 0;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void bra6KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra6);
    }

    private void bra7MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra7);
            this.red = 1;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void bra7KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra7);
    }

    private void bra8MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra8);
            this.red = 1;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void bra8KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra8);
    }

    private void bra9MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra9);
            this.red = 1;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void bra9KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra9);
    }

    private void bra10MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra10);
            this.red = 1;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void bra10KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra10);
    }

    private void bra11MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra11);
            this.red = 1;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void bra11KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra11);
    }

    private void bra12MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra12);
            this.red = 1;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void bra12KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra12);
    }

    private void bra13MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra13);
            this.red = 2;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void bra13KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra13);
    }

    private void bra14MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra14);
            this.red = 2;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void bra14KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra14);
    }

    private void bra15MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra15);
            this.red = 2;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void bra15KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra15);
    }

    private void bra16MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra16);
            this.red = 2;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void bra16KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra16);
    }

    private void bra17MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra17);
            this.red = 2;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void bra17KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra17);
    }

    private void bra18MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra18);
            this.red = 2;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void bra18KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra18);
    }

    private void bra19MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra19);
            this.red = 3;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void bra19KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra19);
    }

    private void bra20MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra20);
            this.red = 3;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void bra20KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra20);
    }

    private void bra21MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra21);
            this.red = 3;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void bra21KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra21);
    }

    private void bra22MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra22);
            this.red = 3;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void bra22KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra22);
    }

    private void bra23MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra23);
            this.red = 3;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void bra23KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra23);
    }

    private void bra24MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra24);
            this.red = 3;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void bra24KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra24);
    }

    private void bra25MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra25);
            this.red = 4;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void bra25KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra25);
    }

    private void bra26MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra26);
            this.red = 4;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void bra26KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra26);
    }

    private void bra27MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra27);
            this.red = 4;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void bra27KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra27);
    }

    private void bra28MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra28);
            this.red = 4;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void bra28KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra28);
    }

    private void bra29MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra29);
            this.red = 4;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void bra29KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra29);
    }

    private void bra30MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra30);
            this.red = 4;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void bra30KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra30);
    }

    private void bra31MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra31);
            this.red = 5;
            this.kolona = 0;
            pretraziIsteBrojeve();
        }
    }

    private void bra31KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra31);
    }

    private void bra32MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra32);
            this.red = 5;
            this.kolona = 1;
            pretraziIsteBrojeve();
        }
    }

    private void bra32KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra32);
    }

    private void bra33MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra33);
            this.red = 5;
            this.kolona = 2;
            pretraziIsteBrojeve();
        }
    }

    private void bra33KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra33);
    }

    private void bra34MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra34);
            this.red = 5;
            this.kolona = 3;
            pretraziIsteBrojeve();
        }
    }

    private void bra34KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra34);
    }

    private void bra35MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra35);
            this.red = 5;
            this.kolona = 4;
            pretraziIsteBrojeve();
        }
    }

    private void bra35KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra35);
    }

    private void bra36MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            bojaKocke(bra36);
            this.red = 5;
            this.kolona = 5;
            pretraziIsteBrojeve();
        }
    }

    private void bra36KeyTyped(KeyEvent evt) {
        upisiBroj(evt, bra36);
    }

    private void kandidatiCheckBox1ActionPerformed(ActionEvent evt) {
        vratiBoju();
        if (!kandidatiCheckBox1.isSelected()) {
            _3_sudoku9x9.playSound("radio.wav");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (!matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getJtf().getBackground().equals(boja3)) {
                        matSudoku1[i][j].getJtf().setText((String) null);
                    }
                }
            }
            if (_1_Menu.jezik) {
                kandidatiCheckBox1.setText("Prikaži moguće brojeve");
            } else {
                kandidatiCheckBox1.setText("Show possible numbers");
            }
        } else {
            _3_sudoku9x9.playSound("check.wav");
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (!matSudoku1[i][j].isPronadjen()) {
                        for (int k = 0; k < matSudoku1[i][j].getKandidati().size(); k++) {
                            matSudoku1[i][j].getJtf().append(" " + matSudoku1[i][j].getKandidati().get(k));
                        }
                    }
                }
            }
            if (_1_Menu.jezik) {
                kandidatiCheckBox1.setText("Prikaži moguće brojeve");
            } else {
                kandidatiCheckBox1.setText("Hide possible numbers");
            }
        }
    }

    private void formWindowDeactivated(WindowEvent evt) {
        vreme1.suspenduj();
    }

    private void formWindowActivated(WindowEvent evt) {
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/pauza.png");
        if (this.pauzaLabel1.getIcon().toString().equals(ikonPath.toString())) {
            vreme1.nastavi();
        }
    }

    private void formWindowDeiconified(WindowEvent evt) {
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/pauza.png");
        if (this.pauzaLabel1.getIcon().toString().equals(ikonPath.toString())) {
            vreme1.nastavi();
        }
    }

    private void pauzaLabel1MousePressed(MouseEvent evt) {
        _3_sudoku9x9.playSound("klik.wav");
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/pauza.png");
        if (this.pauzaLabel1.getIcon().toString().equals(ikonPath.toString())) {
            this.pauzaLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/play.png")));
            vreme1.suspenduj();
            for (int i = 0; i < matSudoku1.length; i++) {
                for (int j = 0; j < matSudoku1.length; j++) {
                    matSudoku1[i][j].getJtf().setVisible(false);
                }
            }
        } else {
            this.pauzaLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/pauza.png")));
            vreme1.nastavi();
            for (int i = 0; i < matSudoku1.length; i++) {
                for (int j = 0; j < matSudoku1.length; j++) {
                    matSudoku1[i][j].getJtf().setVisible(true);
                }
            }
        }
    }

    private void zvukLabel1MousePressed(MouseEvent evt) {
        _3_sudoku9x9.playSound("klik.wav");
        URL ikonPath = getClass().getResource("/zavrsnirad/slike/zvukOn.png");
        if (_3_sudoku9x9.clipMuzika != null) {
            if (this.zvukLabel1.getIcon().toString().equals(ikonPath.toString())) {
                _3_sudoku9x9.playSound("muzika.wav", "pauza");
                this.zvukLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOff.png")));
            } else {
                _3_sudoku9x9.playSound("muzika.wav", "nastavi");
                this.zvukLabel1.setIcon(new ImageIcon(getClass().getResource("/zavrsnirad/slike/zvukOn.png")));
            }
        }
    }

    private void dugmeNazad1ActionPerformed(ActionEvent evt) {
        _1_Menu m = new _1_Menu();
        _3_sudoku9x9.playSound("klik.wav");
        sacuvajMatricu();
        dispose();
        m.setVisible(true);
        vreme1.stopirajThread();
    }

    private void dugme_1MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(1);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(1);
            dodajVreme1(5);
        }
    }

    private void dugme_2MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(2);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(2);
            dodajVreme1(5);
        }
    }

    private void dugme_3MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(3);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(3);
            dodajVreme1(5);
        }
    }

    private void dugme_4MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(4);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(4);
            dodajVreme1(5);
        }
    }

    private void dugme_5MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(5);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(5);
            dodajVreme1(5);
        }
    }

    private void dugme_6MousePressed(MouseEvent evt) {
        if (SwingUtilities.isLeftMouseButton(evt)) {
            upisiBrojSaMisem(6);
        } else if (SwingUtilities.isRightMouseButton(evt)
                && !_2_Podesavanja.pomocIgra) {
            vratiBoju();
            filtriraj(6);
            dodajVreme1(5);
        }
    }

    void vratiBoju() {
        Color temp0 = new Color(171, 241, 171);
        Color temp1 = new Color(250, 250, 175);
        for (int i = 0; i < matrica1.length; i++) {
            for (int j = 0; j < (matrica1[i]).length; j++) {
                if ((matSudoku1[i][j].getJtf().getBackground().equals(temp0) || matSudoku1[i][j]
                        .getJtf().getBackground().equals(temp1)) && matSudoku1[i][j]
                        .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                    matSudoku1[i][j].getJtf().setBackground(this.boja5);
                } else if (matSudoku1[i][j].getJtf().getBackground().equals(temp0) || matSudoku1[i][j]
                        .getJtf().getBackground().equals(temp1)) {
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                } else if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku1[i][j].getJtf().setBackground(boja2);
                } else if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j]
                        .getJtf().getForeground().equals(new Color(51, 204, 51))) {
                    matSudoku1[i][j].getJtf().setBackground(this.boja4);
                } else if (!matSudoku1[i][j].isPronadjen() && matSudoku1[i][j]
                        .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                    matSudoku1[i][j].getJtf().setBackground(this.boja5);
                } else if (!matSudoku1[i][j].isPronadjen() && matSudoku1[i][j]
                        .getJtf().getBackground().equals(this.boja1)) {
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                } else if (!matSudoku1[i][j].isPronadjen() && (matSudoku1[i][j]
                        .getJtf().getBackground().equals(this.boja1) || matSudoku1[i][j]
                        .getJtf().getBackground().equals(boja2))) {
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                } else if (!matSudoku1[i][j].isPronadjen() && matSudoku1[i][j]
                        .getJtf().getBackground().equals(this.boja5) && matSudoku1[i][j]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                } else if (!matSudoku1[i][j].isPronadjen() && matSudoku1[i][j]
                        .getJtf().getBackground().equals(this.boja4) && matSudoku1[i][j]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                }
                matSudoku1[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(0, 97, 0)));
            }
        }
    }

    void bojaKocke(JTextArea bk) {
        _3_sudoku9x9.playSound("tak.wav");
        if (resenihKocki1 < 36) {
            if (matSudoku1[this.red][this.kolona].isPronadjen()) {
                if (matSudoku1[this.red][this.kolona].getJtf().getBackground().equals(this.boja4) || (matSudoku1[this.red][this.kolona]
                        .getJtf().getBackground().equals(this.boja1) && matSudoku1[this.red][this.kolona]
                        .getJtf().getForeground().equals(new Color(51, 204, 51)))) {
                    this.aux.setBackground(this.boja4);
                } else {
                    this.aux.setBackground(boja2);
                }
            } else if (matSudoku1[this.red][this.kolona].getJtf().getBackground().equals(this.boja5) || (matSudoku1[this.red][this.kolona]
                    .getJtf().getBackground().equals(this.boja1) && matSudoku1[this.red][this.kolona]
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
        _3_sudoku9x9.playSound("tak.wav");
        if (resenihKocki1 < 81) {
            matSudoku1[this.red][this.kolona].getJtf().setBackground(this.boja1);
            matSudoku1[this.red][this.kolona].getJtf().requestFocus();
        }
    }

    private void upisiBroj(KeyEvent evt, JTextArea jta) {
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        } else if (!matSudoku1[this.red][this.kolona].isPronadjen() && c != '0' && c != '7' && c != '8' && c != '9') {
            if (matrica1[this.red][this.kolona] == Integer.parseInt(String.valueOf(c))) {
                _3_sudoku9x9.playSound("good.wav");
                jta.setText(" " + c);
                matSudoku1[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(c)));
                matSudoku1[this.red][this.kolona].setPronadjen(true);
                jta.setFont(new Font("Monospaced", 1, 27));
                matSudoku1[this.red][this.kolona].getJtf().setEditable(false);
                jta.setBackground(this.boja4);
                jta.setForeground(new Color(51, 204, 51));
                matSudoku1[this.red][this.kolona].getKandidati().clear();
                matSudoku1[this.red][this.kolona].dodajBroj(Integer.parseInt(String.valueOf(c)));
                ukloniKolonu(Integer.parseInt(String.valueOf(c)));
                ukloniBrRed(Integer.parseInt(String.valueOf(c)));
                ukloniKocku(Integer.parseInt(String.valueOf(c)));
                resenihKocki1++;
                if (_1_Menu.jezik) {
                    puneCelijeLabel1.setText("Popunjene ćelije: " + resenihKocki1);
                } else {
                    puneCelijeLabel1.setText("Filled cells: " + resenihKocki1);
                }
                ugasiDugmeChar(c);
                reseniBrojLabel1.setText("--");
            } else {
                _3_sudoku9x9.playSound("bad.wav");
                dodajVreme1(8);
                this.greskeBrojac1++;
                jta.setText(" " + c);
                matSudoku1[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(c)));
                matSudoku1[this.red][this.kolona].setPronadjen(false);
                jta.setFont(new Font("Monospaced", 1, 27));
                matSudoku1[this.red][this.kolona].getJtf().setEditable(false);
                jta.setBackground(this.boja5);
                jta.setForeground(new Color(255, 51, 51));
                reseniBrojLabel1.setText("--");
            }
            vratiBoju();
            pretraziIsteBrojeve();
            ispisiGresku();
            if (resenihKocki1 == 36) {
                sacuvajMatricu();
                _5_cestitamo cestitamo = new _5_cestitamo();
                vreme1.stopirajTajmer();
                dispose();
                cestitamo.setVisible(true);
            }
        }
    }

    private void upisiBrojSaMisem(int broj) {
        if (!matSudoku1[this.red][this.kolona].isPronadjen()) {
            if (matrica1[this.red][this.kolona] == Integer.parseInt(String.valueOf(broj))) {
                _3_sudoku9x9.playSound("good.wav");
                matSudoku1[this.red][this.kolona].getJtf().setText(" " + broj);
                matSudoku1[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(broj)));
                matSudoku1[this.red][this.kolona].setPronadjen(true);
                matSudoku1[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 1, 27));
                matSudoku1[this.red][this.kolona].getJtf().setEditable(false);
                matSudoku1[this.red][this.kolona].getJtf().setBackground(this.boja4);
                matSudoku1[this.red][this.kolona].getJtf().setForeground(new Color(51, 204, 51));
                matSudoku1[this.red][this.kolona].getKandidati().clear();
                matSudoku1[this.red][this.kolona].dodajBroj(Integer.parseInt(String.valueOf(broj)));
                ukloniKolonu(Integer.parseInt(String.valueOf(broj)));
                ukloniBrRed(Integer.parseInt(String.valueOf(broj)));
                ukloniKocku(Integer.parseInt(String.valueOf(broj)));
                resenihKocki1++;
                if (_1_Menu.jezik) {
                    puneCelijeLabel1.setText("Popunjene ćelije: " + resenihKocki1);
                } else {
                    puneCelijeLabel1.setText("Filled cells: " + resenihKocki1);
                }
                reseniBrojLabel1.setText("--");
                ugasiDugmeInt(broj);
            } else {
                _3_sudoku9x9.playSound("bad.wav");
                dodajVreme1(5);
                this.greskeBrojac1++;
                matSudoku1[this.red][this.kolona].getJtf().setText(" " + broj);
                matSudoku1[this.red][this.kolona].setBroj(Integer.parseInt(String.valueOf(broj)));
                matSudoku1[this.red][this.kolona].setPronadjen(false);
                matSudoku1[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 1, 27));
                matSudoku1[this.red][this.kolona].getJtf().setEditable(false);
                matSudoku1[this.red][this.kolona].getJtf().setBackground(this.boja5);
                matSudoku1[this.red][this.kolona].getJtf().setForeground(new Color(255, 51, 51));
                reseniBrojLabel1.setText("--");
            }
            vratiBoju();
            pretraziIsteBrojeve();
            ispisiGresku();
            if (resenihKocki1 == 36) {
                sacuvajMatricu();
                _5_cestitamo cestitamo = new _5_cestitamo();
                vreme1.stopirajTajmer();
                dispose();
                cestitamo.setVisible(true);
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        matSudoku1[i][j].getJtf().setEnabled(false);
                    }
                }
            }
        }
    }

    private void pretraziIsteBrojeve() {
        reseniBrojLabel1.setText("--");
        int br = matSudoku1[this.red][this.kolona].getBroj();
        if (!_2_Podesavanja.pomocIgra) {
            if (matSudoku1[this.red][this.kolona].isPronadjen()) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getBroj() == br && matSudoku1[i][j]
                                .getJtf().getBackground().equals(this.boja1)) {
                            matSudoku1[i][j].getJtf().setBackground(this.boja1);
                            matSudoku1[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(15, 15, 255), 2));
                        } else if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getBroj() == br && matSudoku1[i][j]
                                .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                            matSudoku1[i][j].getJtf().setBackground(new Color(115, 220, 255));
                            matSudoku1[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(15, 15, 255), 2));
                        } else if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getBroj() == br && matSudoku1[i][j]
                                .getJtf().getForeground().equals(new Color(51, 204, 51))) {
                            matSudoku1[i][j].getJtf().setBackground(new Color(130, 235, 255));
                            matSudoku1[i][j].getJtf().setBorder(BorderFactory.createLineBorder(new Color(15, 15, 255), 2));
                        }
                    }
                }
            }
            if (!matSudoku1[this.red][this.kolona].isPronadjen() && matSudoku1[this.red][this.kolona]
                    .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                pretraziRazlogBrojeva(br, this.red, this.kolona);
            }
        }
    }

    private void pretraziRazlogBrojeva(int br, int red, int kol) {
        int i;
        for (i = 0; i < 6; i++) {
            if (matSudoku1[red][i].isPronadjen() && matSudoku1[red][i].getBroj() == br) {
                matSudoku1[red][i].getJtf().setBorder(BorderFactory.createLineBorder(new Color(255, 15, 15), 2));
                matSudoku1[red][i].getJtf().setBackground(new Color(255, 222, 222));
            }
        }
        for (i = 0; i < 6; i++) {
            if (matSudoku1[i][kol].isPronadjen() && matSudoku1[i][kol].getBroj() == br) {
                matSudoku1[i][kol].getJtf().setBorder(BorderFactory.createLineBorder(new Color(255, 15, 15), 2));
                matSudoku1[i][kol].getJtf().setBackground(new Color(255, 222, 222));
            }
        }
        int red_start = red / 2 * 2;
        int kol_start = kol / 3 * 3;
        for (int j = red_start; j < red_start + 2; j++) {
            for (int k = kol_start; k < kol_start + 3; k++) {
                if (matSudoku1[j][k].isPronadjen() && matSudoku1[j][k].getBroj() == br) {
                    matSudoku1[j][k].getJtf().setBorder(BorderFactory.createLineBorder(new Color(255, 15, 15), 2));
                    matSudoku1[j][k].getJtf().setBackground(new Color(255, 222, 222));
                }
            }
        }
    }

    public void ukloniKolonu(int br) {
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> temp1 = matSudoku1[i][this.kolona].getKandidati();
            for (int j = 0; j < temp1.size(); j++) {
                if (br == ((Integer) temp1.get(j)).intValue() && !matSudoku1[i][this.kolona].isPronadjen()) {
                    matSudoku1[i][this.kolona].obrisiKandidata(temp1.get(j));
                    if (kandidatiCheckBox1.isSelected()) {
                        moguceStampanje(i, this.kolona);
                    }
                    break;
                }
            }
        }
    }

    private void ukloniBrRed(int broj) {
        for (int i = 0; i < 6; i++) {
            ArrayList<Integer> tempRed1 = matSudoku1[this.red][i].getKandidati();
            for (int j = 0; j < tempRed1.size(); j++) {
                if (broj == ((Integer) tempRed1.get(j)).intValue() && !matSudoku1[this.red][i].isPronadjen()) {
                    matSudoku1[this.red][i].obrisiKandidata(tempRed1.get(j));
                    if (kandidatiCheckBox1.isSelected()) {
                        moguceStampanje(this.red, i);
                    }
                    break;
                }
            }
        }
    }

    private void ukloniKocku(int broj) {
        for (int r = this.red / 2 * 2; r < this.red / 2 * 2 + 2; r++) {
            for (int k = this.kolona / 3 * 3; k < this.kolona / 3 * 3 + 3; k++) {
                if (!matSudoku1[r][k].isPronadjen()) {
                    ArrayList<Integer> tempKocka = matSudoku1[r][k].getKandidati();
                    for (int i = 0; i < tempKocka.size(); i++) {
                        if (((Integer) tempKocka.get(i)).intValue() == broj) {
                            matSudoku1[r][k].obrisiKandidata(tempKocka.get(i));
                            if (kandidatiCheckBox1.isSelected()
                                    && !matSudoku1[r][k].isPronadjen() && matSudoku1[r][k].getJtf().getBackground().equals(boja3)) {
                                matSudoku1[r][k].getJtf().setText((String) null);
                                for (int j = 0; j < matSudoku1[r][k].getKandidati().size(); j++) {
                                    matSudoku1[r][k].getJtf().append(" " + matSudoku1[r][k].getKandidati().get(j));
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
        if (!matSudoku1[red][kol].isPronadjen() && matSudoku1[red][kol].getJtf().getBackground().equals(boja3)) {
            matSudoku1[red][kol].getJtf().setText((String) null);
        }
        for (int i = 0; i < matSudoku1[red][kol].getKandidati().size(); i++) {
            if (!matSudoku1[red][kol].isPronadjen() && matSudoku1[red][kol].getJtf().getBackground().equals(boja3)) {
                matSudoku1[red][kol].getJtf().append(" " + matSudoku1[red][kol].getKandidati().get(i));
            }
        }
    }

    private void ugasiDugmeChar(char br) {
        int broj = Character.getNumericValue(br);
        int brojac = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getBroj() == broj) {
                    brojac++;
                }
            }
        }
        if (brojac == 6) {
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
            }
        }
    }

    private void ugasiDugmeInt(int br) {
        int broj = br;
        int brojac = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getBroj() == broj) {
                    brojac++;
                }
            }
        }
        if (brojac == 6) {
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
            }
        }
    }

    private void sacuvajMatricu() {
        int[][] temporarni = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrica1[i][j] = 0;
                if (matSudoku1[i][j].isPronadjen() && matSudoku1[i][j].getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    temporarni[i][j] = matSudoku1[i][j].getBroj();
                    matSudoku1[i][j].setPronadjen(false);
                    matSudoku1[i][j].getKandidati().clear();
                    matSudoku1[i][j].setBroj(0);
                    matSudoku1[i][j].getJtf().setFont(new Font("Monospaced", 0, 12));
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                    matSudoku1[i][j].getJtf().setText((String) null);
                    matrica1[i][j] = temporarni[i][j];
                }
            }
        }
    }

    private void filtriraj(int broj) {
        _3_sudoku9x9.playSound("klik.wav");
        for (int r = 0; r < 6; r++) {
            for (int k = 0; k < 6; k++) {
                if (matSudoku1[r][k].isPronadjen() && matSudoku1[r][k]
                        .getJtf().getForeground().equals(new Color(0, 0, 0))) {
                    matSudoku1[r][k].getJtf().setBackground(boja2);
                } else if (matSudoku1[r][k].isPronadjen() && matSudoku1[r][k]
                        .getJtf().getForeground().equals(new Color(51, 204, 51))) {
                    matSudoku1[r][k].getJtf().setBackground(this.boja4);
                } else if (!matSudoku1[r][k].isPronadjen() && matSudoku1[r][k]
                        .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                    matSudoku1[r][k].getJtf().setBackground(this.boja5);
                } else {
                    matSudoku1[r][k].getJtf().setBackground(boja3);
                }
                if (!matSudoku1[r][k].isPronadjen()) {
                    ArrayList<Integer> tmp = matSudoku1[r][k].getKandidati();
                    for (int i = 0; i < tmp.size(); i++) {
                        if (((Integer) tmp.get(i)).intValue() == broj) {
                            matSudoku1[r][k].getJtf().setBackground(new Color(171, 241, 171));
                            break;
                        }
                    }
                }
            }
        }
    }

    private void restartuj() {
        resenihKocki1 = 0;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                matSudoku1[i][j].setPronadjen(false);
                matSudoku1[i][j].getKandidati().clear();
                matSudoku1[i][j].setBroj(0);
                matSudoku1[i][j].getJtf().setFont(new Font("Calibri", 0, 12));
                matSudoku1[i][j].getJtf().setBackground(boja3);
                matSudoku1[i][j].getJtf().setText((String) null);
            }
        }
    }

    private void krejtSaBazom() {
        restartuj();
        for (int i = 0; i < matrica1.length; i++) {
            for (int j = 0; j < (matrica1[i]).length; j++) {
                if (matrica1[i][j] != 0) {
                    matSudoku1[i][j].dodajBroj(matrica1[i][j]);
                    matSudoku1[i][j].setBroj(matrica1[i][j]);
                    matSudoku1[i][j].setPronadjen(true);
                    matSudoku1[i][j].getJtf().setFont(new Font("Monospaced", 1, 27));
                    matSudoku1[i][j].getJtf().setText(" " + matrica1[i][j]);
                    matSudoku1[i][j].getJtf().setBackground(boja2);
                    matSudoku1[i][j].getJtf().setForeground(new Color(0, 0, 0));
                    resenihKocki1++;
                } else {
                    matSudoku1[i][j].setPronadjen(false);
                    matSudoku1[i][j].getKandidati().clear();
                    matSudoku1[i][j].setBroj(0);
                    matSudoku1[i][j].getJtf().setFont(new Font("Monospaced", 0, 12));
                    matSudoku1[i][j].getJtf().setBackground(boja3);
                    matSudoku1[i][j].getJtf().setForeground(new Color(0, 0, 0));
                    matSudoku1[i][j].getJtf().setText((String) null);
                }
            }
        }
        (new Kandidati()).moguceOtkazivanje();
        if (_1_Menu.jezik) {
            puneCelijeLabel1.setText("Popunjene ćelije: " + resenihKocki1);
        } else {
            puneCelijeLabel1.setText("Filled cells: " + resenihKocki1);
        }
        vreme1.setMinuta(0);
        vreme1.setSati(0);
        vreme1.setSekundi(0);
        if (_2_Podesavanja.nivo.equals("laganom")) {
            if (_1_Menu.jezik) {
                this.nivoLabel1.setText("Nivo: Lagan");
            } else {
                this.nivoLabel1.setText("Level: Easy");
            }
        } else if (_2_Podesavanja.nivo.equals("srednjem")) {
            if (_1_Menu.jezik) {
                this.nivoLabel1.setText("Nivo: Srednji");
            } else {
                this.nivoLabel1.setText("Leved: Medium");
            }
        } else if (_1_Menu.jezik) {
            this.nivoLabel1.setText("Nivo: Težak");
        } else {
            this.nivoLabel1.setText("Leved: Hard");
        }
    }

    private void randomBazaMatrice() {
        Random rnd = new Random();
        int broj = rnd.nextInt(5) + 1;
        int i = 0;
        if (i < 20
                && tempBrMatrice1 == broj) {
            broj = rnd.nextInt(5) + 1;
            if (broj == tempBrMatrice1 && broj <= 5) {
                broj++;
            }
        }
        switch (broj) {
            case 1:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica1 = BazaMatrice6x6.matrica1easy;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica1 = BazaMatrice6x6.matrica1medium;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica1 = BazaMatrice6x6.matrica1hard;
                    tempBrMatrice1 = broj;
                }
                break;
            case 2:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica1 = BazaMatrice6x6.matrica2easy;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica1 = BazaMatrice6x6.matrica2medium;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica1 = BazaMatrice6x6.matrica2hard;
                    tempBrMatrice1 = broj;
                }
                break;
            case 3:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica1 = BazaMatrice6x6.matrica3easy;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica1 = BazaMatrice6x6.matrica3medium;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica1 = BazaMatrice6x6.matrica3hard;
                    tempBrMatrice1 = broj;
                }
                break;
            case 4:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica1 = BazaMatrice6x6.matrica4easy;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica1 = BazaMatrice6x6.matrica4medium;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica1 = BazaMatrice6x6.matrica4hard;
                    tempBrMatrice1 = broj;
                }
                break;
            case 5:
                if (_2_Podesavanja.nivo.equals("laganom")) {
                    matrica1 = BazaMatrice6x6.matrica5easy;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("srednjem")) {
                    matrica1 = BazaMatrice6x6.matrica5medium;
                    tempBrMatrice1 = broj;
                    break;
                }
                if (_2_Podesavanja.nivo.equals("teškom")) {
                    matrica1 = BazaMatrice6x6.matrica5hard;
                    tempBrMatrice1 = broj;
                }
                break;
        }
    }

    public static void dodajVreme1(int brSekundi) {
        vreme1.setSekundi(vreme1.getSekundi() + brSekundi);
    }

    private void setPozadina() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/zavrsnirad/slike/ikonica.png")));
    }

    private void ispisiGresku() {
        if (this.greskaLabel1.isEnabled()) {
            int obavestenje;
            _2_Podesavanja p;
            switch (_2_Podesavanja.nivo) {
                case "laganom":
                    if (this.greskeBrojac1 < 2) {
                        if (_1_Menu.jezik) {
                            this.greskaLabel1.setText("Greške: " + this.greskeBrojac1 + " / 2");
                            break;
                        }
                        this.greskaLabel1.setText("Errors: " + this.greskeBrojac1 + " / 2");
                        break;
                    }
                    if (_1_Menu.jezik) {
                        this.greskaLabel1.setText("Greške: " + this.greskeBrojac1 + " / 2");
                    } else {
                        this.greskaLabel1.setText("Errors: " + this.greskeBrojac1 + " / 2");
                    }
                    if (_1_Menu.jezik) {
                        obavestenje = JOptionPane.showConfirmDialog(this, "Izgubili ste jer ste napravili 2 greške.\n          Biće bolje sledeći put.\n    Da li želite ponovo da igrate?", "Obaveštenje o greškama", 0, 1);
                    } else {
                        obavestenje = JOptionPane.showConfirmDialog(this, "You lost because you made 2 mistakes.\n          Better luck next time.\n    Do you want to play again?", "Error notification", 0, 1);
                    }
                    if (obavestenje == 0) {
                        sacuvajMatricu();
                        vreme1.stopirajThread();
                        dispose();
                        _4_sudoku6x6 s = new _4_sudoku6x6();
                        s.setVisible(true);
                        break;
                    }
                    p = new _2_Podesavanja();
                    sacuvajMatricu();
                    vreme1.stopirajThread();
                    dispose();
                    p.setVisible(true);
                    break;
                case "srednjem":
                    if (this.greskeBrojac1 < 3) {
                        if (_1_Menu.jezik) {
                            this.greskaLabel1.setText("Greške: " + this.greskeBrojac1 + " / 3");
                            break;
                        }
                        this.greskaLabel1.setText("Errors: " + this.greskeBrojac1 + " / 3");
                        break;
                    }
                    if (_1_Menu.jezik) {
                        this.greskaLabel1.setText("Greške: " + this.greskeBrojac1 + " / 3");
                    } else {
                        this.greskaLabel1.setText("Errors: " + this.greskeBrojac1 + " / 3");
                    }
                    if (_1_Menu.jezik) {
                        obavestenje = JOptionPane.showConfirmDialog(this, "Izgubili ste jer ste napravili 3 greške.\n          Biće bolje sledeći put.\n    Da li želite ponovo da igrate?", "Obaveštenje o greškama", 0, 1);
                    } else {
                        obavestenje = JOptionPane.showConfirmDialog(this, "You lost because you made 3 mistakes.\n          Better luck next time.\n    Do you want to play again?", "Error notification", 0, 1);
                    }
                    if (obavestenje == 0) {
                        dispose();
                        sacuvajMatricu();
                        vreme1.stopirajThread();
                        _4_sudoku6x6 s = new _4_sudoku6x6();
                        s.setVisible(true);
                        break;
                    }
                    p = new _2_Podesavanja();
                    sacuvajMatricu();
                    vreme1.stopirajThread();
                    dispose();
                    p.setVisible(true);
                    break;
                case "teškom":
                    if (this.greskeBrojac1 < 4) {
                        if (_1_Menu.jezik) {
                            this.greskaLabel1.setText("Greške: " + this.greskeBrojac1 + " / 4");
                            break;
                        }
                        this.greskaLabel1.setText("Errors: " + this.greskeBrojac1 + " / 4");
                        break;
                    }
                    if (_1_Menu.jezik) {
                        this.greskaLabel1.setText("Greške: " + this.greskeBrojac1 + " / 4");
                    } else {
                        this.greskaLabel1.setText("Errors: " + this.greskeBrojac1 + " / 4");
                    }
                    if (_1_Menu.jezik) {
                        obavestenje = JOptionPane.showConfirmDialog(this, "Izgubili ste jer ste napravili 4 greške.\n          Biće bolje sledeći put.\n    Da li želite ponovo da igrate?", "Obaveštenje o greškama", 0, 1);
                    } else {
                        obavestenje = JOptionPane.showConfirmDialog(this, "You lost because you made 4 mistakes.\n          Better luck next time.\n    Do you want to play again?", "Error notification", 0, 1);
                    }
                    if (obavestenje == 0) {
                        dispose();
                        sacuvajMatricu();
                        vreme1.stopirajThread();
                        _4_sudoku6x6 s = new _4_sudoku6x6();
                        s.setVisible(true);
                        break;
                    }
                    p = new _2_Podesavanja();
                    sacuvajMatricu();
                    vreme1.stopirajThread();
                    dispose();
                    p.setVisible(true);
                    break;
            }
        }
    }

    private void generisiMatricu() {
        if (_2_Podesavanja.nivo.equals("laganom") && _2_Podesavanja.software) {
            GenerisiMatricu generisiMatricu = new GenerisiMatricu(6, 17);
        } else if (_2_Podesavanja.nivo.equals("srednjem") && _2_Podesavanja.software) {
            GenerisiMatricu generisiMatricu = new GenerisiMatricu(6, 23);
        } else {
            GenerisiMatricu generisiMatricu = new GenerisiMatricu(6, 29);
        }
    }

    private void podesiJezik() {
        if (_1_Menu.jezik) {
            this.dugmeNazad1.setText("Nazad");
            this.dugmePomoc.setText("Pomoć");
            this.greskaLabel1.setText("Greške: 0");
            kandidatiCheckBox1.setText("Prikaži moguće brojeve");
        } else {
            this.dugmeNazad1.setText("Back");
            this.dugmePomoc.setText("Help");
            this.greskaLabel1.setText("Errors: 0");
            kandidatiCheckBox1.setText("Show possible numbers");
        }
    }

    private void ugasiDugme() {
        if (_2_Podesavanja.pomocIgra) {
            this.dugmePomoc.setEnabled(false);
            kandidatiCheckBox1.setEnabled(false);
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
            java.util.logging.Logger.getLogger(_4_sudoku6x6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_4_sudoku6x6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_4_sudoku6x6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_4_sudoku6x6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _4_sudoku6x6().setVisible(true);
            }
        });
    }

    public void keyPressed(KeyEvent e) {
        char c = e.getKeyChar();
        int pritisnuto = e.getKeyCode();
        if (!Character.isDigit(c) && !Character.isAlphabetic(pritisnuto)) {
            switch (pritisnuto) {
                case 37:
                    if (this.kolona >= 1 && this.kolona <= 5) {
                        vratiBoju();
                        this.kolona--;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 39:
                    if (this.kolona >= 0 && this.kolona < 5) {
                        vratiBoju();
                        this.kolona++;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 38:
                    if (this.red >= 1 && this.red <= 5) {
                        vratiBoju();
                        this.red--;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 40:
                    if (this.red >= 0 && this.red < 5) {
                        vratiBoju();
                        this.red++;
                        bojaKockeStrelicom();
                        pretraziIsteBrojeve();
                    }
                    break;
                case 127:
                    if (matSudoku1[this.red][this.kolona].getBroj() != 0
                            && !matSudoku1[this.red][this.kolona].isPronadjen() && matSudoku1[this.red][this.kolona]
                            .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                        matSudoku1[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 0, 12));
                        matSudoku1[this.red][this.kolona].getJtf().setBackground(boja3);
                        matSudoku1[this.red][this.kolona].getJtf().setForeground(new Color(0, 0, 0));
                        matSudoku1[this.red][this.kolona].getJtf().setText((String) null);
                        if (kandidatiCheckBox1.isSelected()
                                && !matSudoku1[this.red][this.kolona].isPronadjen()) {
                            for (int k = 0; k < matSudoku1[this.red][this.kolona].getKandidati().size(); k++) {
                                matSudoku1[this.red][this.kolona].getJtf().append(" " + matSudoku1[this.red][this.kolona].getKandidati().get(k));
                            }
                        }
                    }
                    vratiBoju();
                    e.consume();
                    break;
                case 8:
                    if (matSudoku1[this.red][this.kolona].getBroj() != 0
                            && !matSudoku1[this.red][this.kolona].isPronadjen() && matSudoku1[this.red][this.kolona]
                            .getJtf().getForeground().equals(new Color(255, 51, 51))) {
                        matSudoku1[this.red][this.kolona].getJtf().setFont(new Font("Monospaced", 0, 12));
                        matSudoku1[this.red][this.kolona].getJtf().setBackground(boja3);
                        matSudoku1[this.red][this.kolona].getJtf().setForeground(new Color(0, 0, 0));
                        matSudoku1[this.red][this.kolona].getJtf().setText((String) null);
                        if (kandidatiCheckBox1.isSelected()
                                && !matSudoku1[this.red][this.kolona].isPronadjen()) {
                            for (int k = 0; k < matSudoku1[this.red][this.kolona].getKandidati().size(); k++) {
                                matSudoku1[this.red][this.kolona].getJtf().append(" " + matSudoku1[this.red][this.kolona].getKandidati().get(k));
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
