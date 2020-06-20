package hr.payroll;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Attendance extends javax.swing.JFrame {

    
    public Attendance() {
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

        lbl_logout = new javax.swing.JLabel();
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
        txt_leave = new javax.swing.JTextField();
        txt_absence = new javax.swing.JTextField();
        txt_attend = new javax.swing.JTextField();
        txt_design = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_attendance = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        btn_calculate = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        lbl_logout1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        lbl_date = new javax.swing.JMenu();
        lbl_clock = new javax.swing.JMenu();

        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/logout.png"))); // NOI18N
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 85, 520, 30));

        jLabel18.setText("S   E   A   R   C   H      E  M  P  L  O  Y  E  E");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 56, 230, 23));

        lbl_userlog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_userlog.setText("Log");
        jPanel1.add(lbl_userlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 62, -1));

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

        txt_leave.setText("0");
        txt_leave.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_leave.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_leave.setOpaque(false);
        txt_leave.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 253, -1, -1));

        txt_absence.setText("0");
        txt_absence.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_absence.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_absence.setOpaque(false);
        txt_absence.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_absence, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 213, -1, -1));

        txt_attend.setText("0");
        txt_attend.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_attend.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_attend.setOpaque(false);
        txt_attend.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_attend, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 173, -1, -1));

        txt_design.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_design.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_design.setOpaque(false);
        txt_design.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel1.add(txt_design, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 133, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Designation :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 133, 80, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Attend :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 173, 80, 30));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Absence :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 213, 70, 30));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Leave :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 253, 82, 30));

        lbl_attendance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_attendance.setText("Total Attendance :");
        jPanel1.add(lbl_attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 130, -1));

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_total.setText("0");
        jPanel1.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 60, -1));

        btn_calculate.setText("Calculate");
        btn_calculate.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 80, 30));

        btn_save.setText("Save");
        btn_save.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 255), new java.awt.Color(0, 0, 204)));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 80, 30));

        lbl_logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/logout.png"))); // NOI18N
        lbl_logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logout1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
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
                txt_id.setEditable(false);

                String add2 = rs.getString("first_name");
                txt_firstname.setText(add2);
                txt_firstname.setEditable(false);

                String add3 = rs.getString("last_name");
                txt_lastname.setText(add3);
                txt_lastname.setEditable(false);

                String add4 = rs.getString("department");
                txt_dep.setText(add4);
                txt_dep.setEditable(false);

                String add5 = rs.getString("designation");
                txt_design.setText(add5);
                txt_design.setEditable(false);

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lastnameActionPerformed

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed

        try{
        int attend = Integer.parseInt(txt_attend.getText());
        int absence = Integer.parseInt(txt_absence.getText());
        int leave = Integer.parseInt(txt_leave.getText());
           

        int calc = (attend + leave) - absence;
        String c = String.valueOf(calc);
        lbl_total.setText(c);
        
        }
        catch(Exception e){
            System.out.println(e);
        }


    }//GEN-LAST:event_btn_calculateActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        String val = Login.logusername;
        String id = txt_id.getText();
        String att = txt_attend.getText();
        String abs = txt_absence.getText();
        String lv = txt_leave.getText();
        String total_att = lbl_total.getText();
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();
            
            String sql = "insert into attendance_tbl(employee_id,attendance,absence,leave,total_attendance,created_by) values ('" + id +"','" + att +"','" + abs +"','" + lv +"','" + total_att +"','" + val + "')";
            
            int x = JOptionPane.showConfirmDialog(this, "Confirm Record","Add Record",JOptionPane.YES_NO_OPTION);
            if(x==0){
            int n = st.executeUpdate(sql);
            if (n == 1) {
                JOptionPane.showMessageDialog(this, "Record inserted");
                txt_search.setText("");
                txt_id.setText("");
                txt_firstname.setText("");
                txt_lastname.setText("");
                txt_dep.setText("");
                txt_design.setText("");
                txt_attend.setText("");
                txt_absence.setText("");
                txt_leave.setText("");
                lbl_total.setText("");

            } 
            }else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }
            
            con.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        
    }//GEN-LAST:event_txt_searchKeyPressed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        
    }//GEN-LAST:event_txt_searchKeyTyped

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_logoutMouseClicked

    private void lbl_logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logout1MouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_logout1MouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_save;
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
    private javax.swing.JLabel lbl_attendance;
    private javax.swing.JMenu lbl_clock;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_logout1;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_userlog;
    private javax.swing.JTextField txt_absence;
    private javax.swing.JTextField txt_attend;
    private javax.swing.JTextField txt_dep;
    private javax.swing.JTextField txt_design;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_leave;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void java_db() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
