
package guerranaval;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Principal extends JFrame{
    //Se crear los labels
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
    
    //Label para arma de jugador 1
    JLabel JLAmetralladora1 = new JLabel();
    JLabel JLMisil1 = new JLabel();
    JLabel JLBombaNuclear1 = new JLabel();
    
    //Label para arma de jugador 2
    JLabel JLAmetralladora2 = new JLabel();
    JLabel JLMisil2 = new JLabel();
    JLabel JLBombaNuclear2 = new JLabel();
    
    //Se crean los botones de seleccion
    JButton JBSeleccionarBarco1 = new JButton();
    JButton JBSeleccionarBarco2 = new JButton();
    
    //Armas jugador 1
    JButton JBAmetralladora1 = new JButton();
    JButton JBMisil1 = new JButton();
    JButton JBBombaNuclear1 = new JButton();
    
    //Armas jugador 2
    JButton JBAmetralladora2 = new JButton();
    JButton JBMisil2 = new JButton();
    JButton JBBombaNuclear2 = new JButton();

    //Se crean los botones de la matiz
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
    
    JLabel JL1_2 = new JLabel();
    JLabel JL2_2 = new JLabel();
    JLabel JL3_2 = new JLabel();
    JLabel JL4_2 = new JLabel();
    JLabel JL5_2 = new JLabel();
    JLabel JL6_2 = new JLabel();
    JLabel JL7_2 = new JLabel();
    JLabel JL8_2 = new JLabel();
    JLabel JL9_2 = new JLabel();
    JLabel JL10_2 = new JLabel();
    
    JLabel JLA_2 = new JLabel();
    JLabel JLB_2 = new JLabel();
    JLabel JLC_2 = new JLabel();
    JLabel JLD_2 = new JLabel();
    JLabel JLE_2 = new JLabel();
    JLabel JLF_2 = new JLabel();
    JLabel JLG_2 = new JLabel();
    JLabel JLH_2 = new JLabel();
    JLabel JLI_2 = new JLabel();
    JLabel JLJ_2 = new JLabel();
    
    JButton JBA1_2 = new JButton();
    JButton JBA2_2 = new JButton();
    JButton JBA3_2 = new JButton();
    JButton JBA4_2 = new JButton();
    JButton JBA5_2 = new JButton();
    JButton JBA6_2 = new JButton();
    JButton JBA7_2 = new JButton();
    JButton JBA8_2 = new JButton();
    JButton JBA9_2 = new JButton();
    JButton JBA10_2 = new JButton();
    
    JButton JBB1_2 = new JButton();
    JButton JBB2_2 = new JButton();
    JButton JBB3_2 = new JButton();
    JButton JBB4_2 = new JButton();
    JButton JBB5_2 = new JButton();
    JButton JBB6_2 = new JButton();
    JButton JBB7_2 = new JButton();
    JButton JBB8_2 = new JButton();
    JButton JBB9_2 = new JButton();
    JButton JBB10_2 = new JButton();
    
    JButton JBC1_2 = new JButton();
    JButton JBC2_2 = new JButton();
    JButton JBC3_2 = new JButton();
    JButton JBC4_2 = new JButton();
    JButton JBC5_2 = new JButton();
    JButton JBC6_2 = new JButton();
    JButton JBC7_2 = new JButton();
    JButton JBC8_2 = new JButton();
    JButton JBC9_2 = new JButton();
    JButton JBC10_2 = new JButton();
    
    JButton JBD1_2 = new JButton();
    JButton JBD2_2 = new JButton();
    JButton JBD3_2 = new JButton();
    JButton JBD4_2 = new JButton();
    JButton JBD5_2 = new JButton();
    JButton JBD6_2 = new JButton();
    JButton JBD7_2 = new JButton();
    JButton JBD8_2 = new JButton();
    JButton JBD9_2 = new JButton();
    JButton JBD10_2 = new JButton();
    
    JButton JBE1_2 = new JButton();
    JButton JBE2_2 = new JButton();
    JButton JBE3_2 = new JButton();
    JButton JBE4_2 = new JButton();
    JButton JBE5_2 = new JButton();
    JButton JBE6_2 = new JButton();
    JButton JBE7_2 = new JButton();
    JButton JBE8_2 = new JButton();
    JButton JBE9_2 = new JButton();
    JButton JBE10_2 = new JButton();
    
    JButton JBF1_2 = new JButton();
    JButton JBF2_2 = new JButton();
    JButton JBF3_2 = new JButton();
    JButton JBF4_2 = new JButton();
    JButton JBF5_2 = new JButton();
    JButton JBF6_2 = new JButton();
    JButton JBF7_2 = new JButton();
    JButton JBF8_2 = new JButton();
    JButton JBF9_2 = new JButton();
    JButton JBF10_2 = new JButton();
    
    JButton JBG1_2 = new JButton();
    JButton JBG2_2 = new JButton();
    JButton JBG3_2 = new JButton();
    JButton JBG4_2 = new JButton();
    JButton JBG5_2 = new JButton();
    JButton JBG6_2 = new JButton();
    JButton JBG7_2 = new JButton();
    JButton JBG8_2 = new JButton();
    JButton JBG9_2 = new JButton();
    JButton JBG10_2 = new JButton();
    
    JButton JBH1_2 = new JButton();
    JButton JBH2_2 = new JButton();
    JButton JBH3_2 = new JButton();
    JButton JBH4_2 = new JButton();
    JButton JBH5_2 = new JButton();
    JButton JBH6_2 = new JButton();
    JButton JBH7_2 = new JButton();
    JButton JBH8_2 = new JButton();
    JButton JBH9_2 = new JButton();
    JButton JBH10_2 = new JButton();
    
    JButton JBI1_2 = new JButton();
    JButton JBI2_2 = new JButton();
    JButton JBI3_2 = new JButton();
    JButton JBI4_2 = new JButton();
    JButton JBI5_2 = new JButton();
    JButton JBI6_2 = new JButton();
    JButton JBI7_2 = new JButton();
    JButton JBI8_2 = new JButton();
    JButton JBI9_2 = new JButton();
    JButton JBI10_2 = new JButton();
    
    JButton JBJ1_2 = new JButton();
    JButton JBJ2_2 = new JButton();
    JButton JBJ3_2 = new JButton();
    JButton JBJ4_2 = new JButton();
    JButton JBJ5_2 = new JButton();
    JButton JBJ6_2 = new JButton();
    JButton JBJ7_2 = new JButton();
    JButton JBJ8_2 = new JButton();
    JButton JBJ9_2 = new JButton();
    JButton JBJ10_2 = new JButton();
    
    
    
    
    public Principal(){
        //llamamos el constructor
        constructor(); 
    }

    private void constructor() {
        this.setTitle("Guerra Naval");
        this.setSize(800,400);
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
        
        JL1_2.setText("1");
        JL2_2.setText("2");
        JL3_2.setText("3");
        JL4_2.setText("4");
        JL5_2.setText("5");
        JL6_2.setText("6");
        JL7_2.setText("7");
        JL8_2.setText("8");
        JL9_2.setText("9");
        JL10_2.setText("10");
        
        JLA_2.setText("A");
        JLB_2.setText("B");
        JLC_2.setText("C");
        JLD_2.setText("D");
        JLE_2.setText("E");
        JLF_2.setText("F");
        JLG_2.setText("G");
        JLH_2.setText("H");
        JLI_2.setText("I");
        JLJ_2.setText("J");
        
        JLAmetralladora1.setText("");
        JLAmetralladora1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Ametralladora.png").getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));

        JLMisil1.setText("");
        JLMisil1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Misil.png"));
        
        JLBombaNuclear1.setText("");
        JLBombaNuclear1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\BombaNuclear.png"));
        
        JLAmetralladora2.setText("");
        JLAmetralladora2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Ametralladora.png"));
        
        JLMisil2.setText("");
        JLMisil2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Misil.png"));
        
        JLBombaNuclear2.setText("");
        JLBombaNuclear2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\BombaNuclear.png"));
        
        JBSeleccionarBarco1.setText("Seleccionar");
        JBSeleccionarBarco2.setText("Seleccionar");

        JBA1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBB1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBC1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBD1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBE1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBF1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBG1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBH1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBI1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBJ1_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ2_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ3_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ4_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ5_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ6_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ7_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ8_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ9_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ10_1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBA1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBA10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBB1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBB10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBC1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBC10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBD1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBD10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBE1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBE10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBF1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBF10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBG1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBG10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBH1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBH10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBI1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBI10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBJ1_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ2_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ3_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ4_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ5_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ6_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ7_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ8_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ9_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        JBJ10_2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Martin\\Documents\\Curso java\\Calculadora\\GuerraNaval\\dist\\Imagenes\\Blanco.png"));
        
        JBSeleccionarBarco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSeleccionarBarco1ActionPerformed(evt);
            }
        });
        
        JBSeleccionarBarco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSeleccionarBarco2ActionPerformed(evt);
            }
        });
        
        JBA1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA1_1ActionPerformed(evt);
            }
        });
        
        JBA2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA2_1ActionPerformed(evt);
            }
        });
        
        JBA3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA3_1ActionPerformed(evt);
            }
        });
        
        JBA4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA4_1ActionPerformed(evt);
            }
        });
        
        JBA5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA5_1ActionPerformed(evt);
            }
        });
        
        JBA6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA6_1ActionPerformed(evt);
            }
        });
        
        JBA7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA7_1ActionPerformed(evt);
            }
        });
        
        JBA8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA8_1ActionPerformed(evt);
            }
        });
        
        JBA9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA9_1ActionPerformed(evt);
            }
        });
        
        JBA10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBA10_1ActionPerformed(evt);
            }
        });
        
        JBB1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB1_1ActionPerformed(evt);
            }
        });
        
        JBB2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB2_1ActionPerformed(evt);
            }
        });
        
        JBB3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB3_1ActionPerformed(evt);
            }
        });
        
        JBB4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB4_1ActionPerformed(evt);
            }
        });
        
        JBB5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB5_1ActionPerformed(evt);
            }
        });
        
        JBB6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB6_1ActionPerformed(evt);
            }
        });
        
        JBB7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB7_1ActionPerformed(evt);
            }
        });
        
        JBB8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB8_1ActionPerformed(evt);
            }
        });
        
        JBB9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB9_1ActionPerformed(evt);
            }
        });
        
        JBB10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBB10_1ActionPerformed(evt);
            }
        });
        
        JBC1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC1_1ActionPerformed(evt);
            }
        });
        
        JBC2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC2_1ActionPerformed(evt);
            }
        });
        
        JBC3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC3_1ActionPerformed(evt);
            }
        });
        
        JBC4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC4_1ActionPerformed(evt);
            }
        });
        
        JBC5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC5_1ActionPerformed(evt);
            }
        });
        
        JBC6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC6_1ActionPerformed(evt);
            }
        });
        
        JBC7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC7_1ActionPerformed(evt);
            }
        });
        
        JBC8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC8_1ActionPerformed(evt);
            }
        });
        
        JBC9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC9_1ActionPerformed(evt);
            }
        });
        
        JBC10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBC10_1ActionPerformed(evt);
            }
        });
        
        JBD1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD1_1ActionPerformed(evt);
            }
        });
        
        JBD2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD2_1ActionPerformed(evt);
            }
        });
        
        JBD3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD3_1ActionPerformed(evt);
            }
        });
        
        JBD4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD4_1ActionPerformed(evt);
            }
        });
        
        JBD5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD5_1ActionPerformed(evt);
            }
        });
        
        JBD6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD6_1ActionPerformed(evt);
            }
        });
        
        JBD7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD7_1ActionPerformed(evt);
            }
        });
        
        JBD8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD8_1ActionPerformed(evt);
            }
        });
        
        JBD9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD9_1ActionPerformed(evt);
            }
        });
        
        JBD10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBD10_1ActionPerformed(evt);
            }
        });
        
        JBE1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE1_1ActionPerformed(evt);
            }
        });
        
        JBE2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE2_1ActionPerformed(evt);
            }
        });
        
        JBE3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE3_1ActionPerformed(evt);
            }
        });
        
        JBE4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE4_1ActionPerformed(evt);
            }
        });
        
        JBE5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE5_1ActionPerformed(evt);
            }
        });
        
        JBE6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE6_1ActionPerformed(evt);
            }
        });
        
        JBE7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE7_1ActionPerformed(evt);
            }
        });
        
        JBE8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE8_1ActionPerformed(evt);
            }
        });
        
        JBE9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE9_1ActionPerformed(evt);
            }
        });
        
        JBE10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBE10_1ActionPerformed(evt);
            }
        });
        
        JBF1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF1_1ActionPerformed(evt);
            }
        });
        
        JBF2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF2_1ActionPerformed(evt);
            }
        });
        
        JBF3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF3_1ActionPerformed(evt);
            }
        });
        
        JBF4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF4_1ActionPerformed(evt);
            }
        });
        
        JBF5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF5_1ActionPerformed(evt);
            }
        });
        
        JBF6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF6_1ActionPerformed(evt);
            }
        });
        
        JBF7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF7_1ActionPerformed(evt);
            }
        });
        
        JBF8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF8_1ActionPerformed(evt);
            }
        });
        
        JBF9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF9_1ActionPerformed(evt);
            }
        });
        
        JBF10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBF10_1ActionPerformed(evt);
            }
        });
        
        JBG1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG1_1ActionPerformed(evt);
            }
        });
        
        JBG2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG2_1ActionPerformed(evt);
            }
        });
        
        JBG3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG3_1ActionPerformed(evt);
            }
        });
        
        JBG4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG4_1ActionPerformed(evt);
            }
        });
        
        JBG5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG5_1ActionPerformed(evt);
            }
        });
        
        JBG6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG6_1ActionPerformed(evt);
            }
        });
        
        JBG7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG7_1ActionPerformed(evt);
            }
        });
        
        JBG8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG8_1ActionPerformed(evt);
            }
        });
        
        JBG9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG9_1ActionPerformed(evt);
            }
        });
        
        JBG10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBG10_1ActionPerformed(evt);
            }
        });
        
        JBH1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH1_1ActionPerformed(evt);
            }
        });
        
        JBH2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH2_1ActionPerformed(evt);
            }
        });
        
        JBH3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH3_1ActionPerformed(evt);
            }
        });
        
        JBH4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH4_1ActionPerformed(evt);
            }
        });
        
        JBH5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH5_1ActionPerformed(evt);
            }
        });
        
        JBH6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH6_1ActionPerformed(evt);
            }
        });
        
        JBH7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH7_1ActionPerformed(evt);
            }
        });
        
        JBH8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH8_1ActionPerformed(evt);
            }
        });
        
        JBH9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH9_1ActionPerformed(evt);
            }
        });
        
        JBH10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBH10_1ActionPerformed(evt);
            }
        });
        
        JBI1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI1_1ActionPerformed(evt);
            }
        });
        
        JBI2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI2_1ActionPerformed(evt);
            }
        });
        
        JBI3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI3_1ActionPerformed(evt);
            }
        });
        
        JBI4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI4_1ActionPerformed(evt);
            }
        });
        
        JBI5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI5_1ActionPerformed(evt);
            }
        });
        
        JBI6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI6_1ActionPerformed(evt);
            }
        });
        
        JBI7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI7_1ActionPerformed(evt);
            }
        });
        
        JBI8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI8_1ActionPerformed(evt);
            }
        });
        
        JBI9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI9_1ActionPerformed(evt);
            }
        });
        
        JBI10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBI10_1ActionPerformed(evt);
            }
        });
        
        JBJ1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ1_1ActionPerformed(evt);
            }
        });
        
        JBJ2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ2_1ActionPerformed(evt);
            }
        });
        
        JBJ3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ3_1ActionPerformed(evt);
            }
        });
        
        JBJ4_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ4_1ActionPerformed(evt);
            }
        });
        
        JBJ5_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ5_1ActionPerformed(evt);
            }
        });
        
        JBJ6_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ6_1ActionPerformed(evt);
            }
        });
        
        JBJ7_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ7_1ActionPerformed(evt);
            }
        });
        
        JBJ8_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ8_1ActionPerformed(evt);
            }
        });
        
        JBJ9_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ9_1ActionPerformed(evt);
            }
        });
        
        JBJ10_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBJ10_1ActionPerformed(evt);
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
        
        this.add(JBSeleccionarBarco1);
        
        this.add(JLAmetralladora1);
        this.add(JLMisil1);
        this.add(JLBombaNuclear1);
        
        this.add(JBAmetralladora1);
        this.add(JBMisil1);
        this.add(JBBombaNuclear1);
        
        this.add(JL1_2);
        this.add(JL2_2);
        this.add(JL3_2);
        this.add(JL4_2);
        this.add(JL5_2);
        this.add(JL6_2);
        this.add(JL7_2);
        this.add(JL8_2);
        this.add(JL9_2);
        this.add(JL10_2);
        
        this.add(JLA_2);
        this.add(JLB_2);
        this.add(JLC_2);
        this.add(JLD_2);
        this.add(JLE_2);
        this.add(JLF_2);
        this.add(JLG_2);
        this.add(JLH_2);
        this.add(JLI_2);
        this.add(JLJ_2);
        
        this.add(JBA1_2);
        this.add(JBA2_2);
        this.add(JBA3_2);
        this.add(JBA4_2);
        this.add(JBA5_2);
        this.add(JBA6_2);
        this.add(JBA7_2);
        this.add(JBA8_2);
        this.add(JBA9_2);
        this.add(JBA10_2);
        
        this.add(JBB1_2);
        this.add(JBB2_2);
        this.add(JBB3_2);
        this.add(JBB4_2);
        this.add(JBB5_2);
        this.add(JBB6_2);
        this.add(JBB7_2);
        this.add(JBB8_2);
        this.add(JBB9_2);
        this.add(JBB10_2);
        
        this.add(JBC1_2);
        this.add(JBC2_2);
        this.add(JBC3_2);
        this.add(JBC4_2);
        this.add(JBC5_2);
        this.add(JBC6_2);
        this.add(JBC7_2);
        this.add(JBC8_2);
        this.add(JBC9_2);
        this.add(JBC10_2);
        
        this.add(JBD1_2);
        this.add(JBD2_2);
        this.add(JBD3_2);
        this.add(JBD4_2);
        this.add(JBD5_2);
        this.add(JBD6_2);
        this.add(JBD7_2);
        this.add(JBD8_2);
        this.add(JBD9_2);
        this.add(JBD10_2);
        
        this.add(JBE1_2);
        this.add(JBE2_2);
        this.add(JBE3_2);
        this.add(JBE4_2);
        this.add(JBE5_2);
        this.add(JBE6_2);
        this.add(JBE7_2);
        this.add(JBE8_2);
        this.add(JBE9_2);
        this.add(JBE10_2);
        
        this.add(JBF1_2);
        this.add(JBF2_2);
        this.add(JBF3_2);
        this.add(JBF4_2);
        this.add(JBF5_2);
        this.add(JBF6_2);
        this.add(JBF7_2);
        this.add(JBF8_2);
        this.add(JBF9_2);
        this.add(JBF10_2);
        
        this.add(JBG1_2);
        this.add(JBG2_2);
        this.add(JBG3_2);
        this.add(JBG4_2);
        this.add(JBG5_2);
        this.add(JBG6_2);
        this.add(JBG7_2);
        this.add(JBG8_2);
        this.add(JBG9_2);
        this.add(JBG10_2);
        
        this.add(JBH1_2);
        this.add(JBH2_2);
        this.add(JBH3_2);
        this.add(JBH4_2);
        this.add(JBH5_2);
        this.add(JBH6_2);
        this.add(JBH7_2);
        this.add(JBH8_2);
        this.add(JBH9_2);
        this.add(JBH10_2);
        
        this.add(JBI1_2);
        this.add(JBI2_2);
        this.add(JBI3_2);
        this.add(JBI4_2);
        this.add(JBI5_2);
        this.add(JBI6_2);
        this.add(JBI7_2);
        this.add(JBI8_2);
        this.add(JBI9_2);
        this.add(JBI10_2);
        
        this.add(JBJ1_2);
        this.add(JBJ2_2);
        this.add(JBJ3_2);
        this.add(JBJ4_2);
        this.add(JBJ5_2);
        this.add(JBJ6_2);
        this.add(JBJ7_2);
        this.add(JBJ8_2);
        this.add(JBJ9_2);
        this.add(JBJ10_2);
        
        this.add(JBSeleccionarBarco2);
        
        this.add(JLAmetralladora2);
        this.add(JLMisil2);
        this.add(JLBombaNuclear2);
        
        this.add(JBAmetralladora2);
        this.add(JBMisil2);
        this.add(JBBombaNuclear2);
        
        
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
        
        JBSeleccionarBarco1.reshape(50, 315, 200, 25);
        
        JLAmetralladora1.reshape(275, 135, 50, 50);
        
        JL1_2.reshape(425, 15, 25, 25);
        JL2_2.reshape(450, 15, 25, 25);
        JL3_2.reshape(475, 15, 25, 25);
        JL4_2.reshape(500, 15, 25, 25);
        JL5_2.reshape(525, 15, 25, 25);
        JL6_2.reshape(550, 15, 25, 25);
        JL7_2.reshape(575, 15, 25, 25);
        JL8_2.reshape(600, 15, 25, 25);
        JL9_2.reshape(625, 15, 25, 25);
        JL10_2.reshape(650, 15, 25, 25);
        
        JLA_2.reshape(410, 40, 25, 25);
        JLB_2.reshape(410, 65, 25, 25);
        JLC_2.reshape(410, 90, 25, 25);
        JLD_2.reshape(410, 115, 25, 25);
        JLE_2.reshape(410, 140, 25, 25);
        JLF_2.reshape(410, 165, 25, 25);
        JLG_2.reshape(410, 190, 25, 25);
        JLH_2.reshape(410, 215, 25, 25);
        JLI_2.reshape(410, 240, 25, 25);
        JLJ_2.reshape(410, 265, 25, 25);
        
        JBA1_2.reshape(425, 40, 25, 25);
        JBA2_2.reshape(450, 40, 25, 25);
        JBA3_2.reshape(475, 40, 25, 25);
        JBA4_2.reshape(500, 40, 25, 25);
        JBA5_2.reshape(525, 40, 25, 25);
        JBA6_2.reshape(550, 40, 25, 25);
        JBA7_2.reshape(575, 40, 25, 25);
        JBA8_2.reshape(600, 40, 25, 25);
        JBA9_2.reshape(625, 40, 25, 25);
        JBA10_2.reshape(650, 40, 25, 25);
        
        JBB1_2.reshape(425, 65, 25, 25);
        JBB2_2.reshape(450, 65, 25, 25);
        JBB3_2.reshape(475, 65, 25, 25);
        JBB4_2.reshape(500, 65, 25, 25);
        JBB5_2.reshape(525, 65, 25, 25);
        JBB6_2.reshape(550, 65, 25, 25);
        JBB7_2.reshape(575, 65, 25, 25);
        JBB8_2.reshape(600, 65, 25, 25);
        JBB9_2.reshape(625, 65, 25, 25);
        JBB10_2.reshape(650, 65, 25, 25);
        
        JBC1_2.reshape(425, 90, 25, 25);
        JBC2_2.reshape(450, 90, 25, 25);
        JBC3_2.reshape(475, 90, 25, 25);
        JBC4_2.reshape(500, 90, 25, 25);
        JBC5_2.reshape(525, 90, 25, 25);
        JBC6_2.reshape(550, 90, 25, 25);
        JBC7_2.reshape(575, 90, 25, 25);
        JBC8_2.reshape(600, 90, 25, 25);
        JBC9_2.reshape(625, 90, 25, 25);
        JBC10_2.reshape(650, 90, 25, 25);
        
        JBD1_2.reshape(425, 115, 25, 25);
        JBD2_2.reshape(450, 115, 25, 25);
        JBD3_2.reshape(475, 115, 25, 25);
        JBD4_2.reshape(500, 115, 25, 25);
        JBD5_2.reshape(525, 115, 25, 25);
        JBD6_2.reshape(550, 115, 25, 25);
        JBD7_2.reshape(575, 115, 25, 25);
        JBD8_2.reshape(600, 115, 25, 25);
        JBD9_2.reshape(625, 115, 25, 25);
        JBD10_2.reshape(650, 115, 25, 25);
        
        JBE1_2.reshape(425, 140, 25, 25);
        JBE2_2.reshape(450, 140, 25, 25);
        JBE3_2.reshape(475, 140, 25, 25);
        JBE4_2.reshape(500, 140, 25, 25);
        JBE5_2.reshape(525, 140, 25, 25);
        JBE6_2.reshape(550, 140, 25, 25);
        JBE7_2.reshape(575, 140, 25, 25);
        JBE8_2.reshape(600, 140, 25, 25);
        JBE9_2.reshape(625, 140, 25, 25);
        JBE10_2.reshape(650, 140, 25, 25);
        
        JBF1_2.reshape(425, 165, 25, 25);
        JBF2_2.reshape(450, 165, 25, 25);
        JBF3_2.reshape(475, 165, 25, 25);
        JBF4_2.reshape(500, 165, 25, 25);
        JBF5_2.reshape(525, 165, 25, 25);
        JBF6_2.reshape(550, 165, 25, 25);
        JBF7_2.reshape(575, 165, 25, 25);
        JBF8_2.reshape(600, 165, 25, 25);
        JBF9_2.reshape(625, 165, 25, 25);
        JBF10_2.reshape(650, 165, 25, 25);
        
        JBG1_2.reshape(425, 190, 25, 25);
        JBG2_2.reshape(450, 190, 25, 25);
        JBG3_2.reshape(475, 190, 25, 25);
        JBG4_2.reshape(500, 190, 25, 25);
        JBG5_2.reshape(525, 190, 25, 25);
        JBG6_2.reshape(550, 190, 25, 25);
        JBG7_2.reshape(575, 190, 25, 25);
        JBG8_2.reshape(600, 190, 25, 25);
        JBG9_2.reshape(625, 190, 25, 25);
        JBG10_2.reshape(650, 190, 25, 25);
        
        JBH1_2.reshape(425, 215, 25, 25);
        JBH2_2.reshape(450, 215, 25, 25);
        JBH3_2.reshape(475, 215, 25, 25);
        JBH4_2.reshape(500, 215, 25, 25);
        JBH5_2.reshape(525, 215, 25, 25);
        JBH6_2.reshape(550, 215, 25, 25);
        JBH7_2.reshape(575, 215, 25, 25);
        JBH8_2.reshape(600, 215, 25, 25);
        JBH9_2.reshape(625, 215, 25, 25);
        JBH10_2.reshape(650, 215, 25, 25);
        
        JBI1_2.reshape(425, 240, 25, 25);
        JBI2_2.reshape(450, 240, 25, 25);
        JBI3_2.reshape(475, 240, 25, 25);
        JBI4_2.reshape(500, 240, 25, 25);
        JBI5_2.reshape(525, 240, 25, 25);
        JBI6_2.reshape(550, 240, 25, 25);
        JBI7_2.reshape(575, 240, 25, 25);
        JBI8_2.reshape(600, 240, 25, 25);
        JBI9_2.reshape(625, 240, 25, 25);
        JBI10_2.reshape(650, 240, 25, 25);
        
        JBJ1_2.reshape(425, 265, 25, 25);
        JBJ2_2.reshape(450, 265, 25, 25);
        JBJ3_2.reshape(475, 265, 25, 25);
        JBJ4_2.reshape(500, 265, 25, 25);
        JBJ5_2.reshape(525, 265, 25, 25);
        JBJ6_2.reshape(550, 265, 25, 25);
        JBJ7_2.reshape(575, 265, 25, 25);
        JBJ8_2.reshape(600, 265, 25, 25);
        JBJ9_2.reshape(625, 265, 25, 25);
        JBJ10_2.reshape(650, 265, 25, 25);
        
        JBSeleccionarBarco2.reshape(450, 315, 200, 25);
    
        ActivarJugador1(false);
        ActivarJugador2(false);
        
        ConfiguracionInicial Ci = new ConfiguracionInicial(this, true);
        Ci.setVisible(true);
        
        if (ClsGlobal.MultiJugador){
            //si es multijugador
            JBSeleccionarBarco1.setVisible(true);
            JBSeleccionarBarco2.setVisible(true);
        } else{
            //no es multijugador
            JBSeleccionarBarco1.setVisible(true);
            JBSeleccionarBarco2.setVisible(false);
            ActivarJugador2(true);
        }
    }
    
    private void JBA1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A1"));
    }
    
    private void JBA2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A2"));
    }
    
    private void JBA3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A3"));
    }
    
    private void JBA4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A4"));
    }
    
    private void JBA5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A5"));
    }
    
    private void JBA6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A6"));
    }
    
    private void JBA7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A7"));
    }
    
    private void JBA8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A8"));
    }
    
    private void JBA9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A9"));
    }
    
    private void JBA10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("A10"));
    }
    
    private void JBB1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B1"));
    }
    
    private void JBB2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B2"));
    }
    
    private void JBB3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B3"));
    }
    
    private void JBB4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B4"));
    }
    
    private void JBB5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B5"));
    }
    
    private void JBB6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B6"));
    }
    
    private void JBB7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B7"));
    }
    
    private void JBB8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B8"));
    }
    
    private void JBB9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B9"));
    }
    
    private void JBB10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("B10"));
    }
    
    private void JBC1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C1"));
    }
    
    private void JBC2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C2"));
    }
    
    private void JBC3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C3"));
    }
    
    private void JBC4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C4"));
    }
    
    private void JBC5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C5"));
    }
    
    private void JBC6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C6"));
    }
    
    private void JBC7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C7"));
    }
    
    private void JBC8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C8"));
    }
    
    private void JBC9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C9"));
    }
    
    private void JBC10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("C10"));
    }
    
    private void JBD1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D1"));
    }
    
    private void JBD2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D2"));
    }
    
    private void JBD3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D3"));
    }
    
    private void JBD4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D4"));
    }
    
    private void JBD5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D5"));
    }
    
    private void JBD6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D6"));
    }
    
    private void JBD7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D7"));
    }
    
    private void JBD8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D8"));
    }
    
    private void JBD9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D9"));
    }
    
    private void JBD10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("D10"));
    }
    
    private void JBE1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E1"));
    }
    
    private void JBE2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E2"));
    }
    
    private void JBE3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E3"));
    }
    
    private void JBE4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E4"));
    }
    
    private void JBE5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E5"));
    }
    
    private void JBE6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E6"));
    }
    
    private void JBE7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E7"));
    }
    
    private void JBE8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E8"));
    }
    
    private void JBE9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E9"));
    }
    
    private void JBE10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("E10"));
    }
    
    private void JBF1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F1"));
    }
    
    private void JBF2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F2"));
    }
    
    private void JBF3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F3"));
    }
    
    private void JBF4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F4"));
    }
    
    private void JBF5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F5"));
    }
    
    private void JBF6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F6"));
    }
    
    private void JBF7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F7"));
    }
    
    private void JBF8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F8"));
    }
    
    private void JBF9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F9"));
    }
    
    private void JBF10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("F10"));
    }
    
    private void JBG1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G1"));
    }
    
    private void JBG2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G2"));
    }
    
    private void JBG3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G3"));
    }
    
    private void JBG4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G4"));
    }
    
    private void JBG5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G5"));
    }
    
    private void JBG6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G6"));
    }
    
    private void JBG7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G7"));
    }
    
    private void JBG8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G8"));
    }
    
    private void JBG9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G9"));
    }
    
    private void JBG10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("G10"));
    }
    
    private void JBH1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H1"));
    }
    
    private void JBH2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H2"));
    }
    
    private void JBH3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H3"));
    }
    
    private void JBH4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H4"));
    }
    
    private void JBH5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H5"));
    }
    
    private void JBH6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H6"));
    }
    
    private void JBH7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H7"));
    }
    
    private void JBH8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H8"));
    }
    
    private void JBH9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H9"));
    }
    
    private void JBH10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("H10"));
    }
    
     private void JBI1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I1"));
    }
    
    private void JBI2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I2"));
    }
    
    private void JBI3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I3"));
    }
    
    private void JBI4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I4"));
    }
    
    private void JBI5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I5"));
    }
    
    private void JBI6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I6"));
    }
    
    private void JBI7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I7"));
    }
    
    private void JBI8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I8"));
    }
    
    private void JBI9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I9"));
    }
    
    private void JBI10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("I10"));
    }
    
    private void JBJ1_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J1"));
    }
    
    private void JBJ2_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J2"));
    }
    
    private void JBJ3_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J3"));
    }
    
    private void JBJ4_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J4"));
    }
    
    private void JBJ5_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J5"));
    }
    
    private void JBJ6_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J6"));
    }
    
    private void JBJ7_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J7"));
    }
    
    private void JBJ8_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J8"));
    }
    
    private void JBJ9_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J9"));
    }
    
    private void JBJ10_1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, ("J10"));
    }
    
    private void JBSeleccionarBarco1ActionPerformed(java.awt.event.ActionEvent evt) {
       ColocarBarcos CB = new ColocarBarcos(this, true, 1);
       CB.setVisible(true);
       
       if (ClsGlobal.Confirmacion1){
            JBSeleccionarBarco1.setVisible(false);
            ActivarJugador1(true);
       } 
   
    }
    
    private void JBSeleccionarBarco2ActionPerformed(java.awt.event.ActionEvent evt) {
        ColocarBarcos CB = new ColocarBarcos(this, true, 2);
        CB.setVisible(true);
        ClsGlobal.Matriz1[0][0] = 1;
        
         if (ClsGlobal.Confirmacion2){
            JBSeleccionarBarco2.setVisible(false);
             ActivarJugador2(true);
       } 
    }

    private void ActivarJugador1(boolean Activar) {
        JBA1_1.setEnabled(Activar);
        JBA2_1.setEnabled(Activar);
        JBA3_1.setEnabled(Activar);
        JBA4_1.setEnabled(Activar);
        JBA5_1.setEnabled(Activar);
        JBA6_1.setEnabled(Activar);
        JBA7_1.setEnabled(Activar);
        JBA8_1.setEnabled(Activar);
        JBA9_1.setEnabled(Activar);
        JBA10_1.setEnabled(Activar);
        
        JBB1_1.setEnabled(Activar);
        JBB2_1.setEnabled(Activar);
        JBB3_1.setEnabled(Activar);
        JBB4_1.setEnabled(Activar);
        JBB5_1.setEnabled(Activar);
        JBB6_1.setEnabled(Activar);
        JBB7_1.setEnabled(Activar);
        JBB8_1.setEnabled(Activar);
        JBB9_1.setEnabled(Activar);
        JBB10_1.setEnabled(Activar);
        
        JBC1_1.setEnabled(Activar);
        JBC2_1.setEnabled(Activar);
        JBC3_1.setEnabled(Activar);
        JBC4_1.setEnabled(Activar);
        JBC5_1.setEnabled(Activar);
        JBC6_1.setEnabled(Activar);
        JBC7_1.setEnabled(Activar);
        JBC8_1.setEnabled(Activar);
        JBC9_1.setEnabled(Activar);
        JBC10_1.setEnabled(Activar);
        
        JBD1_1.setEnabled(Activar);
        JBD2_1.setEnabled(Activar);
        JBD3_1.setEnabled(Activar);
        JBD4_1.setEnabled(Activar);
        JBD5_1.setEnabled(Activar);
        JBD6_1.setEnabled(Activar);
        JBD7_1.setEnabled(Activar);
        JBD8_1.setEnabled(Activar);
        JBD9_1.setEnabled(Activar);
        JBD10_1.setEnabled(Activar);
       
        JBE1_1.setEnabled(Activar);
        JBE2_1.setEnabled(Activar);
        JBE3_1.setEnabled(Activar);
        JBE4_1.setEnabled(Activar);
        JBE5_1.setEnabled(Activar);
        JBE6_1.setEnabled(Activar);
        JBE7_1.setEnabled(Activar);
        JBE8_1.setEnabled(Activar);
        JBE9_1.setEnabled(Activar);
        JBE10_1.setEnabled(Activar);
        
        JBF1_1.setEnabled(Activar);
        JBF2_1.setEnabled(Activar);
        JBF3_1.setEnabled(Activar);
        JBF4_1.setEnabled(Activar);
        JBF5_1.setEnabled(Activar);
        JBF6_1.setEnabled(Activar);
        JBF7_1.setEnabled(Activar);
        JBF8_1.setEnabled(Activar);
        JBF9_1.setEnabled(Activar);
        JBF10_1.setEnabled(Activar);
        
        JBG1_1.setEnabled(Activar);
        JBG2_1.setEnabled(Activar);
        JBG3_1.setEnabled(Activar);
        JBG4_1.setEnabled(Activar);
        JBG5_1.setEnabled(Activar);
        JBG6_1.setEnabled(Activar);
        JBG7_1.setEnabled(Activar);
        JBG8_1.setEnabled(Activar);
        JBG9_1.setEnabled(Activar);
        JBG10_1.setEnabled(Activar);
        
        JBH1_1.setEnabled(Activar);
        JBH2_1.setEnabled(Activar);
        JBH3_1.setEnabled(Activar);
        JBH4_1.setEnabled(Activar);
        JBH5_1.setEnabled(Activar);
        JBH6_1.setEnabled(Activar);
        JBH7_1.setEnabled(Activar);
        JBH8_1.setEnabled(Activar);
        JBH9_1.setEnabled(Activar);
        JBH10_1.setEnabled(Activar);
        
        JBI1_1.setEnabled(Activar);
        JBI2_1.setEnabled(Activar);
        JBI3_1.setEnabled(Activar);
        JBI4_1.setEnabled(Activar);
        JBI5_1.setEnabled(Activar);
        JBI6_1.setEnabled(Activar);
        JBI7_1.setEnabled(Activar);
        JBI8_1.setEnabled(Activar);
        JBI9_1.setEnabled(Activar);
        JBI10_1.setEnabled(Activar);
        
        JBJ1_1.setEnabled(Activar);
        JBJ2_1.setEnabled(Activar);
        JBJ3_1.setEnabled(Activar);
        JBJ4_1.setEnabled(Activar);
        JBJ5_1.setEnabled(Activar);
        JBJ6_1.setEnabled(Activar);
        JBJ7_1.setEnabled(Activar);
        JBJ8_1.setEnabled(Activar);
        JBJ9_1.setEnabled(Activar);
        JBJ10_1.setEnabled(Activar);
      
    }
    
    private void ActivarJugador2(boolean Activar) {
        JBA1_2.setEnabled(Activar);
        JBA2_2.setEnabled(Activar);
        JBA3_2.setEnabled(Activar);
        JBA4_2.setEnabled(Activar);
        JBA5_2.setEnabled(Activar);
        JBA6_2.setEnabled(Activar);
        JBA7_2.setEnabled(Activar);
        JBA8_2.setEnabled(Activar);
        JBA9_2.setEnabled(Activar);
        JBA10_2.setEnabled(Activar);
        
        JBB1_2.setEnabled(Activar);
        JBB2_2.setEnabled(Activar);
        JBB3_2.setEnabled(Activar);
        JBB4_2.setEnabled(Activar);
        JBB5_2.setEnabled(Activar);
        JBB6_2.setEnabled(Activar);
        JBB7_2.setEnabled(Activar);
        JBB8_2.setEnabled(Activar);
        JBB9_2.setEnabled(Activar);
        JBB10_2.setEnabled(Activar);
        
        JBC1_2.setEnabled(Activar);
        JBC2_2.setEnabled(Activar);
        JBC3_2.setEnabled(Activar);
        JBC4_2.setEnabled(Activar);
        JBC5_2.setEnabled(Activar);
        JBC6_2.setEnabled(Activar);
        JBC7_2.setEnabled(Activar);
        JBC8_2.setEnabled(Activar);
        JBC9_2.setEnabled(Activar);
        JBC10_2.setEnabled(Activar);
        
        JBD1_2.setEnabled(Activar);
        JBD2_2.setEnabled(Activar);
        JBD3_2.setEnabled(Activar);
        JBD4_2.setEnabled(Activar);
        JBD5_2.setEnabled(Activar);
        JBD6_2.setEnabled(Activar);
        JBD7_2.setEnabled(Activar);
        JBD8_2.setEnabled(Activar);
        JBD9_2.setEnabled(Activar);
        JBD10_2.setEnabled(Activar);
       
        JBE1_2.setEnabled(Activar);
        JBE2_2.setEnabled(Activar);
        JBE3_2.setEnabled(Activar);
        JBE4_2.setEnabled(Activar);
        JBE5_2.setEnabled(Activar);
        JBE6_2.setEnabled(Activar);
        JBE7_2.setEnabled(Activar);
        JBE8_2.setEnabled(Activar);
        JBE9_2.setEnabled(Activar);
        JBE10_2.setEnabled(Activar);
        
        JBF1_2.setEnabled(Activar);
        JBF2_2.setEnabled(Activar);
        JBF3_2.setEnabled(Activar);
        JBF4_2.setEnabled(Activar);
        JBF5_2.setEnabled(Activar);
        JBF6_2.setEnabled(Activar);
        JBF7_2.setEnabled(Activar);
        JBF8_2.setEnabled(Activar);
        JBF9_2.setEnabled(Activar);
        JBF10_2.setEnabled(Activar);
        
        JBG1_2.setEnabled(Activar);
        JBG2_2.setEnabled(Activar);
        JBG3_2.setEnabled(Activar);
        JBG4_2.setEnabled(Activar);
        JBG5_2.setEnabled(Activar);
        JBG6_2.setEnabled(Activar);
        JBG7_2.setEnabled(Activar);
        JBG8_2.setEnabled(Activar);
        JBG9_2.setEnabled(Activar);
        JBG10_2.setEnabled(Activar);
        
        JBH1_2.setEnabled(Activar);
        JBH2_2.setEnabled(Activar);
        JBH3_2.setEnabled(Activar);
        JBH4_2.setEnabled(Activar);
        JBH5_2.setEnabled(Activar);
        JBH6_2.setEnabled(Activar);
        JBH7_2.setEnabled(Activar);
        JBH8_2.setEnabled(Activar);
        JBH9_2.setEnabled(Activar);
        JBH10_2.setEnabled(Activar);
        
        JBI1_2.setEnabled(Activar);
        JBI2_2.setEnabled(Activar);
        JBI3_2.setEnabled(Activar);
        JBI4_2.setEnabled(Activar);
        JBI5_2.setEnabled(Activar);
        JBI6_2.setEnabled(Activar);
        JBI7_2.setEnabled(Activar);
        JBI8_2.setEnabled(Activar);
        JBI9_2.setEnabled(Activar);
        JBI10_2.setEnabled(Activar);
        
        JBJ1_2.setEnabled(Activar);
        JBJ2_2.setEnabled(Activar);
        JBJ3_2.setEnabled(Activar);
        JBJ4_2.setEnabled(Activar);
        JBJ5_2.setEnabled(Activar);
        JBJ6_2.setEnabled(Activar);
        JBJ7_2.setEnabled(Activar);
        JBJ8_2.setEnabled(Activar);
        JBJ9_2.setEnabled(Activar);
        JBJ10_2.setEnabled(Activar);
      
    }
    
}
