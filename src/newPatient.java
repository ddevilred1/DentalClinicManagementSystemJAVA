/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Redoan
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
public class newPatient extends javax.swing.JFrame {

    /**
     * Creates new form newPatient
     */
    public newPatient() {
        initComponents();
    }
    PreparedStatement pst = null;
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

        Nme = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        mStatus = new javax.swing.JLabel();
        occu = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        cNumber = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        selectSex = new javax.swing.JComboBox<>();
        selectMstatus = new javax.swing.JComboBox<>();
        selectOccu = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        bcond = new javax.swing.JCheckBox();
        gbleed = new javax.swing.JCheckBox();
        tloose = new javax.swing.JCheckBox();
        cpain = new javax.swing.JCheckBox();
        gumd = new javax.swing.JCheckBox();
        badbr = new javax.swing.JCheckBox();
        Jawpain = new javax.swing.JCheckBox();
        blTend = new javax.swing.JCheckBox();
        hep = new javax.swing.JCheckBox();
        dia = new javax.swing.JCheckBox();
        htr = new javax.swing.JCheckBox();
        HBP = new javax.swing.JCheckBox();
        KidD = new javax.swing.JCheckBox();
        livD = new javax.swing.JCheckBox();
        lungD = new javax.swing.JCheckBox();
        asthma = new javax.swing.JCheckBox();
        rFev = new javax.swing.JCheckBox();
        aids = new javax.swing.JCheckBox();
        anemia = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Allergy = new javax.swing.JTextField();
        pregnant = new javax.swing.JTextField();
        med = new javax.swing.JTextField();
        sens = new javax.swing.JLabel();
        sensi = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Nme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nme.setText("Name");

        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Address");

        number.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number.setText("Contact No.");

        age.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        age.setText("Age");

        sex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sex.setText("Sex");

        mStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mStatus.setText("Marital Status");

        occu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        occu.setText("Occupation");

        selectSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        selectSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSexActionPerformed(evt);
            }
        });

        selectMstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Unmarried" }));

        selectOccu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Job", "Business", "Student", "Housewife", "Retired" }));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        bcond.setText("Bad Condition");

        gbleed.setText("Gum Bleeds");

        tloose.setText("Teeth Loose");

        cpain.setText("Chest Pain");

        gumd.setText("Gum Diesease");

        badbr.setText("Bad Breath");

        Jawpain.setText("Jaw Pain");

        blTend.setText("Bleeding Tend.");

        hep.setText("Hepatitis");

        dia.setText("Diabetes");

        htr.setText("Heart Trouble");

        HBP.setText("High BP");

        KidD.setText("Kidney Disease");

        livD.setText("Liver Disease");

        lungD.setText("Lung Diesease");

        asthma.setText("Asthma");

        rFev.setText("Rheumatic");

        aids.setText("AIDS");

        anemia.setText("Anemia");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Allergic To");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pregnant");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Medicine");

        sens.setText("Sentitivity To");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(age)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Jawpain)
                        .addGap(5, 5, 5)
                        .addComponent(blTend))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hep)
                        .addGap(5, 5, 5)
                        .addComponent(HBP))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectMstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dia)
                        .addGap(5, 5, 5)
                        .addComponent(KidD))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nme, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address)
                            .addComponent(number))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gumd)
                                .addGap(5, 5, 5)
                                .addComponent(badbr))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bcond))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tloose)))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpain)
                                    .addComponent(gbleed)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(occu)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pregnant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Allergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectOccu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(htr)
                            .addComponent(lungD)
                            .addComponent(rFev)
                            .addComponent(anemia))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(asthma)
                                    .addComponent(livD)
                                    .addComponent(aids)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Nme, add, address, age, jLabel1, jLabel2, jLabel3, mStatus, number, occu, sens, sex});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Allergy, Name, addr, cNumber, jTextField1, med, pregnant, selectMstatus, selectOccu, selectSex, sensi});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {HBP, Jawpain, KidD, aids, anemia, asthma, badbr, bcond, blTend, cpain, dia, gbleed, gumd, hep, htr, livD, lungD, rFev, tloose});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nme, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bcond)
                            .addComponent(gbleed))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address)
                            .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tloose)
                            .addComponent(cpain))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number)
                            .addComponent(cNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gumd)
                            .addComponent(badbr))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jawpain)
                            .addComponent(blTend))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sex)
                            .addComponent(selectSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hep)
                            .addComponent(HBP))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mStatus)
                            .addComponent(selectMstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dia)
                            .addComponent(KidD))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(occu)
                            .addComponent(selectOccu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(htr)
                            .addComponent(livD))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lungD)
                            .addComponent(asthma)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Allergy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rFev)
                    .addComponent(aids)
                    .addComponent(jLabel2)
                    .addComponent(pregnant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anemia)
                        .addComponent(add))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sens)
                    .addComponent(sensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Allergy, HBP, Jawpain, KidD, Name, Nme, add, addr, address, age, aids, anemia, asthma, back, badbr, bcond, blTend, cNumber, cpain, dia, gbleed, gumd, hep, htr, jLabel1, jLabel2, jLabel3, jTextField1, livD, lungD, mStatus, med, number, occu, pregnant, rFev, selectMstatus, selectOccu, selectSex, sens, sensi, sex, tloose});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try {
             Class.forName("org.sqlite.JDBC");
             Connection conn = DriverManager.getConnection("jdbc:sqlite:patientInfo.sqlite");
             //Statement statement = conn.createStatement();
             //statement.executeUpdate("Insert into Patient (ID,Name,Address,Contact,Age,Sex,MaritalStatus,Occupation) values(1,"+Name.getText()+","+addr.getText()+","+cNumber.getText()+","+jTextField1.getText()+","+selectSex.getSelectedItem()+","+selectMstatus.getSelectedItem()+","+selectOccu.getSelectedItem()+")");
             String sql = "Insert into Patient (Name,Address,Contact,Age,Sex,MaritalStatus,Occupation,Health,gumBleed,tLoose,chestp,gumd,badbr,sensitivity,jawpain,bltend,hepatitis,diabetes,heartTr,blPress,kidneyD,LiverD,LungD,Asthma,rfev,AIDS,Anemia,Allergy,pregnant,med) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
             pst = conn.prepareStatement(sql);
             //pst.setString(1, "3");
             pst.setString(1, Name.getText());
             pst.setString(2, addr.getText());
             pst.setString(3, cNumber.getText());
             pst.setString(4, jTextField1.getText());
             pst.setString(5, selectSex.getSelectedItem().toString());
             pst.setString(6, selectMstatus.getSelectedItem().toString());
             pst.setString(7, selectOccu.getSelectedItem().toString());
             if(bcond.isSelected())pst.setString(8, "1");
             if(gbleed.isSelected())pst.setString(9, "1");
             if(tloose.isSelected())pst.setString(10, "1");
             if(cpain.isSelected())pst.setString(11, "1");
             if(gumd.isSelected())pst.setString(12, "1");
             if(badbr.isSelected())pst.setString(13, "1");
             pst.setString(14, sensi.getText());
             if(Jawpain.isSelected())pst.setString(15, "1");
             if(blTend.isSelected())pst.setString(16, "1");
             if(hep.isSelected())pst.setString(17, "1");
             if(dia.isSelected())pst.setString(18, "1");
             if(htr.isSelected())pst.setString(19, "1");
             if(HBP.isSelected())pst.setString(20, "1");
             if(KidD.isSelected())pst.setString(21, "1");
             if(livD.isSelected())pst.setString(22, "1");
             if(lungD.isSelected())pst.setString(23, "1");
             if(asthma.isSelected())pst.setString(24, "1");
             if(rFev.isSelected())pst.setString(25, "1");
             if(aids.isSelected())pst.setString(26, "1");
             if(anemia.isSelected())pst.setString(27, "1");
             pst.setString(28, Allergy.getText());
             pst.setString(29, pregnant.getText());
             pst.setString(30, med.getText());
             pst.execute();
             pst.close();
             conn.close();
             close();
             showPatientDetail d = new showPatientDetail(cNumber.getText());
             d.setVisible(true);
         } 
         catch (Exception e) {
               System.out.println(e);
         }
    }//GEN-LAST:event_addActionPerformed

    private void selectSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSexActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        close();
        new searchAddPatient().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(newPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Allergy;
    private javax.swing.JCheckBox HBP;
    private javax.swing.JCheckBox Jawpain;
    private javax.swing.JCheckBox KidD;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel Nme;
    private javax.swing.JButton add;
    private javax.swing.JTextField addr;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JCheckBox aids;
    private javax.swing.JCheckBox anemia;
    private javax.swing.JCheckBox asthma;
    private javax.swing.JButton back;
    private javax.swing.JCheckBox badbr;
    private javax.swing.JCheckBox bcond;
    private javax.swing.JCheckBox blTend;
    private javax.swing.JTextField cNumber;
    private javax.swing.JCheckBox cpain;
    private javax.swing.JCheckBox dia;
    private javax.swing.JCheckBox gbleed;
    private javax.swing.JCheckBox gumd;
    private javax.swing.JCheckBox hep;
    private javax.swing.JCheckBox htr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox livD;
    private javax.swing.JCheckBox lungD;
    private javax.swing.JLabel mStatus;
    private javax.swing.JTextField med;
    private javax.swing.JLabel number;
    private javax.swing.JLabel occu;
    private javax.swing.JTextField pregnant;
    private javax.swing.JCheckBox rFev;
    private javax.swing.JComboBox<String> selectMstatus;
    private javax.swing.JComboBox<String> selectOccu;
    private javax.swing.JComboBox<String> selectSex;
    private javax.swing.JLabel sens;
    private javax.swing.JTextField sensi;
    private javax.swing.JLabel sex;
    private javax.swing.JCheckBox tloose;
    // End of variables declaration//GEN-END:variables
}
