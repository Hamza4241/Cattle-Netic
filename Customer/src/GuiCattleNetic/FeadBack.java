/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiCattleNetic;

import java.beans.PropertyVetoException;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hamzah Manzoor
 */
public class FeadBack extends javax.swing.JInternalFrame {

    /**
     * Creates new form OrderManagement
     */
    String url = "jdbc:mysql://localhost:3306/cattleNetic";
    String user = "root";
    String password = "root";
    public FeadBack() {
        initComponents();
        FeedbackArea.setText("Enter Text Here");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        CancelBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FeedbackArea = new javax.swing.JTextArea();
        RatingSlider = new javax.swing.JSlider();

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(51, 255, 51));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        CancelBtn.setBackground(new java.awt.Color(80, 45, 100));
        CancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelBtn.setForeground(new java.awt.Color(204, 204, 204));
        CancelBtn.setText("Cancel");
        CancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBtnActionPerformed(evt);
            }
        });

        SubmitBtn.setBackground(new java.awt.Color(80, 60, 112));
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(204, 204, 204));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("How would you like to rate us (1 to 5):");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add any comments/suggestions");

        FeedbackArea.setColumns(20);
        FeedbackArea.setRows(5);
        jScrollPane1.setViewportView(FeedbackArea);

        RatingSlider.setMaximum(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitBtn)
                .addGap(125, 125, 125)
                .addComponent(CancelBtn)
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(RatingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RatingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelBtn)
                    .addComponent(SubmitBtn))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        try {    
            Connection con = DriverManager.getConnection(url, user, password);
            
            JOptionPane.showMessageDialog(null, "Success! Your feedback has been submitted");
            String feedback = FeedbackArea.getText();
            int amount = RatingSlider.getValue();
            
            String searchID = "1";
            String query = " UPDATE customer SET rating = ?, feedback = ?"
                    + " WHERE ID = '" + searchID + "' ";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt    (1, amount);
            preparedStmt.setString (2, feedback);

            preparedStmt.execute();

            con.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            //exit(0);
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MeatOrderManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    public javax.swing.JTextArea FeedbackArea;
    public javax.swing.JSlider RatingSlider;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
