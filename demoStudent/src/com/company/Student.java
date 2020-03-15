package com.company;

import java.sql.Date;

public class Student {
    private String ten;
    private Date namSinh;
    private String tinhThanh;
    private float diem;

    public void setTen(String ten) {
        this.ten=ten;
    }
    public String getTen() {
        return ten;
    }

    public void setNamSinh(Date namSinh) {
        this.namSinh=namSinh;
    }
    public Date getNamSinh() {
        return namSinh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh=tinhThanh;
    }
    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setDiem(float diem) {
        this.diem=diem;
    }
    public float getDiem() {
        return diem;
    }

}
