package hr.payroll;

import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.Thread.sleep;
import java.nio.ByteBuffer;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;

public class EmpReg extends javax.swing.JFrame {

    private ImageIcon formate = null;
    String filename = null;
    byte[] person_image = null;
    private String gender;

    public EmpReg() {
        initComponents();
        this.setLocationRelativeTo(null);
        DateTime();
        lbl_userlog.setText(String.valueOf(Login.logusername).toString());
    }

    public void DateTime() {

        Thread clock = new Thread() {
            public void run() {

                for (;;) {
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
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        txt_pc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_attach = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_add2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_hn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_design = new javax.swing.JTextField();
        r_female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_add = new javax.swing.JTextField();
        txt_title = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        r_male = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_addrecord = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lbl_image = new javax.swing.JLabel();
        txt_dob = new com.toedter.calendar.JDateChooser();
        txt_doj = new com.toedter.calendar.JDateChooser();
        lbl_userlog = new javax.swing.JLabel();
        combo_status = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl_logout = new javax.swing.JLabel();
        combo_dep = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        lbl_date = new javax.swing.JMenu();
        lbl_clock = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Employee ID :");

        txt_id.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_id.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_id.setOpaque(false);
        txt_id.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("First Name :");

        txt_firstname.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_firstname.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_firstname.setOpaque(false);
        txt_firstname.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Last Name :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Email :");

        txt_lastname.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_lastname.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_lastname.setOpaque(false);
        txt_lastname.setPreferredSize(new java.awt.Dimension(150, 30));

        txt_pc.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_pc.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_pc.setOpaque(false);
        txt_pc.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Date of Birth :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gross Salary :");

        btn_attach.setText("Attach");
        btn_attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attachActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Status :");

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Permanent Address :");

        txt_add2.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_add2.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_add2.setOpaque(false);
        txt_add2.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Joining Date :");

        txt_hn.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_hn.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_hn.setOpaque(false);
        txt_hn.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Job Title :");

        txt_design.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_design.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_design.setOpaque(false);
        txt_design.setPreferredSize(new java.awt.Dimension(150, 30));

        r_female.setText("Female");
        r_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_femaleActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Present Address :");

        txt_add.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_add.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_add.setOpaque(false);
        txt_add.setPreferredSize(new java.awt.Dimension(150, 30));

        txt_title.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_title.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_title.setOpaque(false);
        txt_title.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Contact :");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Department :");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("House No :");

        txt_salary.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_salary.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_salary.setOpaque(false);
        txt_salary.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Designation :");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Post Code :");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Gender :");

        txt_email.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_email.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_email.setOpaque(false);
        txt_email.setPreferredSize(new java.awt.Dimension(150, 30));
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_contact.setMaximumSize(new java.awt.Dimension(150, 30));
        txt_contact.setMinimumSize(new java.awt.Dimension(150, 30));
        txt_contact.setOpaque(false);
        txt_contact.setPreferredSize(new java.awt.Dimension(150, 30));

        r_male.setText("Male");
        r_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_maleActionPerformed(evt);
            }
        });

        jLabel18.setText("S   E   A   R   C   H      E  M  P  L  O  Y  E  E");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        btn_addrecord.setText("Add Record");
        btn_addrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addrecordActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(lbl_image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_doj.setPreferredSize(new java.awt.Dimension(91, 30));

        lbl_userlog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_userlog.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_userlog.setText("Log");

        combo_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Resigned" }));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/fill.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/fill.png"))); // NOI18N

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/fill.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/fill.png"))); // NOI18N

        lbl_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hr/payroll/Icon/logout.png"))); // NOI18N
        lbl_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoutMouseClicked(evt);
            }
        });

        combo_dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administration", "Accounts", "IT", "Store", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23))
                            .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(r_male)
                                .addGap(44, 44, 44)
                                .addComponent(r_female))
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(txt_hn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(txt_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(combo_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btn_addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_doj, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_attach, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_userlog, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_logout)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_userlog))
                    .addComponent(lbl_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_attach, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r_male)
                                    .addComponent(r_female))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_hn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_design, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_doj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_salary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(combo_status)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_addrecord, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void r_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_maleActionPerformed

        gender = "Male";
        r_male.setSelected(true);
        r_female.setSelected(false);
    }//GEN-LAST:event_r_maleActionPerformed

    private void r_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_femaleActionPerformed

        gender = "Female";
        r_female.setSelected(true);
        r_male.setSelected(false);
    }//GEN-LAST:event_r_femaleActionPerformed

    private void btn_attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attachActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_DEFAULT));
        lbl_image.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int number; (number = fix.read(buf)) != -1;) {
                bos.write(buf, 0, number);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btn_attachActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        MainMenu mn = new MainMenu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_addrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addrecordActionPerformed

        int sal = Integer.parseInt(txt_salary.getText());
        int basic = (sal * 60) / 100;
        int house_rent = (sal * 20) / 100;
        int allowance = (sal * 20) / 100;
        int gross_salary = basic + house_rent + allowance;

        String log = Login.logusername;
        String id = txt_id.getText();
        String fname = txt_firstname.getText();
        String lname = txt_lastname.getText();
        String gen = gender;

        Date birth = txt_dob.getDate();
        SimpleDateFormat bd = new SimpleDateFormat("dd-MM-YYYY");
        String dob = bd.format(birth);
        Date joining = txt_doj.getDate();
        SimpleDateFormat jd = new SimpleDateFormat("dd-MM-YYYY");
        String doj = jd.format(joining);

        String email = txt_email.getText();
        String contact = txt_contact.getText();
        String add = txt_add.getText();
        String add2 = txt_add2.getText();
        String hn = txt_hn.getText();
        String pc = txt_pc.getText();
        String dep = combo_dep.getSelectedItem().toString();
        String design = txt_design.getText();
        String salary = txt_salary.getText();
        String title = txt_title.getText();
        String status = combo_status.getSelectedItem().toString();
        FileInputStream fin = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();

            String salaryTable = "insert into salary_tbl (employee_id,basic_salary,house_rent,allowance,gross_salary) values ('" + id + "','" + basic + "','" + house_rent + "','" + allowance + "','" + gross_salary + "')";

            PreparedStatement ps = con.prepareStatement("insert into staff_information (employee_id,first_name,last_name,gender,email,contact,present_address,permanent_address,house_no,post_code,department,designation,gross_salary,job_title,status,date_of_birth,joining_date,created_by,picture) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, fname);
            ps.setString(3, lname);
            ps.setString(4, gen);
            ps.setString(5, email);
            ps.setString(6, contact);
            ps.setString(7, add);
            ps.setString(8, add2);
            ps.setString(9, hn);
            ps.setString(10, pc);
            ps.setString(11, dep);
            ps.setString(12, design);
            ps.setString(13, salary);
            ps.setString(14, title);
            ps.setString(15, status);
            ps.setString(16, dob);
            ps.setString(17, doj);
            ps.setString(18, log);

            if (fin == null) {
                ps.setBlob(19, (Blob) null);
            } else {
                fin = new FileInputStream(filename);
                ps.setBinaryStream(19, fin, fin.available());
            }

            int x = JOptionPane.showConfirmDialog(this, "Confirm Record", "Add Record", JOptionPane.YES_NO_OPTION);
            if (x == 0) {

                st.executeUpdate(salaryTable);
                int i = ps.executeUpdate();
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Record inserted");
                    txt_search.setText("");
                    txt_id.setText("");
                    txt_firstname.setText("");
                    txt_lastname.setText("");
                    r_male.setSelected(false);
                    r_female.setSelected(false);
                    txt_email.setText("");
                    txt_contact.setText("");
                    txt_add.setText("");
                    txt_add2.setText("");
                    txt_hn.setText("");
                    txt_pc.setText("");
                    combo_dep.setSelectedIndex(0);
                    txt_design.setText("");
                    txt_salary.setText("");
                    txt_title.setText("");
                    combo_status.setSelectedIndex(0);
                    txt_dob.setCalendar(null);
                    txt_doj.setCalendar(null);
                    lbl_image.setIcon(null);

                }
            } else {
                JOptionPane.showMessageDialog(this, "Record not inserted");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);

        }

    }//GEN-LAST:event_btn_addrecordActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        txt_search.setText("");
        txt_id.setText("");
        txt_firstname.setText("");
        txt_lastname.setText("");
        r_male.setSelected(false);
        r_female.setSelected(false);
        txt_dob.setCalendar(null);
        txt_doj.setCalendar(null);
        txt_email.setText("");
        txt_contact.setText("");
        txt_add.setText("");
        txt_add2.setText("");
        txt_hn.setText("");
        txt_pc.setText("");
        combo_dep.setSelectedIndex(0);
        txt_design.setText("");
        txt_salary.setText("");
        txt_title.setText("");
        combo_status.setSelectedIndex(0);
        lbl_image.setIcon(null);
        // txt_lbl_image.setText(" ");

    }//GEN-LAST:event_btn_clearActionPerformed

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

                String add4 = rs.getString("email");
                txt_email.setText(add4);

                String add5 = rs.getString("contact");
                txt_contact.setText(add5);

                String add6 = rs.getString("present_address");
                txt_add.setText(add6);

                String add7 = rs.getString("permanent_address");
                txt_add2.setText(add7);

                String add8 = rs.getString("house_no");
                txt_hn.setText(add8);

                String add9 = rs.getString("post_code");
                txt_pc.setText(add9);

                String add10 = rs.getString("department");
                combo_dep.setSelectedItem(add10);

                String add11 = rs.getString("designation");
                txt_design.setText(add11);

                String add12 = rs.getString("gross_salary");
                txt_salary.setText(add12);

                String add13 = rs.getString("job_title");
                txt_title.setText(add13);

                String add14 = rs.getString("status");
                combo_status.setSelectedItem(add14);

                String add15 = rs.getString("gender");
                if (add15.equals("Male")) {
                    r_female.setSelected(false);
                    r_male.setSelected(true);
                } else {
                    r_male.setSelected(false);
                    r_female.setSelected(true);
                }

                String add16 = rs.getString("date_of_birth");
                java.util.Date bd = new SimpleDateFormat("dd-MM-yyyy").parse(add16);
                txt_dob.setDate(bd);

                String add17 = rs.getString("joining_date");
                java.util.Date jd = new SimpleDateFormat("dd-MM-yyyy").parse(add17);
                txt_doj.setDate(jd);

                Blob b = rs.getBlob("picture");
                if (rs.wasNull()) {
                    lbl_image.setIcon(null);
                } else {

                    byte barr[] = b.getBytes(1, (int) b.length());
                    Image img = ImageIO.read(new ByteArrayInputStream(barr));
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_DEFAULT));
                    lbl_image.setIcon(imageIcon);

                }

            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_txt_searchKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        String id = txt_id.getText();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
            Statement st = con.createStatement();

            String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='" + Login.username + "'";
            ResultSet p = st.executeQuery(type);
            if (p.next()) {

                String sql = "delete from staff_information where employee_id = '" + id + "'";

                String salaryTable = "delete from salary_tbl where employee_id = '" + id + "'";

                int x = JOptionPane.showConfirmDialog(null, "Are You Sure Delete This", "Delete Record", JOptionPane.YES_NO_OPTION);
                if (x == 0) {
                    st.executeUpdate(salaryTable);
                    int n = st.executeUpdate(sql);

                    if (n == 1) {
                        JOptionPane.showMessageDialog(this, "Record Deleted");

                        txt_search.setText("");
                        txt_id.setText("");
                        txt_firstname.setText("");
                        txt_lastname.setText("");
                        r_male.setSelected(false);
                        r_female.setSelected(false);
                        txt_email.setText("");
                        txt_contact.setText("");
                        txt_add.setText("");
                        txt_add2.setText("");
                        txt_hn.setText("");
                        txt_pc.setText("");
                        combo_dep.setSelectedIndex(0);
                        txt_design.setText("");
                        txt_salary.setText("");
                        txt_title.setText("");
                        combo_status.setSelectedIndex(0);
                        txt_dob.setCalendar(null);
                        txt_doj.setCalendar(null);
                        lbl_image.setIcon(null);

                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Login as Admin User");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        int sal = Integer.parseInt(txt_salary.getText());
        int basic = (sal * 60) / 100;
        int house_rent = (sal * 20) / 100;
        int allowance = (sal * 20) / 100;
        int gross_salary = basic + house_rent + allowance;

        String log = Login.logusername;
        String id = txt_id.getText();
        String fname = txt_firstname.getText();
        String lname = txt_lastname.getText();
        String gen = gender;

        Date birth = txt_dob.getDate();
        SimpleDateFormat bd = new SimpleDateFormat("dd-MM-YYYY");
        String dob = bd.format(birth);
        Date joining = txt_doj.getDate();
        SimpleDateFormat jd = new SimpleDateFormat("dd-MM-YYYY");
        String doj = jd.format(joining);

        String email = txt_email.getText();
        String contact = txt_contact.getText();
        String add = txt_add.getText();
        String add2 = txt_add2.getText();
        String hn = txt_hn.getText();
        String pc = txt_pc.getText();
        String dep = combo_dep.getSelectedItem().toString();
        String design = txt_design.getText();
        String salary = txt_salary.getText();
        String title = txt_title.getText();
        String status = combo_status.getSelectedItem().toString();
        FileInputStream fin = null;
        PreparedStatement ps = null;

        int x = JOptionPane.showConfirmDialog(null, "Are You Sure Update", "Update Record", JOptionPane.YES_NO_OPTION);
        if (x == 0) {

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "payroll_db", "payroll");
                Statement st = con.createStatement();

                String type = "Select user_type from user_tbl where user_type='ADMIN' and user_name='" + Login.username + "'";
                ResultSet p = st.executeQuery(type);
                if (p.next()) {

                    String sql = "update staff_information set employee_id='" + id + "',first_name='" + fname + "',last_name='" + lname + "',gender='" + gen + "',email='" + email + "',contact='" + contact + "',present_address='" + add + "',permanent_address='" + add2 + "',house_no='" + hn + "',post_code='" + pc + "',department='" + dep + "',designation='" + design + "',gross_salary='" + salary + "',job_title='" + title + "',status='" + status + "',date_of_birth='" + dob + "',joining_date='" + doj + "',update_by='" + log + "' where employee_id = '" + id + "'";

                    String salaryTable = "Update salary_tbl set employee_id='" + id + "',basic_salary='" + basic + "',house_rent='" + house_rent + "',gross_salary='" + gross_salary + "',allowance='" + allowance + "' where employee_id = '" + id + "'";

                    st.executeUpdate(salaryTable);
                    int n = st.executeUpdate(sql);

                    if (n == 1) {
                        JOptionPane.showMessageDialog(this, "Record Updated");

                        txt_search.setText("");
                        txt_id.setText("");
                        txt_firstname.setText("");
                        txt_lastname.setText("");
                        r_male.setSelected(false);
                        r_female.setSelected(false);
                        txt_email.setText("");
                        txt_contact.setText("");
                        txt_add.setText("");
                        txt_add2.setText("");
                        txt_hn.setText("");
                        txt_pc.setText("");
                        combo_dep.setSelectedIndex(0);
                        txt_design.setText("");
                        txt_salary.setText("");
                        txt_title.setText("");
                        combo_status.setSelectedIndex(0);
                        txt_dob.setCalendar(null);
                        txt_doj.setCalendar(null);
                        lbl_image.setIcon(null);

                    }
                    // Image Update code
                    try {

                        ps = con.prepareStatement("UPDATE staff_information SET picture=? Where employee_id = '" + id + "'");

                            File f = new File(filename);
                            fin = new FileInputStream(f);
                            ps.setBinaryStream(1, fin, (int) f.length());
                            ps.executeUpdate();
                            System.out.println("Image Updated Successfully");
                            
                    } catch (Exception e) {
                        System.err.println("Cannot connect ! ");
                        e.printStackTrace();
                    } finally {
                        System.out.println("Closing the connection.");
                        ps.close();
                        fin.close();
                        if (con != null) {
                            try {
                                con.close();
                            } catch (Exception ignore) {
                            }
                        }
                    }

                    // End of Image Update code
                } else {
                    JOptionPane.showMessageDialog(this, "Please Login as Admin User");
                }

                con.close();
            } catch (Exception ignore) {
                //System.out.println(e);
            }
        }
        MainMenu mn = new MainMenu();
        mn.setVisible(false);
        dispose();
        EmpReg er = new EmpReg();
        er.setVisible(true);


    }//GEN-LAST:event_btn_updateActionPerformed

    private void lbl_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoutMouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(EmpReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addrecord;
    private javax.swing.JButton btn_attach;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> combo_dep;
    private javax.swing.JComboBox<String> combo_status;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lbl_logout;
    private javax.swing.JLabel lbl_userlog;
    private javax.swing.JRadioButton r_female;
    private javax.swing.JRadioButton r_male;
    private javax.swing.JTextField txt_add;
    private javax.swing.JTextField txt_add2;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_design;
    private com.toedter.calendar.JDateChooser txt_dob;
    private com.toedter.calendar.JDateChooser txt_doj;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hn;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_pc;
    private javax.swing.JTextField txt_salary;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables

}
