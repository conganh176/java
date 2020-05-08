package com.company;

public class Main {

    public static void main(String[] args) {
        int increase = 10;

        NhanVien kongu = new NhanVien("Kongu", 400, 10);
        kongu.inTTin();
        System.out.println("Duoc tang luong (" + increase + "): " + kongu.tangLuong(increase));

        System.out.println();

        NhanVien anfu = new NhanVien("Anfu", 100, 91);
        anfu.inTTin();
        System.out.println("Duoc tang luong (" + increase + "): " + anfu.tangLuong(increase));
    }
}
