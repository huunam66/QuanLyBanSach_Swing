/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author nguye
 */
public class CT_PhieuNhap_DTO {
    private long Ma_CT;
    private PhieuNhap_DTO PhieuNhap;
    private Sach_DTO Sach;
    private double Gia;
    private int SoLuong;

    public CT_PhieuNhap_DTO(PhieuNhap_DTO PhieuNhap, Sach_DTO Sach, double Gia, int SoLuong) {
        this.PhieuNhap = PhieuNhap;
        this.Sach = Sach;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
    }

    public CT_PhieuNhap_DTO() {
        PhieuNhap = new PhieuNhap_DTO();
        Sach = new Sach_DTO();
    }

    public CT_PhieuNhap_DTO(long Ma_CT, PhieuNhap_DTO PhieuNhap, Sach_DTO Sach, double Gia, int SoLuong) {
        this.Ma_CT = Ma_CT;
        this.PhieuNhap = PhieuNhap;
        this.Sach = Sach;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
    }

    public long getMa_CT() {
        return Ma_CT;
    }

    public void setMa_CT(long Ma_CT) {
        this.Ma_CT = Ma_CT;
    }
    
    
    
    public PhieuNhap_DTO getPhieuNhap() {
        return PhieuNhap;
    }

    public void setPhieuNhap(PhieuNhap_DTO PhieuNhap) {
        this.PhieuNhap = PhieuNhap;
    }
    
    public Sach_DTO getSach() {
        return Sach;
    }
    
    public void setSach(Sach_DTO Sach) {
        this.Sach = Sach;
    }
    
    public double getGia() {
        return Gia;
    }
    
    public void setGia(double Gia) {
        this.Gia = Gia;
    }
    
    public int getSoLuong() {
        return SoLuong;
    }
                                                
    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }                                       
}
