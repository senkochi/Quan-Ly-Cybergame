
package com.senko.cybergamemanagementsystem.view.stuffs;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


public class TableHeader extends JLabel {
    public TableHeader(String text){
        super(text);
        setOpaque(true);
        setFont(new Font("sansserif",1,12));
        setForeground(Color.WHITE);
        setBorder(new EmptyBorder(0,0,0,0));
    }
}
