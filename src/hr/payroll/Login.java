
package hr.payroll;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Login extends javax.swing.JFrame {


    public static String username = null;
    public static String logusername;

    
    public Login() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        DateTime();
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
        lbl_clock = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passfld = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 153));
        setUndecorated(true);

        jPanel1.setLayout(null);

        lbl_clock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_clock.setForeground(new java.awt.Color(51, 102, 255));
        lbl_clock.setText("Time");
        jPanel1.add(lbl_clock);
        lbl_clock.setBounds(560, 10, 120, 30);

        lbl_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(51, 102, 255));
        lbl_date.setText("Date");
        jPanel1.add(lbl_date);
        lbl_date.setBounds(560, 40, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please Login Your Account");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 230, 290, 26);

        unametxt.setBackground(new java.awt.Color(51, 51, 51));
        unametxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        unametxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(unametxt);
        unametxt.setBounds(160, 270, 150, 30);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/User.png"))); // NOI18N
        jLabel3.setText("Username");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 270, 110, 34);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/Password.png"))); // NOI18N
        jLabel4.setText("Password");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 320, 110, 34);

        passfld.setBackground(new java.awt.Color(51, 51, 51));
        passfld.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passfld.setForeground(new java.awt.Color(255, 255, 255));
        passfld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passfldKeyPressed(evt);
            }
        });
        jPanel1.add(passfld);
        passfld.setBounds(160, 320, 150, 30);

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(102, 0, 0));
        btn_login.setText("LOGIN");
        btn_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_loginKeyPressed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(220, 370, 90, 30);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(14, 220, 310, 190);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/back.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 690, 460);

        jMenuBar1.setMaximumSize(new java.awt.Dimension(95, 30));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(95, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(95, 30));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menu_exit.setText("Exit");
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menu_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setText("Version 1.0");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        String uname = unametxt.getText();
        String pwd = passfld.getText();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
            Statement st = con.createStatement();

            String sql = "select * from user_tbl where user_name = '"+uname+"' and password = '"+pwd+"'";

            ResultSet n = st.executeQuery(sql);
            if(n.next()){
                String name = n.getString(1);
                logusername = name;
                username = uname;
                JOptionPane.showMessageDialog(this, "Welcome to Payroll System");
                MainMenu hf = new MainMenu();
                hf.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong User or Password");
            }

            con.close();

        } catch(Exception e)
        {System.out.println(e);
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_exitActionPerformed

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginKeyPressed
                MainMenu hf = new MainMenu();
                hf.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btn_loginKeyPressed

    private void passfldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passfldKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            String uname = unametxt.getText();
            String pwd = passfld.getText();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","payroll_db","payroll");
            Statement st = con.createStatement();

            String sql = "select * from user_tbl where user_name = '"+uname+"' and password = '"+pwd+"'";

            ResultSet n = st.executeQuery(sql);
            if(n.next()){
                String name = n.getString(1);
                logusername = name;
                username = uname;
                JOptionPane.showMessageDialog(this, "Welcome to Payroll System");
                MainMenu hf = new MainMenu();
                hf.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong User or Password");
            }

            con.close();

        } catch(Exception e)
        {System.out.println(e);
        }
            
        }
    }//GEN-LAST:event_passfldKeyPressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        JOptionPane.showMessageDialog(null, " Contact Us \n Nazmul Hasan \n Contact: 01754225854 \n Md. Atiqur Rahaman \n Contact: 01722180687");
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_clock;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JMenuItem menu_exit;
    private javax.swing.JPasswordField passfld;
    private javax.swing.JTextField unametxt;
    // End of variables declaration//GEN-END:variables
}
