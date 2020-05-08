package com.company;

public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    private final double LUONG_MAX = 20000000d;
    private final double LUONG_CO_BAN = 750000d;

    public NhanVien(String tenNhanVien, double heSoLuong) {
        setTenNhanVien(tenNhanVien);
        setHeSoLuong(heSoLuong);
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public double getLUONG_CO_BAN() {
        return LUONG_CO_BAN;
    }

    public double tinhLuong()
    {
        return LUONG_CO_BAN * heSoLuong;
    }

    public void inTTin()
    {
        System.out.println("Ten nhan vien: " + getTenNhanVien());
        System.out.println("Luong co ban: " + getLUONG_CO_BAN());
        System.out.println("He so luong: " + getHeSoLuong());
        System.out.println("Luong: " + tinhLuong());
    }

    public boolean tangLuong(double soLuong)
    {
        if (LUONG_CO_BAN * (heSoLuong + soLuong) > LUONG_MAX)
            return false;
        else
        {
            this.heSoLuong += soLuong;
            return true;
        }
    }
}
