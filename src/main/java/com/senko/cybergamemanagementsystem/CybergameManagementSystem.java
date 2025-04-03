

package com.senko.cybergamemanagementsystem;

import com.formdev.flatlaf.FlatDarkLaf;
import com.senko.cybergamemanagementsystem.view.Main;
import javax.swing.UIManager;


public class CybergameManagementSystem {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        
        Main main = new Main();
        main.setVisible(true);
    }
}
