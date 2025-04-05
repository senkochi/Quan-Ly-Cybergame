
package com.senko.cybergamemanagementsystem.model.entities;

public class MayTinh {
    
    private String maMay;
    private String maPhong;
    private boolean trangThaiMay;

    public MayTinh(String maMay, String maPhong, boolean trangThaiMay) {
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

    public boolean getTrangThaiMay() {
        return trangThaiMay;
    }

    public void setTrangThaiMay(boolean trangThaiMay) {
        this.trangThaiMay = trangThaiMay;
    }
    
    
}
