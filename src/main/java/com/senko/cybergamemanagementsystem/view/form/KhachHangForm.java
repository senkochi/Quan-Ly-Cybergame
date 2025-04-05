
package com.senko.cybergamemanagementsystem.view.form;

import javax.swing.JOptionPane;

public class KhachHangForm extends javax.swing.JPanel {
    
    
    public KhachHangForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        khachHangTable1 = new com.senko.cybergamemanagementsystem.view.stuffs.KhachHangTable();
        panelBorder1 = new com.senko.cybergamemanagementsystem.view.stuffs.PanelBorder();
        themKhachHang = new javax.swing.JButton();
        xoaKhachHang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(khachHangTable1);

        panelBorder1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        themKhachHang.setText("Thêm");
        themKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themKhachHangActionPerformed(evt);
            }
        });
        panelBorder1.add(themKhachHang);

        xoaKhachHang.setText("Xóa");
        xoaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaKhachHangActionPerformed(evt);
            }
        });
        panelBorder1.add(xoaKhachHang);

        jButton1.setText("Sửa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelBorder1.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void themKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themKhachHangActionPerformed
        ThemKhachHangDialog dialog = new ThemKhachHangDialog(null,true);
        dialog.setTable(khachHangTable1);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_themKhachHangActionPerformed

    private void xoaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaKhachHangActionPerformed
        // TODO add your handling code here:
        khachHangTable1.xoaKhach();
        JOptionPane.showConfirmDialog(null,"Xóa khách hàng thành công","Thông báo", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_xoaKhachHangActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ThemKhachHangDialog dialog = new ThemKhachHangDialog(null,true);
                dialog.setEditing(true);
                dialog.setTable(khachHangTable1);
                dialog.initEdit();
                dialog.setVisible(true);
                dialog.repaint();
                dialog.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.senko.cybergamemanagementsystem.view.stuffs.KhachHangTable khachHangTable1;
    private com.senko.cybergamemanagementsystem.view.stuffs.PanelBorder panelBorder1;
    private javax.swing.JButton themKhachHang;
    private javax.swing.JButton xoaKhachHang;
    // End of variables declaration//GEN-END:variables
}
