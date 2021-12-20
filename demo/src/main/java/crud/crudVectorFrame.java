package crud;

import java.util.Vector;
import java.awt.Dimension;

import java.awt.event.*;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

    public class crudVectorFrame extends JFrame{
        metodosSistema metodos=new metodosSistema();
        JLabel Ib_nombre=new JLabel("nombre");
        JTextField txt_nombre=new JTextField();
        
        JLabel Ib_ap_materno=new JLabel("ap_materno");
        JTextField txt_ap_materno=new JTextField();

        JLabel Ib_ap_paterno=new JLabel("ap_paterno");
        JTextField txt_ap_paterno=new JTextField();

        public crudVectorFrame(){
            JMenuBar menuBar=new JMenuBar();//menu principal_1
            JMenu menuFile=new JMenu();//1
            JMenu menuMantenimiento= new JMenu();// varios menus_2
            JMenu menuReportes= new JMenu();// varios menus_3

            JMenuItem menuFile_Exit=new JMenuItem();//1

            JMenuItem menuMantenimiento_Ingresar= new JMenuItem();//2
            JMenuItem menuMantenimiento_Eliminar= new JMenuItem();//2

            JMenuItem menuReportes_General= new JMenuItem();//3
            JMenuItem menuReportes_Detallado= new JMenuItem();//3
            menuFile.setText("file");
            menuFile_Exit.setText("salir");
            
            menuMantenimiento.setText("Crud");
            menuMantenimiento_Ingresar.setText("Registra");
            menuMantenimiento_Eliminar.setText("Eliminar");

            menuReportes.setText("Reportes");
            menuReportes_General.setText("General");
            menuReportes_Detallado.setText("Detalla");

            menuFile.add(menuFile_Exit);
            menuMantenimiento.add(menuMantenimiento_Ingresar);
            menuMantenimiento.add(menuMantenimiento_Eliminar);
          

            menuReportes.add(menuReportes_General);
            menuReportes.add(menuReportes_Detallado);

            menuBar.add(menuFile);
            menuBar.add(menuMantenimiento);
            menuBar.add(menuReportes);
            setTitle("Practicando Crud con vectores ");
            setJMenuBar(menuBar);
            setSize(new Dimension(700,700));

            menuFile_Exit.addActionListener;
            (   new ActionListener(){
                public void actionPerformed(Action e){
                    crudVectorFrame.this.windowClosed();
                    System.exit(0);//que es lo que se quiere hacer
                }
            }

            );
            menuMantenimiento_Ingresar.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        JPanel panel= new JPanel(new GridLayout(1,2));
                        panel.add(Ib_nombre);
                        panel.add(txt_nombre);
                        JPanel pane2= new JPanel(new GridLayout(1,2));
                        panel.add(Ib_ap_paterno);
                        panel.add(txt_ap_paterno);
                        JPanel pane3= new JPanel(new GridLayout(1,2));
                        panel.add(Ib_ap_materno);
                        panel.add(txt_ap_materno);

                        Object msg []={pane1, pane2, pane3};

                        if(JOptionPane.showOptionDialog(null, msg, "Registrar", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,null,null,null)==JOptionPane.OK_OPTION){

                            datospersona dp=new datospersona();
                            dp.nombres= txt_nombre.getText();
                            dp.ap_paterno= txt_ap_paterno.getText();
                            dp.ap_materno= txt_ap_materno.getText();
                            metodos.registrarPersona(dp);

                            JOptionPane.showMessageDialog(null, "se registro con existo", "Registro", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            );
            menuReportes_General.addActionListener(
                new  ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String columnas[]={"nombre","paterno"."materno"}
                        Object filas[][]= new Object[metodo.lista.size()][3];

                        Vector nuevoVector=metodos.lista;
                        for(int i=0; i<nuevoVector.size(),i++){
                            datospersona v=(platosPersonal)metodos.lista.get(i);
                            filas[i][0]=v.nombres;
                            filas[i][1]=v.nombres;
                            filas[i][2]=v.nombres; //reporte y registrar en arrayslist

                            JTable tabla= new JTable(filas, columnas);
                            JScrollPane tablal= new JScrollPane(tabla);

                            JPanel reporte=new JPanel();
                            reporte.add(tabla);

                            Object msg []=(reporte);
                            JOptionPane.showMessageDialog(null, "reporte", JOptionPane, QUESTION_MESSAGE);
                        }
                    }
                }
            );

        }
    }

