/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.Sach_DTO;
import DTO.TheLoai_DTO;
import java.util.ArrayList;
import java.sql.*;
import java.util.Comparator;
import java.util.stream.Collectors;
/**
 *
 * @author nguye
 */
public class Sach_DAO extends DataProvider{
    public static ArrayList<Sach_DTO> getListSach(){  
        String query = "select * from SACH";
        try {
            ResultSet result = resultData(query);
            ArrayList<Sach_DTO> l_Sachs = new ArrayList<Sach_DTO>();
            while(result.next()){
                Sach_DTO sach = new Sach_DTO();
                sach.setMaSach(result.getLong(1));
                sach.setTenSach(result.getString(2));
                sach.setGia(Double.valueOf(result.getString(3)));
                sach.setSoLuong(Integer.valueOf(result.getString(4)));
                sach.setTacGia(result.getString(5));
                sach.setNgayXuatBan(Date.valueOf(result.getString(6)));
                sach.setNhaXuatBan(result.getString(7));
                sach.setTheLoai(TheLoai_DAO.getTheLoai(String.valueOf(result.getLong(8))));
                
                l_Sachs.add(sach);
            }
            CloseConnection();
            l_Sachs = (ArrayList<Sach_DTO>) l_Sachs.stream().sorted(Comparator.comparing(Sach_DTO::getTenSach)).collect(Collectors.toList());
            return l_Sachs;
        } catch (Exception e) {
             System.err.print("\nError getListSach !!!!");
        }
        
        return null;
    }
    
    
    public static int addNewSach(String tenSach, String gia, String soLuong, String tacGia, String ngayXuatBan, String nhaXuatBan, String maTheLoai){        
        String query = "insert into SACH values (N'" + tenSach +"', " + gia + ", " + soLuong + ", N'" + tacGia + "', '" + ngayXuatBan + "', N'" + nhaXuatBan + "', " + maTheLoai + ")";
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static int updateSach(String maSach, String tenSach, String gia, String soLuong, String tacGia, String ngayXuatBan, String nhaXuatBan, String maTL){
        String query = "exec dbo.UpdateSach "
                + maSach + ", N'" + tenSach + "', " 
                + gia + ", " + soLuong + ", N'" + tacGia +"', '" 
                + ngayXuatBan + "', N'" + nhaXuatBan + "', " + maTL; 
        
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static int xoaSach(String maSach){
        String query = "delete from SACH where MaSach = " + maSach;
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static long getMaSach(String tenSach){
        String query = "select MaSach from SACH where TenSach = N'" + tenSach + "'";
        try {
            ResultSet result = resultData(query);
            result.next();
            long maSach = result.getLong(1);
            CloseConnection();
            return maSach;
        } catch (Exception e) {
            System.err.print("\nError getMaSach !!!!");
        }
        return -1;
    }
    
     public static Sach_DTO getSachTheoTen(String tenSach){
        String query = "select * from SACH where TenSach = N'" + tenSach + "'";
        try {
            ResultSet result = resultData(query);
            result.next();
            Sach_DTO s = new Sach_DTO();
            s.setMaSach(result.getLong(1));
            s.setTenSach(result.getString(2));
            s.setGia(result.getDouble(3));
            s.setSoLuong(result.getInt(4));
            s.setTacGia(result.getString(5));
            s.setNgayXuatBan(result.getDate(6));
            s.setNhaXuatBan(result.getString(7));
            s.setTheLoai(TheLoai_DAO.getTheLoai(result.getString(8)));
            CloseConnection();
            return s;
        } catch (Exception e) {
            System.err.print("\nError getMaSach !!!!");
        }
        return null;
    }
}   
