
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


public class Book extends javax.swing.JFrame {

    
    public Book() {
        initComponents();
        SetIcon();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    private void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("koala.png")));
    }
    private void showDuLieu() throws SQLException{
        
        try {
            //Table Sach
            tbSach.removeAll();
            String[] arr = { "Mã Sách","Tên Sách","Tác Giả", "Thể Loại","Nhà Xuất Bản","Năm Xuất Bản","Số Lượng","Đơn giá","Ngày Nhập"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
        
            Connection connect = ConnectSQL.getConnection();
            String query = "select SACH.MaSach, TenSach, TenTacGia, TenTheLoai, NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap, NgayNhap\n" +
            "from SACH,  THELOAISACH, TACGIA, CT_TACGIA\n" +
            "where SACH.MaTheLoai = THELOAISACH.MaTheLoai and \n" +
            "CT_TACGIA.MaSach = SACH.MaSach and \n" +
            "CT_TACGIA.MaTacGia = TACGIA.MaTacGia; ";
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("TenSach"));
                vector.add(rs.getString("TenTacGia"));
                vector.add(rs.getString("TenTheLoai"));
                vector.add(rs.getString("NhaXuatBan"));
                vector.add(rs.getString("NamXuatBan"));
                vector.add(rs.getString("SoLuongTon"));
                vector.add(rs.getString("DonGiaNhap"));
                vector.add(rs.getString("NgayNhap"));
                model.addRow(vector);
            }
            tbSach.setModel(model);
            
            // ================================
            // Table TacGia
            tbTGia.removeAll();
            String[] arr1 = { "STT","Tên Tác Giả"};
            DefaultTableModel model1 = new DefaultTableModel(arr1, 0);
            String query1 = "select MaTacGia, TenTacGia from TACGIA ";
            PreparedStatement ps1 = connect.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                Vector vector1 = new Vector();
                vector1.add(rs1.getInt("MaTacGia"));
                vector1.add(rs1.getString("TenTacGia"));
               
                model1.addRow(vector1);
            }
            tbTGia.setModel(model1);
            
            //================================
            // Table TheLoai
            tbTLoai.removeAll();
            String[] arr2 = { "STT","Thể Loại"};
            DefaultTableModel model2 = new DefaultTableModel(arr2, 0);
            String query2 = "select MaTheLoai, TenTheLoai from THELOAISACH ";
            PreparedStatement ps2 = connect.prepareStatement(query2);
            ResultSet rs2 = ps2.executeQuery();
            
            while(rs2.next()){
                Vector vector2 = new Vector();
                vector2.add(rs2.getInt("MaTheLoai"));
                vector2.add(rs2.getString("TenTheLoai")); 
                model2.addRow(vector2);
            }
            tbTLoai.setModel(model2);
            
            data2Combobox();
        } catch (ClassNotFoundException ex) {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNhaXB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cYearXB = new com.toedter.calendar.JYearChooser();
        jLabel6 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        lbMS = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbTG = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btXem = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTGia = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbTLoai = new javax.swing.JTable();
        btAddTL = new javax.swing.JButton();
        txtAddTL = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cDateNhap = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book");
        setLocation(new java.awt.Point(120, 80));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(130, 252, 233));

        jLabel1.setText("Tên Sách");

        jLabel2.setText("Thể Loại");

        jLabel3.setText("Tác giả");

        txtTenSach.setToolTipText("");

        jLabel4.setText("Nhà XB");

        jLabel5.setText("Năm XB");

        jLabel6.setText("Số Lượng");

        jLabel7.setText("Đơn giá");

        lbMS.setText("Mã Sách");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Tiểu Thuyết", "2 Truyện Tranh", "3 Tạp Chí", "4 Giáo Trình", "5 Khoa Học" }));

        cbTG.setBackground(new java.awt.Color(204, 255, 255));
        cbTG.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTG.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(txtTenSach)
                        .addComponent(jLabel4)
                        .addComponent(txtNhaXB)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cYearXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbMS)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cbTG, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lbMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNhaXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cYearXB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19))
        );

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MaSach", "Tên Sách", "Thể Loại", "Nhà Xuất Bản", "Năm Xuất Bản", "Số Lượng", "Đơn giá"
            }
        ));
        jScrollPane1.setViewportView(tbSach);

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

        btXem.setBackground(new java.awt.Color(0, 153, 153));
        btXem.setForeground(new java.awt.Color(255, 255, 0));
        btXem.setText("Xem");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("SÁCH");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("TÁC GIẢ");

        tbTGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Tác Giả"
            }
        ));
        jScrollPane2.setViewportView(tbTGia);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("THỂ LOẠI");

        tbTLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "STT", "Thể Loại"
            }
        ));
        jScrollPane3.setViewportView(tbTLoai);

        btAddTL.setBackground(new java.awt.Color(0, 0, 255));
        btAddTL.setForeground(new java.awt.Color(255, 255, 255));
        btAddTL.setText("Thêm");
        btAddTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtAddTL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAddTL))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAddTL)
                    .addComponent(txtAddTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel11.setText("Ngày Nhập");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cDateNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(cDateNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(btSua)
                            .addComponent(btXoa)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btXem)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Đổ dữ liệu vào combobox Tác giả
    public void data2Combobox(){
        try {
            Connection con = ConnectSQL.getConnection(); 
            String sql = "select MaTacGia from TACGIA";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                cbTG.addItem(rs.getString("MaTacGia"));
            }
        } catch (Exception ex) {
            
        }
    }
    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        try {
            
            if(txtTenSach.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Ten Sach!");
                txtTenSach.requestFocus();
                return;
            }
            else if(txtSL.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Số Lượng!");
                txtSL.requestFocus();
                return;
            }
            else if(txtGia.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Chưa nhập Giá!");
                txtGia.requestFocus();
                return;
            }
             
            Connection connect;
            connect = ConnectSQL.getConnection();
           
            String query = "insert into SACH (MaSach, TenSach, MaTheLoai, NhaXuatBan, NamXuatBan, SoLuongTon, DonGiaNhap, NgayNhap) \n" +
            "values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = connect.prepareStatement(query);
            pst.setString(1, txtMaSach.getText());
            pst.setString(2, txtTenSach.getText());
            pst.setString(3, txtTheLoai.getText());
            pst.setString(4, txtNhaXB.getText());
            
            pst.setInt(5, cYearXB.getYear());
            pst.setString(6, txtSL.getText());
            pst.setString(7, txtGia.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(cDateNhap.getDate());
            pst.setString(8, date);
            pst.executeUpdate();
            
            
            //Thêm vào bảng CT_TACGIA
            String  query1 = "insert into CT_TACGIA (MaSach, MaTacGia) values (?,?)";
            PreparedStatement pst1 = connect.prepareStatement(query1);
            pst1.setString(1,txtMaSach.getText());
            pst1.setString(2,cbTG.getSelectedItem().toString());
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
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

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        try {
            Connection con = ConnectSQL.getConnection();
            int row = tbSach.getSelectedRow();
            String value = (tbSach.getModel().getValueAt(row, 0).toString());
            //Sua trong table CT_TACGIA
            String query = "UPDATE dbo.[CT_TACGIA] set MaSach=?, MaTacGia=? where MaSach=" +"'"+ value +"'";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtMaSach.getText());
            pst.setString(2, cbTG.getSelectedItem().toString());
            pst.executeUpdate();
            
            //Sua trong table SACH
            String query1 = "UPDATE dbo.[SACH] set MaSach=?, TenSach=?, MaTheLoai=?, NhaXuatBan=?,"
                    + " NamXuatBan=?, SoLuongTon=?, DonGiaNhap=?, NgayNhap=? where MaSach="+"'"+value+"'";
            PreparedStatement pst1 = con.prepareStatement(query1);
            pst1.setString(1, txtMaSach.getText());
            pst1.setString(2, txtTenSach.getText());
            pst1.setInt(3, Integer.parseInt(txtTheLoai.getText()));
            pst1.setString(4, txtNhaXB.getText());
            pst1.setInt(5, cYearXB.getYear());
            pst1.setString(6, txtSL.getText());
            pst1.setString(7, txtGia.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(cDateNhap.getDate());
            pst1.setString(8, date);
            pst1.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tbSach.getModel();
            model.setRowCount(0);
            showDuLieu();
            JOptionPane.showMessageDialog(null, "Sửa thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        try {
                Connection con = ConnectSQL.getConnection();
                int row = tbSach.getSelectedRow();
                String value = (tbSach.getModel().getValueAt(row,0).toString());
                
                //Xóa ở bảng CT_TACGIA
                String query = "delete from CT_TACGIA where MaSach="+"'" +value +"'";
                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();
                
                //Xóa ở bảng Sach
                String query1 = "delete from SACH where MaSach="+"'" +value +"'";
                PreparedStatement pst1 = con.prepareStatement(query1);
                pst1.executeUpdate();
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
                showDuLieu();
        } catch (Exception ex) {     
                JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btAddTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddTLActionPerformed
        try {
            Connection con = ConnectSQL.getConnection();
            String  query1 = "insert into THELOAISACH (TenTheLoai) values (?)";
            PreparedStatement pst1 = con.prepareStatement(query1);
            //String addTL = "N'"+ txtAddTL.getText()+"'";
            pst1.setString(1, txtAddTL.getText());
            
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
        } catch (Exception ex) {
            
        }
        
    }//GEN-LAST:event_btAddTLActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddTL;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXem;
    private javax.swing.JButton btXoa;
    private com.toedter.calendar.JDateChooser cDateNhap;
    private com.toedter.calendar.JYearChooser cYearXB;
    private javax.swing.JComboBox<String> cbTG;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbMS;
    private javax.swing.JTable tbSach;
    private javax.swing.JTable tbTGia;
    private javax.swing.JTable tbTLoai;
    private javax.swing.JTextField txtAddTL;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNhaXB;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
