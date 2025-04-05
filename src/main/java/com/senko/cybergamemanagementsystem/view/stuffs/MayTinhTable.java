
package com.senko.cybergamemanagementsystem.view.stuffs;

import com.senko.cybergamemanagementsystem.model.entities.MayTinh;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class MayTinhTable extends JTable {
    private DefaultTableModel model;
    
    
    Object[][] data = {
        {"MT01","PH01",true,"n/a",null},
        {"MT02","PH01",true,"n/a",null},
        {"MT03","PH01",true,"n/a",null},
        {"MT04","PH02",true,"n/a",null},
        {"MT05","PH02",true,"n/a",null},
        {"MT06","PH03",true,"n/a",null}
        
    };
    
    String[] columns = {"Mã máy","Mã phòng","Trạng thái","Người chơi","Thời gian bắt đầu"};
    
    public MayTinhTable(int index){
        model = new DefaultTableModel(data,columns);
        Object[][] data1 = extractRows(data, 0, 2);
        Object[][] data2 = extractRows(data, 3, 4);
        Object[][] data3 = extractRows(data, 5, 5);
        DefaultTableModel modelThuong = new DefaultTableModel(data1,columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };
        DefaultTableModel modelVip = new DefaultTableModel(data2,columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };
        DefaultTableModel modelStream = new DefaultTableModel(data3,columns){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };
        if(index == 0){
            setModel(modelThuong);
        }
        else if(index == 1){
            setModel(modelVip);
        }
        else{
            setModel(modelStream);
        }        
        setShowHorizontalLines(true);
        getTableHeader().setReorderingAllowed(false);
        setRowHeight(30);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader((String)value);
                if(column==2){
                    header.setHorizontalAlignment(CENTER);
                }
                return header;
            }
            
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if(column!=2){
                    return com;
                }
                StatusLabel label;
                if (value instanceof Boolean) {
                    label = new StatusLabel((Boolean) value);
                    
                    
                } else {
                    label = new StatusLabel(false);
                }
                if (isSelected) {
                    label.setBackground(MayTinhTable.this.getSelectionBackground()); 
                    label.setForeground(MayTinhTable.this.getSelectionForeground());
                } else {
                    label.setBackground(MayTinhTable.this.getBackground());
                    label.setForeground(MayTinhTable.this.getForeground());
                }
                return label;
                 //return new StatusLabel((Boolean) value); 
            }
        });
    }
    
    private static Object[][] extractRows(Object[][] data, int startRow, int endRow) {
        Object[][] result = new Object[endRow - startRow + 1][data[0].length];
        System.arraycopy(data, startRow, result, 0, endRow - startRow + 1);
        return result;
    }
    
    public void themMayTinh(MayTinh mt, String username){
        try{
        Object[] obj = {mt.getMaMay(),mt.getMaPhong(),mt.getTrangThaiMay(),username,null};
        DefaultTableModel model = (DefaultTableModel) getModel();
        model.addRow(obj);
        }
        catch(NullPointerException ex){
            JOptionPane.showConfirmDialog(null,"Chua chon may kia thang lol","Thông báo", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void thayDoiMay(String username){
        
        DefaultTableModel mainModel = (DefaultTableModel) model;
        DefaultTableModel subModel = (DefaultTableModel) getModel();
        mainModel.setValueAt(false, getSelectedRow(), 2);
        subModel.setValueAt(false, getSelectedRow(), 2);
        mainModel.setValueAt(username, getSelectedRow(), 3);
        subModel.setValueAt(username, getSelectedRow(), 3);
        mainModel.setValueAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), getSelectedRow(), 4);
        subModel.setValueAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), getSelectedRow(), 4);
        
    }
    
    public void baoTriMay(){
        DefaultTableModel mainModel = (DefaultTableModel) model;
        DefaultTableModel subModel = (DefaultTableModel) getModel();
        mainModel.setValueAt(false, getSelectedRow(), 2);
        subModel.setValueAt(false, getSelectedRow(), 2);
        mainModel.setValueAt("ĐANG BẢO TRÌ#", getSelectedRow(), 3);
        subModel.setValueAt("ĐANG BẢO TRÌ", getSelectedRow(), 3);
        mainModel.setValueAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), getSelectedRow(), 4);
        subModel.setValueAt(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")), getSelectedRow(), 4);
    }
    
    public void ketThucPhienChoi(){
        DefaultTableModel mainModel = (DefaultTableModel) model;
        DefaultTableModel subModel = (DefaultTableModel) getModel();
        mainModel.setValueAt(true, getSelectedRow(), 2);
        subModel.setValueAt(true, getSelectedRow(), 2);
        mainModel.setValueAt("n/a", getSelectedRow(), 3);
        subModel.setValueAt("n/a", getSelectedRow(), 3);
        mainModel.setValueAt(null, getSelectedRow(), 4);
        subModel.setValueAt(null, getSelectedRow(), 4);
    }
    
    public void ketThucBaoTri(){
        
        DefaultTableModel mainModel = (DefaultTableModel) model;
        DefaultTableModel subModel = (DefaultTableModel) getModel();
        Object obj = subModel.getValueAt(getSelectedRow(), 3);
        if(obj instanceof String){
            String text = (String) obj;
            if(text.equals("ĐANG BẢO TRÌ")){
                mainModel.setValueAt(true, getSelectedRow(), 2);
                subModel.setValueAt(true, getSelectedRow(), 2);
                mainModel.setValueAt("n/a", getSelectedRow(), 3);
                subModel.setValueAt("n/a", getSelectedRow(), 3);
                mainModel.setValueAt(null, getSelectedRow(), 4);
                subModel.setValueAt(null, getSelectedRow(), 4);
            }
        }
        
    }
    
    public boolean getCurrentRowStatus(){
        DefaultTableModel model = (DefaultTableModel) getModel();
        return (boolean)model.getValueAt(getSelectedRow(), 2);
    }
    
    public boolean isBaoTri(){
        DefaultTableModel model = (DefaultTableModel) getModel();
        return ((String)model.getValueAt(getSelectedRow(), 3)).equals("ĐANG BẢO TRÌ");
    }
}
    