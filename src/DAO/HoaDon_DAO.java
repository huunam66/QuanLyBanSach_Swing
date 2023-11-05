/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.HoaDon_DTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.print.event.PrintJobEvent;

/**
 *
 * @author nguye
 */
public class HoaDon_DAO extends DataProvider{
    
    public static String getCountHoaDon(){
        String query = "select count(*) from HOADON";
        try {
            ResultSet result = resultData(query);
            result.next();
            String value = result.getString(1);
            CloseConnection();
            return value;
        } catch (Exception e) {
            System.err.print("\nError getCountHoaDon !!!!");
        }
        return null;
    }
    
    public static int addNewHoaDon(String maNV, String ngayThanhToan){
        try{
            String query = "select top(1) * from KHACHHANG order by MaKH desc";
            ResultSet result = resultData(query);
            result.next();
            long maKH = result.getLong(1);
            query = "insert into HOADON values(" + maKH + ", " + maNV + ", '" + ngayThanhToan + "', 0, 0)";
            return UpdateData(query);
        }
        catch(Exception e){
            return -1;
        }
        
    }
    
    public static String getMaHD(){
        String query = "select top 1 * from HOADON order by MaHoaDon desc";
        try {
            ResultSet result = resultData(query);
            result.next();
            String value = result.getString(1);
            CloseConnection();
            return value;
        } catch (Exception e) {
            System.err.print("\nError getMaHD !!!!");
        }
        return null;
    }
    
    public static ArrayList<HoaDon_DTO> getAllHoaDon(String query){
        if(query == null){
            query = "select * from HOADON";
        }
        ResultSet result = resultData(query);
        if(result != null){
            SimpleDateFormat simpaDate = new SimpleDateFormat("yyyy-MM-dd");
            ArrayList<HoaDon_DTO> l_HoaDon = new ArrayList<HoaDon_DTO>();
            try{
                while(result.next()){
                    HoaDon_DTO HD = new HoaDon_DTO();
                    HD.setMaHoaDon(result.getLong("MaHoaDon"));
                    HD.setMaKH(result.getLong("MaKH"));
                    HD.setMaNV(result.getLong("MaNV"));
                    HD.setNgayThanhToan(simpaDate.parse(result.getString("NgayThanhToan")));
                    HD.setSoLuongSach(Integer.parseInt(result.getString("SoLuongSach")));
                    HD.setThanhTien(Double.parseDouble(result.getString("ThanhTien")));
                    l_HoaDon.add(HD);
                }
                return l_HoaDon;
            }
            catch(Exception e){
                System.err.print("\nError getAllHoaDon !!!!");
            }
        }
        return null;
    }
    
    public static ArrayList<HoaDon_DTO> getSortHoaDon(String typeSort){
    
        String query = "";
        if(typeSort.equals("Tăng theo mã đơn")){
            query = "select * from HOADON order by MaHoaDon";
        }
        else if(typeSort.equals("Giảm theo mã đơn")){
            query = "select * from HOADON order by MaHoaDon desc";
        }
        else if(typeSort.equals("Tăng theo thành tiền")){
            query = "select * from HOADON order by ThanhTien";
        }
        else{
            if(typeSort.equals("Giảm theo thành tiền")){
            query = "select * from HOADON order by ThanhTien desc";
            }
        }
        
        return getAllHoaDon(query);
    }
}
