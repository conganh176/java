package com.company;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private final double LUONG_MAX = 10000d;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        setTenNhanVien(tenNhanVien);
        setLuongCoBan(luongCoBan);
        setHeSoLuong(heSoLuong);
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
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

    public double tinhLuong()
    {
        return luongCoBan * heSoLuong;
    }

    public void inTTin()
    {
        System.out.println("Ten: " + this.tenNhanVien);
        System.out.println("Luong co ban: " + this.luongCoBan);
        System.out.println("He so luong: " + this.heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }

    public boolean tangLuong(double soLuong)
    {
        if (luongCoBan * (heSoLuong + soLuong) > LUONG_MAX)
            return false;
        else
        {
            this.heSoLuong += soLuong;
            return true;
        }
    }
}
