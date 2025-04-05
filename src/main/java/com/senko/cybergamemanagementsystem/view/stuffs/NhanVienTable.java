
package com.senko.cybergamemanagementsystem.view.stuffs;

import com.senko.cybergamemanagementsystem.controller.NhanVienController;
import com.senko.cybergamemanagementsystem.model.entities.NhanVien;
import java.awt.Component;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class NhanVienTable extends JTable {
    private DefaultTableModel model;
    private NhanVienController controller = new NhanVienController();
    
    Object[][] data = controller.getNhanVienFromModel();
    
    String[] columns = {"Mã nhân viên","Họ và tên","Username","Password","Email","Trạng thái","Vị trí","Ngày vào làm"};
    
    public NhanVienTable(){
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
                    label.setBackground(NhanVienTable.this.getSelectionBackground()); 
                    label.setForeground(NhanVienTable.this.getSelectionForeground());
                } else {
                    label.setBackground(NhanVienTable.this.getBackground());
                    label.setForeground(NhanVienTable.this.getForeground());
                }
                return label;
                 //return new StatusLabel((Boolean) value); 
            }
        });
    }
    
    public void refresh(){
        Object[][] data = controller.getNhanVienFromModel();
        model = new DefaultTableModel(data,columns);
        setModel(model);
    }
    public void themNhanVien(String hoVaTen, String username, String password, String email, String viTri){
        //Object[] obj = {nv.getMaNhanVien(),nv.getHoVaTen(),nv.getUserName(),nv.getPassWord(),nv.getEmail(),true,nv.getViTri(),nv.getNgayVaoLam()};
        controller.themNhanVien(hoVaTen, username, password, email, viTri);
        refresh();
    }
    
    public void xoaNhanVien(){
        int maNhanVien = Integer.valueOf((String)model.getValueAt(getSelectedRow(), 0));
        controller.xoaNhanVien(maNhanVien);
        refresh();
    }
    
    public void capNhatNhanVien(String hoVaTen, String username, String password, String email, String viTri){
        int maNhanVien = Integer.valueOf((String)model.getValueAt(getSelectedRow(), 0));
        controller.capNhatNhanVien(maNhanVien, hoVaTen, username, password, email, viTri);
        refresh();
    }
    
    public String getTextItem(int index){
        return model.getValueAt(getSelectedRow(), index)+"";
    }
}
