
package com.senko.cybergamemanagementsystem.controller;

import com.senko.cybergamemanagementsystem.model.dao.NhanVienDAO;
import com.senko.cybergamemanagementsystem.model.entities.NhanVien;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;


public class NhanVienController {
    private NhanVienDAO model;
    
    public NhanVienController(){
        model = new NhanVienDAO();
    }
    
    public Object[][] getNhanVienFromModel(){
        ArrayList<NhanVien> dsNhanVien = model.getAllNhanVien();
        int col = 8;
        int row = dsNhanVien.size();
        Object[][] data = new Object[row][col];
        for(int i = 0;i<row;i++){
            data[i][0] = dsNhanVien.get(i).getMaNhanVien();
            data[i][1] = dsNhanVien.get(i).getHoVaTen();
            data[i][2] = dsNhanVien.get(i).getUserName();
            data[i][3] = dsNhanVien.get(i).getPassWord();
            data[i][4] = dsNhanVien.get(i).getEmail();
            data[i][5] = dsNhanVien.get(i).isTrangThaiNV();
            data[i][6] = dsNhanVien.get(i).getViTri();
            data[i][7] = dsNhanVien.get(i).getNgayVaoLam();
        }
        return data;
    }
    
    public boolean themNhanVien(String hoVaTen, String username, String password, String email, String viTri){ 
        if(hoVaTen.trim().isEmpty()||username.trim().isEmpty()||password.trim().isEmpty()||email.trim().isEmpty()||viTri.trim().isEmpty()){
            return false;
        }
        int trangThai = 1;
        int maViTri = 0;
        switch (viTri) {
            case "Quản lí":
                maViTri = 1;
                break;
            case "Nhân viên":
                maViTri = 2;
                break;
            default:
                maViTri = 3;
        }
        Date ngayVaoLam = Date.valueOf(LocalDate.now());
        try{
            model.insertNhanVien(maViTri, hoVaTen, username, password, email, trangThai, ngayVaoLam);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean xoaNhanVien(int maNhanVien){
        try{
            model.deleteNhanVien(maNhanVien);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public boolean capNhatNhanVien(int maNhanVien, String hoVaTen, String username, String password, String email, String viTri){
        if(hoVaTen.trim().isEmpty()||username.trim().isEmpty()||password.trim().isEmpty()||email.trim().isEmpty()||viTri.trim().isEmpty()){
            return false;
        }
        int maViTri = 0;
        switch (viTri) {
            case "Quản lí":
                maViTri = 1;
                break;
            case "Nhân viên":
                maViTri = 2;
                break;
            default:
                maViTri = 3;
        }
        try{
            model.updateNhanVien(maNhanVien, maViTri, hoVaTen, username, password, email);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
