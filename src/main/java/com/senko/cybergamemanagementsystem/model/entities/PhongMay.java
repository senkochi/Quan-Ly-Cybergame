
package com.senko.cybergamemanagementsystem.model.entities;


public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private long giaMoiGio;

    public PhongMay(String maPhong, String tenPhong, long giaMoiGio) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.giaMoiGio = giaMoiGio;
    }
    
    

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public long getGiaMoiGio() {
        return giaMoiGio;
    }

    public void setGiaMoiGio(long giaMoiGio) {
        this.giaMoiGio = giaMoiGio;
    }
    
    
}
