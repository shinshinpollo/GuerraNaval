
package guerranaval;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ConfiguracionInicial extends javax.swing.JDialog{
    
    JButton JB1Jugador = new JButton();
    JButton JB2Jugadores = new JButton();
    
    public ConfiguracionInicial(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        constructor();
    }

    private void constructor() {
        this.setTitle("Configuracion inicial");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        this.add(JB1Jugador);
        this.add(JB2Jugadores);
        
        JB1Jugador.setText("1 Jugador");
        JB2Jugadores.setText("2 Jugadores");
        
        JB1Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB1JugadorActionPerformed(evt);
            }
        });
        
        JB2Jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB2JugadoresActionPerformed(evt);
            }
        });
        
        JB1Jugador.reshape(50, 50, 200, 25);
        JB2Jugadores.reshape(50, 100, 200, 25);
    }
    
    private void JB1JugadorActionPerformed(java.awt.event.ActionEvent evt) {
        ClsGlobal.MultiJugador = false;
        CalcularMatriz();
        this.dispose();
    }
    
    private void JB2JugadoresActionPerformed(java.awt.event.ActionEvent evt) {
        ClsGlobal.MultiJugador = true;
        this.dispose();
    }

    private void CalcularMatriz() {
    
        
    }
}
