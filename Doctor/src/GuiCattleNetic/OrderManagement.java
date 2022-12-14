/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiCattleNetic;

import java.beans.PropertyVetoException;
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
public class OrderManagement extends javax.swing.JInternalFrame {

    /**
     * Creates new form OrderManagement
     */
    String url = "jdbc:mysql://localhost:3306/cattleNetic";
    String user = "root";
    String password = "root";
    public OrderManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CancelBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        IDSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DietTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 255, 51));
        setClosable(true);
        setTitle("Create Diet Plan");

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

        IDSpinner.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("What is the Cow ID:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Diet Plan for the Cow");

        DietTextArea.setBackground(new java.awt.Color(204, 204, 255));
        DietTextArea.setColumns(20);
        DietTextArea.setRows(5);
        jScrollPane1.setViewportView(DietTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(IDSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(SubmitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CancelBtn)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn)
                    .addComponent(CancelBtn))
                .addGap(20, 20, 20))
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
        int ID = Integer.valueOf((int) IDSpinner.getValue());
        //String health = String.valueOf(HealthComboBox.getSelectedItem());
        String dietPlan = DietTextArea.getText();
        String cowID = Integer.toString(ID);
        
        
        try {    
            Connection con = DriverManager.getConnection(url, user, password);
            
            String sql = "SELECT * FROM cows";
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            int count = 0;
            while(rs.next()){
                count++;
            }
            //System.out.println("Count is: " + count);
            
            if (ID <= count &&  ID > 0){
                JOptionPane.showMessageDialog(null, "Success! The updates have been submitted");
                //String searchID = "1";
                String query = " UPDATE cows SET dietPlan = ?"
                        + " WHERE ID = '" + cowID + "' ";

                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString (1, dietPlan);

                preparedStmt.execute();                
            } else {
                JOptionPane.showMessageDialog(null, "Number not in range", "Database", JOptionPane.ERROR_MESSAGE);
            }


            con.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void CancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelBtnActionPerformed
        // TODO add your handling code here:
        try {
            this.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MeatOrderManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelBtn;
    private javax.swing.JTextArea DietTextArea;
    private javax.swing.JSpinner IDSpinner;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
