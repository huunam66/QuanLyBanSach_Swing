/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhaCungCap_DTO;
import DTO.Sach_DTO;
import java.util.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
/**
 *
 * @author nguye
 */
public class NhaCungCap_DAO extends DataProvider{
    
    
    
    public static List<NhaCungCap_DTO> List_NhaCungCap(){
     
        try{
            String query = "select * from NhaCungCap";
            ResultSet result = resultData(query);
            List<NhaCungCap_DTO> nccs = new ArrayList<>();
            while(result.next()){
                
                NhaCungCap_DTO ncc = new NhaCungCap_DTO();
                ncc.setMaNCC(result.getLong(1));
                ncc.setTenNCC(result.getString(2));
                ncc.setSDT(result.getString(3));
                ncc.setDiaChi(result.getString(4));
                nccs.add(ncc);
            }
            nccs = (ArrayList<NhaCungCap_DTO>) nccs.stream().sorted(Comparator.comparing(NhaCungCap_DTO::getTenNCC)).collect(Collectors.toList());
            
            return nccs;
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
    
    public static int insert(NhaCungCap_DTO ncc){
        try {
            String text = "insert into nhacungcap values(N'"+ncc.getTenNCC()+"', '"+ncc.getSDT()+"', N'"+ncc.getDiaChi()+"')";
            return UpdateData(text);
        } catch (Exception e) {
            System.err.println(e);
        }
        return 0;
    }
    
    public static int update(NhaCungCap_DTO ncc){
        try {
            String text = "update nhacungcap set TenNCC = N'"+ncc.getTenNCC()+"', SDT = '"+ncc.getSDT()+"', DiaChi = N'"+ncc.getDiaChi()+"' where MaNCC = "+ncc.getMaNCC();
            return UpdateData(text);
        } catch (Exception e) {
            System.err.println(e);
        }
        return 0;
    }
    
    public static int delete(NhaCungCap_DTO ncc){
        try {
            String text = "delete from nhacungcap where MaNCC = "+ncc.getMaNCC();
            return UpdateData(text);
        } catch (Exception e) {
            System.err.println(e);
        }
        return 0;
    }
}
