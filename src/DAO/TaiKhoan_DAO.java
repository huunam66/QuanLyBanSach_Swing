/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TaiKhoan_DTO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class TaiKhoan_DAO extends DataProvider{
    
    public static ArrayList<TaiKhoan_DTO> checkLoginUser(){
        String query = "select * from TAIKHOAN";     
        try {
            ResultSet result = resultData(query);
            ArrayList<TaiKhoan_DTO> taiKhoan = new ArrayList<TaiKhoan_DTO>();
            while(result.next()){
                TaiKhoan_DTO tk = new TaiKhoan_DTO();
                tk.setMaNV(result.getLong(1));
                tk.setUsername(result.getString(2));
                tk.setPassword(result.getString(3));
                tk.setQuyen(result.getString(4));
                taiKhoan.add(tk);
            }
            CloseConnection();
            return taiKhoan;
        } catch (Exception e) {
            System.err.print("\nError checkLoginUer !!!!");
        }
        
        return null;
    }
    
    
    public static ArrayList<String[]> getListTaiKhoan(){
        String query = "select * from dbo.getListTaiKhoan()";
        try {
            ResultSet result = resultData(query);
            ArrayList<String[]> l_taiKhoans = new ArrayList<String[]>();
            while(result.next()){
                l_taiKhoans.add(new String[]{
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getString(4),
                    result.getString(5),
                    result.getString(6)
                }); 
            }
            CloseConnection();
            return l_taiKhoans;
        } catch (Exception e) {
            System.err.print("\nError getListTaiKhoan !!!!");
        }
        
        return null;
    }
    
    public static ArrayList<String[]> getListChuaTaiKhoan(){
        String query = "select * from NhanVienChuaCoTaiKhoan()";
        try {
            ResultSet result = resultData(query);
            ArrayList<String[]> l_ChuaTaiKhoan = new ArrayList<String[]>();
            while(result.next()){
                l_ChuaTaiKhoan.add(new String[]{
                    result.getString(1),
                    result.getString(2),
                    result.getString(3)
                });
            }
            CloseConnection();
            return l_ChuaTaiKhoan;
        } catch (Exception e) {
            System.err.print("\nError getListChuaTaiKhoan !!!!");
        }
        return null;
    }
    
    public static String getPassword(String maNV){
        String query = "select Password from TAIKHOAN where MaNV = " + maNV;
        try {
            ResultSet result = resultData(query);
            result.next();
            String value = result.getString(1);
            CloseConnection();
            return value;
        } catch (Exception e) {
            System.err.print("\nError getPassword !!!!");
        }
        return null;
    }
    
    public static int updateQuyen(String maNV, String quyen){
        String query = "update TAIKHOAN set Quyen = '" + quyen + "' where MaNV = " + maNV;
        int value = UpdateData(query);
        CloseConnection();
        return value;
    }
    
    public static String checkLastAdmin(){
        String query = "select count(*) from TAIKHOAN where Quyen = 'Admin'";
        try {
            ResultSet result = resultData(query);
            result.next();
            String value = result.getString(1);
            CloseConnection();
            return value;
        } catch (Exception e) {
            System.err.print("\nError checkLastAdmin !!!!");
        }
        return null;
    }
    
    public static int changePassword(String maNV, String password){
        String query = "update TAIKHOAN set Password = '" + password + "' where MaNV = " + maNV;
        int value = UpdateData(query);
        CloseConnection();
        return value;
    }
    
    public static int xoaTaiKhoan(String maNV){
        String query = "Delete from TAIKHOAN where MaNV = " + maNV;
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static int dangKyTaiKhoan(String maNV, String tenTaiKhoan, String matKhau){
        String query = "insert into TAIKHOAN values (" +  maNV + ", '" + tenTaiKhoan + "', '" + matKhau + "', 'User')";
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
}
