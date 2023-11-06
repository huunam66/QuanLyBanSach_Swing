/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.HoaDon_DAO;
import DAO.PhieuNhap_DAO;
import DTO.HoaDon_DTO;
import DTO.PhieuNhap_DTO;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class ThongKe_GUI extends javax.swing.JFrame {

    /**
     * Creates new form NhaCungCap
     */
    
    private DefaultTableModel tabModel = null;
    private DefaultTableColumnModel tabColumnModel = null;
    private DefaultComboBoxModel cbb_theonam_month_model = null;
    private DefaultComboBoxModel cbb_theothang_month_model = null;
    private DefaultComboBoxModel cbb_theonam_year_model = null;
    public ThongKe_GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Thống kê");
        this.setVisible(true);
        tabModel = (DefaultTableModel)tab.getModel();
        tabColumnModel = (DefaultTableColumnModel)tab.getColumnModel();
        
        cbb_theonam_month_model = (DefaultComboBoxModel)cbb_theonam_month.getModel();
        cbb_theothang_month_model = (DefaultComboBoxModel)cbb_theothang_month.getModel();
        cbb_theonam_year_model = (DefaultComboBoxModel)cbb_theonam_year.getModel();
        
        int year = Integer.parseInt(new SimpleDateFormat("yyyy").format(Date.from(Instant.now())));
        cbb_theonam_month_model.removeAllElements();
        cbb_theonam_year_model.removeAllElements();
        for(int i = 2023; i <= year; i++){
            cbb_theonam_month_model.addElement(String.valueOf(i));
            cbb_theonam_year_model.addElement(String.valueOf(i));
        }
        cbb_theothang_month_model.removeAllElements();
        for(int i = 1; i <= 12; i++){
            cbb_theothang_month_model.addElement("Tháng "+String.valueOf(i));
        }
        pic_theongay.setDate(Date.from(Instant.now()));
        
        selected_theongay();
        load_table_doanhthu(HoaDon_DAO.List_HoaDon_Ngay(Date.from(Instant.now())));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lb_tongsach = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_thongtu = new javax.swing.JLabel();
        pan_thang = new javax.swing.JPanel();
        cbb_theonam_month = new javax.swing.JComboBox<>();
        cbb_theothang_month = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cbb_ThongKe = new javax.swing.JComboBox<>();
        pan_nam = new javax.swing.JPanel();
        cbb_theonam_year = new javax.swing.JComboBox<>();
        title_TaiKhoan = new javax.swing.JLabel();
        pan_ngay = new javax.swing.JPanel();
        pic_theongay = new com.toedter.calendar.JDateChooser();
        rd_TheoNgay = new javax.swing.JRadioButton();
        rd_TheoThang = new javax.swing.JRadioButton();
        rd_TheoNam = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tab);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Tổng sách:");

        lb_tongsach.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_tongsach.setText("0");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Tổng thu:");

        lb_thongtu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_thongtu.setText("0 đ");

        pan_thang.setBorder(javax.swing.BorderFactory.createTitledBorder("Theo tháng"));

        cbb_theonam_month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbb_theonam_month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_theonam_monthItemStateChanged(evt);
            }
        });
        cbb_theonam_month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbb_theonam_monthMousePressed(evt);
            }
        });
        cbb_theonam_month.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbb_theonam_monthPropertyChange(evt);
            }
        });

        cbb_theothang_month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbb_theothang_month.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_theothang_monthItemStateChanged(evt);
            }
        });
        cbb_theothang_month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbb_theothang_monthMousePressed(evt);
            }
        });
        cbb_theothang_month.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbb_theothang_monthPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pan_thangLayout = new javax.swing.GroupLayout(pan_thang);
        pan_thang.setLayout(pan_thangLayout);
        pan_thangLayout.setHorizontalGroup(
            pan_thangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_thangLayout.createSequentialGroup()
                .addComponent(cbb_theonam_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbb_theothang_month, 0, 114, Short.MAX_VALUE))
        );
        pan_thangLayout.setVerticalGroup(
            pan_thangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_thangLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pan_thangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_theonam_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_theothang_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê"));

        cbb_ThongKe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbb_ThongKe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doanh thu", "Phiếu nhập" }));
        cbb_ThongKe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_ThongKeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbb_ThongKe, 0, 205, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbb_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pan_nam.setBorder(javax.swing.BorderFactory.createTitledBorder("Theo năm"));

        cbb_theonam_year.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbb_theonam_year.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbb_theonam_yearItemStateChanged(evt);
            }
        });
        cbb_theonam_year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbb_theonam_yearMousePressed(evt);
            }
        });
        cbb_theonam_year.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbb_theonam_yearPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pan_namLayout = new javax.swing.GroupLayout(pan_nam);
        pan_nam.setLayout(pan_namLayout);
        pan_namLayout.setHorizontalGroup(
            pan_namLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbb_theonam_year, javax.swing.GroupLayout.Alignment.TRAILING, 0, 181, Short.MAX_VALUE)
        );
        pan_namLayout.setVerticalGroup(
            pan_namLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_namLayout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(cbb_theonam_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        title_TaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title_TaiKhoan.setForeground(new java.awt.Color(0, 102, 204));
        title_TaiKhoan.setText("THỐNG KÊ");

        pan_ngay.setBorder(javax.swing.BorderFactory.createTitledBorder("Theo ngày"));

        pic_theongay.setDateFormatString("dd/MM/yyyy");
        pic_theongay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pic_theongay.setPreferredSize(new java.awt.Dimension(98, 26));
        pic_theongay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pic_theongayPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout pan_ngayLayout = new javax.swing.GroupLayout(pan_ngay);
        pan_ngay.setLayout(pan_ngayLayout);
        pan_ngayLayout.setHorizontalGroup(
            pan_ngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pic_theongay, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );
        pan_ngayLayout.setVerticalGroup(
            pan_ngayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_ngayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pic_theongay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        rd_TheoNgay.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rd_TheoNgayItemStateChanged(evt);
            }
        });
        rd_TheoNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_TheoNgayMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rd_TheoNgayMousePressed(evt);
            }
        });

        rd_TheoThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_TheoThangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rd_TheoThangMousePressed(evt);
            }
        });

        rd_TheoNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rd_TheoNamMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rd_TheoNamMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_tongsach)
                            .addComponent(lb_thongtu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(526, 526, 526))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pan_ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd_TheoNgay))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pan_thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd_TheoThang))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_TheoNam)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pan_nam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_TheoNgay)
                    .addComponent(rd_TheoThang)
                    .addComponent(rd_TheoNam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan_ngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan_nam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan_thang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tongsach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_thongtu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pan_thang.getAccessibleContext().setAccessibleName("Tháng");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void load_column_table_DoanhThu(){
        tabModel.setColumnIdentifiers(new String[]{
            "Mã HĐ", "Tên khách hàng", "Tên nhân viên", "Ngày thanh toán", "Số lượng sách", "Tổng thu"
        });
        
        tabColumnModel.getColumn(0).setPreferredWidth(100);
        tabColumnModel.getColumn(1).setPreferredWidth(240);
        tabColumnModel.getColumn(2).setPreferredWidth(240);
        tabColumnModel.getColumn(3).setPreferredWidth(140);
        tabColumnModel.getColumn(4).setPreferredWidth(100);
        tabColumnModel.getColumn(5).setPreferredWidth(200);
        
        tab.getTableHeader().setFont(new Font("Aria", Font.BOLD, 16));
    }
    
    private void load_table_doanhthu(List<HoaDon_DTO> hds){
        load_column_table_DoanhThu();
        tabModel.setRowCount(0);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        hds.forEach(item ->{
            tabModel.addRow(new String[]{
                String.valueOf(item.getMaHoaDon()),
                item.getKhachhang().getTenKhach(),
                item.getNhanvien().getTenNhanVien(),
                dateformat.format(item.getNgayThanhToan()),
                String.valueOf(item.getSoLuongSach()),
                String.valueOf(item.getThanhTien())
            });
        });
    }
    
    private void load_column_table_PhieuNhap(){
        tabModel.setColumnIdentifiers(new String[]{
            "Mã phiếu", "Tên nhà cung cấp", "Tên nhân viên", "Ngày lập", "Số lượng sách", "Tổng chi"
        });
        
        tabColumnModel.getColumn(0).setPreferredWidth(100);
        tabColumnModel.getColumn(1).setPreferredWidth(240);
        tabColumnModel.getColumn(2).setPreferredWidth(240);
        tabColumnModel.getColumn(3).setPreferredWidth(140);
        tabColumnModel.getColumn(4).setPreferredWidth(100);
        tabColumnModel.getColumn(5).setPreferredWidth(200);
        
        tab.getTableHeader().setFont(new Font("Aria", Font.BOLD, 16));
    }
    
    private void load_table_phieunhap(List<PhieuNhap_DTO> pns){
        load_column_table_PhieuNhap();
        tabModel.setRowCount(0);
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        pns.forEach(item ->{
            tabModel.addRow(new String[]{
                String.valueOf(item.getMaPN()),
                item.getNhaCungCap().getTenNCC(),
                item.getNhanVien().getTenNhanVien(),
                dateformat.format(item.getNgayLap()),
                String.valueOf(item.getSoluong()),
                String.valueOf(item.getTongTien())
            });
        });
    }
    
    private void cbb_ThongKeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_ThongKeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_ThongKeItemStateChanged

    private void rd_TheoNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_TheoNgayMouseClicked
        // TODO add your handling code here:
        rd_TheoNgay.setSelected(true);
  

    }//GEN-LAST:event_rd_TheoNgayMouseClicked

    private void rd_TheoNgayItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rd_TheoNgayItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rd_TheoNgayItemStateChanged

    private void rd_TheoThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_TheoThangMouseClicked
        // TODO add your handling code here:
        rd_TheoThang.setSelected(true);
        
    }//GEN-LAST:event_rd_TheoThangMouseClicked

    private void rd_TheoNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_TheoNamMouseClicked
        // TODO add your handling code here:
            rd_TheoNam.setSelected(true);
    }//GEN-LAST:event_rd_TheoNamMouseClicked

    private void selected_theongay(){
           rd_TheoNgay.setSelected(true);
         pan_ngay.setEnabled(true);
        pic_theongay.setEnabled(true);
        
        rd_TheoThang.setSelected(false);
        rd_TheoNam.setSelected(false);
        
        pan_thang.setEnabled(false);
        pan_nam.setEnabled(false);
        
        cbb_theonam_month.setEnabled(false);
        cbb_theothang_month.setEnabled(false);
        cbb_theonam_year.setEnabled(false);
    }
    
    private void rd_TheoNgayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_TheoNgayMousePressed
        // TODO add your handling code here:
        
      selected_theongay();
      if(cbb_ThongKe.getSelectedIndex() == 0){
          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Ngay(pic_theongay.getDate()));
      }
      else{
          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Ngay(pic_theongay.getDate()));
      }
    }//GEN-LAST:event_rd_TheoNgayMousePressed

    private void rd_TheoThangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_TheoThangMousePressed
        // TODO add your handling code here:
        
        pan_thang.setEnabled(true);
      
        rd_TheoNgay.setSelected(false);
        rd_TheoNam.setSelected(false);
        
        pan_ngay.setEnabled(false);
        pan_nam.setEnabled(false);
        
        cbb_theonam_month.setEnabled(true);
        cbb_theothang_month.setEnabled(true);
        
        pic_theongay.setEnabled(false);
        cbb_theonam_year.setEnabled(false);
        
        if(cbb_ThongKe.getSelectedIndex() == 0){
          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Thang(cbb_theonam_month.getSelectedItem().toString(), cbb_theothang_month.getSelectedItem().toString().split(" ")[1].trim()));
      }
      else{
          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Thang(cbb_theonam_month.getSelectedItem().toString(), cbb_theothang_month.getSelectedItem().toString().split(" ")[1].trim()));
      }
    }//GEN-LAST:event_rd_TheoThangMousePressed

    private void rd_TheoNamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rd_TheoNamMousePressed
        // TODO add your handling code here:
   
        
        pan_nam.setEnabled(true);
        cbb_theonam_year.setEnabled(true);
        
        rd_TheoNgay.setSelected(false);
        rd_TheoThang.setSelected(false);
        
        pan_thang.setEnabled(false);
        pan_ngay.setEnabled(false);
        
        pic_theongay.setEnabled(false);
        cbb_theonam_month.setEnabled(false);
        cbb_theothang_month.setEnabled(false);
        
         if(cbb_ThongKe.getSelectedIndex() == 0){
          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Nam(cbb_theonam_year.getSelectedItem().toString()));
      }
      else{
          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Nam(cbb_theonam_year.getSelectedItem().toString()));
      }
    }//GEN-LAST:event_rd_TheoNamMousePressed

    private void cbb_theonam_monthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_theonam_monthItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbb_theonam_monthItemStateChanged

    private void cbb_theothang_monthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_theothang_monthItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cbb_theothang_monthItemStateChanged

    private void cbb_theonam_yearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbb_theonam_yearItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cbb_theonam_yearItemStateChanged

    private void pic_theongayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pic_theongayPropertyChange
        // TODO add your handling code here:
