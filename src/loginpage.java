
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjana sree
 */
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        usernamebox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        user.setText("USERNAME");

        pass.setText("PASSWORD");

        passwordbox.setText("jPasswordField1");

        loginbutton.setText("LOGIN");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordLayout = new javax.swing.GroupLayout(password);
        password.setLayout(passwordLayout);
        passwordLayout.setHorizontalGroup(
            passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordLayout.createSequentialGroup()
                .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user)
                            .addComponent(pass))
                        .addGap(81, 81, 81)
                        .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordbox)
                            .addComponent(usernamebox)))
                    .addGroup(passwordLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(loginbutton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        passwordLayout.setVerticalGroup(
            passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(user)
                    .addComponent(usernamebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pass)
                    .addComponent(passwordbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginbutton)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        
         String Password=passwordbox.getText();
        String username=usernamebox.getText();

        if(passwordbox.contains("123 ") && usernamebox.contains("anjana")){

            usernamebox.setText("") ;
            passwordbox.setText("");
            close() ;
            homepage w= new homepage();
            w.setVisible(true);

        }
        else
        {
            JOptionPane.showMessageDialog(null,"password wrong \n click ok and try again"," wrong pass",JOptionPane.ERROR_MESSAGE);
            passwordbox .setText("");
            usernamebox .setText("") ;
    }                              
        
        
        
        
        
        
        
    }//GEN-LAST:event_loginbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel pass;
    private javax.swing.JPanel password;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables

private void close() {
WindowEvent winClosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
        }
}