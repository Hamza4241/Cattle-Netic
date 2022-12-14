/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GuiCattleNetic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
    String price = "130";
    public OrderManagement() {
        initComponents();
        PricePerLiterLabel.setText(price);
        MonthlyBillLabel.setText("0000 RS");
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
        CancelSubscribtionBtn = new javax.swing.JButton();
        SubscribtionBtn = new javax.swing.JButton();
        QuantityLabel = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        PricePerLiterLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MonthlyBillLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 255, 51));
        setClosable(true);
        setTitle("Milk Order Management");

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        CancelSubscribtionBtn.setBackground(new java.awt.Color(80, 45, 100));
        CancelSubscribtionBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CancelSubscribtionBtn.setForeground(new java.awt.Color(204, 204, 204));
        CancelSubscribtionBtn.setText("Cancel Subscription");
        CancelSubscribtionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelSubscribtionBtnActionPerformed(evt);
            }
        });

        SubscribtionBtn.setBackground(new java.awt.Color(80, 60, 112));
        SubscribtionBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SubscribtionBtn.setForeground(new java.awt.Color(204, 204, 204));
        SubscribtionBtn.setText("Subscribe");
        SubscribtionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubscribtionBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("How much amount of milk would you like to get daily:");

        PricePerLiterLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PricePerLiterLabel.setForeground(new java.awt.Color(255, 255, 255));
        PricePerLiterLabel.setText("120 RS");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Current Price of Milk per liter is:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your monthly bill would be: ");

        MonthlyBillLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MonthlyBillLabel.setForeground(new java.awt.Color(255, 255, 255));
        MonthlyBillLabel.setText("8440 RS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Already a subscriber? Want to cancel subscription?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MonthlyBillLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PricePerLiterLabel))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(CancelSubscribtionBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(SubscribtionBtn)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PricePerLiterLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(QuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MonthlyBillLabel))
                .addGap(18, 18, 18)
                .addComponent(SubscribtionBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(CancelSubscribtionBtn)
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

    private void SubscribtionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubscribtionBtnActionPerformed
        // TODO add your handling code here:
        Object amount = QuantityLabel.getValue();
        int quantity = Integer.valueOf((int) amount)*Integer.parseInt(price)*30;
        int amount_Ordered = Integer.valueOf((int) amount);
        if (quantity < 0) {
            JOptionPane.showMessageDialog(null,"Warning! Quantity cannot be negative.","Alert",JOptionPane.WARNING_MESSAGE);
            MonthlyBillLabel.setText("0000 RS");
        } else {
            MonthlyBillLabel.setText(Integer.toString(quantity) + " RS");
            JOptionPane.showMessageDialog(null, "Success! Your subscription has been approved");
            
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                
            
                String searchID = "1";
                String query = " UPDATE customer SET subscribtion = ?"
                    + " WHERE ID = '" + searchID + "' ";

                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setInt    (1, amount_Ordered);

                preparedStmt.execute();

                con.close();  
            } catch (Exception e) { 
                System.err.println("Got an exception! "); 
                System.err.println(e.getMessage()); 
            }     
        }
    }//GEN-LAST:event_SubscribtionBtnActionPerformed

    private void CancelSubscribtionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelSubscribtionBtnActionPerformed
        // TODO add your handling code here:
        
        
        try {
            String searchID = "1";
            String sql = "SELECT * FROM customer WHERE ID = '" + searchID + "' ";
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                
                String subscribtion = rs.getString(4);
                if (subscribtion.equals("0")) {
                    JOptionPane.showMessageDialog(null,"Warning! Not a subscriber, cannot cancel subscribtion","Alert",JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Success! Your subscription has been canceled"); 
                    
                    String query = " UPDATE customer SET subscribtion = ?"
                        + " WHERE ID = '" + searchID + "' ";

                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setInt    (1, 0);
                    preparedStmt.execute();
                }
                


  
                                
            } else {
                JOptionPane.showMessageDialog(null, "No content in the database");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Issues in SQL syntax", "Database", JOptionPane.ERROR_MESSAGE);
            //System.out.println(ex);
        }
        
        
        
        
        
        
        
        
        
        
        try {
            Connection con = DriverManager.getConnection(url, user, password);



            con.close();  
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 
    }//GEN-LAST:event_CancelSubscribtionBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CancelSubscribtionBtn;
    public javax.swing.JLabel MonthlyBillLabel;
    public javax.swing.JLabel PricePerLiterLabel;
    public javax.swing.JSpinner QuantityLabel;
    public javax.swing.JButton SubscribtionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
