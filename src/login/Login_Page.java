/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;


import controller.Facultycontroller;
import dashboard.Home;
import model.Faculty;
import teacherDashboard.TeacherHome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author inishbashyal
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login_Page() {
        initComponents();
        admin_Panel.setVisible(false);
        teacher_Panel.setVisible(false);
        student_Panel.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        rightside_Panel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        admin_Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teacher_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        student_Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passPasswordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        showpassword_CheckBox = new javax.swing.JCheckBox();
        leftside_Panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuItem_Home = new javax.swing.JMenu();
        menuItem_Login = new javax.swing.JMenu();
        admin_MenuItem = new javax.swing.JMenuItem();
        teacher_MenuItem = new javax.swing.JMenuItem();
        student_MenuItem = new javax.swing.JMenuItem();

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        rightside_Panel.setBackground(new java.awt.Color(186, 79, 84));

        admin_Panel.setBackground(new java.awt.Color(186, 79, 84));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("ADMIN LOGIN");

        javax.swing.GroupLayout admin_PanelLayout = new javax.swing.GroupLayout(admin_Panel);
        admin_Panel.setLayout(admin_PanelLayout);
        admin_PanelLayout.setHorizontalGroup(
                admin_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(admin_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(admin_PanelLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1)
                                        .addContainerGap(30, Short.MAX_VALUE)))
        );
        admin_PanelLayout.setVerticalGroup(
                admin_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(admin_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(admin_PanelLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        teacher_Panel.setBackground(new java.awt.Color(186, 79, 84));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("TEACHER LOGIN");

        javax.swing.GroupLayout teacher_PanelLayout = new javax.swing.GroupLayout(teacher_Panel);
        teacher_Panel.setLayout(teacher_PanelLayout);
        teacher_PanelLayout.setHorizontalGroup(
                teacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(teacher_PanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addContainerGap(10, Short.MAX_VALUE))
        );
        teacher_PanelLayout.setVerticalGroup(
                teacher_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(teacher_PanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        student_Panel.setBackground(new java.awt.Color(186, 79, 84));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setText("STUDENT LOGIN");

        javax.swing.GroupLayout student_PanelLayout = new javax.swing.GroupLayout(student_Panel);
        student_Panel.setLayout(student_PanelLayout);
        student_PanelLayout.setHorizontalGroup(
                student_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, student_PanelLayout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel4))
        );
        student_PanelLayout.setVerticalGroup(
                student_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(student_PanelLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel4)
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(admin_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(teacher_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(student_Panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(student_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(admin_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(teacher_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(25, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(admin_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(student_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(teacher_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
        );

        usernameTextField.setBackground(new java.awt.Color(186, 79, 84));
        usernameTextField.setForeground(new java.awt.Color(186, 186, 186));
        usernameTextField.setText("Username");
        usernameTextField.setBorder(null);
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passPasswordField.setBackground(new java.awt.Color(186, 79, 84));
        passPasswordField.setForeground(new java.awt.Color(186, 186, 186));
        passPasswordField.setText("Password");
        passPasswordField.setBorder(null);
        passPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passPasswordFieldActionPerformed(evt);
            }
        });

        userNameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("user-3295.png"))); // NOI18N

        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("padlock-11757.png"))); // NOI18N

        login_btn.setBackground(new java.awt.Color(186, 79, 84));
        login_btn.setForeground(new java.awt.Color(123, 0, 0));
        login_btn.setText("Log In");

        //login connection
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Facultycontroller controller = new Facultycontroller();
                Faculty faculty = controller.loginFaculty(usernameTextField.getText(),passPasswordField.getText());
                if((usernameTextField.getText().equals("admin")) &&(passPasswordField.getText().equals("admin")) ){
                    new Home().setVisible(true);
                }
                else if (faculty != null) {
                    new TeacherHome().setVisible(true);
                }
                else{
                    javax.swing.JOptionPane.showMessageDialog(null, "Invalid username or password");
                }
            }

        });

        showpassword_CheckBox.setText("Show Password");
        showpassword_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassword_CheckBoxActionPerformed(evt);
            }
        });

        leftside_Panel.setBackground(new java.awt.Color(74, 31, 61));
        leftside_Panel.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Black, White and Triangle Data Chase Games Logo-4.png"))); // NOI18N

        javax.swing.GroupLayout leftside_PanelLayout = new javax.swing.GroupLayout(leftside_Panel);
        leftside_Panel.setLayout(leftside_PanelLayout);
        leftside_PanelLayout.setHorizontalGroup(
                leftside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftside_PanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, Short.MAX_VALUE))
        );
        leftside_PanelLayout.setVerticalGroup(
                leftside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftside_PanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rightside_PanelLayout = new javax.swing.GroupLayout(rightside_Panel);
        rightside_Panel.setLayout(rightside_PanelLayout);
        rightside_PanelLayout.setHorizontalGroup(
                rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightside_PanelLayout.createSequentialGroup()
                                .addComponent(leftside_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightside_PanelLayout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addGroup(rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(userNameLabel)
                                                        .addComponent(passwordLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(login_btn)
                                                                .addComponent(showpassword_CheckBox))))
                                        .addGroup(rightside_PanelLayout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(130, Short.MAX_VALUE))
        );
        rightside_PanelLayout.setVerticalGroup(
                rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightside_PanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rightside_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showpassword_CheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login_btn)
                                .addGap(157, 157, 157))
                        .addComponent(leftside_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBar.setBorder(null);

        menuItem_Home.setText("Home");
        menuBar.add(menuItem_Home);

        menuItem_Login.setText("Log In");

        admin_MenuItem.setText("Admin");
        admin_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_MenuItemActionPerformed(evt);
            }
        });
        menuItem_Login.add(admin_MenuItem);

        teacher_MenuItem.setText("Teacher");
        teacher_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_MenuItemActionPerformed(evt);
            }
        });
        menuItem_Login.add(teacher_MenuItem);

        student_MenuItem.setText("Student");
        student_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_MenuItemActionPerformed(evt);
            }
        });
        menuItem_Login.add(student_MenuItem);

        menuBar.add(menuItem_Login);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rightside_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rightside_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    public void admin_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        admin_Panel.setVisible(true);
        teacher_Panel.setVisible(false);
        student_Panel.setVisible(false);

    }

    public void showpassword_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        if (evt.getSource().equals(showpassword_CheckBox)) {
            if (showpassword_CheckBox.isSelected()) {
                passPasswordField.setEchoChar((char) 0);
            } else {
                passPasswordField.setEchoChar('*');
            }
        }
    }



    public void passPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public void teacher_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        admin_Panel.setVisible(false);
        teacher_Panel.setVisible(true);
        student_Panel.setVisible(false);
    }

    public void student_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        admin_Panel.setVisible(false);
        teacher_Panel.setVisible(false);
        student_Panel.setVisible(true);
    }





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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });



    }

    // Variables declaration - do not modify
    public javax.swing.JMenuItem admin_MenuItem;
    public javax.swing.JPanel admin_Panel;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JPanel leftside_Panel;
    public javax.swing.JButton login_btn;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JMenu menuItem_Home;
    public javax.swing.JMenu menuItem_Login;
    public javax.swing.JPasswordField passPasswordField;
    public javax.swing.JLabel passwordLabel;
    public javax.swing.JPanel rightside_Panel;
    public javax.swing.JCheckBox showpassword_CheckBox;
    public javax.swing.JMenuItem student_MenuItem;
    public javax.swing.JPanel student_Panel;
    public javax.swing.JMenuItem teacher_MenuItem;
    public javax.swing.JPanel teacher_Panel;
    public javax.swing.JLabel userNameLabel;
    public javax.swing.JTextField usernameTextField;
    // End of variables declaration




}
