
package com.senko.cybergamemanagementsystem.view.component;

import com.senko.cybergamemanagementsystem.view.event.EventMenuSelected;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Menu extends javax.swing.JPanel {
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }
    
    public Menu() {
        initComponents();
        listMenu1.addItem("Phòng máy");
        listMenu1.addItem("Dummy");
        listMenu1.addItem("Dummy");
        listMenu1.addItem("Dummy");
        listMenu1.addItem("Dummy");
        
        
    }

    
    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0,0,Color.decode("#9400d3"),0,getHeight(),Color.decode("#02aecf"));
        g2.setPaint(gra);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(20, 0, getWidth(), getHeight());
        super.paintChildren(g);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listMenu1 = new com.senko.cybergamemanagementsystem.view.stuffs.ListMenu<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CyberNet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        listMenu1.setOpaque(false);
        add(listMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 210, 380));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private com.senko.cybergamemanagementsystem.view.stuffs.ListMenu<String> listMenu1;
    // End of variables declaration//GEN-END:variables
}
