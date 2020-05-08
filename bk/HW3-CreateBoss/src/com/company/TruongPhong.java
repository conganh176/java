package com.company;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, double soNamDuongChuc) {
        super(tenNhanVien, heSoLuong);
        setPhuCap(phuCap);
        setSoNamDuongChuc(soNamDuongChuc);
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getSoNamDuongChuc() {
        return soNamDuongChuc;
    }

    public void setSoNamDuongChuc(double soNamDuongChuc) {
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong() {
        return LUONG_CO_BAN * getHeSoLuong() + phuCap;
    }

    @Override
    public void inTTin() {
        System.out.println("Ten truong phong: " + getTenNhanVien());
        System.out.println("He so luong: " + getHeSoLuong());
        System.out.println("Phu cap: " + getPhuCap());
        System.out.println("So nam duong chuc: " + getSoNamDuongChuc());
    }
}
