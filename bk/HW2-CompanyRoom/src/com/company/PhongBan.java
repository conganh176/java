package com.company;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    private byte SO_NV_MAX = 100;
    public NhanVien[] danhSachNhanVien;

    public PhongBan(String tenPhongBan) {
        setTenPhongBan(tenPhongBan);
        setSoNhanVien((byte) 0);
        danhSachNhanVien = new NhanVien[SO_NV_MAX];
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public byte getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(byte soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public void inTTin()
    {
        System.out.println("Ten phong ban: " + getTenPhongBan());
        System.out.println("So nhan vien: " + getSoNhanVien());
        System.out.println("Thong tin cac nhan vien: ");
        for (int i = 0; i < soNhanVien; i++)
            danhSachNhanVien[i].inTTin();
    }

    public boolean themNV(NhanVien nhanVien)
    {
        if (soNhanVien < SO_NV_MAX)
        {
            danhSachNhanVien[soNhanVien] = nhanVien;
            soNhanVien++;
            return true;
        }
        else return false;
    }

    public NhanVien xoaNV()
    {
        if (soNhanVien > 0)
        {
            NhanVien deletedNV = danhSachNhanVien[soNhanVien - 1];
            danhSachNhanVien[soNhanVien - 1] = null;
            soNhanVien--;
            return deletedNV;
        } else return null;
    }

    public double tongLuong()
    {
        double tong = 0;

        for (int i = 0; i < soNhanVien; i++)
            tong += danhSachNhanVien[i].tinhLuong();

        return tong;
    }
}
