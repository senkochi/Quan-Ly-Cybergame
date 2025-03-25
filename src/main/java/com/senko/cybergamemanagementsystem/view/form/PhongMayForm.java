
package com.senko.cybergamemanagementsystem.view.form;

import com.senko.cybergamemanagementsystem.view.model.PhongMay;
import com.senko.cybergamemanagementsystem.view.stuffs.DanhSachPhong;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class PhongMayForm extends javax.swing.JPanel {


    public PhongMayForm() {
        initComponents();
        danhSachPhong1.themPhong(new PhongMay("PM01","Phòng thường 1",10000));
        danhSachPhong1.themPhong(new PhongMay("PM01","Phòng thường 2",10000));
        danhSachPhong1.themPhong(new PhongMay("PM01","Phòng thường 3",10000));
        
        danhSachPhong1.themPhong(new PhongMay("PM01","Phòng thường 4",10000));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        danhSachPhong1 = new com.senko.cybergamemanagementsystem.view.stuffs.DanhSachPhong();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(danhSachPhong1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(danhSachPhong1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.senko.cybergamemanagementsystem.view.stuffs.DanhSachPhong danhSachPhong1;
    // End of variables declaration//GEN-END:variables
}
