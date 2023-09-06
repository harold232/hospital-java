
package Frames;


import java.awt.Color;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Doctores extends javax.swing.JPanel {

   
    public Doctores() {
        initComponents();
        
         btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            String criterio = txtbuscar.getText();
            buscarDoctores(criterio);
        }
    });
        
        
    }
    
    public void buscarDoctores(String criterio) {
     DefaultTableModel model = (DefaultTableModel) jtbuscar.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    jtbuscar.setRowSorter(sorter);

    if (!criterio.isEmpty()) {
        RowFilter<DefaultTableModel, Object> rowFilter = new RowFilter<DefaultTableModel, Object>() {
            public boolean include(RowFilter.Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String ID = entry.getStringValue(1); // Primera columna
                String nombre = entry.getStringValue(0); // Segunda columna
                String especialidad= entry.getStringValue(2); // Segunda columna
                return nombre.toLowerCase().contains(criterio.toLowerCase()) ||
                       ID.toLowerCase().contains(criterio.toLowerCase())||
                        especialidad.toLowerCase().contains(criterio.toLowerCase());
                       
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
        jtbuscar = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 241, 241));
        setForeground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbuscar.setBackground(new java.awt.Color(255, 255, 255));
        jtbuscar.setForeground(new java.awt.Color(0, 0, 0));
        jtbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1001-MI ", "Carlos García", "Medicina Interna", "8:00 - 12:00 (Lunes - Miércoles)", "14:00 - 17:00 (Jueves - Viernes)", "Consultorio 1 "},
                {"1002-MI", "Ana Torres", "Medicina Interna", "8:00 - 12:00 (Jueves - Sábado)", "14:00 - 17:00 (Lunes - Miércoles)", "Consultorio 2"},
                {"2001-PE", "Alejandro Martínez", "Pediatría", "8:00 - 12:00 (Lunes - Martes)", "14:00 - 17:00 (Miércoles)", "Consultorio 2"},
                {"2002-PE", "Laura Rodríguez", "Pediatría", "8:00 - 12:00 (Miércoles)", "14:00 - 17:00 (Jueves - Sábado)", "Consultorio 1 "},
                {"3001-GYO", "Andrés Vargas", "Ginecología y Obstetricia", "10:00 - 13:00 (Lunes - Miércoles)", "15:00 - 17:30 (Viernes)", "Consultorio 2"},
                {"3002-GYO", "Gabriela López", "Ginecología y Obstetricia", "8:00 - 12:00 (Jueves - Sábado)", "14:00 - 17:00 (Lunes - Miércoles)", "Consultorio 1 "},
                {"4001-CA", " David Herrera", "Cardiología", "8:00 - 12:00 (Lunes - Miércoles)", "14:00 - 17:30 (Jueves - Sábado)", "Consultorio 2"},
                {"4002-CA", "Isabel Gómez", "Cardiología", "8:00 - 12:00 (Jueves - Sábado)", "14:00 - 17:00 (Lunes - Miércoles)", "Consultorio 1 "},
                {"5001-NEU", "Sergio Morales", "Neumología", "8:00 - 12:00 (Lunes - Martes)", "14:00 - 17:30 (Jueves - Viernes)", "Consultorio 1 "},
                {"5002-NEU", "Victoria Ramírez", "Neumología", "8:00 - 12:00 (Miércoles - Sábado)", "14:00 - 17:00 (Lunes - Sábado)", "Consultorio 2"},
                {"6001-GAS", "Javier Morales", "Gastroenterología", "8:00 - 12:00 (Jueves - Sábado)", "14:00 - 17:00 (Lunes - Miércoles)", "Consultorio 1 "},
                {"6002-GAS ", "Carolina Silva", "Gastroenterología", "8:00 - 12:00 (Lunes - Martes)", "14:00 - 17:30 (Jueves - Viernes)", "Consultorio 2"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres ", "Especialidad", "Horario M.", "Horario T.", "Consultorio"
            }
        ));
        jtbuscar.setGridColor(new java.awt.Color(0, 0, 0));
        jtbuscar.setOpaque(false);
        jtbuscar.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtbuscar.getColumnModel().getColumn(1).setPreferredWidth(60);
        jtbuscar.getColumnModel().getColumn(2).setPreferredWidth(85);
        jtbuscar.getColumnModel().getColumn(3).setPreferredWidth(120);
        jtbuscar.getColumnModel().getColumn(4).setPreferredWidth(130);
        jtbuscar.getColumnModel().getColumn(5).setPreferredWidth(50);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(19, 50, 124)); // Establece el color deseado para el encabezado
        headerRenderer.setForeground(Color.WHITE); // Establece el color de texto deseado para el encabezado

        for (int i = 0; i < jtbuscar.getModel().getColumnCount(); i++) {
            jtbuscar.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        jScrollPane1.setViewportView(jtbuscar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 760, 270));

        txtbuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbuscar.setOpaque(true);
        add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 390, 40));

        btnbuscar.setBackground(new java.awt.Color(19, 50, 124));
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BUSCAR");
        btnbuscar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 8, -1, -1));

        add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 50, 124));
        jLabel2.setText("Doctores");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbuscar;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
