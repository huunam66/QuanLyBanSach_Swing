/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.CT_HoaDon_DTO;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author nguye
 */
public class CT_HoaDon_DAO extends DataProvider{
    public static int addNewCT_HoaDon(String maHD, String maKhach, String sl, String giamGia, String thanhTien){
 
        String query = "insert into CT_HOADON values(" + maHD + ", " + maKhach + ", " + sl + ", '" + giamGia + "', " + thanhTien + ")";
        System.out.print(query);
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static ArrayList<CT_HoaDon_DTO> getCT_HoaDon(String maHoaDon){
        String query = "select * from CT_HOADON where MaHoaDon = " + maHoaDon;
        ResultSet result = resultData(query);
        if(result != null){
            ArrayList<CT_HoaDon_DTO> l_CT = new ArrayList<CT_HoaDon_DTO>();
            try {
                while(result.next()){
                    CT_HoaDon_DTO CT = new CT_HoaDon_DTO();
                    CT.setMaHoaDon(result.getLong(1));
                    CT.setMaSach(result.getLong(2));
                    CT.setSoLuong(Integer.parseInt(result.getString(3)));
                    CT.setGiamGia(result.getString(4));
                    CT.setTongTien(Double.parseDouble(result.getString(5)));
                    l_CT.add(CT);
                }
                CloseConnection();
                return l_CT;
            } catch (Exception e) {
                System.err.print("\nError getCT_HoaDon !!!!");
            }
        }
        return null;
    }
}
