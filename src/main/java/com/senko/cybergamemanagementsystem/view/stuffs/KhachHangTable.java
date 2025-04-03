
package com.senko.cybergamemanagementsystem.view.stuffs;

import com.senko.cybergamemanagementsystem.view.form.ThemKhachHangDialog;
import com.senko.cybergamemanagementsystem.view.model.KhachHang;
import java.awt.Component;
import javax.swing.JDialog;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class KhachHangTable extends JTable {
    private DefaultTableModel model;
    
    Object[][] data = {
        {"KH01", "Cristiano Ronaldo", "siuuu7", "goat123", "ronaldo@example.com", true},
        {"KH02", "Bruno Fernandes", "penandes8", "bruno123", "bruno@example.com", true},
        {"KH03", "Marcus Rashford", "rashyy10", "rashford", "rashford@example.com", true},
        {"KH04", "Casemiro", "tankmiro", "casi4", "casemiro@example.com", false},
        {"KH05", "Lisandro Martinez", "butcher6", "lmartinez", "martinez@example.com", true},
        {"KH06", "Raphael Varane", "champvarane", "varane19", "varane@example.com", false},
        {"KH07", "Luke Shaw", "shobby23", "shaw23", "shaw@example.com", true},
        {"KH08", "Andre Onana", "sweeperonana", "onana24", "onana@example.com", false},
        {"KH09", "Alejandro Garnacho", "garnacho7", "aleg10", "garnacho@example.com", true},
        {"KH10", "Rasmus Hojlund", "vikingrasmus", "rasmus11", "hojlund@example.com", false},
        {"KH11", "Antony", "spinlord21", "antony21", "antony@example.com", true}
    };
    
    String[] columns = {"Mã khách hàng","Họ và tên","Username","Password","Email","Trạng thái"};
    
    public KhachHangTable(){
        model = new DefaultTableModel(data,columns);
        setModel(model);
        setShowHorizontalLines(true);
        getTableHeader().setReorderingAllowed(false);
        setRowHeight(30);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader((String)value);
                if(column==5){
                    header.setHorizontalAlignment(CENTER);
                }
                return header;
            }
            
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if(column!=5){
                    return com;
                }
                StatusLabel label;
                if (value instanceof Boolean) {
                    label = new StatusLabel((Boolean) value);
                    
                    
                } else {
                    label = new StatusLabel(false);
                }
                if (isSelected) {
                    label.setBackground(KhachHangTable.this.getSelectionBackground()); 
                    label.setForeground(KhachHangTable.this.getSelectionForeground());
                } else {
                    label.setBackground(KhachHangTable.this.getBackground());
                    label.setForeground(KhachHangTable.this.getForeground());
                }
                return label;
                 //return new StatusLabel((Boolean) value); 
            }
        });
    }
    public void themKhach(KhachHang kh){
        
        
        Object[] obj = {kh.getMaKhachHang(),kh.getHoVaTen(),kh.getUserName(),kh.getPassWord(),kh.getEmail(),true};
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(obj);
    }
    
    public void xoaKhach(){
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        model.removeRow(getSelectedRow());
    }
    
    public void suaKhach(KhachHang kh){
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        model.setValueAt((String)kh.getMaKhachHang(), getSelectedRow(), 0);
        model.setValueAt((String)kh.getHoVaTen(), getSelectedRow(), 1);
        model.setValueAt((String)kh.getUserName(), getSelectedRow(), 2);
        model.setValueAt(kh.getPassWord(), getSelectedRow(), 3);
        model.setValueAt(kh.getEmail(), getSelectedRow(), 4);
    }
    
    public Object[] getItemAt(int row){
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        Object[] obj = {model.getValueAt(row, 0),model.getValueAt(row, 1),model.getValueAt(row, 2),model.getValueAt(row, 3),model.getValueAt(row, 4)};
        return obj;
    }
        
}

