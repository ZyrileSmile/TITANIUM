
public class Canteen extends javax.swing.JFrame {

    
    public Canteen() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lBusOperatorName = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lLogOut = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pbInfo = new javax.swing.JPanel();
        lCustName = new javax.swing.JLabel();
        lIDno = new javax.swing.JLabel();
        lCourseDept = new javax.swing.JLabel();
        tfCourseDept = new javax.swing.JTextField();
        tfIDno = new javax.swing.JTextField();
        tfCustName = new javax.swing.JTextField();
        lBarcode = new javax.swing.JLabel();
        tfBarcode = new javax.swing.JTextField();
        lLoadBalLeft = new javax.swing.JLabel();
        tfLoadBalLeft = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tfLoadAvailable = new javax.swing.JTextField();
        lLoadAvailable = new javax.swing.JLabel();
        lExpense = new javax.swing.JLabel();
        tfExpense = new javax.swing.JTextField();
        bCancel = new javax.swing.JButton();
        bDeduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lBusOperatorName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lBusOperatorName.setText("Cashier Name:");
        jPanel1.add(lBusOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        lDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lDate.setText("Date:");
        jPanel1.add(lDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 40));

        lLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lLogOut.setText("Log Out ");
        lLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lLogOutMouseClicked(evt);
            }
        });
        jPanel1.add(lLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 870, 10));

        pbInfo.setBackground(new java.awt.Color(204, 204, 255));
        pbInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pbInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lCustName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCustName.setText("Customer Name:");
        pbInfo.add(lCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        lIDno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lIDno.setText("ID Number:");
        pbInfo.add(lIDno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 40));

        lCourseDept.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCourseDept.setText("Course/Dept.:");
        pbInfo.add(lCourseDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 40));

        tfCourseDept.setEditable(false);
        tfCourseDept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pbInfo.add(tfCourseDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 340, 30));

        tfIDno.setEditable(false);
        tfIDno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pbInfo.add(tfIDno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 340, 30));

        tfCustName.setEditable(false);
        tfCustName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pbInfo.add(tfCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 340, 30));

        lBarcode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lBarcode.setText("Bar Code:");
        pbInfo.add(lBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 40));

        tfBarcode.setEditable(false);
        tfBarcode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pbInfo.add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 340, 30));

        jPanel1.add(pbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 490, 350));

        lLoadBalLeft.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lLoadBalLeft.setText("Load Balance Left");
        jPanel1.add(lLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, 40));

        tfLoadBalLeft.setEditable(false);
        tfLoadBalLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(tfLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 320, 70));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 350, 10));

        tfLoadAvailable.setEditable(false);
        tfLoadAvailable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(tfLoadAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 340, 40));

        lLoadAvailable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lLoadAvailable.setText("Load Available");
        jPanel1.add(lLoadAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, 40));

        lExpense.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lExpense.setText("Expense");
        jPanel1.add(lExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, 40));

        tfExpense.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(tfExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 340, 40));

        bCancel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });
        jPanel1.add(bCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 90, 40));

        bDeduct.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        bDeduct.setText("Deduct");
        jPanel1.add(bDeduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogOutMouseClicked
      
        LogIn lgn = new LogIn();
        lgn.setVisible(true);
        dispose();

    }//GEN-LAST:event_lLogOutMouseClicked

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
       
        tfExpense.setText("");
        
        
    }//GEN-LAST:event_bCancelActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Canteen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bDeduct;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lBarcode;
    private javax.swing.JLabel lBusOperatorName;
    private javax.swing.JLabel lCourseDept;
    private javax.swing.JLabel lCustName;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lExpense;
    private javax.swing.JLabel lIDno;
    private javax.swing.JLabel lLoadAvailable;
    private javax.swing.JLabel lLoadBalLeft;
    private javax.swing.JLabel lLogOut;
    private javax.swing.JPanel pbInfo;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfCourseDept;
    private javax.swing.JTextField tfCustName;
    private javax.swing.JTextField tfExpense;
    private javax.swing.JTextField tfIDno;
    private javax.swing.JTextField tfLoadAvailable;
    private javax.swing.JTextField tfLoadBalLeft;
    // End of variables declaration//GEN-END:variables
}
