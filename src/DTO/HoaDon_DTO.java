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
public class HoaDon_DTO {
    private long maHoaDon;
    private long maKH;
    private long maNV;
    private Date ngayThanhToan;
    private int soLuongSach;
    private double thanhTien;
    private NhanVien_DTO nhanvien;
    private KhachHang_DTO khachhang;
    
    public HoaDon_DTO(){
        nhanvien = new NhanVien_DTO();
        khachhang = new KhachHang_DTO();
    }

    public NhanVien_DTO getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(NhanVien_DTO nhanvien) {
        this.nhanvien = nhanvien;
    }

    public KhachHang_DTO getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang_DTO khachhang) {
        this.khachhang = khachhang;
    }

    
    public long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(long maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public long getMaKH() {
        return maKH;
    }

    public void setMaKH(long maKH) {
        this.maKH = maKH;
    }

    public long getMaNV() {
        return maNV;
    }

    public void setMaNV(long maNV) {
        this.maNV = maNV;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    
    
}
