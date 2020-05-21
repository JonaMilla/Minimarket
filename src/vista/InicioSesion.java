package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Vendedor;
import modelo.VendedorDAO;


public class InicioSesion extends javax.swing.JFrame {
    VendedorDAO vdao =  new VendedorDAO();
    Vendedor ven = new Vendedor();
    public InicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
        lblFondo();
        setTitle("Acceso al Sistema");
        txtNombreUsuario.setText("emp1");
        passContraseña.setText("17592709-5");
        
    }
    
    public void lblFondo() {

        ImageIcon lblImagenFondo;
        lblImagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondo.png"));
        Icon lblIconoFondo = new ImageIcon(lblImagenFondo.getImage().getScaledInstance(
                  lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
                  lblFondo.setIcon(lblIconoFondo);
    }
    
    public void validarInicioSesion(){
        String rut = passContraseña.getText();
        String user = txtNombreUsuario.getText();
        if (txtNombreUsuario.getText().equals("") || passContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Los datos no pueden estar vacios");
            txtNombreUsuario.requestFocus();
        }else{
            ven = vdao.ValidarInicioSesion(rut, user);
                if (ven.getUser() != null  && ven.getRut() != null) {
                    MenuPrincipal mp = new MenuPrincipal();
                    mp.setVisible(true);
                    dispose();      
            }else{
                    JOptionPane.showMessageDialog(this, "Debe ingresar datos válidos");
                    txtNombreUsuario.requestFocus();
                }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passContraseña = new javax.swing.JPasswordField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 597));
        getContentPane().setLayout(null);

        btnAceptar.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btnAceptar.setText("Ingresar");
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(60, 430, 130, 60);

        btnSalir.setBackground(new java.awt.Color(153, 255, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete - copia.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(260, 430, 120, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_usuario.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 70, 170, 160);

        lblContraseña.setBackground(new java.awt.Color(255, 255, 255));
        lblContraseña.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(20, 310, 80, 19);

        lblNombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("Nombre de Usuario");
        getContentPane().add(lblNombreUsuario);
        lblNombreUsuario.setBounds(20, 240, 140, 19);
        getContentPane().add(txtNombreUsuario);
        txtNombreUsuario.setBounds(200, 240, 210, 24);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Minimarket");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 190, 50);
        getContentPane().add(passContraseña);
        passContraseña.setBounds(200, 310, 210, 22);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        lblFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 470, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        validarInicioSesion();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
        
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JPasswordField passContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
