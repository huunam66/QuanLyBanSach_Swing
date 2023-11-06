/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.NhaCungCap_DAO;
import DTO.NhaCungCap_DTO;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class NhaCungCap_GUI extends javax.swing.JFrame {
 private DefaultTableModel tableModel;
    private DefaultTableColumnModel tableColumnModel;
    /**
     * Creates new form NhaCungCap
     */
    public NhaCungCap_GUI() {
        initComponents();
        tableModel = (DefaultTableModel)tab.getModel();
        tableColumnModel = (DefaultTableColumnModel)tab.getColumnModel();
        btn_them.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Sach_GUI.class.getResource("Icon/add.png"))));
        btnSua.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Sach_GUI.class.getResource("Icon/update.png"))));
        btnXoa.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Sach_GUI.class.getResource("Icon/delete.png"))));
        btnLamMoi.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(Sach_GUI.class.getResource("Icon/reset.png"))));
        this.setLocationRelativeTo(null);
        
        load_table();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_TenNCC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_DiaChi = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txt_MaNCC = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN NHÀ CUNG CẤP"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên nhà cung cấp:");

        txt_TenNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Số điện thoại:");

        txt_SDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        txta_DiaChi.setColumns(20);
        txta_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txta_DiaChi.setLineWrap(true);
        txta_DiaChi.setRows(5);
        jScrollPane1.setViewportView(txta_DiaChi);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã nhà cung cấp:");

        txt_MaNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_MaNCC.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MaNCC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_TenNCC)
                    .addComponent(txt_SDT))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 102, 204));
        title.setText("QUẢN LÝ NHÀ CUNG CẤP");
        title.setToolTipText("");

        tab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tab);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("THAO TÁC"));

        btn_them.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void load_column_table(){
        tableModel.setColumnIdentifiers(new String[]{
            "Mã NCC", "Tên NCC", "Số điện thoại", "Địa chỉ"
        });
        
        tableColumnModel.getColumn(0).setPreferredWidth(100);
        tableColumnModel.getColumn(1).setPreferredWidth(200);
        tableColumnModel.getColumn(2).setPreferredWidth(120);
        tableColumnModel.getColumn(3).setPreferredWidth(250);
        
        tab.getTableHeader().setFont(new Font("Aria", Font.BOLD, 16));
    }
    
    private void load_table(){
        load_column_table();
        tableModel.setRowCount(0);
        List<NhaCungCap_DTO> nccs = NhaCungCap_DAO.List_NhaCungCap();
        if(nccs != null){
            nccs.forEach(item ->{
                tableModel.addRow(new String[]{
                    String.valueOf(item.getMaNCC()),
                    item.getTenNCC(),
                    item.getSDT(),
                    item.getDiaChi()
                });
            });
        }
    }
   
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        if(txt_SDT.getText().equals("")
                || txt_TenNCC.getText().equals("") || txta_DiaChi.equals("")){
            JOptionPane.showConfirmDialog(this, "Nhập đầy đủ dữ liệu !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String ten = txt_TenNCC.getText();
        String sdt = txt_SDT.getText();
        String diachi = txta_DiaChi.getText();
        NhaCungCap_DTO ncc_dto = new NhaCungCap_DTO();
        ncc_dto.setTenNCC(ten);
        ncc_dto.setSDT(sdt);
        ncc_dto.setDiaChi(diachi);
        if(NhaCungCap_DAO.insert(ncc_dto) > 0){
            JOptionPane.showConfirmDialog(this, "Thêm mới thành công !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
             txt_MaNCC.setText("");
             txt_SDT.setText("");
              txt_TenNCC.setText("");
               txta_DiaChi.setText("");
            load_table();
            return;
        }
        JOptionPane.showConfirmDialog(this, "Thêm mới thất bại !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btn_themActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this,"Bạn muốn quay lại ?","Thông báo",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION){
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            return;
        }
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if(tab.getSelectedRowCount() != 1){
                    JOptionPane.showConfirmDialog(this, "Chọn nhà cung cấp !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        long ma = Long.parseLong(txt_MaNCC.getText());
        String ten = txt_TenNCC.getText();
        String sdt = txt_SDT.getText();
        String diachi = txta_DiaChi.getText();
        
        NhaCungCap_DTO ncc = new NhaCungCap_DTO();
        ncc.setMaNCC(ma);
        ncc.setTenNCC(ten);
        ncc.setSDT(sdt);
        ncc.setDiaChi(diachi);
        
        if(NhaCungCap_DAO.update(ncc) > 0){
            JOptionPane.showConfirmDialog(this, "Cập nhật thành công !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            
            load_table();
            return;
        }
                    JOptionPane.showConfirmDialog(this, "Cập nhật thất bại !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        // TODO add your handling code here:
        
        int row = tab.getSelectedRow();
        txt_MaNCC.setText(tab.getValueAt(row, 0).toString());
        txt_TenNCC.setText(tab.getValueAt(row, 1).toString());
        txt_SDT.setText(tab.getValueAt(row, 2).toString());
        txta_DiaChi.setText(tab.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tabMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         if(tab.getSelectedRowCount() != 1){
                    JOptionPane.showConfirmDialog(this, "Chọn nhà cung cấp !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        long ma = Long.parseLong(txt_MaNCC.getText());
        String ten = txt_TenNCC.getText();
        String sdt = txt_SDT.getText();
        String diachi = txta_DiaChi.getText();
        
        NhaCungCap_DTO ncc = new NhaCungCap_DTO();
        ncc.setMaNCC(ma);
        
        if(NhaCungCap_DAO.delete(ncc) > 0){
            JOptionPane.showConfirmDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
            txt_MaNCC.setText("");
             txt_SDT.setText("");
              txt_TenNCC.setText("");
               txta_DiaChi.setText("");
            load_table();
            return;
        }
                    JOptionPane.showConfirmDialog(this, "Xóa thất bại !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        new NhaCungCap_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btn_them;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tab;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txt_MaNCC;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenNCC;
    private javax.swing.JTextArea txta_DiaChi;
    // End of variables declaration//GEN-END:variables
}
