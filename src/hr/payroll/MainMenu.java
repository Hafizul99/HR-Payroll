
package hr.payroll;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class MainMenu extends javax.swing.JFrame {

    
    public MainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        DateTime();
        lbl_userlog.setText(String.valueOf(Login.logusername).toString());
    }
    
    public  void DateTime(){  
          
        Thread clock = new Thread(){
          public void run(){

                 for(;;){
                     Date d = new Date();
                     SimpleDateFormat dmy = new SimpleDateFormat("dd/MM/yyyy");
                     lbl_date.setText(dmy.format(d));             

                     SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
                     lbl_clock.setText(time.format(d));
                      }              
          }  
        };
        clock.start();
                
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_date = new javax.swing.JLabel();
        lbl_clock = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_overtime = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_salary = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        lbl_userlog = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        backgournd = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_file = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menu_employee = new javax.swing.JMenu();
        employee_master = new javax.swing.JMenuItem();
        menu_reports = new javax.swing.JMenu();
        employee_rpt = new javax.swing.JMenuItem();
        attendance_rpt = new javax.swing.JMenuItem();
        deduction_rpt = new javax.swing.JMenuItem();
        menu_about = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jPanel1.setLayout(null);

        lbl_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(51, 102, 255));
        lbl_date.setText("Date");
        jPanel1.add(lbl_date);
        lbl_date.setBounds(10, 40, 120, 20);

        lbl_clock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_clock.setForeground(new java.awt.Color(51, 102, 255));
        lbl_clock.setText("Time");
        jPanel1.add(lbl_clock);
        lbl_clock.setBounds(10, 10, 120, 30);

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(0, 153, 153));
        btn_add.setText("Employee Master");
        btn_add.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add);
        btn_add.setBounds(140, 310, 140, 50);

        btn_overtime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_overtime.setForeground(new java.awt.Color(0, 153, 153));
        btn_overtime.setText("OverTime");
        btn_overtime.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        btn_overtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_overtimeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_overtime);
        btn_overtime.setBounds(290, 310, 140, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setText("Attendance");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(440, 310, 130, 50);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Deduction");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 380, 140, 50);

        btn_salary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_salary.setForeground(new java.awt.Color(0, 153, 153));
        btn_salary.setText("Salary Increment");
        btn_salary.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        btn_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salaryActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salary);
        btn_salary.setBounds(290, 380, 140, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Payment");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(440, 380, 130, 50);

        lbl_userlog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_userlog.setForeground(new java.awt.Color(0, 204, 204));
        lbl_userlog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_userlog.setText("Log");
        jPanel1.add(lbl_userlog);
        lbl_userlog.setBounds(510, 20, 70, 20);

        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/logout.png"))); // NOI18N
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_logout);
        lbl_logout.setBounds(580, 20, 24, 20);

        backgournd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/back.jpg"))); // NOI18N
        backgournd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jPanel1.add(backgournd);
        backgournd.setBounds(0, 0, 620, 450);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(214, 30));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(214, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(214, 30));

        menu_file.setText("File");
        menu_file.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem5.setText("New user");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_file.add(jMenuItem5);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_file.add(jMenuItem4);

        jMenuBar1.add(menu_file);

        menu_employee.setText("Employee");
        menu_employee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        employee_master.setText("Employee Registration");
        employee_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_masterActionPerformed(evt);
            }
        });
        menu_employee.add(employee_master);

        jMenuBar1.add(menu_employee);

        menu_reports.setText("Reports");
        menu_reports.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        employee_rpt.setText("Employees Report");
        employee_rpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_rptActionPerformed(evt);
            }
        });
        menu_reports.add(employee_rpt);

        attendance_rpt.setText("Attendance Report");
        attendance_rpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendance_rptActionPerformed(evt);
            }
        });
        menu_reports.add(attendance_rpt);

        deduction_rpt.setText("Employee Deduction Report");
        deduction_rpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deduction_rptActionPerformed(evt);
            }
        });
        menu_reports.add(deduction_rpt);

        jMenuBar1.add(menu_reports);

        menu_about.setText("About");
        menu_about.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_aboutActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Version 1.0");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menu_about.add(jMenuItem7);

        jMenuBar1.add(menu_about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deduction_rptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deduction_rptActionPerformed
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File( "Decuction Report"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult == JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
                       
            try{
                
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();
                        
            String sql = "select b.employee_id,concat(b.first_name,(' '||b.last_name)) as employee_name,b.department,b.designation,a.deduction_amount,a.deduction_reason,a.created_by"
                    + " from deductions a,staff_information b"
                    + " where a.employee_id = b.employee_id order by a.employee_id";
            ResultSet rs = st.executeQuery(sql);
            
                                                                
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(7);
            myDocument.open();
            
            float [] columnWidth = new float[] {2,5,4,4,3,5,3};
            table.setWidths(columnWidth);
            table.setWidthPercentage(100);
            
            myDocument.add(new Paragraph("Deduction Report",FontFactory.getFont(FontFactory.TIMES_BOLD,16,Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("----------------------------------------------------------------------"));
            
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Employee Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Designation",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Deduction",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Reason",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Created By",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            
            
            
            while(rs.next()){
                table.addCell(new PdfPCell(new Paragraph(rs.getString("employee_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("employee_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                                
                table.addCell(new PdfPCell(new Paragraph(rs.getString("department"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("designation"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));

                table.addCell(new PdfPCell(new Paragraph(rs.getString("deduction_amount"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("deduction_reason"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("created_by"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                  
            }       
                        
            myDocument.add(table); 
            myDocument.close();
            JOptionPane.showMessageDialog(null, "Report Generate Successful");
             
                
            }catch(Exception e){
                System.out.println(e);
            }

        }
        
    }//GEN-LAST:event_deduction_rptActionPerformed

    private void menu_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_aboutActionPerformed
        
    }//GEN-LAST:event_menu_aboutActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
                EmpReg er = new EmpReg();
                er.setVisible(true);
                setVisible(false);
                dispose();
                
    }//GEN-LAST:event_btn_addActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
           Statement st=con.createStatement();
                      
           String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='"+Login.username+"'";
           ResultSet n = st.executeQuery(type);

           if(n.next()){        
                UserForm us = new UserForm();
                us.setVisible(true);
                setVisible(false);
                dispose();  
            }
        else{
                JOptionPane.showMessageDialog(this, "Please Login as Admin User");
            }
        
        con.close();

    } catch(Exception e)
    {System.out.println(e);
}
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void btn_overtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_overtimeActionPerformed
        
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
           Statement st=con.createStatement();
           
           String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='"+Login.username+"'";
           ResultSet n = st.executeQuery(type);

            if(n.next()){
                OverTime ot = new OverTime();
                ot.setVisible(true);
                setVisible(false);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(this, "Please Login as Admin User");
            }
        
        con.close();

    } catch(Exception e)
    {System.out.println(e);
}
        
    }//GEN-LAST:event_btn_overtimeActionPerformed

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JOptionPane.showMessageDialog(null, " Contact Us \n Nazmul Hasan \n Contact: 01754225854 \n Md. Atiqur Rahaman \n Contact: 01722180687");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void employee_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_masterActionPerformed
                EmpReg em = new EmpReg();
                em.setVisible(true);
                setVisible(false);
                dispose();
               
    }//GEN-LAST:event_employee_masterActionPerformed

    private void btn_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salaryActionPerformed
        
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
           Statement st=con.createStatement();
           
           String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='"+Login.username+"'";
           ResultSet n = st.executeQuery(type);

            if(n.next()){
                IncrementSalary is = new IncrementSalary();
                is.setVisible(true);
                this.dispose(); 
            }
        else{
              JOptionPane.showMessageDialog(this, "Please Login as Admin User");
            }
        
        con.close();

    } catch(Exception e){
        System.out.println(e);
            }    
        
    }//GEN-LAST:event_btn_salaryActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
           Statement st=con.createStatement();
                      
           String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='"+Login.username+"'";
           ResultSet n = st.executeQuery(type);

           if(n.next()){        
                Attendance at = new Attendance();
                at.setVisible(true);
                this.dispose();  
            }
        else{
                JOptionPane.showMessageDialog(this, "Please Login as Admin User");
            }
        
        con.close();

    } catch(Exception e){
        System.out.println(e);
            }
                
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
           Statement st=con.createStatement();
                      
           String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='"+Login.username+"'";
           ResultSet n = st.executeQuery(type);

           if(n.next()){        
                Deductions ds = new Deductions();
                ds.setVisible(true);
                this.dispose();  
            }
        else{
                JOptionPane.showMessageDialog(this, "Please Login as Admin User");
            }
        
        con.close();

    } catch(Exception e){
        System.out.println(e);
            }
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        PaySlip ps = new PaySlip();
        ps.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void employee_rptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_rptActionPerformed
        
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File( "Employee Reports"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult == JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
            
            
            
            try{
                
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();
            
            String sql = "select * from staff_information order by employee_id asc";
            ResultSet rs = st.executeQuery(sql);
            
                                                                
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(11);
            myDocument.open();
            
            float [] columnWidth = new float[] {2,6,6,4,6,6,6,5,5,8,5};
            table.setWidths(columnWidth);
            table.setWidthPercentage(100);
            
            myDocument.add(new Paragraph("Employee Reports",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("-------------------------------------------------------------------------"));
            
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Last Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Birth Date",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Designation",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Contact",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
            
            
            
            while(rs.next()){
                table.addCell(new PdfPCell(new Paragraph(rs.getString("employee_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("first_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("last_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                
                table.addCell(new PdfPCell(new Paragraph(rs.getString("gender"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("date_of_birth"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("department"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("designation"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("gross_salary"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("status"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("email"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("contact"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                
                
            }       
                        
            myDocument.add(table); 
            myDocument.close();
            JOptionPane.showMessageDialog(null, "Report Generate Successful");
             
                
            }catch(Exception e){
                System.out.println(e);
            }

        }
        
    }//GEN-LAST:event_employee_rptActionPerformed

    private void attendance_rptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendance_rptActionPerformed
        

        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File( "Attendance Report"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult == JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
                       
            try{
                
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();
                       
            String sql = "select b.employee_id,concat(b.first_name,(' '||b.last_name)) as employee_name,b.department,b.designation,a.attendance,a.absence,a.leave,a.total_attendance,a.created_by"
                    + " from attendance_tbl a,staff_information b"
                    + " where a.employee_id = b.employee_id order by a.employee_id";
            ResultSet rs = st.executeQuery(sql);        
                                                                
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(9);
            myDocument.open();
            
            float [] columnWidth = new float[] {2,5,4,4,3,3,3,4,3};
            table.setWidths(columnWidth);
            table.setWidthPercentage(100);
            
            myDocument.add(new Paragraph("Attendance Report",FontFactory.getFont(FontFactory.TIMES_BOLD,16,Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("----------------------------------------------------------------------"));
            
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Employee Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            
            table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Designation",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Attendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Absence",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Leave",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Total_attendance",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            table.addCell(new PdfPCell(new Paragraph("Created By",FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
            
            
            
            while(rs.next()){
                table.addCell(new PdfPCell(new Paragraph(rs.getString("employee_id"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("employee_name"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                                
                table.addCell(new PdfPCell(new Paragraph(rs.getString("department"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("designation"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("attendance"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("absence"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("leave"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("total_attendance"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString("created_by"),FontFactory.getFont(FontFactory.TIMES_ROMAN,6,Font.PLAIN))));
                  
            }       
                        
            myDocument.add(table); 
            myDocument.close();
            JOptionPane.showMessageDialog(null, "Report Generate Successful");
             
                
            }catch(Exception e){
                System.out.println(e);
            }

        }
        
        
    }//GEN-LAST:event_attendance_rptActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem attendance_rpt;
    private javax.swing.JLabel backgournd;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_overtime;
    private javax.swing.JButton btn_salary;
    private javax.swing.JMenuItem deduction_rpt;
    private javax.swing.JMenuItem employee_master;
    private javax.swing.JMenuItem employee_rpt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_clock;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_userlog;
    private javax.swing.JMenu menu_about;
    private javax.swing.JMenu menu_employee;
    private javax.swing.JMenu menu_file;
    private javax.swing.JMenu menu_reports;
    // End of variables declaration//GEN-END:variables
}
