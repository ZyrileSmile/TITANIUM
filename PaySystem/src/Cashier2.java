
public class Cashier2 extends javax.swing.JFrame {

    
    public Cashier2() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCashier = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pGetCode = new javax.swing.JPanel();
        pRegister = new javax.swing.JPanel();
        rlCustName = new javax.swing.JLabel();
        rlCourseDept = new javax.swing.JLabel();
        rlBarCode = new javax.swing.JLabel();
        rlIdNum = new javax.swing.JLabel();
        prRegister = new javax.swing.JPanel();
        rtfCourseDept = new javax.swing.JTextField();
        rtfBarcode = new javax.swing.JTextField();
        rtfCustName = new javax.swing.JTextField();
        rtfIdNum = new javax.swing.JTextField();
        rbCancel = new javax.swing.JButton();
        rbAdd = new javax.swing.JButton();
        pBalLoad = new javax.swing.JPanel();
        bllAvailBal = new javax.swing.JLabel();
        btfAvailBal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btfCustName = new javax.swing.JTextField();
        bllLoadAdd = new javax.swing.JLabel();
        bbAdd = new javax.swing.JButton();
        bbCancel = new javax.swing.JButton();
        pblTotalBalance = new javax.swing.JPanel();
        bllLoadBalLeft = new javax.swing.JLabel();
        btfoadBalLeft = new javax.swing.JTextField();
        bllCustName = new javax.swing.JLabel();
        btfLoadAdd = new javax.swing.JTextField();
        bllBarCode = new javax.swing.JLabel();
        btfBarcode = new javax.swing.JTextField();
        pRefund = new javax.swing.JPanel();
        rlAvailBal = new javax.swing.JLabel();
        rtfAvailBal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        rtfAmountRef = new javax.swing.JTextField();
        rlAmountRef = new javax.swing.JLabel();
        rbCncl = new javax.swing.JButton();
        rbRefund = new javax.swing.JButton();
        prTotalBal = new javax.swing.JPanel();
        rlLoadBalLeft = new javax.swing.JLabel();
        rtfLoadBalLeft = new javax.swing.JTextField();
        rlBarC = new javax.swing.JLabel();
        rtfBarC = new javax.swing.JTextField();
        rlCustomerN = new javax.swing.JLabel();
        rtfCustomerN = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lDate = new javax.swing.JLabel();
        lCashName = new javax.swing.JLabel();
        lLogOut = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCashier.setBackground(new java.awt.Color(204, 204, 255));
        pCashier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N

        pGetCode.setBackground(new java.awt.Color(204, 204, 255));
        pGetCode.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jTabbedPane1.addTab("Get Code", pGetCode);

