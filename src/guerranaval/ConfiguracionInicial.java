
package guerranaval;

public class ConfiguracionInicial extends javax.swing.JDialog{
    
    
    public ConfiguracionInicial(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        constructor();
    }

    private void constructor() {
        this.setTitle("Configuracion inicial");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
    }
}
