 package vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import modelo.Vendedor;

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
        btnSalir = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemVendedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(685, 612));
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

        btnSalir.setBackground(new java.awt.Color(102, 51, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(80, 490, 520, 32);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 680, 590);

        jMenu2.setText("Administración");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCliente);

        jMenuItemVendedor.setText("Vendedor");
        jMenuItemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemVendedor);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        ClienteP cli = new ClienteP();
        cli.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedorActionPerformed
        VendedorP ven = new VendedorP();
        ven.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendedorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemVendedor;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
