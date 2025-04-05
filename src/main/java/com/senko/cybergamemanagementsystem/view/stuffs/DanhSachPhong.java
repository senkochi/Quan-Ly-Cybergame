
package com.senko.cybergamemanagementsystem.view.stuffs;

import com.senko.cybergamemanagementsystem.model.entities.MayTinh;
import com.senko.cybergamemanagementsystem.model.entities.PhongMay;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class DanhSachPhong extends JTabbedPane {
    private ArrayList<PhongMay> danhSachPhongMay;
    
    public DanhSachPhong(){
        danhSachPhongMay = new ArrayList<>();
        
    }
    
    public void themPhong(PhongMay phong){
        danhSachPhongMay.add(phong);
        addTab(phong.getTenPhong(), new JLabel(phong.getTenPhong()));
        repaint();
        revalidate();
    }
    
    public void xoaPhong(PhongMay phong){
        danhSachPhongMay.remove(phong);
    }
    
    public void sapXepTheoTen(){
        danhSachPhongMay.sort((p1,p2) -> p1.getTenPhong().compareTo(p2.getTenPhong()));
    }
    
    public PhongMay getAt(int index){
        return danhSachPhongMay.get(index);
    }
    
    
}
