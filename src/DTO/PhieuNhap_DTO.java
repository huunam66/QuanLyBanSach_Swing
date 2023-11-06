/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author nguye
 */
public class PhieuNhap_DTO {
    private long MaPN;
    private Date NgayLap;
    private double TongTien;
    private NhaCungCap_DTO NhaCungCap;
    private NhanVien_DTO NhanVien;
    private int soluong;
    
    public PhieuNhap_DTO() {
        NhaCungCap = new NhaCungCap_DTO();
        NhanVien = new NhanVien_DTO();
    }

    public PhieuNhap_DTO(long MaPN, Date NgayLap, double TongTien, NhaCungCap_DTO NhaCungCap, NhanVien_DTO NhanVien) {
        this.MaPN = MaPN;
        this.NgayLap = NgayLap;
        this.TongTien = TongTien;
        this.NhaCungCap = NhaCungCap;
        this.NhanVien = NhanVien;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public long getMaPN() {
        return MaPN;
    }

    public void setMaPN(long MaPN) {
        this.MaPN = MaPN;
    }

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public NhaCungCap_DTO getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(NhaCungCap_DTO NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public NhanVien_DTO getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(NhanVien_DTO NhanVien) {
        this.NhanVien = NhanVien;
    }
    
    
}
