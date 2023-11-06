/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DataProvider.resultData;
import DTO.NhaCungCap_DTO;
import DTO.NhanVien_DTO;
import DTO.PhieuNhap_DTO;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nguye
 */
public class PhieuNhap_DAO extends DataProvider{
    public static List<PhieuNhap_DTO> List_PhieuNhap_Ngay(Date Ngay){
        try{
            String query = "select * from PhieuNhap where NgayLap = '" + new SimpleDateFormat("yyyy-MM-dd").format(Ngay) + "'";
            ResultSet result = resultData(query);
            if(result != null){
                List<PhieuNhap_DTO> pns = new ArrayList<>();
                while(result.next()){
                    PhieuNhap_DTO pn = new PhieuNhap_DTO();
                    pn.setMaPN(result.getLong(1));
                    pn.setNgayLap(result.getDate(2));
                    pn.setSoluong(result.getInt(3));
                    pn.setTongTien(result.getDouble(4));
                    pn.setNhanVien(NhanVien_DAO.getNhanVien(result.getString(5)));
                    pn.setNhaCungCap(NhaCungCap_DAO.Get_NhaCungCap(result.getString(6)));

                    pns.add(pn);
                }
                return pns;
            }
            
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public static List<PhieuNhap_DTO> List_PhieuNhap_Thang(String Nam, String Thang){
        try{
            String query = "select * from PhieuNhap where YEAR(NgayLap) = " + Nam + " AND MONTH(NgayLap) = " + Thang; 
           ResultSet result = resultData(query);
            List<PhieuNhap_DTO> pns = new ArrayList<>();
            if(result != null){
                while(result.next()){
                    PhieuNhap_DTO pn = new PhieuNhap_DTO();
                    pn.setMaPN(result.getLong(1));
                    pn.setNgayLap(result.getDate(2));
                    pn.setSoluong(result.getInt(3));
                    pn.setTongTien(result.getDouble(4));
                    NhanVien_DTO nv = new NhanVien_DTO();
                    nv.setMaNV(result.getLong(5));
                    NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                    ncc.setMaNCC(result.getLong(6));
                    pn.setNhaCungCap(ncc);
                    pn.setNhanVien(nv);

                    pns.add(pn);
                }
            }
            
            return pns;
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public static List<PhieuNhap_DTO> List_PhieuNhap_Nam(String Nam){
        try{
            String query = "select * from PhieuNhap where YEAR(NgayLap) = " + Nam; 
           ResultSet result = resultData(query);
           if(result != null){
               List<PhieuNhap_DTO> pns = new ArrayList<>();
                while(result.next()){
                    PhieuNhap_DTO pn = new PhieuNhap_DTO();
                    pn.setMaPN(result.getLong(1));
                    pn.setNgayLap(result.getDate(2));
                    pn.setSoluong(result.getInt(3));
                    pn.setTongTien(result.getDouble(4));
                    NhanVien_DTO nv = new NhanVien_DTO();
                    nv.setMaNV(result.getLong(5));
                    NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                    ncc.setMaNCC(result.getLong(6));
                    pn.setNhaCungCap(ncc);
                    pn.setNhanVien(nv);

                    pns.add(pn);
                }
                return pns;
           }
            
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public static List<PhieuNhap_DTO> List_PhieuNhap(){
        try{
            String query = "select * from PhieuNhap"; 
           ResultSet result = resultData(query);
           if(result != null){
               List<PhieuNhap_DTO> pns = new ArrayList<>();
                while(result.next()){
                    PhieuNhap_DTO pn = new PhieuNhap_DTO();
                    pn.setMaPN(result.getLong(1));
                    pn.setNgayLap(result.getDate(2));
                    pn.setSoluong(result.getInt(3));
                    pn.setTongTien(result.getDouble(4));
                    NhanVien_DTO nv = new NhanVien_DTO();
                    nv.setMaNV(result.getLong(5));
                    NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                    ncc.setMaNCC(result.getLong(6));
                    pn.setNhaCungCap(ncc);
                    pn.setNhanVien(nv);

                    pns.add(pn);
                }
                return pns;
           }
            
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
     
    
    public static PhieuNhap_DTO PhieuNhap_Top1(){
        try{
            String query = "select top(1) * from PhieuNhap"; 
            ResultSet result = resultData(query);
            if(result != null){
                result.next();
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.setMaPN(result.getLong(1));
                pn.setNgayLap(result.getDate(2));
                pn.setSoluong(result.getInt(3));
                pn.setTongTien(result.getDouble(4));
                NhanVien_DTO nv = new NhanVien_DTO();
                nv.setMaNV(result.getLong(5));
                NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                ncc.setMaNCC(result.getLong(6));
                pn.setNhaCungCap(ncc);
                pn.setNhanVien(nv);
                return pn;
            }
            
          
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public static int insert(PhieuNhap_DTO pn){
        try {
            String text = "insert into phieunhap values(GETDATE(), 0, 0,"+pn.getNhanVien().getMaNV()+", "+pn.getNhaCungCap().getMaNCC()+")";
            return UpdateData(text);
        } catch (Exception e) {
            System.err.println(e);
        }
        return -1;
    }
}
