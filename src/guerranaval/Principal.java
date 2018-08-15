
package guerranaval;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Principal extends JFrame implements Runnable{
    //Se crea el hilo para el timmer
    Thread h1;
    
    int[][] Matriz1 = new int[10][10];
    int[][] Matriz2 = new int[10][10];
    int[][] Matriz3 = new int[10][10];
    int[][] Matriz4 = new int[10][10];
    int[][] Matriz5 = new int[10][10];
    int[][] Matriz6 = new int[10][10];
    int[][] Matriz7 = new int[10][10];
    int[][] Matriz8 = new int[10][10];
    int[][] Matriz9 = new int[10][10];
    int[][] Matriz10 = new int[10][10];
    
    boolean BTurno1 = false;
    boolean BTurno2 = false;
    boolean BAmetralladora1 = false;
    boolean BMisil1 = false;
    boolean BBombaNuclear1 = false;
    boolean BAmetralladora2 = false;
    boolean BMisil2 = false;
    boolean BBombaNuclear2 = false;
    int ITiempo = 60;
    
    javax.swing.JLabel JLTurno1 = new javax.swing.JLabel();
    javax.swing.JLabel JLTurno2 = new javax.swing.JLabel();
    
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
        h1 = new Thread(this);
        h1.start();
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
        JLAmetralladora1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Ametralladora.png"))).getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));

        JLMisil1.setText("");
        JLMisil1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Misil.png"))).getImage().getScaledInstance(48, 16, Image.SCALE_DEFAULT)));
        
        JLBombaNuclear1.setText("");
        JLBombaNuclear1.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BombaNuclear.png"))).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        
        JLAmetralladora2.setText("");
        JLAmetralladora2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Ametralladora.png"))).getImage().getScaledInstance(48, 48, Image.SCALE_DEFAULT)));
        
        JLMisil2.setText("");
        JLMisil2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Misil.png"))).getImage().getScaledInstance(48, 16, Image.SCALE_DEFAULT)));
        
        JLBombaNuclear2.setText("");
        JLBombaNuclear2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/BombaNuclear.png"))).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)));
        
        JBSeleccionarBarco1.setText("Seleccionar");
        JBSeleccionarBarco2.setText("Seleccionar");

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
        
        JBA1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBA10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBB1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBB10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBC1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBC10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBD1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBD10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBE1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBE10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBF1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBF10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBG1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBG10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBH1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBH10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBI1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBI10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        JBJ1_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ2_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ3_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ4_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ5_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ6_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ7_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ8_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ9_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        JBJ10_2.setIcon(new ImageIcon((new ImageIcon(getClass().getResource("/Imagenes/Blanco.png"))).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT)));
        
        
        
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
        
        JLTurno1.setFont(new Font("Serif", Font.PLAIN, 24));
        JLTurno1.setForeground(Color.RED);
        
        JLTurno2.setFont(new Font("Serif", Font.PLAIN, 24));
        JLTurno2.setForeground(Color.RED);

        this.add(JLTurno1);
        this.add(JLTurno2);
        
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
        
        JLTurno1.reshape(330, 40, 25, 25);
        
        JLAmetralladora1.reshape(285, 75, 50, 50);
        JLMisil1.reshape(285, 125, 50, 50);
        JLBombaNuclear1.reshape(285, 175, 50, 50);
        
        JBAmetralladora1.reshape(340, 75, 50, 50);
        JBMisil1.reshape(340, 125, 50, 50);
        JBBombaNuclear1.reshape(340, 175, 50, 50);
        
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
        
        JLAmetralladora2.reshape(685, 75, 50, 50);
        JLMisil2.reshape(685, 125, 50, 50);
        JLBombaNuclear2.reshape(685, 175, 50, 50);
        
        JLTurno2.reshape(730, 40, 25, 25);
        
        JBAmetralladora2.reshape(740, 75, 50, 50);
        JBMisil2.reshape(740, 125, 50, 50);
        JBBombaNuclear2.reshape(740, 175, 50, 50);
    
        ActivarJugador1(false);
        ActivarJugador2(false);
        
        ConfiguracionInicial Ci = new ConfiguracionInicial(this, true);
        Ci.setUndecorated(true);
        Ci.setVisible(true);
        
        if (ClsGlobal.MultiJugador){
            //si es multijugador
            JBSeleccionarBarco1.setVisible(true);
            JBSeleccionarBarco2.setVisible(true);
        } else{
            //no es multijugador
            JBSeleccionarBarco1.setVisible(true);
            JBSeleccionarBarco2.setVisible(false);
            GenerarJugador2();
            Random Rnd = new Random();
            int MatrizRandom = Rnd.nextInt(10) + 1;
            switch(MatrizRandom){
                case 1 :
                    ClsGlobal.Matriz2 = Matriz1;
                    break;
                case 2 :
                    ClsGlobal.Matriz2 = Matriz2;
                    break;
                case 3 :
                    ClsGlobal.Matriz2 = Matriz3;
                    break;
                case 4:
                    ClsGlobal.Matriz2 = Matriz4;
                    break;
                case 5 :
                    ClsGlobal.Matriz2 = Matriz5;
                    break;
                case 6 :
                    ClsGlobal.Matriz2 = Matriz6;
                    break;
                case 7 :
                    ClsGlobal.Matriz2 = Matriz7;
                    break;
                case 8 :
                    ClsGlobal.Matriz2 = Matriz8;
                    break;
                case 9 :
                    ClsGlobal.Matriz2 = Matriz9;
                    break;
                case 10 :
                    ClsGlobal.Matriz2 = Matriz10;
                    break;
            
            }
            ActivarJugador2(true);
            ActivarArmasJugador(2);
            VisualizarArmasJugador(2);
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
            ActivarArmasJugador(1);
            VisualizarArmasJugador(1);
       } 
   
    }
    
    private void JBSeleccionarBarco2ActionPerformed(java.awt.event.ActionEvent evt) {
        ColocarBarcos CB = new ColocarBarcos(this, true, 2);
        CB.setVisible(true);
        ClsGlobal.Matriz1[0][0] = 1;
        
         if (ClsGlobal.Confirmacion2){
            JBSeleccionarBarco2.setVisible(false);
             ActivarJugador2(true);
             ActivarArmasJugador(2);
             VisualizarArmasJugador(2);
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

    private void ActivarArmasJugador(int jugador) {
        if(jugador == 1){
            ClsGlobal.Ametralladora1 = 75;
            ClsGlobal.Misil1 = 3;
            ClsGlobal.BombaNuclear1 = 1;
        }else if(jugador == 2){
            ClsGlobal.Ametralladora2 = 75;
            ClsGlobal.Misil2 = 3;
            ClsGlobal.BombaNuclear2 = 1;
        }
    }

    private void VisualizarArmasJugador(int jugador) {
        if(jugador == 1){
            JBAmetralladora1.setText(ClsGlobal.Ametralladora1 + "");
            JBMisil1.setText(ClsGlobal.Misil1 + "");
            JBBombaNuclear1.setText(ClsGlobal.BombaNuclear1 + "");
        }else if(jugador == 2){
            JBAmetralladora2.setText(ClsGlobal.Ametralladora2 + "");
            JBMisil2.setText(ClsGlobal.Misil2 + "");
            JBBombaNuclear2.setText(ClsGlobal.BombaNuclear2 + "");
        }
    }

    @Override
    public void run() {
        Thread Th = Thread.currentThread();
        while(Th == h1){      
            if (BTurno1){
                if (ITiempo > 0){
                    JLTurno1.setText(ITiempo + "");
                    JLTurno2.setText("");
                    if(ClsGlobal.Ametralladora1 > 0){
                        JBAmetralladora1.setEnabled(true);
                    }else {
                        JBAmetralladora1.setEnabled(false);
                    }
                    if(ClsGlobal.Misil1 > 0){
                        JBMisil1.setEnabled(true);
                    }else {
                        JBMisil1.setEnabled(false);
                    }
                    if(ClsGlobal.BombaNuclear1 > 0){
                        JBBombaNuclear1.setEnabled(true);
                    }else{
                        JBBombaNuclear1.setEnabled(false);
                    }

                    JBAmetralladora2.setEnabled(false);
                    JBMisil2.setEnabled(false);
                    JBBombaNuclear2.setEnabled(false);
                    
                    HabilitarDisparo(1);
                    ActivarJugador2(false);
                    ITiempo = ITiempo - 1;
                }else {
                    BTurno1 = false;
                    BTurno2 = true;
                    JLTurno1.setText("");
                    JLTurno2.setText("");
                    
                    JBAmetralladora1.setEnabled(false);
                    JBMisil1.setEnabled(false);
                    JBBombaNuclear1.setEnabled(false);
                    
                    JBAmetralladora2.setEnabled(false);
                    JBMisil2.setEnabled(false);
                    JBBombaNuclear2.setEnabled(false);
                    
                    ActivarJugador1(false);
                    ActivarJugador2(false);

                    BAmetralladora1 = false;
                    BMisil1 = false;
                    BBombaNuclear1 = false;
                    
                    BAmetralladora2 = false;
                    BMisil2 = false;
                    BBombaNuclear2 = false;
                    
                    ITiempo = 60;
                }
            }
            
            if (BTurno2){
                if (ITiempo > 0){
                    JLTurno2.setText(ITiempo + "");
                    JLTurno1.setText("");
                    if(ClsGlobal.Ametralladora2 > 0){
                        JBAmetralladora2.setEnabled(true);
                    }else {
                        JBAmetralladora2.setEnabled(false);
                    }
                    if(ClsGlobal.Misil2 > 0){
                        JBMisil2.setEnabled(true);
                    }else {
                        JBMisil2.setEnabled(false);
                    }
                    if(ClsGlobal.BombaNuclear2 > 0){
                        JBBombaNuclear2.setEnabled(true);
                    }else{
                        JBBombaNuclear2.setEnabled(false);
                    }

                    JBAmetralladora1.setEnabled(false);
                    JBMisil1.setEnabled(false);
                    JBBombaNuclear1.setEnabled(false);
                    
                    HabilitarDisparo(2);
                    ActivarJugador1(false);
                    ITiempo = ITiempo - 1;
                }else {
                    BTurno2 = false;
                    BTurno1 = true;
                    JLTurno1.setText("");
                    JLTurno2.setText("");
                    
                    JBAmetralladora1.setEnabled(false);
                    JBMisil1.setEnabled(false);
                    JBBombaNuclear1.setEnabled(false);
                    
                    JBAmetralladora2.setEnabled(false);
                    JBMisil2.setEnabled(false);
                    JBBombaNuclear2.setEnabled(false);
                    
                    ActivarJugador1(false);
                    ActivarJugador2(false);

                    BAmetralladora1 = false;
                    BMisil1 = false;
                    BBombaNuclear1 = false;
                    
                    BAmetralladora2 = false;
                    BMisil2 = false;
                    BBombaNuclear2 = false;
                    
                    ITiempo = 60;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }

    private void HabilitarDisparo(int Juagador) {
        if(Juagador == 1){
           if(ClsGlobal.Matriz1[0][0] == 1 ||
              ClsGlobal.Matriz1[0][0] == 121 ||
              ClsGlobal.Matriz1[0][0] == 122 ||
              ClsGlobal.Matriz1[0][0] == 123 ||
              ClsGlobal.Matriz1[0][0] == 124 ||
              ClsGlobal.Matriz1[0][0] == 131 ||
              ClsGlobal.Matriz1[0][0] == 132 ||
              ClsGlobal.Matriz1[0][0] == 133 ||
              ClsGlobal.Matriz1[0][0] == 134 ||
              ClsGlobal.Matriz1[0][0] == 221 ||
              ClsGlobal.Matriz1[0][0] == 222 ||
              ClsGlobal.Matriz1[0][0] == 223 ||
              ClsGlobal.Matriz1[0][0] == 231 ||
              ClsGlobal.Matriz1[0][0] == 232 ||
              ClsGlobal.Matriz1[0][0] == 233 ||
              ClsGlobal.Matriz1[0][0] == 321 ||
              ClsGlobal.Matriz1[0][0] == 322 ||
              ClsGlobal.Matriz1[0][0] == 331 ||
              ClsGlobal.Matriz1[0][0] == 332){
                JBA1_1.setEnabled(false);
           }else{
                JBA1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][1] == 1 ||
              ClsGlobal.Matriz1[0][1] == 121 ||
              ClsGlobal.Matriz1[0][1] == 122 ||
              ClsGlobal.Matriz1[0][1] == 123 ||
              ClsGlobal.Matriz1[0][1] == 124 ||
              ClsGlobal.Matriz1[0][1] == 131 ||
              ClsGlobal.Matriz1[0][1] == 132 ||
              ClsGlobal.Matriz1[0][1] == 133 ||
              ClsGlobal.Matriz1[0][1] == 134 ||
              ClsGlobal.Matriz1[0][1] == 221 ||
              ClsGlobal.Matriz1[0][1] == 222 ||
              ClsGlobal.Matriz1[0][1] == 223 ||
              ClsGlobal.Matriz1[0][1] == 231 ||
              ClsGlobal.Matriz1[0][1] == 232 ||
              ClsGlobal.Matriz1[0][1] == 233 ||
              ClsGlobal.Matriz1[0][1] == 321 ||
              ClsGlobal.Matriz1[0][1] == 322 ||
              ClsGlobal.Matriz1[0][1] == 331 ||
              ClsGlobal.Matriz1[0][1] == 332){
                JBA2_1.setEnabled(false);
           }else{
                JBA2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][2] == 1 ||
              ClsGlobal.Matriz1[0][2] == 121 ||
              ClsGlobal.Matriz1[0][2] == 122 ||
              ClsGlobal.Matriz1[0][2] == 123 ||
              ClsGlobal.Matriz1[0][2] == 124 ||
              ClsGlobal.Matriz1[0][2] == 131 ||
              ClsGlobal.Matriz1[0][2] == 132 ||
              ClsGlobal.Matriz1[0][2] == 133 ||
              ClsGlobal.Matriz1[0][2] == 134 ||
              ClsGlobal.Matriz1[0][2] == 221 ||
              ClsGlobal.Matriz1[0][2] == 222 ||
              ClsGlobal.Matriz1[0][2] == 223 ||
              ClsGlobal.Matriz1[0][2] == 231 ||
              ClsGlobal.Matriz1[0][2] == 232 ||
              ClsGlobal.Matriz1[0][2] == 233 ||
              ClsGlobal.Matriz1[0][2] == 321 ||
              ClsGlobal.Matriz1[0][2] == 322 ||
              ClsGlobal.Matriz1[0][2] == 331 ||
              ClsGlobal.Matriz1[0][2] == 332){
                JBA3_1.setEnabled(false);
           }else{
                JBA3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][3] == 1 ||
              ClsGlobal.Matriz1[0][3] == 121 ||
              ClsGlobal.Matriz1[0][3] == 122 ||
              ClsGlobal.Matriz1[0][3] == 123 ||
              ClsGlobal.Matriz1[0][3] == 124 ||
              ClsGlobal.Matriz1[0][3] == 131 ||
              ClsGlobal.Matriz1[0][3] == 132 ||
              ClsGlobal.Matriz1[0][3] == 133 ||
              ClsGlobal.Matriz1[0][3] == 134 ||
              ClsGlobal.Matriz1[0][3] == 221 ||
              ClsGlobal.Matriz1[0][3] == 222 ||
              ClsGlobal.Matriz1[0][3] == 223 ||
              ClsGlobal.Matriz1[0][3] == 231 ||
              ClsGlobal.Matriz1[0][3] == 232 ||
              ClsGlobal.Matriz1[0][3] == 233 ||
              ClsGlobal.Matriz1[0][3] == 321 ||
              ClsGlobal.Matriz1[0][3] == 322 ||
              ClsGlobal.Matriz1[0][3] == 331 ||
              ClsGlobal.Matriz1[0][3] == 332){
                JBA4_1.setEnabled(false);
           }else{
                JBA4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][4] == 1 ||
              ClsGlobal.Matriz1[0][4] == 121 ||
              ClsGlobal.Matriz1[0][4] == 122 ||
              ClsGlobal.Matriz1[0][4] == 123 ||
              ClsGlobal.Matriz1[0][4] == 124 ||
              ClsGlobal.Matriz1[0][4] == 131 ||
              ClsGlobal.Matriz1[0][4] == 132 ||
              ClsGlobal.Matriz1[0][4] == 133 ||
              ClsGlobal.Matriz1[0][4] == 134 ||
              ClsGlobal.Matriz1[0][4] == 221 ||
              ClsGlobal.Matriz1[0][4] == 222 ||
              ClsGlobal.Matriz1[0][4] == 223 ||
              ClsGlobal.Matriz1[0][4] == 231 ||
              ClsGlobal.Matriz1[0][4] == 232 ||
              ClsGlobal.Matriz1[0][4] == 233 ||
              ClsGlobal.Matriz1[0][4] == 321 ||
              ClsGlobal.Matriz1[0][4] == 322 ||
              ClsGlobal.Matriz1[0][4] == 331 ||
              ClsGlobal.Matriz1[0][4] == 332){
                JBA5_1.setEnabled(false);
           }else{
                JBA5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][5] == 1 ||
              ClsGlobal.Matriz1[0][5] == 121 ||
              ClsGlobal.Matriz1[0][5] == 122 ||
              ClsGlobal.Matriz1[0][5] == 123 ||
              ClsGlobal.Matriz1[0][5] == 124 ||
              ClsGlobal.Matriz1[0][5] == 131 ||
              ClsGlobal.Matriz1[0][5] == 132 ||
              ClsGlobal.Matriz1[0][5] == 133 ||
              ClsGlobal.Matriz1[0][5] == 134 ||
              ClsGlobal.Matriz1[0][5] == 221 ||
              ClsGlobal.Matriz1[0][5] == 222 ||
              ClsGlobal.Matriz1[0][5] == 223 ||
              ClsGlobal.Matriz1[0][5] == 231 ||
              ClsGlobal.Matriz1[0][5] == 232 ||
              ClsGlobal.Matriz1[0][5] == 233 ||
              ClsGlobal.Matriz1[0][5] == 321 ||
              ClsGlobal.Matriz1[0][5] == 322 ||
              ClsGlobal.Matriz1[0][5] == 331 ||
              ClsGlobal.Matriz1[0][5] == 332){
                JBA6_1.setEnabled(false);
           }else{
                JBA6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][6] == 1 ||
              ClsGlobal.Matriz1[0][6] == 121 ||
              ClsGlobal.Matriz1[0][6] == 122 ||
              ClsGlobal.Matriz1[0][6] == 123 ||
              ClsGlobal.Matriz1[0][6] == 124 ||
              ClsGlobal.Matriz1[0][6] == 131 ||
              ClsGlobal.Matriz1[0][6] == 132 ||
              ClsGlobal.Matriz1[0][6] == 133 ||
              ClsGlobal.Matriz1[0][6] == 134 ||
              ClsGlobal.Matriz1[0][6] == 221 ||
              ClsGlobal.Matriz1[0][6] == 222 ||
              ClsGlobal.Matriz1[0][6] == 223 ||
              ClsGlobal.Matriz1[0][6] == 231 ||
              ClsGlobal.Matriz1[0][6] == 232 ||
              ClsGlobal.Matriz1[0][6] == 233 ||
              ClsGlobal.Matriz1[0][6] == 321 ||
              ClsGlobal.Matriz1[0][6] == 322 ||
              ClsGlobal.Matriz1[0][6] == 331 ||
              ClsGlobal.Matriz1[0][6] == 332){
                JBA7_1.setEnabled(false);
           }else{
                JBA7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][7] == 1 ||
              ClsGlobal.Matriz1[0][7] == 121 ||
              ClsGlobal.Matriz1[0][7] == 122 ||
              ClsGlobal.Matriz1[0][7] == 123 ||
              ClsGlobal.Matriz1[0][7] == 124 ||
              ClsGlobal.Matriz1[0][7] == 131 ||
              ClsGlobal.Matriz1[0][7] == 132 ||
              ClsGlobal.Matriz1[0][7] == 133 ||
              ClsGlobal.Matriz1[0][7] == 134 ||
              ClsGlobal.Matriz1[0][7] == 221 ||
              ClsGlobal.Matriz1[0][7] == 222 ||
              ClsGlobal.Matriz1[0][7] == 223 ||
              ClsGlobal.Matriz1[0][7] == 231 ||
              ClsGlobal.Matriz1[0][7] == 232 ||
              ClsGlobal.Matriz1[0][7] == 233 ||
              ClsGlobal.Matriz1[0][7] == 321 ||
              ClsGlobal.Matriz1[0][7] == 322 ||
              ClsGlobal.Matriz1[0][7] == 331 ||
              ClsGlobal.Matriz1[0][7] == 332){
                JBA8_1.setEnabled(false);
           }else{
                JBA8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][8] == 1 ||
              ClsGlobal.Matriz1[0][8] == 121 ||
              ClsGlobal.Matriz1[0][8] == 122 ||
              ClsGlobal.Matriz1[0][8] == 123 ||
              ClsGlobal.Matriz1[0][8] == 124 ||
              ClsGlobal.Matriz1[0][8] == 131 ||
              ClsGlobal.Matriz1[0][8] == 132 ||
              ClsGlobal.Matriz1[0][8] == 133 ||
              ClsGlobal.Matriz1[0][8] == 134 ||
              ClsGlobal.Matriz1[0][8] == 221 ||
              ClsGlobal.Matriz1[0][8] == 222 ||
              ClsGlobal.Matriz1[0][8] == 223 ||
              ClsGlobal.Matriz1[0][8] == 231 ||
              ClsGlobal.Matriz1[0][8] == 232 ||
              ClsGlobal.Matriz1[0][8] == 233 ||
              ClsGlobal.Matriz1[0][8] == 321 ||
              ClsGlobal.Matriz1[0][8] == 322 ||
              ClsGlobal.Matriz1[0][8] == 331 ||
              ClsGlobal.Matriz1[0][8] == 332){
                JBA9_1.setEnabled(false);
           }else{
                JBA9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[0][9] == 1 ||
              ClsGlobal.Matriz1[0][9] == 121 ||
              ClsGlobal.Matriz1[0][9] == 122 ||
              ClsGlobal.Matriz1[0][9] == 123 ||
              ClsGlobal.Matriz1[0][9] == 124 ||
              ClsGlobal.Matriz1[0][9] == 131 ||
              ClsGlobal.Matriz1[0][9] == 132 ||
              ClsGlobal.Matriz1[0][9] == 133 ||
              ClsGlobal.Matriz1[0][9] == 134 ||
              ClsGlobal.Matriz1[0][9] == 221 ||
              ClsGlobal.Matriz1[0][9] == 222 ||
              ClsGlobal.Matriz1[0][9] == 223 ||
              ClsGlobal.Matriz1[0][9] == 231 ||
              ClsGlobal.Matriz1[0][9] == 232 ||
              ClsGlobal.Matriz1[0][9] == 233 ||
              ClsGlobal.Matriz1[0][9] == 321 ||
              ClsGlobal.Matriz1[0][9] == 322 ||
              ClsGlobal.Matriz1[0][9] == 331 ||
              ClsGlobal.Matriz1[0][9] == 332){
                JBA10_1.setEnabled(false);
           }else{
                JBA10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][0] == 1 ||
              ClsGlobal.Matriz1[1][0] == 121 ||
              ClsGlobal.Matriz1[1][0] == 122 ||
              ClsGlobal.Matriz1[1][0] == 123 ||
              ClsGlobal.Matriz1[1][0] == 124 ||
              ClsGlobal.Matriz1[1][0] == 131 ||
              ClsGlobal.Matriz1[1][0] == 132 ||
              ClsGlobal.Matriz1[1][0] == 133 ||
              ClsGlobal.Matriz1[1][0] == 134 ||
              ClsGlobal.Matriz1[1][0] == 221 ||
              ClsGlobal.Matriz1[1][0] == 222 ||
              ClsGlobal.Matriz1[1][0] == 223 ||
              ClsGlobal.Matriz1[1][0] == 231 ||
              ClsGlobal.Matriz1[1][0] == 232 ||
              ClsGlobal.Matriz1[1][0] == 233 ||
              ClsGlobal.Matriz1[1][0] == 321 ||
              ClsGlobal.Matriz1[1][0] == 322 ||
              ClsGlobal.Matriz1[1][0] == 331 ||
              ClsGlobal.Matriz1[1][0] == 332){
                JBB1_1.setEnabled(false);
           }else{
                JBB1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][1] == 1 ||
              ClsGlobal.Matriz1[1][1] == 121 ||
              ClsGlobal.Matriz1[1][1] == 122 ||
              ClsGlobal.Matriz1[1][1] == 123 ||
              ClsGlobal.Matriz1[1][1] == 124 ||
              ClsGlobal.Matriz1[1][1] == 131 ||
              ClsGlobal.Matriz1[1][1] == 132 ||
              ClsGlobal.Matriz1[1][1] == 133 ||
              ClsGlobal.Matriz1[1][1] == 134 ||
              ClsGlobal.Matriz1[1][1] == 221 ||
              ClsGlobal.Matriz1[1][1] == 222 ||
              ClsGlobal.Matriz1[1][1] == 223 ||
              ClsGlobal.Matriz1[1][1] == 231 ||
              ClsGlobal.Matriz1[1][1] == 232 ||
              ClsGlobal.Matriz1[1][1] == 233 ||
              ClsGlobal.Matriz1[1][1] == 321 ||
              ClsGlobal.Matriz1[1][1] == 322 ||
              ClsGlobal.Matriz1[1][1] == 331 ||
              ClsGlobal.Matriz1[1][1] == 332){
                JBB2_1.setEnabled(false);
           }else{
                JBB2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][2] == 1 ||
              ClsGlobal.Matriz1[1][2] == 121 ||
              ClsGlobal.Matriz1[1][2] == 122 ||
              ClsGlobal.Matriz1[1][2] == 123 ||
              ClsGlobal.Matriz1[1][2] == 124 ||
              ClsGlobal.Matriz1[1][2] == 131 ||
              ClsGlobal.Matriz1[1][2] == 132 ||
              ClsGlobal.Matriz1[1][2] == 133 ||
              ClsGlobal.Matriz1[1][2] == 134 ||
              ClsGlobal.Matriz1[1][2] == 221 ||
              ClsGlobal.Matriz1[1][2] == 222 ||
              ClsGlobal.Matriz1[1][2] == 223 ||
              ClsGlobal.Matriz1[1][2] == 231 ||
              ClsGlobal.Matriz1[1][2] == 232 ||
              ClsGlobal.Matriz1[1][2] == 233 ||
              ClsGlobal.Matriz1[1][2] == 321 ||
              ClsGlobal.Matriz1[1][2] == 322 ||
              ClsGlobal.Matriz1[1][2] == 331 ||
              ClsGlobal.Matriz1[1][2] == 332){
                JBB3_1.setEnabled(false);
           }else{
                JBB3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][3] == 1 ||
              ClsGlobal.Matriz1[1][3] == 121 ||
              ClsGlobal.Matriz1[1][3] == 122 ||
              ClsGlobal.Matriz1[1][3] == 123 ||
              ClsGlobal.Matriz1[1][3] == 124 ||
              ClsGlobal.Matriz1[1][3] == 131 ||
              ClsGlobal.Matriz1[1][3] == 132 ||
              ClsGlobal.Matriz1[1][3] == 133 ||
              ClsGlobal.Matriz1[1][3] == 134 ||
              ClsGlobal.Matriz1[1][3] == 221 ||
              ClsGlobal.Matriz1[1][3] == 222 ||
              ClsGlobal.Matriz1[1][3] == 223 ||
              ClsGlobal.Matriz1[1][3] == 231 ||
              ClsGlobal.Matriz1[1][3] == 232 ||
              ClsGlobal.Matriz1[1][3] == 233 ||
              ClsGlobal.Matriz1[1][3] == 321 ||
              ClsGlobal.Matriz1[1][3] == 322 ||
              ClsGlobal.Matriz1[1][3] == 331 ||
              ClsGlobal.Matriz1[1][3] == 332){
                JBB4_1.setEnabled(false);
           }else{
                JBB4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][4] == 1 ||
              ClsGlobal.Matriz1[1][4] == 121 ||
              ClsGlobal.Matriz1[1][4] == 122 ||
              ClsGlobal.Matriz1[1][4] == 123 ||
              ClsGlobal.Matriz1[1][4] == 124 ||
              ClsGlobal.Matriz1[1][4] == 131 ||
              ClsGlobal.Matriz1[1][4] == 132 ||
              ClsGlobal.Matriz1[1][4] == 133 ||
              ClsGlobal.Matriz1[1][4] == 134 ||
              ClsGlobal.Matriz1[1][4] == 221 ||
              ClsGlobal.Matriz1[1][4] == 222 ||
              ClsGlobal.Matriz1[1][4] == 223 ||
              ClsGlobal.Matriz1[1][4] == 231 ||
              ClsGlobal.Matriz1[1][4] == 232 ||
              ClsGlobal.Matriz1[1][4] == 233 ||
              ClsGlobal.Matriz1[1][4] == 321 ||
              ClsGlobal.Matriz1[1][4] == 322 ||
              ClsGlobal.Matriz1[1][4] == 331 ||
              ClsGlobal.Matriz1[1][4] == 332){
                JBB5_1.setEnabled(false);
           }else{
                JBB5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][5] == 1 ||
              ClsGlobal.Matriz1[1][5] == 121 ||
              ClsGlobal.Matriz1[1][5] == 122 ||
              ClsGlobal.Matriz1[1][5] == 123 ||
              ClsGlobal.Matriz1[1][5] == 124 ||
              ClsGlobal.Matriz1[1][5] == 131 ||
              ClsGlobal.Matriz1[1][5] == 132 ||
              ClsGlobal.Matriz1[1][5] == 133 ||
              ClsGlobal.Matriz1[1][5] == 134 ||
              ClsGlobal.Matriz1[1][5] == 221 ||
              ClsGlobal.Matriz1[1][5] == 222 ||
              ClsGlobal.Matriz1[1][5] == 223 ||
              ClsGlobal.Matriz1[1][5] == 231 ||
              ClsGlobal.Matriz1[1][5] == 232 ||
              ClsGlobal.Matriz1[1][5] == 233 ||
              ClsGlobal.Matriz1[1][5] == 321 ||
              ClsGlobal.Matriz1[1][5] == 322 ||
              ClsGlobal.Matriz1[1][5] == 331 ||
              ClsGlobal.Matriz1[1][5] == 332){
                JBB6_1.setEnabled(false);
           }else{
                JBB6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][6] == 1 ||
              ClsGlobal.Matriz1[1][6] == 121 ||
              ClsGlobal.Matriz1[1][6] == 122 ||
              ClsGlobal.Matriz1[1][6] == 123 ||
              ClsGlobal.Matriz1[1][6] == 124 ||
              ClsGlobal.Matriz1[1][6] == 131 ||
              ClsGlobal.Matriz1[1][6] == 132 ||
              ClsGlobal.Matriz1[1][6] == 133 ||
              ClsGlobal.Matriz1[1][6] == 134 ||
              ClsGlobal.Matriz1[1][6] == 221 ||
              ClsGlobal.Matriz1[1][6] == 222 ||
              ClsGlobal.Matriz1[1][6] == 223 ||
              ClsGlobal.Matriz1[1][6] == 231 ||
              ClsGlobal.Matriz1[1][6] == 232 ||
              ClsGlobal.Matriz1[1][6] == 233 ||
              ClsGlobal.Matriz1[1][6] == 321 ||
              ClsGlobal.Matriz1[1][6] == 322 ||
              ClsGlobal.Matriz1[1][6] == 331 ||
              ClsGlobal.Matriz1[1][6] == 332){
                JBB7_1.setEnabled(false);
           }else{
                JBB7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][7] == 1 ||
              ClsGlobal.Matriz1[1][7] == 121 ||
              ClsGlobal.Matriz1[1][7] == 122 ||
              ClsGlobal.Matriz1[1][7] == 123 ||
              ClsGlobal.Matriz1[1][7] == 124 ||
              ClsGlobal.Matriz1[1][7] == 131 ||
              ClsGlobal.Matriz1[1][7] == 132 ||
              ClsGlobal.Matriz1[1][7] == 133 ||
              ClsGlobal.Matriz1[1][7] == 134 ||
              ClsGlobal.Matriz1[1][7] == 221 ||
              ClsGlobal.Matriz1[1][7] == 222 ||
              ClsGlobal.Matriz1[1][7] == 223 ||
              ClsGlobal.Matriz1[1][7] == 231 ||
              ClsGlobal.Matriz1[1][7] == 232 ||
              ClsGlobal.Matriz1[1][7] == 233 ||
              ClsGlobal.Matriz1[1][7] == 321 ||
              ClsGlobal.Matriz1[1][7] == 322 ||
              ClsGlobal.Matriz1[1][7] == 331 ||
              ClsGlobal.Matriz1[1][7] == 332){
                JBB8_1.setEnabled(false);
           }else{
                JBB8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][8] == 1 ||
              ClsGlobal.Matriz1[1][8] == 121 ||
              ClsGlobal.Matriz1[1][8] == 122 ||
              ClsGlobal.Matriz1[1][8] == 123 ||
              ClsGlobal.Matriz1[1][8] == 124 ||
              ClsGlobal.Matriz1[1][8] == 131 ||
              ClsGlobal.Matriz1[1][8] == 132 ||
              ClsGlobal.Matriz1[1][8] == 133 ||
              ClsGlobal.Matriz1[1][8] == 134 ||
              ClsGlobal.Matriz1[1][8] == 221 ||
              ClsGlobal.Matriz1[1][8] == 222 ||
              ClsGlobal.Matriz1[1][8] == 223 ||
              ClsGlobal.Matriz1[1][8] == 231 ||
              ClsGlobal.Matriz1[1][8] == 232 ||
              ClsGlobal.Matriz1[1][8] == 233 ||
              ClsGlobal.Matriz1[1][8] == 321 ||
              ClsGlobal.Matriz1[1][8] == 322 ||
              ClsGlobal.Matriz1[1][8] == 331 ||
              ClsGlobal.Matriz1[1][8] == 332){
                JBB9_1.setEnabled(false);
           }else{
                JBB9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[1][9] == 1 ||
              ClsGlobal.Matriz1[1][9] == 121 ||
              ClsGlobal.Matriz1[1][9] == 122 ||
              ClsGlobal.Matriz1[1][9] == 123 ||
              ClsGlobal.Matriz1[1][9] == 124 ||
              ClsGlobal.Matriz1[1][9] == 131 ||
              ClsGlobal.Matriz1[1][9] == 132 ||
              ClsGlobal.Matriz1[1][9] == 133 ||
              ClsGlobal.Matriz1[1][9] == 134 ||
              ClsGlobal.Matriz1[1][9] == 221 ||
              ClsGlobal.Matriz1[1][9] == 222 ||
              ClsGlobal.Matriz1[1][9] == 223 ||
              ClsGlobal.Matriz1[1][9] == 231 ||
              ClsGlobal.Matriz1[1][9] == 232 ||
              ClsGlobal.Matriz1[1][9] == 233 ||
              ClsGlobal.Matriz1[1][9] == 321 ||
              ClsGlobal.Matriz1[1][9] == 322 ||
              ClsGlobal.Matriz1[1][9] == 331 ||
              ClsGlobal.Matriz1[1][9] == 332){
                JBB10_1.setEnabled(false);
           }else{
                JBB10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][0] == 1 ||
              ClsGlobal.Matriz1[2][0] == 121 ||
              ClsGlobal.Matriz1[2][0] == 122 ||
              ClsGlobal.Matriz1[2][0] == 123 ||
              ClsGlobal.Matriz1[2][0] == 124 ||
              ClsGlobal.Matriz1[2][0] == 131 ||
              ClsGlobal.Matriz1[2][0] == 132 ||
              ClsGlobal.Matriz1[2][0] == 133 ||
              ClsGlobal.Matriz1[2][0] == 134 ||
              ClsGlobal.Matriz1[2][0] == 221 ||
              ClsGlobal.Matriz1[2][0] == 222 ||
              ClsGlobal.Matriz1[2][0] == 223 ||
              ClsGlobal.Matriz1[2][0] == 231 ||
              ClsGlobal.Matriz1[2][0] == 232 ||
              ClsGlobal.Matriz1[2][0] == 233 ||
              ClsGlobal.Matriz1[2][0] == 321 ||
              ClsGlobal.Matriz1[2][0] == 322 ||
              ClsGlobal.Matriz1[2][0] == 331 ||
              ClsGlobal.Matriz1[2][0] == 332){
                JBC1_1.setEnabled(false);
           }else{
                JBC1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][1] == 1 ||
              ClsGlobal.Matriz1[2][1] == 121 ||
              ClsGlobal.Matriz1[2][1] == 122 ||
              ClsGlobal.Matriz1[2][1] == 123 ||
              ClsGlobal.Matriz1[2][1] == 124 ||
              ClsGlobal.Matriz1[2][1] == 131 ||
              ClsGlobal.Matriz1[2][1] == 132 ||
              ClsGlobal.Matriz1[2][1] == 133 ||
              ClsGlobal.Matriz1[2][1] == 134 ||
              ClsGlobal.Matriz1[2][1] == 221 ||
              ClsGlobal.Matriz1[2][1] == 222 ||
              ClsGlobal.Matriz1[2][1] == 223 ||
              ClsGlobal.Matriz1[2][1] == 231 ||
              ClsGlobal.Matriz1[2][1] == 232 ||
              ClsGlobal.Matriz1[2][1] == 233 ||
              ClsGlobal.Matriz1[2][1] == 321 ||
              ClsGlobal.Matriz1[2][1] == 322 ||
              ClsGlobal.Matriz1[2][1] == 331 ||
              ClsGlobal.Matriz1[2][1] == 332){
                JBC2_1.setEnabled(false);
           }else{
                JBC2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][2] == 1 ||
              ClsGlobal.Matriz1[2][2] == 121 ||
              ClsGlobal.Matriz1[2][2] == 122 ||
              ClsGlobal.Matriz1[2][2] == 123 ||
              ClsGlobal.Matriz1[2][2] == 124 ||
              ClsGlobal.Matriz1[2][2] == 131 ||
              ClsGlobal.Matriz1[2][2] == 132 ||
              ClsGlobal.Matriz1[2][2] == 133 ||
              ClsGlobal.Matriz1[2][2] == 134 ||
              ClsGlobal.Matriz1[2][2] == 221 ||
              ClsGlobal.Matriz1[2][2] == 222 ||
              ClsGlobal.Matriz1[2][2] == 223 ||
              ClsGlobal.Matriz1[2][2] == 231 ||
              ClsGlobal.Matriz1[2][2] == 232 ||
              ClsGlobal.Matriz1[2][2] == 233 ||
              ClsGlobal.Matriz1[2][2] == 321 ||
              ClsGlobal.Matriz1[2][2] == 322 ||
              ClsGlobal.Matriz1[2][2] == 331 ||
              ClsGlobal.Matriz1[2][2] == 332){
                JBC3_1.setEnabled(false);
           }else{
                JBC3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][3] == 1 ||
              ClsGlobal.Matriz1[2][3] == 121 ||
              ClsGlobal.Matriz1[2][3] == 122 ||
              ClsGlobal.Matriz1[2][3] == 123 ||
              ClsGlobal.Matriz1[2][3] == 124 ||
              ClsGlobal.Matriz1[2][3] == 131 ||
              ClsGlobal.Matriz1[2][3] == 132 ||
              ClsGlobal.Matriz1[2][3] == 133 ||
              ClsGlobal.Matriz1[2][3] == 134 ||
              ClsGlobal.Matriz1[2][3] == 221 ||
              ClsGlobal.Matriz1[2][3] == 222 ||
              ClsGlobal.Matriz1[2][3] == 223 ||
              ClsGlobal.Matriz1[2][3] == 231 ||
              ClsGlobal.Matriz1[2][3] == 232 ||
              ClsGlobal.Matriz1[2][3] == 233 ||
              ClsGlobal.Matriz1[2][3] == 321 ||
              ClsGlobal.Matriz1[2][3] == 322 ||
              ClsGlobal.Matriz1[2][3] == 331 ||
              ClsGlobal.Matriz1[2][3] == 332){
                JBC4_1.setEnabled(false);
           }else{
                JBC4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][4] == 1 ||
              ClsGlobal.Matriz1[2][4] == 121 ||
              ClsGlobal.Matriz1[2][4] == 122 ||
              ClsGlobal.Matriz1[2][4] == 123 ||
              ClsGlobal.Matriz1[2][4] == 124 ||
              ClsGlobal.Matriz1[2][4] == 131 ||
              ClsGlobal.Matriz1[2][4] == 132 ||
              ClsGlobal.Matriz1[2][4] == 133 ||
              ClsGlobal.Matriz1[2][4] == 134 ||
              ClsGlobal.Matriz1[2][4] == 221 ||
              ClsGlobal.Matriz1[2][4] == 222 ||
              ClsGlobal.Matriz1[2][4] == 223 ||
              ClsGlobal.Matriz1[2][4] == 231 ||
              ClsGlobal.Matriz1[2][4] == 232 ||
              ClsGlobal.Matriz1[2][4] == 233 ||
              ClsGlobal.Matriz1[2][4] == 321 ||
              ClsGlobal.Matriz1[2][4] == 322 ||
              ClsGlobal.Matriz1[2][4] == 331 ||
              ClsGlobal.Matriz1[2][4] == 332){
                JBC5_1.setEnabled(false);
           }else{
                JBC5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][5] == 1 ||
              ClsGlobal.Matriz1[2][5] == 121 ||
              ClsGlobal.Matriz1[2][5] == 122 ||
              ClsGlobal.Matriz1[2][5] == 123 ||
              ClsGlobal.Matriz1[2][5] == 124 ||
              ClsGlobal.Matriz1[2][5] == 131 ||
              ClsGlobal.Matriz1[2][5] == 132 ||
              ClsGlobal.Matriz1[2][5] == 133 ||
              ClsGlobal.Matriz1[2][5] == 134 ||
              ClsGlobal.Matriz1[2][5] == 221 ||
              ClsGlobal.Matriz1[2][5] == 222 ||
              ClsGlobal.Matriz1[2][5] == 223 ||
              ClsGlobal.Matriz1[2][5] == 231 ||
              ClsGlobal.Matriz1[2][5] == 232 ||
              ClsGlobal.Matriz1[2][5] == 233 ||
              ClsGlobal.Matriz1[2][5] == 321 ||
              ClsGlobal.Matriz1[2][5] == 322 ||
              ClsGlobal.Matriz1[2][5] == 331 ||
              ClsGlobal.Matriz1[2][5] == 332){
                JBC6_1.setEnabled(false);
           }else{
                JBC6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][6] == 1 ||
              ClsGlobal.Matriz1[2][6] == 121 ||
              ClsGlobal.Matriz1[2][6] == 122 ||
              ClsGlobal.Matriz1[2][6] == 123 ||
              ClsGlobal.Matriz1[2][6] == 124 ||
              ClsGlobal.Matriz1[2][6] == 131 ||
              ClsGlobal.Matriz1[2][6] == 132 ||
              ClsGlobal.Matriz1[2][6] == 133 ||
              ClsGlobal.Matriz1[2][6] == 134 ||
              ClsGlobal.Matriz1[2][6] == 221 ||
              ClsGlobal.Matriz1[2][6] == 222 ||
              ClsGlobal.Matriz1[2][6] == 223 ||
              ClsGlobal.Matriz1[2][6] == 231 ||
              ClsGlobal.Matriz1[2][6] == 232 ||
              ClsGlobal.Matriz1[2][6] == 233 ||
              ClsGlobal.Matriz1[2][6] == 321 ||
              ClsGlobal.Matriz1[2][6] == 322 ||
              ClsGlobal.Matriz1[2][6] == 331 ||
              ClsGlobal.Matriz1[2][6] == 332){
                JBC7_1.setEnabled(false);
           }else{
                JBC7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][7] == 1 ||
              ClsGlobal.Matriz1[2][7] == 121 ||
              ClsGlobal.Matriz1[2][7] == 122 ||
              ClsGlobal.Matriz1[2][7] == 123 ||
              ClsGlobal.Matriz1[2][7] == 124 ||
              ClsGlobal.Matriz1[2][7] == 131 ||
              ClsGlobal.Matriz1[2][7] == 132 ||
              ClsGlobal.Matriz1[2][7] == 133 ||
              ClsGlobal.Matriz1[2][7] == 134 ||
              ClsGlobal.Matriz1[2][7] == 221 ||
              ClsGlobal.Matriz1[2][7] == 222 ||
              ClsGlobal.Matriz1[2][7] == 223 ||
              ClsGlobal.Matriz1[2][7] == 231 ||
              ClsGlobal.Matriz1[2][7] == 232 ||
              ClsGlobal.Matriz1[2][7] == 233 ||
              ClsGlobal.Matriz1[2][7] == 321 ||
              ClsGlobal.Matriz1[2][7] == 322 ||
              ClsGlobal.Matriz1[2][7] == 331 ||
              ClsGlobal.Matriz1[2][7] == 332){
                JBC8_1.setEnabled(false);
           }else{
                JBC8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][8] == 1 ||
              ClsGlobal.Matriz1[2][8] == 121 ||
              ClsGlobal.Matriz1[2][8] == 122 ||
              ClsGlobal.Matriz1[2][8] == 123 ||
              ClsGlobal.Matriz1[2][8] == 124 ||
              ClsGlobal.Matriz1[2][8] == 131 ||
              ClsGlobal.Matriz1[2][8] == 132 ||
              ClsGlobal.Matriz1[2][8] == 133 ||
              ClsGlobal.Matriz1[2][8] == 134 ||
              ClsGlobal.Matriz1[2][8] == 221 ||
              ClsGlobal.Matriz1[2][8] == 222 ||
              ClsGlobal.Matriz1[2][8] == 223 ||
              ClsGlobal.Matriz1[2][8] == 231 ||
              ClsGlobal.Matriz1[2][8] == 232 ||
              ClsGlobal.Matriz1[2][8] == 233 ||
              ClsGlobal.Matriz1[2][8] == 321 ||
              ClsGlobal.Matriz1[2][8] == 322 ||
              ClsGlobal.Matriz1[2][8] == 331 ||
              ClsGlobal.Matriz1[2][8] == 332){
                JBC9_1.setEnabled(false);
           }else{
                JBC9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[2][9] == 1 ||
              ClsGlobal.Matriz1[2][9] == 121 ||
              ClsGlobal.Matriz1[2][9] == 122 ||
              ClsGlobal.Matriz1[2][9] == 123 ||
              ClsGlobal.Matriz1[2][9] == 124 ||
              ClsGlobal.Matriz1[2][9] == 131 ||
              ClsGlobal.Matriz1[2][9] == 132 ||
              ClsGlobal.Matriz1[2][9] == 133 ||
              ClsGlobal.Matriz1[2][9] == 134 ||
              ClsGlobal.Matriz1[2][9] == 221 ||
              ClsGlobal.Matriz1[2][9] == 222 ||
              ClsGlobal.Matriz1[2][9] == 223 ||
              ClsGlobal.Matriz1[2][9] == 231 ||
              ClsGlobal.Matriz1[2][9] == 232 ||
              ClsGlobal.Matriz1[2][9] == 233 ||
              ClsGlobal.Matriz1[2][9] == 321 ||
              ClsGlobal.Matriz1[2][9] == 322 ||
              ClsGlobal.Matriz1[2][9] == 331 ||
              ClsGlobal.Matriz1[2][9] == 332){
                JBC10_1.setEnabled(false);
           }else{
                JBC10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][0] == 1 ||
              ClsGlobal.Matriz1[3][0] == 121 ||
              ClsGlobal.Matriz1[3][0] == 122 ||
              ClsGlobal.Matriz1[3][0] == 123 ||
              ClsGlobal.Matriz1[03][0] == 124 ||
              ClsGlobal.Matriz1[3][0] == 131 ||
              ClsGlobal.Matriz1[3][0] == 132 ||
              ClsGlobal.Matriz1[3][0] == 133 ||
              ClsGlobal.Matriz1[3][0] == 134 ||
              ClsGlobal.Matriz1[3][0] == 221 ||
              ClsGlobal.Matriz1[3][0] == 222 ||
              ClsGlobal.Matriz1[3][0] == 223 ||
              ClsGlobal.Matriz1[3][0] == 231 ||
              ClsGlobal.Matriz1[3][0] == 232 ||
              ClsGlobal.Matriz1[3][0] == 233 ||
              ClsGlobal.Matriz1[3][0] == 321 ||
              ClsGlobal.Matriz1[3][0] == 322 ||
              ClsGlobal.Matriz1[3][0] == 331 ||
              ClsGlobal.Matriz1[3][0] == 332){
                JBD1_1.setEnabled(false);
           }else{
                JBD1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][1] == 1 ||
              ClsGlobal.Matriz1[3][1] == 121 ||
              ClsGlobal.Matriz1[3][1] == 122 ||
              ClsGlobal.Matriz1[3][1] == 123 ||
              ClsGlobal.Matriz1[3][1] == 124 ||
              ClsGlobal.Matriz1[3][1] == 131 ||
              ClsGlobal.Matriz1[3][1] == 132 ||
              ClsGlobal.Matriz1[3][1] == 133 ||
              ClsGlobal.Matriz1[3][1] == 134 ||
              ClsGlobal.Matriz1[3][1] == 221 ||
              ClsGlobal.Matriz1[3][1] == 222 ||
              ClsGlobal.Matriz1[3][1] == 223 ||
              ClsGlobal.Matriz1[3][1] == 231 ||
              ClsGlobal.Matriz1[3][1] == 232 ||
              ClsGlobal.Matriz1[3][1] == 233 ||
              ClsGlobal.Matriz1[3][1] == 321 ||
              ClsGlobal.Matriz1[3][1] == 322 ||
              ClsGlobal.Matriz1[3][1] == 331 ||
              ClsGlobal.Matriz1[3][1] == 332){
                JBD2_1.setEnabled(false);
           }else{
                JBD2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][2] == 1 ||
              ClsGlobal.Matriz1[3][2] == 121 ||
              ClsGlobal.Matriz1[3][2] == 122 ||
              ClsGlobal.Matriz1[3][2] == 123 ||
              ClsGlobal.Matriz1[3][2] == 124 ||
              ClsGlobal.Matriz1[3][2] == 131 ||
              ClsGlobal.Matriz1[3][2] == 132 ||
              ClsGlobal.Matriz1[3][2] == 133 ||
              ClsGlobal.Matriz1[3][2] == 134 ||
              ClsGlobal.Matriz1[3][2] == 221 ||
              ClsGlobal.Matriz1[3][2] == 222 ||
              ClsGlobal.Matriz1[3][2] == 223 ||
              ClsGlobal.Matriz1[3][2] == 231 ||
              ClsGlobal.Matriz1[3][2] == 232 ||
              ClsGlobal.Matriz1[3][2] == 233 ||
              ClsGlobal.Matriz1[3][2] == 321 ||
              ClsGlobal.Matriz1[3][2] == 322 ||
              ClsGlobal.Matriz1[3][2] == 331 ||
              ClsGlobal.Matriz1[3][2] == 332){
                JBD3_1.setEnabled(false);
           }else{
                JBD3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][3] == 1 ||
              ClsGlobal.Matriz1[3][3] == 121 ||
              ClsGlobal.Matriz1[3][3] == 122 ||
              ClsGlobal.Matriz1[3][3] == 123 ||
              ClsGlobal.Matriz1[3][3] == 124 ||
              ClsGlobal.Matriz1[3][3] == 131 ||
              ClsGlobal.Matriz1[3][3] == 132 ||
              ClsGlobal.Matriz1[3][3] == 133 ||
              ClsGlobal.Matriz1[3][3] == 134 ||
              ClsGlobal.Matriz1[3][3] == 221 ||
              ClsGlobal.Matriz1[3][3] == 222 ||
              ClsGlobal.Matriz1[3][3] == 223 ||
              ClsGlobal.Matriz1[3][3] == 231 ||
              ClsGlobal.Matriz1[3][3] == 232 ||
              ClsGlobal.Matriz1[3][3] == 233 ||
              ClsGlobal.Matriz1[3][3] == 321 ||
              ClsGlobal.Matriz1[3][3] == 322 ||
              ClsGlobal.Matriz1[3][3] == 331 ||
              ClsGlobal.Matriz1[3][3] == 332){
                JBD4_1.setEnabled(false);
           }else{
                JBD4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][4] == 1 ||
              ClsGlobal.Matriz1[3][4] == 121 ||
              ClsGlobal.Matriz1[3][4] == 122 ||
              ClsGlobal.Matriz1[3][4] == 123 ||
              ClsGlobal.Matriz1[3][4] == 124 ||
              ClsGlobal.Matriz1[3][4] == 131 ||
              ClsGlobal.Matriz1[3][4] == 132 ||
              ClsGlobal.Matriz1[3][4] == 133 ||
              ClsGlobal.Matriz1[3][4] == 134 ||
              ClsGlobal.Matriz1[3][4] == 221 ||
              ClsGlobal.Matriz1[3][4] == 222 ||
              ClsGlobal.Matriz1[3][4] == 223 ||
              ClsGlobal.Matriz1[3][4] == 231 ||
              ClsGlobal.Matriz1[3][4] == 232 ||
              ClsGlobal.Matriz1[3][4] == 233 ||
              ClsGlobal.Matriz1[3][4] == 321 ||
              ClsGlobal.Matriz1[3][4] == 322 ||
              ClsGlobal.Matriz1[3][4] == 331 ||
              ClsGlobal.Matriz1[3][4] == 332){
                JBD5_1.setEnabled(false);
           }else{
                JBD5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][5] == 1 ||
              ClsGlobal.Matriz1[3][5] == 121 ||
              ClsGlobal.Matriz1[3][5] == 122 ||
              ClsGlobal.Matriz1[3][5] == 123 ||
              ClsGlobal.Matriz1[3][5] == 124 ||
              ClsGlobal.Matriz1[3][5] == 131 ||
              ClsGlobal.Matriz1[3][5] == 132 ||
              ClsGlobal.Matriz1[3][5] == 133 ||
              ClsGlobal.Matriz1[3][5] == 134 ||
              ClsGlobal.Matriz1[3][5] == 221 ||
              ClsGlobal.Matriz1[3][5] == 222 ||
              ClsGlobal.Matriz1[3][5] == 223 ||
              ClsGlobal.Matriz1[3][5] == 231 ||
              ClsGlobal.Matriz1[3][5] == 232 ||
              ClsGlobal.Matriz1[3][5] == 233 ||
              ClsGlobal.Matriz1[3][5] == 321 ||
              ClsGlobal.Matriz1[3][5] == 322 ||
              ClsGlobal.Matriz1[3][5] == 331 ||
              ClsGlobal.Matriz1[3][5] == 332){
                JBD6_1.setEnabled(false);
           }else{
                JBD6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][6] == 1 ||
              ClsGlobal.Matriz1[3][6] == 121 ||
              ClsGlobal.Matriz1[3][6] == 122 ||
              ClsGlobal.Matriz1[3][6] == 123 ||
              ClsGlobal.Matriz1[3][6] == 124 ||
              ClsGlobal.Matriz1[3][6] == 131 ||
              ClsGlobal.Matriz1[3][6] == 132 ||
              ClsGlobal.Matriz1[3][6] == 133 ||
              ClsGlobal.Matriz1[3][6] == 134 ||
              ClsGlobal.Matriz1[3][6] == 221 ||
              ClsGlobal.Matriz1[3][6] == 222 ||
              ClsGlobal.Matriz1[3][6] == 223 ||
              ClsGlobal.Matriz1[3][6] == 231 ||
              ClsGlobal.Matriz1[3][6] == 232 ||
              ClsGlobal.Matriz1[3][6] == 233 ||
              ClsGlobal.Matriz1[3][6] == 321 ||
              ClsGlobal.Matriz1[3][6] == 322 ||
              ClsGlobal.Matriz1[3][6] == 331 ||
              ClsGlobal.Matriz1[3][6] == 332){
                JBD7_1.setEnabled(false);
           }else{
                JBD7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][7] == 1 ||
              ClsGlobal.Matriz1[3][7] == 121 ||
              ClsGlobal.Matriz1[3][7] == 122 ||
              ClsGlobal.Matriz1[3][7] == 123 ||
              ClsGlobal.Matriz1[3][7] == 124 ||
              ClsGlobal.Matriz1[3][7] == 131 ||
              ClsGlobal.Matriz1[3][7] == 132 ||
              ClsGlobal.Matriz1[3][7] == 133 ||
              ClsGlobal.Matriz1[3][7] == 134 ||
              ClsGlobal.Matriz1[3][7] == 221 ||
              ClsGlobal.Matriz1[3][7] == 222 ||
              ClsGlobal.Matriz1[3][7] == 223 ||
              ClsGlobal.Matriz1[3][7] == 231 ||
              ClsGlobal.Matriz1[3][7] == 232 ||
              ClsGlobal.Matriz1[3][7] == 233 ||
              ClsGlobal.Matriz1[3][7] == 321 ||
              ClsGlobal.Matriz1[3][7] == 322 ||
              ClsGlobal.Matriz1[3][7] == 331 ||
              ClsGlobal.Matriz1[3][7] == 332){
                JBD8_1.setEnabled(false);
           }else{
                JBD8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][8] == 1 ||
              ClsGlobal.Matriz1[3][8] == 121 ||
              ClsGlobal.Matriz1[3][8] == 122 ||
              ClsGlobal.Matriz1[3][8] == 123 ||
              ClsGlobal.Matriz1[3][8] == 124 ||
              ClsGlobal.Matriz1[3][8] == 131 ||
              ClsGlobal.Matriz1[3][8] == 132 ||
              ClsGlobal.Matriz1[3][8] == 133 ||
              ClsGlobal.Matriz1[3][8] == 134 ||
              ClsGlobal.Matriz1[3][8] == 221 ||
              ClsGlobal.Matriz1[3][8] == 222 ||
              ClsGlobal.Matriz1[3][8] == 223 ||
              ClsGlobal.Matriz1[3][8] == 231 ||
              ClsGlobal.Matriz1[3][8] == 232 ||
              ClsGlobal.Matriz1[3][8] == 233 ||
              ClsGlobal.Matriz1[3][8] == 321 ||
              ClsGlobal.Matriz1[3][8] == 322 ||
              ClsGlobal.Matriz1[3][8] == 331 ||
              ClsGlobal.Matriz1[3][8] == 332){
                JBD9_1.setEnabled(false);
           }else{
                JBD9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[3][9] == 1 ||
              ClsGlobal.Matriz1[3][9] == 121 ||
              ClsGlobal.Matriz1[3][9] == 122 ||
              ClsGlobal.Matriz1[3][9] == 123 ||
              ClsGlobal.Matriz1[3][9] == 124 ||
              ClsGlobal.Matriz1[3][9] == 131 ||
              ClsGlobal.Matriz1[3][9] == 132 ||
              ClsGlobal.Matriz1[3][9] == 133 ||
              ClsGlobal.Matriz1[3][9] == 134 ||
              ClsGlobal.Matriz1[3][9] == 221 ||
              ClsGlobal.Matriz1[3][9] == 222 ||
              ClsGlobal.Matriz1[3][9] == 223 ||
              ClsGlobal.Matriz1[3][9] == 231 ||
              ClsGlobal.Matriz1[3][9] == 232 ||
              ClsGlobal.Matriz1[3][9] == 233 ||
              ClsGlobal.Matriz1[3][9] == 321 ||
              ClsGlobal.Matriz1[3][9] == 322 ||
              ClsGlobal.Matriz1[3][9] == 331 ||
              ClsGlobal.Matriz1[3][9] == 332){
                JBD10_1.setEnabled(false);
           }else{
                JBD10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][0] == 1 ||
              ClsGlobal.Matriz1[4][0] == 121 ||
              ClsGlobal.Matriz1[4][0] == 122 ||
              ClsGlobal.Matriz1[4][0] == 123 ||
              ClsGlobal.Matriz1[4][0] == 124 ||
              ClsGlobal.Matriz1[4][0] == 131 ||
              ClsGlobal.Matriz1[4][0] == 132 ||
              ClsGlobal.Matriz1[4][0] == 133 ||
              ClsGlobal.Matriz1[4][0] == 134 ||
              ClsGlobal.Matriz1[4][0] == 221 ||
              ClsGlobal.Matriz1[4][0] == 222 ||
              ClsGlobal.Matriz1[4][0] == 223 ||
              ClsGlobal.Matriz1[4][0] == 231 ||
              ClsGlobal.Matriz1[4][0] == 232 ||
              ClsGlobal.Matriz1[4][0] == 233 ||
              ClsGlobal.Matriz1[4][0] == 321 ||
              ClsGlobal.Matriz1[4][0] == 322 ||
              ClsGlobal.Matriz1[4][0] == 331 ||
              ClsGlobal.Matriz1[4][0] == 332){
                JBE1_1.setEnabled(false);
           }else{
                JBE1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][1] == 1 ||
              ClsGlobal.Matriz1[4][1] == 121 ||
              ClsGlobal.Matriz1[4][1] == 122 ||
              ClsGlobal.Matriz1[4][1] == 123 ||
              ClsGlobal.Matriz1[4][1] == 124 ||
              ClsGlobal.Matriz1[4][1] == 131 ||
              ClsGlobal.Matriz1[4][1] == 132 ||
              ClsGlobal.Matriz1[4][1] == 133 ||
              ClsGlobal.Matriz1[4][1] == 134 ||
              ClsGlobal.Matriz1[4][1] == 221 ||
              ClsGlobal.Matriz1[4][1] == 222 ||
              ClsGlobal.Matriz1[4][1] == 223 ||
              ClsGlobal.Matriz1[4][1] == 231 ||
              ClsGlobal.Matriz1[4][1] == 232 ||
              ClsGlobal.Matriz1[4][1] == 233 ||
              ClsGlobal.Matriz1[4][1] == 321 ||
              ClsGlobal.Matriz1[4][1] == 322 ||
              ClsGlobal.Matriz1[4][1] == 331 ||
              ClsGlobal.Matriz1[4][1] == 332){
                JBE2_1.setEnabled(false);
           }else{
                JBE2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][2] == 1 ||
              ClsGlobal.Matriz1[4][2] == 121 ||
              ClsGlobal.Matriz1[4][2] == 122 ||
              ClsGlobal.Matriz1[4][2] == 123 ||
              ClsGlobal.Matriz1[4][2] == 124 ||
              ClsGlobal.Matriz1[4][2] == 131 ||
              ClsGlobal.Matriz1[4][2] == 132 ||
              ClsGlobal.Matriz1[4][2] == 133 ||
              ClsGlobal.Matriz1[4][2] == 134 ||
              ClsGlobal.Matriz1[4][2] == 221 ||
              ClsGlobal.Matriz1[4][2] == 222 ||
              ClsGlobal.Matriz1[4][2] == 223 ||
              ClsGlobal.Matriz1[4][2] == 231 ||
              ClsGlobal.Matriz1[4][2] == 232 ||
              ClsGlobal.Matriz1[4][2] == 233 ||
              ClsGlobal.Matriz1[4][2] == 321 ||
              ClsGlobal.Matriz1[4][2] == 322 ||
              ClsGlobal.Matriz1[4][2] == 331 ||
              ClsGlobal.Matriz1[4][2] == 332){
                JBE3_1.setEnabled(false);
           }else{
                JBE3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][3] == 1 ||
              ClsGlobal.Matriz1[4][3] == 121 ||
              ClsGlobal.Matriz1[4][3] == 122 ||
              ClsGlobal.Matriz1[4][3] == 123 ||
              ClsGlobal.Matriz1[4][3] == 124 ||
              ClsGlobal.Matriz1[4][3] == 131 ||
              ClsGlobal.Matriz1[4][3] == 132 ||
              ClsGlobal.Matriz1[4][3] == 133 ||
              ClsGlobal.Matriz1[4][3] == 134 ||
              ClsGlobal.Matriz1[4][3] == 221 ||
              ClsGlobal.Matriz1[4][3] == 222 ||
              ClsGlobal.Matriz1[4][3] == 223 ||
              ClsGlobal.Matriz1[4][3] == 231 ||
              ClsGlobal.Matriz1[4][3] == 232 ||
              ClsGlobal.Matriz1[4][3] == 233 ||
              ClsGlobal.Matriz1[4][3] == 321 ||
              ClsGlobal.Matriz1[4][3] == 322 ||
              ClsGlobal.Matriz1[4][3] == 331 ||
              ClsGlobal.Matriz1[4][3] == 332){
                JBE4_1.setEnabled(false);
           }else{
                JBE4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][4] == 1 ||
              ClsGlobal.Matriz1[4][4] == 121 ||
              ClsGlobal.Matriz1[4][4] == 122 ||
              ClsGlobal.Matriz1[4][4] == 123 ||
              ClsGlobal.Matriz1[4][4] == 124 ||
              ClsGlobal.Matriz1[4][4] == 131 ||
              ClsGlobal.Matriz1[4][4] == 132 ||
              ClsGlobal.Matriz1[4][4] == 133 ||
              ClsGlobal.Matriz1[4][4] == 134 ||
              ClsGlobal.Matriz1[4][4] == 221 ||
              ClsGlobal.Matriz1[4][4] == 222 ||
              ClsGlobal.Matriz1[4][4] == 223 ||
              ClsGlobal.Matriz1[4][4] == 231 ||
              ClsGlobal.Matriz1[4][4] == 232 ||
              ClsGlobal.Matriz1[4][4] == 233 ||
              ClsGlobal.Matriz1[4][4] == 321 ||
              ClsGlobal.Matriz1[4][4] == 322 ||
              ClsGlobal.Matriz1[4][4] == 331 ||
              ClsGlobal.Matriz1[4][4] == 332){
                JBE5_1.setEnabled(false);
           }else{
                JBE5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][5] == 1 ||
              ClsGlobal.Matriz1[4][5] == 121 ||
              ClsGlobal.Matriz1[4][5] == 122 ||
              ClsGlobal.Matriz1[4][5] == 123 ||
              ClsGlobal.Matriz1[4][5] == 124 ||
              ClsGlobal.Matriz1[4][5] == 131 ||
              ClsGlobal.Matriz1[4][5] == 132 ||
              ClsGlobal.Matriz1[4][5] == 133 ||
              ClsGlobal.Matriz1[4][5] == 134 ||
              ClsGlobal.Matriz1[4][5] == 221 ||
              ClsGlobal.Matriz1[4][5] == 222 ||
              ClsGlobal.Matriz1[4][5] == 223 ||
              ClsGlobal.Matriz1[4][5] == 231 ||
              ClsGlobal.Matriz1[4][5] == 232 ||
              ClsGlobal.Matriz1[4][5] == 233 ||
              ClsGlobal.Matriz1[4][5] == 321 ||
              ClsGlobal.Matriz1[4][5] == 322 ||
              ClsGlobal.Matriz1[4][5] == 331 ||
              ClsGlobal.Matriz1[4][5] == 332){
                JBE6_1.setEnabled(false);
           }else{
                JBE6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][6] == 1 ||
              ClsGlobal.Matriz1[4][6] == 121 ||
              ClsGlobal.Matriz1[4][6] == 122 ||
              ClsGlobal.Matriz1[4][6] == 123 ||
              ClsGlobal.Matriz1[4][6] == 124 ||
              ClsGlobal.Matriz1[4][6] == 131 ||
              ClsGlobal.Matriz1[4][6] == 132 ||
              ClsGlobal.Matriz1[4][6] == 133 ||
              ClsGlobal.Matriz1[4][6] == 134 ||
              ClsGlobal.Matriz1[4][6] == 221 ||
              ClsGlobal.Matriz1[4][6] == 222 ||
              ClsGlobal.Matriz1[4][6] == 223 ||
              ClsGlobal.Matriz1[4][6] == 231 ||
              ClsGlobal.Matriz1[4][6] == 232 ||
              ClsGlobal.Matriz1[4][6] == 233 ||
              ClsGlobal.Matriz1[4][6] == 321 ||
              ClsGlobal.Matriz1[4][6] == 322 ||
              ClsGlobal.Matriz1[4][6] == 331 ||
              ClsGlobal.Matriz1[4][6] == 332){
                JBE7_1.setEnabled(false);
           }else{
                JBE7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][7] == 1 ||
              ClsGlobal.Matriz1[4][7] == 121 ||
              ClsGlobal.Matriz1[4][7] == 122 ||
              ClsGlobal.Matriz1[4][7] == 123 ||
              ClsGlobal.Matriz1[4][7] == 124 ||
              ClsGlobal.Matriz1[4][7] == 131 ||
              ClsGlobal.Matriz1[4][7] == 132 ||
              ClsGlobal.Matriz1[4][7] == 133 ||
              ClsGlobal.Matriz1[4][7] == 134 ||
              ClsGlobal.Matriz1[4][7] == 221 ||
              ClsGlobal.Matriz1[4][7] == 222 ||
              ClsGlobal.Matriz1[4][7] == 223 ||
              ClsGlobal.Matriz1[4][7] == 231 ||
              ClsGlobal.Matriz1[4][7] == 232 ||
              ClsGlobal.Matriz1[4][7] == 233 ||
              ClsGlobal.Matriz1[4][7] == 321 ||
              ClsGlobal.Matriz1[4][7] == 322 ||
              ClsGlobal.Matriz1[4][7] == 331 ||
              ClsGlobal.Matriz1[4][7] == 332){
                JBE8_1.setEnabled(false);
           }else{
                JBE8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][8] == 1 ||
              ClsGlobal.Matriz1[4][8] == 121 ||
              ClsGlobal.Matriz1[4][8] == 122 ||
              ClsGlobal.Matriz1[4][8] == 123 ||
              ClsGlobal.Matriz1[4][8] == 124 ||
              ClsGlobal.Matriz1[4][8] == 131 ||
              ClsGlobal.Matriz1[4][8] == 132 ||
              ClsGlobal.Matriz1[4][8] == 133 ||
              ClsGlobal.Matriz1[4][8] == 134 ||
              ClsGlobal.Matriz1[4][8] == 221 ||
              ClsGlobal.Matriz1[4][8] == 222 ||
              ClsGlobal.Matriz1[4][8] == 223 ||
              ClsGlobal.Matriz1[4][8] == 231 ||
              ClsGlobal.Matriz1[4][8] == 232 ||
              ClsGlobal.Matriz1[4][8] == 233 ||
              ClsGlobal.Matriz1[4][8] == 321 ||
              ClsGlobal.Matriz1[4][8] == 322 ||
              ClsGlobal.Matriz1[4][8] == 331 ||
              ClsGlobal.Matriz1[4][8] == 332){
                JBE9_1.setEnabled(false);
           }else{
                JBE9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[4][9] == 1 ||
              ClsGlobal.Matriz1[4][9] == 121 ||
              ClsGlobal.Matriz1[4][9] == 122 ||
              ClsGlobal.Matriz1[4][9] == 123 ||
              ClsGlobal.Matriz1[4][9] == 124 ||
              ClsGlobal.Matriz1[4][9] == 131 ||
              ClsGlobal.Matriz1[4][9] == 132 ||
              ClsGlobal.Matriz1[4][9] == 133 ||
              ClsGlobal.Matriz1[4][9] == 134 ||
              ClsGlobal.Matriz1[4][9] == 221 ||
              ClsGlobal.Matriz1[4][9] == 222 ||
              ClsGlobal.Matriz1[4][9] == 223 ||
              ClsGlobal.Matriz1[4][9] == 231 ||
              ClsGlobal.Matriz1[4][9] == 232 ||
              ClsGlobal.Matriz1[4][9] == 233 ||
              ClsGlobal.Matriz1[4][9] == 321 ||
              ClsGlobal.Matriz1[4][9] == 322 ||
              ClsGlobal.Matriz1[4][9] == 331 ||
              ClsGlobal.Matriz1[4][9] == 332){
                JBE10_1.setEnabled(false);
           }else{
                JBE10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][0] == 1 ||
              ClsGlobal.Matriz1[5][0] == 121 ||
              ClsGlobal.Matriz1[5][0] == 122 ||
              ClsGlobal.Matriz1[5][0] == 123 ||
              ClsGlobal.Matriz1[5][0] == 124 ||
              ClsGlobal.Matriz1[5][0] == 131 ||
              ClsGlobal.Matriz1[5][0] == 132 ||
              ClsGlobal.Matriz1[5][0] == 133 ||
              ClsGlobal.Matriz1[5][0] == 134 ||
              ClsGlobal.Matriz1[5][0] == 221 ||
              ClsGlobal.Matriz1[5][0] == 222 ||
              ClsGlobal.Matriz1[5][0] == 223 ||
              ClsGlobal.Matriz1[5][0] == 231 ||
              ClsGlobal.Matriz1[5][0] == 232 ||
              ClsGlobal.Matriz1[5][0] == 233 ||
              ClsGlobal.Matriz1[5][0] == 321 ||
              ClsGlobal.Matriz1[5][0] == 322 ||
              ClsGlobal.Matriz1[5][0] == 331 ||
              ClsGlobal.Matriz1[5][0] == 332){
                JBF1_1.setEnabled(false);
           }else{
                JBF1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][1] == 1 ||
              ClsGlobal.Matriz1[5][1] == 121 ||
              ClsGlobal.Matriz1[5][1] == 122 ||
              ClsGlobal.Matriz1[5][1] == 123 ||
              ClsGlobal.Matriz1[5][1] == 124 ||
              ClsGlobal.Matriz1[5][1] == 131 ||
              ClsGlobal.Matriz1[5][1] == 132 ||
              ClsGlobal.Matriz1[5][1] == 133 ||
              ClsGlobal.Matriz1[5][1] == 134 ||
              ClsGlobal.Matriz1[5][1] == 221 ||
              ClsGlobal.Matriz1[5][1] == 222 ||
              ClsGlobal.Matriz1[5][1] == 223 ||
              ClsGlobal.Matriz1[5][1] == 231 ||
              ClsGlobal.Matriz1[5][1] == 232 ||
              ClsGlobal.Matriz1[5][1] == 233 ||
              ClsGlobal.Matriz1[5][1] == 321 ||
              ClsGlobal.Matriz1[5][1] == 322 ||
              ClsGlobal.Matriz1[5][1] == 331 ||
              ClsGlobal.Matriz1[5][1] == 332){
                JBF2_1.setEnabled(false);
           }else{
                JBF2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][2] == 1 ||
              ClsGlobal.Matriz1[5][2] == 121 ||
              ClsGlobal.Matriz1[5][2] == 122 ||
              ClsGlobal.Matriz1[5][2] == 123 ||
              ClsGlobal.Matriz1[5][2] == 124 ||
              ClsGlobal.Matriz1[5][2] == 131 ||
              ClsGlobal.Matriz1[5][2] == 132 ||
              ClsGlobal.Matriz1[5][2] == 133 ||
              ClsGlobal.Matriz1[5][2] == 134 ||
              ClsGlobal.Matriz1[5][2] == 221 ||
              ClsGlobal.Matriz1[5][2] == 222 ||
              ClsGlobal.Matriz1[5][2] == 223 ||
              ClsGlobal.Matriz1[5][2] == 231 ||
              ClsGlobal.Matriz1[5][2] == 232 ||
              ClsGlobal.Matriz1[5][2] == 233 ||
              ClsGlobal.Matriz1[5][2] == 321 ||
              ClsGlobal.Matriz1[5][2] == 322 ||
              ClsGlobal.Matriz1[5][2] == 331 ||
              ClsGlobal.Matriz1[5][2] == 332){
                JBF3_1.setEnabled(false);
           }else{
                JBF3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][3] == 1 ||
              ClsGlobal.Matriz1[5][3] == 121 ||
              ClsGlobal.Matriz1[5][3] == 122 ||
              ClsGlobal.Matriz1[5][3] == 123 ||
              ClsGlobal.Matriz1[5][3] == 124 ||
              ClsGlobal.Matriz1[5][3] == 131 ||
              ClsGlobal.Matriz1[5][3] == 132 ||
              ClsGlobal.Matriz1[5][3] == 133 ||
              ClsGlobal.Matriz1[5][3] == 134 ||
              ClsGlobal.Matriz1[5][3] == 221 ||
              ClsGlobal.Matriz1[5][3] == 222 ||
              ClsGlobal.Matriz1[5][3] == 223 ||
              ClsGlobal.Matriz1[5][3] == 231 ||
              ClsGlobal.Matriz1[5][3] == 232 ||
              ClsGlobal.Matriz1[5][3] == 233 ||
              ClsGlobal.Matriz1[5][3] == 321 ||
              ClsGlobal.Matriz1[5][3] == 322 ||
              ClsGlobal.Matriz1[5][3] == 331 ||
              ClsGlobal.Matriz1[5][3] == 332){
                JBF4_1.setEnabled(false);
           }else{
                JBF4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][4] == 1 ||
              ClsGlobal.Matriz1[5][4] == 121 ||
              ClsGlobal.Matriz1[5][4] == 122 ||
              ClsGlobal.Matriz1[5][4] == 123 ||
              ClsGlobal.Matriz1[5][4] == 124 ||
              ClsGlobal.Matriz1[5][4] == 131 ||
              ClsGlobal.Matriz1[5][4] == 132 ||
              ClsGlobal.Matriz1[5][4] == 133 ||
              ClsGlobal.Matriz1[5][4] == 134 ||
              ClsGlobal.Matriz1[5][4] == 221 ||
              ClsGlobal.Matriz1[5][4] == 222 ||
              ClsGlobal.Matriz1[5][4] == 223 ||
              ClsGlobal.Matriz1[5][4] == 231 ||
              ClsGlobal.Matriz1[5][4] == 232 ||
              ClsGlobal.Matriz1[5][4] == 233 ||
              ClsGlobal.Matriz1[5][4] == 321 ||
              ClsGlobal.Matriz1[5][4] == 322 ||
              ClsGlobal.Matriz1[5][4] == 331 ||
              ClsGlobal.Matriz1[5][4] == 332){
                JBF5_1.setEnabled(false);
           }else{
                JBF5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][5] == 1 ||
              ClsGlobal.Matriz1[5][5] == 121 ||
              ClsGlobal.Matriz1[5][5] == 122 ||
              ClsGlobal.Matriz1[5][5] == 123 ||
              ClsGlobal.Matriz1[5][5] == 124 ||
              ClsGlobal.Matriz1[5][5] == 131 ||
              ClsGlobal.Matriz1[5][5] == 132 ||
              ClsGlobal.Matriz1[5][5] == 133 ||
              ClsGlobal.Matriz1[5][5] == 134 ||
              ClsGlobal.Matriz1[5][5] == 221 ||
              ClsGlobal.Matriz1[5][5] == 222 ||
              ClsGlobal.Matriz1[5][5] == 223 ||
              ClsGlobal.Matriz1[5][5] == 231 ||
              ClsGlobal.Matriz1[5][5] == 232 ||
              ClsGlobal.Matriz1[5][5] == 233 ||
              ClsGlobal.Matriz1[5][5] == 321 ||
              ClsGlobal.Matriz1[5][5] == 322 ||
              ClsGlobal.Matriz1[5][5] == 331 ||
              ClsGlobal.Matriz1[5][5] == 332){
                JBF6_1.setEnabled(false);
           }else{
                JBF6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][6] == 1 ||
              ClsGlobal.Matriz1[5][6] == 121 ||
              ClsGlobal.Matriz1[5][6] == 122 ||
              ClsGlobal.Matriz1[5][6] == 123 ||
              ClsGlobal.Matriz1[5][6] == 124 ||
              ClsGlobal.Matriz1[5][6] == 131 ||
              ClsGlobal.Matriz1[5][6] == 132 ||
              ClsGlobal.Matriz1[5][6] == 133 ||
              ClsGlobal.Matriz1[5][6] == 134 ||
              ClsGlobal.Matriz1[5][6] == 221 ||
              ClsGlobal.Matriz1[5][6] == 222 ||
              ClsGlobal.Matriz1[5][6] == 223 ||
              ClsGlobal.Matriz1[5][6] == 231 ||
              ClsGlobal.Matriz1[5][6] == 232 ||
              ClsGlobal.Matriz1[5][6] == 233 ||
              ClsGlobal.Matriz1[5][6] == 321 ||
              ClsGlobal.Matriz1[5][6] == 322 ||
              ClsGlobal.Matriz1[5][6] == 331 ||
              ClsGlobal.Matriz1[5][6] == 332){
                JBF7_1.setEnabled(false);
           }else{
                JBF7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][7] == 1 ||
              ClsGlobal.Matriz1[5][7] == 121 ||
              ClsGlobal.Matriz1[5][7] == 122 ||
              ClsGlobal.Matriz1[5][7] == 123 ||
              ClsGlobal.Matriz1[5][7] == 124 ||
              ClsGlobal.Matriz1[5][7] == 131 ||
              ClsGlobal.Matriz1[5][7] == 132 ||
              ClsGlobal.Matriz1[5][7] == 133 ||
              ClsGlobal.Matriz1[5][7] == 134 ||
              ClsGlobal.Matriz1[5][7] == 221 ||
              ClsGlobal.Matriz1[5][7] == 222 ||
              ClsGlobal.Matriz1[5][7] == 223 ||
              ClsGlobal.Matriz1[5][7] == 231 ||
              ClsGlobal.Matriz1[5][7] == 232 ||
              ClsGlobal.Matriz1[5][7] == 233 ||
              ClsGlobal.Matriz1[5][7] == 321 ||
              ClsGlobal.Matriz1[5][7] == 322 ||
              ClsGlobal.Matriz1[5][7] == 331 ||
              ClsGlobal.Matriz1[5][7] == 332){
                JBF8_1.setEnabled(false);
           }else{
                JBF8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][8] == 1 ||
              ClsGlobal.Matriz1[5][8] == 121 ||
              ClsGlobal.Matriz1[5][8] == 122 ||
              ClsGlobal.Matriz1[5][8] == 123 ||
              ClsGlobal.Matriz1[5][8] == 124 ||
              ClsGlobal.Matriz1[5][8] == 131 ||
              ClsGlobal.Matriz1[5][8] == 132 ||
              ClsGlobal.Matriz1[5][8] == 133 ||
              ClsGlobal.Matriz1[5][8] == 134 ||
              ClsGlobal.Matriz1[5][8] == 221 ||
              ClsGlobal.Matriz1[5][8] == 222 ||
              ClsGlobal.Matriz1[5][8] == 223 ||
              ClsGlobal.Matriz1[5][8] == 231 ||
              ClsGlobal.Matriz1[5][8] == 232 ||
              ClsGlobal.Matriz1[5][8] == 233 ||
              ClsGlobal.Matriz1[5][8] == 321 ||
              ClsGlobal.Matriz1[5][8] == 322 ||
              ClsGlobal.Matriz1[5][8] == 331 ||
              ClsGlobal.Matriz1[5][8] == 332){
                JBF9_1.setEnabled(false);
           }else{
                JBF9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[5][9] == 1 ||
              ClsGlobal.Matriz1[5][9] == 121 ||
              ClsGlobal.Matriz1[5][9] == 122 ||
              ClsGlobal.Matriz1[5][9] == 123 ||
              ClsGlobal.Matriz1[5][9] == 124 ||
              ClsGlobal.Matriz1[5][9] == 131 ||
              ClsGlobal.Matriz1[5][9] == 132 ||
              ClsGlobal.Matriz1[5][9] == 133 ||
              ClsGlobal.Matriz1[5][9] == 134 ||
              ClsGlobal.Matriz1[5][9] == 221 ||
              ClsGlobal.Matriz1[5][9] == 222 ||
              ClsGlobal.Matriz1[5][9] == 223 ||
              ClsGlobal.Matriz1[5][9] == 231 ||
              ClsGlobal.Matriz1[5][9] == 232 ||
              ClsGlobal.Matriz1[5][9] == 233 ||
              ClsGlobal.Matriz1[5][9] == 321 ||
              ClsGlobal.Matriz1[5][9] == 322 ||
              ClsGlobal.Matriz1[5][9] == 331 ||
              ClsGlobal.Matriz1[5][9] == 332){
                JBF10_1.setEnabled(false);
           }else{
                JBF10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][0] == 1 ||
              ClsGlobal.Matriz1[6][0] == 121 ||
              ClsGlobal.Matriz1[6][0] == 122 ||
              ClsGlobal.Matriz1[6][0] == 123 ||
              ClsGlobal.Matriz1[6][0] == 124 ||
              ClsGlobal.Matriz1[6][0] == 131 ||
              ClsGlobal.Matriz1[6][0] == 132 ||
              ClsGlobal.Matriz1[6][0] == 133 ||
              ClsGlobal.Matriz1[6][0] == 134 ||
              ClsGlobal.Matriz1[6][0] == 221 ||
              ClsGlobal.Matriz1[6][0] == 222 ||
              ClsGlobal.Matriz1[6][0] == 223 ||
              ClsGlobal.Matriz1[6][0] == 231 ||
              ClsGlobal.Matriz1[6][0] == 232 ||
              ClsGlobal.Matriz1[6][0] == 233 ||
              ClsGlobal.Matriz1[6][0] == 321 ||
              ClsGlobal.Matriz1[6][0] == 322 ||
              ClsGlobal.Matriz1[6][0] == 331 ||
              ClsGlobal.Matriz1[6][0] == 332){
                JBG1_1.setEnabled(false);
           }else{
                JBG1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][1] == 1 ||
              ClsGlobal.Matriz1[6][1] == 121 ||
              ClsGlobal.Matriz1[6][1] == 122 ||
              ClsGlobal.Matriz1[6][1] == 123 ||
              ClsGlobal.Matriz1[6][1] == 124 ||
              ClsGlobal.Matriz1[6][1] == 131 ||
              ClsGlobal.Matriz1[6][1] == 132 ||
              ClsGlobal.Matriz1[6][1] == 133 ||
              ClsGlobal.Matriz1[6][1] == 134 ||
              ClsGlobal.Matriz1[6][1] == 221 ||
              ClsGlobal.Matriz1[6][1] == 222 ||
              ClsGlobal.Matriz1[6][1] == 223 ||
              ClsGlobal.Matriz1[6][1] == 231 ||
              ClsGlobal.Matriz1[6][1] == 232 ||
              ClsGlobal.Matriz1[6][1] == 233 ||
              ClsGlobal.Matriz1[6][1] == 321 ||
              ClsGlobal.Matriz1[6][1] == 322 ||
              ClsGlobal.Matriz1[6][1] == 331 ||
              ClsGlobal.Matriz1[6][1] == 332){
                JBG2_1.setEnabled(false);
           }else{
                JBG2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][2] == 1 ||
              ClsGlobal.Matriz1[6][2] == 121 ||
              ClsGlobal.Matriz1[6][2] == 122 ||
              ClsGlobal.Matriz1[6][2] == 123 ||
              ClsGlobal.Matriz1[6][2] == 124 ||
              ClsGlobal.Matriz1[6][2] == 131 ||
              ClsGlobal.Matriz1[6][2] == 132 ||
              ClsGlobal.Matriz1[6][2] == 133 ||
              ClsGlobal.Matriz1[6][2] == 134 ||
              ClsGlobal.Matriz1[6][2] == 221 ||
              ClsGlobal.Matriz1[6][2] == 222 ||
              ClsGlobal.Matriz1[6][2] == 223 ||
              ClsGlobal.Matriz1[6][2] == 231 ||
              ClsGlobal.Matriz1[6][2] == 232 ||
              ClsGlobal.Matriz1[6][2] == 233 ||
              ClsGlobal.Matriz1[6][2] == 321 ||
              ClsGlobal.Matriz1[6][2] == 322 ||
              ClsGlobal.Matriz1[6][2] == 331 ||
              ClsGlobal.Matriz1[6][2] == 332){
                JBG3_1.setEnabled(false);
           }else{
                JBG3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][3] == 1 ||
              ClsGlobal.Matriz1[6][3] == 121 ||
              ClsGlobal.Matriz1[6][3] == 122 ||
              ClsGlobal.Matriz1[6][3] == 123 ||
              ClsGlobal.Matriz1[6][3] == 124 ||
              ClsGlobal.Matriz1[6][3] == 131 ||
              ClsGlobal.Matriz1[6][3] == 132 ||
              ClsGlobal.Matriz1[6][3] == 133 ||
              ClsGlobal.Matriz1[6][3] == 134 ||
              ClsGlobal.Matriz1[6][3] == 221 ||
              ClsGlobal.Matriz1[6][3] == 222 ||
              ClsGlobal.Matriz1[6][3] == 223 ||
              ClsGlobal.Matriz1[6][3] == 231 ||
              ClsGlobal.Matriz1[6][3] == 232 ||
              ClsGlobal.Matriz1[6][3] == 233 ||
              ClsGlobal.Matriz1[6][3] == 321 ||
              ClsGlobal.Matriz1[6][3] == 322 ||
              ClsGlobal.Matriz1[6][3] == 331 ||
              ClsGlobal.Matriz1[6][3] == 332){
                JBG4_1.setEnabled(false);
           }else{
                JBG4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][4] == 1 ||
              ClsGlobal.Matriz1[6][4] == 121 ||
              ClsGlobal.Matriz1[6][4] == 122 ||
              ClsGlobal.Matriz1[6][4] == 123 ||
              ClsGlobal.Matriz1[6][4] == 124 ||
              ClsGlobal.Matriz1[6][4] == 131 ||
              ClsGlobal.Matriz1[6][4] == 132 ||
              ClsGlobal.Matriz1[6][4] == 133 ||
              ClsGlobal.Matriz1[6][4] == 134 ||
              ClsGlobal.Matriz1[6][4] == 221 ||
              ClsGlobal.Matriz1[6][4] == 222 ||
              ClsGlobal.Matriz1[6][4] == 223 ||
              ClsGlobal.Matriz1[6][4] == 231 ||
              ClsGlobal.Matriz1[6][4] == 232 ||
              ClsGlobal.Matriz1[6][4] == 233 ||
              ClsGlobal.Matriz1[6][4] == 321 ||
              ClsGlobal.Matriz1[6][4] == 322 ||
              ClsGlobal.Matriz1[6][4] == 331 ||
              ClsGlobal.Matriz1[6][4] == 332){
                JBG5_1.setEnabled(false);
           }else{
                JBG5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][5] == 1 ||
              ClsGlobal.Matriz1[6][5] == 121 ||
              ClsGlobal.Matriz1[6][5] == 122 ||
              ClsGlobal.Matriz1[6][5] == 123 ||
              ClsGlobal.Matriz1[6][5] == 124 ||
              ClsGlobal.Matriz1[6][5] == 131 ||
              ClsGlobal.Matriz1[6][5] == 132 ||
              ClsGlobal.Matriz1[6][5] == 133 ||
              ClsGlobal.Matriz1[6][5] == 134 ||
              ClsGlobal.Matriz1[6][5] == 221 ||
              ClsGlobal.Matriz1[6][5] == 222 ||
              ClsGlobal.Matriz1[6][5] == 223 ||
              ClsGlobal.Matriz1[6][5] == 231 ||
              ClsGlobal.Matriz1[6][5] == 232 ||
              ClsGlobal.Matriz1[6][5] == 233 ||
              ClsGlobal.Matriz1[6][5] == 321 ||
              ClsGlobal.Matriz1[6][5] == 322 ||
              ClsGlobal.Matriz1[6][5] == 331 ||
              ClsGlobal.Matriz1[6][5] == 332){
                JBG6_1.setEnabled(false);
           }else{
                JBG6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][6] == 1 ||
              ClsGlobal.Matriz1[6][6] == 121 ||
              ClsGlobal.Matriz1[6][6] == 122 ||
              ClsGlobal.Matriz1[6][6] == 123 ||
              ClsGlobal.Matriz1[6][6] == 124 ||
              ClsGlobal.Matriz1[6][6] == 131 ||
              ClsGlobal.Matriz1[6][6] == 132 ||
              ClsGlobal.Matriz1[6][6] == 133 ||
              ClsGlobal.Matriz1[6][6] == 134 ||
              ClsGlobal.Matriz1[6][6] == 221 ||
              ClsGlobal.Matriz1[6][6] == 222 ||
              ClsGlobal.Matriz1[6][6] == 223 ||
              ClsGlobal.Matriz1[6][6] == 231 ||
              ClsGlobal.Matriz1[6][6] == 232 ||
              ClsGlobal.Matriz1[6][6] == 233 ||
              ClsGlobal.Matriz1[6][6] == 321 ||
              ClsGlobal.Matriz1[6][6] == 322 ||
              ClsGlobal.Matriz1[6][6] == 331 ||
              ClsGlobal.Matriz1[6][6] == 332){
                JBG7_1.setEnabled(false);
           }else{
                JBG7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][7] == 1 ||
              ClsGlobal.Matriz1[6][7] == 121 ||
              ClsGlobal.Matriz1[6][7] == 122 ||
              ClsGlobal.Matriz1[6][7] == 123 ||
              ClsGlobal.Matriz1[6][7] == 124 ||
              ClsGlobal.Matriz1[6][7] == 131 ||
              ClsGlobal.Matriz1[6][7] == 132 ||
              ClsGlobal.Matriz1[6][7] == 133 ||
              ClsGlobal.Matriz1[6][7] == 134 ||
              ClsGlobal.Matriz1[6][7] == 221 ||
              ClsGlobal.Matriz1[6][7] == 222 ||
              ClsGlobal.Matriz1[6][7] == 223 ||
              ClsGlobal.Matriz1[6][7] == 231 ||
              ClsGlobal.Matriz1[6][7] == 232 ||
              ClsGlobal.Matriz1[6][7] == 233 ||
              ClsGlobal.Matriz1[6][7] == 321 ||
              ClsGlobal.Matriz1[6][7] == 322 ||
              ClsGlobal.Matriz1[6][7] == 331 ||
              ClsGlobal.Matriz1[6][7] == 332){
                JBG8_1.setEnabled(false);
           }else{
                JBG8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][8] == 1 ||
              ClsGlobal.Matriz1[6][8] == 121 ||
              ClsGlobal.Matriz1[6][8] == 122 ||
              ClsGlobal.Matriz1[6][8] == 123 ||
              ClsGlobal.Matriz1[6][8] == 124 ||
              ClsGlobal.Matriz1[6][8] == 131 ||
              ClsGlobal.Matriz1[6][8] == 132 ||
              ClsGlobal.Matriz1[6][8] == 133 ||
              ClsGlobal.Matriz1[6][8] == 134 ||
              ClsGlobal.Matriz1[6][8] == 221 ||
              ClsGlobal.Matriz1[6][8] == 222 ||
              ClsGlobal.Matriz1[6][8] == 223 ||
              ClsGlobal.Matriz1[6][8] == 231 ||
              ClsGlobal.Matriz1[6][8] == 232 ||
              ClsGlobal.Matriz1[6][8] == 233 ||
              ClsGlobal.Matriz1[6][8] == 321 ||
              ClsGlobal.Matriz1[6][8] == 322 ||
              ClsGlobal.Matriz1[6][8] == 331 ||
              ClsGlobal.Matriz1[6][8] == 332){
                JBG9_1.setEnabled(false);
           }else{
                JBG9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[6][9] == 1 ||
              ClsGlobal.Matriz1[6][9] == 121 ||
              ClsGlobal.Matriz1[6][9] == 122 ||
              ClsGlobal.Matriz1[6][9] == 123 ||
              ClsGlobal.Matriz1[6][9] == 124 ||
              ClsGlobal.Matriz1[6][9] == 131 ||
              ClsGlobal.Matriz1[6][9] == 132 ||
              ClsGlobal.Matriz1[6][9] == 133 ||
              ClsGlobal.Matriz1[6][9] == 134 ||
              ClsGlobal.Matriz1[6][9] == 221 ||
              ClsGlobal.Matriz1[6][9] == 222 ||
              ClsGlobal.Matriz1[6][9] == 223 ||
              ClsGlobal.Matriz1[6][9] == 231 ||
              ClsGlobal.Matriz1[6][9] == 232 ||
              ClsGlobal.Matriz1[6][9] == 233 ||
              ClsGlobal.Matriz1[6][9] == 321 ||
              ClsGlobal.Matriz1[6][9] == 322 ||
              ClsGlobal.Matriz1[6][9] == 331 ||
              ClsGlobal.Matriz1[6][9] == 332){
                JBG10_1.setEnabled(false);
           }else{
                JBG10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][0] == 1 ||
              ClsGlobal.Matriz1[7][0] == 121 ||
              ClsGlobal.Matriz1[7][0] == 122 ||
              ClsGlobal.Matriz1[7][0] == 123 ||
              ClsGlobal.Matriz1[7][0] == 124 ||
              ClsGlobal.Matriz1[7][0] == 131 ||
              ClsGlobal.Matriz1[7][0] == 132 ||
              ClsGlobal.Matriz1[7][0] == 133 ||
              ClsGlobal.Matriz1[7][0] == 134 ||
              ClsGlobal.Matriz1[7][0] == 221 ||
              ClsGlobal.Matriz1[7][0] == 222 ||
              ClsGlobal.Matriz1[7][0] == 223 ||
              ClsGlobal.Matriz1[7][0] == 231 ||
              ClsGlobal.Matriz1[7][0] == 232 ||
              ClsGlobal.Matriz1[7][0] == 233 ||
              ClsGlobal.Matriz1[7][0] == 321 ||
              ClsGlobal.Matriz1[7][0] == 322 ||
              ClsGlobal.Matriz1[7][0] == 331 ||
              ClsGlobal.Matriz1[7][0] == 332){
                JBH1_1.setEnabled(false);
           }else{
                JBH1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][1] == 1 ||
              ClsGlobal.Matriz1[7][1] == 121 ||
              ClsGlobal.Matriz1[7][1] == 122 ||
              ClsGlobal.Matriz1[7][1] == 123 ||
              ClsGlobal.Matriz1[7][1] == 124 ||
              ClsGlobal.Matriz1[7][1] == 131 ||
              ClsGlobal.Matriz1[7][1] == 132 ||
              ClsGlobal.Matriz1[7][1] == 133 ||
              ClsGlobal.Matriz1[7][1] == 134 ||
              ClsGlobal.Matriz1[7][1] == 221 ||
              ClsGlobal.Matriz1[7][1] == 222 ||
              ClsGlobal.Matriz1[7][1] == 223 ||
              ClsGlobal.Matriz1[7][1] == 231 ||
              ClsGlobal.Matriz1[7][1] == 232 ||
              ClsGlobal.Matriz1[7][1] == 233 ||
              ClsGlobal.Matriz1[7][1] == 321 ||
              ClsGlobal.Matriz1[7][1] == 322 ||
              ClsGlobal.Matriz1[7][1] == 331 ||
              ClsGlobal.Matriz1[7][1] == 332){
                JBH2_1.setEnabled(false);
           }else{
                JBH2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][2] == 1 ||
              ClsGlobal.Matriz1[7][2] == 121 ||
              ClsGlobal.Matriz1[7][2] == 122 ||
              ClsGlobal.Matriz1[7][2] == 123 ||
              ClsGlobal.Matriz1[7][2] == 124 ||
              ClsGlobal.Matriz1[7][2] == 131 ||
              ClsGlobal.Matriz1[7][2] == 132 ||
              ClsGlobal.Matriz1[7][2] == 133 ||
              ClsGlobal.Matriz1[7][2] == 134 ||
              ClsGlobal.Matriz1[7][2] == 221 ||
              ClsGlobal.Matriz1[7][2] == 222 ||
              ClsGlobal.Matriz1[7][2] == 223 ||
              ClsGlobal.Matriz1[7][2] == 231 ||
              ClsGlobal.Matriz1[7][2] == 232 ||
              ClsGlobal.Matriz1[7][2] == 233 ||
              ClsGlobal.Matriz1[7][2] == 321 ||
              ClsGlobal.Matriz1[7][2] == 322 ||
              ClsGlobal.Matriz1[7][2] == 331 ||
              ClsGlobal.Matriz1[7][2] == 332){
                JBH3_1.setEnabled(false);
           }else{
                JBH3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][3] == 1 ||
              ClsGlobal.Matriz1[7][3] == 121 ||
              ClsGlobal.Matriz1[7][3] == 122 ||
              ClsGlobal.Matriz1[7][3] == 123 ||
              ClsGlobal.Matriz1[7][3] == 124 ||
              ClsGlobal.Matriz1[7][3] == 131 ||
              ClsGlobal.Matriz1[7][3] == 132 ||
              ClsGlobal.Matriz1[7][3] == 133 ||
              ClsGlobal.Matriz1[7][3] == 134 ||
              ClsGlobal.Matriz1[7][3] == 221 ||
              ClsGlobal.Matriz1[7][3] == 222 ||
              ClsGlobal.Matriz1[7][3] == 223 ||
              ClsGlobal.Matriz1[7][3] == 231 ||
              ClsGlobal.Matriz1[7][3] == 232 ||
              ClsGlobal.Matriz1[7][3] == 233 ||
              ClsGlobal.Matriz1[7][3] == 321 ||
              ClsGlobal.Matriz1[7][3] == 322 ||
              ClsGlobal.Matriz1[7][3] == 331 ||
              ClsGlobal.Matriz1[7][3] == 332){
                JBH4_1.setEnabled(false);
           }else{
                JBH4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][4] == 1 ||
              ClsGlobal.Matriz1[7][4] == 121 ||
              ClsGlobal.Matriz1[7][4] == 122 ||
              ClsGlobal.Matriz1[7][4] == 123 ||
              ClsGlobal.Matriz1[7][4] == 124 ||
              ClsGlobal.Matriz1[7][4] == 131 ||
              ClsGlobal.Matriz1[7][4] == 132 ||
              ClsGlobal.Matriz1[7][4] == 133 ||
              ClsGlobal.Matriz1[7][4] == 134 ||
              ClsGlobal.Matriz1[7][4] == 221 ||
              ClsGlobal.Matriz1[7][4] == 222 ||
              ClsGlobal.Matriz1[7][4] == 223 ||
              ClsGlobal.Matriz1[7][4] == 231 ||
              ClsGlobal.Matriz1[7][4] == 232 ||
              ClsGlobal.Matriz1[7][4] == 233 ||
              ClsGlobal.Matriz1[7][4] == 321 ||
              ClsGlobal.Matriz1[7][4] == 322 ||
              ClsGlobal.Matriz1[7][4] == 331 ||
              ClsGlobal.Matriz1[7][4] == 332){
                JBH5_1.setEnabled(false);
           }else{
                JBH5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][5] == 1 ||
              ClsGlobal.Matriz1[7][5] == 121 ||
              ClsGlobal.Matriz1[7][5] == 122 ||
              ClsGlobal.Matriz1[7][5] == 123 ||
              ClsGlobal.Matriz1[7][5] == 124 ||
              ClsGlobal.Matriz1[7][5] == 131 ||
              ClsGlobal.Matriz1[7][5] == 132 ||
              ClsGlobal.Matriz1[7][5] == 133 ||
              ClsGlobal.Matriz1[7][5] == 134 ||
              ClsGlobal.Matriz1[7][5] == 221 ||
              ClsGlobal.Matriz1[7][5] == 222 ||
              ClsGlobal.Matriz1[7][5] == 223 ||
              ClsGlobal.Matriz1[7][5] == 231 ||
              ClsGlobal.Matriz1[7][5] == 232 ||
              ClsGlobal.Matriz1[7][5] == 233 ||
              ClsGlobal.Matriz1[7][5] == 321 ||
              ClsGlobal.Matriz1[7][5] == 322 ||
              ClsGlobal.Matriz1[7][5] == 331 ||
              ClsGlobal.Matriz1[7][5] == 332){
                JBH6_1.setEnabled(false);
           }else{
                JBH6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][6] == 1 ||
              ClsGlobal.Matriz1[7][6] == 121 ||
              ClsGlobal.Matriz1[7][6] == 122 ||
              ClsGlobal.Matriz1[7][6] == 123 ||
              ClsGlobal.Matriz1[7][6] == 124 ||
              ClsGlobal.Matriz1[7][6] == 131 ||
              ClsGlobal.Matriz1[7][6] == 132 ||
              ClsGlobal.Matriz1[7][6] == 133 ||
              ClsGlobal.Matriz1[7][6] == 134 ||
              ClsGlobal.Matriz1[7][6] == 221 ||
              ClsGlobal.Matriz1[7][6] == 222 ||
              ClsGlobal.Matriz1[7][6] == 223 ||
              ClsGlobal.Matriz1[7][6] == 231 ||
              ClsGlobal.Matriz1[7][6] == 232 ||
              ClsGlobal.Matriz1[7][6] == 233 ||
              ClsGlobal.Matriz1[7][6] == 321 ||
              ClsGlobal.Matriz1[7][6] == 322 ||
              ClsGlobal.Matriz1[7][6] == 331 ||
              ClsGlobal.Matriz1[7][6] == 332){
                JBH7_1.setEnabled(false);
           }else{
                JBH7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][7] == 1 ||
              ClsGlobal.Matriz1[7][7] == 121 ||
              ClsGlobal.Matriz1[7][7] == 122 ||
              ClsGlobal.Matriz1[7][7] == 123 ||
              ClsGlobal.Matriz1[7][7] == 124 ||
              ClsGlobal.Matriz1[7][7] == 131 ||
              ClsGlobal.Matriz1[7][7] == 132 ||
              ClsGlobal.Matriz1[7][7] == 133 ||
              ClsGlobal.Matriz1[7][7] == 134 ||
              ClsGlobal.Matriz1[7][7] == 221 ||
              ClsGlobal.Matriz1[7][7] == 222 ||
              ClsGlobal.Matriz1[7][7] == 223 ||
              ClsGlobal.Matriz1[7][7] == 231 ||
              ClsGlobal.Matriz1[7][7] == 232 ||
              ClsGlobal.Matriz1[7][7] == 233 ||
              ClsGlobal.Matriz1[7][7] == 321 ||
              ClsGlobal.Matriz1[7][7] == 322 ||
              ClsGlobal.Matriz1[7][7] == 331 ||
              ClsGlobal.Matriz1[7][7] == 332){
                JBH8_1.setEnabled(false);
           }else{
                JBH8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][8] == 1 ||
              ClsGlobal.Matriz1[7][8] == 121 ||
              ClsGlobal.Matriz1[7][8] == 122 ||
              ClsGlobal.Matriz1[7][8] == 123 ||
              ClsGlobal.Matriz1[7][8] == 124 ||
              ClsGlobal.Matriz1[7][8] == 131 ||
              ClsGlobal.Matriz1[7][8] == 132 ||
              ClsGlobal.Matriz1[7][8] == 133 ||
              ClsGlobal.Matriz1[7][8] == 134 ||
              ClsGlobal.Matriz1[7][8] == 221 ||
              ClsGlobal.Matriz1[7][8] == 222 ||
              ClsGlobal.Matriz1[7][8] == 223 ||
              ClsGlobal.Matriz1[7][8] == 231 ||
              ClsGlobal.Matriz1[7][8] == 232 ||
              ClsGlobal.Matriz1[7][8] == 233 ||
              ClsGlobal.Matriz1[7][8] == 321 ||
              ClsGlobal.Matriz1[7][8] == 322 ||
              ClsGlobal.Matriz1[7][8] == 331 ||
              ClsGlobal.Matriz1[7][8] == 332){
                JBH9_1.setEnabled(false);
           }else{
                JBH9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[7][9] == 1 ||
              ClsGlobal.Matriz1[7][9] == 121 ||
              ClsGlobal.Matriz1[7][9] == 122 ||
              ClsGlobal.Matriz1[7][9] == 123 ||
              ClsGlobal.Matriz1[7][9] == 124 ||
              ClsGlobal.Matriz1[7][9] == 131 ||
              ClsGlobal.Matriz1[7][9] == 132 ||
              ClsGlobal.Matriz1[7][9] == 133 ||
              ClsGlobal.Matriz1[7][9] == 134 ||
              ClsGlobal.Matriz1[7][9] == 221 ||
              ClsGlobal.Matriz1[7][9] == 222 ||
              ClsGlobal.Matriz1[7][9] == 223 ||
              ClsGlobal.Matriz1[7][9] == 231 ||
              ClsGlobal.Matriz1[7][9] == 232 ||
              ClsGlobal.Matriz1[7][9] == 233 ||
              ClsGlobal.Matriz1[7][9] == 321 ||
              ClsGlobal.Matriz1[7][9] == 322 ||
              ClsGlobal.Matriz1[7][9] == 331 ||
              ClsGlobal.Matriz1[7][9] == 332){
                JBH10_1.setEnabled(false);
           }else{
                JBH10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][0] == 1 ||
              ClsGlobal.Matriz1[8][0] == 121 ||
              ClsGlobal.Matriz1[8][0] == 122 ||
              ClsGlobal.Matriz1[8][0] == 123 ||
              ClsGlobal.Matriz1[8][0] == 124 ||
              ClsGlobal.Matriz1[8][0] == 131 ||
              ClsGlobal.Matriz1[8][0] == 132 ||
              ClsGlobal.Matriz1[8][0] == 133 ||
              ClsGlobal.Matriz1[8][0] == 134 ||
              ClsGlobal.Matriz1[8][0] == 221 ||
              ClsGlobal.Matriz1[8][0] == 222 ||
              ClsGlobal.Matriz1[8][0] == 223 ||
              ClsGlobal.Matriz1[8][0] == 231 ||
              ClsGlobal.Matriz1[8][0] == 232 ||
              ClsGlobal.Matriz1[8][0] == 233 ||
              ClsGlobal.Matriz1[8][0] == 321 ||
              ClsGlobal.Matriz1[8][0] == 322 ||
              ClsGlobal.Matriz1[8][0] == 331 ||
              ClsGlobal.Matriz1[8][0] == 332){
                JBI1_1.setEnabled(false);
           }else{
                JBI1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][1] == 1 ||
              ClsGlobal.Matriz1[8][1] == 121 ||
              ClsGlobal.Matriz1[8][1] == 122 ||
              ClsGlobal.Matriz1[8][1] == 123 ||
              ClsGlobal.Matriz1[8][1] == 124 ||
              ClsGlobal.Matriz1[8][1] == 131 ||
              ClsGlobal.Matriz1[8][1] == 132 ||
              ClsGlobal.Matriz1[8][1] == 133 ||
              ClsGlobal.Matriz1[8][1] == 134 ||
              ClsGlobal.Matriz1[8][1] == 221 ||
              ClsGlobal.Matriz1[8][1] == 222 ||
              ClsGlobal.Matriz1[8][1] == 223 ||
              ClsGlobal.Matriz1[8][1] == 231 ||
              ClsGlobal.Matriz1[8][1] == 232 ||
              ClsGlobal.Matriz1[8][1] == 233 ||
              ClsGlobal.Matriz1[8][1] == 321 ||
              ClsGlobal.Matriz1[8][1] == 322 ||
              ClsGlobal.Matriz1[8][1] == 331 ||
              ClsGlobal.Matriz1[8][1] == 332){
                JBI2_1.setEnabled(false);
           }else{
                JBI2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][2] == 1 ||
              ClsGlobal.Matriz1[8][2] == 121 ||
              ClsGlobal.Matriz1[8][2] == 122 ||
              ClsGlobal.Matriz1[8][2] == 123 ||
              ClsGlobal.Matriz1[8][2] == 124 ||
              ClsGlobal.Matriz1[8][2] == 131 ||
              ClsGlobal.Matriz1[8][2] == 132 ||
              ClsGlobal.Matriz1[8][2] == 133 ||
              ClsGlobal.Matriz1[8][2] == 134 ||
              ClsGlobal.Matriz1[8][2] == 221 ||
              ClsGlobal.Matriz1[8][2] == 222 ||
              ClsGlobal.Matriz1[8][2] == 223 ||
              ClsGlobal.Matriz1[8][2] == 231 ||
              ClsGlobal.Matriz1[8][2] == 232 ||
              ClsGlobal.Matriz1[8][2] == 233 ||
              ClsGlobal.Matriz1[8][2] == 321 ||
              ClsGlobal.Matriz1[8][2] == 322 ||
              ClsGlobal.Matriz1[8][2] == 331 ||
              ClsGlobal.Matriz1[8][2] == 332){
                JBI3_1.setEnabled(false);
           }else{
                JBI3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][3] == 1 ||
              ClsGlobal.Matriz1[8][3] == 121 ||
              ClsGlobal.Matriz1[8][3] == 122 ||
              ClsGlobal.Matriz1[8][3] == 123 ||
              ClsGlobal.Matriz1[8][3] == 124 ||
              ClsGlobal.Matriz1[8][3] == 131 ||
              ClsGlobal.Matriz1[8][3] == 132 ||
              ClsGlobal.Matriz1[8][3] == 133 ||
              ClsGlobal.Matriz1[8][3] == 134 ||
              ClsGlobal.Matriz1[8][3] == 221 ||
              ClsGlobal.Matriz1[8][3] == 222 ||
              ClsGlobal.Matriz1[8][3] == 223 ||
              ClsGlobal.Matriz1[8][3] == 231 ||
              ClsGlobal.Matriz1[8][3] == 232 ||
              ClsGlobal.Matriz1[8][3] == 233 ||
              ClsGlobal.Matriz1[8][3] == 321 ||
              ClsGlobal.Matriz1[8][3] == 322 ||
              ClsGlobal.Matriz1[8][3] == 331 ||
              ClsGlobal.Matriz1[8][3] == 332){
                JBI4_1.setEnabled(false);
           }else{
                JBI4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][4] == 1 ||
              ClsGlobal.Matriz1[8][4] == 121 ||
              ClsGlobal.Matriz1[8][4] == 122 ||
              ClsGlobal.Matriz1[8][4] == 123 ||
              ClsGlobal.Matriz1[8][4] == 124 ||
              ClsGlobal.Matriz1[8][4] == 131 ||
              ClsGlobal.Matriz1[8][4] == 132 ||
              ClsGlobal.Matriz1[8][4] == 133 ||
              ClsGlobal.Matriz1[8][4] == 134 ||
              ClsGlobal.Matriz1[8][4] == 221 ||
              ClsGlobal.Matriz1[8][4] == 222 ||
              ClsGlobal.Matriz1[8][4] == 223 ||
              ClsGlobal.Matriz1[8][4] == 231 ||
              ClsGlobal.Matriz1[8][4] == 232 ||
              ClsGlobal.Matriz1[8][4] == 233 ||
              ClsGlobal.Matriz1[8][4] == 321 ||
              ClsGlobal.Matriz1[8][4] == 322 ||
              ClsGlobal.Matriz1[8][4] == 331 ||
              ClsGlobal.Matriz1[8][4] == 332){
                JBI5_1.setEnabled(false);
           }else{
                JBI5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][5] == 1 ||
              ClsGlobal.Matriz1[8][5] == 121 ||
              ClsGlobal.Matriz1[8][5] == 122 ||
              ClsGlobal.Matriz1[8][5] == 123 ||
              ClsGlobal.Matriz1[8][5] == 124 ||
              ClsGlobal.Matriz1[8][5] == 131 ||
              ClsGlobal.Matriz1[8][5] == 132 ||
              ClsGlobal.Matriz1[8][5] == 133 ||
              ClsGlobal.Matriz1[8][5] == 134 ||
              ClsGlobal.Matriz1[8][5] == 221 ||
              ClsGlobal.Matriz1[8][5] == 222 ||
              ClsGlobal.Matriz1[8][5] == 223 ||
              ClsGlobal.Matriz1[8][5] == 231 ||
              ClsGlobal.Matriz1[8][5] == 232 ||
              ClsGlobal.Matriz1[8][5] == 233 ||
              ClsGlobal.Matriz1[8][5] == 321 ||
              ClsGlobal.Matriz1[8][5] == 322 ||
              ClsGlobal.Matriz1[8][5] == 331 ||
              ClsGlobal.Matriz1[8][5] == 332){
                JBI6_1.setEnabled(false);
           }else{
                JBI6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][6] == 1 ||
              ClsGlobal.Matriz1[8][6] == 121 ||
              ClsGlobal.Matriz1[8][6] == 122 ||
              ClsGlobal.Matriz1[8][6] == 123 ||
              ClsGlobal.Matriz1[8][6] == 124 ||
              ClsGlobal.Matriz1[8][6] == 131 ||
              ClsGlobal.Matriz1[8][6] == 132 ||
              ClsGlobal.Matriz1[8][6] == 133 ||
              ClsGlobal.Matriz1[8][6] == 134 ||
              ClsGlobal.Matriz1[8][6] == 221 ||
              ClsGlobal.Matriz1[8][6] == 222 ||
              ClsGlobal.Matriz1[8][6] == 223 ||
              ClsGlobal.Matriz1[8][6] == 231 ||
              ClsGlobal.Matriz1[8][6] == 232 ||
              ClsGlobal.Matriz1[8][6] == 233 ||
              ClsGlobal.Matriz1[8][6] == 321 ||
              ClsGlobal.Matriz1[8][6] == 322 ||
              ClsGlobal.Matriz1[8][6] == 331 ||
              ClsGlobal.Matriz1[8][6] == 332){
                JBI7_1.setEnabled(false);
           }else{
                JBI7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][7] == 1 ||
              ClsGlobal.Matriz1[8][7] == 121 ||
              ClsGlobal.Matriz1[8][7] == 122 ||
              ClsGlobal.Matriz1[8][7] == 123 ||
              ClsGlobal.Matriz1[8][7] == 124 ||
              ClsGlobal.Matriz1[8][7] == 131 ||
              ClsGlobal.Matriz1[8][7] == 132 ||
              ClsGlobal.Matriz1[8][7] == 133 ||
              ClsGlobal.Matriz1[8][7] == 134 ||
              ClsGlobal.Matriz1[8][7] == 221 ||
              ClsGlobal.Matriz1[8][7] == 222 ||
              ClsGlobal.Matriz1[8][7] == 223 ||
              ClsGlobal.Matriz1[8][7] == 231 ||
              ClsGlobal.Matriz1[8][7] == 232 ||
              ClsGlobal.Matriz1[8][7] == 233 ||
              ClsGlobal.Matriz1[8][7] == 321 ||
              ClsGlobal.Matriz1[8][7] == 322 ||
              ClsGlobal.Matriz1[8][7] == 331 ||
              ClsGlobal.Matriz1[8][7] == 332){
                JBI8_1.setEnabled(false);
           }else{
                JBI8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][8] == 1 ||
              ClsGlobal.Matriz1[8][8] == 121 ||
              ClsGlobal.Matriz1[8][8] == 122 ||
              ClsGlobal.Matriz1[8][8] == 123 ||
              ClsGlobal.Matriz1[8][8] == 124 ||
              ClsGlobal.Matriz1[8][8] == 131 ||
              ClsGlobal.Matriz1[8][8] == 132 ||
              ClsGlobal.Matriz1[8][8] == 133 ||
              ClsGlobal.Matriz1[8][8] == 134 ||
              ClsGlobal.Matriz1[8][8] == 221 ||
              ClsGlobal.Matriz1[8][8] == 222 ||
              ClsGlobal.Matriz1[8][8] == 223 ||
              ClsGlobal.Matriz1[8][8] == 231 ||
              ClsGlobal.Matriz1[8][8] == 232 ||
              ClsGlobal.Matriz1[8][8] == 233 ||
              ClsGlobal.Matriz1[8][8] == 321 ||
              ClsGlobal.Matriz1[8][8] == 322 ||
              ClsGlobal.Matriz1[8][8] == 331 ||
              ClsGlobal.Matriz1[8][8] == 332){
                JBI9_1.setEnabled(false);
           }else{
                JBI9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[8][9] == 1 ||
              ClsGlobal.Matriz1[8][9] == 121 ||
              ClsGlobal.Matriz1[8][9] == 122 ||
              ClsGlobal.Matriz1[8][9] == 123 ||
              ClsGlobal.Matriz1[8][9] == 124 ||
              ClsGlobal.Matriz1[8][9] == 131 ||
              ClsGlobal.Matriz1[8][9] == 132 ||
              ClsGlobal.Matriz1[8][9] == 133 ||
              ClsGlobal.Matriz1[8][9] == 134 ||
              ClsGlobal.Matriz1[8][9] == 221 ||
              ClsGlobal.Matriz1[8][9] == 222 ||
              ClsGlobal.Matriz1[8][9] == 223 ||
              ClsGlobal.Matriz1[8][9] == 231 ||
              ClsGlobal.Matriz1[8][9] == 232 ||
              ClsGlobal.Matriz1[8][9] == 233 ||
              ClsGlobal.Matriz1[8][9] == 321 ||
              ClsGlobal.Matriz1[8][9] == 322 ||
              ClsGlobal.Matriz1[8][9] == 331 ||
              ClsGlobal.Matriz1[8][9] == 332){
                JBI10_1.setEnabled(false);
           }else{
                JBI10_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][0] == 1 ||
              ClsGlobal.Matriz1[9][0] == 121 ||
              ClsGlobal.Matriz1[9][0] == 122 ||
              ClsGlobal.Matriz1[9][0] == 123 ||
              ClsGlobal.Matriz1[9][0] == 124 ||
              ClsGlobal.Matriz1[9][0] == 131 ||
              ClsGlobal.Matriz1[9][0] == 132 ||
              ClsGlobal.Matriz1[9][0] == 133 ||
              ClsGlobal.Matriz1[9][0] == 134 ||
              ClsGlobal.Matriz1[9][0] == 221 ||
              ClsGlobal.Matriz1[9][0] == 222 ||
              ClsGlobal.Matriz1[9][0] == 223 ||
              ClsGlobal.Matriz1[9][0] == 231 ||
              ClsGlobal.Matriz1[9][0] == 232 ||
              ClsGlobal.Matriz1[9][0] == 233 ||
              ClsGlobal.Matriz1[9][0] == 321 ||
              ClsGlobal.Matriz1[9][0] == 322 ||
              ClsGlobal.Matriz1[9][0] == 331 ||
              ClsGlobal.Matriz1[9][0] == 332){
                JBJ1_1.setEnabled(false);
           }else{
                JBJ1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][1] == 1 ||
              ClsGlobal.Matriz1[9][1] == 121 ||
              ClsGlobal.Matriz1[9][1] == 122 ||
              ClsGlobal.Matriz1[9][1] == 123 ||
              ClsGlobal.Matriz1[9][1] == 124 ||
              ClsGlobal.Matriz1[9][1] == 131 ||
              ClsGlobal.Matriz1[9][1] == 132 ||
              ClsGlobal.Matriz1[9][1] == 133 ||
              ClsGlobal.Matriz1[9][1] == 134 ||
              ClsGlobal.Matriz1[9][1] == 221 ||
              ClsGlobal.Matriz1[9][1] == 222 ||
              ClsGlobal.Matriz1[9][1] == 223 ||
              ClsGlobal.Matriz1[9][1] == 231 ||
              ClsGlobal.Matriz1[9][1] == 232 ||
              ClsGlobal.Matriz1[9][1] == 233 ||
              ClsGlobal.Matriz1[9][1] == 321 ||
              ClsGlobal.Matriz1[9][1] == 322 ||
              ClsGlobal.Matriz1[9][1] == 331 ||
              ClsGlobal.Matriz1[9][1] == 332){
                JBJ2_1.setEnabled(false);
           }else{
                JBJ2_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][2] == 1 ||
              ClsGlobal.Matriz1[9][2] == 121 ||
              ClsGlobal.Matriz1[9][2] == 122 ||
              ClsGlobal.Matriz1[9][2] == 123 ||
              ClsGlobal.Matriz1[9][2] == 124 ||
              ClsGlobal.Matriz1[9][2] == 131 ||
              ClsGlobal.Matriz1[9][2] == 132 ||
              ClsGlobal.Matriz1[9][2] == 133 ||
              ClsGlobal.Matriz1[9][2] == 134 ||
              ClsGlobal.Matriz1[9][2] == 221 ||
              ClsGlobal.Matriz1[9][2] == 222 ||
              ClsGlobal.Matriz1[9][2] == 223 ||
              ClsGlobal.Matriz1[9][2] == 231 ||
              ClsGlobal.Matriz1[9][2] == 232 ||
              ClsGlobal.Matriz1[9][2] == 233 ||
              ClsGlobal.Matriz1[9][2] == 321 ||
              ClsGlobal.Matriz1[9][2] == 322 ||
              ClsGlobal.Matriz1[9][2] == 331 ||
              ClsGlobal.Matriz1[9][2] == 332){
                JBJ3_1.setEnabled(false);
           }else{
                JBJ3_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][3] == 1 ||
              ClsGlobal.Matriz1[9][3] == 121 ||
              ClsGlobal.Matriz1[9][3] == 122 ||
              ClsGlobal.Matriz1[9][3] == 123 ||
              ClsGlobal.Matriz1[9][3] == 124 ||
              ClsGlobal.Matriz1[9][3] == 131 ||
              ClsGlobal.Matriz1[9][3] == 132 ||
              ClsGlobal.Matriz1[9][3] == 133 ||
              ClsGlobal.Matriz1[9][3] == 134 ||
              ClsGlobal.Matriz1[9][3] == 221 ||
              ClsGlobal.Matriz1[9][3] == 222 ||
              ClsGlobal.Matriz1[9][3] == 223 ||
              ClsGlobal.Matriz1[9][3] == 231 ||
              ClsGlobal.Matriz1[9][3] == 232 ||
              ClsGlobal.Matriz1[9][3] == 233 ||
              ClsGlobal.Matriz1[9][3] == 321 ||
              ClsGlobal.Matriz1[9][3] == 322 ||
              ClsGlobal.Matriz1[9][3] == 331 ||
              ClsGlobal.Matriz1[9][3] == 332){
                JBJ4_1.setEnabled(false);
           }else{
                JBJ4_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][4] == 1 ||
              ClsGlobal.Matriz1[9][4] == 121 ||
              ClsGlobal.Matriz1[9][4] == 122 ||
              ClsGlobal.Matriz1[9][4] == 123 ||
              ClsGlobal.Matriz1[9][4] == 124 ||
              ClsGlobal.Matriz1[9][4] == 131 ||
              ClsGlobal.Matriz1[9][4] == 132 ||
              ClsGlobal.Matriz1[9][4] == 133 ||
              ClsGlobal.Matriz1[9][4] == 134 ||
              ClsGlobal.Matriz1[9][4] == 221 ||
              ClsGlobal.Matriz1[9][4] == 222 ||
              ClsGlobal.Matriz1[9][4] == 223 ||
              ClsGlobal.Matriz1[9][4] == 231 ||
              ClsGlobal.Matriz1[9][4] == 232 ||
              ClsGlobal.Matriz1[9][4] == 233 ||
              ClsGlobal.Matriz1[9][4] == 321 ||
              ClsGlobal.Matriz1[9][4] == 322 ||
              ClsGlobal.Matriz1[9][4] == 331 ||
              ClsGlobal.Matriz1[9][4] == 332){
                JBJ5_1.setEnabled(false);
           }else{
                JBJ5_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][5] == 1 ||
              ClsGlobal.Matriz1[9][5] == 121 ||
              ClsGlobal.Matriz1[9][5] == 122 ||
              ClsGlobal.Matriz1[9][5] == 123 ||
              ClsGlobal.Matriz1[9][5] == 124 ||
              ClsGlobal.Matriz1[9][5] == 131 ||
              ClsGlobal.Matriz1[9][5] == 132 ||
              ClsGlobal.Matriz1[9][5] == 133 ||
              ClsGlobal.Matriz1[9][5] == 134 ||
              ClsGlobal.Matriz1[9][5] == 221 ||
              ClsGlobal.Matriz1[9][5] == 222 ||
              ClsGlobal.Matriz1[9][5] == 223 ||
              ClsGlobal.Matriz1[9][5] == 231 ||
              ClsGlobal.Matriz1[9][5] == 232 ||
              ClsGlobal.Matriz1[9][5] == 233 ||
              ClsGlobal.Matriz1[9][5] == 321 ||
              ClsGlobal.Matriz1[9][5] == 322 ||
              ClsGlobal.Matriz1[9][5] == 331 ||
              ClsGlobal.Matriz1[9][5] == 332){
                JBJ6_1.setEnabled(false);
           }else{
                JBJ6_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][6] == 1 ||
              ClsGlobal.Matriz1[9][6] == 121 ||
              ClsGlobal.Matriz1[9][6] == 122 ||
              ClsGlobal.Matriz1[9][6] == 123 ||
              ClsGlobal.Matriz1[9][6] == 124 ||
              ClsGlobal.Matriz1[9][6] == 131 ||
              ClsGlobal.Matriz1[9][6] == 132 ||
              ClsGlobal.Matriz1[9][6] == 133 ||
              ClsGlobal.Matriz1[9][6] == 134 ||
              ClsGlobal.Matriz1[9][6] == 221 ||
              ClsGlobal.Matriz1[9][6] == 222 ||
              ClsGlobal.Matriz1[9][6] == 223 ||
              ClsGlobal.Matriz1[9][6] == 231 ||
              ClsGlobal.Matriz1[9][6] == 232 ||
              ClsGlobal.Matriz1[9][6] == 233 ||
              ClsGlobal.Matriz1[9][6] == 321 ||
              ClsGlobal.Matriz1[9][6] == 322 ||
              ClsGlobal.Matriz1[9][6] == 331 ||
              ClsGlobal.Matriz1[9][6] == 332){
                JBJ7_1.setEnabled(false);
           }else{
                JBJ7_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][7] == 1 ||
              ClsGlobal.Matriz1[9][7] == 121 ||
              ClsGlobal.Matriz1[9][7] == 122 ||
              ClsGlobal.Matriz1[9][7] == 123 ||
              ClsGlobal.Matriz1[9][7] == 124 ||
              ClsGlobal.Matriz1[9][7] == 131 ||
              ClsGlobal.Matriz1[9][7] == 132 ||
              ClsGlobal.Matriz1[9][7] == 133 ||
              ClsGlobal.Matriz1[9][7] == 134 ||
              ClsGlobal.Matriz1[9][7] == 221 ||
              ClsGlobal.Matriz1[9][7] == 222 ||
              ClsGlobal.Matriz1[9][7] == 223 ||
              ClsGlobal.Matriz1[9][7] == 231 ||
              ClsGlobal.Matriz1[9][7] == 232 ||
              ClsGlobal.Matriz1[9][7] == 233 ||
              ClsGlobal.Matriz1[9][7] == 321 ||
              ClsGlobal.Matriz1[9][7] == 322 ||
              ClsGlobal.Matriz1[9][7] == 331 ||
              ClsGlobal.Matriz1[9][7] == 332){
                JBJ8_1.setEnabled(false);
           }else{
                JBJ8_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][8] == 1 ||
              ClsGlobal.Matriz1[9][8] == 121 ||
              ClsGlobal.Matriz1[9][8] == 122 ||
              ClsGlobal.Matriz1[9][8] == 123 ||
              ClsGlobal.Matriz1[9][8] == 124 ||
              ClsGlobal.Matriz1[9][8] == 131 ||
              ClsGlobal.Matriz1[9][8] == 132 ||
              ClsGlobal.Matriz1[9][8] == 133 ||
              ClsGlobal.Matriz1[9][8] == 134 ||
              ClsGlobal.Matriz1[9][8] == 221 ||
              ClsGlobal.Matriz1[9][8] == 222 ||
              ClsGlobal.Matriz1[9][8] == 223 ||
              ClsGlobal.Matriz1[9][8] == 231 ||
              ClsGlobal.Matriz1[9][8] == 232 ||
              ClsGlobal.Matriz1[9][8] == 233 ||
              ClsGlobal.Matriz1[9][8] == 321 ||
              ClsGlobal.Matriz1[9][8] == 322 ||
              ClsGlobal.Matriz1[9][8] == 331 ||
              ClsGlobal.Matriz1[9][8] == 332){
                JBJ9_1.setEnabled(false);
           }else{
                JBJ9_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz1[9][9] == 1 ||
              ClsGlobal.Matriz1[9][9] == 121 ||
              ClsGlobal.Matriz1[9][9] == 122 ||
              ClsGlobal.Matriz1[9][9] == 123 ||
              ClsGlobal.Matriz1[9][9] == 124 ||
              ClsGlobal.Matriz1[9][9] == 131 ||
              ClsGlobal.Matriz1[9][9] == 132 ||
              ClsGlobal.Matriz1[9][9] == 133 ||
              ClsGlobal.Matriz1[9][9] == 134 ||
              ClsGlobal.Matriz1[9][9] == 221 ||
              ClsGlobal.Matriz1[9][9] == 222 ||
              ClsGlobal.Matriz1[9][9] == 223 ||
              ClsGlobal.Matriz1[9][9] == 231 ||
              ClsGlobal.Matriz1[9][9] == 232 ||
              ClsGlobal.Matriz1[9][9] == 233 ||
              ClsGlobal.Matriz1[9][9] == 321 ||
              ClsGlobal.Matriz1[9][9] == 322 ||
              ClsGlobal.Matriz1[9][9] == 331 ||
              ClsGlobal.Matriz1[9][9] == 332){
                JBJ10_1.setEnabled(false);
           }else{
                JBJ10_1.setEnabled(true);
           }
        }
        if(Juagador == 2){
           if(ClsGlobal.Matriz2[0][0] == 1 ||
              ClsGlobal.Matriz2[0][0] == 121 ||
              ClsGlobal.Matriz2[0][0] == 122 ||
              ClsGlobal.Matriz2[0][0] == 123 ||
              ClsGlobal.Matriz2[0][0] == 124 ||
              ClsGlobal.Matriz2[0][0] == 131 ||
              ClsGlobal.Matriz2[0][0] == 132 ||
              ClsGlobal.Matriz2[0][0] == 133 ||
              ClsGlobal.Matriz2[0][0] == 134 ||
              ClsGlobal.Matriz2[0][0] == 221 ||
              ClsGlobal.Matriz2[0][0] == 222 ||
              ClsGlobal.Matriz2[0][0] == 223 ||
              ClsGlobal.Matriz2[0][0] == 231 ||
              ClsGlobal.Matriz2[0][0] == 232 ||
              ClsGlobal.Matriz2[0][0] == 233 ||
              ClsGlobal.Matriz2[0][0] == 321 ||
              ClsGlobal.Matriz2[0][0] == 322 ||
              ClsGlobal.Matriz2[0][0] == 331 ||
              ClsGlobal.Matriz2[0][0] == 332){
                JBA1_2.setEnabled(false);
           }else{
                JBA1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][1] == 1 ||
              ClsGlobal.Matriz2[0][1] == 121 ||
              ClsGlobal.Matriz2[0][1] == 122 ||
              ClsGlobal.Matriz2[0][1] == 123 ||
              ClsGlobal.Matriz2[0][1] == 124 ||
              ClsGlobal.Matriz2[0][1] == 131 ||
              ClsGlobal.Matriz2[0][1] == 132 ||
              ClsGlobal.Matriz2[0][1] == 133 ||
              ClsGlobal.Matriz2[0][1] == 134 ||
              ClsGlobal.Matriz2[0][1] == 221 ||
              ClsGlobal.Matriz2[0][1] == 222 ||
              ClsGlobal.Matriz2[0][1] == 223 ||
              ClsGlobal.Matriz2[0][1] == 231 ||
              ClsGlobal.Matriz2[0][1] == 232 ||
              ClsGlobal.Matriz2[0][1] == 233 ||
              ClsGlobal.Matriz2[0][1] == 321 ||
              ClsGlobal.Matriz2[0][1] == 322 ||
              ClsGlobal.Matriz2[0][1] == 331 ||
              ClsGlobal.Matriz2[0][1] == 332){
                JBA2_2.setEnabled(false);
           }else{
                JBA2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][2] == 1 ||
              ClsGlobal.Matriz2[0][2] == 121 ||
              ClsGlobal.Matriz2[0][2] == 122 ||
              ClsGlobal.Matriz2[0][2] == 123 ||
              ClsGlobal.Matriz2[0][2] == 124 ||
              ClsGlobal.Matriz2[0][2] == 131 ||
              ClsGlobal.Matriz2[0][2] == 132 ||
              ClsGlobal.Matriz2[0][2] == 133 ||
              ClsGlobal.Matriz2[0][2] == 134 ||
              ClsGlobal.Matriz2[0][2] == 221 ||
              ClsGlobal.Matriz2[0][2] == 222 ||
              ClsGlobal.Matriz2[0][2] == 223 ||
              ClsGlobal.Matriz2[0][2] == 231 ||
              ClsGlobal.Matriz2[0][2] == 232 ||
              ClsGlobal.Matriz2[0][2] == 233 ||
              ClsGlobal.Matriz2[0][2] == 321 ||
              ClsGlobal.Matriz2[0][2] == 322 ||
              ClsGlobal.Matriz2[0][2] == 331 ||
              ClsGlobal.Matriz2[0][2] == 332){
                JBA3_2.setEnabled(false);
           }else{
                JBA3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][3] == 1 ||
              ClsGlobal.Matriz2[0][3] == 121 ||
              ClsGlobal.Matriz2[0][3] == 122 ||
              ClsGlobal.Matriz2[0][3] == 123 ||
              ClsGlobal.Matriz2[0][3] == 124 ||
              ClsGlobal.Matriz2[0][3] == 131 ||
              ClsGlobal.Matriz2[0][3] == 132 ||
              ClsGlobal.Matriz2[0][3] == 133 ||
              ClsGlobal.Matriz2[0][3] == 134 ||
              ClsGlobal.Matriz2[0][3] == 221 ||
              ClsGlobal.Matriz2[0][3] == 222 ||
              ClsGlobal.Matriz2[0][3] == 223 ||
              ClsGlobal.Matriz2[0][3] == 231 ||
              ClsGlobal.Matriz2[0][3] == 232 ||
              ClsGlobal.Matriz2[0][3] == 233 ||
              ClsGlobal.Matriz2[0][3] == 321 ||
              ClsGlobal.Matriz2[0][3] == 322 ||
              ClsGlobal.Matriz2[0][3] == 331 ||
              ClsGlobal.Matriz2[0][3] == 332){
                JBA4_2.setEnabled(false);
           }else{
                JBA4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][4] == 1 ||
              ClsGlobal.Matriz2[0][4] == 121 ||
              ClsGlobal.Matriz2[0][4] == 122 ||
              ClsGlobal.Matriz2[0][4] == 123 ||
              ClsGlobal.Matriz2[0][4] == 124 ||
              ClsGlobal.Matriz2[0][4] == 131 ||
              ClsGlobal.Matriz2[0][4] == 132 ||
              ClsGlobal.Matriz2[0][4] == 133 ||
              ClsGlobal.Matriz2[0][4] == 134 ||
              ClsGlobal.Matriz2[0][4] == 221 ||
              ClsGlobal.Matriz2[0][4] == 222 ||
              ClsGlobal.Matriz2[0][4] == 223 ||
              ClsGlobal.Matriz2[0][4] == 231 ||
              ClsGlobal.Matriz2[0][4] == 232 ||
              ClsGlobal.Matriz2[0][4] == 233 ||
              ClsGlobal.Matriz2[0][4] == 321 ||
              ClsGlobal.Matriz2[0][4] == 322 ||
              ClsGlobal.Matriz2[0][4] == 331 ||
              ClsGlobal.Matriz2[0][4] == 332){
                JBA5_2.setEnabled(false);
           }else{
                JBA5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][5] == 1 ||
              ClsGlobal.Matriz2[0][5] == 121 ||
              ClsGlobal.Matriz2[0][5] == 122 ||
              ClsGlobal.Matriz2[0][5] == 123 ||
              ClsGlobal.Matriz2[0][5] == 124 ||
              ClsGlobal.Matriz2[0][5] == 131 ||
              ClsGlobal.Matriz2[0][5] == 132 ||
              ClsGlobal.Matriz2[0][5] == 133 ||
              ClsGlobal.Matriz2[0][5] == 134 ||
              ClsGlobal.Matriz2[0][5] == 221 ||
              ClsGlobal.Matriz2[0][5] == 222 ||
              ClsGlobal.Matriz2[0][5] == 223 ||
              ClsGlobal.Matriz2[0][5] == 231 ||
              ClsGlobal.Matriz2[0][5] == 232 ||
              ClsGlobal.Matriz2[0][5] == 233 ||
              ClsGlobal.Matriz2[0][5] == 321 ||
              ClsGlobal.Matriz2[0][5] == 322 ||
              ClsGlobal.Matriz2[0][5] == 331 ||
              ClsGlobal.Matriz2[0][5] == 332){
                JBA6_2.setEnabled(false);
           }else{
                JBA6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][6] == 1 ||
              ClsGlobal.Matriz2[0][6] == 121 ||
              ClsGlobal.Matriz2[0][6] == 122 ||
              ClsGlobal.Matriz2[0][6] == 123 ||
              ClsGlobal.Matriz2[0][6] == 124 ||
              ClsGlobal.Matriz2[0][6] == 131 ||
              ClsGlobal.Matriz2[0][6] == 132 ||
              ClsGlobal.Matriz2[0][6] == 133 ||
              ClsGlobal.Matriz2[0][6] == 134 ||
              ClsGlobal.Matriz2[0][6] == 221 ||
              ClsGlobal.Matriz2[0][6] == 222 ||
              ClsGlobal.Matriz2[0][6] == 223 ||
              ClsGlobal.Matriz2[0][6] == 231 ||
              ClsGlobal.Matriz2[0][6] == 232 ||
              ClsGlobal.Matriz2[0][6] == 233 ||
              ClsGlobal.Matriz2[0][6] == 321 ||
              ClsGlobal.Matriz2[0][6] == 322 ||
              ClsGlobal.Matriz2[0][6] == 331 ||
              ClsGlobal.Matriz2[0][6] == 332){
                JBA7_2.setEnabled(false);
           }else{
                JBA7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][7] == 1 ||
              ClsGlobal.Matriz2[0][7] == 121 ||
              ClsGlobal.Matriz2[0][7] == 122 ||
              ClsGlobal.Matriz2[0][7] == 123 ||
              ClsGlobal.Matriz2[0][7] == 124 ||
              ClsGlobal.Matriz2[0][7] == 131 ||
              ClsGlobal.Matriz2[0][7] == 132 ||
              ClsGlobal.Matriz2[0][7] == 133 ||
              ClsGlobal.Matriz2[0][7] == 134 ||
              ClsGlobal.Matriz2[0][7] == 221 ||
              ClsGlobal.Matriz2[0][7] == 222 ||
              ClsGlobal.Matriz2[0][7] == 223 ||
              ClsGlobal.Matriz2[0][7] == 231 ||
              ClsGlobal.Matriz2[0][7] == 232 ||
              ClsGlobal.Matriz2[0][7] == 233 ||
              ClsGlobal.Matriz2[0][7] == 321 ||
              ClsGlobal.Matriz2[0][7] == 322 ||
              ClsGlobal.Matriz2[0][7] == 331 ||
              ClsGlobal.Matriz2[0][7] == 332){
                JBA8_2.setEnabled(false);
           }else{
                JBA8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][8] == 1 ||
              ClsGlobal.Matriz2[0][8] == 121 ||
              ClsGlobal.Matriz2[0][8] == 122 ||
              ClsGlobal.Matriz2[0][8] == 123 ||
              ClsGlobal.Matriz2[0][8] == 124 ||
              ClsGlobal.Matriz2[0][8] == 131 ||
              ClsGlobal.Matriz2[0][8] == 132 ||
              ClsGlobal.Matriz2[0][8] == 133 ||
              ClsGlobal.Matriz2[0][8] == 134 ||
              ClsGlobal.Matriz2[0][8] == 221 ||
              ClsGlobal.Matriz2[0][8] == 222 ||
              ClsGlobal.Matriz2[0][8] == 223 ||
              ClsGlobal.Matriz2[0][8] == 231 ||
              ClsGlobal.Matriz2[0][8] == 232 ||
              ClsGlobal.Matriz2[0][8] == 233 ||
              ClsGlobal.Matriz2[0][8] == 321 ||
              ClsGlobal.Matriz2[0][8] == 322 ||
              ClsGlobal.Matriz2[0][8] == 331 ||
              ClsGlobal.Matriz2[0][8] == 332){
                JBA9_2.setEnabled(false);
           }else{
                JBA9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[0][9] == 1 ||
              ClsGlobal.Matriz2[0][9] == 121 ||
              ClsGlobal.Matriz2[0][9] == 122 ||
              ClsGlobal.Matriz2[0][9] == 123 ||
              ClsGlobal.Matriz2[0][9] == 124 ||
              ClsGlobal.Matriz2[0][9] == 131 ||
              ClsGlobal.Matriz2[0][9] == 132 ||
              ClsGlobal.Matriz2[0][9] == 133 ||
              ClsGlobal.Matriz2[0][9] == 134 ||
              ClsGlobal.Matriz2[0][9] == 221 ||
              ClsGlobal.Matriz2[0][9] == 222 ||
              ClsGlobal.Matriz2[0][9] == 223 ||
              ClsGlobal.Matriz2[0][9] == 231 ||
              ClsGlobal.Matriz2[0][9] == 232 ||
              ClsGlobal.Matriz2[0][9] == 233 ||
              ClsGlobal.Matriz2[0][9] == 321 ||
              ClsGlobal.Matriz2[0][9] == 322 ||
              ClsGlobal.Matriz2[0][9] == 331 ||
              ClsGlobal.Matriz2[0][9] == 332){
                JBA10_2.setEnabled(false);
           }else{
                JBA10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][0] == 1 ||
              ClsGlobal.Matriz2[1][0] == 121 ||
              ClsGlobal.Matriz2[1][0] == 122 ||
              ClsGlobal.Matriz2[1][0] == 123 ||
              ClsGlobal.Matriz2[1][0] == 124 ||
              ClsGlobal.Matriz2[1][0] == 131 ||
              ClsGlobal.Matriz2[1][0] == 132 ||
              ClsGlobal.Matriz2[1][0] == 133 ||
              ClsGlobal.Matriz2[1][0] == 134 ||
              ClsGlobal.Matriz2[1][0] == 221 ||
              ClsGlobal.Matriz2[1][0] == 222 ||
              ClsGlobal.Matriz2[1][0] == 223 ||
              ClsGlobal.Matriz2[1][0] == 231 ||
              ClsGlobal.Matriz2[1][0] == 232 ||
              ClsGlobal.Matriz2[1][0] == 233 ||
              ClsGlobal.Matriz2[1][0] == 321 ||
              ClsGlobal.Matriz2[1][0] == 322 ||
              ClsGlobal.Matriz2[1][0] == 331 ||
              ClsGlobal.Matriz2[1][0] == 332){
                JBB1_2.setEnabled(false);
           }else{
                JBB1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][1] == 1 ||
              ClsGlobal.Matriz2[1][1] == 121 ||
              ClsGlobal.Matriz2[1][1] == 122 ||
              ClsGlobal.Matriz2[1][1] == 123 ||
              ClsGlobal.Matriz2[1][1] == 124 ||
              ClsGlobal.Matriz2[1][1] == 131 ||
              ClsGlobal.Matriz2[1][1] == 132 ||
              ClsGlobal.Matriz2[1][1] == 133 ||
              ClsGlobal.Matriz2[1][1] == 134 ||
              ClsGlobal.Matriz2[1][1] == 221 ||
              ClsGlobal.Matriz2[1][1] == 222 ||
              ClsGlobal.Matriz2[1][1] == 223 ||
              ClsGlobal.Matriz2[1][1] == 231 ||
              ClsGlobal.Matriz2[1][1] == 232 ||
              ClsGlobal.Matriz2[1][1] == 233 ||
              ClsGlobal.Matriz2[1][1] == 321 ||
              ClsGlobal.Matriz2[1][1] == 322 ||
              ClsGlobal.Matriz2[1][1] == 331 ||
              ClsGlobal.Matriz2[1][1] == 332){
                JBB2_2.setEnabled(false);
           }else{
                JBB2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][2] == 1 ||
              ClsGlobal.Matriz2[1][2] == 121 ||
              ClsGlobal.Matriz2[1][2] == 122 ||
              ClsGlobal.Matriz2[1][2] == 123 ||
              ClsGlobal.Matriz2[1][2] == 124 ||
              ClsGlobal.Matriz2[1][2] == 131 ||
              ClsGlobal.Matriz2[1][2] == 132 ||
              ClsGlobal.Matriz2[1][2] == 133 ||
              ClsGlobal.Matriz2[1][2] == 134 ||
              ClsGlobal.Matriz2[1][2] == 221 ||
              ClsGlobal.Matriz2[1][2] == 222 ||
              ClsGlobal.Matriz2[1][2] == 223 ||
              ClsGlobal.Matriz2[1][2] == 231 ||
              ClsGlobal.Matriz2[1][2] == 232 ||
              ClsGlobal.Matriz2[1][2] == 233 ||
              ClsGlobal.Matriz2[1][2] == 321 ||
              ClsGlobal.Matriz2[1][2] == 322 ||
              ClsGlobal.Matriz2[1][2] == 331 ||
              ClsGlobal.Matriz2[1][2] == 332){
                JBB3_2.setEnabled(false);
           }else{
                JBB3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][3] == 1 ||
              ClsGlobal.Matriz2[1][3] == 121 ||
              ClsGlobal.Matriz2[1][3] == 122 ||
              ClsGlobal.Matriz2[1][3] == 123 ||
              ClsGlobal.Matriz2[1][3] == 124 ||
              ClsGlobal.Matriz2[1][3] == 131 ||
              ClsGlobal.Matriz2[1][3] == 132 ||
              ClsGlobal.Matriz2[1][3] == 133 ||
              ClsGlobal.Matriz2[1][3] == 134 ||
              ClsGlobal.Matriz2[1][3] == 221 ||
              ClsGlobal.Matriz2[1][3] == 222 ||
              ClsGlobal.Matriz2[1][3] == 223 ||
              ClsGlobal.Matriz2[1][3] == 231 ||
              ClsGlobal.Matriz2[1][3] == 232 ||
              ClsGlobal.Matriz2[1][3] == 233 ||
              ClsGlobal.Matriz2[1][3] == 321 ||
              ClsGlobal.Matriz2[1][3] == 322 ||
              ClsGlobal.Matriz2[1][3] == 331 ||
              ClsGlobal.Matriz2[1][3] == 332){
                JBB4_2.setEnabled(false);
           }else{
                JBB4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][4] == 1 ||
              ClsGlobal.Matriz2[1][4] == 121 ||
              ClsGlobal.Matriz2[1][4] == 122 ||
              ClsGlobal.Matriz2[1][4] == 123 ||
              ClsGlobal.Matriz2[1][4] == 124 ||
              ClsGlobal.Matriz2[1][4] == 131 ||
              ClsGlobal.Matriz2[1][4] == 132 ||
              ClsGlobal.Matriz2[1][4] == 133 ||
              ClsGlobal.Matriz2[1][4] == 134 ||
              ClsGlobal.Matriz2[1][4] == 221 ||
              ClsGlobal.Matriz2[1][4] == 222 ||
              ClsGlobal.Matriz2[1][4] == 223 ||
              ClsGlobal.Matriz2[1][4] == 231 ||
              ClsGlobal.Matriz2[1][4] == 232 ||
              ClsGlobal.Matriz2[1][4] == 233 ||
              ClsGlobal.Matriz2[1][4] == 321 ||
              ClsGlobal.Matriz2[1][4] == 322 ||
              ClsGlobal.Matriz2[1][4] == 331 ||
              ClsGlobal.Matriz2[1][4] == 332){
                JBB5_2.setEnabled(false);
           }else{
                JBB5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][5] == 1 ||
              ClsGlobal.Matriz2[1][5] == 121 ||
              ClsGlobal.Matriz2[1][5] == 122 ||
              ClsGlobal.Matriz2[1][5] == 123 ||
              ClsGlobal.Matriz2[1][5] == 124 ||
              ClsGlobal.Matriz2[1][5] == 131 ||
              ClsGlobal.Matriz2[1][5] == 132 ||
              ClsGlobal.Matriz2[1][5] == 133 ||
              ClsGlobal.Matriz2[1][5] == 134 ||
              ClsGlobal.Matriz2[1][5] == 221 ||
              ClsGlobal.Matriz2[1][5] == 222 ||
              ClsGlobal.Matriz2[1][5] == 223 ||
              ClsGlobal.Matriz2[1][5] == 231 ||
              ClsGlobal.Matriz2[1][5] == 232 ||
              ClsGlobal.Matriz2[1][5] == 233 ||
              ClsGlobal.Matriz2[1][5] == 321 ||
              ClsGlobal.Matriz2[1][5] == 322 ||
              ClsGlobal.Matriz2[1][5] == 331 ||
              ClsGlobal.Matriz2[1][5] == 332){
                JBB6_2.setEnabled(false);
           }else{
                JBB6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][6] == 1 ||
              ClsGlobal.Matriz2[1][6] == 121 ||
              ClsGlobal.Matriz2[1][6] == 122 ||
              ClsGlobal.Matriz2[1][6] == 123 ||
              ClsGlobal.Matriz2[1][6] == 124 ||
              ClsGlobal.Matriz2[1][6] == 131 ||
              ClsGlobal.Matriz2[1][6] == 132 ||
              ClsGlobal.Matriz2[1][6] == 133 ||
              ClsGlobal.Matriz2[1][6] == 134 ||
              ClsGlobal.Matriz2[1][6] == 221 ||
              ClsGlobal.Matriz2[1][6] == 222 ||
              ClsGlobal.Matriz2[1][6] == 223 ||
              ClsGlobal.Matriz2[1][6] == 231 ||
              ClsGlobal.Matriz2[1][6] == 232 ||
              ClsGlobal.Matriz2[1][6] == 233 ||
              ClsGlobal.Matriz2[1][6] == 321 ||
              ClsGlobal.Matriz2[1][6] == 322 ||
              ClsGlobal.Matriz2[1][6] == 331 ||
              ClsGlobal.Matriz2[1][6] == 332){
                JBB7_2.setEnabled(false);
           }else{
                JBB7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][7] == 1 ||
              ClsGlobal.Matriz2[1][7] == 121 ||
              ClsGlobal.Matriz2[1][7] == 122 ||
              ClsGlobal.Matriz2[1][7] == 123 ||
              ClsGlobal.Matriz2[1][7] == 124 ||
              ClsGlobal.Matriz2[1][7] == 131 ||
              ClsGlobal.Matriz2[1][7] == 132 ||
              ClsGlobal.Matriz2[1][7] == 133 ||
              ClsGlobal.Matriz2[1][7] == 134 ||
              ClsGlobal.Matriz2[1][7] == 221 ||
              ClsGlobal.Matriz2[1][7] == 222 ||
              ClsGlobal.Matriz2[1][7] == 223 ||
              ClsGlobal.Matriz2[1][7] == 231 ||
              ClsGlobal.Matriz2[1][7] == 232 ||
              ClsGlobal.Matriz2[1][7] == 233 ||
              ClsGlobal.Matriz2[1][7] == 321 ||
              ClsGlobal.Matriz2[1][7] == 322 ||
              ClsGlobal.Matriz2[1][7] == 331 ||
              ClsGlobal.Matriz2[1][7] == 332){
                JBB8_2.setEnabled(false);
           }else{
                JBB8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][8] == 1 ||
              ClsGlobal.Matriz2[1][8] == 121 ||
              ClsGlobal.Matriz2[1][8] == 122 ||
              ClsGlobal.Matriz2[1][8] == 123 ||
              ClsGlobal.Matriz2[1][8] == 124 ||
              ClsGlobal.Matriz2[1][8] == 131 ||
              ClsGlobal.Matriz2[1][8] == 132 ||
              ClsGlobal.Matriz2[1][8] == 133 ||
              ClsGlobal.Matriz2[1][8] == 134 ||
              ClsGlobal.Matriz2[1][8] == 221 ||
              ClsGlobal.Matriz2[1][8] == 222 ||
              ClsGlobal.Matriz2[1][8] == 223 ||
              ClsGlobal.Matriz2[1][8] == 231 ||
              ClsGlobal.Matriz2[1][8] == 232 ||
              ClsGlobal.Matriz2[1][8] == 233 ||
              ClsGlobal.Matriz2[1][8] == 321 ||
              ClsGlobal.Matriz2[1][8] == 322 ||
              ClsGlobal.Matriz2[1][8] == 331 ||
              ClsGlobal.Matriz2[1][8] == 332){
                JBB9_2.setEnabled(false);
           }else{
                JBB9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[1][9] == 1 ||
              ClsGlobal.Matriz2[1][9] == 121 ||
              ClsGlobal.Matriz2[1][9] == 122 ||
              ClsGlobal.Matriz2[1][9] == 123 ||
              ClsGlobal.Matriz2[1][9] == 124 ||
              ClsGlobal.Matriz2[1][9] == 131 ||
              ClsGlobal.Matriz2[1][9] == 132 ||
              ClsGlobal.Matriz2[1][9] == 133 ||
              ClsGlobal.Matriz2[1][9] == 134 ||
              ClsGlobal.Matriz2[1][9] == 221 ||
              ClsGlobal.Matriz2[1][9] == 222 ||
              ClsGlobal.Matriz2[1][9] == 223 ||
              ClsGlobal.Matriz2[1][9] == 231 ||
              ClsGlobal.Matriz2[1][9] == 232 ||
              ClsGlobal.Matriz2[1][9] == 233 ||
              ClsGlobal.Matriz2[1][9] == 321 ||
              ClsGlobal.Matriz2[1][9] == 322 ||
              ClsGlobal.Matriz2[1][9] == 331 ||
              ClsGlobal.Matriz2[1][9] == 332){
                JBB10_2.setEnabled(false);
           }else{
                JBB10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][0] == 1 ||
              ClsGlobal.Matriz2[2][0] == 121 ||
              ClsGlobal.Matriz2[2][0] == 122 ||
              ClsGlobal.Matriz2[2][0] == 123 ||
              ClsGlobal.Matriz2[2][0] == 124 ||
              ClsGlobal.Matriz2[2][0] == 131 ||
              ClsGlobal.Matriz2[2][0] == 132 ||
              ClsGlobal.Matriz2[2][0] == 133 ||
              ClsGlobal.Matriz2[2][0] == 134 ||
              ClsGlobal.Matriz2[2][0] == 221 ||
              ClsGlobal.Matriz2[2][0] == 222 ||
              ClsGlobal.Matriz2[2][0] == 223 ||
              ClsGlobal.Matriz2[2][0] == 231 ||
              ClsGlobal.Matriz2[2][0] == 232 ||
              ClsGlobal.Matriz2[2][0] == 233 ||
              ClsGlobal.Matriz2[2][0] == 321 ||
              ClsGlobal.Matriz2[2][0] == 322 ||
              ClsGlobal.Matriz2[2][0] == 331 ||
              ClsGlobal.Matriz2[2][0] == 332){
                JBC1_2.setEnabled(false);
           }else{
                JBC1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][1] == 1 ||
              ClsGlobal.Matriz2[2][1] == 121 ||
              ClsGlobal.Matriz2[2][1] == 122 ||
              ClsGlobal.Matriz2[2][1] == 123 ||
              ClsGlobal.Matriz2[2][1] == 124 ||
              ClsGlobal.Matriz2[2][1] == 131 ||
              ClsGlobal.Matriz2[2][1] == 132 ||
              ClsGlobal.Matriz2[2][1] == 133 ||
              ClsGlobal.Matriz2[2][1] == 134 ||
              ClsGlobal.Matriz2[2][1] == 221 ||
              ClsGlobal.Matriz2[2][1] == 222 ||
              ClsGlobal.Matriz2[2][1] == 223 ||
              ClsGlobal.Matriz2[2][1] == 231 ||
              ClsGlobal.Matriz2[2][1] == 232 ||
              ClsGlobal.Matriz2[2][1] == 233 ||
              ClsGlobal.Matriz2[2][1] == 321 ||
              ClsGlobal.Matriz2[2][1] == 322 ||
              ClsGlobal.Matriz2[2][1] == 331 ||
              ClsGlobal.Matriz2[2][1] == 332){
                JBC2_2.setEnabled(false);
           }else{
                JBC2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][2] == 1 ||
              ClsGlobal.Matriz2[2][2] == 121 ||
              ClsGlobal.Matriz2[2][2] == 122 ||
              ClsGlobal.Matriz2[2][2] == 123 ||
              ClsGlobal.Matriz2[2][2] == 124 ||
              ClsGlobal.Matriz2[2][2] == 131 ||
              ClsGlobal.Matriz2[2][2] == 132 ||
              ClsGlobal.Matriz2[2][2] == 133 ||
              ClsGlobal.Matriz2[2][2] == 134 ||
              ClsGlobal.Matriz2[2][2] == 221 ||
              ClsGlobal.Matriz2[2][2] == 222 ||
              ClsGlobal.Matriz2[2][2] == 223 ||
              ClsGlobal.Matriz2[2][2] == 231 ||
              ClsGlobal.Matriz2[2][2] == 232 ||
              ClsGlobal.Matriz2[2][2] == 233 ||
              ClsGlobal.Matriz2[2][2] == 321 ||
              ClsGlobal.Matriz2[2][2] == 322 ||
              ClsGlobal.Matriz2[2][2] == 331 ||
              ClsGlobal.Matriz2[2][2] == 332){
                JBC3_2.setEnabled(false);
           }else{
                JBC3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][3] == 1 ||
              ClsGlobal.Matriz2[2][3] == 121 ||
              ClsGlobal.Matriz2[2][3] == 122 ||
              ClsGlobal.Matriz2[2][3] == 123 ||
              ClsGlobal.Matriz2[2][3] == 124 ||
              ClsGlobal.Matriz2[2][3] == 131 ||
              ClsGlobal.Matriz2[2][3] == 132 ||
              ClsGlobal.Matriz2[2][3] == 133 ||
              ClsGlobal.Matriz2[2][3] == 134 ||
              ClsGlobal.Matriz2[2][3] == 221 ||
              ClsGlobal.Matriz2[2][3] == 222 ||
              ClsGlobal.Matriz2[2][3] == 223 ||
              ClsGlobal.Matriz2[2][3] == 231 ||
              ClsGlobal.Matriz2[2][3] == 232 ||
              ClsGlobal.Matriz2[2][3] == 233 ||
              ClsGlobal.Matriz2[2][3] == 321 ||
              ClsGlobal.Matriz2[2][3] == 322 ||
              ClsGlobal.Matriz2[2][3] == 331 ||
              ClsGlobal.Matriz2[2][3] == 332){
                JBC4_2.setEnabled(false);
           }else{
                JBC4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][4] == 1 ||
              ClsGlobal.Matriz2[2][4] == 121 ||
              ClsGlobal.Matriz2[2][4] == 122 ||
              ClsGlobal.Matriz2[2][4] == 123 ||
              ClsGlobal.Matriz2[2][4] == 124 ||
              ClsGlobal.Matriz2[2][4] == 131 ||
              ClsGlobal.Matriz2[2][4] == 132 ||
              ClsGlobal.Matriz2[2][4] == 133 ||
              ClsGlobal.Matriz2[2][4] == 134 ||
              ClsGlobal.Matriz2[2][4] == 221 ||
              ClsGlobal.Matriz2[2][4] == 222 ||
              ClsGlobal.Matriz2[2][4] == 223 ||
              ClsGlobal.Matriz2[2][4] == 231 ||
              ClsGlobal.Matriz2[2][4] == 232 ||
              ClsGlobal.Matriz2[2][4] == 233 ||
              ClsGlobal.Matriz2[2][4] == 321 ||
              ClsGlobal.Matriz2[2][4] == 322 ||
              ClsGlobal.Matriz2[2][4] == 331 ||
              ClsGlobal.Matriz2[2][4] == 332){
                JBC5_2.setEnabled(false);
           }else{
                JBC5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][5] == 1 ||
              ClsGlobal.Matriz2[2][5] == 121 ||
              ClsGlobal.Matriz2[2][5] == 122 ||
              ClsGlobal.Matriz2[2][5] == 123 ||
              ClsGlobal.Matriz2[2][5] == 124 ||
              ClsGlobal.Matriz2[2][5] == 131 ||
              ClsGlobal.Matriz2[2][5] == 132 ||
              ClsGlobal.Matriz2[2][5] == 133 ||
              ClsGlobal.Matriz2[2][5] == 134 ||
              ClsGlobal.Matriz2[2][5] == 221 ||
              ClsGlobal.Matriz2[2][5] == 222 ||
              ClsGlobal.Matriz2[2][5] == 223 ||
              ClsGlobal.Matriz2[2][5] == 231 ||
              ClsGlobal.Matriz2[2][5] == 232 ||
              ClsGlobal.Matriz2[2][5] == 233 ||
              ClsGlobal.Matriz2[2][5] == 321 ||
              ClsGlobal.Matriz2[2][5] == 322 ||
              ClsGlobal.Matriz2[2][5] == 331 ||
              ClsGlobal.Matriz2[2][5] == 332){
                JBC6_2.setEnabled(false);
           }else{
                JBC6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][6] == 1 ||
              ClsGlobal.Matriz2[2][6] == 121 ||
              ClsGlobal.Matriz2[2][6] == 122 ||
              ClsGlobal.Matriz2[2][6] == 123 ||
              ClsGlobal.Matriz2[2][6] == 124 ||
              ClsGlobal.Matriz2[2][6] == 131 ||
              ClsGlobal.Matriz2[2][6] == 132 ||
              ClsGlobal.Matriz2[2][6] == 133 ||
              ClsGlobal.Matriz2[2][6] == 134 ||
              ClsGlobal.Matriz2[2][6] == 221 ||
              ClsGlobal.Matriz2[2][6] == 222 ||
              ClsGlobal.Matriz2[2][6] == 223 ||
              ClsGlobal.Matriz2[2][6] == 231 ||
              ClsGlobal.Matriz2[2][6] == 232 ||
              ClsGlobal.Matriz2[2][6] == 233 ||
              ClsGlobal.Matriz2[2][6] == 321 ||
              ClsGlobal.Matriz2[2][6] == 322 ||
              ClsGlobal.Matriz2[2][6] == 331 ||
              ClsGlobal.Matriz2[2][6] == 332){
                JBC7_2.setEnabled(false);
           }else{
                JBC7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][7] == 1 ||
              ClsGlobal.Matriz2[2][7] == 121 ||
              ClsGlobal.Matriz2[2][7] == 122 ||
              ClsGlobal.Matriz2[2][7] == 123 ||
              ClsGlobal.Matriz2[2][7] == 124 ||
              ClsGlobal.Matriz2[2][7] == 131 ||
              ClsGlobal.Matriz2[2][7] == 132 ||
              ClsGlobal.Matriz2[2][7] == 133 ||
              ClsGlobal.Matriz2[2][7] == 134 ||
              ClsGlobal.Matriz2[2][7] == 221 ||
              ClsGlobal.Matriz2[2][7] == 222 ||
              ClsGlobal.Matriz2[2][7] == 223 ||
              ClsGlobal.Matriz2[2][7] == 231 ||
              ClsGlobal.Matriz2[2][7] == 232 ||
              ClsGlobal.Matriz2[2][7] == 233 ||
              ClsGlobal.Matriz2[2][7] == 321 ||
              ClsGlobal.Matriz2[2][7] == 322 ||
              ClsGlobal.Matriz2[2][7] == 331 ||
              ClsGlobal.Matriz2[2][7] == 332){
                JBC8_2.setEnabled(false);
           }else{
                JBC8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][8] == 1 ||
              ClsGlobal.Matriz2[2][8] == 121 ||
              ClsGlobal.Matriz2[2][8] == 122 ||
              ClsGlobal.Matriz2[2][8] == 123 ||
              ClsGlobal.Matriz2[2][8] == 124 ||
              ClsGlobal.Matriz2[2][8] == 131 ||
              ClsGlobal.Matriz2[2][8] == 132 ||
              ClsGlobal.Matriz2[2][8] == 133 ||
              ClsGlobal.Matriz2[2][8] == 134 ||
              ClsGlobal.Matriz2[2][8] == 221 ||
              ClsGlobal.Matriz2[2][8] == 222 ||
              ClsGlobal.Matriz2[2][8] == 223 ||
              ClsGlobal.Matriz2[2][8] == 231 ||
              ClsGlobal.Matriz2[2][8] == 232 ||
              ClsGlobal.Matriz2[2][8] == 233 ||
              ClsGlobal.Matriz2[2][8] == 321 ||
              ClsGlobal.Matriz2[2][8] == 322 ||
              ClsGlobal.Matriz2[2][8] == 331 ||
              ClsGlobal.Matriz2[2][8] == 332){
                JBC9_2.setEnabled(false);
           }else{
                JBC9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[2][9] == 1 ||
              ClsGlobal.Matriz2[2][9] == 121 ||
              ClsGlobal.Matriz2[2][9] == 122 ||
              ClsGlobal.Matriz2[2][9] == 123 ||
              ClsGlobal.Matriz2[2][9] == 124 ||
              ClsGlobal.Matriz2[2][9] == 131 ||
              ClsGlobal.Matriz2[2][9] == 132 ||
              ClsGlobal.Matriz2[2][9] == 133 ||
              ClsGlobal.Matriz2[2][9] == 134 ||
              ClsGlobal.Matriz2[2][9] == 221 ||
              ClsGlobal.Matriz2[2][9] == 222 ||
              ClsGlobal.Matriz2[2][9] == 223 ||
              ClsGlobal.Matriz2[2][9] == 231 ||
              ClsGlobal.Matriz2[2][9] == 232 ||
              ClsGlobal.Matriz2[2][9] == 233 ||
              ClsGlobal.Matriz2[2][9] == 321 ||
              ClsGlobal.Matriz2[2][9] == 322 ||
              ClsGlobal.Matriz2[2][9] == 331 ||
              ClsGlobal.Matriz2[2][9] == 332){
                JBC10_2.setEnabled(false);
           }else{
                JBC10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][0] == 1 ||
              ClsGlobal.Matriz2[3][0] == 121 ||
              ClsGlobal.Matriz2[3][0] == 122 ||
              ClsGlobal.Matriz2[3][0] == 123 ||
              ClsGlobal.Matriz2[03][0] == 124 ||
              ClsGlobal.Matriz2[3][0] == 131 ||
              ClsGlobal.Matriz2[3][0] == 132 ||
              ClsGlobal.Matriz2[3][0] == 133 ||
              ClsGlobal.Matriz2[3][0] == 134 ||
              ClsGlobal.Matriz2[3][0] == 221 ||
              ClsGlobal.Matriz2[3][0] == 222 ||
              ClsGlobal.Matriz2[3][0] == 223 ||
              ClsGlobal.Matriz2[3][0] == 231 ||
              ClsGlobal.Matriz2[3][0] == 232 ||
              ClsGlobal.Matriz2[3][0] == 233 ||
              ClsGlobal.Matriz2[3][0] == 321 ||
              ClsGlobal.Matriz2[3][0] == 322 ||
              ClsGlobal.Matriz2[3][0] == 331 ||
              ClsGlobal.Matriz2[3][0] == 332){
                JBD1_2.setEnabled(false);
           }else{
                JBD1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][1] == 1 ||
              ClsGlobal.Matriz2[3][1] == 121 ||
              ClsGlobal.Matriz2[3][1] == 122 ||
              ClsGlobal.Matriz2[3][1] == 123 ||
              ClsGlobal.Matriz2[3][1] == 124 ||
              ClsGlobal.Matriz2[3][1] == 131 ||
              ClsGlobal.Matriz2[3][1] == 132 ||
              ClsGlobal.Matriz2[3][1] == 133 ||
              ClsGlobal.Matriz2[3][1] == 134 ||
              ClsGlobal.Matriz2[3][1] == 221 ||
              ClsGlobal.Matriz2[3][1] == 222 ||
              ClsGlobal.Matriz2[3][1] == 223 ||
              ClsGlobal.Matriz2[3][1] == 231 ||
              ClsGlobal.Matriz2[3][1] == 232 ||
              ClsGlobal.Matriz2[3][1] == 233 ||
              ClsGlobal.Matriz2[3][1] == 321 ||
              ClsGlobal.Matriz2[3][1] == 322 ||
              ClsGlobal.Matriz2[3][1] == 331 ||
              ClsGlobal.Matriz2[3][1] == 332){
                JBD2_2.setEnabled(false);
           }else{
                JBD2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][2] == 1 ||
              ClsGlobal.Matriz2[3][2] == 121 ||
              ClsGlobal.Matriz2[3][2] == 122 ||
              ClsGlobal.Matriz2[3][2] == 123 ||
              ClsGlobal.Matriz2[3][2] == 124 ||
              ClsGlobal.Matriz2[3][2] == 131 ||
              ClsGlobal.Matriz2[3][2] == 132 ||
              ClsGlobal.Matriz2[3][2] == 133 ||
              ClsGlobal.Matriz2[3][2] == 134 ||
              ClsGlobal.Matriz2[3][2] == 221 ||
              ClsGlobal.Matriz2[3][2] == 222 ||
              ClsGlobal.Matriz2[3][2] == 223 ||
              ClsGlobal.Matriz2[3][2] == 231 ||
              ClsGlobal.Matriz2[3][2] == 232 ||
              ClsGlobal.Matriz2[3][2] == 233 ||
              ClsGlobal.Matriz2[3][2] == 321 ||
              ClsGlobal.Matriz2[3][2] == 322 ||
              ClsGlobal.Matriz2[3][2] == 331 ||
              ClsGlobal.Matriz2[3][2] == 332){
                JBD3_2.setEnabled(false);
           }else{
                JBD3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][3] == 1 ||
              ClsGlobal.Matriz2[3][3] == 121 ||
              ClsGlobal.Matriz2[3][3] == 122 ||
              ClsGlobal.Matriz2[3][3] == 123 ||
              ClsGlobal.Matriz2[3][3] == 124 ||
              ClsGlobal.Matriz2[3][3] == 131 ||
              ClsGlobal.Matriz2[3][3] == 132 ||
              ClsGlobal.Matriz2[3][3] == 133 ||
              ClsGlobal.Matriz2[3][3] == 134 ||
              ClsGlobal.Matriz2[3][3] == 221 ||
              ClsGlobal.Matriz2[3][3] == 222 ||
              ClsGlobal.Matriz2[3][3] == 223 ||
              ClsGlobal.Matriz2[3][3] == 231 ||
              ClsGlobal.Matriz2[3][3] == 232 ||
              ClsGlobal.Matriz2[3][3] == 233 ||
              ClsGlobal.Matriz2[3][3] == 321 ||
              ClsGlobal.Matriz2[3][3] == 322 ||
              ClsGlobal.Matriz2[3][3] == 331 ||
              ClsGlobal.Matriz2[3][3] == 332){
                JBD4_2.setEnabled(false);
           }else{
                JBD4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][4] == 1 ||
              ClsGlobal.Matriz2[3][4] == 121 ||
              ClsGlobal.Matriz2[3][4] == 122 ||
              ClsGlobal.Matriz2[3][4] == 123 ||
              ClsGlobal.Matriz2[3][4] == 124 ||
              ClsGlobal.Matriz2[3][4] == 131 ||
              ClsGlobal.Matriz2[3][4] == 132 ||
              ClsGlobal.Matriz2[3][4] == 133 ||
              ClsGlobal.Matriz2[3][4] == 134 ||
              ClsGlobal.Matriz2[3][4] == 221 ||
              ClsGlobal.Matriz2[3][4] == 222 ||
              ClsGlobal.Matriz2[3][4] == 223 ||
              ClsGlobal.Matriz2[3][4] == 231 ||
              ClsGlobal.Matriz2[3][4] == 232 ||
              ClsGlobal.Matriz2[3][4] == 233 ||
              ClsGlobal.Matriz2[3][4] == 321 ||
              ClsGlobal.Matriz2[3][4] == 322 ||
              ClsGlobal.Matriz2[3][4] == 331 ||
              ClsGlobal.Matriz2[3][4] == 332){
                JBD5_2.setEnabled(false);
           }else{
                JBD5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][5] == 1 ||
              ClsGlobal.Matriz2[3][5] == 121 ||
              ClsGlobal.Matriz2[3][5] == 122 ||
              ClsGlobal.Matriz2[3][5] == 123 ||
              ClsGlobal.Matriz2[3][5] == 124 ||
              ClsGlobal.Matriz2[3][5] == 131 ||
              ClsGlobal.Matriz2[3][5] == 132 ||
              ClsGlobal.Matriz2[3][5] == 133 ||
              ClsGlobal.Matriz2[3][5] == 134 ||
              ClsGlobal.Matriz2[3][5] == 221 ||
              ClsGlobal.Matriz2[3][5] == 222 ||
              ClsGlobal.Matriz2[3][5] == 223 ||
              ClsGlobal.Matriz2[3][5] == 231 ||
              ClsGlobal.Matriz2[3][5] == 232 ||
              ClsGlobal.Matriz2[3][5] == 233 ||
              ClsGlobal.Matriz2[3][5] == 321 ||
              ClsGlobal.Matriz2[3][5] == 322 ||
              ClsGlobal.Matriz2[3][5] == 331 ||
              ClsGlobal.Matriz2[3][5] == 332){
                JBD6_2.setEnabled(false);
           }else{
                JBD6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][6] == 1 ||
              ClsGlobal.Matriz2[3][6] == 121 ||
              ClsGlobal.Matriz2[3][6] == 122 ||
              ClsGlobal.Matriz2[3][6] == 123 ||
              ClsGlobal.Matriz2[3][6] == 124 ||
              ClsGlobal.Matriz2[3][6] == 131 ||
              ClsGlobal.Matriz2[3][6] == 132 ||
              ClsGlobal.Matriz2[3][6] == 133 ||
              ClsGlobal.Matriz2[3][6] == 134 ||
              ClsGlobal.Matriz2[3][6] == 221 ||
              ClsGlobal.Matriz2[3][6] == 222 ||
              ClsGlobal.Matriz2[3][6] == 223 ||
              ClsGlobal.Matriz2[3][6] == 231 ||
              ClsGlobal.Matriz2[3][6] == 232 ||
              ClsGlobal.Matriz2[3][6] == 233 ||
              ClsGlobal.Matriz2[3][6] == 321 ||
              ClsGlobal.Matriz2[3][6] == 322 ||
              ClsGlobal.Matriz2[3][6] == 331 ||
              ClsGlobal.Matriz2[3][6] == 332){
                JBD7_2.setEnabled(false);
           }else{
                JBD7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][7] == 1 ||
              ClsGlobal.Matriz2[3][7] == 121 ||
              ClsGlobal.Matriz2[3][7] == 122 ||
              ClsGlobal.Matriz2[3][7] == 123 ||
              ClsGlobal.Matriz2[3][7] == 124 ||
              ClsGlobal.Matriz2[3][7] == 131 ||
              ClsGlobal.Matriz2[3][7] == 132 ||
              ClsGlobal.Matriz2[3][7] == 133 ||
              ClsGlobal.Matriz2[3][7] == 134 ||
              ClsGlobal.Matriz2[3][7] == 221 ||
              ClsGlobal.Matriz2[3][7] == 222 ||
              ClsGlobal.Matriz2[3][7] == 223 ||
              ClsGlobal.Matriz2[3][7] == 231 ||
              ClsGlobal.Matriz2[3][7] == 232 ||
              ClsGlobal.Matriz2[3][7] == 233 ||
              ClsGlobal.Matriz2[3][7] == 321 ||
              ClsGlobal.Matriz2[3][7] == 322 ||
              ClsGlobal.Matriz2[3][7] == 331 ||
              ClsGlobal.Matriz2[3][7] == 332){
                JBD8_2.setEnabled(false);
           }else{
                JBD8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][8] == 1 ||
              ClsGlobal.Matriz2[3][8] == 121 ||
              ClsGlobal.Matriz2[3][8] == 122 ||
              ClsGlobal.Matriz2[3][8] == 123 ||
              ClsGlobal.Matriz2[3][8] == 124 ||
              ClsGlobal.Matriz2[3][8] == 131 ||
              ClsGlobal.Matriz2[3][8] == 132 ||
              ClsGlobal.Matriz2[3][8] == 133 ||
              ClsGlobal.Matriz2[3][8] == 134 ||
              ClsGlobal.Matriz2[3][8] == 221 ||
              ClsGlobal.Matriz2[3][8] == 222 ||
              ClsGlobal.Matriz2[3][8] == 223 ||
              ClsGlobal.Matriz2[3][8] == 231 ||
              ClsGlobal.Matriz2[3][8] == 232 ||
              ClsGlobal.Matriz2[3][8] == 233 ||
              ClsGlobal.Matriz2[3][8] == 321 ||
              ClsGlobal.Matriz2[3][8] == 322 ||
              ClsGlobal.Matriz2[3][8] == 331 ||
              ClsGlobal.Matriz2[3][8] == 332){
                JBD9_2.setEnabled(false);
           }else{
                JBD9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[3][9] == 1 ||
              ClsGlobal.Matriz2[3][9] == 121 ||
              ClsGlobal.Matriz2[3][9] == 122 ||
              ClsGlobal.Matriz2[3][9] == 123 ||
              ClsGlobal.Matriz2[3][9] == 124 ||
              ClsGlobal.Matriz2[3][9] == 131 ||
              ClsGlobal.Matriz2[3][9] == 132 ||
              ClsGlobal.Matriz2[3][9] == 133 ||
              ClsGlobal.Matriz2[3][9] == 134 ||
              ClsGlobal.Matriz2[3][9] == 221 ||
              ClsGlobal.Matriz2[3][9] == 222 ||
              ClsGlobal.Matriz2[3][9] == 223 ||
              ClsGlobal.Matriz2[3][9] == 231 ||
              ClsGlobal.Matriz2[3][9] == 232 ||
              ClsGlobal.Matriz2[3][9] == 233 ||
              ClsGlobal.Matriz2[3][9] == 321 ||
              ClsGlobal.Matriz2[3][9] == 322 ||
              ClsGlobal.Matriz2[3][9] == 331 ||
              ClsGlobal.Matriz2[3][9] == 332){
                JBD10_2.setEnabled(false);
           }else{
                JBD10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][0] == 1 ||
              ClsGlobal.Matriz2[4][0] == 121 ||
              ClsGlobal.Matriz2[4][0] == 122 ||
              ClsGlobal.Matriz2[4][0] == 123 ||
              ClsGlobal.Matriz2[4][0] == 124 ||
              ClsGlobal.Matriz2[4][0] == 131 ||
              ClsGlobal.Matriz2[4][0] == 132 ||
              ClsGlobal.Matriz2[4][0] == 133 ||
              ClsGlobal.Matriz2[4][0] == 134 ||
              ClsGlobal.Matriz2[4][0] == 221 ||
              ClsGlobal.Matriz2[4][0] == 222 ||
              ClsGlobal.Matriz2[4][0] == 223 ||
              ClsGlobal.Matriz2[4][0] == 231 ||
              ClsGlobal.Matriz2[4][0] == 232 ||
              ClsGlobal.Matriz2[4][0] == 233 ||
              ClsGlobal.Matriz2[4][0] == 321 ||
              ClsGlobal.Matriz2[4][0] == 322 ||
              ClsGlobal.Matriz2[4][0] == 331 ||
              ClsGlobal.Matriz2[4][0] == 332){
                JBE1_2.setEnabled(false);
           }else{
                JBE1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][1] == 1 ||
              ClsGlobal.Matriz2[4][1] == 121 ||
              ClsGlobal.Matriz2[4][1] == 122 ||
              ClsGlobal.Matriz2[4][1] == 123 ||
              ClsGlobal.Matriz2[4][1] == 124 ||
              ClsGlobal.Matriz2[4][1] == 131 ||
              ClsGlobal.Matriz2[4][1] == 132 ||
              ClsGlobal.Matriz2[4][1] == 133 ||
              ClsGlobal.Matriz2[4][1] == 134 ||
              ClsGlobal.Matriz2[4][1] == 221 ||
              ClsGlobal.Matriz2[4][1] == 222 ||
              ClsGlobal.Matriz2[4][1] == 223 ||
              ClsGlobal.Matriz2[4][1] == 231 ||
              ClsGlobal.Matriz2[4][1] == 232 ||
              ClsGlobal.Matriz2[4][1] == 233 ||
              ClsGlobal.Matriz2[4][1] == 321 ||
              ClsGlobal.Matriz2[4][1] == 322 ||
              ClsGlobal.Matriz2[4][1] == 331 ||
              ClsGlobal.Matriz2[4][1] == 332){
                JBE2_2.setEnabled(false);
           }else{
                JBE2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][2] == 1 ||
              ClsGlobal.Matriz2[4][2] == 121 ||
              ClsGlobal.Matriz2[4][2] == 122 ||
              ClsGlobal.Matriz2[4][2] == 123 ||
              ClsGlobal.Matriz2[4][2] == 124 ||
              ClsGlobal.Matriz2[4][2] == 131 ||
              ClsGlobal.Matriz2[4][2] == 132 ||
              ClsGlobal.Matriz2[4][2] == 133 ||
              ClsGlobal.Matriz2[4][2] == 134 ||
              ClsGlobal.Matriz2[4][2] == 221 ||
              ClsGlobal.Matriz2[4][2] == 222 ||
              ClsGlobal.Matriz2[4][2] == 223 ||
              ClsGlobal.Matriz2[4][2] == 231 ||
              ClsGlobal.Matriz2[4][2] == 232 ||
              ClsGlobal.Matriz2[4][2] == 233 ||
              ClsGlobal.Matriz2[4][2] == 321 ||
              ClsGlobal.Matriz2[4][2] == 322 ||
              ClsGlobal.Matriz2[4][2] == 331 ||
              ClsGlobal.Matriz2[4][2] == 332){
                JBE3_2.setEnabled(false);
           }else{
                JBE3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][3] == 1 ||
              ClsGlobal.Matriz2[4][3] == 121 ||
              ClsGlobal.Matriz2[4][3] == 122 ||
              ClsGlobal.Matriz2[4][3] == 123 ||
              ClsGlobal.Matriz2[4][3] == 124 ||
              ClsGlobal.Matriz2[4][3] == 131 ||
              ClsGlobal.Matriz2[4][3] == 132 ||
              ClsGlobal.Matriz2[4][3] == 133 ||
              ClsGlobal.Matriz2[4][3] == 134 ||
              ClsGlobal.Matriz2[4][3] == 221 ||
              ClsGlobal.Matriz2[4][3] == 222 ||
              ClsGlobal.Matriz2[4][3] == 223 ||
              ClsGlobal.Matriz2[4][3] == 231 ||
              ClsGlobal.Matriz2[4][3] == 232 ||
              ClsGlobal.Matriz2[4][3] == 233 ||
              ClsGlobal.Matriz2[4][3] == 321 ||
              ClsGlobal.Matriz2[4][3] == 322 ||
              ClsGlobal.Matriz2[4][3] == 331 ||
              ClsGlobal.Matriz2[4][3] == 332){
                JBE4_2.setEnabled(false);
           }else{
                JBE4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][4] == 1 ||
              ClsGlobal.Matriz2[4][4] == 121 ||
              ClsGlobal.Matriz2[4][4] == 122 ||
              ClsGlobal.Matriz2[4][4] == 123 ||
              ClsGlobal.Matriz2[4][4] == 124 ||
              ClsGlobal.Matriz2[4][4] == 131 ||
              ClsGlobal.Matriz2[4][4] == 132 ||
              ClsGlobal.Matriz2[4][4] == 133 ||
              ClsGlobal.Matriz2[4][4] == 134 ||
              ClsGlobal.Matriz2[4][4] == 221 ||
              ClsGlobal.Matriz2[4][4] == 222 ||
              ClsGlobal.Matriz2[4][4] == 223 ||
              ClsGlobal.Matriz2[4][4] == 231 ||
              ClsGlobal.Matriz2[4][4] == 232 ||
              ClsGlobal.Matriz2[4][4] == 233 ||
              ClsGlobal.Matriz2[4][4] == 321 ||
              ClsGlobal.Matriz2[4][4] == 322 ||
              ClsGlobal.Matriz2[4][4] == 331 ||
              ClsGlobal.Matriz2[4][4] == 332){
                JBE5_2.setEnabled(false);
           }else{
                JBE5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][5] == 1 ||
              ClsGlobal.Matriz2[4][5] == 121 ||
              ClsGlobal.Matriz2[4][5] == 122 ||
              ClsGlobal.Matriz2[4][5] == 123 ||
              ClsGlobal.Matriz2[4][5] == 124 ||
              ClsGlobal.Matriz2[4][5] == 131 ||
              ClsGlobal.Matriz2[4][5] == 132 ||
              ClsGlobal.Matriz2[4][5] == 133 ||
              ClsGlobal.Matriz2[4][5] == 134 ||
              ClsGlobal.Matriz2[4][5] == 221 ||
              ClsGlobal.Matriz2[4][5] == 222 ||
              ClsGlobal.Matriz2[4][5] == 223 ||
              ClsGlobal.Matriz2[4][5] == 231 ||
              ClsGlobal.Matriz2[4][5] == 232 ||
              ClsGlobal.Matriz2[4][5] == 233 ||
              ClsGlobal.Matriz2[4][5] == 321 ||
              ClsGlobal.Matriz2[4][5] == 322 ||
              ClsGlobal.Matriz2[4][5] == 331 ||
              ClsGlobal.Matriz2[4][5] == 332){
                JBE6_2.setEnabled(false);
           }else{
                JBE6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][6] == 1 ||
              ClsGlobal.Matriz2[4][6] == 121 ||
              ClsGlobal.Matriz2[4][6] == 122 ||
              ClsGlobal.Matriz2[4][6] == 123 ||
              ClsGlobal.Matriz2[4][6] == 124 ||
              ClsGlobal.Matriz2[4][6] == 131 ||
              ClsGlobal.Matriz2[4][6] == 132 ||
              ClsGlobal.Matriz2[4][6] == 133 ||
              ClsGlobal.Matriz2[4][6] == 134 ||
              ClsGlobal.Matriz2[4][6] == 221 ||
              ClsGlobal.Matriz2[4][6] == 222 ||
              ClsGlobal.Matriz2[4][6] == 223 ||
              ClsGlobal.Matriz2[4][6] == 231 ||
              ClsGlobal.Matriz2[4][6] == 232 ||
              ClsGlobal.Matriz2[4][6] == 233 ||
              ClsGlobal.Matriz2[4][6] == 321 ||
              ClsGlobal.Matriz2[4][6] == 322 ||
              ClsGlobal.Matriz2[4][6] == 331 ||
              ClsGlobal.Matriz2[4][6] == 332){
                JBE7_2.setEnabled(false);
           }else{
                JBE7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][7] == 1 ||
              ClsGlobal.Matriz2[4][7] == 121 ||
              ClsGlobal.Matriz2[4][7] == 122 ||
              ClsGlobal.Matriz2[4][7] == 123 ||
              ClsGlobal.Matriz2[4][7] == 124 ||
              ClsGlobal.Matriz2[4][7] == 131 ||
              ClsGlobal.Matriz2[4][7] == 132 ||
              ClsGlobal.Matriz2[4][7] == 133 ||
              ClsGlobal.Matriz2[4][7] == 134 ||
              ClsGlobal.Matriz2[4][7] == 221 ||
              ClsGlobal.Matriz2[4][7] == 222 ||
              ClsGlobal.Matriz2[4][7] == 223 ||
              ClsGlobal.Matriz2[4][7] == 231 ||
              ClsGlobal.Matriz2[4][7] == 232 ||
              ClsGlobal.Matriz2[4][7] == 233 ||
              ClsGlobal.Matriz2[4][7] == 321 ||
              ClsGlobal.Matriz2[4][7] == 322 ||
              ClsGlobal.Matriz2[4][7] == 331 ||
              ClsGlobal.Matriz2[4][7] == 332){
                JBE8_2.setEnabled(false);
           }else{
                JBE8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][8] == 1 ||
              ClsGlobal.Matriz2[4][8] == 121 ||
              ClsGlobal.Matriz2[4][8] == 122 ||
              ClsGlobal.Matriz2[4][8] == 123 ||
              ClsGlobal.Matriz2[4][8] == 124 ||
              ClsGlobal.Matriz2[4][8] == 131 ||
              ClsGlobal.Matriz2[4][8] == 132 ||
              ClsGlobal.Matriz2[4][8] == 133 ||
              ClsGlobal.Matriz2[4][8] == 134 ||
              ClsGlobal.Matriz2[4][8] == 221 ||
              ClsGlobal.Matriz2[4][8] == 222 ||
              ClsGlobal.Matriz2[4][8] == 223 ||
              ClsGlobal.Matriz2[4][8] == 231 ||
              ClsGlobal.Matriz2[4][8] == 232 ||
              ClsGlobal.Matriz2[4][8] == 233 ||
              ClsGlobal.Matriz2[4][8] == 321 ||
              ClsGlobal.Matriz2[4][8] == 322 ||
              ClsGlobal.Matriz2[4][8] == 331 ||
              ClsGlobal.Matriz2[4][8] == 332){
                JBE9_2.setEnabled(false);
           }else{
                JBE9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[4][9] == 1 ||
              ClsGlobal.Matriz2[4][9] == 121 ||
              ClsGlobal.Matriz2[4][9] == 122 ||
              ClsGlobal.Matriz2[4][9] == 123 ||
              ClsGlobal.Matriz2[4][9] == 124 ||
              ClsGlobal.Matriz2[4][9] == 131 ||
              ClsGlobal.Matriz2[4][9] == 132 ||
              ClsGlobal.Matriz2[4][9] == 133 ||
              ClsGlobal.Matriz2[4][9] == 134 ||
              ClsGlobal.Matriz2[4][9] == 221 ||
              ClsGlobal.Matriz2[4][9] == 222 ||
              ClsGlobal.Matriz2[4][9] == 223 ||
              ClsGlobal.Matriz2[4][9] == 231 ||
              ClsGlobal.Matriz2[4][9] == 232 ||
              ClsGlobal.Matriz2[4][9] == 233 ||
              ClsGlobal.Matriz2[4][9] == 321 ||
              ClsGlobal.Matriz2[4][9] == 322 ||
              ClsGlobal.Matriz2[4][9] == 331 ||
              ClsGlobal.Matriz2[4][9] == 332){
                JBE10_2.setEnabled(false);
           }else{
                JBE10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][0] == 1 ||
              ClsGlobal.Matriz2[5][0] == 121 ||
              ClsGlobal.Matriz2[5][0] == 122 ||
              ClsGlobal.Matriz2[5][0] == 123 ||
              ClsGlobal.Matriz2[5][0] == 124 ||
              ClsGlobal.Matriz2[5][0] == 131 ||
              ClsGlobal.Matriz2[5][0] == 132 ||
              ClsGlobal.Matriz2[5][0] == 133 ||
              ClsGlobal.Matriz2[5][0] == 134 ||
              ClsGlobal.Matriz2[5][0] == 221 ||
              ClsGlobal.Matriz2[5][0] == 222 ||
              ClsGlobal.Matriz2[5][0] == 223 ||
              ClsGlobal.Matriz2[5][0] == 231 ||
              ClsGlobal.Matriz2[5][0] == 232 ||
              ClsGlobal.Matriz2[5][0] == 233 ||
              ClsGlobal.Matriz2[5][0] == 321 ||
              ClsGlobal.Matriz2[5][0] == 322 ||
              ClsGlobal.Matriz2[5][0] == 331 ||
              ClsGlobal.Matriz2[5][0] == 332){
                JBF1_2.setEnabled(false);
           }else{
                JBF1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][1] == 1 ||
              ClsGlobal.Matriz2[5][1] == 121 ||
              ClsGlobal.Matriz2[5][1] == 122 ||
              ClsGlobal.Matriz2[5][1] == 123 ||
              ClsGlobal.Matriz2[5][1] == 124 ||
              ClsGlobal.Matriz2[5][1] == 131 ||
              ClsGlobal.Matriz2[5][1] == 132 ||
              ClsGlobal.Matriz2[5][1] == 133 ||
              ClsGlobal.Matriz2[5][1] == 134 ||
              ClsGlobal.Matriz2[5][1] == 221 ||
              ClsGlobal.Matriz2[5][1] == 222 ||
              ClsGlobal.Matriz2[5][1] == 223 ||
              ClsGlobal.Matriz2[5][1] == 231 ||
              ClsGlobal.Matriz2[5][1] == 232 ||
              ClsGlobal.Matriz2[5][1] == 233 ||
              ClsGlobal.Matriz2[5][1] == 321 ||
              ClsGlobal.Matriz2[5][1] == 322 ||
              ClsGlobal.Matriz2[5][1] == 331 ||
              ClsGlobal.Matriz2[5][1] == 332){
                JBF2_2.setEnabled(false);
           }else{
                JBF2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][2] == 1 ||
              ClsGlobal.Matriz2[5][2] == 121 ||
              ClsGlobal.Matriz2[5][2] == 122 ||
              ClsGlobal.Matriz2[5][2] == 123 ||
              ClsGlobal.Matriz2[5][2] == 124 ||
              ClsGlobal.Matriz2[5][2] == 131 ||
              ClsGlobal.Matriz2[5][2] == 132 ||
              ClsGlobal.Matriz2[5][2] == 133 ||
              ClsGlobal.Matriz2[5][2] == 134 ||
              ClsGlobal.Matriz2[5][2] == 221 ||
              ClsGlobal.Matriz2[5][2] == 222 ||
              ClsGlobal.Matriz2[5][2] == 223 ||
              ClsGlobal.Matriz2[5][2] == 231 ||
              ClsGlobal.Matriz2[5][2] == 232 ||
              ClsGlobal.Matriz2[5][2] == 233 ||
              ClsGlobal.Matriz2[5][2] == 321 ||
              ClsGlobal.Matriz2[5][2] == 322 ||
              ClsGlobal.Matriz2[5][2] == 331 ||
              ClsGlobal.Matriz2[5][2] == 332){
                JBF3_2.setEnabled(false);
           }else
                JBF3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][3] == 1 ||
              ClsGlobal.Matriz2[5][3] == 121 ||
              ClsGlobal.Matriz2[5][3] == 122 ||
              ClsGlobal.Matriz2[5][3] == 123 ||
              ClsGlobal.Matriz2[5][3] == 124 ||
              ClsGlobal.Matriz2[5][3] == 131 ||
              ClsGlobal.Matriz2[5][3] == 132 ||
              ClsGlobal.Matriz2[5][3] == 133 ||
              ClsGlobal.Matriz2[5][3] == 134 ||
              ClsGlobal.Matriz2[5][3] == 221 ||
              ClsGlobal.Matriz2[5][3] == 222 ||
              ClsGlobal.Matriz2[5][3] == 223 ||
              ClsGlobal.Matriz2[5][3] == 231 ||
              ClsGlobal.Matriz2[5][3] == 232 ||
              ClsGlobal.Matriz2[5][3] == 233 ||
              ClsGlobal.Matriz2[5][3] == 321 ||
              ClsGlobal.Matriz2[5][3] == 322 ||
              ClsGlobal.Matriz2[5][3] == 331 ||
              ClsGlobal.Matriz2[5][3] == 332){
                JBF4_2.setEnabled(false);
           }else{
                JBF4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][4] == 1 ||
              ClsGlobal.Matriz2[5][4] == 121 ||
              ClsGlobal.Matriz2[5][4] == 122 ||
              ClsGlobal.Matriz2[5][4] == 123 ||
              ClsGlobal.Matriz2[5][4] == 124 ||
              ClsGlobal.Matriz2[5][4] == 131 ||
              ClsGlobal.Matriz2[5][4] == 132 ||
              ClsGlobal.Matriz2[5][4] == 133 ||
              ClsGlobal.Matriz2[5][4] == 134 ||
              ClsGlobal.Matriz2[5][4] == 221 ||
              ClsGlobal.Matriz2[5][4] == 222 ||
              ClsGlobal.Matriz2[5][4] == 223 ||
              ClsGlobal.Matriz2[5][4] == 231 ||
              ClsGlobal.Matriz2[5][4] == 232 ||
              ClsGlobal.Matriz2[5][4] == 233 ||
              ClsGlobal.Matriz2[5][4] == 321 ||
              ClsGlobal.Matriz2[5][4] == 322 ||
              ClsGlobal.Matriz2[5][4] == 331 ||
              ClsGlobal.Matriz2[5][4] == 332){
                JBF5_2.setEnabled(false);
           }else{
                JBF5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][5] == 1 ||
              ClsGlobal.Matriz2[5][5] == 121 ||
              ClsGlobal.Matriz2[5][5] == 122 ||
              ClsGlobal.Matriz2[5][5] == 123 ||
              ClsGlobal.Matriz2[5][5] == 124 ||
              ClsGlobal.Matriz2[5][5] == 131 ||
              ClsGlobal.Matriz2[5][5] == 132 ||
              ClsGlobal.Matriz2[5][5] == 133 ||
              ClsGlobal.Matriz2[5][5] == 134 ||
              ClsGlobal.Matriz2[5][5] == 221 ||
              ClsGlobal.Matriz2[5][5] == 222 ||
              ClsGlobal.Matriz2[5][5] == 223 ||
              ClsGlobal.Matriz2[5][5] == 231 ||
              ClsGlobal.Matriz2[5][5] == 232 ||
              ClsGlobal.Matriz2[5][5] == 233 ||
              ClsGlobal.Matriz2[5][5] == 321 ||
              ClsGlobal.Matriz2[5][5] == 322 ||
              ClsGlobal.Matriz2[5][5] == 331 ||
              ClsGlobal.Matriz2[5][5] == 332){
                JBF6_2.setEnabled(false);
           }else{
                JBF6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][6] == 1 ||
              ClsGlobal.Matriz2[5][6] == 121 ||
              ClsGlobal.Matriz2[5][6] == 122 ||
              ClsGlobal.Matriz2[5][6] == 123 ||
              ClsGlobal.Matriz2[5][6] == 124 ||
              ClsGlobal.Matriz2[5][6] == 131 ||
              ClsGlobal.Matriz2[5][6] == 132 ||
              ClsGlobal.Matriz2[5][6] == 133 ||
              ClsGlobal.Matriz2[5][6] == 134 ||
              ClsGlobal.Matriz2[5][6] == 221 ||
              ClsGlobal.Matriz2[5][6] == 222 ||
              ClsGlobal.Matriz2[5][6] == 223 ||
              ClsGlobal.Matriz2[5][6] == 231 ||
              ClsGlobal.Matriz2[5][6] == 232 ||
              ClsGlobal.Matriz2[5][6] == 233 ||
              ClsGlobal.Matriz2[5][6] == 321 ||
              ClsGlobal.Matriz2[5][6] == 322 ||
              ClsGlobal.Matriz2[5][6] == 331 ||
              ClsGlobal.Matriz2[5][6] == 332){
                JBF7_2.setEnabled(false);
           }else{
                JBF7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][7] == 1 ||
              ClsGlobal.Matriz2[5][7] == 121 ||
              ClsGlobal.Matriz2[5][7] == 122 ||
              ClsGlobal.Matriz2[5][7] == 123 ||
              ClsGlobal.Matriz2[5][7] == 124 ||
              ClsGlobal.Matriz2[5][7] == 131 ||
              ClsGlobal.Matriz2[5][7] == 132 ||
              ClsGlobal.Matriz2[5][7] == 133 ||
              ClsGlobal.Matriz2[5][7] == 134 ||
              ClsGlobal.Matriz2[5][7] == 221 ||
              ClsGlobal.Matriz2[5][7] == 222 ||
              ClsGlobal.Matriz2[5][7] == 223 ||
              ClsGlobal.Matriz2[5][7] == 231 ||
              ClsGlobal.Matriz2[5][7] == 232 ||
              ClsGlobal.Matriz2[5][7] == 233 ||
              ClsGlobal.Matriz2[5][7] == 321 ||
              ClsGlobal.Matriz2[5][7] == 322 ||
              ClsGlobal.Matriz2[5][7] == 331 ||
              ClsGlobal.Matriz2[5][7] == 332){
                JBF8_2.setEnabled(false);
           }else{
                JBF8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][8] == 1 ||
              ClsGlobal.Matriz2[5][8] == 121 ||
              ClsGlobal.Matriz2[5][8] == 122 ||
              ClsGlobal.Matriz2[5][8] == 123 ||
              ClsGlobal.Matriz2[5][8] == 124 ||
              ClsGlobal.Matriz2[5][8] == 131 ||
              ClsGlobal.Matriz2[5][8] == 132 ||
              ClsGlobal.Matriz2[5][8] == 133 ||
              ClsGlobal.Matriz2[5][8] == 134 ||
              ClsGlobal.Matriz2[5][8] == 221 ||
              ClsGlobal.Matriz2[5][8] == 222 ||
              ClsGlobal.Matriz2[5][8] == 223 ||
              ClsGlobal.Matriz2[5][8] == 231 ||
              ClsGlobal.Matriz2[5][8] == 232 ||
              ClsGlobal.Matriz2[5][8] == 233 ||
              ClsGlobal.Matriz2[5][8] == 321 ||
              ClsGlobal.Matriz2[5][8] == 322 ||
              ClsGlobal.Matriz2[5][8] == 331 ||
              ClsGlobal.Matriz2[5][8] == 332){
                JBF9_2.setEnabled(false);
           }else{
                JBF9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[5][9] == 1 ||
              ClsGlobal.Matriz2[5][9] == 121 ||
              ClsGlobal.Matriz2[5][9] == 122 ||
              ClsGlobal.Matriz2[5][9] == 123 ||
              ClsGlobal.Matriz2[5][9] == 124 ||
              ClsGlobal.Matriz2[5][9] == 131 ||
              ClsGlobal.Matriz2[5][9] == 132 ||
              ClsGlobal.Matriz2[5][9] == 133 ||
              ClsGlobal.Matriz2[5][9] == 134 ||
              ClsGlobal.Matriz2[5][9] == 221 ||
              ClsGlobal.Matriz2[5][9] == 222 ||
              ClsGlobal.Matriz2[5][9] == 223 ||
              ClsGlobal.Matriz2[5][9] == 231 ||
              ClsGlobal.Matriz2[5][9] == 232 ||
              ClsGlobal.Matriz2[5][9] == 233 ||
              ClsGlobal.Matriz2[5][9] == 321 ||
              ClsGlobal.Matriz2[5][9] == 322 ||
              ClsGlobal.Matriz2[5][9] == 331 ||
              ClsGlobal.Matriz2[5][9] == 332){
                JBF10_2.setEnabled(false);
           }else{
                JBF10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][0] == 1 ||
              ClsGlobal.Matriz2[6][0] == 121 ||
              ClsGlobal.Matriz2[6][0] == 122 ||
              ClsGlobal.Matriz2[6][0] == 123 ||
              ClsGlobal.Matriz2[6][0] == 124 ||
              ClsGlobal.Matriz2[6][0] == 131 ||
              ClsGlobal.Matriz2[6][0] == 132 ||
              ClsGlobal.Matriz2[6][0] == 133 ||
              ClsGlobal.Matriz2[6][0] == 134 ||
              ClsGlobal.Matriz2[6][0] == 221 ||
              ClsGlobal.Matriz2[6][0] == 222 ||
              ClsGlobal.Matriz2[6][0] == 223 ||
              ClsGlobal.Matriz2[6][0] == 231 ||
              ClsGlobal.Matriz2[6][0] == 232 ||
              ClsGlobal.Matriz2[6][0] == 233 ||
              ClsGlobal.Matriz2[6][0] == 321 ||
              ClsGlobal.Matriz2[6][0] == 322 ||
              ClsGlobal.Matriz2[6][0] == 331 ||
              ClsGlobal.Matriz2[6][0] == 332){
                JBG1_2.setEnabled(false);
           }else{
                JBG1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][1] == 1 ||
              ClsGlobal.Matriz2[6][1] == 121 ||
              ClsGlobal.Matriz2[6][1] == 122 ||
              ClsGlobal.Matriz2[6][1] == 123 ||
              ClsGlobal.Matriz2[6][1] == 124 ||
              ClsGlobal.Matriz2[6][1] == 131 ||
              ClsGlobal.Matriz2[6][1] == 132 ||
              ClsGlobal.Matriz2[6][1] == 133 ||
              ClsGlobal.Matriz2[6][1] == 134 ||
              ClsGlobal.Matriz2[6][1] == 221 ||
              ClsGlobal.Matriz2[6][1] == 222 ||
              ClsGlobal.Matriz2[6][1] == 223 ||
              ClsGlobal.Matriz2[6][1] == 231 ||
              ClsGlobal.Matriz2[6][1] == 232 ||
              ClsGlobal.Matriz2[6][1] == 233 ||
              ClsGlobal.Matriz2[6][1] == 321 ||
              ClsGlobal.Matriz2[6][1] == 322 ||
              ClsGlobal.Matriz2[6][1] == 331 ||
              ClsGlobal.Matriz2[6][1] == 332){
                JBG2_2.setEnabled(false);
           }else{
                JBG2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][2] == 1 ||
              ClsGlobal.Matriz2[6][2] == 121 ||
              ClsGlobal.Matriz2[6][2] == 122 ||
              ClsGlobal.Matriz2[6][2] == 123 ||
              ClsGlobal.Matriz2[6][2] == 124 ||
              ClsGlobal.Matriz2[6][2] == 131 ||
              ClsGlobal.Matriz2[6][2] == 132 ||
              ClsGlobal.Matriz2[6][2] == 133 ||
              ClsGlobal.Matriz2[6][2] == 134 ||
              ClsGlobal.Matriz2[6][2] == 221 ||
              ClsGlobal.Matriz2[6][2] == 222 ||
              ClsGlobal.Matriz2[6][2] == 223 ||
              ClsGlobal.Matriz2[6][2] == 231 ||
              ClsGlobal.Matriz2[6][2] == 232 ||
              ClsGlobal.Matriz2[6][2] == 233 ||
              ClsGlobal.Matriz2[6][2] == 321 ||
              ClsGlobal.Matriz2[6][2] == 322 ||
              ClsGlobal.Matriz2[6][2] == 331 ||
              ClsGlobal.Matriz2[6][2] == 332){
                JBG3_2.setEnabled(false);
           }else{
                JBG3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][3] == 1 ||
              ClsGlobal.Matriz2[6][3] == 121 ||
              ClsGlobal.Matriz2[6][3] == 122 ||
              ClsGlobal.Matriz2[6][3] == 123 ||
              ClsGlobal.Matriz2[6][3] == 124 ||
              ClsGlobal.Matriz2[6][3] == 131 ||
              ClsGlobal.Matriz2[6][3] == 132 ||
              ClsGlobal.Matriz2[6][3] == 133 ||
              ClsGlobal.Matriz2[6][3] == 134 ||
              ClsGlobal.Matriz2[6][3] == 221 ||
              ClsGlobal.Matriz2[6][3] == 222 ||
              ClsGlobal.Matriz2[6][3] == 223 ||
              ClsGlobal.Matriz2[6][3] == 231 ||
              ClsGlobal.Matriz2[6][3] == 232 ||
              ClsGlobal.Matriz2[6][3] == 233 ||
              ClsGlobal.Matriz2[6][3] == 321 ||
              ClsGlobal.Matriz2[6][3] == 322 ||
              ClsGlobal.Matriz2[6][3] == 331 ||
              ClsGlobal.Matriz2[6][3] == 332){
                JBG4_2.setEnabled(false);
           }else{
                JBG4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][4] == 1 ||
              ClsGlobal.Matriz2[6][4] == 121 ||
              ClsGlobal.Matriz2[6][4] == 122 ||
              ClsGlobal.Matriz2[6][4] == 123 ||
              ClsGlobal.Matriz2[6][4] == 124 ||
              ClsGlobal.Matriz2[6][4] == 131 ||
              ClsGlobal.Matriz2[6][4] == 132 ||
              ClsGlobal.Matriz2[6][4] == 133 ||
              ClsGlobal.Matriz2[6][4] == 134 ||
              ClsGlobal.Matriz2[6][4] == 221 ||
              ClsGlobal.Matriz2[6][4] == 222 ||
              ClsGlobal.Matriz2[6][4] == 223 ||
              ClsGlobal.Matriz2[6][4] == 231 ||
              ClsGlobal.Matriz2[6][4] == 232 ||
              ClsGlobal.Matriz2[6][4] == 233 ||
              ClsGlobal.Matriz2[6][4] == 321 ||
              ClsGlobal.Matriz2[6][4] == 322 ||
              ClsGlobal.Matriz2[6][4] == 331 ||
              ClsGlobal.Matriz2[6][4] == 332){
                JBG5_2.setEnabled(false);
           }else{
                JBG5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][5] == 1 ||
              ClsGlobal.Matriz2[6][5] == 121 ||
              ClsGlobal.Matriz2[6][5] == 122 ||
              ClsGlobal.Matriz2[6][5] == 123 ||
              ClsGlobal.Matriz2[6][5] == 124 ||
              ClsGlobal.Matriz2[6][5] == 131 ||
              ClsGlobal.Matriz2[6][5] == 132 ||
              ClsGlobal.Matriz2[6][5] == 133 ||
              ClsGlobal.Matriz2[6][5] == 134 ||
              ClsGlobal.Matriz2[6][5] == 221 ||
              ClsGlobal.Matriz2[6][5] == 222 ||
              ClsGlobal.Matriz2[6][5] == 223 ||
              ClsGlobal.Matriz2[6][5] == 231 ||
              ClsGlobal.Matriz2[6][5] == 232 ||
              ClsGlobal.Matriz2[6][5] == 233 ||
              ClsGlobal.Matriz2[6][5] == 321 ||
              ClsGlobal.Matriz2[6][5] == 322 ||
              ClsGlobal.Matriz2[6][5] == 331 ||
              ClsGlobal.Matriz2[6][5] == 332){
                JBG6_2.setEnabled(false);
           }else{
                JBG6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][6] == 1 ||
              ClsGlobal.Matriz2[6][6] == 121 ||
              ClsGlobal.Matriz2[6][6] == 122 ||
              ClsGlobal.Matriz2[6][6] == 123 ||
              ClsGlobal.Matriz2[6][6] == 124 ||
              ClsGlobal.Matriz2[6][6] == 131 ||
              ClsGlobal.Matriz2[6][6] == 132 ||
              ClsGlobal.Matriz2[6][6] == 133 ||
              ClsGlobal.Matriz2[6][6] == 134 ||
              ClsGlobal.Matriz2[6][6] == 221 ||
              ClsGlobal.Matriz2[6][6] == 222 ||
              ClsGlobal.Matriz2[6][6] == 223 ||
              ClsGlobal.Matriz2[6][6] == 231 ||
              ClsGlobal.Matriz2[6][6] == 232 ||
              ClsGlobal.Matriz2[6][6] == 233 ||
              ClsGlobal.Matriz2[6][6] == 321 ||
              ClsGlobal.Matriz2[6][6] == 322 ||
              ClsGlobal.Matriz2[6][6] == 331 ||
              ClsGlobal.Matriz2[6][6] == 332){
                JBG7_2.setEnabled(false);
           }else{
                JBG7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][7] == 1 ||
              ClsGlobal.Matriz2[6][7] == 121 ||
              ClsGlobal.Matriz2[6][7] == 122 ||
              ClsGlobal.Matriz2[6][7] == 123 ||
              ClsGlobal.Matriz2[6][7] == 124 ||
              ClsGlobal.Matriz2[6][7] == 131 ||
              ClsGlobal.Matriz2[6][7] == 132 ||
              ClsGlobal.Matriz2[6][7] == 133 ||
              ClsGlobal.Matriz2[6][7] == 134 ||
              ClsGlobal.Matriz2[6][7] == 221 ||
              ClsGlobal.Matriz2[6][7] == 222 ||
              ClsGlobal.Matriz2[6][7] == 223 ||
              ClsGlobal.Matriz2[6][7] == 231 ||
              ClsGlobal.Matriz2[6][7] == 232 ||
              ClsGlobal.Matriz2[6][7] == 233 ||
              ClsGlobal.Matriz2[6][7] == 321 ||
              ClsGlobal.Matriz2[6][7] == 322 ||
              ClsGlobal.Matriz2[6][7] == 331 ||
              ClsGlobal.Matriz2[6][7] == 332){
                JBG8_2.setEnabled(false);
           }else{
                JBG8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][8] == 1 ||
              ClsGlobal.Matriz2[6][8] == 121 ||
              ClsGlobal.Matriz2[6][8] == 122 ||
              ClsGlobal.Matriz2[6][8] == 123 ||
              ClsGlobal.Matriz2[6][8] == 124 ||
              ClsGlobal.Matriz2[6][8] == 131 ||
              ClsGlobal.Matriz2[6][8] == 132 ||
              ClsGlobal.Matriz2[6][8] == 133 ||
              ClsGlobal.Matriz2[6][8] == 134 ||
              ClsGlobal.Matriz2[6][8] == 221 ||
              ClsGlobal.Matriz2[6][8] == 222 ||
              ClsGlobal.Matriz2[6][8] == 223 ||
              ClsGlobal.Matriz2[6][8] == 231 ||
              ClsGlobal.Matriz2[6][8] == 232 ||
              ClsGlobal.Matriz2[6][8] == 233 ||
              ClsGlobal.Matriz2[6][8] == 321 ||
              ClsGlobal.Matriz2[6][8] == 322 ||
              ClsGlobal.Matriz2[6][8] == 331 ||
              ClsGlobal.Matriz2[6][8] == 332){
                JBG9_2.setEnabled(false);
           }else{
                JBG9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[6][9] == 1 ||
              ClsGlobal.Matriz2[6][9] == 121 ||
              ClsGlobal.Matriz2[6][9] == 122 ||
              ClsGlobal.Matriz2[6][9] == 123 ||
              ClsGlobal.Matriz2[6][9] == 124 ||
              ClsGlobal.Matriz2[6][9] == 131 ||
              ClsGlobal.Matriz2[6][9] == 132 ||
              ClsGlobal.Matriz2[6][9] == 133 ||
              ClsGlobal.Matriz2[6][9] == 134 ||
              ClsGlobal.Matriz2[6][9] == 221 ||
              ClsGlobal.Matriz2[6][9] == 222 ||
              ClsGlobal.Matriz2[6][9] == 223 ||
              ClsGlobal.Matriz2[6][9] == 231 ||
              ClsGlobal.Matriz2[6][9] == 232 ||
              ClsGlobal.Matriz2[6][9] == 233 ||
              ClsGlobal.Matriz2[6][9] == 321 ||
              ClsGlobal.Matriz2[6][9] == 322 ||
              ClsGlobal.Matriz2[6][9] == 331 ||
              ClsGlobal.Matriz2[6][9] == 332){
                JBG10_2.setEnabled(false);
           }else{
                JBG10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][0] == 1 ||
              ClsGlobal.Matriz2[7][0] == 121 ||
              ClsGlobal.Matriz2[7][0] == 122 ||
              ClsGlobal.Matriz2[7][0] == 123 ||
              ClsGlobal.Matriz2[7][0] == 124 ||
              ClsGlobal.Matriz2[7][0] == 131 ||
              ClsGlobal.Matriz2[7][0] == 132 ||
              ClsGlobal.Matriz2[7][0] == 133 ||
              ClsGlobal.Matriz2[7][0] == 134 ||
              ClsGlobal.Matriz2[7][0] == 221 ||
              ClsGlobal.Matriz2[7][0] == 222 ||
              ClsGlobal.Matriz2[7][0] == 223 ||
              ClsGlobal.Matriz2[7][0] == 231 ||
              ClsGlobal.Matriz2[7][0] == 232 ||
              ClsGlobal.Matriz2[7][0] == 233 ||
              ClsGlobal.Matriz2[7][0] == 321 ||
              ClsGlobal.Matriz2[7][0] == 322 ||
              ClsGlobal.Matriz2[7][0] == 331 ||
              ClsGlobal.Matriz2[7][0] == 332){
                JBH1_2.setEnabled(false);
           }else{
                JBH1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][1] == 1 ||
              ClsGlobal.Matriz2[7][1] == 121 ||
              ClsGlobal.Matriz2[7][1] == 122 ||
              ClsGlobal.Matriz2[7][1] == 123 ||
              ClsGlobal.Matriz2[7][1] == 124 ||
              ClsGlobal.Matriz2[7][1] == 131 ||
              ClsGlobal.Matriz2[7][1] == 132 ||
              ClsGlobal.Matriz2[7][1] == 133 ||
              ClsGlobal.Matriz2[7][1] == 134 ||
              ClsGlobal.Matriz2[7][1] == 221 ||
              ClsGlobal.Matriz2[7][1] == 222 ||
              ClsGlobal.Matriz2[7][1] == 223 ||
              ClsGlobal.Matriz2[7][1] == 231 ||
              ClsGlobal.Matriz2[7][1] == 232 ||
              ClsGlobal.Matriz2[7][1] == 233 ||
              ClsGlobal.Matriz2[7][1] == 321 ||
              ClsGlobal.Matriz2[7][1] == 322 ||
              ClsGlobal.Matriz2[7][1] == 331 ||
              ClsGlobal.Matriz2[7][1] == 332){
                JBH2_2.setEnabled(false);
           }else{
                JBH2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][2] == 1 ||
              ClsGlobal.Matriz2[7][2] == 121 ||
              ClsGlobal.Matriz2[7][2] == 122 ||
              ClsGlobal.Matriz2[7][2] == 123 ||
              ClsGlobal.Matriz2[7][2] == 124 ||
              ClsGlobal.Matriz2[7][2] == 131 ||
              ClsGlobal.Matriz2[7][2] == 132 ||
              ClsGlobal.Matriz2[7][2] == 133 ||
              ClsGlobal.Matriz2[7][2] == 134 ||
              ClsGlobal.Matriz2[7][2] == 221 ||
              ClsGlobal.Matriz2[7][2] == 222 ||
              ClsGlobal.Matriz2[7][2] == 223 ||
              ClsGlobal.Matriz2[7][2] == 231 ||
              ClsGlobal.Matriz2[7][2] == 232 ||
              ClsGlobal.Matriz2[7][2] == 233 ||
              ClsGlobal.Matriz2[7][2] == 321 ||
              ClsGlobal.Matriz2[7][2] == 322 ||
              ClsGlobal.Matriz2[7][2] == 331 ||
              ClsGlobal.Matriz2[7][2] == 332){
                JBH3_2.setEnabled(false);
           }else{
                JBH3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][3] == 1 ||
              ClsGlobal.Matriz2[7][3] == 121 ||
              ClsGlobal.Matriz2[7][3] == 122 ||
              ClsGlobal.Matriz2[7][3] == 123 ||
              ClsGlobal.Matriz2[7][3] == 124 ||
              ClsGlobal.Matriz2[7][3] == 131 ||
              ClsGlobal.Matriz2[7][3] == 132 ||
              ClsGlobal.Matriz2[7][3] == 133 ||
              ClsGlobal.Matriz2[7][3] == 134 ||
              ClsGlobal.Matriz2[7][3] == 221 ||
              ClsGlobal.Matriz2[7][3] == 222 ||
              ClsGlobal.Matriz2[7][3] == 223 ||
              ClsGlobal.Matriz2[7][3] == 231 ||
              ClsGlobal.Matriz2[7][3] == 232 ||
              ClsGlobal.Matriz2[7][3] == 233 ||
              ClsGlobal.Matriz2[7][3] == 321 ||
              ClsGlobal.Matriz2[7][3] == 322 ||
              ClsGlobal.Matriz2[7][3] == 331 ||
              ClsGlobal.Matriz2[7][3] == 332){
                JBH4_2.setEnabled(false);
           }else{
                JBH4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][4] == 1 ||
              ClsGlobal.Matriz2[7][4] == 121 ||
              ClsGlobal.Matriz2[7][4] == 122 ||
              ClsGlobal.Matriz2[7][4] == 123 ||
              ClsGlobal.Matriz2[7][4] == 124 ||
              ClsGlobal.Matriz2[7][4] == 131 ||
              ClsGlobal.Matriz2[7][4] == 132 ||
              ClsGlobal.Matriz2[7][4] == 133 ||
              ClsGlobal.Matriz2[7][4] == 134 ||
              ClsGlobal.Matriz2[7][4] == 221 ||
              ClsGlobal.Matriz2[7][4] == 222 ||
              ClsGlobal.Matriz2[7][4] == 223 ||
              ClsGlobal.Matriz2[7][4] == 231 ||
              ClsGlobal.Matriz2[7][4] == 232 ||
              ClsGlobal.Matriz2[7][4] == 233 ||
              ClsGlobal.Matriz2[7][4] == 321 ||
              ClsGlobal.Matriz2[7][4] == 322 ||
              ClsGlobal.Matriz2[7][4] == 331 ||
              ClsGlobal.Matriz2[7][4] == 332){
                JBH5_2.setEnabled(false);
           }else{
                JBH5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][5] == 1 ||
              ClsGlobal.Matriz2[7][5] == 121 ||
              ClsGlobal.Matriz2[7][5] == 122 ||
              ClsGlobal.Matriz2[7][5] == 123 ||
              ClsGlobal.Matriz2[7][5] == 124 ||
              ClsGlobal.Matriz2[7][5] == 131 ||
              ClsGlobal.Matriz2[7][5] == 132 ||
              ClsGlobal.Matriz2[7][5] == 133 ||
              ClsGlobal.Matriz2[7][5] == 134 ||
              ClsGlobal.Matriz2[7][5] == 221 ||
              ClsGlobal.Matriz2[7][5] == 222 ||
              ClsGlobal.Matriz2[7][5] == 223 ||
              ClsGlobal.Matriz2[7][5] == 231 ||
              ClsGlobal.Matriz2[7][5] == 232 ||
              ClsGlobal.Matriz2[7][5] == 233 ||
              ClsGlobal.Matriz2[7][5] == 321 ||
              ClsGlobal.Matriz2[7][5] == 322 ||
              ClsGlobal.Matriz2[7][5] == 331 ||
              ClsGlobal.Matriz2[7][5] == 332){
                JBH6_2.setEnabled(false);
           }else{
                JBH6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][6] == 1 ||
              ClsGlobal.Matriz2[7][6] == 121 ||
              ClsGlobal.Matriz2[7][6] == 122 ||
              ClsGlobal.Matriz2[7][6] == 123 ||
              ClsGlobal.Matriz2[7][6] == 124 ||
              ClsGlobal.Matriz2[7][6] == 131 ||
              ClsGlobal.Matriz2[7][6] == 132 ||
              ClsGlobal.Matriz2[7][6] == 133 ||
              ClsGlobal.Matriz2[7][6] == 134 ||
              ClsGlobal.Matriz2[7][6] == 221 ||
              ClsGlobal.Matriz2[7][6] == 222 ||
              ClsGlobal.Matriz2[7][6] == 223 ||
              ClsGlobal.Matriz2[7][6] == 231 ||
              ClsGlobal.Matriz2[7][6] == 232 ||
              ClsGlobal.Matriz2[7][6] == 233 ||
              ClsGlobal.Matriz2[7][6] == 321 ||
              ClsGlobal.Matriz2[7][6] == 322 ||
              ClsGlobal.Matriz2[7][6] == 331 ||
              ClsGlobal.Matriz2[7][6] == 332){
                JBH7_2.setEnabled(false);
           }else{
                JBH7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][7] == 1 ||
              ClsGlobal.Matriz2[7][7] == 121 ||
              ClsGlobal.Matriz2[7][7] == 122 ||
              ClsGlobal.Matriz2[7][7] == 123 ||
              ClsGlobal.Matriz2[7][7] == 124 ||
              ClsGlobal.Matriz2[7][7] == 131 ||
              ClsGlobal.Matriz2[7][7] == 132 ||
              ClsGlobal.Matriz2[7][7] == 133 ||
              ClsGlobal.Matriz2[7][7] == 134 ||
              ClsGlobal.Matriz2[7][7] == 221 ||
              ClsGlobal.Matriz2[7][7] == 222 ||
              ClsGlobal.Matriz2[7][7] == 223 ||
              ClsGlobal.Matriz2[7][7] == 231 ||
              ClsGlobal.Matriz2[7][7] == 232 ||
              ClsGlobal.Matriz2[7][7] == 233 ||
              ClsGlobal.Matriz2[7][7] == 321 ||
              ClsGlobal.Matriz2[7][7] == 322 ||
              ClsGlobal.Matriz2[7][7] == 331 ||
              ClsGlobal.Matriz2[7][7] == 332){
                JBH8_2.setEnabled(false);
           }else{
                JBH8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][8] == 1 ||
              ClsGlobal.Matriz2[7][8] == 121 ||
              ClsGlobal.Matriz2[7][8] == 122 ||
              ClsGlobal.Matriz2[7][8] == 123 ||
              ClsGlobal.Matriz2[7][8] == 124 ||
              ClsGlobal.Matriz2[7][8] == 131 ||
              ClsGlobal.Matriz2[7][8] == 132 ||
              ClsGlobal.Matriz2[7][8] == 133 ||
              ClsGlobal.Matriz2[7][8] == 134 ||
              ClsGlobal.Matriz2[7][8] == 221 ||
              ClsGlobal.Matriz2[7][8] == 222 ||
              ClsGlobal.Matriz2[7][8] == 223 ||
              ClsGlobal.Matriz2[7][8] == 231 ||
              ClsGlobal.Matriz2[7][8] == 232 ||
              ClsGlobal.Matriz2[7][8] == 233 ||
              ClsGlobal.Matriz2[7][8] == 321 ||
              ClsGlobal.Matriz2[7][8] == 322 ||
              ClsGlobal.Matriz2[7][8] == 331 ||
              ClsGlobal.Matriz2[7][8] == 332){
                JBH9_2.setEnabled(false);
           }else{
                JBH9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[7][9] == 1 ||
              ClsGlobal.Matriz2[7][9] == 121 ||
              ClsGlobal.Matriz2[7][9] == 122 ||
              ClsGlobal.Matriz2[7][9] == 123 ||
              ClsGlobal.Matriz2[7][9] == 124 ||
              ClsGlobal.Matriz2[7][9] == 131 ||
              ClsGlobal.Matriz2[7][9] == 132 ||
              ClsGlobal.Matriz2[7][9] == 133 ||
              ClsGlobal.Matriz2[7][9] == 134 ||
              ClsGlobal.Matriz2[7][9] == 221 ||
              ClsGlobal.Matriz2[7][9] == 222 ||
              ClsGlobal.Matriz2[7][9] == 223 ||
              ClsGlobal.Matriz2[7][9] == 231 ||
              ClsGlobal.Matriz2[7][9] == 232 ||
              ClsGlobal.Matriz2[7][9] == 233 ||
              ClsGlobal.Matriz2[7][9] == 321 ||
              ClsGlobal.Matriz2[7][9] == 322 ||
              ClsGlobal.Matriz2[7][9] == 331 ||
              ClsGlobal.Matriz2[7][9] == 332){
                JBH10_2.setEnabled(false);
           }else{
                JBH10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][0] == 1 ||
              ClsGlobal.Matriz2[8][0] == 121 ||
              ClsGlobal.Matriz2[8][0] == 122 ||
              ClsGlobal.Matriz2[8][0] == 123 ||
              ClsGlobal.Matriz2[8][0] == 124 ||
              ClsGlobal.Matriz2[8][0] == 131 ||
              ClsGlobal.Matriz2[8][0] == 132 ||
              ClsGlobal.Matriz2[8][0] == 133 ||
              ClsGlobal.Matriz2[8][0] == 134 ||
              ClsGlobal.Matriz2[8][0] == 221 ||
              ClsGlobal.Matriz2[8][0] == 222 ||
              ClsGlobal.Matriz2[8][0] == 223 ||
              ClsGlobal.Matriz2[8][0] == 231 ||
              ClsGlobal.Matriz2[8][0] == 232 ||
              ClsGlobal.Matriz2[8][0] == 233 ||
              ClsGlobal.Matriz2[8][0] == 321 ||
              ClsGlobal.Matriz2[8][0] == 322 ||
              ClsGlobal.Matriz2[8][0] == 331 ||
              ClsGlobal.Matriz2[8][0] == 332){
                JBI1_2.setEnabled(false);
           }else{
                JBI1_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][1] == 1 ||
              ClsGlobal.Matriz2[8][1] == 121 ||
              ClsGlobal.Matriz2[8][1] == 122 ||
              ClsGlobal.Matriz2[8][1] == 123 ||
              ClsGlobal.Matriz2[8][1] == 124 ||
              ClsGlobal.Matriz2[8][1] == 131 ||
              ClsGlobal.Matriz2[8][1] == 132 ||
              ClsGlobal.Matriz2[8][1] == 133 ||
              ClsGlobal.Matriz2[8][1] == 134 ||
              ClsGlobal.Matriz2[8][1] == 221 ||
              ClsGlobal.Matriz2[8][1] == 222 ||
              ClsGlobal.Matriz2[8][1] == 223 ||
              ClsGlobal.Matriz2[8][1] == 231 ||
              ClsGlobal.Matriz2[8][1] == 232 ||
              ClsGlobal.Matriz2[8][1] == 233 ||
              ClsGlobal.Matriz2[8][1] == 321 ||
              ClsGlobal.Matriz2[8][1] == 322 ||
              ClsGlobal.Matriz2[8][1] == 331 ||
              ClsGlobal.Matriz2[8][1] == 332){
                JBI2_2.setEnabled(false);
           }else{
                JBI2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][2] == 1 ||
              ClsGlobal.Matriz2[8][2] == 121 ||
              ClsGlobal.Matriz2[8][2] == 122 ||
              ClsGlobal.Matriz2[8][2] == 123 ||
              ClsGlobal.Matriz2[8][2] == 124 ||
              ClsGlobal.Matriz2[8][2] == 131 ||
              ClsGlobal.Matriz2[8][2] == 132 ||
              ClsGlobal.Matriz2[8][2] == 133 ||
              ClsGlobal.Matriz2[8][2] == 134 ||
              ClsGlobal.Matriz2[8][2] == 221 ||
              ClsGlobal.Matriz2[8][2] == 222 ||
              ClsGlobal.Matriz2[8][2] == 223 ||
              ClsGlobal.Matriz2[8][2] == 231 ||
              ClsGlobal.Matriz2[8][2] == 232 ||
              ClsGlobal.Matriz2[8][2] == 233 ||
              ClsGlobal.Matriz2[8][2] == 321 ||
              ClsGlobal.Matriz2[8][2] == 322 ||
              ClsGlobal.Matriz2[8][2] == 331 ||
              ClsGlobal.Matriz2[8][2] == 332){
                JBI3_2.setEnabled(false);
           }else{
                JBI3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][3] == 1 ||
              ClsGlobal.Matriz2[8][3] == 121 ||
              ClsGlobal.Matriz2[8][3] == 122 ||
              ClsGlobal.Matriz2[8][3] == 123 ||
              ClsGlobal.Matriz2[8][3] == 124 ||
              ClsGlobal.Matriz2[8][3] == 131 ||
              ClsGlobal.Matriz2[8][3] == 132 ||
              ClsGlobal.Matriz2[8][3] == 133 ||
              ClsGlobal.Matriz2[8][3] == 134 ||
              ClsGlobal.Matriz2[8][3] == 221 ||
              ClsGlobal.Matriz2[8][3] == 222 ||
              ClsGlobal.Matriz2[8][3] == 223 ||
              ClsGlobal.Matriz2[8][3] == 231 ||
              ClsGlobal.Matriz2[8][3] == 232 ||
              ClsGlobal.Matriz2[8][3] == 233 ||
              ClsGlobal.Matriz2[8][3] == 321 ||
              ClsGlobal.Matriz2[8][3] == 322 ||
              ClsGlobal.Matriz2[8][3] == 331 ||
              ClsGlobal.Matriz2[8][3] == 332){
                JBI4_2.setEnabled(false);
           }else{
                JBI4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][4] == 1 ||
              ClsGlobal.Matriz2[8][4] == 121 ||
              ClsGlobal.Matriz2[8][4] == 122 ||
              ClsGlobal.Matriz2[8][4] == 123 ||
              ClsGlobal.Matriz2[8][4] == 124 ||
              ClsGlobal.Matriz2[8][4] == 131 ||
              ClsGlobal.Matriz2[8][4] == 132 ||
              ClsGlobal.Matriz2[8][4] == 133 ||
              ClsGlobal.Matriz2[8][4] == 134 ||
              ClsGlobal.Matriz2[8][4] == 221 ||
              ClsGlobal.Matriz2[8][4] == 222 ||
              ClsGlobal.Matriz2[8][4] == 223 ||
              ClsGlobal.Matriz2[8][4] == 231 ||
              ClsGlobal.Matriz2[8][4] == 232 ||
              ClsGlobal.Matriz2[8][4] == 233 ||
              ClsGlobal.Matriz2[8][4] == 321 ||
              ClsGlobal.Matriz2[8][4] == 322 ||
              ClsGlobal.Matriz2[8][4] == 331 ||
              ClsGlobal.Matriz2[8][4] == 332){
                JBI5_2.setEnabled(false);
           }else{
                JBI5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][5] == 1 ||
              ClsGlobal.Matriz2[8][5] == 121 ||
              ClsGlobal.Matriz2[8][5] == 122 ||
              ClsGlobal.Matriz2[8][5] == 123 ||
              ClsGlobal.Matriz2[8][5] == 124 ||
              ClsGlobal.Matriz2[8][5] == 131 ||
              ClsGlobal.Matriz2[8][5] == 132 ||
              ClsGlobal.Matriz2[8][5] == 133 ||
              ClsGlobal.Matriz2[8][5] == 134 ||
              ClsGlobal.Matriz2[8][5] == 221 ||
              ClsGlobal.Matriz2[8][5] == 222 ||
              ClsGlobal.Matriz2[8][5] == 223 ||
              ClsGlobal.Matriz2[8][5] == 231 ||
              ClsGlobal.Matriz2[8][5] == 232 ||
              ClsGlobal.Matriz2[8][5] == 233 ||
              ClsGlobal.Matriz2[8][5] == 321 ||
              ClsGlobal.Matriz2[8][5] == 322 ||
              ClsGlobal.Matriz2[8][5] == 331 ||
              ClsGlobal.Matriz2[8][5] == 332){
                JBI6_2.setEnabled(false);
           }else{
                JBI6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][6] == 1 ||
              ClsGlobal.Matriz2[8][6] == 121 ||
              ClsGlobal.Matriz2[8][6] == 122 ||
              ClsGlobal.Matriz2[8][6] == 123 ||
              ClsGlobal.Matriz2[8][6] == 124 ||
              ClsGlobal.Matriz2[8][6] == 131 ||
              ClsGlobal.Matriz2[8][6] == 132 ||
              ClsGlobal.Matriz2[8][6] == 133 ||
              ClsGlobal.Matriz2[8][6] == 134 ||
              ClsGlobal.Matriz2[8][6] == 221 ||
              ClsGlobal.Matriz2[8][6] == 222 ||
              ClsGlobal.Matriz2[8][6] == 223 ||
              ClsGlobal.Matriz2[8][6] == 231 ||
              ClsGlobal.Matriz2[8][6] == 232 ||
              ClsGlobal.Matriz2[8][6] == 233 ||
              ClsGlobal.Matriz2[8][6] == 321 ||
              ClsGlobal.Matriz2[8][6] == 322 ||
              ClsGlobal.Matriz2[8][6] == 331 ||
              ClsGlobal.Matriz2[8][6] == 332){
                JBI7_2.setEnabled(false);
           }else{
                JBI7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][7] == 1 ||
              ClsGlobal.Matriz2[8][7] == 121 ||
              ClsGlobal.Matriz2[8][7] == 122 ||
              ClsGlobal.Matriz2[8][7] == 123 ||
              ClsGlobal.Matriz2[8][7] == 124 ||
              ClsGlobal.Matriz2[8][7] == 131 ||
              ClsGlobal.Matriz2[8][7] == 132 ||
              ClsGlobal.Matriz2[8][7] == 133 ||
              ClsGlobal.Matriz2[8][7] == 134 ||
              ClsGlobal.Matriz2[8][7] == 221 ||
              ClsGlobal.Matriz2[8][7] == 222 ||
              ClsGlobal.Matriz2[8][7] == 223 ||
              ClsGlobal.Matriz2[8][7] == 231 ||
              ClsGlobal.Matriz2[8][7] == 232 ||
              ClsGlobal.Matriz2[8][7] == 233 ||
              ClsGlobal.Matriz2[8][7] == 321 ||
              ClsGlobal.Matriz2[8][7] == 322 ||
              ClsGlobal.Matriz2[8][7] == 331 ||
              ClsGlobal.Matriz2[8][7] == 332){
                JBI8_2.setEnabled(false);
           }else{
                JBI8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][8] == 1 ||
              ClsGlobal.Matriz2[8][8] == 121 ||
              ClsGlobal.Matriz2[8][8] == 122 ||
              ClsGlobal.Matriz2[8][8] == 123 ||
              ClsGlobal.Matriz2[8][8] == 124 ||
              ClsGlobal.Matriz2[8][8] == 131 ||
              ClsGlobal.Matriz2[8][8] == 132 ||
              ClsGlobal.Matriz2[8][8] == 133 ||
              ClsGlobal.Matriz2[8][8] == 134 ||
              ClsGlobal.Matriz2[8][8] == 221 ||
              ClsGlobal.Matriz2[8][8] == 222 ||
              ClsGlobal.Matriz2[8][8] == 223 ||
              ClsGlobal.Matriz2[8][8] == 231 ||
              ClsGlobal.Matriz2[8][8] == 232 ||
              ClsGlobal.Matriz2[8][8] == 233 ||
              ClsGlobal.Matriz2[8][8] == 321 ||
              ClsGlobal.Matriz2[8][8] == 322 ||
              ClsGlobal.Matriz2[8][8] == 331 ||
              ClsGlobal.Matriz2[8][8] == 332){
                JBI9_2.setEnabled(false);
           }else{
                JBI9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[8][9] == 1 ||
              ClsGlobal.Matriz2[8][9] == 121 ||
              ClsGlobal.Matriz2[8][9] == 122 ||
              ClsGlobal.Matriz2[8][9] == 123 ||
              ClsGlobal.Matriz2[8][9] == 124 ||
              ClsGlobal.Matriz2[8][9] == 131 ||
              ClsGlobal.Matriz2[8][9] == 132 ||
              ClsGlobal.Matriz2[8][9] == 133 ||
              ClsGlobal.Matriz2[8][9] == 134 ||
              ClsGlobal.Matriz2[8][9] == 221 ||
              ClsGlobal.Matriz2[8][9] == 222 ||
              ClsGlobal.Matriz2[8][9] == 223 ||
              ClsGlobal.Matriz2[8][9] == 231 ||
              ClsGlobal.Matriz2[8][9] == 232 ||
              ClsGlobal.Matriz2[8][9] == 233 ||
              ClsGlobal.Matriz2[8][9] == 321 ||
              ClsGlobal.Matriz2[8][9] == 322 ||
              ClsGlobal.Matriz2[8][9] == 331 ||
              ClsGlobal.Matriz2[8][9] == 332){
                JBI10_2.setEnabled(false);
           }else{
                JBI10_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][0] == 1 ||
              ClsGlobal.Matriz2[9][0] == 121 ||
              ClsGlobal.Matriz2[9][0] == 122 ||
              ClsGlobal.Matriz2[9][0] == 123 ||
              ClsGlobal.Matriz2[9][0] == 124 ||
              ClsGlobal.Matriz2[9][0] == 131 ||
              ClsGlobal.Matriz2[9][0] == 132 ||
              ClsGlobal.Matriz2[9][0] == 133 ||
              ClsGlobal.Matriz2[9][0] == 134 ||
              ClsGlobal.Matriz2[9][0] == 221 ||
              ClsGlobal.Matriz2[9][0] == 222 ||
              ClsGlobal.Matriz2[9][0] == 223 ||
              ClsGlobal.Matriz2[9][0] == 231 ||
              ClsGlobal.Matriz2[9][0] == 232 ||
              ClsGlobal.Matriz2[9][0] == 233 ||
              ClsGlobal.Matriz2[9][0] == 321 ||
              ClsGlobal.Matriz2[9][0] == 322 ||
              ClsGlobal.Matriz2[9][0] == 331 ||
              ClsGlobal.Matriz2[9][0] == 332){
                JBJ1_1.setEnabled(false);
           }else{
                JBJ1_1.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][1] == 1 ||
              ClsGlobal.Matriz2[9][1] == 121 ||
              ClsGlobal.Matriz2[9][1] == 122 ||
              ClsGlobal.Matriz2[9][1] == 123 ||
              ClsGlobal.Matriz2[9][1] == 124 ||
              ClsGlobal.Matriz2[9][1] == 131 ||
              ClsGlobal.Matriz2[9][1] == 132 ||
              ClsGlobal.Matriz2[9][1] == 133 ||
              ClsGlobal.Matriz2[9][1] == 134 ||
              ClsGlobal.Matriz2[9][1] == 221 ||
              ClsGlobal.Matriz2[9][1] == 222 ||
              ClsGlobal.Matriz2[9][1] == 223 ||
              ClsGlobal.Matriz2[9][1] == 231 ||
              ClsGlobal.Matriz2[9][1] == 232 ||
              ClsGlobal.Matriz2[9][1] == 233 ||
              ClsGlobal.Matriz2[9][1] == 321 ||
              ClsGlobal.Matriz2[9][1] == 322 ||
              ClsGlobal.Matriz2[9][1] == 331 ||
              ClsGlobal.Matriz2[9][1] == 332){
                JBJ2_2.setEnabled(false);
           }else{
                JBJ2_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][2] == 1 ||
              ClsGlobal.Matriz2[9][2] == 121 ||
              ClsGlobal.Matriz2[9][2] == 122 ||
              ClsGlobal.Matriz2[9][2] == 123 ||
              ClsGlobal.Matriz2[9][2] == 124 ||
              ClsGlobal.Matriz2[9][2] == 131 ||
              ClsGlobal.Matriz2[9][2] == 132 ||
              ClsGlobal.Matriz2[9][2] == 133 ||
              ClsGlobal.Matriz2[9][2] == 134 ||
              ClsGlobal.Matriz2[9][2] == 221 ||
              ClsGlobal.Matriz2[9][2] == 222 ||
              ClsGlobal.Matriz2[9][2] == 223 ||
              ClsGlobal.Matriz2[9][2] == 231 ||
              ClsGlobal.Matriz2[9][2] == 232 ||
              ClsGlobal.Matriz2[9][2] == 233 ||
              ClsGlobal.Matriz2[9][2] == 321 ||
              ClsGlobal.Matriz2[9][2] == 322 ||
              ClsGlobal.Matriz2[9][2] == 331 ||
              ClsGlobal.Matriz2[9][2] == 332){
                JBJ3_2.setEnabled(false);
           }else{
                JBJ3_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][3] == 1 ||
              ClsGlobal.Matriz2[9][3] == 121 ||
              ClsGlobal.Matriz2[9][3] == 122 ||
              ClsGlobal.Matriz2[9][3] == 123 ||
              ClsGlobal.Matriz2[9][3] == 124 ||
              ClsGlobal.Matriz2[9][3] == 131 ||
              ClsGlobal.Matriz2[9][3] == 132 ||
              ClsGlobal.Matriz2[9][3] == 133 ||
              ClsGlobal.Matriz2[9][3] == 134 ||
              ClsGlobal.Matriz2[9][3] == 221 ||
              ClsGlobal.Matriz2[9][3] == 222 ||
              ClsGlobal.Matriz2[9][3] == 223 ||
              ClsGlobal.Matriz2[9][3] == 231 ||
              ClsGlobal.Matriz2[9][3] == 232 ||
              ClsGlobal.Matriz2[9][3] == 233 ||
              ClsGlobal.Matriz2[9][3] == 321 ||
              ClsGlobal.Matriz2[9][3] == 322 ||
              ClsGlobal.Matriz2[9][3] == 331 ||
              ClsGlobal.Matriz2[9][3] == 332){
                JBJ4_2.setEnabled(false);
           }else{
                JBJ4_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][4] == 1 ||
              ClsGlobal.Matriz2[9][4] == 121 ||
              ClsGlobal.Matriz2[9][4] == 122 ||
              ClsGlobal.Matriz2[9][4] == 123 ||
              ClsGlobal.Matriz2[9][4] == 124 ||
              ClsGlobal.Matriz2[9][4] == 131 ||
              ClsGlobal.Matriz2[9][4] == 132 ||
              ClsGlobal.Matriz2[9][4] == 133 ||
              ClsGlobal.Matriz2[9][4] == 134 ||
              ClsGlobal.Matriz2[9][4] == 221 ||
              ClsGlobal.Matriz2[9][4] == 222 ||
              ClsGlobal.Matriz2[9][4] == 223 ||
              ClsGlobal.Matriz2[9][4] == 231 ||
              ClsGlobal.Matriz2[9][4] == 232 ||
              ClsGlobal.Matriz2[9][4] == 233 ||
              ClsGlobal.Matriz2[9][4] == 321 ||
              ClsGlobal.Matriz2[9][4] == 322 ||
              ClsGlobal.Matriz2[9][4] == 331 ||
              ClsGlobal.Matriz2[9][4] == 332){
                JBJ5_2.setEnabled(false);
           }else{
                JBJ5_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][5] == 1 ||
              ClsGlobal.Matriz2[9][5] == 121 ||
              ClsGlobal.Matriz2[9][5] == 122 ||
              ClsGlobal.Matriz2[9][5] == 123 ||
              ClsGlobal.Matriz2[9][5] == 124 ||
              ClsGlobal.Matriz2[9][5] == 131 ||
              ClsGlobal.Matriz2[9][5] == 132 ||
              ClsGlobal.Matriz2[9][5] == 133 ||
              ClsGlobal.Matriz2[9][5] == 134 ||
              ClsGlobal.Matriz2[9][5] == 221 ||
              ClsGlobal.Matriz2[9][5] == 222 ||
              ClsGlobal.Matriz2[9][5] == 223 ||
              ClsGlobal.Matriz2[9][5] == 231 ||
              ClsGlobal.Matriz2[9][5] == 232 ||
              ClsGlobal.Matriz2[9][5] == 233 ||
              ClsGlobal.Matriz2[9][5] == 321 ||
              ClsGlobal.Matriz2[9][5] == 322 ||
              ClsGlobal.Matriz2[9][5] == 331 ||
              ClsGlobal.Matriz2[9][5] == 332){
                JBJ6_2.setEnabled(false);
           }else{
                JBJ6_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][6] == 1 ||
              ClsGlobal.Matriz2[9][6] == 121 ||
              ClsGlobal.Matriz2[9][6] == 122 ||
              ClsGlobal.Matriz2[9][6] == 123 ||
              ClsGlobal.Matriz2[9][6] == 124 ||
              ClsGlobal.Matriz2[9][6] == 131 ||
              ClsGlobal.Matriz2[9][6] == 132 ||
              ClsGlobal.Matriz2[9][6] == 133 ||
              ClsGlobal.Matriz2[9][6] == 134 ||
              ClsGlobal.Matriz2[9][6] == 221 ||
              ClsGlobal.Matriz2[9][6] == 222 ||
              ClsGlobal.Matriz2[9][6] == 223 ||
              ClsGlobal.Matriz2[9][6] == 231 ||
              ClsGlobal.Matriz2[9][6] == 232 ||
              ClsGlobal.Matriz2[9][6] == 233 ||
              ClsGlobal.Matriz2[9][6] == 321 ||
              ClsGlobal.Matriz2[9][6] == 322 ||
              ClsGlobal.Matriz2[9][6] == 331 ||
              ClsGlobal.Matriz2[9][6] == 332){
                JBJ7_2.setEnabled(false);
           }else{
                JBJ7_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][7] == 1 ||
              ClsGlobal.Matriz2[9][7] == 121 ||
              ClsGlobal.Matriz2[9][7] == 122 ||
              ClsGlobal.Matriz2[9][7] == 123 ||
              ClsGlobal.Matriz2[9][7] == 124 ||
              ClsGlobal.Matriz2[9][7] == 131 ||
              ClsGlobal.Matriz2[9][7] == 132 ||
              ClsGlobal.Matriz2[9][7] == 133 ||
              ClsGlobal.Matriz2[9][7] == 134 ||
              ClsGlobal.Matriz2[9][7] == 221 ||
              ClsGlobal.Matriz2[9][7] == 222 ||
              ClsGlobal.Matriz2[9][7] == 223 ||
              ClsGlobal.Matriz2[9][7] == 231 ||
              ClsGlobal.Matriz2[9][7] == 232 ||
              ClsGlobal.Matriz2[9][7] == 233 ||
              ClsGlobal.Matriz2[9][7] == 321 ||
              ClsGlobal.Matriz2[9][7] == 322 ||
              ClsGlobal.Matriz2[9][7] == 331 ||
              ClsGlobal.Matriz2[9][7] == 332){
                JBJ8_2.setEnabled(false);
           }else{
                JBJ8_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][8] == 1 ||
              ClsGlobal.Matriz2[9][8] == 121 ||
              ClsGlobal.Matriz2[9][8] == 122 ||
              ClsGlobal.Matriz2[9][8] == 123 ||
              ClsGlobal.Matriz2[9][8] == 124 ||
              ClsGlobal.Matriz2[9][8] == 131 ||
              ClsGlobal.Matriz2[9][8] == 132 ||
              ClsGlobal.Matriz2[9][8] == 133 ||
              ClsGlobal.Matriz2[9][8] == 134 ||
              ClsGlobal.Matriz2[9][8] == 221 ||
              ClsGlobal.Matriz2[9][8] == 222 ||
              ClsGlobal.Matriz2[9][8] == 223 ||
              ClsGlobal.Matriz2[9][8] == 231 ||
              ClsGlobal.Matriz2[9][8] == 232 ||
              ClsGlobal.Matriz2[9][8] == 233 ||
              ClsGlobal.Matriz2[9][8] == 321 ||
              ClsGlobal.Matriz2[9][8] == 322 ||
              ClsGlobal.Matriz2[9][8] == 331 ||
              ClsGlobal.Matriz2[9][8] == 332){
                JBJ9_2.setEnabled(false);
           }else{
                JBJ9_2.setEnabled(true);
           }
           
           if(ClsGlobal.Matriz2[9][9] == 1 ||
              ClsGlobal.Matriz2[9][9] == 121 ||
              ClsGlobal.Matriz2[9][9] == 122 ||
              ClsGlobal.Matriz2[9][9] == 123 ||
              ClsGlobal.Matriz2[9][9] == 124 ||
              ClsGlobal.Matriz2[9][9] == 131 ||
              ClsGlobal.Matriz2[9][9] == 132 ||
              ClsGlobal.Matriz2[9][9] == 133 ||
              ClsGlobal.Matriz2[9][9] == 134 ||
              ClsGlobal.Matriz2[9][9] == 221 ||
              ClsGlobal.Matriz2[9][9] == 222 ||
              ClsGlobal.Matriz2[9][9] == 223 ||
              ClsGlobal.Matriz2[9][9] == 231 ||
              ClsGlobal.Matriz2[9][9] == 232 ||
              ClsGlobal.Matriz2[9][9] == 233 ||
              ClsGlobal.Matriz2[9][9] == 321 ||
              ClsGlobal.Matriz2[9][9] == 322 ||
              ClsGlobal.Matriz2[9][9] == 331 ||
              ClsGlobal.Matriz2[9][9] == 332){
                JBJ10_2.setEnabled(false);
           }else{
                JBJ10_2.setEnabled(true);
           }
        }

    private void GenerarJugador2() {
        
        Matriz1[0][0] = 101;
        Matriz1[0][1] = 101;
        Matriz1[0][2] = 0;
        Matriz1[0][3] = 0;
        Matriz1[0][4] = 0;
        Matriz1[0][5] = 0;
        Matriz1[0][6] = 0;
        Matriz1[0][7] = 0;
        Matriz1[0][8] = 0;
        Matriz1[0][9] = 0;
        
        Matriz1[1][0] = 0;
        Matriz1[1][1] = 0;
        Matriz1[1][2] = 0;
        Matriz1[1][3] = 0;
        Matriz1[1][4] = 0;
        Matriz1[1][5] = 0;
        Matriz1[1][6] = 0;
        Matriz1[1][7] = 213;
        Matriz1[1][8] = 0;
        Matriz1[1][9] = 0;
        
        Matriz1[2][0] = 0;
        Matriz1[2][1] = 102;
        Matriz1[2][2] = 102;
        Matriz1[2][3] = 0;
        Matriz1[2][4] = 0;
        Matriz1[2][5] = 113;
        Matriz1[2][6] = 0;
        Matriz1[2][7] = 213;
        Matriz1[2][8] = 0;
        Matriz1[2][9] = 0;
        
        Matriz1[3][0] = 0;
        Matriz1[3][1] = 0;
        Matriz1[3][2] = 0;
        Matriz1[3][3] = 0;
        Matriz1[3][4] = 0;
        Matriz1[3][5] = 113;
        Matriz1[3][6] = 0;
        Matriz1[3][7] = 213;
        Matriz1[3][8] = 0;
        Matriz1[3][9] = 0;
        
        Matriz1[4][0] = 0;
        Matriz1[4][1] = 0;
        Matriz1[4][2] = 0;
        Matriz1[4][3] = 0;
        Matriz1[4][4] = 0;
        Matriz1[4][5] = 0;
        Matriz1[4][6] = 0;
        Matriz1[4][7] = 0;
        Matriz1[4][8] = 114;
        Matriz1[4][9] = 0;
        
        Matriz1[5][0] = 0;
        Matriz1[5][1] = 0;
        Matriz1[5][2] = 0;
        Matriz1[5][3] = 0;
        Matriz1[5][4] = 0;
        Matriz1[5][5] = 0;
        Matriz1[5][6] = 311;
        Matriz1[5][7] = 0;
        Matriz1[5][8] = 114;
        Matriz1[5][9] = 0;
        
        Matriz1[6][0] = 0;
        Matriz1[6][1] = 0;
        Matriz1[6][2] = 201;
        Matriz1[6][3] = 201;
        Matriz1[6][4] = 201;
        Matriz1[6][5] = 0;
        Matriz1[6][6] = 311;
        Matriz1[6][7] = 0;
        Matriz1[6][8] = 0;
        Matriz1[6][9] = 0;
        
        Matriz1[7][0] = 202;
        Matriz1[7][1] = 202;
        Matriz1[7][2] = 202;
        Matriz1[7][3] = 0;
        Matriz1[7][4] = 0;
        Matriz1[7][5] = 0;
        Matriz1[7][6] = 311;
        Matriz1[7][7] = 0;
        Matriz1[7][8] = 0;
        Matriz1[7][9] = 0;
        
        Matriz1[8][0] = 0;
        Matriz1[8][1] = 0;
        Matriz1[8][2] = 0;
        Matriz1[8][3] = 0;
        Matriz1[8][4] = 0;
        Matriz1[8][5] = 0;
        Matriz1[8][6] = 311;
        Matriz1[8][7] = 0;
        Matriz1[8][8] = 0;
        Matriz1[8][9] = 0;
        
        Matriz1[9][0] = 302;
        Matriz1[9][1] = 302;
        Matriz1[9][2] = 302;
        Matriz1[9][3] = 302;
        Matriz1[9][4] = 0;
        Matriz1[9][5] = 0;
        Matriz1[9][6] = 0;
        Matriz1[9][7] = 0;
        Matriz1[9][8] = 0;
        Matriz1[9][9] = 0;
        
        Matriz2[0][0] = 101;
        Matriz2[0][1] = 101;
        Matriz2[0][2] = 0;
        Matriz2[0][3] = 0;
        Matriz2[0][4] = 0;
        Matriz2[0][5] = 0;
        Matriz2[0][6] = 0;
        Matriz2[0][7] = 201;
        Matriz2[0][8] = 201;
        Matriz2[0][9] = 201;
        
        Matriz2[1][0] = 0;
        Matriz2[1][1] = 0;
        Matriz2[1][2] = 0;
        Matriz2[1][3] = 0;
        Matriz2[1][4] = 113;
        Matriz2[1][5] = 0;
        Matriz2[1][6] = 0;
        Matriz2[1][7] = 0;
        Matriz2[1][8] = 0;
        Matriz2[1][9] = 0;
       
        Matriz2[2][0] = 213;
        Matriz2[2][1] = 0;
        Matriz2[2][2] = 0;
        Matriz2[2][3] = 0;
        Matriz2[2][4] = 113;
        Matriz2[2][5] = 0;
        Matriz2[2][6] = 0;
        Matriz2[2][7] = 0;
        Matriz2[2][8] = 0;
        Matriz2[2][9] = 0;
        
        Matriz2[3][0] = 211;
        Matriz2[3][1] = 0;
        Matriz2[3][2] = 0;
        Matriz2[3][3] = 0;
        Matriz2[3][4] = 0;
        Matriz2[3][5] = 0;
        Matriz2[3][6] = 0;
        Matriz2[3][7] = 311;
        Matriz2[3][8] = 0;
        Matriz2[3][9] = 0;
        
        Matriz2[4][0] = 213;
        Matriz2[4][1] = 0;
        Matriz2[4][2] = 0;
        Matriz2[4][3] = 0;
        Matriz2[4][4] = 0;
        Matriz2[4][5] = 0;
        Matriz2[4][6] = 0;
        Matriz2[4][7] = 311;
        Matriz2[4][8] = 0;
        Matriz2[4][9] = 0;
        
        Matriz2[5][0] = 0;
        Matriz2[5][1] = 0;
        Matriz2[5][2] = 0;
        Matriz2[5][3] = 0;
        Matriz2[5][4] = 0;
        Matriz2[5][5] = 0;
        Matriz2[5][6] = 0;
        Matriz2[5][7] = 311;
        Matriz2[5][8] = 0;
        Matriz2[5][9] = 0;
        
        Matriz2[6][0] = 0;
        Matriz2[6][1] = 302;
        Matriz2[6][2] = 302;
        Matriz2[6][3] = 302;
        Matriz2[6][4] = 302;
        Matriz2[6][5] = 0;
        Matriz2[6][6] = 0;
        Matriz2[6][7] = 311;
        Matriz2[6][8] = 0;
        Matriz2[6][9] = 0;
        
        Matriz2[7][0] = 0;
        Matriz2[7][1] = 0;
        Matriz2[7][2] = 0;
        Matriz2[7][3] = 0;
        Matriz2[7][4] = 0;
        Matriz2[7][5] = 0;
        Matriz2[7][6] = 0;
        Matriz2[7][7] = 0;
        Matriz2[7][8] = 0;
        Matriz2[7][9] = 0;
        
        Matriz2[8][0] = 114;
        Matriz2[8][1] = 0;
        Matriz2[8][2] = 0;
        Matriz2[8][3] = 0;
        Matriz2[8][4] = 0;
        Matriz2[8][5] = 0;
        Matriz2[8][6] = 0;
        Matriz2[8][7] = 0;
        Matriz2[8][8] = 0;
        Matriz2[8][9] = 0;
        
        Matriz2[9][0] = 114;
        Matriz2[9][1] = 0;
        Matriz2[9][2] = 0;
        Matriz2[9][3] = 202;
        Matriz2[9][4] = 202;
        Matriz2[9][5] = 202;
        Matriz2[9][6] = 0;
        Matriz2[9][7] = 0;
        Matriz2[9][8] = 102;
        Matriz2[9][9] = 102;
        
        Matriz3[0][0] = 0;
        Matriz3[0][1] = 0;
        Matriz3[0][2] = 0;
        Matriz3[0][3] = 0;
        Matriz3[0][4] = 0;
        Matriz3[0][5] = 0;
        Matriz3[0][6] = 0;
        Matriz3[0][7] = 0;
        Matriz3[0][8] = 311;
        Matriz3[0][9] = 0;
        
        Matriz3[1][0] = 113;
        Matriz3[1][1] = 0;
        Matriz3[1][2] = 0;
        Matriz3[1][3] = 201;
        Matriz3[1][4] = 201;
        Matriz3[1][5] = 201;
        Matriz3[1][6] = 0;
        Matriz3[1][7] = 0;
        Matriz3[1][8] = 311;
        Matriz3[1][9] = 0;
       
        Matriz3[2][0] = 113;
        Matriz3[2][1] = 0;
        Matriz3[2][2] = 0;
        Matriz3[2][3] = 0;
        Matriz3[2][4] = 0;
        Matriz3[2][5] = 0;
        Matriz3[2][6] = 102;
        Matriz3[2][7] = 102;
        Matriz3[2][8] = 311;
        Matriz3[2][9] = 0;
       
        Matriz3[3][0] = 0;
        Matriz3[3][1] = 0;
        Matriz3[3][2] = 0;
        Matriz3[3][3] = 0;
        Matriz3[3][4] = 0;
        Matriz3[3][5] = 0;
        Matriz3[3][6] = 0;
        Matriz3[3][7] = 0;
        Matriz3[3][8] = 311;
        Matriz3[3][9] = 213;
        
        Matriz3[4][0] = 0;
        Matriz3[4][1] = 0;
        Matriz3[4][2] = 101;
        Matriz3[4][3] = 101;
        Matriz3[4][4] = 0;
        Matriz3[4][5] = 0;
        Matriz3[4][6] = 0;
        Matriz3[4][7] = 0;
        Matriz3[4][8] = 0;
        Matriz3[4][9] = 213;
        
        Matriz3[5][0] = 0;
        Matriz3[5][1] = 0;
        Matriz3[5][2] = 0;
        Matriz3[5][3] = 0;
        Matriz3[5][4] = 0;
        Matriz3[5][5] = 0;
        Matriz3[5][6] = 114;
        Matriz3[5][7] = 0;
        Matriz3[5][8] = 0;
        Matriz3[5][9] = 213;
        
        Matriz3[6][0] = 0;
        Matriz3[6][1] = 0;
        Matriz3[6][2] = 202;
        Matriz3[6][3] = 202;
        Matriz3[6][4] = 202;
        Matriz3[6][5] = 0;
        Matriz3[6][6] = 114;
        Matriz3[6][7] = 0;
        Matriz3[6][8] = 0;
        Matriz3[6][9] = 0;
        
        Matriz3[7][0] = 0;
        Matriz3[7][1] = 0;
        Matriz3[7][2] = 0;
        Matriz3[7][3] = 0;
        Matriz3[7][4] = 0;
        Matriz3[7][5] = 0;
        Matriz3[7][6] = 0;
        Matriz3[7][7] = 0;
        Matriz3[7][8] = 0;
        Matriz3[7][9] = 0;
        
        Matriz3[8][0] = 0;
        Matriz3[8][1] = 0;
        Matriz3[8][2] = 0;
        Matriz3[8][3] = 0;
        Matriz3[8][4] = 0;
        Matriz3[8][5] = 0;
        Matriz3[8][6] = 0;
        Matriz3[8][7] = 0;
        Matriz3[8][8] = 0;
        Matriz3[8][9] = 0;
        
        Matriz3[9][0] = 302;
        Matriz3[9][1] = 302;
        Matriz3[9][2] = 302;
        Matriz3[9][3] = 302;
        Matriz3[9][4] = 0;
        Matriz3[9][5] = 0;
        Matriz3[9][6] = 0;
        Matriz3[9][7] = 0;
        Matriz3[9][8] = 0;
        Matriz3[9][9] = 0;
        
        Matriz4[0][0] = 0;
        Matriz4[0][1] = 0;
        Matriz4[0][2] = 0;
        Matriz4[0][3] = 0;
        Matriz4[0][4] = 0;
        Matriz4[0][5] = 0;
        Matriz4[0][6] = 0;
        Matriz4[0][7] = 0;
        Matriz4[0][8] = 102;
        Matriz4[0][9] = 102;
        
        Matriz4[1][0] = 0;
        Matriz4[1][1] = 113;
        Matriz4[1][2] = 0;
        Matriz4[1][3] = 0;
        Matriz4[1][4] = 0;
        Matriz4[1][5] = 0;
        Matriz4[1][6] = 0;
        Matriz4[1][7] = 0;
        Matriz4[1][8] = 0;
        Matriz4[1][9] = 0;
       
        Matriz4[2][0] = 0;
        Matriz4[2][1] = 113;
        Matriz4[2][2] = 0;
        Matriz4[2][3] = 0;
        Matriz4[2][4] = 0;
        Matriz4[2][5] = 0;
        Matriz4[2][6] = 101;
        Matriz4[2][7] = 101;
        Matriz4[2][8] = 0;
        Matriz4[2][9] = 0;
        
        Matriz4[3][0] = 0;
        Matriz4[3][1] = 0;
        Matriz4[3][2] = 0;
        Matriz4[3][3] = 0;
        Matriz4[3][4] = 0;
        Matriz4[3][5] = 0;
        Matriz4[3][6] = 0;
        Matriz4[3][7] = 0;
        Matriz4[3][8] = 0;
        Matriz4[3][9] = 311;
        
        Matriz4[4][0] = 213;
        Matriz4[4][1] = 0;
        Matriz4[4][2] = 0;
        Matriz4[4][3] = 0;
        Matriz4[4][4] = 114;
        Matriz4[4][5] = 0;
        Matriz4[4][6] = 0;
        Matriz4[4][7] = 0;
        Matriz4[4][8] = 0;
        Matriz4[4][9] = 311;
        
        Matriz4[5][0] = 213;
        Matriz4[5][1] = 0;
        Matriz4[5][2] = 0;
        Matriz4[5][3] = 0;
        Matriz4[5][4] = 114;
        Matriz4[5][5] = 0;
        Matriz4[5][6] = 0;
        Matriz4[5][7] = 0;
        Matriz4[5][8] = 0;
        Matriz4[5][9] = 311;
        
        Matriz4[6][0] = 213;
        Matriz4[6][1] = 0;
        Matriz4[6][2] = 0;
        Matriz4[6][3] = 0;
        Matriz4[6][4] = 0;
        Matriz4[6][5] = 0;
        Matriz4[6][6] = 0;
        Matriz4[6][7] = 0;
        Matriz4[6][8] = 0;
        Matriz4[6][9] = 311;
        
        Matriz4[7][0] = 0;
        Matriz4[7][1] = 0;
        Matriz4[7][2] = 302;
        Matriz4[7][3] = 302;
        Matriz4[7][4] = 302;
        Matriz4[7][5] = 302;
        Matriz4[7][6] = 0;
        Matriz4[7][7] = 0;
        Matriz4[7][8] = 0;
        Matriz4[7][9] = 0;
        
        Matriz4[8][0] = 0;
        Matriz4[8][1] = 0;
        Matriz4[8][2] = 0;
        Matriz4[8][3] = 0;
        Matriz4[8][4] = 0;
        Matriz4[8][5] = 0;
        Matriz4[8][6] = 0;
        Matriz4[8][7] = 0;
        Matriz4[8][8] = 0;
        Matriz4[8][9] = 0;
        
        Matriz4[9][0] = 201;
        Matriz4[9][1] = 201;
        Matriz4[9][2] = 201;
        Matriz4[9][3] = 0;
        Matriz4[9][4] = 0;
        Matriz4[9][5] = 202;
        Matriz4[9][6] = 202;
        Matriz4[9][7] = 202;
        Matriz4[9][8] = 0;
        Matriz4[9][9] = 0;
        
        Matriz5[0][0] = 0;
        Matriz5[0][1] = 0;
        Matriz5[0][2] = 0;
        Matriz5[0][3] = 101;
        Matriz5[0][4] = 101;
        Matriz5[0][5] = 0;
        Matriz5[0][6] = 0;
        Matriz5[0][7] = 0;
        Matriz5[0][8] = 0;
        Matriz5[0][9] = 0;
        
        Matriz5[1][0] = 0;
        Matriz5[1][1] = 0;
        Matriz5[1][2] = 0;
        Matriz5[1][3] = 0;
        Matriz5[1][4] = 0;
        Matriz5[1][5] = 0;
        Matriz5[1][6] = 0;
        Matriz5[1][7] = 0;
        Matriz5[1][8] = 0;
        Matriz5[1][9] = 0;
       
        Matriz5[2][0] = 201;
        Matriz5[2][1] = 201;
        Matriz5[2][2] = 201;
        Matriz5[2][3] = 0;
        Matriz5[2][4] = 0;
        Matriz5[2][5] = 0;
        Matriz5[2][6] = 0;
        Matriz5[2][7] = 0;
        Matriz5[2][8] = 0;
        Matriz5[2][9] = 0;
        
        Matriz5[3][0] = 0;
        Matriz5[3][1] = 0;
        Matriz5[3][2] = 0;
        Matriz5[3][3] = 0;
        Matriz5[3][4] = 0;
        Matriz5[3][5] = 0;
        Matriz5[3][6] = 0;
        Matriz5[3][7] = 0;
        Matriz5[3][8] = 102;
        Matriz5[3][9] = 102;
        
        Matriz5[4][0] = 302;
        Matriz5[4][1] = 302;
        Matriz5[4][2] = 302;
        Matriz5[4][3] = 302;
        Matriz5[4][4] = 0;
        Matriz5[4][5] = 114;
        Matriz5[4][6] = 0;
        Matriz5[4][7] = 0;
        Matriz5[4][8] = 0;
        Matriz5[4][9] = 0;
        
        Matriz5[5][0] = 0;
        Matriz5[5][1] = 0;
        Matriz5[5][2] = 0;
        Matriz5[5][3] = 0;
        Matriz5[5][4] = 0;
        Matriz5[5][5] = 115;
        Matriz5[5][6] = 0;
        Matriz5[5][7] = 0;
        Matriz5[5][8] = 311;
        Matriz5[5][9] = 0;
        
        Matriz5[6][0] = 0;
        Matriz5[6][1] = 0;
        Matriz5[6][2] = 113;
        Matriz5[6][3] = 0;
        Matriz5[6][4] = 0;
        Matriz5[6][5] = 0;
        Matriz5[6][6] = 0;
        Matriz5[6][7] = 0;
        Matriz5[6][8] = 311;
        Matriz5[6][9] = 0;
       
        Matriz5[7][0] = 213;
        Matriz5[7][1] = 0;
        Matriz5[7][2] = 113;
        Matriz5[7][3] = 0;
        Matriz5[7][4] = 0;
        Matriz5[7][5] = 0;
        Matriz5[7][6] = 0;
        Matriz5[7][7] = 0;
        Matriz5[7][8] = 311;
        Matriz5[7][9] = 0;
        
        Matriz5[8][0] = 213;
        Matriz5[8][1] = 0;
        Matriz5[8][2] = 0;
        Matriz5[8][3] = 0;
        Matriz5[8][4] = 0;
        Matriz5[8][5] = 0;
        Matriz5[8][6] = 0;
        Matriz5[8][7] = 0;
        Matriz5[8][8] = 311;
        Matriz5[8][9] = 0;
        
        Matriz5[9][0] = 213;
        Matriz5[9][1] = 0;
        Matriz5[9][2] = 0;
        Matriz5[9][3] = 0;
        Matriz5[9][4] = 202;
        Matriz5[9][5] = 202;
        Matriz5[9][6] = 202;
        Matriz5[9][7] = 0;
        Matriz5[9][8] = 0;
        Matriz5[9][9] = 0;
       
        Matriz6[0][0] = 102;
        Matriz6[0][1] = 102;
        Matriz6[0][2] = 0;
        Matriz6[0][3] = 0;
        Matriz6[0][4] = 0;
        Matriz6[0][5] = 0;
        Matriz6[0][6] = 0;
        Matriz6[0][7] = 201;
        Matriz6[0][8] = 201;
        Matriz6[0][9] = 201;
        
        Matriz6[1][0] = 0;
        Matriz6[1][1] = 0;
        Matriz6[1][2] = 0;
        Matriz6[1][3] = 0;
        Matriz6[1][4] = 114;
        Matriz6[1][5] = 0;
        Matriz6[1][6] = 0;
        Matriz6[1][7] = 0;
        Matriz6[1][8] = 0;
        Matriz6[1][9] = 0;
       
        Matriz6[2][0] = 0;
        Matriz6[2][1] = 0;
        Matriz6[2][2] = 0;
        Matriz6[2][3] = 0;
        Matriz6[2][4] = 114;
        Matriz6[2][5] = 0;
        Matriz6[2][6] = 0;
        Matriz6[2][7] = 0;
        Matriz6[2][8] = 0;
        Matriz6[2][9] = 0;
        
        Matriz6[3][0] = 0;
        Matriz6[3][1] = 0;
        Matriz6[3][2] = 0;
        Matriz6[3][3] = 0;
        Matriz6[3][4] = 0;
        Matriz6[3][5] = 0;
        Matriz6[3][6] = 0;
        Matriz6[3][7] = 0;
        Matriz6[3][8] = 0;
        Matriz6[3][9] = 311;
        
        Matriz6[4][0] = 0;
        Matriz6[4][1] = 0;
        Matriz6[4][2] = 0;
        Matriz6[4][3] = 213;
        Matriz6[4][4] = 0;
        Matriz6[4][5] = 0;
        Matriz6[4][6] = 101;
        Matriz6[4][7] = 101;
        Matriz6[4][8] = 0;
        Matriz6[4][9] = 311;
       
        Matriz6[5][0] = 0;
        Matriz6[5][1] = 113;
        Matriz6[5][2] = 0;
        Matriz6[5][3] = 213;
        Matriz6[5][4] = 0;
        Matriz6[5][5] = 0;
        Matriz6[5][6] = 0;
        Matriz6[5][7] = 0;
        Matriz6[5][8] = 0;
        Matriz6[5][9] = 311;
        
        Matriz6[6][0] = 0;
        Matriz6[6][1] = 113;
        Matriz6[6][2] = 0;
        Matriz6[6][3] = 213;
        Matriz6[6][4] = 0;
        Matriz6[6][5] = 0;
        Matriz6[6][6] = 0;
        Matriz6[6][7] = 0;
        Matriz6[6][8] = 0;
        Matriz6[6][9] = 311;
        
        Matriz6[7][0] = 0;
        Matriz6[7][1] = 0;
        Matriz6[7][2] = 0;
        Matriz6[7][3] = 0;
        Matriz6[7][4] = 0;
        Matriz6[7][5] = 0;
        Matriz6[7][6] = 202;
        Matriz6[7][7] = 202;
        Matriz6[7][8] = 202;
        Matriz6[7][9] = 0;
       
        Matriz6[8][0] = 0;
        Matriz6[8][1] = 0;
        Matriz6[8][2] = 0;
        Matriz6[8][3] = 0;
        Matriz6[8][4] = 0;
        Matriz6[8][5] = 0;
        Matriz6[8][6] = 0;
        Matriz6[8][7] = 0;
        Matriz6[8][8] = 0;
        Matriz6[8][9] = 0;
        
        Matriz6[9][0] = 302;
        Matriz6[9][1] = 302;
        Matriz6[9][2] = 302;
        Matriz6[9][3] = 302;
        Matriz6[9][4] = 0;
        Matriz6[9][5] = 0;
        Matriz6[9][6] = 0;
        Matriz6[9][7] = 0;
        Matriz6[9][8] = 0;
        Matriz6[9][9] = 0;
        
        Matriz7[0][0] = 0;
        Matriz7[0][1] = 0;
        Matriz7[0][2] = 0;
        Matriz7[0][3] = 0;
        Matriz7[0][4] = 0;
        Matriz7[0][5] = 0;
        Matriz7[0][6] = 0;
        Matriz7[0][7] = 0;
        Matriz7[0][8] = 0;
        Matriz7[0][9] = 0;
        
        Matriz7[1][0] = 101;
        Matriz7[1][1] = 101;
        Matriz7[1][2] = 0;
        Matriz7[1][3] = 0;
        Matriz7[1][4] = 0;
        Matriz7[1][5] = 0;
        Matriz7[1][6] = 0;
        Matriz7[1][7] = 102;
        Matriz7[1][8] = 102;
        Matriz7[1][9] = 0;
       
        Matriz7[2][0] = 0;
        Matriz7[2][1] = 0;
        Matriz7[2][2] = 0;
        Matriz7[2][3] = 0;
        Matriz7[2][4] = 0;
        Matriz7[2][5] = 0;
        Matriz7[2][6] = 0;
        Matriz7[2][7] = 0;
        Matriz7[2][8] = 0;
        Matriz7[2][9] = 0;
        
        Matriz7[3][0] = 0;
        Matriz7[3][1] = 0;
        Matriz7[3][2] = 0;
        Matriz7[3][3] = 201;
        Matriz7[3][4] = 201;
        Matriz7[3][5] = 201;
        Matriz7[3][6] = 0;
        Matriz7[3][7] = 311;
        Matriz7[3][8] = 0;
        Matriz7[3][9] = 0;
        
        Matriz7[4][0] = 113;
        Matriz7[4][1] = 0;
        Matriz7[4][2] = 0;
        Matriz7[4][3] = 0;
        Matriz7[4][4] = 0;
        Matriz7[4][5] = 0;
        Matriz7[4][6] = 0;
        Matriz7[4][7] = 311;
        Matriz7[4][8] = 0;
        Matriz7[4][9] = 0;
        
        Matriz7[5][0] = 113;
        Matriz7[5][1] = 0;
        Matriz7[5][2] = 0;
        Matriz7[5][3] = 0;
        Matriz7[5][4] = 0;
        Matriz7[5][5] = 213;
        Matriz7[5][6] = 0;
        Matriz7[5][7] = 311;
        Matriz7[5][8] = 0;
        Matriz7[5][9] = 0;
        
        Matriz7[6][0] = 0;
        Matriz7[6][1] = 0;
        Matriz7[6][2] = 0;
        Matriz7[6][3] = 0;
        Matriz7[6][4] = 0;
        Matriz7[6][5] = 213;
        Matriz7[6][6] = 0;
        Matriz7[6][7] = 311;
        Matriz7[6][8] = 0;
        Matriz7[6][9] = 0;
        
        Matriz7[7][0] = 302;
        Matriz7[7][1] = 302;
        Matriz7[7][2] = 302;
        Matriz7[7][3] = 302;
        Matriz7[7][4] = 0;
        Matriz7[7][5] = 213;
        Matriz7[7][6] = 0;
        Matriz7[7][7] = 0;
        Matriz7[7][8] = 0;
        Matriz7[7][9] = 0;
       
        Matriz7[8][0] = 0;
        Matriz7[8][1] = 0;
        Matriz7[8][2] = 0;
        Matriz7[8][3] = 0;
        Matriz7[8][4] = 0;
        Matriz7[8][5] = 0;
        Matriz7[8][6] = 0;
        Matriz7[8][7] = 0;
        Matriz7[8][8] = 0;
        Matriz7[8][9] = 114;
       
        Matriz7[9][0] = 0;
        Matriz7[9][1] = 202;
        Matriz7[9][2] = 202;
        Matriz7[9][3] = 202;
        Matriz7[9][4] = 0;
        Matriz7[9][5] = 0;
        Matriz7[9][6] = 0;
        Matriz7[9][7] = 0;
        Matriz7[9][8] = 0;
        Matriz7[9][9] = 114;
        
        Matriz8[0][0] = 101;
        Matriz8[0][1] = 101;
        Matriz8[0][2] = 0;
        Matriz8[0][3] = 0;
        Matriz8[0][4] = 0;
        Matriz8[0][5] = 0;
        Matriz8[0][6] = 0;
        Matriz8[0][7] = 102;
        Matriz8[0][8] = 102;
        Matriz8[0][9] = 0;
        
        Matriz8[1][0] = 0;
        Matriz8[1][1] = 0;
        Matriz8[1][2] = 0;
        Matriz8[1][3] = 0;
        Matriz8[1][4] = 0;
        Matriz8[1][5] = 0;
        Matriz8[1][6] = 0;
        Matriz8[1][7] = 0;
        Matriz8[1][8] = 0;
        Matriz8[1][9] = 0;
      
        Matriz8[2][0] = 0;
        Matriz8[2][1] = 0;
        Matriz8[2][2] = 201;
        Matriz8[2][3] = 201;
        Matriz8[2][4] = 201;
        Matriz8[2][5] = 0;
        Matriz8[2][6] = 302;
        Matriz8[2][7] = 302;
        Matriz8[2][8] = 302;
        Matriz8[2][9] = 302;
        
        Matriz8[3][0] = 0;
        Matriz8[3][1] = 0;
        Matriz8[3][2] = 0;
        Matriz8[3][3] = 0;
        Matriz8[3][4] = 0;
        Matriz8[3][5] = 0;
        Matriz8[3][6] = 0;
        Matriz8[3][7] = 0;
        Matriz8[3][8] = 0;
        Matriz8[3][9] = 0;
      
        Matriz8[4][0] = 0;
        Matriz8[4][1] = 0;
        Matriz8[4][2] = 311;
        Matriz8[4][3] = 0;
        Matriz8[4][4] = 0;
        Matriz8[4][5] = 0;
        Matriz8[4][6] = 0;
        Matriz8[4][7] = 0;
        Matriz8[4][8] = 0;
        Matriz8[4][9] = 114;
        
        Matriz8[5][0] = 0;
        Matriz8[5][1] = 0;
        Matriz8[5][2] = 311;
        Matriz8[5][3] = 0;
        Matriz8[5][4] = 0;
        Matriz8[5][5] = 0;
        Matriz8[5][6] = 0;
        Matriz8[5][7] = 213;
        Matriz8[5][8] = 0;
        Matriz8[5][9] = 114;
        
        Matriz8[6][0] = 113;
        Matriz8[6][1] = 0;
        Matriz8[6][2] = 311;
        Matriz8[6][3] = 0;
        Matriz8[6][4] = 0;
        Matriz8[6][5] = 0;
        Matriz8[6][6] = 0;
        Matriz8[6][7] = 213;
        Matriz8[6][8] = 0;
        Matriz8[6][9] = 0;
        
        Matriz8[7][0] = 113;
        Matriz8[7][1] = 0;
        Matriz8[7][2] = 311;
        Matriz8[7][3] = 0;
        Matriz8[7][4] = 0;
        Matriz8[7][5] = 0;
        Matriz8[7][6] = 0;
        Matriz8[7][7] = 213;
        Matriz8[7][8] = 0;
        Matriz8[7][9] = 0;
       
        Matriz8[8][0] = 0;
        Matriz8[8][1] = 0;
        Matriz8[8][2] = 0;
        Matriz8[8][3] = 202;
        Matriz8[8][4] = 202;
        Matriz8[8][5] = 202;
        Matriz8[8][6] = 0;
        Matriz8[8][7] = 0;
        Matriz8[8][8] = 0;
        Matriz8[8][9] = 0;
        
        Matriz8[9][0] = 0;
        Matriz8[9][1] = 0;
        Matriz8[9][2] = 0;
        Matriz8[9][3] = 0;
        Matriz8[9][4] = 0;
        Matriz8[9][5] = 0;
        Matriz8[9][6] = 0;
        Matriz8[9][7] = 0;
        Matriz8[9][8] = 0;
        Matriz8[9][9] = 0;
        
        Matriz9[0][0] = 0;
        Matriz9[0][1] = 0;
        Matriz9[0][2] = 0;
        Matriz9[0][3] = 0;
        Matriz9[0][4] = 311;
        Matriz9[0][5] = 0;
        Matriz9[0][6] = 0;
        Matriz9[0][7] = 0;
        Matriz9[0][8] = 0;
        Matriz9[0][9] = 0;
        
        Matriz9[1][0] = 0;
        Matriz9[1][1] = 0;
        Matriz9[1][2] = 0;
        Matriz9[1][3] = 0;
        Matriz9[1][4] = 311;
        Matriz9[1][5] = 0;
        Matriz9[1][6] = 113;
        Matriz9[1][7] = 0;
        Matriz9[1][8] = 0;
        Matriz9[1][9] = 0;
       
        Matriz9[2][0] = 0;
        Matriz9[2][1] = 101;
        Matriz9[2][2] = 101;
        Matriz9[2][3] = 0;
        Matriz9[2][4] = 311;
        Matriz9[2][5] = 0;
        Matriz9[2][6] = 113;
        Matriz9[2][7] = 0;
        Matriz9[2][8] = 0;
        Matriz9[2][9] = 0;
        
        Matriz9[3][0] = 0;
        Matriz9[3][1] = 0;
        Matriz9[3][2] = 0;
        Matriz9[3][3] = 0;
        Matriz9[3][4] = 311;
        Matriz9[3][5] = 0;
        Matriz9[3][6] = 0;
        Matriz9[3][7] = 0;
        Matriz9[3][8] = 0;
        Matriz9[3][9] = 0;
       
        Matriz9[4][0] = 202;
        Matriz9[4][1] = 202;
        Matriz9[4][2] = 202;
        Matriz9[4][3] = 0;
        Matriz9[4][4] = 0;
        Matriz9[4][5] = 0;
        Matriz9[4][6] = 0;
        Matriz9[4][7] = 201;
        Matriz9[4][8] = 201;
        Matriz9[4][9] = 201;
        
        Matriz9[5][0] = 0;
        Matriz9[5][1] = 0;
        Matriz9[5][2] = 0;
        Matriz9[5][3] = 0;
        Matriz9[5][4] = 0;
        Matriz9[5][5] = 114;
        Matriz9[5][6] = 0;
        Matriz9[5][7] = 0;
        Matriz9[5][8] = 0;
        Matriz9[5][9] = 0;
        
        Matriz9[6][0] = 0;
        Matriz9[6][1] = 0;
        Matriz9[6][2] = 0;
        Matriz9[6][3] = 0;
        Matriz9[6][4] = 0;
        Matriz9[6][5] = 114;
        Matriz9[6][6] = 0;
        Matriz9[6][7] = 213;
        Matriz9[6][8] = 0;
        Matriz9[6][9] = 0;
        
        Matriz9[7][0] = 102;
        Matriz9[7][1] = 102;
        Matriz9[7][2] = 0;
        Matriz9[7][3] = 0;
        Matriz9[7][4] = 0;
        Matriz9[7][5] = 0;
        Matriz9[7][6] = 0;
        Matriz9[7][7] = 213;
        Matriz9[7][8] = 0;
        Matriz9[7][9] = 0;
       
        Matriz9[8][0] = 0;
        Matriz9[8][1] = 0;
        Matriz9[8][2] = 0;
        Matriz9[8][3] = 0;
        Matriz9[8][4] = 0;
        Matriz9[8][5] = 0;
        Matriz9[8][6] = 0;
        Matriz9[8][7] = 213;
        Matriz9[8][8] = 0;
        Matriz9[8][9] = 0;
        
        Matriz9[9][0] = 302;
        Matriz9[9][1] = 302;
        Matriz9[9][2] = 302;
        Matriz9[9][3] = 302;
        Matriz9[9][4] = 0;
        Matriz9[9][5] = 0;
        Matriz9[9][6] = 0;
        Matriz9[9][7] = 0;
        Matriz9[9][8] = 0;
        Matriz9[9][9] = 0;
        
        Matriz10[0][0] = 101;
        Matriz10[0][1] = 101;
        Matriz10[0][2] = 0;
        Matriz10[0][3] = 0;
        Matriz10[0][4] = 113;
        Matriz10[0][5] = 0;
        Matriz10[0][6] = 0;
        Matriz10[0][7] = 0;
        Matriz10[0][8] = 0;
        Matriz10[0][9] = 0;
        
        Matriz10[1][0] = 0;
        Matriz10[1][1] = 0;
        Matriz10[1][2] = 0;
        Matriz10[1][3] = 0;
        Matriz10[1][4] = 113;
        Matriz10[1][5] = 0;
        Matriz10[1][6] = 0;
        Matriz10[1][7] = 0;
        Matriz10[1][8] = 114;
        Matriz10[1][9] = 0;
        
        Matriz10[2][0] = 0;
        Matriz10[2][1] = 0;
        Matriz10[2][2] = 0;
        Matriz10[2][3] = 0;
        Matriz10[2][4] = 0;
        Matriz10[2][5] = 0;
        Matriz10[2][6] = 0;
        Matriz10[2][7] = 0;
        Matriz10[2][8] = 114;
        Matriz10[2][9] = 0;
        
        Matriz10[3][0] = 202;
        Matriz10[3][1] = 202;
        Matriz10[3][2] = 202;
        Matriz10[3][3] = 0;
        Matriz10[3][4] = 0;
        Matriz10[3][5] = 0;
        Matriz10[3][6] = 0;
        Matriz10[3][7] = 0;
        Matriz10[3][8] = 0;
        Matriz10[3][9] = 0;
        
        Matriz10[4][0] = 0;
        Matriz10[4][1] = 0;
        Matriz10[4][2] = 0;
        Matriz10[4][3] = 0;
        Matriz10[4][4] = 0;
        Matriz10[4][5] = 0;
        Matriz10[4][6] = 201;
        Matriz10[4][7] = 201;
        Matriz10[4][8] = 201;
        Matriz10[4][9] = 0;
        
        Matriz10[5][0] = 0;
        Matriz10[5][1] = 0;
        Matriz10[5][2] = 0;
        Matriz10[5][3] = 0;
        Matriz10[5][4] = 213;
        Matriz10[5][5] = 0;
        Matriz10[5][6] = 0;
        Matriz10[5][7] = 0;
        Matriz10[5][8] = 0;
        Matriz10[5][9] = 0;
        
        Matriz10[6][0] = 0;
        Matriz10[6][1] = 102;
        Matriz10[6][2] = 102;
        Matriz10[6][3] = 0;
        Matriz10[6][4] = 213;
        Matriz10[6][5] = 0;
        Matriz10[6][6] = 0;
        Matriz10[6][7] = 0;
        Matriz10[6][8] = 0;
        Matriz10[6][9] = 311;
        
        Matriz10[7][0] = 0;
        Matriz10[7][1] = 0;
        Matriz10[7][2] = 0;
        Matriz10[7][3] = 0;
        Matriz10[7][4] = 213;
        Matriz10[7][5] = 0;
        Matriz10[7][6] = 0;
        Matriz10[7][7] = 0;
        Matriz10[7][8] = 0;
        Matriz10[7][9] = 311;
        
        Matriz10[8][0] = 0;
        Matriz10[8][1] = 0;
        Matriz10[8][2] = 0;
        Matriz10[8][3] = 0;
        Matriz10[8][4] = 0;
        Matriz10[8][5] = 0;
        Matriz10[8][6] = 0;
        Matriz10[8][7] = 0;
        Matriz10[8][8] = 0;
        Matriz10[8][9] = 311;
        
        Matriz10[9][0] = 302;
        Matriz10[9][1] = 302;
        Matriz10[9][2] = 302;
        Matriz10[9][3] = 302;
        Matriz10[9][4] = 0;
        Matriz10[9][5] = 0;
        Matriz10[9][6] = 0;
        Matriz10[9][7] = 0;
        Matriz10[9][8] = 0;
        Matriz10[9][9] = 311;
    }
    }
    

