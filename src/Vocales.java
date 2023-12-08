
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author guami
 */
public class Vocales extends javax.swing.JFrame {

    /**
     * Creates new form Vocales
     */
    public Vocales() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTexto = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOracion = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTexto.setText("Ingrese una palabra u oración:");

        btnValidar.setText("VALIDAR");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        txaOracion.setColumns(20);
        txaOracion.setRows(5);
        jScrollPane1.setViewportView(txaOracion);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 51, 51));
        lblTitulo.setText("VOCALES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 183, Short.MAX_VALUE)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        // TODO add your handling code here:
        String oracion= txaOracion.getText();
        this.comprobar(oracion);
        this.reemplazarVocales(oracion);
        this.invertirCadena(oracion);
    }//GEN-LAST:event_btnValidarActionPerformed

    public void comprobar(String oracion){
        String[] palabras = oracion.split("\\s+");
        int numeroPalabras = palabras.length;
        int vocal_a=0;
        int vocal_e=0;
        int vocal_i=0;
        int vocal_o=0;
        int vocal_u=0;
        for(int i=0; i<oracion.length(); i++){
            if(Character.toString(oracion.charAt(i)).equalsIgnoreCase("a")){
                vocal_a++;
            }else if(Character.toString(oracion.charAt(i)).equalsIgnoreCase("e")){
                vocal_e ++;
            }else if(Character.toString(oracion.charAt(i)).equalsIgnoreCase("i")){
                vocal_i++;
            }else if(Character.toString(oracion.charAt(i)).equalsIgnoreCase("o")){
                vocal_o++;
            }else if(Character.toString(oracion.charAt(i)).equalsIgnoreCase("u")){
                vocal_u++;
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Numero de palabras: "+numeroPalabras+"\n"+
                "Numero de vocales a: "+vocal_a+"\n"+
                "Numero de vocales e: "+vocal_e+"\n"+
                "Numero de vocales i: "+vocal_i+"\n"+
                "Numero de vocales o: "+vocal_o+"\n"+
                "Numero de vocales u: "+vocal_u);
    }
    
    public void reemplazarVocales(String oracion) {
    oracion = oracion.replace("a", "@");
    oracion = oracion.replace("o", "$");
    JOptionPane.showMessageDialog(rootPane, oracion);
}
    
    
    public void invertirCadena(String oracion) {
    char[] caracteresOriginales = oracion.toCharArray();
    char[] caracteresInvertidos = new char[caracteresOriginales.length];
    for (int i = 0; i < caracteresOriginales.length; i++) {
        caracteresInvertidos[i] = caracteresOriginales[caracteresOriginales.length - 1 - i];
    }
    String cadenaInvertida = new String(caracteresInvertidos);
    JOptionPane.showMessageDialog(rootPane, cadenaInvertida);
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
            java.util.logging.Logger.getLogger(Vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vocales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValidar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaOracion;
    // End of variables declaration//GEN-END:variables
}
