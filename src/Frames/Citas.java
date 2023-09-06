
package Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Citas extends javax.swing.JPanel {

    private DefaultTableModel model;
    
    public Citas() {
        initComponents();
        model = new DefaultTableModel();
        model.addColumn("DNI");
        model.addColumn("Especialidad");
        model.addColumn("Doctor");
        model.addColumn("Horario");
        jtcita.setModel(model);
        
        jtcita.getColumnModel().getColumn(0).setPreferredWidth(50);
        jtcita.getColumnModel().getColumn(1).setPreferredWidth(120);
        jtcita.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtcita.getColumnModel().getColumn(3).setPreferredWidth(160);
    
        // Cambiar el color del encabezado
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(19, 50, 124));
        headerRenderer.setForeground(Color.white);
        headerRenderer.setFont(new Font("Segoe UI", Font.BOLD, 14));
        for (int i = 0; i < jtcita.getModel().getColumnCount(); i++) {
            jtcita.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        cbxespecialidad = new javax.swing.JComboBox<>();
        cbxdoctor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxhorario = new javax.swing.JComboBox<>();
        btncitas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtcita = new javax.swing.JTable();

        setBackground(new java.awt.Color(241, 241, 241));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(19, 50, 124));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 50, 124));
        jLabel1.setText("GENERAR CITA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI del Paciente:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Especialidad:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Doctor");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        txtdni.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        cbxespecialidad.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxespecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Medicina Interna", "Pediatría", "Ginecología y Obstetricia", "Cardiología", "Neumología", "Gastroenterología" }));
        cbxespecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxespecialidadItemStateChanged(evt);
            }
        });
        add(cbxespecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, -1));

        cbxdoctor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxdoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        cbxdoctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxdoctorItemStateChanged(evt);
            }
        });
        add(cbxdoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Horario");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        cbxhorario.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbxhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        add(cbxhorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 220, -1));

        btncitas.setBackground(new java.awt.Color(19, 50, 124));
        btncitas.setBackground(new java.awt.Color(19, 50, 124));
        btncitas.setForeground(new java.awt.Color(19, 50, 124));
        btncitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncitasMouseClicked(evt);
            }
        });
        btncitas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GENERAR");
        btncitas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CITAS");
        btncitas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 19, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario_1.png"))); // NOI18N
        btncitas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, -1, -1));

        add(btncitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 150, 40));

        jtcita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtcita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtcita);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 730, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void cbxespecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxespecialidadItemStateChanged
       
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(this.cbxespecialidad.getSelectedIndex()>0){
                
                this.cbxdoctor.setModel(new DefaultComboBoxModel(this.getDoctores(this.cbxespecialidad.getSelectedItem().toString())));  
            }
        }
        
            
    }//GEN-LAST:event_cbxespecialidadItemStateChanged

    private void cbxdoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxdoctorItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(this.cbxdoctor.getSelectedIndex()>0){
                
                this.cbxhorario.setModel(new DefaultComboBoxModel(this.getHorarios(this.cbxdoctor.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cbxdoctorItemStateChanged

    private void btncitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncitasMouseClicked
       String dni = txtdni.getText();
        String especialidad = (String) cbxespecialidad.getSelectedItem();
        String doctor = (String) cbxdoctor.getSelectedItem();
        String horario = (String) cbxhorario.getSelectedItem();

        // Verificar que el modelo de tabla no sea nulo
        if (model != null) {
            // Agregar los valores al modelo de tabla
            model.addRow(new Object[]{dni, especialidad, doctor, horario});

            // Limpiar los campos después de guardar
            txtdni.setText("");
            cbxespecialidad.setSelectedIndex(0);
            cbxdoctor.setSelectedIndex(0);
            cbxhorario.setSelectedIndex(0);
        }
        JOptionPane.showMessageDialog(this, "SE HA GENERADO LA CITA CORRECTAMENTE.", "Generar citas", JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_btncitasMouseClicked

    public String[] getDoctores(String especialidad){
        
        String[] doctor = new String[3];
        if(especialidad.equalsIgnoreCase("Medicina Interna")){
            
            doctor[0] = "Seleccione";
            doctor[1] = "Dr. Carlos García";
            doctor[2] = "Dra. Ana Torres";
           
        }
        
        if(especialidad.equalsIgnoreCase("Pediatría")){
            
            doctor[0] = "Seleccione";
            doctor[1] = "Dr. Alejandro Martínez";
            doctor[2] = "Dra. Laura Rodríguez";
            
        }
        
        if(especialidad.equalsIgnoreCase("Ginecología y Obstetricia")){
            
            doctor[0] = "Seleccione";
            doctor[1] = "Dr. Andrés Vargas";
            doctor[2] = "Dra. Gabriela López";
            
        }
        
        if(especialidad.equalsIgnoreCase("Cardiología")){
            
            doctor[0] = "Seleccione";
            doctor[1] = "Dr. David Herrera";
            doctor[2] = "Dra. Isabel Gómez";
            
        }
        
        if(especialidad.equalsIgnoreCase("Neumología")){
            
            doctor[0] = "Seleccione";
            doctor[1] = "Dr. Sergio Morales";
            doctor[2] = "Dra. Victoria Ramírez";
            
        }
        
        if(especialidad.equalsIgnoreCase("Gastroenterología")){
            
            doctor[0] = "Seleccione";
            doctor[1] = "Dr. Javier Morales";
            doctor[2] = "Dra. Carolina Silva";
            
        }
        return doctor;
    }
    
    public String[] getHorarios(String doctor){
        
        String[] horario = new String[3];
        if(doctor.equalsIgnoreCase("Dr. Carlos García")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Lunes - Mircoles)";
            horario[2] = "T: 14:00 - 17:00 (Jueves - Viernes)";
           
        }
        
        if(doctor.equalsIgnoreCase("Dra. Ana Torres")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Jueves - Sabado)";
            horario[2] = "T: 14:00 - 17:00 (Lunes - Miercoles)";
           
        }
        
        if(doctor.equalsIgnoreCase("Dr. Alejandro Martínez")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Lunes - Martes)";
            horario[2] = "T: 14:00 - 17:00 (Miercoles)";
           
        }
        if(doctor.equalsIgnoreCase("Dra. Laura Rodríguez")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Miercoles)";
            horario[2] = "T: 14:00 - 17:00 (Jueves - Sábado)";
           
        }
        
        if(doctor.equalsIgnoreCase("Dr. Andrés Vargas")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 10:00 - 13:00 (Lunes - Miercoles)";
            horario[2] = "T: 15:00 - 17:30 (Viernes)";
           
        }
        if(doctor.equalsIgnoreCase("Dra. Gabriela López")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Jueves - Sábado)";
            horario[2] = "T: 14:00 - 17:00 (Lunes - Miércoles)";
        
        }
        
        if(doctor.equalsIgnoreCase("Dr. David Herrera")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Lunes - Miercoles)";
            horario[2] = "T: 14:00 - 17:30 (Jueves - Sabado)";
           
        }
        if(doctor.equalsIgnoreCase("Dra. Isabel Gómez")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Jueves - Sábado)";
            horario[2] = "T: 14:00 - 17:00 (Lunes - Miércoles)";
        
        }
        
        if(doctor.equalsIgnoreCase("Dr. Sergio Morales")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Lunes - Martes)";
            horario[2] = "T: 14:00 - 17:30 (Jueves - Viernes)";
           
        }
        if(doctor.equalsIgnoreCase("Dra. Victoria Ramírez")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Miercoles - Sábado)";
            horario[2] = "T: 14:00 - 17:00 (Lunes - Sábado)";
        
        }
        
        if(doctor.equalsIgnoreCase("Dr. Javier Morales")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Jueves - Sábado)";
            horario[2] = "T: 14:00 - 17:00 (Lunes - Miércoles)";
           
        }
        if(doctor.equalsIgnoreCase("Dra. Carolina Silva")){
            
            horario[0] = "Seleccione";
            horario[1] = "M: 8:00 - 12:00 (Lunes - Martes)";
            horario[2] = "T: 14:00 - 17:30 (Jueves - Viernes)";
        
        }
            
        
        return horario;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btncitas;
    private javax.swing.JComboBox<String> cbxdoctor;
    private javax.swing.JComboBox<String> cbxespecialidad;
    private javax.swing.JComboBox<String> cbxhorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtcita;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables


}
