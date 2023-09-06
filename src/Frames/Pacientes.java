
package Frames;

import static Frames.Inicio.contenido;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;



public class Pacientes extends javax.swing.JPanel {

     private DefaultTableModel model;
    
    public Pacientes() {
        initComponents();
        
         btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            String criterio = txtbuscar.getText();
            buscarPacientes(criterio);
        }
    });
        
    
    }
    
    public void buscarPacientes(String criterio) {
     DefaultTableModel model = (DefaultTableModel) jtpc.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jtpc.setRowSorter(sorter);

    if (!criterio.isEmpty()) {
        RowFilter<DefaultTableModel, Object> rowFilter = new RowFilter<DefaultTableModel, Object>() {
            public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String nombre = entry.getStringValue(1); // Primera columna
                String dni = entry.getStringValue(0); // Segunda columna
                return nombre.toLowerCase().contains(criterio.toLowerCase()) ||
                       dni.toLowerCase().contains(criterio.toLowerCase());
            }
        };
        sorter.setRowFilter(rowFilter);
    } else {
        sorter.setRowFilter(null);
        
    }
    txtbuscar.setText("");
    
}
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtpc = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nuevo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtpc.setBackground(new java.awt.Color(255, 255, 255));
        jtpc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jtpc.setForeground(new java.awt.Color(11, 28, 68));
        jtpc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12345678", "Juan", "Perez", "Gomez", "978456312", "juan.perez@example.com"},
                {"87654321", "María", "Rodríguez", "López", "951826374", "	maria.rodriguez@example.com"},
                {"54321678", "Carlos", "Garcia", "Fernández", "925714683", "carlos.garcia@example.com"},
                {"87654321", "Laura", "López	", "Martinez", "914257836", "laura.lopez@example.com"},
                {"	45678912	", "Andrés", "Torres", "		Sánchez", "936874125", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido Paterno", "Apellido Materno", "Teléfono", "Correo"
            }
        ));
        jtpc.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jtpc.getColumnModel().getColumn(0).setPreferredWidth(80); // DNI
        jtpc.getColumnModel().getColumn(1).setPreferredWidth(120); // Nombre
        jtpc.getColumnModel().getColumn(2).setPreferredWidth(120); // Apellido Paterno
        jtpc.getColumnModel().getColumn(3).setPreferredWidth(120); // Apellido Materno
        jtpc.getColumnModel().getColumn(4).setPreferredWidth(100); // Teléfono
        jtpc.getColumnModel().getColumn(5).setPreferredWidth(200); // Correo

        DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer();
        headerRenderer2.setBackground(new Color(19,50,124)); // Establece el color deseado para el encabezado
        headerRenderer2.setForeground(Color.WHITE); // Establece el color de texto deseado para el encabezado

        for (int i = 0; i < jtpc.getModel().getColumnCount(); i++) {
            jtpc.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer2);
        }
        jScrollPane1.setViewportView(jtpc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 700, 240));
        add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 390, 40));

        btnbuscar.setBackground(new java.awt.Color(19, 50, 124));
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarMouseClicked(evt);
            }
        });
        btnbuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR");
        btnbuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, -1, -1));

        add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pacientes");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        nuevo.setBackground(new java.awt.Color(19, 50, 124));
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevoMouseClicked(evt);
            }
        });
        nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NUEVO");
        nuevo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 0, -1, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paciente.png"))); // NOI18N
        nuevo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PACIENTE");
        nuevo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, -1, -1));

        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 130, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarMouseClicked
        
    }//GEN-LAST:event_btnbuscarMouseClicked

    private void nuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseClicked
        NuevoPc p1 = new NuevoPc();
        p1.setSize(790, 530);
        p1.setLocation(0,0);

        contenido.removeAll();
        contenido.add(p1, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_nuevoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtpc;
    private javax.swing.JPanel nuevo;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
