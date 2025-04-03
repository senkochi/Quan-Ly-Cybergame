
package com.senko.cybergamemanagementsystem.view.stuffs;

import com.senko.cybergamemanagementsystem.view.model.NhanVien;
import java.awt.Component;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class NhanVienTable extends JTable {
    private DefaultTableModel model;
    
    Object[][] data = {
        {"NV01", "Hồ Minh Đạt", "dat09", "123", "dathm@gmail.com", true, "Hốc trưởng",2025-04-10},
        {"NV02", "Vũ Nhật Hà", "summersun", "123", "havn@gmail.com", true, "Quản lí",2025-04-11},
        {"NV03", "Nguyễn Hùng Cường", "cuongg", "123", "cuonggnh@gmail.com", true, "Quản lí",2025-04-10},
        {"NV04", "Nguyễn Hoàng Thạch", "khaithienphathach", "123", "thachnh@gmail.com", true, "Đầu bếp",2025-04-10},
        {"KH05", "Huỳnh Quang Minh Quân", "haoquangrucro", "123", "quanhqm@gmail.com", true, "Nhân viên",2025-04-19},
        {"KH06", "Nguyễn Minh Đức", "duccop", "123", "ducnm@gmail.com", false,"Nhân viên",2025-04-19}
    };
    
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
    public void themNhanVien(NhanVien nv){
        Object[] obj = {nv.getMaNhanVien(),nv.getHoVaTen(),nv.getUserName(),nv.getPassWord(),nv.getEmail(),true,nv.getMaViTri(),nv.getNgayVaoLam()};
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(obj);
    }
    
    public void xoaNhanVien(){
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        model.removeRow(getSelectedRow());
    }
}
