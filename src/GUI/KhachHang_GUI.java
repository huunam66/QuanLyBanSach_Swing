/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.KhachHang_DAO;
import DTO.KhachHang_DTO;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingContainer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class KhachHang_GUI extends javax.swing.JFrame {
    private TrangChu_GUI trangChu_GUI = null;
    private String Quyen = null;
    private DefaultTableModel tableModel;
    private DefaultTableColumnModel tableColumnModel;
    /**
     * Creates new form KhachHang_GUI
     */
    public KhachHang_GUI(TrangChu_GUI trangChu_GUI, String Quyen) {
        this.trangChu_GUI = trangChu_GUI;
        this.Quyen = Quyen;
        initComponents();
        this.tableModel = (DefaultTableModel)Table_KhachHang.getModel();
        this.tableColumnModel = (DefaultTableColumnModel)Table_KhachHang.getColumnModel();
        
        this.setLocationRelativeTo(null);
        this.setTitle("Quản lý khách hàng");
        this.setVisible(true);
        
           if(!this.Quyen.toLowerCase().equals("admin")){
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
        }
        
        this.jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabel7.setHorizontalTextPosition(SwingConstants.CENTER);
        
        this.loadDataTable(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Text_tenKhachHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Text_sdt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Textarea_diaChi = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Text_maKhachHang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table_KhachHang = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Text_search = new javax.swing.JTextField();
        radioTheoTen = new javax.swing.JRadioButton();
        radioTheoSdt = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("QUẢN LÝ KHÁCH HÀNG");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("THÔNG TIN KHÁCH HÀNG"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên khách hàng:");

        Text_tenKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Số điện thoại:");

        Text_sdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ:");

        Textarea_diaChi.setColumns(20);
        Textarea_diaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Textarea_diaChi.setLineWrap(true);
        Textarea_diaChi.setRows(5);
        jScrollPane1.setViewportView(Textarea_diaChi);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã khách hàng:");

        Text_maKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text_maKhachHang.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giới tính:");

        radioNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioNam.setSelected(true);
        radioNam.setText("Nam");
        radioNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioNamMousePressed(evt);
            }
        });

        radioNu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioNu.setText("Nữ");
        radioNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioNuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Text_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Text_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Text_maKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioNu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Text_maKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioNam)
                    .addComponent(radioNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Text_tenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Text_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(36, 36, 36))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Table_KhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_KhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table_KhachHang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Table_KhachHangMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Table_KhachHang);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("THAO TÁC"));

        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXoaMousePressed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLamMoiMousePressed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSuaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("TÌM KIẾM"));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tìm kiếm:");

        Text_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text_searchKeyReleased(evt);
            }
        });

        radioTheoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioTheoTen.setSelected(true);
        radioTheoTen.setText("Theo tên");
        radioTheoTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioTheoTenMousePressed(evt);
            }
        });

        radioTheoSdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioTheoSdt.setText("Theo số điện thoại");
        radioTheoSdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                radioTheoSdtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(radioTheoTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioTheoSdt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Text_search)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioTheoSdt)
                    .addComponent(radioTheoTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void defineColumnTable(){
        tableModel.setColumnIdentifiers(new String[]{
            "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Giới tính", "Địa chỉ"
        });
        
        tableColumnModel.getColumn(0).setPreferredWidth(100);
        tableColumnModel.getColumn(1).setPreferredWidth(200);
        tableColumnModel.getColumn(2).setPreferredWidth(120);
        tableColumnModel.getColumn(3).setPreferredWidth(100);
        tableColumnModel.getColumn(4).setPreferredWidth(250);
        
        Table_KhachHang.getTableHeader().setFont(new Font("Aria", Font.BOLD, 16));
    }
    
    private void loadDataTable(ArrayList<KhachHang_DTO> list_kh){
        this.defineColumnTable();
        tableModel.setRowCount(0);
        
        if(list_kh == null){
            ArrayList<KhachHang_DTO> l_khach = KhachHang_DAO.getAllKhachHang();
            for(KhachHang_DTO kh : l_khach){
                tableModel.addRow(new String[]{
                    String.valueOf(kh.getMaKH()),
                    kh.getTenKhach(),
                    kh.getSdt(),
                    kh.getGioiTinh(),
                    kh.getDiaChi()
                });
            }
        }
        else{
            for(KhachHang_DTO kh : list_kh){
                tableModel.addRow(new String[]{
                    String.valueOf(kh.getMaKH()),
                    kh.getTenKhach(),
                    kh.getSdt(),
                    kh.getGioiTinh(),
                    kh.getDiaChi()
                });
            }
        }
    }
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this,"Bạn muốn quay lại trang chính ?","Thông báo",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION){
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.trangChu_GUI.setEnabled(true);
            return;
        }
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void Table_KhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_KhachHangMousePressed
        // TODO add your handling code here:
        int numRow = Table_KhachHang.getSelectedRow();
        String maKH = Table_KhachHang.getValueAt(numRow, 0).toString();
        String tenKH = Table_KhachHang.getValueAt(numRow,1).toString();
        String sdt = Table_KhachHang.getValueAt(numRow, 2).toString();
        String gioiTinh = Table_KhachHang.getValueAt(numRow, 3).toString();
        String diaChi = Table_KhachHang.getValueAt(numRow, 4).toString();
        
        Text_maKhachHang.setText(maKH);
        Text_tenKhachHang.setText(tenKH);
        Text_sdt.setText(sdt);
        if(gioiTinh.equals("Nam")){
            radioNam.setSelected(true);
            radioNu.setSelected(false);
        }
        else{
            radioNam.setSelected(false);
            radioNu.setSelected(true);
        }
        Textarea_diaChi.setText(diaChi);
    }//GEN-LAST:event_Table_KhachHangMousePressed

    private void radioNuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioNuMousePressed
        // TODO add your handling code here:
        radioNam.setSelected(false);
    }//GEN-LAST:event_radioNuMousePressed

    private void radioNamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioNamMousePressed
        // TODO add your handling code here:
        radioNu.setSelected(false);
    }//GEN-LAST:event_radioNamMousePressed

    
    private void resetAll(){
        Text_sdt.setText("");
        Text_maKhachHang.setText("");
        Text_search.setText("");
        Text_tenKhachHang.setText("");
        Textarea_diaChi.setText("");
        radioNam.setSelected(true);
        radioNu.setSelected(false);
        radioTheoTen.setSelected(true);
        radioTheoSdt.setSelected(false);
        this.loadDataTable(null);
    }
    
    private void btnLamMoiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMousePressed
        // TODO add your handling code here:
        this.resetAll();
    }//GEN-LAST:event_btnLamMoiMousePressed

    private void btnXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMousePressed
        // TODO add your handling code here:
        if(Table_KhachHang.getSelectedRowCount() == 1){
            if(JOptionPane.showConfirmDialog(this, "Xoá khách hàng " + Text_maKhachHang.getText(), "Thông báo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION){
                int numRow = Table_KhachHang.getSelectedRow();
                String maKH = Table_KhachHang.getValueAt(numRow, 0).toString();
                if(KhachHang_DAO.xoaKhachHang(maKH) >= 1){
                    JOptionPane.showConfirmDialog(this, "Xoá khách hàng " + maKH + " thành công !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    this.resetAll();
                    return;
                }
                JOptionPane.showConfirmDialog(this, "Lỗi hệ thống !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showConfirmDialog(this, "Vui lòng chọn khách hàng muốn xoá !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaMousePressed

    private void btnSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMousePressed
        // TODO add your handling code here:
        if(Table_KhachHang.getSelectedRowCount() == 1){
            int numRow = Table_KhachHang.getSelectedRow();
            String maKH = Text_maKhachHang.getText();
            String tenKH = Text_tenKhachHang.getText();
            String sdt = Text_sdt.getText();
            String gioiTinh = radioNam.isSelected() ? "Nam" : "Nữ";
            String diaChi = Textarea_diaChi.getText();
            
            if(KhachHang_DAO.updateKhachHang(maKH, tenKH, sdt, gioiTinh, diaChi) >= 1){
                JOptionPane.showConfirmDialog(this, "Cập nhật khách hàng " + maKH + " thành công !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
                this.resetAll();
                return;
            }
            JOptionPane.showConfirmDialog(this, "Lỗi hệ thống !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showConfirmDialog(this, "Vui lòng chọn khách hàng muốn sửa !", "Thông báo", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaMousePressed

    
    private void searchTheoTen(){
        ArrayList<KhachHang_DTO> l_khach = KhachHang_DAO.searchKhachHang("Theo tên", Text_search.getText());
        this.loadDataTable(l_khach);
    }
    
    public void searchTheoSdt(){
        ArrayList<KhachHang_DTO> l_khach = KhachHang_DAO.searchKhachHang("Theo số điện thoại", Text_search.getText());
        this.loadDataTable(l_khach);
    }
    
    private void Text_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_searchKeyReleased
        // TODO add your handling code here:
        if(radioTheoTen.isSelected()){
            this.searchTheoTen();
        }
        else{
            if(radioTheoSdt.isSelected()){
                this.searchTheoSdt();
            }
        }
    }//GEN-LAST:event_Text_searchKeyReleased

    private void radioTheoTenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTheoTenMousePressed
        // TODO add your handling code here:
        radioTheoSdt.setSelected(false);
        this.searchTheoTen();
    }//GEN-LAST:event_radioTheoTenMousePressed

    private void radioTheoSdtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioTheoSdtMousePressed
        // TODO add your handling code here:
        radioTheoTen.setSelected(false);
        this.searchTheoSdt();
    }//GEN-LAST:event_radioTheoSdtMousePressed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_KhachHang;
    private javax.swing.JTextField Text_maKhachHang;
    private javax.swing.JTextField Text_sdt;
    private javax.swing.JTextField Text_search;
    private javax.swing.JTextField Text_tenKhachHang;
    private javax.swing.JTextArea Textarea_diaChi;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXoa;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JRadioButton radioTheoSdt;
    private javax.swing.JRadioButton radioTheoTen;
    // End of variables declaration//GEN-END:variables
}
