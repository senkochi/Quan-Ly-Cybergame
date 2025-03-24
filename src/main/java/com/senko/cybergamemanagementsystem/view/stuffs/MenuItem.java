
package com.senko.cybergamemanagementsystem.view.stuffs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



public class MenuItem extends javax.swing.JPanel {

   private boolean selected;
   private boolean hovered;
   
   public void setSelected(boolean selected){
       this.selected = selected;
       repaint();
   }
   
   public void setHovered(boolean hovered){
       this.hovered = hovered;
       repaint();
   }
   
    public MenuItem(String text) {
        initComponents();
        
        labelName.setText(text);
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(selected||hovered){
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if(selected){
                g2.setColor(new Color(255,255,255,80));
            }
            else {
                g2.setColor(new Color(255,255,255,40));
            }
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        }
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();

        setOpaque(false);

        labelName.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelName;
    // End of variables declaration//GEN-END:variables
}
