 package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {
    
    public MenuPrincipal() {
        initComponents();
        lblFondo();
        setTitle("Menú Principal");
        setLocationRelativeTo(null);
    }
    
    public void lblFondo() {

        ImageIcon lblImagenFondo;
        lblImagenFondo = new ImageIcon(getClass().getResource("/imagenes/fondo.png"));
        Icon lblIconoFondo = new ImageIcon(lblImagenFondo.getImage().getScaledInstance(
                  lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH));
                  lblFondo.setIcon(lblIconoFondo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(685, 565));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_producto.png"))); // NOI18N
        jButton1.setText("Menú de Productos");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jButton1);
        jButton1.setBounds(72, 348, 210, 113);

        jButton2.setBackground(new java.awt.Color(102, 51, 255));
        jButton2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_stock.png"))); // NOI18N
        jButton2.setText("Historial de compras");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 130, 210, 135);

        jButton3.setBackground(new java.awt.Color(102, 51, 255));
        jButton3.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_admin.png"))); // NOI18N
        jButton3.setText("Ingresar Producto");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 340, 190, 130);

        jButton4.setBackground(new java.awt.Color(102, 51, 255));
        jButton4.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu_caja.png"))); // NOI18N
        jButton4.setText("Caja");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 130, 210, 130);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Minimarket \"Loyola\"");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 320, 50);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 690, 540);

        jMenu1.setText("Opciones");

        jMenu3.setText("Ayuda");
        jMenu1.add(jMenu3);

        jMenu4.setText("Salir");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mantenimiento");

        jMenuItem1.setText("Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Vendedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ClienteP cli = new ClienteP();
        cli.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ProductoP ven = new ProductoP();
        ven.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
