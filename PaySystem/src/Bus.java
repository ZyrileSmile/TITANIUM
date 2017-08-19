
public class Bus extends javax.swing.JFrame {

    
    public Bus() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBus = new javax.swing.JPanel();
        lLogOut = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
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
        lBusOperatorName = new javax.swing.JLabel();
        lLoadAvailable = new javax.swing.JLabel();
        tfLoadAvailable = new javax.swing.JTextField();
        lBusFare = new javax.swing.JLabel();
        tfExpense = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pBus.setBackground(new java.awt.Color(204, 204, 255));
        pBus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lLogOut.setText("Log Out ");
        lLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lLogOutMouseClicked(evt);
            }
        });
        pBus.add(lLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 30));

        lDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lDate.setText("Date:");
        pBus.add(lDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 40));
        pBus.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 870, 10));

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

        pBus.add(pbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 490, 350));

        lLoadBalLeft.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lLoadBalLeft.setText("Load Balance Left");
        pBus.add(lLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, 40));

        tfLoadBalLeft.setEditable(false);
        tfLoadBalLeft.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBus.add(tfLoadBalLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 320, 70));

        lBusOperatorName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lBusOperatorName.setText("Bus Operator Name:");
        pBus.add(lBusOperatorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        lLoadAvailable.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lLoadAvailable.setText("Load Available");
        pBus.add(lLoadAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, 40));

        tfLoadAvailable.setEditable(false);
        tfLoadAvailable.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBus.add(tfLoadAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 340, 40));

        lBusFare.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lBusFare.setText("Bus Fare");
        pBus.add(lBusFare, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, -1, 40));

        tfExpense.setEditable(false);
        tfExpense.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfExpense.setText("6.00");
        pBus.add(tfExpense, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 340, 40));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Cancel");
        pBus.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 30));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Save");
        pBus.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, 30));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Change Fare");
        pBus.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, 30));

        getContentPane().add(pBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogOutMouseClicked
    
        LogIn lgn = new LogIn();
        lgn.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_lLogOutMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBarcode;
    private javax.swing.JLabel lBusFare;
    private javax.swing.JLabel lBusOperatorName;
    private javax.swing.JLabel lCourseDept;
    private javax.swing.JLabel lCustName;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lIDno;
    private javax.swing.JLabel lLoadAvailable;
    private javax.swing.JLabel lLoadBalLeft;
    private javax.swing.JLabel lLogOut;
    private javax.swing.JPanel pBus;
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
