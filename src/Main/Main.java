/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import DTO.TaiKhoan_DTO;
import GUI.DangNhap_GUI;
import GUI.KhachHang_GUI;
import GUI.NhanVien_GUI;
import GUI.Sach_GUI;
import GUI.TaiKhoan_GUI;
import GUI.TaoHoaDon_GUI;
import GUI.ThongTinNV_GUI;
import GUI.TrangChu_GUI;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author nguye
 */
public class Main {
    public static void main(String[] args){
        try {
            for (var info :  javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {}
        
        new DangNhap_GUI();
        
    }
}
