package javaapplication1;

import java.util.Vector;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

    public class Crudframe extends JFrame{
    JTextField nombre = new JTextField(" ");
    JTextField apellidoPa = new JTextField(" ");
    JTextField apellidoMa = new JTextField(" ");
    JTextField sexo = new JTextField(" ");
    JTextField Numero_Cel= new JTextField(" ");
    JTextField Direccion = new JTextField(" ");
    JTextField Relacion = new JTextField(" ");
    JTextField edad = new JTextField(" ");
    JButton goButton = new JButton("largo");
    JButton addButton = new JButton("Add");
    JButton delButton = new JButton("Remove");
    JTable jTable;
    JScrollPane jSP;
    metodosSistemas  ag_person = new metodosSistemas();

    public Crudframe() {
        setSize(1000, 1000);
        setTitle("Examen ");
        setLocationRelativeTo(null);

        de();
        tabla();
    }

   void tabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable.getModel();
        List<datospersona> lis = ag_person.list();
        while (modelo.getRowCount() > 0)
            modelo.removeRow(0);
        for (datospersona d : lis) {
            modelo.addRow(new Object[] { d.getId(), d.getNombres(), d.getAp_paterno(),d.getAp_materno(), d.getSexo(), d.getDirecion(), d.getRelacion(), d.getEdad() });
        }
    }

    void de() {

        jTable = new JTable();
        jTable.setModel(new DefaultTableModel(new Object[][] {
                
        }, new String[] { "ID", "Name", "A_paterno", "A_materno", "Sexo", "Dirección", "Relación_senti", "Edad" }));
        jSP = new JScrollPane();
        jSP.setViewportView(jTable);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Nombre:"));
        add(nombre);
        add(new JLabel("Apellido P :"));
        add(apellidoPa);
        add(new JLabel("Apellido M :"));
        add(apellidoMa);
        add(new JLabel("Sexo:"));
        add(sexo);
        add(new JLabel("Direccion"));
        add(Direccion);
        add(new JLabel("Relación_senti"));
        add(Relacion);
        add(new JLabel("Edad"));
        add(edad);
        add(addButton);
        add(delButton);
        add(jSP);
        add(goButton);

       
        final JFrame outer = this;
        goButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(" goButton has press ");
                outer.setVisible(false);// salida 
            }
        });
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPerson(e);//agrega
            }
        });
        delButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                delPerson(e);//elimina
            }
        });

    }

    void addPerson(ActionEvent e) {
        System.out.println(" addButton has press ");
        datospersona d = new datospersona();
        d.setNombres(nombre.getText());
        d.setAp_paterno(apellidoPa.getText());
        d.setAp_materno(apellidoMa.getText());
        d.setSexo(apellidoMa.getText());
        d.setSexo(sexo.getText());
        d.setDirecion(Direccion.getText());
        d.setRelacion(Relacion.getText());
        d.setEdad(edad.getText());
        ag_person.registrarPersona(d);
        tabla();
    }

    void delPerson(ActionEvent e) {
        if (jTable.getSelectedRow() != -1) {
            System.out.println(" delButton has press ");
            int[] row = jTable.getSelectedRows();
            String ids = jTable.getValueAt(row[0], 0).toString();
            System.out.println("selected: " + ids);
            int id = Integer.parseInt(ids);
            try {
                ag_person.delete(id);
            } catch (Exception ex) {
                Logger.getLogger(Crudframe.class.getName()).log(Level.SEVERE, null, ex);
            }
           tabla();
        }
    }
    }
