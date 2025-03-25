
package com.senko.cybergamemanagementsystem.view;

import com.senko.cybergamemanagementsystem.view.event.EventMenuSelected;
import com.senko.cybergamemanagementsystem.view.form.PhongMayForm;
import com.senko.cybergamemanagementsystem.view.form.newForm1;
import com.senko.cybergamemanagementsystem.view.form.newForm2;
import javax.swing.JComponent;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
        menu1.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
                if(index == 0){
                    addForm(new PhongMayForm());
                    System.out.print(index);
                }
                else if(index==1){
                     addForm(new newForm1());
                }
                else{
                     addForm(new newForm2());
                }
            }   
        });
        addForm(new PhongMayForm());
    }
    
    public void addForm(JComponent com){
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.senko.cybergamemanagementsystem.view.stuffs.PanelBorder();
        menu1 = new com.senko.cybergamemanagementsystem.view.component.Menu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 768));

        mainPanel.setLayout(new javax.swing.OverlayLayout(mainPanel));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private com.senko.cybergamemanagementsystem.view.component.Menu menu1;
    private com.senko.cybergamemanagementsystem.view.stuffs.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
