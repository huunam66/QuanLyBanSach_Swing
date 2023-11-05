/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.KhachHang_DTO;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class KhachHang_DAO extends DataProvider{
    public static int addNewKhachHang(String maKH, String tenKH, String sdtKH, String gtKH, String dcKH){
        String query = "insert into KHACHHANG values(" + maKH + ", N'" + tenKH + "', '" + sdtKH + "', N'" + gtKH + "', N'" + dcKH + "')";
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static String getKhachQuen(String maKH){
        String query = "select dbo.timKhachQuen(" + maKH + ")";
        try {
            ResultSet result = resultData(query);
            result.next();
            String value = result.getString(1);
            CloseConnection();
            return value;
        } catch (Exception e) {
            System.err.print("\nError getKhachQuen !!!!");
        }
        return null;
    }
    
    public static KhachHang_DTO getKhachHang(String maKH){
        String query = "select * from KHACHHANG where MaKH = " + maKH;
        try {
            ResultSet result = resultData(query);
            result.next();
            KhachHang_DTO khachhang = new KhachHang_DTO();
            khachhang.setMaKH(result.getLong(1));
            khachhang.setTenKhach(result.getString(2));
            khachhang.setSdt(result.getString(3));
            khachhang.setGioiTinh(result.getString(4));
            khachhang.setDiaChi(result.getString(5));
            khachhang.setSoSachDaMua(Integer.parseInt(result.getString(6)));
            CloseConnection();
            return khachhang;
        } catch (Exception e) {
            System.err.print("\nError getKhachHang !!!!");
        }
        return null;
    }
    
    public static ArrayList<KhachHang_DTO> getAllKhachHang(){
        String query = "select * from KHACHHANG";
        ResultSet result = resultData(query);
        if(result != null){
            ArrayList<KhachHang_DTO> l_khach = new ArrayList<KhachHang_DTO>();
            try {
                while(result.next()){
                    KhachHang_DTO kh = new KhachHang_DTO();
                    kh.setMaKH(result.getLong(1));
                    kh.setTenKhach(result.getString(2));
                    kh.setSdt(result.getString(3));
                    kh.setGioiTinh(result.getString(4));
                    kh.setDiaChi(result.getString(5));
                    l_khach.add(kh);
                }
                CloseConnection();
                return l_khach;
            } catch (Exception e) {
                 System.err.print("\nError getAllKhachHang !!!!");
            }
        }
        return null;
    }
    
    public static int xoaKhachHang(String maKH){
        String query = "delete from KHACHHANG where MaKH = " + maKH;
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static int updateKhachHang(String maKH, String tenKH, String sdt, String gioiTinh, String diaChi){
        String query = "update KHACHHANG set TenKhach = N'" + tenKH + "', SDT = '" 
                        + sdt + "', GioiTinh = N'" + gioiTinh + "', DiaChi = N'" + diaChi + "' "
                        + "where MaKH = " + maKH;
        int result = UpdateData(query);
        CloseConnection();
        return result;
    }
    
    public static ArrayList<KhachHang_DTO> searchKhachHang(String searchTheo, String search){
        String query = "";
        if(searchTheo.equals("Theo tên")){
            query = "select * from KHACHHANG where UPPER(TenKhach) like N'%" + search.toUpperCase() + "%'";
        }
        else{
            if(searchTheo.equals("Theo số điện thoại")){
                query = "select * from KHACHHANG where UPPER(SDT) like '%" + search.toUpperCase() + "%'";
                System.out.println("\n" + search);
            }
        }
        ResultSet result = resultData(query);
        if(result != null){
            ArrayList<KhachHang_DTO> l_khach = new ArrayList<KhachHang_DTO>();
            try {
                while(result.next()){
                    KhachHang_DTO kh = new KhachHang_DTO();
                    kh.setMaKH(result.getLong(1));
                    kh.setTenKhach(result.getString(2));
                    kh.setSdt(result.getString(3));
                    kh.setGioiTinh(result.getString(4));
                    kh.setDiaChi(result.getString(5));
                    l_khach.add(kh);
                }
                CloseConnection();
                return l_khach;
            } catch (Exception e) {
                 System.err.print("\nError searchKhachHang !!!!");
            }
        }
        return null;
    }
}
