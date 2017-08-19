
public class LogIn extends javax.swing.JFrame {

   
    public LogIn() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pLogIn = new javax.swing.JPanel();
        pAdmin = new javax.swing.JTabbedPane();
        pCashier = new javax.swing.JPanel();
        clSignup = new javax.swing.JLabel();
        cpfPassword = new javax.swing.JPasswordField();
        ctfUsername = new javax.swing.JTextField();
        cbLogIn = new javax.swing.JButton();
        clUsername = new javax.swing.JLabel();
        clPassword = new javax.swing.JLabel();
        pBus = new javax.swing.JPanel();
        blUsername = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        bbLogin = new javax.swing.JButton();
        blSignup = new javax.swing.JLabel();
        pCanteen = new javax.swing.JPanel();
        ctlUsername = new javax.swing.JLabel();
        ctlPassword = new javax.swing.JLabel();
        cttfUsername = new javax.swing.JTextField();
        ctpfPassword = new javax.swing.JPasswordField();
        ctbLogIn = new javax.swing.JButton();
        ctlSignup = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        alUsername = new javax.swing.JLabel();
        alPassword = new javax.swing.JLabel();
        atfUsername = new javax.swing.JTextField();
        apfPassword = new javax.swing.JPasswordField();
        abLogIn = new javax.swing.JButton();
        alSignup = new javax.swing.JLabel();
        lTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pLogIn.setBackground(new java.awt.Color(204, 204, 255));
        pLogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAdmin.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        pAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N

        pCashier.setBackground(new java.awt.Color(204, 204, 255));
        pCashier.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pCashier.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clSignup.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clSignup.setForeground(new java.awt.Color(0, 0, 255));
        clSignup.setText("New User? Pls. see Admin to create account");
        pCashier.add(clSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        cpfPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pCashier.add(cpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, 30));

        ctfUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pCashier.add(ctfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 30));

        cbLogIn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbLogIn.setText("Log In");
        cbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLogInActionPerformed(evt);
            }
        });
        pCashier.add(cbLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 30));

        clUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clUsername.setText("Username:");
        pCashier.add(clUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 30));

        clPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clPassword.setText("Password:");
        pCashier.add(clPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, 30));

        pAdmin.addTab("Cashier", pCashier);

        pBus.setBackground(new java.awt.Color(204, 204, 255));
        pBus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pBus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        blUsername.setText("Username:");
        pBus.add(blUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Password:");
        pBus.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, 30));

        jTextField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBus.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 30));

        jPasswordField2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pBus.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, 30));

        bbLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bbLogin.setText("Log In");
        bbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbLoginActionPerformed(evt);
            }
        });
        pBus.add(bbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 30));

        blSignup.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        blSignup.setForeground(new java.awt.Color(0, 0, 255));
        blSignup.setText("New User? Pls. see Admin to create account");
        pBus.add(blSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        pAdmin.addTab("Bus", pBus);

        pCanteen.setBackground(new java.awt.Color(204, 204, 255));
        pCanteen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        pCanteen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ctlUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ctlUsername.setText("Username:");
        pCanteen.add(ctlUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 30));

        ctlPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ctlPassword.setText("Password:");
        pCanteen.add(ctlPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, 30));

        cttfUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pCanteen.add(cttfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 30));

        ctpfPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pCanteen.add(ctpfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, 30));

        ctbLogIn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ctbLogIn.setText("Log In");
        ctbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctbLogInActionPerformed(evt);
            }
        });
        pCanteen.add(ctbLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 30));

        ctlSignup.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ctlSignup.setForeground(new java.awt.Color(0, 0, 255));
        ctlSignup.setText("New User? Pls. see Admin to create account");
        pCanteen.add(ctlSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        pAdmin.addTab("Canteen", pCanteen);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alUsername.setText("Username:");
        jPanel2.add(alUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, 30));

        alPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alPassword.setText("Password:");
        jPanel2.add(alPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, 30));

        atfUsername.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(atfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 30));

        apfPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(apfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, 30));

        abLogIn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        abLogIn.setText("Log In");
        abLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abLogInActionPerformed(evt);
            }
        });
        jPanel2.add(abLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 110, 30));

        alSignup.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        alSignup.setForeground(new java.awt.Color(0, 0, 255));
        alSignup.setText("Sign Up!");
        jPanel2.add(alSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        pAdmin.addTab("Admin", jPanel2);

        pLogIn.add(pAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 810, 380));

        lTitle.setBackground(new java.awt.Color(255, 255, 255));
        lTitle.setFont(new java.awt.Font("Bauhaus 93", 0, 70)); // NOI18N
        lTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitle.setText("Easy-Pay");
        pLogIn.add(lTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 300, 80));

        getContentPane().add(pLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLogInActionPerformed
       
        
        Cashier2 cshr = new Cashier2();
        cshr.setVisible(true);
        dispose();
    }//GEN-LAST:event_cbLogInActionPerformed

    private void bbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbLoginActionPerformed
       
        
        Bus bs = new Bus();
        bs.setVisible(true);
        dispose();
    }//GEN-LAST:event_bbLoginActionPerformed

    private void ctbLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctbLogInActionPerformed
       
        Canteen cntn = new Canteen();
        cntn.setVisible(true);
        dispose();
    }//GEN-LAST:event_ctbLogInActionPerformed

    private void abLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abLogInActionPerformed
       
        Admin admn = new Admin();
        admn.setVisible(true);
        dispose();
    }//GEN-LAST:event_abLogInActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abLogIn;
    private javax.swing.JLabel alPassword;
    private javax.swing.JLabel alSignup;
    private javax.swing.JLabel alUsername;
    private javax.swing.JPasswordField apfPassword;
    private javax.swing.JTextField atfUsername;
    private javax.swing.JButton bbLogin;
    private javax.swing.JLabel blSignup;
    private javax.swing.JLabel blUsername;
    private javax.swing.JButton cbLogIn;
    private javax.swing.JLabel clPassword;
    private javax.swing.JLabel clSignup;
    private javax.swing.JLabel clUsername;
    private javax.swing.JPasswordField cpfPassword;
    private javax.swing.JButton ctbLogIn;
    private javax.swing.JTextField ctfUsername;
    private javax.swing.JLabel ctlPassword;
    private javax.swing.JLabel ctlSignup;
    private javax.swing.JLabel ctlUsername;
    private javax.swing.JPasswordField ctpfPassword;
    private javax.swing.JTextField cttfUsername;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lTitle;
    private javax.swing.JTabbedPane pAdmin;
    private javax.swing.JPanel pBus;
    private javax.swing.JPanel pCanteen;
    private javax.swing.JPanel pCashier;
    private javax.swing.JPanel pLogIn;
    // End of variables declaration//GEN-END:variables
}
