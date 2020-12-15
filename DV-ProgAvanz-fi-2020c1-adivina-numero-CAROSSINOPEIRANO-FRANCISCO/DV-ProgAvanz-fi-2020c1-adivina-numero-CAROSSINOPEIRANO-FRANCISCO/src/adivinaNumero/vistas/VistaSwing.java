package adivinaNumero.vistas;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class VistaSwing extends javax.swing.JFrame implements IVista {

    public VistaSwing() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @Override
    public void addHandlerAdivinar(ActionListener al) {
        this.jButtonAdivinar.addActionListener(al);
    }

    @Override
    public void addHandlerReiniciar(ActionListener al) {
        this.jButtonReiniciar.addActionListener(al);
    }

    @Override
    public void addHandlerMostrarInfo(ActionListener al) {
        this.jButtonInfo.addActionListener(al);
    }

    @Override
    public void activarBotonAdivinar(boolean flag) {
        this.jButtonAdivinar.setEnabled(flag);
    }

    @Override
    public void iniciar() {
        setVisible(true);
        activarBotonAdivinar(true);
    }

    @Override
    public void reiniciar() {
        mostrarMensajeInfo("Se reinicio el juego");
        jTextFieldNumero.setText("");
        jLabelInfo.setText("Ingrese un número.");
        activarBotonAdivinar(true);
        jTextFieldNumero.setEnabled(true);
    }

    @Override
    public void adivinar(String mensajeInfo) {
        jLabelInfo.setText(mensajeInfo);
    }

    @Override
    public void noSePuedeSeguir(int numero, String mensajeInfo) {
        jLabelInfo.setText("No puede seguir adivinando. Mi numero era el: ");
        jTextFieldNumero.setText(""+numero);
        jTextFieldNumero.setEnabled(false);
        activarBotonAdivinar(false);
    }

    @Override
    public void mostrarTurnos(int numeroTurnos) {
        jLabelTurnos.setText("Turnos: " + Integer.toString(numeroTurnos));
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, null, JOptionPane.PLAIN_MESSAGE);
    }

    @Override
    public void mostrarMensajeInfo(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public String getTextUsuario() {
        return jTextFieldNumero.getText();
    }

    @Override
    public void cambiarColorInfo(Color co) {
        jLabelInfo.setForeground(co);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jButtonInfo = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButtonAdivinar = new javax.swing.JButton();
        jLabelTurnos = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adivina número");
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Adivina Número");

        jButtonInfo.setText("Info");

        jButtonReiniciar.setText("Reiniciar");

        jLabelBienvenido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenido.setText("¡Bienvenido!");

        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonAdivinar.setText("Adivinar");
        jButtonAdivinar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelTurnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurnos.setText("Turnos: 0");

        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfo.setText("Ingrese un número.");
        jLabelInfo.setToolTipText("");
        jLabelInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabelTurnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdivinar))
                .addGap(162, 162, 162))
            .addComponent(jLabelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelBienvenido)
                .addGap(77, 77, 77)
                .addComponent(jLabelTurnos)
                .addGap(18, 18, 18)
                .addComponent(jLabelInfo)
                .addGap(26, 26, 26)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAdivinar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReiniciar)
                    .addComponent(jButtonInfo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdivinar;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTurnos;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

}
