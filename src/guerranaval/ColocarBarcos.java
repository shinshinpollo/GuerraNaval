
package guerranaval;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ColocarBarcos extends javax.swing.JDialog  {
    int pequeno = 0, mediano = 0, grande = 0;
    
    boolean BH4 = false;
    boolean BH3 = false;
    boolean BH2 = false;
    boolean BV4 = false;
    boolean BV3 = false;
    boolean BV2 = false;
            
    JLabel JL1_1 = new JLabel();
    JLabel JL2_1 = new JLabel();
    JLabel JL3_1 = new JLabel();
    JLabel JL4_1 = new JLabel();
    JLabel JL5_1 = new JLabel();
    JLabel JL6_1 = new JLabel();
    JLabel JL7_1 = new JLabel();
    JLabel JL8_1 = new JLabel();
    JLabel JL9_1 = new JLabel();
    JLabel JL10_1 = new JLabel();
    
    JLabel JLA_1 = new JLabel();
    JLabel JLB_1 = new JLabel();
    JLabel JLC_1 = new JLabel();
    JLabel JLD_1 = new JLabel();
    JLabel JLE_1 = new JLabel();
    JLabel JLF_1 = new JLabel();
    JLabel JLG_1 = new JLabel();
    JLabel JLH_1 = new JLabel();
    JLabel JLI_1 = new JLabel();
    JLabel JLJ_1 = new JLabel();
    
    JButton JBA1_1 = new JButton();
    JButton JBA2_1 = new JButton();
    JButton JBA3_1 = new JButton();
    JButton JBA4_1 = new JButton();
    JButton JBA5_1 = new JButton();
    JButton JBA6_1 = new JButton();
    JButton JBA7_1 = new JButton();
    JButton JBA8_1 = new JButton();
    JButton JBA9_1 = new JButton();
    JButton JBA10_1 = new JButton();
    
    JButton JBB1_1 = new JButton();
    JButton JBB2_1 = new JButton();
    JButton JBB3_1 = new JButton();
    JButton JBB4_1 = new JButton();
    JButton JBB5_1 = new JButton();
    JButton JBB6_1 = new JButton();
    JButton JBB7_1 = new JButton();
    JButton JBB8_1 = new JButton();
    JButton JBB9_1 = new JButton();
    JButton JBB10_1 = new JButton();
    
    JButton JBC1_1 = new JButton();
    JButton JBC2_1 = new JButton();
    JButton JBC3_1 = new JButton();
    JButton JBC4_1 = new JButton();
    JButton JBC5_1 = new JButton();
    JButton JBC6_1 = new JButton();
    JButton JBC7_1 = new JButton();
    JButton JBC8_1 = new JButton();
    JButton JBC9_1 = new JButton();
    JButton JBC10_1 = new JButton();
    
    JButton JBD1_1 = new JButton();
    JButton JBD2_1 = new JButton();
    JButton JBD3_1 = new JButton();
    JButton JBD4_1 = new JButton();
    JButton JBD5_1 = new JButton();
    JButton JBD6_1 = new JButton();
    JButton JBD7_1 = new JButton();
    JButton JBD8_1 = new JButton();
    JButton JBD9_1 = new JButton();
    JButton JBD10_1 = new JButton();
    
    JButton JBE1_1 = new JButton();
    JButton JBE2_1 = new JButton();
    JButton JBE3_1 = new JButton();
    JButton JBE4_1 = new JButton();
    JButton JBE5_1 = new JButton();
    JButton JBE6_1 = new JButton();
    JButton JBE7_1 = new JButton();
    JButton JBE8_1 = new JButton();
    JButton JBE9_1 = new JButton();
    JButton JBE10_1 = new JButton();
    
    JButton JBF1_1 = new JButton();
    JButton JBF2_1 = new JButton();
    JButton JBF3_1 = new JButton();
    JButton JBF4_1 = new JButton();
    JButton JBF5_1 = new JButton();
    JButton JBF6_1 = new JButton();
    JButton JBF7_1 = new JButton();
    JButton JBF8_1 = new JButton();
    JButton JBF9_1 = new JButton();
    JButton JBF10_1 = new JButton();
    
    JButton JBG1_1 = new JButton();
    JButton JBG2_1 = new JButton();
    JButton JBG3_1 = new JButton();
    JButton JBG4_1 = new JButton();
    JButton JBG5_1 = new JButton();
    JButton JBG6_1 = new JButton();
    JButton JBG7_1 = new JButton();
    JButton JBG8_1 = new JButton();
    JButton JBG9_1 = new JButton();
    JButton JBG10_1 = new JButton();
    
    JButton JBH1_1 = new JButton();
    JButton JBH2_1 = new JButton();
    JButton JBH3_1 = new JButton();
    JButton JBH4_1 = new JButton();
    JButton JBH5_1 = new JButton();
    JButton JBH6_1 = new JButton();
    JButton JBH7_1 = new JButton();
    JButton JBH8_1 = new JButton();
    JButton JBH9_1 = new JButton();
    JButton JBH10_1 = new JButton();
    
    JButton JBI1_1 = new JButton();
    JButton JBI2_1 = new JButton();
    JButton JBI3_1 = new JButton();
    JButton JBI4_1 = new JButton();
    JButton JBI5_1 = new JButton();
    JButton JBI6_1 = new JButton();
    JButton JBI7_1 = new JButton();
    JButton JBI8_1 = new JButton();
    JButton JBI9_1 = new JButton();
    JButton JBI10_1 = new JButton();
    
    JButton JBJ1_1 = new JButton();
    JButton JBJ2_1 = new JButton();
    JButton JBJ3_1 = new JButton();
    JButton JBJ4_1 = new JButton();
    JButton JBJ5_1 = new JButton();
    JButton JBJ6_1 = new JButton();
    JButton JBJ7_1 = new JButton();
    JButton JBJ8_1 = new JButton();
    JButton JBJ9_1 = new JButton();
    JButton JBJ10_1 = new JButton();
    
    JButton JBBarcoV4 = new JButton();
    JButton JBBarcoV3 = new JButton();
    JButton JBBarcoV2 = new JButton();
    JButton JBBarcoH4 = new JButton();
    JButton JBBarcoH3 = new JButton();
    JButton JBBarcoH2 = new JButton();
    
    public ColocarBarcos(java.awt.Frame parent, boolean modal, int jugador){
        super(parent, modal);
        constructor(jugador);
        
    }

    private void constructor(int jugador) {
        this.setTitle("Seleccionar Barcos Jugador " + jugador);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        JL1_1.setText("1");
        JL2_1.setText("2");
        JL3_1.setText("3");
        JL4_1.setText("4");
        JL5_1.setText("5");
        JL6_1.setText("6");
        JL7_1.setText("7");
        JL8_1.setText("8");
        JL9_1.setText("9");
        JL10_1.setText("10");
        
        JLA_1.setText("A");
        JLB_1.setText("B");
        JLC_1.setText("C");
        JLD_1.setText("D");
        JLE_1.setText("E");
        JLF_1.setText("F");
        JLG_1.setText("G");
        JLH_1.setText("H");
        JLI_1.setText("I");
        JLJ_1.setText("J");
        
        
        
        JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        //vertical
        JBBarcoV4.setText("");
        JBBarcoV4.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/barco4completo.png"))).getImage().getScaledInstance(30, 110, Image.SCALE_DEFAULT)));
        JBBarcoV3.setText("");
        JBBarcoV3.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoV3.png"))).getImage().getScaledInstance(30, 90, Image.SCALE_DEFAULT)));
        JBBarcoV2.setText("");
        JBBarcoV2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoV2.png"))).getImage().getScaledInstance(30, 60, Image.SCALE_DEFAULT)));
        //horizontal
        JBBarcoH4.setText("");
        JBBarcoH4.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoH4.png"))).getImage().getScaledInstance(110, 30, Image.SCALE_DEFAULT)));
        JBBarcoH3.setText("");
        JBBarcoH3.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoH3.png"))).getImage().getScaledInstance(90, 30, Image.SCALE_DEFAULT)));
        JBBarcoH2.setText("");
        JBBarcoH2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoH2.png"))).getImage().getScaledInstance(60, 30, Image.SCALE_DEFAULT)));
        
        
        
        JBA1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA1_1ActionPerformed(evt);
            }
        });
        
        JBA1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA1_1MouseExited(evt);
            }
        });
        
        JBA2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA2_1ActionPerformed(evt);
            }
        });
        
        JBA2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA2_1MouseExited(evt);
            }
        });
        
        JBA3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA3_1ActionPerformed(evt);
            }
        });
        
        JBA3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA3_1MouseExited(evt);
            }
        });
        
        JBA4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA4_1ActionPerformed(evt);
            }
        });
        
        JBA4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA4_1MouseExited(evt);
            }
        });
        
        JBA5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA5_1ActionPerformed(evt);
            }
        });
        
        JBA5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA5_1MouseExited(evt);
            }
        });
        
        JBA6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA6_1ActionPerformed(evt);
            }
        });
        
        JBA6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA6_1MouseExited(evt);
            }
        });
        
        JBA7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA7_1ActionPerformed(evt);
            }
        });
        
        JBA7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA7_1MouseExited(evt);
            }
        });
        
        JBA8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA8_1ActionPerformed(evt);
            }
        });
        
        JBA8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA8_1MouseExited(evt);
            }
        });
        
        JBA9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA9_1ActionPerformed(evt);
            }
        });
        
        JBA9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA9_1MouseExited(evt);
            }
        });
        
        JBA10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA10_1ActionPerformed(evt);
            }
        });
        
        JBA10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBA10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBA10_1MouseExited(evt);
            }
        });
        
        JBB1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB1_1ActionPerformed(evt);
            }
        });
        
        JBB1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB1_1MouseExited(evt);
            }
        });
        
        JBB2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB2_1ActionPerformed(evt);
            }
        });
        
        JBB2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB2_1MouseExited(evt);
            }
        });
        
        JBB3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB3_1ActionPerformed(evt);
            }
        });
        
        JBB3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB3_1MouseExited(evt);
            }
        });
        
        JBB4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB4_1ActionPerformed(evt);
            }
        });
        
        JBB4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB4_1MouseExited(evt);
            }
        });
        
        JBB5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB5_1ActionPerformed(evt);
            }
        });
        
        JBB5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB5_1MouseExited(evt);
            }
        });
        
        JBB6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB6_1ActionPerformed(evt);
            }
        });
        
        JBB6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB6_1MouseExited(evt);
            }
        });
        
        JBB7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB7_1ActionPerformed(evt);
            }
        });
        
        JBB7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB7_1MouseExited(evt);
            }
        });
        
        JBB8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB8_1ActionPerformed(evt);
            }
        });
        
        JBB8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB8_1MouseExited(evt);
            }
        });
        
        JBB9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB9_1ActionPerformed(evt);
            }
        });
        
        JBB9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB9_1MouseExited(evt);
            }
        });
        
        JBB10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB10_1ActionPerformed(evt);
            }
        });
        
        JBB10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBB10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBB10_1MouseExited(evt);
            }
        });
        
        JBC1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC1_1ActionPerformed(evt);
            }
        });
        
        JBC1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC1_1MouseExited(evt);
            }
        });
        
        JBC2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC2_1ActionPerformed(evt);
            }
        });
        
        JBC2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC2_1MouseExited(evt);
            }
        });
        
        JBC3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC3_1ActionPerformed(evt);
            }
        });
        
        JBC3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC3_1MouseExited(evt);
            }
        });
        
        JBC4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC4_1ActionPerformed(evt);
            }
        });
        
        JBC4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC4_1MouseExited(evt);
            }
        });
        
        JBC5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC5_1ActionPerformed(evt);
            }
        });
        
        JBC5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC5_1MouseExited(evt);
            }
        });
        
        JBC6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC6_1ActionPerformed(evt);
            }
        });
        
        JBC6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC6_1MouseExited(evt);
            }
        });
        
        JBC7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC7_1ActionPerformed(evt);
            }
        });
        
        JBC7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC7_1MouseExited(evt);
            }
        });
        
        JBC8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC8_1ActionPerformed(evt);
            }
        });
        
        JBC8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC8_1MouseExited(evt);
            }
        });
        
        JBC9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC9_1ActionPerformed(evt);
            }
        });
        
        JBC9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC9_1MouseExited(evt);
            }
        });
        
        JBC10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC10_1ActionPerformed(evt);
            }
        });
        
        JBC10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBC10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBC10_1MouseExited(evt);
            }
        });
        
        JBD1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD1_1ActionPerformed(evt);
            }
        });
        
        JBD1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD1_1MouseExited(evt);
            }
        });
        
        JBD2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD2_1ActionPerformed(evt);
            }
        });
        
        JBD2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD2_1MouseExited(evt);
            }
        });
        
        JBD3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD3_1ActionPerformed(evt);
            }
        });
        
        JBD3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD3_1MouseExited(evt);
            }
        });
        
        JBD4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD4_1ActionPerformed(evt);
            }
        });
        
        JBD4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD4_1MouseExited(evt);
            }
        });
        
        JBD5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD5_1ActionPerformed(evt);
            }
        });
        
        JBD5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD5_1MouseExited(evt);
            }
        });
        
        JBD6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD6_1ActionPerformed(evt);
            }
        });
        
        JBD6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD6_1MouseExited(evt);
            }
        });
        
        JBD7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD7_1ActionPerformed(evt);
            }
        });
        
        JBD7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD7_1MouseExited(evt);
            }
        });
        
        JBD8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD8_1ActionPerformed(evt);
            }
        });
        
        JBD8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD8_1MouseExited(evt);
            }
        });
        
        JBD9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD9_1ActionPerformed(evt);
            }
        });
        
        JBD9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD9_1MouseExited(evt);
            }
        });
        
        JBD10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD10_1ActionPerformed(evt);
            }
        });
        
        JBD10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBD10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBD10_1MouseExited(evt);
            }
        });
        
        JBE1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE1_1ActionPerformed(evt);
            }
        });
        
        JBE1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE1_1MouseExited(evt);
            }
        });
        
        JBE2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE2_1ActionPerformed(evt);
            }
        });
        
        JBE2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE2_1MouseExited(evt);
            }
        });
        
        JBE3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE3_1ActionPerformed(evt);
            }
        });
        
        JBE3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE3_1MouseExited(evt);
            }
        });
        
        JBE4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE4_1ActionPerformed(evt);
            }
        });
        
        JBE4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE4_1MouseExited(evt);
            }
        });
        
        JBE5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE5_1ActionPerformed(evt);
            }
        });
        
        JBE5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE5_1MouseExited(evt);
            }
        });
        
        JBE6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE6_1ActionPerformed(evt);
            }
        });
        
        JBE6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE6_1MouseExited(evt);
            }
        });
        
        JBE7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE7_1ActionPerformed(evt);
            }
        });
        
        JBE7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE7_1MouseExited(evt);
            }
        });
        
        JBE8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE8_1ActionPerformed(evt);
            }
        });
        
        JBE8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE8_1MouseExited(evt);
            }
        });
        
        JBE9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE9_1ActionPerformed(evt);
            }
        });
        
        JBE9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE9_1MouseExited(evt);
            }
        });
        
        JBE10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE10_1ActionPerformed(evt);
            }
        });
        
        JBE10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBE10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBE10_1MouseExited(evt);
            }
        });
        
        JBF1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF1_1ActionPerformed(evt);
            }
        });
        
        JBF1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF1_1MouseExited(evt);
            }
        });
        
        JBF2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF2_1ActionPerformed(evt);
            }
        });
        
        JBF2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF2_1MouseExited(evt);
            }
        });
        
        JBF3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF3_1ActionPerformed(evt);
            }
        });
        
        JBF3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF3_1MouseExited(evt);
            }
        });
        
        JBF4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF4_1ActionPerformed(evt);
            }
        });
        
        JBF4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF4_1MouseExited(evt);
            }
        });
        
        JBF5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF5_1ActionPerformed(evt);
            }
        });
        
        JBF5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF5_1MouseExited(evt);
            }
        });
        
        JBF6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF6_1ActionPerformed(evt);
            }
        });
        
        JBF6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF6_1MouseExited(evt);
            }
        });
        
        JBF7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF7_1ActionPerformed(evt);
            }
        });
        
        JBF7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF7_1MouseExited(evt);
            }
        });
        
        JBF8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF8_1ActionPerformed(evt);
            }
        });
        
        JBF8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF8_1MouseExited(evt);
            }
        });
        
        JBF9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF9_1ActionPerformed(evt);
            }
        });
        
        JBF9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF9_1MouseExited(evt);
            }
        });
        
        JBF10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF10_1ActionPerformed(evt);
            }
        });
        
        JBF10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBF10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBF10_1MouseExited(evt);
            }
        });
        
        JBG1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG1_1ActionPerformed(evt);
            }
        });
        
        JBG1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG1_1MouseExited(evt);
            }
        });
        
        JBG2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG2_1ActionPerformed(evt);
            }
        });
        
        JBG2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG2_1MouseExited(evt);
            }
        });
        
        JBG3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG3_1ActionPerformed(evt);
            }
        });
        
        JBG3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG3_1MouseExited(evt);
            }
        });
        
        JBG4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG4_1ActionPerformed(evt);
            }
        });
        
        JBG4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG4_1MouseExited(evt);
            }
        });
        
        JBG5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG5_1ActionPerformed(evt);
            }
        });
        
        JBG5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG5_1MouseExited(evt);
            }
        });
        
        JBG6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG6_1ActionPerformed(evt);
            }
        });
        
        JBG6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG6_1MouseExited(evt);
            }
        });
        
        JBG7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG7_1ActionPerformed(evt);
            }
        });
        
        JBG7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG7_1MouseExited(evt);
            }
        });
        
        JBG8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG8_1ActionPerformed(evt);
            }
        });
        
        JBG8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG8_1MouseExited(evt);
            }
        });
        
        JBG9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG9_1ActionPerformed(evt);
            }
        });
        
        JBG9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG9_1MouseExited(evt);
            }
        });
        
        JBG10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG10_1ActionPerformed(evt);
            }
        });
        
        JBG10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBG10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBG10_1MouseExited(evt);
            }
        });
        
        JBH1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH1_1ActionPerformed(evt);
            }
        });
        
        JBH1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH1_1MouseExited(evt);
            }
        });
        
        JBH2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH2_1ActionPerformed(evt);
            }
        });
        
        JBH2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH2_1MouseExited(evt);
            }
        });
        
        JBH3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH3_1ActionPerformed(evt);
            }
        });
        
        JBH3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH3_1MouseExited(evt);
            }
        });
        
        JBH4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH4_1ActionPerformed(evt);
            }
        });
        
        JBH4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH4_1MouseExited(evt);
            }
        });
        
        JBH5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH5_1ActionPerformed(evt);
            }
        });
        
        JBH5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH5_1MouseExited(evt);
            }
        });
        
        JBH6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH6_1ActionPerformed(evt);
            }
        });
        
        JBH6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH6_1MouseExited(evt);
            }
        });
        
        JBH7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH7_1ActionPerformed(evt);
            }
        });
        
        JBH7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH7_1MouseExited(evt);
            }
        });
        
        JBH8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH8_1ActionPerformed(evt);
            }
        });
        
        JBH8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH8_1MouseExited(evt);
            }
        });
        
        JBH9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH9_1ActionPerformed(evt);
            }
        });
        
        JBH9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH9_1MouseExited(evt);
            }
        });
        
        JBH10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH10_1ActionPerformed(evt);
            }
        });
        
        JBH10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBH10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBH10_1MouseExited(evt);
            }
        });
        
        JBI1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI1_1ActionPerformed(evt);
            }
        });
        
        JBI1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI1_1MouseExited(evt);
            }
        });
        
        JBI2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI2_1ActionPerformed(evt);
            }
        });
        
        JBI2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI2_1MouseExited(evt);
            }
        });
        
        JBI3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI3_1ActionPerformed(evt);
            }
        });
        
        JBI3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI3_1MouseExited(evt);
            }
        });
        
        JBI4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI4_1ActionPerformed(evt);
            }
        });
        
        JBI4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI4_1MouseExited(evt);
            }
        });
        
        JBI5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI5_1ActionPerformed(evt);
            }
        });
        
        JBI5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI5_1MouseExited(evt);
            }
        });
        
        JBI6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI6_1ActionPerformed(evt);
            }
        });
        
        JBI6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI6_1MouseExited(evt);
            }
        });
        
        JBI7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI7_1ActionPerformed(evt);
            }
        });
        
        JBI7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI7_1MouseExited(evt);
            }
        });
        
        JBI8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI8_1ActionPerformed(evt);
            }
        });
        
        JBI8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI8_1MouseExited(evt);
            }
        });
        
        JBI9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI9_1ActionPerformed(evt);
            }
        });
        
        JBI9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI9_1MouseExited(evt);
            }
        });
        
        JBI10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI10_1ActionPerformed(evt);
            }
        });
        
        JBI10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBI10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBI10_1MouseExited(evt);
            }
        });
        
        JBJ1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ1_1ActionPerformed(evt);
            }
        });
        
        JBJ1_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ1_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ1_1MouseExited(evt);
            }
        });
        
        JBJ2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ2_1ActionPerformed(evt);
            }
        });
        
        JBJ2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ2_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ2_1MouseExited(evt);
            }
        });
        
        JBJ3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ3_1ActionPerformed(evt);
            }
        });
        
        JBJ3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ3_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ3_1MouseExited(evt);
            }
        });
        
        JBJ4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ4_1ActionPerformed(evt);
            }
        });
        
        JBJ4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ4_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ4_1MouseExited(evt);
            }
        });
        
        JBJ5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ5_1ActionPerformed(evt);
            }
        });
        
        JBJ5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ5_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ5_1MouseExited(evt);
            }
        });
        
        JBJ6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ6_1ActionPerformed(evt);
            }
        });
        
        JBJ6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ6_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ6_1MouseExited(evt);
            }
        });
        
        JBJ7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ7_1ActionPerformed(evt);
            }
        });
        
        JBJ7_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ7_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ7_1MouseExited(evt);
            }
        });
        
        JBJ8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ8_1ActionPerformed(evt);
            }
        });
        
        JBJ8_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ8_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ8_1MouseExited(evt);
            }
        });
        
        JBJ9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ9_1ActionPerformed(evt);
            }
        });
        
        JBJ9_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ9_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ9_1MouseExited(evt);
            }
        });
        
        JBJ10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ10_1ActionPerformed(evt);
            }
        });
        
        JBJ10_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBJ10_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBJ10_1MouseExited(evt);
            }
        });
        
        JBBarcoH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBarcoH4ActionPerformed(evt);
            }
        });
        
        JBBarcoH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBarcoH3ActionPerformed(evt);
            }
        });
        
        JBBarcoH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBarcoH2ActionPerformed(evt);
            }
        });
        
        JBBarcoV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBarcoV4ActionPerformed(evt);
            }
        });
        
        JBBarcoV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBarcoV3ActionPerformed(evt);
            }
        });
        
        JBBarcoV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBarcoV2ActionPerformed(evt);
            }
        });
        
        this.add(JL1_1);
        this.add(JL2_1);
        this.add(JL3_1);
        this.add(JL4_1);
        this.add(JL5_1);
        this.add(JL6_1);
        this.add(JL7_1);
        this.add(JL8_1);
        this.add(JL9_1);
        this.add(JL10_1);
        
        this.add(JLA_1);
        this.add(JLB_1);
        this.add(JLC_1);
        this.add(JLD_1);
        this.add(JLE_1);
        this.add(JLF_1);
        this.add(JLG_1);
        this.add(JLH_1);
        this.add(JLI_1);
        this.add(JLJ_1);
        
        this.add(JBA1_1);
        this.add(JBA2_1);
        this.add(JBA3_1);
        this.add(JBA4_1);
        this.add(JBA5_1);
        this.add(JBA6_1);
        this.add(JBA7_1);
        this.add(JBA8_1);
        this.add(JBA9_1);
        this.add(JBA10_1);
        
        this.add(JBB1_1);
        this.add(JBB2_1);
        this.add(JBB3_1);
        this.add(JBB4_1);
        this.add(JBB5_1);
        this.add(JBB6_1);
        this.add(JBB7_1);
        this.add(JBB8_1);
        this.add(JBB9_1);
        this.add(JBB10_1);
        
        this.add(JBC1_1);
        this.add(JBC2_1);
        this.add(JBC3_1);
        this.add(JBC4_1);
        this.add(JBC5_1);
        this.add(JBC6_1);
        this.add(JBC7_1);
        this.add(JBC8_1);
        this.add(JBC9_1);
        this.add(JBC10_1);
        
        this.add(JBD1_1);
        this.add(JBD2_1);
        this.add(JBD3_1);
        this.add(JBD4_1);
        this.add(JBD5_1);
        this.add(JBD6_1);
        this.add(JBD7_1);
        this.add(JBD8_1);
        this.add(JBD9_1);
        this.add(JBD10_1);
        
        this.add(JBE1_1);
        this.add(JBE2_1);
        this.add(JBE3_1);
        this.add(JBE4_1);
        this.add(JBE5_1);
        this.add(JBE6_1);
        this.add(JBE7_1);
        this.add(JBE8_1);
        this.add(JBE9_1);
        this.add(JBE10_1);
        
        this.add(JBF1_1);
        this.add(JBF2_1);
        this.add(JBF3_1);
        this.add(JBF4_1);
        this.add(JBF5_1);
        this.add(JBF6_1);
        this.add(JBF7_1);
        this.add(JBF8_1);
        this.add(JBF9_1);
        this.add(JBF10_1);
        
        this.add(JBG1_1);
        this.add(JBG2_1);
        this.add(JBG3_1);
        this.add(JBG4_1);
        this.add(JBG5_1);
        this.add(JBG6_1);
        this.add(JBG7_1);
        this.add(JBG8_1);
        this.add(JBG9_1);
        this.add(JBG10_1);
        
        this.add(JBH1_1);
        this.add(JBH2_1);
        this.add(JBH3_1);
        this.add(JBH4_1);
        this.add(JBH5_1);
        this.add(JBH6_1);
        this.add(JBH7_1);
        this.add(JBH8_1);
        this.add(JBH9_1);
        this.add(JBH10_1);
        
        this.add(JBI1_1);
        this.add(JBI2_1);
        this.add(JBI3_1);
        this.add(JBI4_1);
        this.add(JBI5_1);
        this.add(JBI6_1);
        this.add(JBI7_1);
        this.add(JBI8_1);
        this.add(JBI9_1);
        this.add(JBI10_1);
        
        this.add(JBJ1_1);
        this.add(JBJ2_1);
        this.add(JBJ3_1);
        this.add(JBJ4_1);
        this.add(JBJ5_1);
        this.add(JBJ6_1);
        this.add(JBJ7_1);
        this.add(JBJ8_1);
        this.add(JBJ9_1);
        this.add(JBJ10_1);
        this.add(JBBarcoV4);
        this.add(JBBarcoV3);
        this.add(JBBarcoV2);
        this.add(JBBarcoH4);
        this.add(JBBarcoH3);
        this.add(JBBarcoH2);
        
        JL1_1.reshape(25, 15, 25, 25);
        JL2_1.reshape(50, 15, 25, 25);
        JL3_1.reshape(75, 15, 25, 25);
        JL4_1.reshape(100, 15, 25, 25);
        JL5_1.reshape(125, 15, 25, 25);
        JL6_1.reshape(150, 15, 25, 25);
        JL7_1.reshape(175, 15, 25, 25);
        JL8_1.reshape(200, 15, 25, 25);
        JL9_1.reshape(225, 15, 25, 25);
        JL10_1.reshape(250, 15, 25, 25);
        
        JLA_1.reshape(10, 40, 25, 25);
        JLB_1.reshape(10, 65, 25, 25);
        JLC_1.reshape(10, 90, 25, 25);
        JLD_1.reshape(10, 115, 25, 25);
        JLE_1.reshape(10, 140, 25, 25);
        JLF_1.reshape(10, 165, 25, 25);
        JLG_1.reshape(10, 190, 25, 25);
        JLH_1.reshape(10, 215, 25, 25);
        JLI_1.reshape(10, 240, 25, 25);
        JLJ_1.reshape(10, 265, 25, 25);
        
        JBA1_1.reshape(25, 40, 25, 25);
        JBA2_1.reshape(50, 40, 25, 25);
        JBA3_1.reshape(75, 40, 25, 25);
        JBA4_1.reshape(100, 40, 25, 25);
        JBA5_1.reshape(125, 40, 25, 25);
        JBA6_1.reshape(150, 40, 25, 25);
        JBA7_1.reshape(175, 40, 25, 25);
        JBA8_1.reshape(200, 40, 25, 25);
        JBA9_1.reshape(225, 40, 25, 25);
        JBA10_1.reshape(250, 40, 25, 25);
        
        JBB1_1.reshape(25, 65, 25, 25);
        JBB2_1.reshape(50, 65, 25, 25);
        JBB3_1.reshape(75, 65, 25, 25);
        JBB4_1.reshape(100, 65, 25, 25);
        JBB5_1.reshape(125, 65, 25, 25);
        JBB6_1.reshape(150, 65, 25, 25);
        JBB7_1.reshape(175, 65, 25, 25);
        JBB8_1.reshape(200, 65, 25, 25);
        JBB9_1.reshape(225, 65, 25, 25);
        JBB10_1.reshape(250, 65, 25, 25);
        
        JBC1_1.reshape(25, 90, 25, 25);
        JBC2_1.reshape(50, 90, 25, 25);
        JBC3_1.reshape(75, 90, 25, 25);
        JBC4_1.reshape(100, 90, 25, 25);
        JBC5_1.reshape(125, 90, 25, 25);
        JBC6_1.reshape(150, 90, 25, 25);
        JBC7_1.reshape(175, 90, 25, 25);
        JBC8_1.reshape(200, 90, 25, 25);
        JBC9_1.reshape(225, 90, 25, 25);
        JBC10_1.reshape(250, 90, 25, 25);
        
        JBD1_1.reshape(25, 115, 25, 25);
        JBD2_1.reshape(50, 115, 25, 25);
        JBD3_1.reshape(75, 115, 25, 25);
        JBD4_1.reshape(100, 115, 25, 25);
        JBD5_1.reshape(125, 115, 25, 25);
        JBD6_1.reshape(150, 115, 25, 25);
        JBD7_1.reshape(175, 115, 25, 25);
        JBD8_1.reshape(200, 115, 25, 25);
        JBD9_1.reshape(225, 115, 25, 25);
        JBD10_1.reshape(250, 115, 25, 25);
        
        JBE1_1.reshape(25, 140, 25, 25);
        JBE2_1.reshape(50, 140, 25, 25);
        JBE3_1.reshape(75, 140, 25, 25);
        JBE4_1.reshape(100, 140, 25, 25);
        JBE5_1.reshape(125, 140, 25, 25);
        JBE6_1.reshape(150, 140, 25, 25);
        JBE7_1.reshape(175, 140, 25, 25);
        JBE8_1.reshape(200, 140, 25, 25);
        JBE9_1.reshape(225, 140, 25, 25);
        JBE10_1.reshape(250, 140, 25, 25);
        
        JBF1_1.reshape(25, 165, 25, 25);
        JBF2_1.reshape(50, 165, 25, 25);
        JBF3_1.reshape(75, 165, 25, 25);
        JBF4_1.reshape(100, 165, 25, 25);
        JBF5_1.reshape(125, 165, 25, 25);
        JBF6_1.reshape(150, 165, 25, 25);
        JBF7_1.reshape(175, 165, 25, 25);
        JBF8_1.reshape(200, 165, 25, 25);
        JBF9_1.reshape(225, 165, 25, 25);
        JBF10_1.reshape(250, 165, 25, 25);
        
        JBG1_1.reshape(25, 190, 25, 25);
        JBG2_1.reshape(50, 190, 25, 25);
        JBG3_1.reshape(75, 190, 25, 25);
        JBG4_1.reshape(100, 190, 25, 25);
        JBG5_1.reshape(125, 190, 25, 25);
        JBG6_1.reshape(150, 190, 25, 25);
        JBG7_1.reshape(175, 190, 25, 25);
        JBG8_1.reshape(200, 190, 25, 25);
        JBG9_1.reshape(225, 190, 25, 25);
        JBG10_1.reshape(250, 190, 25, 25);
        
        JBH1_1.reshape(25, 215, 25, 25);
        JBH2_1.reshape(50, 215, 25, 25);
        JBH3_1.reshape(75, 215, 25, 25);
        JBH4_1.reshape(100, 215, 25, 25);
        JBH5_1.reshape(125, 215, 25, 25);
        JBH6_1.reshape(150, 215, 25, 25);
        JBH7_1.reshape(175, 215, 25, 25);
        JBH8_1.reshape(200, 215, 25, 25);
        JBH9_1.reshape(225, 215, 25, 25);
        JBH10_1.reshape(250, 215, 25, 25);
        
        JBI1_1.reshape(25, 240, 25, 25);
        JBI2_1.reshape(50, 240, 25, 25);
        JBI3_1.reshape(75, 240, 25, 25);
        JBI4_1.reshape(100, 240, 25, 25);
        JBI5_1.reshape(125, 240, 25, 25);
        JBI6_1.reshape(150, 240, 25, 25);
        JBI7_1.reshape(175, 240, 25, 25);
        JBI8_1.reshape(200, 240, 25, 25);
        JBI9_1.reshape(225, 240, 25, 25);
        JBI10_1.reshape(250, 240, 25, 25);
        
        JBJ1_1.reshape(25, 265, 25, 25);
        JBJ2_1.reshape(50, 265, 25, 25);
        JBJ3_1.reshape(75, 265, 25, 25);
        JBJ4_1.reshape(100, 265, 25, 25);
        JBJ5_1.reshape(125, 265, 25, 25);
        JBJ6_1.reshape(150, 265, 25, 25);
        JBJ7_1.reshape(175, 265, 25, 25);
        JBJ8_1.reshape(200, 265, 25, 25);
        JBJ9_1.reshape(225, 265, 25, 25);
        JBJ10_1.reshape(250, 265, 25, 25); 
        
        JBBarcoV4.reshape(300, 50, 30, 110);
        JBBarcoV3.reshape(360, 60, 30, 90);
        JBBarcoV2.reshape(415, 75, 30, 60);
        JBBarcoH4.reshape(315, 200, 110, 30);
        JBBarcoH3.reshape(326, 250, 90, 30);
        JBBarcoH2.reshape(344, 300, 60, 30);
        
        
        
    
    }
    
    private void JBA1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A1"));
    }
    
    private void JBA1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A2"));
    }
    
    private void JBA2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A3"));
    }
    
    private void JBA3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A4"));
    }
    
    private void JBA4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A5"));
    }
    
     private void JBA5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A6"));
    }
    
    private void JBA6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A7"));
    }
    
    private void JBA7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A8"));
    }
    
    private void JBA8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A9"));
    }
    
    private void JBA9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBA10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("A10"));
    }
    
    private void JBA10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBA10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBA7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBA8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBA9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBA10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B1"));
    }
    
    private void JBB1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B2"));
    }
    
    private void JBB2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B3"));
    }
    
    private void JBB3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B4"));
    }
    
    private void JBB4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B5"));
    }
    
    private void JBB5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B6"));
    }
    
    private void JBB6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B7"));
    }
    
    private void JBB7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B8"));
    }
    
    private void JBB8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B9"));
    }
    
    private void JBB9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBB10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("B10"));
    }
    
    private void JBB10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBB10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBB7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBB8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBB9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBB10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C1"));
    }
    
    private void JBC1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C2"));
    }
    
    private void JBC2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C3"));
    }
    
    private void JBC3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C4"));
    }
    
    private void JBC4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C5"));
    }
    
    private void JBC5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C6"));
    }
    
    private void JBC6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C7"));
    }
    
    private void JBC7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C8"));
    }
    
    private void JBC8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C9"));
    }
    
    private void JBC9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBC10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("C10"));
    }
    
    private void JBC10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBC10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBC7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBC8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBC9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBC10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D1"));
    }
    
    private void JBD1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D2"));
    }
    
    private void JBD2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D3"));
    }
    
    private void JBD3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D4"));
    }
    
    private void JBD4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D5"));
    }
    
    private void JBD5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D6"));
    }
    
    private void JBD6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D7"));
    }
    
    private void JBD7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D8"));
    }
    
    private void JBD8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D9"));
    }
    
    private void JBD9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBD10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("D10"));
    }
    
    private void JBD10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBD10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBD7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBD8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBD9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBD10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E1"));
    }
    
    
    private void JBE1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E2"));
    }
    
    private void JBE2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E3"));
    }
    
    private void JBE3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E4"));
    }
    
    private void JBE4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E5"));
    }
    
    private void JBE5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E6"));
    }
    
    private void JBE6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E7"));
    }
    
    private void JBE7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E8"));
    }
    
    private void JBE8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E9"));
    }
    
    private void JBE9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBE10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("E10"));
    }
    
    private void JBE10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBE10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBE7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBE8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBE9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBE10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F1"));
    }
    
    private void JBF1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F2"));
    }
    
    private void JBF2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F3"));
    }
    
    private void JBF3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F4"));
    }
    
    private void JBF4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F5"));
    }
    
    private void JBF5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F6"));
    }
    
    private void JBF6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F7"));
    }
    
    private void JBF7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F8"));
    }
    
    private void JBF8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F9"));
    }
    
    private void JBF9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBF10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("F10"));
    }
    
    private void JBF10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBF10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBF7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBF8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBF9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBF10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G1"));
    }
    
    private void JBG1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G2"));
    }
    
    private void JBG2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G3"));
    }
    
    private void JBG3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G4"));
    }
    
    private void JBG4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G5"));
    }
    
    private void JBG5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G6"));
    }
    
    private void JBG6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G7"));
    }
    
    private void JBG7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G8"));
    }
    
    private void JBG8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G9"));
    }
    
    private void JBG9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBG10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("G10"));
    }
    
    private void JBG10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBG10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H1"));
    }
    
    private void JBH1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
   
    private void JBH2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H2"));
    }
    
    private void JBH2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H3"));
    }
    
    private void JBH3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H4"));
    } 
    
    private void JBH4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H5"));
    }
    
    private void JBH5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H6"));
    }
    
    private void JBH6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H7"));
    }
    
    private void JBH7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H8"));
    }
    
    private void JBH8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H9"));
    }
    
    private void JBH9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBH10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("H10"));
    }
    
    private void JBH10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBH10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
     private void JBI1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I1"));
    }
     
     private void JBI1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I2"));
    }
    
    private void JBI2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I3"));
    }
    
    private void JBI3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I4"));
    }
    
    private void JBI4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I5"));
    }
    
    private void JBI5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I6"));
    }
    
    private void JBI6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I7"));
    }
    
    private void JBI7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I8"));
    }
    
    private void JBI8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I9"));
    }
    
    private void JBI9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBI10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("I10"));
    }
    
    private void JBI10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBI10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J1"));
    }
    
    private void JBJ1_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ1_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ1_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J2"));
    }
    
    private void JBJ2_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ2_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ2_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J3"));
    }
    
    private void JBJ3_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ3_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ3_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J4"));
    }
    
    private void JBJ4_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ4_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ4_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J5"));
    }
    
    private void JBJ5_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ5_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ5_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J6"));
    }
    
    private void JBJ6_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ6_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ6_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J7"));
    }
    
    private void JBJ7_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ7_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J8"));
    }
    
    private void JBJ8_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ8_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J9"));
    }
    
    private void JBJ9_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ9_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBJ10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        //JOptionPane.showMessageDialog(null, ("J10"));
    }
    
    private void JBJ10_1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoD_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_2.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_3.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_1.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BarcoA_4.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }  
    
    private void JBJ10_1MouseExited(java.awt.event.MouseEvent evt) {                                     
       if (BH4){
            JBJ7_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH3){
            JBJ8_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BH2){
            JBJ9_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV4){
            JBG10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV3){
            JBH10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
        else if (BV2){
            JBI10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
            JBJ10_1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        }
    }
    
    private void JBBarcoV4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (grande <= ClsGlobal.jugadorGrande){
             //JOptionPane.showMessageDialog(null, ("Vertical 4"));
            BV4 = true;
            BV3 = false;
            BV2 = false;
            BH4 = false;
            BH3 = false;
            BH2 = false;
        }
       
    }

    private void JBBarcoV3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (mediano <= ClsGlobal.jugadorMediano){
            //JOptionPane.showMessageDialog(null, ("Vertical 3"));
            BV4 = false;
            BV3 = true;
            BV2 = false;
            BH4 = false;
            BH3 = false;
            BH2 = false;
            
        }
        
    }
    
    private void JBBarcoV2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (pequeno <= ClsGlobal.jugadorPequeno){
            //JOptionPane.showMessageDialog(null, ("Vertical 2"));
            BV4 = false;
            BV3 = false;
            BV2 = true;
            BH4 = false;
            BH3 = false;
            BH2 = false;
        }
        
    }
    
    private void JBBarcoH4ActionPerformed(java.awt.event.ActionEvent evt) {
        if (grande <= ClsGlobal.jugadorGrande){
            //JOptionPane.showMessageDialog(null, ("Horizontal 4"));
            BV4 = false;
            BV3 = false;
            BV2 = false;
            BH4 = true;
            BH3 = false;
            BH2 = false;
        }
        
    }
    
    private void JBBarcoH3ActionPerformed(java.awt.event.ActionEvent evt) {
        if (mediano <= ClsGlobal.jugadorMediano){
            //JOptionPane.showMessageDialog(null, ("Horizontal 3"));
            BV4 = false;
            BV3 = false;
            BV2 = false;
            BH4 = false;
            BH3 = true;
            BH2 = false;
        }
        
    }
    
    private void JBBarcoH2ActionPerformed(java.awt.event.ActionEvent evt) {
        if (pequeno <= ClsGlobal.jugadorPequeno){
            //JOptionPane.showMessageDialog(null, ("Horizontal 2"));
            BV4 = false;
            BV3 = false;
            BV2 = false;
            BH4 = false;
            BH3 = false;
            BH2 = true;
        }
        
    }
    /*@Override
    public void mouseClicked(MouseEvent e) {
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1){
           int mx = e.getX();
           int my = e.getY();
           System.out.print("x: " + mx + " y: " + my);
           }
        if (e.getButton() == MouseEvent.BUTTON3){
            System.out.println();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mouseDragg(MouseEvent e){
        
    }
    public void mouseMove(MouseEvent e){
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int xm = e.getX();
        int ym = e.getY();
         
         repaint();
    }*/
    

}
