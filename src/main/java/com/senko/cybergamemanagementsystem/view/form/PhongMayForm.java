
package com.senko.cybergamemanagementsystem.view.form;

import com.senko.cybergamemanagementsystem.view.model.MayTinh;
import com.senko.cybergamemanagementsystem.view.model.PhongMay;
import com.senko.cybergamemanagementsystem.view.stuffs.MayTinhTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class PhongMayForm extends javax.swing.JPanel {
    private MayTinhTable thuongTable;
    private MayTinhTable vipTable;
    private MayTinhTable streamTable;

    public PhongMayForm() {
        initComponents();
        initMayTinhTable();
        thuongTable = new  MayTinhTable(0);
        vipTable = new MayTinhTable(1);
        streamTable = new MayTinhTable(2);
        
        
        phongThuongPanel.add(new JScrollPane(thuongTable));
        phongVipPanel.add(new JScrollPane(vipTable));
        phongStreamPanel.add(new JScrollPane(streamTable));
       
    }
    
    public void initMayTinhTable(){
//        mayTinhTable1.themMayTinh(new MayTinh("MT01","PH01",true),"n/a");
//        mayTinhTable1.themMayTinh(new MayTinh("MT02","PH01",true),"n/a");
//        mayTinhTable1.themMayTinh(new MayTinh("MT03","PH01",true),"n/a");
//        mayTinhTable1.themMayTinh(new MayTinh("MT04","PH01",true),"n/a");
//        mayTinhTable1.themMayTinh(new MayTinh("MT05","PH01",true),"n/a");
//        mayTinhTable1.themMayTinh(new MayTinh("MT06","PH01",true),"n/a");
//        mayTinhTable1.themMayTinh(new MayTinh("MT07","PH01",true),"n/a");
//        mayTinhTable2.themMayTinh(new MayTinh("MT08","PH01",true),"n/a");
//        mayTinhTable2.themMayTinh(new MayTinh("MT09","PH01",true),"n/a");
//        mayTinhTable2.themMayTinh(new MayTinh("MT10","PH01",true),"n/a");
//        mayTinhTable2.themMayTinh(new MayTinh("MT11","PH01",true),"n/a");
//        mayTinhTable3.themMayTinh(new MayTinh("MT12","PH01",true),"n/a");
//        mayTinhTable3.themMayTinh(new MayTinh("MT13","PH01",true),"n/a");
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        phongThuongPanel = new javax.swing.JPanel();
        phongVipPanel = new javax.swing.JPanel();
        phongStreamPanel = new javax.swing.JPanel();
        functionBar = new javax.swing.JPanel();
        themPhienChoiButton = new javax.swing.JButton();
        ketThucPhienChoiButton = new javax.swing.JButton();
        baoTriButton = new javax.swing.JButton();
        hetBaoTriButton = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        phongThuongPanel.setLayout(new javax.swing.BoxLayout(phongThuongPanel, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Phòng thường", phongThuongPanel);

        phongVipPanel.setLayout(new javax.swing.BoxLayout(phongVipPanel, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Phòng VIP", phongVipPanel);

        phongStreamPanel.setLayout(new javax.swing.BoxLayout(phongStreamPanel, javax.swing.BoxLayout.LINE_AXIS));
        jTabbedPane1.addTab("Phòng Stream", phongStreamPanel);

        functionBar.setBackground(new java.awt.Color(51, 51, 51));

        themPhienChoiButton.setText("Thêm");
        themPhienChoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themPhienChoiButtonActionPerformed(evt);
            }
        });

        ketThucPhienChoiButton.setText("Kết thúc");
        ketThucPhienChoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketThucPhienChoiButtonActionPerformed(evt);
            }
        });

        baoTriButton.setText("Bảo trì");
        baoTriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baoTriButtonActionPerformed(evt);
            }
        });

        hetBaoTriButton.setText("Hết bảo trì");
        hetBaoTriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hetBaoTriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout functionBarLayout = new javax.swing.GroupLayout(functionBar);
        functionBar.setLayout(functionBarLayout);
        functionBarLayout.setHorizontalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themPhienChoiButton)
                .addGap(18, 18, 18)
                .addComponent(ketThucPhienChoiButton)
                .addGap(51, 51, 51)
                .addComponent(baoTriButton)
                .addGap(18, 18, 18)
                .addComponent(hetBaoTriButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        functionBarLayout.setVerticalGroup(
            functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(functionBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(functionBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themPhienChoiButton)
                    .addComponent(ketThucPhienChoiButton)
                    .addComponent(baoTriButton)
                    .addComponent(hetBaoTriButton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
            .addComponent(functionBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(functionBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void themPhienChoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themPhienChoiButtonActionPerformed
        // TODO add your handling code here:
        if(getCurrentTable().getCurrentRowStatus()==true){
        ThemPhienChoiDialog dialog = new ThemPhienChoiDialog(null,true);
        dialog.setTable(getCurrentTable());
        dialog.setVisible(true);}
        else{
            JOptionPane.showConfirmDialog(null,"Lỗi rồi cc","Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_themPhienChoiButtonActionPerformed

    private void baoTriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baoTriButtonActionPerformed
        // TODO add your handling code here:
        if(getCurrentTable().getCurrentRowStatus()==true){
        getCurrentTable().baoTriMay();
        }
        else{
            JOptionPane.showConfirmDialog(null,"Lỗi rồi cc","Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_baoTriButtonActionPerformed

    private void hetBaoTriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hetBaoTriButtonActionPerformed
        // TODO add your handling code here:
        if(getCurrentTable().isBaoTri())
        getCurrentTable().ketThucBaoTri();
    }//GEN-LAST:event_hetBaoTriButtonActionPerformed

    private void ketThucPhienChoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketThucPhienChoiButtonActionPerformed
        // TODO add your handling code here:
        if(!getCurrentTable().isBaoTri()){
        getCurrentTable().ketThucPhienChoi();
        JOptionPane.showConfirmDialog(null,"Kết thúc phiên chơi thành công","Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ketThucPhienChoiButtonActionPerformed

    public MayTinhTable getCurrentTable(){
        if(jTabbedPane1.getSelectedIndex()==0){
            return thuongTable;
        }
        if(jTabbedPane1.getSelectedIndex()==1){
            return vipTable;
        }
        return streamTable;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baoTriButton;
    private javax.swing.JPanel functionBar;
    private javax.swing.JButton hetBaoTriButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton ketThucPhienChoiButton;
    private javax.swing.JPanel phongStreamPanel;
    private javax.swing.JPanel phongThuongPanel;
    private javax.swing.JPanel phongVipPanel;
    private javax.swing.JButton themPhienChoiButton;
    // End of variables declaration//GEN-END:variables
}
