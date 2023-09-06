
package Frames;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class NuevoPc extends javax.swing.JPanel {

    
    public NuevoPc() {
        initComponents();
        
        
        
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtap = new javax.swing.JTextField();
        txtam = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbsexo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        txtdistrito = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtapc = new javax.swing.JTextField();
        txtamc = new javax.swing.JTextField();
        txtnombresc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasintomas = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taalergias = new javax.swing.JTextArea();
        txttelf = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txttc = new javax.swing.JTextField();
        txtrp = new javax.swing.JTextField();

        setBackground(new java.awt.Color(241, 241, 241));
        setForeground(new java.awt.Color(0, 0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 50, 124));
        jLabel1.setText("Información del paciente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombres");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido Paterno ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido Materno");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));
        add(txtap, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 110, -1));
        add(txtam, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 120, -1));
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("N° D.N.I");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));
        add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Edad");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sexo");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        cbsexo.setToolTipText("");
        add(cbsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Teléfono");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));
        add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 160, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha de Nacimiento");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ciudad");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Distrito");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Dirección");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));
        add(txtciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, -1));
        add(txtdistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 170, -1));
        add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 230, -1));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Alergias");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Sintomas");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));

        btnguardar.setBackground(new java.awt.Color(19, 50, 124));
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnguardarMouseClicked(evt);
            }
        });
        btnguardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("GUARDAR");
        btnguardar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 9, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnguardar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 130, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(11, 28, 68));
        jLabel17.setText("Información de contacto de emergencia:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombres");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Apellido Paterno ");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Apellido Materno");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));
        add(txtapc, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 110, -1));
        add(txtamc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 120, -1));
        add(txtnombresc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 210, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Teléfono");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Relación con el paciente");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        tasintomas.setColumns(20);
        tasintomas.setRows(5);
        jScrollPane1.setViewportView(tasintomas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 360, 70));

        taalergias.setColumns(20);
        taalergias.setRows(5);
        jScrollPane2.setViewportView(taalergias);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 70));
        add(txttelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 100, -1));
        add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 180, -1));
        add(txttc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 130, -1));
        add(txtrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void btnguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnguardarMouseClicked
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/disquete.png")); // Ruta de la imagen del icono
        JOptionPane.showMessageDialog(this, "DATOS GUARDADOS", "Paciente", JOptionPane.INFORMATION_MESSAGE, icon);
        
        
         dcFecha.setDate(null);
         cbsexo.setSelectedIndex(0);
         txtnombre.setText("");
         txtap.setText("");
         txtam.setText("");
         txtedad.setText("");
         txttelf.setText("");
         txtCorreo.setText("");
         txtdni.setText("");
         txtciudad.setText("");
         txtdistrito.setText("");
         txtdireccion.setText("");
         taalergias.setText("");
         tasintomas.setText("");
         txtnombresc.setText("");
         txtapc.setText("");
         txtamc.setText("");
         txttc.setText("");
         txtrp.setText("");
         
         txtnombre.requestFocus();
    }//GEN-LAST:event_btnguardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnguardar;
    private javax.swing.JComboBox<String> cbsexo;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taalergias;
    private javax.swing.JTextArea tasintomas;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtam;
    private javax.swing.JTextField txtamc;
    private javax.swing.JTextField txtap;
    private javax.swing.JTextField txtapc;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdistrito;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombresc;
    private javax.swing.JTextField txtrp;
    private javax.swing.JTextField txttc;
    private javax.swing.JTextField txttelf;
    // End of variables declaration//GEN-END:variables
}


