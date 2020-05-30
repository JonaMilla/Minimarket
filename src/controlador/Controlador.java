package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import vista.ClienteP;

public class Controlador implements ActionListener{
    
    ClienteDAO dao = new ClienteDAO();
    Cliente c = new Cliente();
    ClienteP cliP = new ClienteP();
    DefaultTableModel modelo = new DefaultTableModel();
        
    public Controlador (ClienteP cp){
        this.cliP = cp;
        this.cliP.btnListar.addActionListener(this);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==cliP.btnListar) {
            listar(cliP.jtablaCliente);
        }
    }
    
    public void listar(JTable tabla){
        modelo = (DefaultTableModel) tabla.getModel();
        List<Cliente> lista = dao.listar();        
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getNombre();
            ob[2] = lista.get(i).getRut();
            ob[3] = lista.get(i).getApellidoP();
            ob[4] = lista.get(i).getApellidoM();
            ob[5] = lista.get(i).getDireccion();
            ob[6] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        cliP.jtablaCliente.setModel(modelo);
    }
}