//        if(cbb_ThongKe.getSelectedIndex() == 0){
//          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Ngay(pic_theongay.getDate()));
//      }
//      else{
//          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Ngay(pic_theongay.getDate()));
//      }
    }//GEN-LAST:event_pic_theongayPropertyChange

    private void cbb_theonam_monthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbb_theonam_monthPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbb_theonam_monthPropertyChange

    private void cbb_theothang_monthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbb_theothang_monthPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbb_theothang_monthPropertyChange

    private void cbb_theonam_yearPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbb_theonam_yearPropertyChange
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbb_theonam_yearPropertyChange

    private void cbb_theonam_monthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_theonam_monthMousePressed
        // TODO add your handling code here:
         if(cbb_ThongKe.getSelectedIndex() == 0){
          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Thang(cbb_theonam_month.getSelectedItem().toString(), cbb_theothang_month.getSelectedItem().toString().split(" ")[1].trim()));
      }
      else{
          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Thang(cbb_theonam_month.getSelectedItem().toString(), cbb_theothang_month.getSelectedItem().toString().split(" ")[1].trim()));
      }
    }//GEN-LAST:event_cbb_theonam_monthMousePressed

    private void cbb_theothang_monthMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_theothang_monthMousePressed
        // TODO add your handling code here:
          if(cbb_ThongKe.getSelectedIndex() == 0){
          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Thang(cbb_theonam_month.getSelectedItem().toString(), cbb_theothang_month.getSelectedItem().toString().split(" ")[1].trim()));
      }
      else{
          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Thang(cbb_theonam_month.getSelectedItem().toString(), cbb_theothang_month.getSelectedItem().toString().split(" ")[1].trim()));
      }
    }//GEN-LAST:event_cbb_theothang_monthMousePressed

    private void cbb_theonam_yearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbb_theonam_yearMousePressed
        // TODO add your handling code here:
            if(cbb_ThongKe.getSelectedIndex() == 0){
          load_table_doanhthu(HoaDon_DAO.List_HoaDon_Nam(cbb_theonam_year.getSelectedItem().toString()));
      }
      else{
          load_table_phieunhap(PhieuNhap_DAO.List_PhieuNhap_Nam(cbb_theonam_year.getSelectedItem().toString()));
      }
    }//GEN-LAST:event_cbb_theonam_yearMousePressed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb_ThongKe;
    private javax.swing.JComboBox<String> cbb_theonam_month;
    private javax.swing.JComboBox<String> cbb_theonam_year;
    private javax.swing.JComboBox<String> cbb_theothang_month;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_thongtu;
    private javax.swing.JLabel lb_tongsach;
    private javax.swing.JPanel pan_nam;
    private javax.swing.JPanel pan_ngay;
    private javax.swing.JPanel pan_thang;
    private com.toedter.calendar.JDateChooser pic_theongay;
    private javax.swing.JRadioButton rd_TheoNam;
    private javax.swing.JRadioButton rd_TheoNgay;
    private javax.swing.JRadioButton rd_TheoThang;
    private javax.swing.JTable tab;
    private javax.swing.JLabel title_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
