
public class CustomerBalCheck extends javax.swing.JFrame {

    
    public CustomerBalCheck() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pCustCheckBal = new javax.swing.JPanel();
        lcbcTime = new javax.swing.JLabel();
        lcbcDate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pcbcInfo = new javax.swing.JPanel();
        lCustName = new javax.swing.JLabel();
        lIDno = new javax.swing.JLabel();
        lCourseDept = new javax.swing.JLabel();
        tfCourseDept = new javax.swing.JTextField();
        tfIDno = new javax.swing.JTextField();
        tfCustName = new javax.swing.JTextField();
        lBarcode = new javax.swing.JLabel();
        tfBarcode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tcbcExpenseList = new javax.swing.JTable();
        lLoadBal = new javax.swing.JLabel();
        tfLoadBal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pCustCheckBal.setBackground(new java.awt.Color(204, 204, 255));
        pCustCheckBal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lcbcTime.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcbcTime.setText("Time:");
        pCustCheckBal.add(lcbcTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, 50));

        lcbcDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcbcDate.setText("Date:");
        pCustCheckBal.add(lcbcDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 50));
        pCustCheckBal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 870, 10));

        pcbcInfo.setBackground(new java.awt.Color(204, 204, 255));
        pcbcInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pcbcInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lCustName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCustName.setText("Customer Name:");
        pcbcInfo.add(lCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 40));

        lIDno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lIDno.setText("ID Number:");
        pcbcInfo.add(lIDno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 40));

        lCourseDept.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lCourseDept.setText("Course/Dept.:");
        pcbcInfo.add(lCourseDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 40));

        tfCourseDept.setEditable(false);
        tfCourseDept.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pcbcInfo.add(tfCourseDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 340, 30));

        tfIDno.setEditable(false);
        tfIDno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pcbcInfo.add(tfIDno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 340, 30));

        tfCustName.setEditable(false);
        tfCustName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pcbcInfo.add(tfCustName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 340, 30));

        lBarcode.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lBarcode.setText("Bar Code:");
        pcbcInfo.add(lBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 40));

        tfBarcode.setEditable(false);
        tfBarcode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pcbcInfo.add(tfBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 340, 30));

        pCustCheckBal.add(pcbcInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 460, 370));

        tcbcExpenseList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Expense", "Operator"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tcbcExpenseList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tcbcExpenseList);
        if (tcbcExpenseList.getColumnModel().getColumnCount() > 0) {
            tcbcExpenseList.getColumnModel().getColumn(0).setResizable(false);
            tcbcExpenseList.getColumnModel().getColumn(1).setResizable(false);
            tcbcExpenseList.getColumnModel().getColumn(2).setResizable(false);
        }

        pCustCheckBal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 390, 260));

        lLoadBal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lLoadBal.setText("Load Balance");
        pCustCheckBal.add(lLoadBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, 40));

        tfLoadBal.setEditable(false);
        tfLoadBal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pCustCheckBal.add(tfLoadBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 320, 70));

        getContentPane().add(pCustCheckBal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerBalCheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lBarcode;
    private javax.swing.JLabel lCourseDept;
    private javax.swing.JLabel lCustName;
    private javax.swing.JLabel lIDno;
    private javax.swing.JLabel lLoadBal;
    private javax.swing.JLabel lcbcDate;
    private javax.swing.JLabel lcbcTime;
    private javax.swing.JPanel pCustCheckBal;
    private javax.swing.JPanel pcbcInfo;
    private javax.swing.JTable tcbcExpenseList;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JTextField tfCourseDept;
    private javax.swing.JTextField tfCustName;
    private javax.swing.JTextField tfIDno;
    private javax.swing.JTextField tfLoadBal;
    // End of variables declaration//GEN-END:variables
}
