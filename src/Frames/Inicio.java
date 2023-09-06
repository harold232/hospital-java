
package Frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"01","02","03","04","05","06","07","08","09"
            ,"10","11","12"};
        lblfecha.setText(dia+" / "+meses[month - 1]+" / "+year);
        
        
        Principal p1 = new Principal();
        p1.setSize(790, 530);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Menú = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btninicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btndoctores = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnpacientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JPanel();
        lblexit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsalir1 = new javax.swing.JPanel();
        lblexit1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btncita = new javax.swing.JPanel();
        lblexit2 = new javax.swing.JLabel();
        cita = new javax.swing.JLabel();
        btnsalir3 = new javax.swing.JPanel();
        lblexit3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(11, 28, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menú.setBackground(new java.awt.Color(11, 28, 68));
        Menú.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu (1).png"))); // NOI18N
        Menú.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 34, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ");
        Menú.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        Menú.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 10));

        jPanel1.add(Menú, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 60));

        btninicio.setBackground(new java.awt.Color(19, 50, 124));
        btninicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 28, 68)));
        btninicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninicioMouseClicked(evt);
            }
        });
        btninicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/casa.png"))); // NOI18N
        btninicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Inicio");
        btninicio.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(btninicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 40));

        btndoctores.setBackground(new java.awt.Color(19, 50, 124));
        btndoctores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 28, 68)));
        btndoctores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndoctoresMouseClicked(evt);
            }
        });
        btndoctores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asistencia-medica.png"))); // NOI18N
        btndoctores.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Doctores");
        btndoctores.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(btndoctores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 40));

        btnpacientes.setBackground(new java.awt.Color(19, 50, 124));
        btnpacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 28, 68)));
        btnpacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpacientesMouseClicked(evt);
            }
        });
        btnpacientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente (1) (1).png"))); // NOI18N
        btnpacientes.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Paciente");
        btnpacientes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel1.add(btnpacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 210, 40));

        btnsalir.setBackground(new java.awt.Color(19, 50, 124));
        btnsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 28, 68)));
        btnsalir.setForeground(new java.awt.Color(7, 35, 126));
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.setMinimumSize(new java.awt.Dimension(0, 0));
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalirMouseExited(evt);
            }
        });
        btnsalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsalirKeyPressed(evt);
            }
        });
        btnsalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblexit.setForeground(new java.awt.Color(0, 0, 0));
        lblexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnsalir.add(lblexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salir");
        btnsalir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 5, -1, -1));

        btnsalir1.setBackground(new java.awt.Color(102, 102, 102));
        btnsalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir1.setMinimumSize(new java.awt.Dimension(0, 0));
        btnsalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalir1MouseExited(evt);
            }
        });
        btnsalir1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsalir1KeyPressed(evt);
            }
        });
        btnsalir1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexit1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblexit1.setForeground(new java.awt.Color(0, 0, 0));
        lblexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnsalir1.add(lblexit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Salir");
        btnsalir1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 5, -1, -1));

        btnsalir.add(btnsalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 40));

        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 40));

        btncita.setBackground(new java.awt.Color(19, 50, 124));
        btncita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 28, 68)));
        btncita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncita.setMinimumSize(new java.awt.Dimension(0, 0));
        btncita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncitaMouseExited(evt);
            }
        });
        btncita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btncitaKeyPressed(evt);
            }
        });
        btncita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexit2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblexit2.setForeground(new java.awt.Color(0, 0, 0));
        lblexit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        btncita.add(lblexit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 4, 30, 30));

        cita.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cita.setForeground(new java.awt.Color(255, 255, 255));
        cita.setText("Cita");
        btncita.add(cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 5, -1, -1));

        btnsalir3.setBackground(new java.awt.Color(102, 102, 102));
        btnsalir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir3.setMinimumSize(new java.awt.Dimension(0, 0));
        btnsalir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalir3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalir3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalir3MouseExited(evt);
            }
        });
        btnsalir3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnsalir3KeyPressed(evt);
            }
        });
        btnsalir3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblexit3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblexit3.setForeground(new java.awt.Color(0, 0, 0));
        lblexit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        btnsalir3.add(lblexit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Salir");
        btnsalir3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 5, -1, -1));

        btncita.add(btnsalir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 40));

        jPanel1.add(btncita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 590));

        contenido.setBackground(new java.awt.Color(241, 241, 241));
        contenido.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        jPanel3.add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 790, 530));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo1.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, -10, 100, 90));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(19, 50, 124));
        jLabel12.setText("SISTEMA - FOR SALUD");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 13, -1, -1));

        lblfecha.setBackground(new java.awt.Color(0, 0, 0));
        lblfecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel3.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 10, 110, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/cerrar.png")); // Ruta de la imagen del icono
        JOptionPane.showMessageDialog(this, "QUE TENGA BUEN DÍA", "Salir", JOptionPane.INFORMATION_MESSAGE, icon);
        System.exit(0);
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseEntered
        btnsalir.setBackground(Color.red);
        lblexit.setForeground(Color.white);
    }//GEN-LAST:event_btnsalirMouseEntered

    private void btnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseExited
        btnsalir.setBackground(new Color(19,50,124)); // Color blanco
        lblexit.setForeground(new Color(0, 0, 0)); // Color negro
    }//GEN-LAST:event_btnsalirMouseExited

    private void btninicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninicioMouseClicked
        Principal p1 = new Principal();
        p1.setSize(790, 530);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btninicioMouseClicked

    private void btndoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndoctoresMouseClicked
        Doctores p1 = new Doctores();
        p1.setSize(790, 530);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btndoctoresMouseClicked

    private void btnsalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalirKeyPressed
       
        
    }//GEN-LAST:event_btnsalirKeyPressed

    private void btnpacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpacientesMouseClicked
        Pacientes p1 = new Pacientes();
        p1.setSize(790, 530);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btnpacientesMouseClicked

    private void btnsalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir1MouseClicked

    private void btnsalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir1MouseEntered

    private void btnsalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir1MouseExited

    private void btnsalir1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalir1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir1KeyPressed

    private void btnsalir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir3MouseClicked

    private void btnsalir3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir3MouseEntered

    private void btnsalir3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalir3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir3MouseExited

    private void btnsalir3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalir3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsalir3KeyPressed

    private void btncitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncitaMouseClicked
        Citas p1 = new Citas();
        p1.setSize(790, 530);
        p1.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_btncitaMouseClicked

    private void btncitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncitaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btncitaMouseEntered

    private void btncitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncitaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btncitaMouseExited

    private void btncitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btncitaKeyPressed
        
    }//GEN-LAST:event_btncitaKeyPressed

    
    public static void main(String args[]) {
        
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menú;
    private javax.swing.JPanel btncita;
    private javax.swing.JPanel btndoctores;
    private javax.swing.JPanel btninicio;
    private javax.swing.JPanel btnpacientes;
    private javax.swing.JPanel btnsalir;
    private javax.swing.JPanel btnsalir1;
    private javax.swing.JPanel btnsalir3;
    private javax.swing.JLabel cita;
    public static javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblexit1;
    private javax.swing.JLabel lblexit2;
    private javax.swing.JLabel lblexit3;
    private javax.swing.JLabel lblfecha;
    // End of variables declaration//GEN-END:variables
}
