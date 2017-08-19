
public class Admin extends javax.swing.JFrame {

    
    public Admin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAdmin = new javax.swing.JPanel();
        tbAdmin = new javax.swing.JTabbedPane();
        paEmployee = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        etfSearch = new javax.swing.JTextField();
        elSearch = new javax.swing.JLabel();
        paeEmployee = new javax.swing.JPanel();
        leGender = new javax.swing.JLabel();
        tfeYear = new javax.swing.JTextField();
        lePassword = new javax.swing.JLabel();
        tfeUsername = new javax.swing.JTextField();
        tfeFirst = new javax.swing.JTextField();
        leUsername = new javax.swing.JLabel();
        tfePassword = new javax.swing.JPasswordField();
        leName = new javax.swing.JLabel();
        cbeDepartment = new javax.swing.JComboBox<>();
        leConfirmPass = new javax.swing.JLabel();
        tfeConfirmPass = new javax.swing.JPasswordField();
        leBday = new javax.swing.JLabel();
        cbeMonth = new javax.swing.JComboBox<>();
        tfeLast = new javax.swing.JTextField();
        tfeDay = new javax.swing.JTextField();
        leContact = new javax.swing.JLabel();
        tfeContact = new javax.swing.JTextField();
        leDepartment = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        beSave = new javax.swing.JButton();
        beAdd = new javax.swing.JButton();
        beEdit = new javax.swing.JButton();
        beDelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        paCustomer = new javax.swing.JPanel();
        lcSearch = new javax.swing.JLabel();
        tfcSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        pacCustomer = new javax.swing.JPanel();
        lcName = new javax.swing.JLabel();
        lcIdNo = new javax.swing.JLabel();
        lcDept = new javax.swing.JLabel();
        tfcName = new javax.swing.JTextField();
        tfcIdNo = new javax.swing.JTextField();
        tfcDept = new javax.swing.JTextField();
        lcBarCode = new javax.swing.JLabel();
        lcLoad = new javax.swing.JLabel();
        tfcBarCode = new javax.swing.JTextField();
        tfcLoad = new javax.swing.JTextField();
        bcEdit = new javax.swing.JButton();
        bcDelete = new javax.swing.JButton();
        bcPrintList = new javax.swing.JButton();
        bcRePrint = new javax.swing.JButton();
        paHistory = new javax.swing.JPanel();
        htfSearch = new javax.swing.JTextField();
        hlSearch = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        bhPrintList = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lDate = new javax.swing.JLabel();
        lLogOut = new javax.swing.JLabel();
        lAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pAdmin.setBackground(new java.awt.Color(204, 204, 255));
        pAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N

