package View;

import Controller.ConnectSQL;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Author extends javax.swing.JFrame {

  
    public Author() {
        initComponents();
        SetIcon();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("koala.png")));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTG = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btXem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTGia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TÁC GIẢ");
        setLocation(new java.awt.Point(150, 80));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(130, 252, 233));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Tên Tác Giả");

        tbTG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Tên tác giả"
            }
        ));
        jScrollPane1.setViewportView(tbTG);

        btThem.setBackground(new java.awt.Color(51, 153, 255));
        btThem.setForeground(new java.awt.Color(255, 255, 255));
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setBackground(new java.awt.Color(255, 153, 255));
        btSua.setForeground(new java.awt.Color(255, 255, 255));
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setBackground(new java.awt.Color(255, 102, 102));
        btXoa.setForeground(new java.awt.Color(255, 255, 255));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btXem.setBackground(new java.awt.Color(102, 0, 204));
        btXem.setForeground(new java.awt.Color(0, 255, 255));
        btXem.setText("All");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/william.png"))); // NOI18N

        tbTP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Thể Loại", "Nhà XB", "Năm XB", "Số Lượng", "Giá/1 cuốn"
            }
        ));
        jScrollPane2.setViewportView(tbTP);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Danh Sách Tác Phẩm");

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTG, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btThem))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86)
                                .addComponent(txtTGia, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(jLabel2)
                            .addComponent(txtTGia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btXem)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showDuLieu() throws SQLException{
        
        try {
            tbTG.removeAll();
            String[] arr = { "STT","Tên Tác Giả"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
        
            Connection connect = ConnectSQL.getConnection();
            String query = "select MaTacGia, TenTacGia from TACGIA ";
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getInt("MaTacGia"));
                vector.add(rs.getString("TenTacGia"));
               
                model.addRow(vector);
            }
            tbTG.setModel(model);
            
        } catch (ClassNotFoundException ex) {
            
        }
    }
    
    private void showTacPham() throws SQLException{
        try {
            tbTP.removeAll();
            String[] arr = { "Mã Sách","Tên Sách","Thể Loại", "Nhà XB", "Năm XB", "Số Lượng", "Giá"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
        
            Connection connect = ConnectSQL.getConnection();
            String text = txtTGia.getText();
            String query = "select SACH.MaSach, TenSach, TenTheLoai,NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap\n" +
            "from SACH, TACGIA, CT_TACGIA, THELOAISACH\n" +
            "where SACH.MaSach = CT_TACGIA.MaSach and\n" +
            "CT_TACGIA.MaTacGia = TACGIA.MaTacGia and \n" +
            "SACH.MaTheLoai = THELOAISACH.MaTheLoai\n" +
            "and TenTacGia ="+"N'"+text+"'";
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("TenSach"));
                vector.add(rs.getString("TenTheLoai"));
                vector.add(rs.getString("NhaXuatBan"));
                vector.add(rs.getString("NamXuatBan"));
                vector.add(rs.getString("SoLuongTon"));
                vector.add(rs.getString("DonGiaNhap"));
                model.addRow(vector);
            }
            tbTP.setModel(model);
            
        } catch (ClassNotFoundException ex) {
            
        }
    }
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        try {
            if(txtTG.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Tên Tác Giả!");
                txtTG.requestFocus();
                return;
            }
           
            Connection connect;
            connect = ConnectSQL.getConnection();
            //String query1 = "insert into ";
            String query = "insert into TACGIA (TenTacGia) values(?)";
            PreparedStatement pst = connect.prepareStatement(query);
            pst.setString(1, txtTG.getText());
           
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Thêm thành công!");
            //showDuLieu();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
        try {
            showDuLieu();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btXemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        try {
                Connection con = ConnectSQL.getConnection();
                int row = tbTG.getSelectedRow();
                String value = (tbTG.getModel().getValueAt(row,0).toString());
                //Xoa o bang CT_TACGIA
                String query = "delete from CT_TACGIA where MaTacGia="+"'" +value +"'";
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                
                String query1 = "delete from TACGIA where MaTacGia="+"'" +value +"'";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                showDuLieu();
        } catch (Exception ex) {     
                JOptionPane.showMessageDialog(null, "Xoa khong thanh cong!");
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        try {
            Connection con = ConnectSQL.getConnection();
            int row = tbTG.getSelectedRow();
            String value = (tbTG.getModel().getValueAt(row, 0).toString());
            String query = "UPDATE dbo.[TACGIA] set TenTacGia=? where MaTacGia=" +"'"+ value +"'";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtTG.getText());
           
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tbTG.getModel();
            model.setRowCount(0);
            showDuLieu();
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sửa không thành công!");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            showTacPham();
        } catch (Exception ex) {
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Author().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbTG;
    private javax.swing.JTable tbTP;
    private javax.swing.JTextField txtTG;
    private javax.swing.JTextField txtTGia;
    // End of variables declaration//GEN-END:variables
}
