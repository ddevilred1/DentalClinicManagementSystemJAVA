
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Redoan
 */
public class history extends javax.swing.JFrame {

    /**
     * Creates new form history
     */
     public history() {
        initComponents();
     }
    
    public history(String s) {
        initComponents();
        try {
             Class.forName("org.sqlite.JDBC");
             Connection conn = DriverManager.getConnection("jdbc:sqlite:patientInfo.sqlite");
             //Statement statement = conn.createStatement();
             PreparedStatement pst = null;
             Statement statement = conn.createStatement();
             DefaultTableModel model = (DefaultTableModel) mTable.getModel();
             ResultSet GetData = statement.executeQuery("Select * FROM Crown Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Crown",GetData.getInt("cost")});
             }
            GetData.close();
            GetData = statement.executeQuery("Select * FROM Denture Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Denture",GetData.getInt("cost")});
             }
            GetData.close();
            GetData = statement.executeQuery("Select * FROM Extraction Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Extraction",GetData.getInt("cost")});
             }
            GetData.close();
            GetData = statement.executeQuery("Select * FROM Filling Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Filling",GetData.getInt("cost")});
             }
            GetData.close();
            GetData = statement.executeQuery("Select * FROM Orthodontics Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Orthodontics",GetData.getInt("cost")});
             }
            GetData.close();
            GetData = statement.executeQuery("Select * FROM RootCanel Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Root Canel",GetData.getInt("cost")});
             }
            GetData.close();
            GetData = statement.executeQuery("Select * FROM Scaling Where pName= '"+s+"'");
            while (GetData.next()) {
//              
                 model.addRow(new Object[]{GetData.getString("pName"),GetData.getString("tooth"),"Scaling",GetData.getInt("cost")});
             }
            GetData.close();
             conn.close();
         } 
         catch (Exception e) {
             System.out.println(e);
         }
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOS­ING);
        Toolkit.getDefaultToolkit().getSystemEve­ntQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Tooth", "Treatment", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mTable);
        if (mTable.getColumnModel().getColumnCount() > 0) {
            mTable.getColumnModel().getColumn(0).setResizable(false);
            mTable.getColumnModel().getColumn(1).setResizable(false);
            mTable.getColumnModel().getColumn(2).setResizable(false);
            mTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        new Menu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mTable;
    // End of variables declaration//GEN-END:variables
}