        pRegister.setBackground(new java.awt.Color(204, 204, 255));
        pRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rlCustName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlCustName.setText("Customer Name:");
        pRegister.add(rlCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 40));

        rlCourseDept.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlCourseDept.setText("Course/Dept.:");
        pRegister.add(rlCourseDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 40));

        rlBarCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlBarCode.setText("Bar Code:");
        pRegister.add(rlBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 40));

        rlIdNum.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlIdNum.setText("ID Number:");
        pRegister.add(rlIdNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 40));

        prRegister.setBackground(new java.awt.Color(204, 204, 255));
        prRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        prRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rtfCourseDept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        prRegister.add(rtfCourseDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 360, 40));

        rtfBarcode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        prRegister.add(rtfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 360, 40));

        rtfCustName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        prRegister.add(rtfCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 360, 40));

        rtfIdNum.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rtfIdNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtfIdNumActionPerformed(evt);
            }
        });
        prRegister.add(rtfIdNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 360, 40));

        rbCancel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        rbCancel.setText("Cancel");
        rbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCancelActionPerformed(evt);
            }
        });
        prRegister.add(rbCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 30));

        rbAdd.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        rbAdd.setText("Add");
        prRegister.add(rbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 70, 30));

        pRegister.add(prRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 500, 290));

        jTabbedPane1.addTab("Register", pRegister);

        pBalLoad.setBackground(new java.awt.Color(204, 204, 255));
        pBalLoad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pBalLoad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bllAvailBal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bllAvailBal.setText("Available Balance:");
        pBalLoad.add(bllAvailBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 40));

        btfAvailBal.setEditable(false);
        btfAvailBal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBalLoad.add(btfAvailBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 50));
        pBalLoad.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 10));

        btfCustName.setEditable(false);
        btfCustName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBalLoad.add(btfCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 300, 30));

        bllLoadAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bllLoadAdd.setText("Load Added:");
        pBalLoad.add(bllLoadAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        bbAdd.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        bbAdd.setText("Add");
        pBalLoad.add(bbAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, 40));

        bbCancel.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        bbCancel.setText("Cancel");
        bbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbCancelActionPerformed(evt);
            }
        });
        pBalLoad.add(bbCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 90, 40));

        pblTotalBalance.setBackground(new java.awt.Color(204, 204, 255));
        pblTotalBalance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pblTotalBalance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bllLoadBalLeft.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bllLoadBalLeft.setText("Load Balance Left:");
        pblTotalBalance.add(bllLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        btfoadBalLeft.setEditable(false);
        btfoadBalLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pblTotalBalance.add(btfoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 320, 80));

        pBalLoad.add(pblTotalBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 380, 230));

        bllCustName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bllCustName.setText("Customer Name:");
        pBalLoad.add(bllCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 30));

        btfLoadAdd.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBalLoad.add(btfLoadAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 320, 50));

        bllBarCode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bllBarCode.setText("Bar Code:");
        pBalLoad.add(bllBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        btfBarcode.setEditable(false);
        btfBarcode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBalLoad.add(btfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 30));

        jTabbedPane1.addTab("Balance/Load", pBalLoad);

        pRefund.setBackground(new java.awt.Color(204, 204, 255));
        pRefund.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pRefund.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rlAvailBal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlAvailBal.setText("Available Balance:");
        pRefund.add(rlAvailBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 40));

        rtfAvailBal.setEditable(false);
        rtfAvailBal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pRefund.add(rtfAvailBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 320, 50));
        pRefund.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 760, 10));

        rtfAmountRef.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rtfAmountRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtfAmountRefActionPerformed(evt);
            }
        });
        pRefund.add(rtfAmountRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 320, 50));

        rlAmountRef.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlAmountRef.setText("Amount Refunded:");
        pRefund.add(rlAmountRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        rbCncl.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        rbCncl.setText("Cancel");
        rbCncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCnclActionPerformed(evt);
            }
        });
        pRefund.add(rbCncl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 90, 40));

        rbRefund.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        rbRefund.setText("Refund");
        pRefund.add(rbRefund, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 90, 40));

        prTotalBal.setBackground(new java.awt.Color(204, 204, 255));
        prTotalBal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        prTotalBal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rlLoadBalLeft.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlLoadBalLeft.setText("Load Balance Left:");
        prTotalBal.add(rlLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        rtfLoadBalLeft.setEditable(false);
        rtfLoadBalLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        prTotalBal.add(rtfLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 320, 80));

        pRefund.add(prTotalBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 380, 230));

        rlBarC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlBarC.setText("Bar Code:");
        pRefund.add(rlBarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        rtfBarC.setEditable(false);
        rtfBarC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pRefund.add(rtfBarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 210, 30));

        rlCustomerN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rlCustomerN.setText("Customer Name:");
        pRefund.add(rlCustomerN, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 30));

        rtfCustomerN.setEditable(false);
        rtfCustomerN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pRefund.add(rtfCustomerN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 300, 30));

        jTabbedPane1.addTab("Refund", pRefund);

        pCashier.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 830, 400));
        pCashier.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 870, 10));

        lDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lDate.setText("Date:");
        pCashier.add(lDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 40));

        lCashName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCashName.setText("Cashier Name:");
        pCashier.add(lCashName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        lLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lLogOut.setText("Log Out ");
        lLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lLogOutMouseClicked(evt);
            }
        });
        pCashier.add(lLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 30));

        getContentPane().add(pCashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rtfIdNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtfIdNumActionPerformed
       
    }//GEN-LAST:event_rtfIdNumActionPerformed

    private void rbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCancelActionPerformed
 
        rtfBarcode.setText("");
        rtfCustName.setText("");
        rtfIdNum.setText("");
        rtfCourseDept.setText("");
    }//GEN-LAST:event_rbCancelActionPerformed

    private void bbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbCancelActionPerformed
       
        btfLoadAdd.setText("");
    }//GEN-LAST:event_bbCancelActionPerformed

    private void lLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogOutMouseClicked
    
        LogIn lgn = new LogIn();
        lgn.setVisible(true);
        dispose();

    }//GEN-LAST:event_lLogOutMouseClicked

    private void rbCnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCnclActionPerformed
   
    }//GEN-LAST:event_rbCnclActionPerformed

    private void rtfAmountRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtfAmountRefActionPerformed
     
    }//GEN-LAST:event_rtfAmountRefActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbAdd;
    private javax.swing.JButton bbCancel;
    private javax.swing.JLabel bllAvailBal;
    private javax.swing.JLabel bllBarCode;
    private javax.swing.JLabel bllCustName;
    private javax.swing.JLabel bllLoadAdd;
    private javax.swing.JLabel bllLoadBalLeft;
    private javax.swing.JTextField btfAvailBal;
    private javax.swing.JTextField btfBarcode;
    private javax.swing.JTextField btfCustName;
    private javax.swing.JTextField btfLoadAdd;
    private javax.swing.JTextField btfoadBalLeft;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lCashName;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lLogOut;
    private javax.swing.JPanel pBalLoad;
    private javax.swing.JPanel pCashier;
    private javax.swing.JPanel pGetCode;
    private javax.swing.JPanel pRefund;
    private javax.swing.JPanel pRegister;
    private javax.swing.JPanel pblTotalBalance;
    private javax.swing.JPanel prRegister;
    private javax.swing.JPanel prTotalBal;
    private javax.swing.JButton rbAdd;
    private javax.swing.JButton rbCancel;
    private javax.swing.JButton rbCncl;
    private javax.swing.JButton rbRefund;
    private javax.swing.JLabel rlAmountRef;
    private javax.swing.JLabel rlAvailBal;
    private javax.swing.JLabel rlBarC;
    private javax.swing.JLabel rlBarCode;
    private javax.swing.JLabel rlCourseDept;
    private javax.swing.JLabel rlCustName;
    private javax.swing.JLabel rlCustomerN;
    private javax.swing.JLabel rlIdNum;
    private javax.swing.JLabel rlLoadBalLeft;
    private javax.swing.JTextField rtfAmountRef;
    private javax.swing.JTextField rtfAvailBal;
    private javax.swing.JTextField rtfBarC;
    private javax.swing.JTextField rtfBarcode;
    private javax.swing.JTextField rtfCourseDept;
    private javax.swing.JTextField rtfCustName;
    private javax.swing.JTextField rtfCustomerN;
    private javax.swing.JTextField rtfIdNum;
    private javax.swing.JTextField rtfLoadBalLeft;
    // End of variables declaration//GEN-END:variables
}
