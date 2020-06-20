
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
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




public class PaySlip extends javax.swing.JFrame {


    public PaySlip() {
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
        txt_search = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lbl_userlog = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_dep = new javax.swing.JTextField();
        txt_salary = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_title = new javax.swing.JTextField();
        txt_design = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_generate = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        lbl_date = new javax.swing.JMenu();
        lbl_clock = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 85, 520, 30));

        jLabel18.setText("S   E   A   R   C   H      E  M  P  L  O  Y  E  E");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 56, 230, 23));

        lbl_userlog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_userlog.setText("Log");
        jPanel1.add(lbl_userlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 13, 62, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Employee ID :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 133, 90, 30));

        txt_id.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_id.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_id.setOpaque(false);
        txt_id.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 133, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("First Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 173, 90, 30));

        txt_firstname.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_firstname.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_firstname.setOpaque(false);
        txt_firstname.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 173, -1, -1));

        txt_lastname.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_lastname.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_lastname.setOpaque(false);
        txt_lastname.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 213, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Last Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 213, 90, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Department :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 253, 90, 30));

        txt_dep.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_dep.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_dep.setOpaque(false);
        txt_dep.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 253, -1, -1));

        txt_salary.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_salary.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_salary.setOpaque(false);
        txt_salary.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 253, -1, -1));

        txt_status.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_status.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_status.setOpaque(false);
        txt_status.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 213, -1, -1));

        txt_title.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_title.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_title.setOpaque(false);
        txt_title.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 173, -1, -1));

        txt_design.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_design.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_design.setOpaque(false);
        txt_design.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_design, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 133, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Designation :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 133, 80, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Job Title :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 173, 60, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Status :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 213, 60, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gross Salary :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 253, 82, 30));

        btn_generate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_generate.setText("Generate Slip");
        btn_generate.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 104)));
        btn_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 146, 48));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 30));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setText("Home");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("About");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem4.setText("Version 1.0");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        lbl_date.setText("Date");
        lbl_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(lbl_date);

        lbl_clock.setText("Time");
        lbl_clock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.add(lbl_clock);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MainMenu mn = new MainMenu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        JOptionPane.showMessageDialog(null, " Contact Us \n Nazmul Hasan \n Contact: 01754225854 \n Md. Atiqur Rahaman \n Contact: 01722180687");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased

        String id = txt_search.getText();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();

            String sql = "Select * from staff_information where employee_id = '" + id + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                String add1 = rs.getString("employee_id");
                txt_id.setText(add1);

                String add2 = rs.getString("first_name");
                txt_firstname.setText(add2);

                String add3 = rs.getString("last_name");
                txt_lastname.setText(add3);

                String add4 = rs.getString("department");
                txt_dep.setText(add4);

                String add5 = rs.getString("designation");
                txt_design.setText(add5);

                String add6 = rs.getString("gross_salary");
                txt_salary.setText(add6);

                String add7 = rs.getString("job_title");
                txt_title.setText(add7);

                String add8 = rs.getString("status");
                txt_status.setText(add8);

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void btn_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generateActionPerformed
        
        String value1 = txt_id.getText();
        String value2 = txt_firstname.getText();
        String value3 = txt_lastname.getText();
        String value4 = txt_design.getText();
        String value5 = txt_dep.getText();

        float deduction = 0;
        float others = 0;
        float basic = 0;
        float house_rent = 0;
        float allowance = 0;
        float ovrtime = 0;
        
        
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(value2 +" "+value3+" Salary Slip"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if(dialogResult == JFileChooser.APPROVE_OPTION){
            
            String filePath = dialog.getSelectedFile().getPath();
            
            
            try{
                
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();
            
            String sql = "select sum(deduction_amount) as d_amount from deductions where employee_id = '"+ value1 +"'";
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
             deduction = Integer.parseInt(rs.getString("d_amount"));
            }
            
            String stbl = "select * from salary_tbl where employee_id = '"+ value1 +"'";
            ResultSet ts = st.executeQuery(stbl);
            if(ts.next()){
                basic = Integer.parseInt(ts.getString("basic_salary"));
                house_rent = Integer.parseInt(ts.getString("house_rent"));
                allowance = Integer.parseInt(ts.getString("allowance"));
            }
            
            String otbl = "select sum(total_amount) as t_amount from overtime where employee_id = '"+ value1 +"'";
            ResultSet ot = st.executeQuery(otbl);
            
            if(ot.next()){
                ovrtime = Float.parseFloat(ot.getString("t_amount"));
            }

            float total = (basic + house_rent + allowance + ovrtime) - deduction;
            
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(2);
            
            myDocument.open();
            
            float [] columnWidth = new float[] {6,3};
            table.setWidths(columnWidth);
            table.setWidthPercentage(50);
            
            
            myDocument.add(new Paragraph("PAY SLIP",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("-------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.PLAIN)));
            myDocument.add(new Paragraph("Employee Details",FontFactory.getFont(FontFactory.TIMES_ROMAN,15,Font.PLAIN)));
            myDocument.add(new Paragraph("Employee Name : "+value2+" "+value3,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Department    : "+value5,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("Designation   : "+value4,FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN)));
            myDocument.add(new Paragraph("-------------------------------------------------------------------------",FontFactory.getFont(FontFactory.TIMES_ROMAN,20,Font.PLAIN)));
                      
           table.addCell(new PdfPCell(new Paragraph("Basic Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(String.valueOf(basic),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));           
           table.addCell(new PdfPCell(new Paragraph("House Rent",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(String.valueOf(house_rent),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph("Allowance",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(String.valueOf(allowance),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph("Over Time",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(String.valueOf(ovrtime),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph("Deduction",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(String.valueOf(deduction),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
                      
           table.addCell(new PdfPCell(new Paragraph("Total Payment",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));            
           table.addCell(new PdfPCell(new Paragraph(String.valueOf(total),FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.PLAIN))));
           
            
            
            myDocument.add(table);
            myDocument.close();
            JOptionPane.showMessageDialog(null, "Report Generate Successful");
             
                
            }catch(Exception e){
                System.out.println(e);
            }

        }
        
    }//GEN-LAST:event_btn_generateActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaySlip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu lbl_clock;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JLabel lbl_userlog;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_design;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables
}
