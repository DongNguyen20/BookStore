
package View;

import Controller.ConnectSQL;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class HoaDon extends javax.swing.JFrame {

    public HoaDon() {
        initComponents();
        //showDataBook();
        data2CbKH();
        SetIcon();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("koala.png")));
    }
    public void data2CbKH(){
        try {
            Connection con = ConnectSQL.getConnection(); 
            String sql = "select MaKhachHang from KHACHHANG";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                cbKH.addItem(rs.getString("MaKhachHang"));
            }
            
        } catch (Exception ex) {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cDateNgLap = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cbKH = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSach = new javax.swing.JTextField();
        btTimSach = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBook = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        spSL = new com.toedter.components.JSpinField();
        btThem = new javax.swing.JButton();
        lbTenKH = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btHDpdf = new javax.swing.JButton();
        btAll = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTienNhan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbTienThua = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btThoat = new javax.swing.JButton();
        btTinh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lập Hóa Đơn");
        setLocation(new java.awt.Point(250, 80));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Nhập Thông Tin Hóa Đơn");

        jLabel2.setText("Khách Hàng");

        jLabel3.setText("Ngày Lập");

        cbKH.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbKHPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setText("Sách");

        btTimSach.setBackground(new java.awt.Color(0, 204, 204));
        btTimSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/look.png"))); // NOI18N
        btTimSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimSachActionPerformed(evt);
            }
        });

        tbBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số Lượng", "Giá Bán"
            }
        ));
        jScrollPane2.setViewportView(tbBook);

        jLabel8.setText("Số Lượng");

        btThem.setBackground(new java.awt.Color(255, 255, 255));
        btThem.setForeground(new java.awt.Color(0, 0, 255));
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        lbTenKH.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Mã KH");

        btHDpdf.setBackground(new java.awt.Color(255, 255, 255));
        btHDpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconpdf.png"))); // NOI18N
        btHDpdf.setText("Xuất");
        btHDpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHDpdfActionPerformed(evt);
            }
        });

        btAll.setBackground(new java.awt.Color(255, 255, 255));
        btAll.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btAll.setText("All");
        btAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSach, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btTimSach, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAll, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spSL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cDateNgLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbKH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btHDpdf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btThem)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTenKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbKH)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cDateNgLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btTimSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(spSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHDpdf)
                    .addComponent(btThem))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số Lượng", "Giá Bán", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(tbHoaDon);

        jLabel5.setText("Số Tiền Nhận");

        jLabel6.setText("Tổng Tiền");

        jLabel9.setText("Tiền Thừa:");

        lbTienThua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTienThua.setText("00");

        btSave.setBackground(new java.awt.Color(0, 204, 204));
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btThoat.setBackground(new java.awt.Color(255, 51, 51));
        btThoat.setText("Exit");
        btThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThoatActionPerformed(evt);
            }
        });

        btTinh.setBackground(new java.awt.Color(0, 181, 56));
        btTinh.setText("Tính Tiền");
        btTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTinhActionPerformed(evt);
            }
        });

        jLabel10.setText("Đồng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTienNhan)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btTinh)
                                .addGap(51, 51, 51)
                                .addComponent(btSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btThoat))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lbTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(59, 59, 59)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTienNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(lbTienThua)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTinh))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSave)
                        .addComponent(btThoat)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LẬP HÓA ĐƠN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDataBook(){
        try {
            tbBook.removeAll();
            String[] arr = {"Mã Sách","Tên Sách", "Số Lượng Có", "Giá Bán"};
            DefaultTableModel model = new DefaultTableModel(arr, 0); 
            Connection con = ConnectSQL.getConnection();
            String query = "select MaSach, TenSach, SoLuongTon, DonGiaNhap from SACH ";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
             
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("TenSach"));
                vector.add(rs.getString("SoLuongTon"));
                vector.add(rs.getString("DonGiaNhap"));
             
                model.addRow(vector);
            }
            tbBook.setModel(model);
        } catch (Exception ex) {
            
        }
    }
    private void btTimSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimSachActionPerformed
       
         try {
            tbBook.removeAll();
            String[] arr = {"Mã Sách","Tên Sách", "Số Lượng", "Giá Bán"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            String text = txtSach.getText();
            Connection con = ConnectSQL.getConnection();
            String query = "select MaSach, TenSach, SoLuongTon, DonGiaNhap from SACH where TenSach="+"N'"+text+"'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
             
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("TenSach"));
                vector.add(rs.getString("SoLuongTon"));
                vector.add(rs.getString("DonGiaNhap"));
                
             
                model.addRow(vector);
            }
            tbBook.setModel(model);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Không Tìm Thấy!");
        }
    }//GEN-LAST:event_btTimSachActionPerformed

    private void cbKHPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbKHPopupMenuWillBecomeInvisible
        try {
            String item = cbKH.getSelectedItem().toString();
            Connection con = ConnectSQL.getConnection();
            String sql = "select TenKhachHang from KHACHHANG where MaKhachHang=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, item);
           
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            
                String Ten = rs.getString("TenKhachHang");
                lbTenKH.setText(Ten);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cbKHPopupMenuWillBecomeInvisible

    private void btTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTinhActionPerformed
        float value=0;
        for(int j = 0;j < tbHoaDon.getRowCount();j++){
                value += Float.parseFloat(tbHoaDon.getModel().getValueAt(j, 4).toString());
        }
        txtTongTien.setText(Float.toString(value));
        
        JOptionPane.showMessageDialog(null, value);
        float tienNhan = Float.parseFloat(txtTienNhan.getText());
        lbTienThua.setText(String.valueOf(tienNhan - Float.parseFloat(txtTongTien.getText())));
    }//GEN-LAST:event_btTinhActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
         try{
            String maSach = tbBook.getModel().getValueAt(tbBook.getSelectedRow(),0).toString();
            String tenSach = tbBook.getModel().getValueAt(tbBook.getSelectedRow(),1).toString();
            
            int SoLuong= (int)spSL.getValue();
            float gia =Float.parseFloat(tbBook.getModel().getValueAt(tbBook.getSelectedRow(),3).toString());
            float total= SoLuong * gia;
            
            //JOptionPane.showMessageDialog(null, gia);
               
                Vector vector = new Vector();
                vector.add(maSach);
                vector.add(tenSach);
                vector.add(SoLuong);
                vector.add(gia);
                vector.add(total);
                
                DefaultTableModel model = (DefaultTableModel) tbHoaDon.getModel();
                model.addRow(vector);
            
            
   
            for(int i= 0; i < 10; i++){
                
                int countTable=Integer.parseInt(tbHoaDon.getModel().getValueAt(i, 3).toString())+(int)spSL.getValue();
                float priceTable=Float.parseFloat(tbBook.getModel().getValueAt(tbBook.getSelectedRow(),4).toString());
                float totalTable= countTable * priceTable;
                tbHoaDon.getModel().setValueAt(countTable, i, 3);
                tbHoaDon.getModel().setValueAt(priceTable, i, 4);
                tbHoaDon.getModel().setValueAt(totalTable, i, 5);
            
            }
        
           
           
        }
        catch(Exception e){}
        
    }//GEN-LAST:event_btThemActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        
        try {
            Connection connect;
            connect = ConnectSQL.getConnection();
            
            String query = "insert into HOADON (MaKhachHang,NgayLap,TongTien,ThanhToan, ConLai) \n" +
                    "values(?,?,?,?,?)";
            PreparedStatement pst = connect.prepareStatement(query);
            String maKH = cbKH.getSelectedItem().toString();
            pst.setString(1, maKH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(cDateNgLap.getDate());
            pst.setString(2, date);
            pst.setString(3, txtTongTien.getText());
            pst.setString(4, txtTienNhan.getText());
            pst.setString(5, lbTienThua.getText());
            pst.executeUpdate();
            
            //Lay Mã hóa đơn
            String sql1= "select SoHoaDon from HOADON where MaKhachHang="+"'"+maKH+"'";
            PreparedStatement pst1 = connect.prepareStatement(sql1);
            ResultSet rs1 = pst1.executeQuery();
            int MaHD =0;
            while(rs1.next()){
                MaHD = rs1.getInt("SoHoaDon");  //return Mã Hóa Đơn
            }
            
            //update lai sach, tạo CT_HOADON
            for(int i =0;i<tbHoaDon.getRowCount();i++){
                //Lấy số lượng ban đầu
                String Masach = tbHoaDon.getModel().getValueAt(i, 0).toString();
                String  sql2 = "select SoLuongTon from SACH where MaSach="+ "'"+Masach +"'";
                PreparedStatement pst2 = connect.prepareStatement(sql2);
                ResultSet rs2 = pst2.executeQuery();
                int SLCu =0;
                while(rs2.next()){
                    SLCu = rs2.getInt("SoLuongTon");
                    
                }
                //update soluong con lai
                String  sql3 = "update SACH set SoLuongTon=? where MaSach="+ "'"+Masach +"'";
                PreparedStatement pst3 = connect.prepareStatement(sql3);
                int conLai =  SLCu - Integer.parseInt(tbHoaDon.getModel().getValueAt(i, 2).toString());
                pst3.setInt(1, conLai);
                pst3.executeUpdate();
                
                
                //Tạo CT_HOADON
                String sql4 = "insert into CT_HOADON (SoHoaDon, MaSach, SoLuong, DonGiaBan, ThanhTien) values(?,?,?,?,?)";
                PreparedStatement pst4 = connect.prepareStatement(sql4);
                pst4.setInt(1,MaHD);
                pst4.setString(2, tbHoaDon.getModel().getValueAt(i, 0).toString());
                pst4.setString(3, tbHoaDon.getModel().getValueAt(i, 2).toString());
                pst4.setString(4, tbHoaDon.getModel().getValueAt(i, 3).toString());
                pst4.setString(5, tbHoaDon.getModel().getValueAt(i, 4).toString());
                pst4.executeUpdate();
            }
            
            JOptionPane.showMessageDialog(null, "Thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThoatActionPerformed
        
        dispose();
    }//GEN-LAST:event_btThoatActionPerformed

    private void btHDpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHDpdfActionPerformed
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x= j.showSaveDialog(this);

        if(x==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }

        Document doc = new Document();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(cDateNgLap.getDate());
        String title = "Bill Date: "+ date;
        String kh = "KH: "+ lbTenKH.getText();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"hoadon.pdf"));

            doc.open();
            doc.add(new Paragraph(title));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(kh));
            doc.add(new Paragraph(" "));

            PdfPTable tb1 = new PdfPTable(5);

            //Them header
            tb1.addCell("Mã Sách");
            tb1.addCell("Tên Sách");
            tb1.addCell("SL");
            tb1.addCell("Giá");
            tb1.addCell("Thanh toán");
        

            for(int i=0; i< tbHoaDon.getRowCount();i++){
                String maSach = tbHoaDon.getValueAt(i, 0).toString();
                String tenSach = tbHoaDon.getValueAt(i, 1).toString();
                String soLuong = tbHoaDon.getValueAt(i, 2).toString();
                String gia = tbHoaDon.getValueAt(i, 3).toString();
                String thanhTien = tbHoaDon.getValueAt(i, 4).toString();
              

                tb1.addCell(maSach);
                tb1.addCell(tenSach);
                tb1.addCell(soLuong);
                tb1.addCell(gia);
                tb1.addCell(thanhTien);
          

            }

            doc.add(tb1);
            String tong = "Total: "+ txtTongTien.getText()+" dong";
            doc.add(new Paragraph(tong));
            String tienNhan = "Khach tra: "+ txtTienNhan.getText()+" dong";
            doc.add(new Paragraph(tienNhan));
            String tienThua = "Tien thua: "+ lbTienThua.getText()+" dong";
            doc.add(new Paragraph(tienThua));
            JOptionPane.showMessageDialog(null, "Xuất pdf thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        doc.close();
    }//GEN-LAST:event_btHDpdfActionPerformed

    private void btAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllActionPerformed
        
        showDataBook();
    }//GEN-LAST:event_btAllActionPerformed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDon().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAll;
    private javax.swing.JButton btHDpdf;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btThoat;
    private javax.swing.JButton btTimSach;
    private javax.swing.JButton btTinh;
    private com.toedter.calendar.JDateChooser cDateNgLap;
    private javax.swing.JComboBox<String> cbKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTenKH;
    private javax.swing.JLabel lbTienThua;
    private com.toedter.components.JSpinField spSL;
    private javax.swing.JTable tbBook;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTextField txtSach;
    private javax.swing.JTextField txtTienNhan;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
