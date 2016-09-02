/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import Clases.Conexion;
import clases.LgnAlumnos;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anuar
 */
public class Alumnos extends javax.swing.JInternalFrame {
    Connection con;
    /**
     * Creates new form Alumnos
     */
    public Alumnos() {
        initComponents();
        con=new Conexion().Conectar();
        LgnAlumnos obj= new LgnAlumnos(con, JtxMatri, JtxNombre, JtxApellido, JtxApellido3, jcomboCarrera,jDateChooser1);
        jcomboCarrera=obj.LlenaCarreras(jcomboCarrera);
        guardarAlumnos.addActionListener(obj);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JtxMatri = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtxNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JtxApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcomboCarrera = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        guardarAlumnos = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        JtxApellido3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ima/libros.jpg"))); // NOI18N

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Matricula");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        jLabel3.setText("ALUMNOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        JtxMatri.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.add(JtxMatri, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 120, -1));

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        JtxNombre.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.add(JtxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 120, -1));

        jLabel5.setText("Apellido Materno");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, 20));

        JtxApellido.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.add(JtxApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 120, -1));

        jLabel6.setText("Carrera");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jcomboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ing. Sistemas", "Ing Bioquimica", "Ing. Aeronautica", "Ing. Quimica" }));
        jPanel1.add(jcomboCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 110, -1));

        jLabel7.setText("Fecha de nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 10));

        guardarAlumnos.setText("GUARDAR");
        guardarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(guardarAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 150, -1));

        JtxApellido3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.add(JtxApellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 120, -1));

        jLabel8.setText("Apellido");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAlumnosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_guardarAlumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JtxApellido;
    private javax.swing.JTextField JtxApellido3;
    private javax.swing.JTextField JtxMatri;
    private javax.swing.JTextField JtxNombre;
    private javax.swing.JButton guardarAlumnos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcomboCarrera;
    // End of variables declaration//GEN-END:variables
}
