
package com.senko.cybergamemanagementsystem.view.form;

import com.senko.cybergamemanagementsystem.model.entities.KhachHang;
import com.senko.cybergamemanagementsystem.view.stuffs.KhachHangTable;
import javax.swing.JOptionPane;

public class ThemKhachHangDialog extends javax.swing.JDialog {
    private KhachHangTable table;
    private boolean isEditing; 
    
    public void setTable(KhachHangTable table){
        this.table = table;
    }
    
    public void setEditing(boolean isEditing){
        this.isEditing = isEditing;
    }
    
    public ThemKhachHangDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        maKhachField = new javax.swing.JTextField();
        tenKhachField = new javax.swing.JTextField();
        tenDangNhapField = new javax.swing.JTextField();
        matKhauField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        themKhachHangButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+1 con gà vào lồng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 42, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        maKhachField.setText("Mã KH");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 26, 0, 26);
        getContentPane().add(maKhachField, gridBagConstraints);

        tenKhachField.setText("Tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 26, 0, 26);
        getContentPane().add(tenKhachField, gridBagConstraints);

        tenDangNhapField.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 26, 0, 26);
        getContentPane().add(tenDangNhapField, gridBagConstraints);

        matKhauField.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 26, 0, 26);
        getContentPane().add(matKhauField, gridBagConstraints);

        emailField.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 26, 0, 26);
        getContentPane().add(emailField, gridBagConstraints);

        themKhachHangButton.setText("OK");
        themKhachHangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themKhachHangButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 74, 24, 0);
        getContentPane().add(themKhachHangButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themKhachHangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themKhachHangButtonActionPerformed
        // TODO add your handling code here:
        if(!isEditing){
            table.themKhach(new KhachHang(maKhachField.getText(),tenKhachField.getText(),
                    tenDangNhapField.getText(),matKhauField.getText(),emailField.getText(),true));
            table.repaint();
            table.revalidate();
            JOptionPane.showConfirmDialog(null,"Thêm khách hàng thành công","Thông báo", JOptionPane.PLAIN_MESSAGE);
            ThemKhachHangDialog.this.dispose();
        }
        else {
            table.suaKhach(new KhachHang(maKhachField.getText(),tenKhachField.getText(),
                    tenDangNhapField.getText(),matKhauField.getText(),emailField.getText(),true));
            table.repaint();
            table.revalidate();
            JOptionPane.showConfirmDialog(null,"Cập nhật khách hàng thành công","Thông báo", JOptionPane.PLAIN_MESSAGE);
            ThemKhachHangDialog.this.dispose();
        }
    }//GEN-LAST:event_themKhachHangButtonActionPerformed

    public void initEdit(){
        Object[] obj = table.getItemAt(table.getSelectedRow());
        this.maKhachField.setText((String)obj[0]);
        this.tenKhachField.setText((String)obj[1]);
        this.tenDangNhapField.setText((String)obj[2]);
        this.matKhauField.setText(String.valueOf(obj[3]));
        this.emailField.setText(String.valueOf(obj[3]));
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemKhachHangDialog dialog = new ThemKhachHangDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField maKhachField;
    private javax.swing.JTextField matKhauField;
    private javax.swing.JTextField tenDangNhapField;
    private javax.swing.JTextField tenKhachField;
    private javax.swing.JButton themKhachHangButton;
    // End of variables declaration//GEN-END:variables
}
