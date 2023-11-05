/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import static DAO.DataProvider.resultData;
import DTO.CT_PhieuNhap_DTO;
import DTO.NhaCungCap_DTO;
import DTO.PhieuNhap_DTO;
import DTO.Sach_DTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class CT_PhieuNhap_DAO {
    public static List<CT_PhieuNhap_DTO> List_NhaCungCap(){
        try{
            String query = "select * from CT_PHIEUNHAP";
            ResultSet result = resultData(query);
            List<CT_PhieuNhap_DTO> ct_pns = new ArrayList<>();
            while(result.next()){
                CT_PhieuNhap_DTO ctpn = new CT_PhieuNhap_DTO();
                PhieuNhap_DTO pn = new PhieuNhap_DTO();
                pn.setMaPN(result.getLong(1));
                Sach_DTO s = new Sach_DTO();
                s.setMaSach(result.getLong(2));
                ctpn.setPhieuNhap(pn);
                ctpn.setSach(s);
                ctpn.setGia(result.getDouble(3));
                ctpn.setSoLuong(result.getInt(4));
                ct_pns.add(ctpn);
          }
            return ct_pns;
        }
        catch(Exception e){
            System.err.println(e);
        }
        return null;
    }
}
