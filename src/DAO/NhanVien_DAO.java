/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhanVien_DTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class NhanVien_DAO extends DataProvider{
    
    public static NhanVien_DTO getNhanVien(String maNV){
        String query = "select * from NHANVIEN where MaNV = " + maNV;
        try {
            ResultSet result = resultData(query);
            result.next();
            NhanVien_DTO nv = new NhanVien_DTO();
            nv.setMaNV(result.getLong(1));
            nv.setTenNhanVien(result.getString(2));
            nv.setNgaySinh(Date.valueOf(result.getString(3)));
            nv.setGioiTinh(result.getString(4));
            nv.setEmail(result.getString(5));
            nv.setSdt(result.getString(6));
            nv.setCmnd(result.getString(7));
            nv.setDiaChi(result.getString(8));
            nv.setChucVu(result.getString(9));
            CloseConnection();
            return nv;
        } catch (Exception e) {
            System.err.print("\nError getNhanVien !!!!");
        }
        return null;
    }
    
    public static ArrayList<NhanVien_DTO> getListNhanVien(){
        String query = "select * from NHANVIEN";
        try {
            ResultSet result = resultData(query);
            ArrayList<NhanVien_DTO> l_nhanviens = new ArrayList<NhanVien_DTO>();
            while(result.next()){
                NhanVien_DTO nhanvien = new NhanVien_DTO();
                nhanvien.setMaNV(result.getLong(1));
                nhanvien.setTenNhanVien(result.getString(2));
                nhanvien.setNgaySinh(Date.valueOf(result.getString(3)));
                nhanvien.setGioiTinh(result.getString(4));
                nhanvien.setEmail(result.getString(5));
                nhanvien.setSdt(result.getString(6));
                nhanvien.setCmnd(result.getString(7));
                nhanvien.setDiaChi(result.getString(8));
                nhanvien.setChucVu(result.getString(9));
                
                l_nhanviens.add(nhanvien);
            }
            CloseConnection();
            return l_nhanviens;
        } catch (Exception e) {
             System.err.print("\nError getListNhanVien !!!!");
        }
        return null;
    }
    
    public static int addNewNhanVien(String maNV, String hoTen, String ngaySinh, String gioiTinh, String email, String sdt, String cmnd, String diachi, String chucVu){
        String query = "insert into NHANVIEN values (N'"
                + hoTen + "', "
                + "'" + ngaySinh + "', N'" + gioiTinh + "', "
                + "'" + email + "', '" + sdt + "', '" + cmnd + "', "
                + "N'" + diachi + "', N'" + chucVu + "')";
        
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static int checkExistNhanVien(String email, String sdt, String cmnd){
        String query = "select dbo.checkExistNhanVien('" + email + "', '" + sdt + "', '" + cmnd + "')";       
        try {
            ResultSet resultset = resultData(query); 
            resultset.next();
            int result = Integer.parseInt(resultset.getString(1).toString());
            CloseConnection();
            return result;
        } catch (Exception e) {
            System.err.print("\nError checkExistNhanVien !!!!");
        }
        
        return -1;
    }
    
    
    public static int xoaNhanVien(String maNV){
        String query = "delete from NHANVIEN where MaNV = " + maNV; 
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static int checkUpdateNhanVien(String maNV, String email, String sdt, String cmnd){
        String query = "select dbo.checkUpdateNhanVien(" + maNV + ", '" + email + "', '" + sdt + "', '" + cmnd + "')";       
        try {
            ResultSet resultset = resultData(query); 
            resultset.next();
            int result = Integer.parseInt(resultset.getString(1).toString());
            CloseConnection();
            return result;
        } catch (Exception e) {
            System.err.print("\nError xoaNhanVien !!!!");
        }
        
        return -1;
    }
    
    public static int updateNhanVien(String maNV, String hoTen, String ngaySinh, String gioiTinh, String email, String sdt, String cmnd, String diachi, String chucVu){
        String query = "exec dbo.updateNhanVien "
               + maNV + ", N'" + hoTen + "', "
               + "'" + ngaySinh + "', N'" + gioiTinh + "', "
               + "'" + email + "', '" + sdt + "', '" + cmnd + "', "
               + "N'" + diachi + "', N'" + chucVu + "'";
        
        int value = UpdateData(query);
        CloseConnection();
        return value;
    }
}
