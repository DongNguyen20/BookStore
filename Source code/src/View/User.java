
package View;

import Controller.ConnectSQL;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class User extends javax.swing.JFrame {

  
    public User() {
        initComponents();
        SetIcon();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("koala.png")));
    }
    private void showDuLieu() throws SQLException{
        
        try {
            tbUser.removeAll();
            String[] arr = { "Tên Đăng Nhập","Tên Hiển Thị","Loại tài khoản"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
        
            Connection connect = ConnectSQL.getConnection();
            String query = "SELECT TenDangNhap, TenHienThi, LoaiTaiKhoan FROM dbo.[NGUOIDUNG] order by LoaiTaiKhoan asc";
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("TenDangNhap"));
                vector.add(rs.getString("TenHienThi"));
                vector.add(rs.getString("LoaiTaiKhoan"));
                
                model.addRow(vector);
            }
            tbUser.setModel(model);
            
        } catch (ClassNotFoundException ex) {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenHienThi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cbLoaiNV = new javax.swing.JComboBox<>();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        btXem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NHÂN VIÊN");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(500, 80));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tên Đăng Nhập");

        jLabel2.setText("Tên Hiển Thị");

        jLabel3.setText("Mật Khẩu");

        jLabel5.setText("Loại tài khoản");

        cbLoaiNV.setBackground(new java.awt.Color(255, 255, 204));
        cbLoaiNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        btThem.setBackground(new java.awt.Color(51, 153, 255));
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setLabel("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(102, 102, 102));
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(0, 153, 51));
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tên Đăng Nhập", "Tên Hiển Thị", "Loại tài khoản"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbUser);

        btXem.setBackground(new java.awt.Color(204, 176, 80));
        btXem.setForeground(new java.awt.Color(0, 0, 204));
        btXem.setText("Xem");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(cbLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtMK)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(221, 221, 221))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btThem)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbLoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
        try {
            showDuLieu();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btXemActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        try {
            // TODO add your handling code here:
            if(txtTenDN.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Ten Dang Nhap!");
                txtTenDN.requestFocus();
                return;
            }else if(txtTenHienThi.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Tên Hiển Thị!");
                txtTenHienThi.requestFocus();
                return;
            }
            else if(txtMK.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Mật Khẩu!");
                txtMK.requestFocus();
                return;
            }
             
            Connection connect;
            connect = ConnectSQL.getConnection();
            String query = "insert into dbo.[NGUOIDUNG]( TenDangNhap, TenHienThi, MatKhau, LoaiTaiKhoan) values(?,?,?,?)";
            PreparedStatement pst = connect.prepareStatement(query);
            pst.setString(1, txtTenDN.getText());
            pst.setString(2, txtTenHienThi.getText());
            pst.setString(3, txtMK.getText());
            String loaiNV = cbLoaiNV.getSelectedItem().toString();
            pst.setString(4, loaiNV);
           
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        try {
                Connection con = ConnectSQL.getConnection();
                int row = tbUser.getSelectedRow();
                String value = (tbUser.getModel().getValueAt(row,0).toString());
                String query = "delete from NGUOIDUNG where TenDangNhap="+"'" +value +"'";
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                showDuLieu();
        } catch (Exception ex) {     
                JOptionPane.showMessageDialog(null, "Xoa khong thanh cong!");
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        try {
            Connection con = ConnectSQL.getConnection();
            int row = tbUser.getSelectedRow();
            String value = (tbUser.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE dbo.[NGUOIDUNG] set TenDangNhap=?, TenHienThi=?, LoaiTaiKhoan=? where TenDangNhap=" +"'"+ value +"'";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtTenDN.getText());
            pst.setString(2, txtTenHienThi.getText());
            String item = cbLoaiNV.getSelectedItem().toString();
            pst.setString(3, item);
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tbUser.getModel();
            model.setRowCount(0);
            showDuLieu();
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sửa không thành công!");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbLoaiNV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUser;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTenDN;
    private javax.swing.JTextField txtTenHienThi;
    // End of variables declaration//GEN-END:variables
}