        paEmployee.setBackground(new java.awt.Color(204, 204, 255));
        paEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        paEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "First Name", "Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(0).setResizable(false);
            tblEmployee.getColumnModel().getColumn(1).setResizable(false);
        }

        paEmployee.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 400));

        etfSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paEmployee.add(etfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 300, 30));

        elSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        elSearch.setText("Search: ");
        paEmployee.add(elSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        paeEmployee.setBackground(new java.awt.Color(204, 204, 255));
        paeEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        paeEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leGender.setText("Gender");
        paeEmployee.add(leGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 30));

        tfeYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfeYear.setText("Year");
        tfeYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeYearActionPerformed(evt);
            }
        });
        paeEmployee.add(tfeYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 50, 30));

        lePassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lePassword.setText("Password");
        paeEmployee.add(lePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        tfeUsername.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfeUsername.setText("NEU");
        tfeUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeUsernameActionPerformed(evt);
            }
        });
        paeEmployee.add(tfeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 30));

        tfeFirst.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfeFirst.setText("First");
        tfeFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeFirstActionPerformed(evt);
            }
        });
        paeEmployee.add(tfeFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 230, 30));

        leUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leUsername.setText("Username");
        paeEmployee.add(leUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        tfePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paeEmployee.add(tfePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 300, 30));

        leName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leName.setText("Name");
        paeEmployee.add(leName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        cbeDepartment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbeDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Canteen", "Bus", "Admin" }));
        cbeDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeDepartmentActionPerformed(evt);
            }
        });
        paeEmployee.add(cbeDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 230, 30));

        leConfirmPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leConfirmPass.setText("Confirm Password");
        paeEmployee.add(leConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        tfeConfirmPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        paeEmployee.add(tfeConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 300, 30));

        leBday.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leBday.setText("Birthday");
        paeEmployee.add(leBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 30));

        cbeMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbeMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cbeMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeMonthActionPerformed(evt);
            }
        });
        paeEmployee.add(cbeMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 30));

        tfeLast.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfeLast.setText("Last");
        tfeLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeLastActionPerformed(evt);
            }
        });
        paeEmployee.add(tfeLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 230, 30));

        tfeDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfeDay.setText("Day");
        tfeDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeDayActionPerformed(evt);
            }
        });
        paeEmployee.add(tfeDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, 30));

        leContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leContact.setText("Contact No.");
        paeEmployee.add(leContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, 30));

        tfeContact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfeContact.setText("09");
        tfeContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfeContactActionPerformed(evt);
            }
        });
        paeEmployee.add(tfeContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 230, 30));

        leDepartment.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        leDepartment.setText("Department");
        paeEmployee.add(leDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female", " " }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        paeEmployee.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, 30));

        beSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        beSave.setText("Save");
        paeEmployee.add(beSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 90, 30));

        beAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        beAdd.setText("Add");
        paeEmployee.add(beAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 70, 30));

        beEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        beEdit.setText("Edit");
        paeEmployee.add(beEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 70, 30));

        beDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        beDelete.setText("Delete");
        paeEmployee.add(beDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 90, 30));
        paeEmployee.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 500, -1));

        paEmployee.add(paeEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 520, 460));

        tbAdmin.addTab("Employee", paEmployee);

        paCustomer.setBackground(new java.awt.Color(204, 204, 255));
        paCustomer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        paCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lcSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lcSearch.setText("Search: ");
        paCustomer.add(lcSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        tfcSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paCustomer.add(tfcSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 270, 30));

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID No.", "Department", "BarCode", "Load"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCustomer.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblCustomer);
        if (tblCustomer.getColumnModel().getColumnCount() > 0) {
            tblCustomer.getColumnModel().getColumn(0).setResizable(false);
            tblCustomer.getColumnModel().getColumn(1).setResizable(false);
            tblCustomer.getColumnModel().getColumn(2).setResizable(false);
            tblCustomer.getColumnModel().getColumn(3).setResizable(false);
            tblCustomer.getColumnModel().getColumn(4).setResizable(false);
        }

        paCustomer.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 880, 190));

        pacCustomer.setBackground(new java.awt.Color(204, 204, 255));
        pacCustomer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        pacCustomer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lcName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcName.setText("Name:");
        pacCustomer.add(lcName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        lcIdNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcIdNo.setText("ID No.:");
        pacCustomer.add(lcIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        lcDept.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcDept.setText("Department:");
        pacCustomer.add(lcDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        tfcName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcNameActionPerformed(evt);
            }
        });
        pacCustomer.add(tfcName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 300, 30));

        tfcIdNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcIdNoActionPerformed(evt);
            }
        });
        pacCustomer.add(tfcIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 300, 30));

        tfcDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcDeptActionPerformed(evt);
            }
        });
        pacCustomer.add(tfcDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 300, 30));

        lcBarCode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcBarCode.setText("BarCode:");
        pacCustomer.add(lcBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 20));

        lcLoad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcLoad.setText("Load:");
        pacCustomer.add(lcLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, 20));

        tfcBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcBarCodeActionPerformed(evt);
            }
        });
        pacCustomer.add(tfcBarCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 220, 30));

        tfcLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcLoadActionPerformed(evt);
            }
        });
        pacCustomer.add(tfcLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 220, 30));

        bcEdit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bcEdit.setText("Edit");
        bcEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcEditActionPerformed(evt);
            }
        });
        pacCustomer.add(bcEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, 40));

        bcDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bcDelete.setText("Delete");
        pacCustomer.add(bcDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, 40));

        bcPrintList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bcPrintList.setText("Print List");
        pacCustomer.add(bcPrintList, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, 40));

        bcRePrint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bcRePrint.setText("Re-Print");
        pacCustomer.add(bcRePrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        paCustomer.add(pacCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 880, 190));

        tbAdmin.addTab("Customer", paCustomer);

        paHistory.setBackground(new java.awt.Color(204, 204, 255));
        paHistory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        paHistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        htfSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        paHistory.add(htfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 270, 30));

        hlSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        hlSearch.setText("Search: ");
        paHistory.add(hlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Transaction", "Date/Time", "BarCode", "Customer Name", "Expenses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHistory.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblHistory);
        if (tblHistory.getColumnModel().getColumnCount() > 0) {
            tblHistory.getColumnModel().getColumn(0).setResizable(false);
            tblHistory.getColumnModel().getColumn(1).setResizable(false);
            tblHistory.getColumnModel().getColumn(2).setResizable(false);
            tblHistory.getColumnModel().getColumn(3).setResizable(false);
            tblHistory.getColumnModel().getColumn(4).setResizable(false);
        }

        paHistory.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 900, 330));

        bhPrintList.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bhPrintList.setText("Print List");
        bhPrintList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhPrintListActionPerformed(evt);
            }
        });
        paHistory.add(bhPrintList, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, -1, 40));

        tbAdmin.addTab("History", paHistory);

        pAdmin.add(tbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 970, 540));
        pAdmin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 990, 10));

        lDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lDate.setText("Date:");
        pAdmin.add(lDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 40));

        lLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lLogOut.setText("Log Out ");
        lLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lLogOutMouseClicked(evt);
            }
        });
        pAdmin.add(lLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 30));

        lAdmin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lAdmin.setText("Admin:");
        pAdmin.add(lAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        getContentPane().add(pAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lLogOutMouseClicked
       
        LogIn lgn = new LogIn();
        lgn.setVisible(true);
        dispose();
    }//GEN-LAST:event_lLogOutMouseClicked

    private void bcEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcEditActionPerformed
      
    }//GEN-LAST:event_bcEditActionPerformed

    private void tfcLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcLoadActionPerformed
   
    }//GEN-LAST:event_tfcLoadActionPerformed

    private void tfcBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcBarCodeActionPerformed
       
    }//GEN-LAST:event_tfcBarCodeActionPerformed

    private void tfcDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcDeptActionPerformed
        
    }//GEN-LAST:event_tfcDeptActionPerformed

    private void tfcIdNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcIdNoActionPerformed
       
    }//GEN-LAST:event_tfcIdNoActionPerformed

    private void tfcNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcNameActionPerformed
  
    }//GEN-LAST:event_tfcNameActionPerformed

    private void tfeUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeUsernameActionPerformed
      
    }//GEN-LAST:event_tfeUsernameActionPerformed

    private void tfeFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeFirstActionPerformed
     
    }//GEN-LAST:event_tfeFirstActionPerformed

    private void tfeYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeYearActionPerformed
     
    }//GEN-LAST:event_tfeYearActionPerformed

    private void cbeDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeDepartmentActionPerformed
        
    }//GEN-LAST:event_cbeDepartmentActionPerformed

    private void cbeMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeMonthActionPerformed
    
    }//GEN-LAST:event_cbeMonthActionPerformed

    private void tfeLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeLastActionPerformed
        
    }//GEN-LAST:event_tfeLastActionPerformed

    private void tfeDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeDayActionPerformed
       
    }//GEN-LAST:event_tfeDayActionPerformed

    private void tfeContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfeContactActionPerformed
        
    }//GEN-LAST:event_tfeContactActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
     
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void bhPrintListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhPrintListActionPerformed
  
    }//GEN-LAST:event_bhPrintListActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcDelete;
    private javax.swing.JButton bcEdit;
    private javax.swing.JButton bcPrintList;
    private javax.swing.JButton bcRePrint;
    private javax.swing.JButton beAdd;
    private javax.swing.JButton beDelete;
    private javax.swing.JButton beEdit;
    private javax.swing.JButton beSave;
    private javax.swing.JButton bhPrintList;
    private javax.swing.JComboBox<String> cbeDepartment;
    private javax.swing.JComboBox<String> cbeMonth;
    private javax.swing.JLabel elSearch;
    private javax.swing.JTextField etfSearch;
    private javax.swing.JLabel hlSearch;
    private javax.swing.JTextField htfSearch;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lAdmin;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lLogOut;
    private javax.swing.JLabel lcBarCode;
    private javax.swing.JLabel lcDept;
    private javax.swing.JLabel lcIdNo;
    private javax.swing.JLabel lcLoad;
    private javax.swing.JLabel lcName;
    private javax.swing.JLabel lcSearch;
    private javax.swing.JLabel leBday;
    private javax.swing.JLabel leConfirmPass;
    private javax.swing.JLabel leContact;
    private javax.swing.JLabel leDepartment;
    private javax.swing.JLabel leGender;
    private javax.swing.JLabel leName;
    private javax.swing.JLabel lePassword;
    private javax.swing.JLabel leUsername;
    private javax.swing.JPanel pAdmin;
    private javax.swing.JPanel paCustomer;
    private javax.swing.JPanel paEmployee;
    private javax.swing.JPanel paHistory;
    private javax.swing.JPanel pacCustomer;
    private javax.swing.JPanel paeEmployee;
    private javax.swing.JTabbedPane tbAdmin;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTextField tfcBarCode;
    private javax.swing.JTextField tfcDept;
    private javax.swing.JTextField tfcIdNo;
    private javax.swing.JTextField tfcLoad;
    private javax.swing.JTextField tfcName;
    private javax.swing.JTextField tfcSearch;
    private javax.swing.JPasswordField tfeConfirmPass;
    private javax.swing.JTextField tfeContact;
    private javax.swing.JTextField tfeDay;
    private javax.swing.JTextField tfeFirst;
    private javax.swing.JTextField tfeLast;
    private javax.swing.JPasswordField tfePassword;
    private javax.swing.JTextField tfeUsername;
    private javax.swing.JTextField tfeYear;
    // End of variables declaration//GEN-END:variables
}
