
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        initComponents2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_Titulo = new javax.swing.JLabel();
        btt_boton1 = new javax.swing.JButton();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel1.setLayout(null);

        lbl_Titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(255, 102, 0));
        lbl_Titulo.setText("Login");
        jPanel1.add(lbl_Titulo);
        lbl_Titulo.setBounds(190, 100, 110, 60);

        btt_boton1.setBackground(new java.awt.Color(0, 0, 153));
        btt_boton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_boton1.setForeground(new java.awt.Color(255, 255, 255));
        btt_boton1.setText("Ingresar");
        btt_boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_boton1ActionPerformed(evt);
            }
        });
        jPanel1.add(btt_boton1);
        btt_boton1.setBounds(190, 400, 110, 60);

        lbl_Usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Usuario.setText("Usuario:");
        jPanel1.add(lbl_Usuario);
        lbl_Usuario.setBounds(130, 250, 70, 30);

        lbl_Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_Password.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Password.setText("Contrase??a:");
        jPanel1.add(lbl_Password);
        lbl_Password.setBounds(100, 300, 110, 30);

        txt_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_Usuario);
        txt_Usuario.setBounds(250, 250, 130, 30);

        txt_Password.setBackground(new java.awt.Color(255, 255, 255));
        txt_Password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_Password);
        txt_Password.setBounds(250, 300, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_boton1ActionPerformed
        // TODO add your handling code here:
        String Usuario = txt_Usuario.getText();
        char Pass[] = txt_Password.getPassword();
        String Password = new String(Pass);
        if (Usuario.equals("Francisco") && Password.equals("201807183")) {
            this.setVisible(false);
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setVisible(true);
        } else if(Usuario.equals("") || Password.equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario y/o contrase??a incorrectos");
        }
    }//GEN-LAST:event_btt_boton1ActionPerformed
    
    private void initComponents2(){
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_boton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
