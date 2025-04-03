
package com.senko.cybergamemanagementsystem.view.model;

import java.time.LocalDate;


public class NhanVien {
    private String maNhanVien;
    private String hoVaTen;
    private String userName;
    private String passWord;
    private String email;
    private boolean trangThaiNV;
    private String viTri;
    private LocalDate ngayVaoLam;

    public NhanVien(String maNhanVien, String hoVaTen, String userName, String passWord, String email, boolean trangThaiNV, String viTri, LocalDate ngayVaoLam) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.trangThaiNV = trangThaiNV;
        this.viTri = viTri;
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaViTri() {
        return viTri;
    }

    public void setMaViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTrangThaiNV() {
        return trangThaiNV;
    }

    public void setTrangThaiNV(boolean trangThaiNV) {
        this.trangThaiNV = trangThaiNV;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
    
}
