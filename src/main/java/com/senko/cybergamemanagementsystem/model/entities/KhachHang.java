
package com.senko.cybergamemanagementsystem.model.entities;


public class KhachHang {
    private String maKhachHang;
    private String hoVaTen;
    private String userName;
    private String passWord;
    private String email;
    private boolean trangThaiKH;

    public KhachHang(String maKhachHang, String hoVaTen, String userName, String passWord, String email, boolean trangThaiKH) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.trangThaiKH = trangThaiKH;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
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

    public boolean isTrangThaiKH() {
        return trangThaiKH;
    }

    public void setTrangThaiKH(boolean trangThaiKH) {
        this.trangThaiKH = trangThaiKH;
    }
    
    
}
