
package com.senko.cybergamemanagementsystem.view.model;

public class MayTinh {
    
    private String maMay;
    private String maPhong;
    private int trangThaiMay;

    public MayTinh(String maMay, String maPhong, int trangThaiMay) {
        this.maMay = maMay;
        this.maPhong = maPhong;
        this.trangThaiMay = trangThaiMay;
    }
    
    

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getTrangThaiMay() {
        return trangThaiMay;
    }

    public void setTrangThaiMay(int trangThaiMay) {
        this.trangThaiMay = trangThaiMay;
    }
    
    
}
