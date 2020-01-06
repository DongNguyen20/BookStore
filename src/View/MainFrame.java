
package View;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        SetIcon();
        usingName.setText("(admin)");
    } 
    private void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("koala.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pfMain = new javax.swing.JPanel();
        lbBg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btLapHD = new javax.swing.JButton();
        mMenu = new javax.swing.JMenuBar();
        mTK = new javax.swing.JMenu();
        mTK_Thongtin = new javax.swing.JMenuItem();
        mTK_MatKhau = new javax.swing.JMenuItem();
        mTK_logOut = new javax.swing.JMenuItem();
        mTraCuu = new javax.swing.JMenu();
        mTC_Sach = new javax.swing.JMenuItem();
        mTC_Tgia = new javax.swing.JMenuItem();
        mTC_KH = new javax.swing.JMenuItem();
        mHelp = new javax.swing.JMenu();
        mGT = new javax.swing.JMenuItem();
        mBC = new javax.swing.JMenu();
        mBCKho = new javax.swing.JMenuItem();
        mBCDoanhThu = new javax.swing.JMenuItem();
        usingName = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BookStore");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);

        pfMain.setBackground(new java.awt.Color(255, 255, 255));

        lbBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bookstore.jpg"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thuvien.jpg"))); // NOI18N

        btLapHD.setBackground(new java.awt.Color(0, 153, 153));
        btLapHD.setForeground(new java.awt.Color(255, 255, 255));
        btLapHD.setText("Lập Hóa Đơn");
        btLapHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLapHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pfMainLayout = new javax.swing.GroupLayout(pfMain);
        pfMain.setLayout(pfMainLayout);
        pfMainLayout.setHorizontalGroup(
            pfMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfMainLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pfMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBg, javax.swing.GroupLayout.PREFERRED_SIZE, 666, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLapHD)
                        .addGap(108, 108, 108))))
        );
        pfMainLayout.setVerticalGroup(
            pfMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pfMainLayout.createSequentialGroup()
                .addComponent(lbBg, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(btLapHD)
                .addGap(25, 25, 25))
        );

        mMenu.setBackground(new java.awt.Color(255, 255, 255));

        mTK.setText("Tài khoản");

        mTK_Thongtin.setBackground(new java.awt.Color(255, 255, 255));
        mTK_Thongtin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infor.png"))); // NOI18N
        mTK_Thongtin.setText("Thông tin");
        mTK_Thongtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTK_ThongtinActionPerformed(evt);
            }
        });
        mTK.add(mTK_Thongtin);

        mTK_MatKhau.setBackground(new java.awt.Color(255, 255, 255));
        mTK_MatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        mTK_MatKhau.setText("Mật khẩu");
        mTK_MatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTK_MatKhauActionPerformed(evt);
            }
        });
        mTK.add(mTK_MatKhau);

        mTK_logOut.setBackground(new java.awt.Color(255, 255, 255));
        mTK_logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        mTK_logOut.setText("Đăng Xuất");
        mTK_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTK_logOutActionPerformed(evt);
            }
        });
        mTK.add(mTK_logOut);

        mMenu.add(mTK);

        mTraCuu.setText("Tra cứu");

        mTC_Sach.setBackground(new java.awt.Color(255, 255, 255));
        mTC_Sach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.png"))); // NOI18N
        mTC_Sach.setText("Sách");
        mTC_Sach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTC_SachActionPerformed(evt);
            }
        });
        mTraCuu.add(mTC_Sach);

        mTC_Tgia.setBackground(new java.awt.Color(255, 255, 255));
        mTC_Tgia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconAuthor.png"))); // NOI18N
        mTC_Tgia.setText("Tác giả");
        mTC_Tgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTC_TgiaActionPerformed(evt);
            }
        });
        mTraCuu.add(mTC_Tgia);

        mTC_KH.setBackground(new java.awt.Color(255, 255, 255));
        mTC_KH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customer.png"))); // NOI18N
        mTC_KH.setText("Khách Hàng");
        mTC_KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTC_KHActionPerformed(evt);
            }
        });
        mTraCuu.add(mTC_KH);

        mMenu.add(mTraCuu);

        mHelp.setText("Help");

        mGT.setBackground(new java.awt.Color(255, 255, 255));
        mGT.setText("Giới Thiệu");
        mGT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mGTActionPerformed(evt);
            }
        });
        mHelp.add(mGT);

        mMenu.add(mHelp);

        mBC.setText("Báo Cáo");

        mBCKho.setBackground(new java.awt.Color(255, 255, 255));
        mBCKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kho.png"))); // NOI18N
        mBCKho.setText("Kho");
        mBCKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBCKhoActionPerformed(evt);
            }
        });
        mBC.add(mBCKho);

        mBCDoanhThu.setBackground(new java.awt.Color(255, 255, 255));
        mBCDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        mBCDoanhThu.setText("Doanh Thu");
        mBCDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBCDoanhThuActionPerformed(evt);
            }
        });
        mBC.add(mBCDoanhThu);

        mMenu.add(mBC);

        usingName.setForeground(new java.awt.Color(102, 204, 255));
        usingName.setText("(Chào Bạn)");
        mMenu.add(usingName);

        setJMenuBar(mMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pfMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //
    private void mTK_ThongtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTK_ThongtinActionPerformed
        User u = new User();
        u.setVisible(true);
    }//GEN-LAST:event_mTK_ThongtinActionPerformed

    private void mTK_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTK_logOutActionPerformed
        LogIn lg = new LogIn();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_mTK_logOutActionPerformed

    private void mTK_MatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTK_MatKhauActionPerformed
        ChangePass cp = new ChangePass();
        cp.setVisible(true);
       // dispose();
    }//GEN-LAST:event_mTK_MatKhauActionPerformed

    private void mGTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mGTActionPerformed
        AboutUs ab = new AboutUs();
        ab.setVisible(true);
       
    }//GEN-LAST:event_mGTActionPerformed

    private void mTC_SachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTC_SachActionPerformed
        Book b = new Book();
        b.setVisible(true);
    }//GEN-LAST:event_mTC_SachActionPerformed

    private void mTC_TgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTC_TgiaActionPerformed
        Author tg = new Author();
        tg.setVisible(true);
        
    }//GEN-LAST:event_mTC_TgiaActionPerformed

    private void mTC_KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTC_KHActionPerformed
        KhachHang kh = new KhachHang();
        kh.setVisible(true);
    }//GEN-LAST:event_mTC_KHActionPerformed

    private void btLapHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLapHDActionPerformed
        HoaDon hd = new HoaDon();
        hd.setVisible(true);
    }//GEN-LAST:event_btLapHDActionPerformed

    private void mBCKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBCKhoActionPerformed
        BaoCaoKho k= new BaoCaoKho();
        k.setVisible(true);
    }//GEN-LAST:event_mBCKhoActionPerformed

    private void mBCDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBCDoanhThuActionPerformed
        BaoCaoDoanhThu d =new BaoCaoDoanhThu();
        d.setVisible(true);
    }//GEN-LAST:event_mBCDoanhThuActionPerformed

   /* public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLapHD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBg;
    private javax.swing.JMenu mBC;
    private javax.swing.JMenuItem mBCDoanhThu;
    private javax.swing.JMenuItem mBCKho;
    private javax.swing.JMenuItem mGT;
    private javax.swing.JMenu mHelp;
    private javax.swing.JMenuBar mMenu;
    private javax.swing.JMenuItem mTC_KH;
    private javax.swing.JMenuItem mTC_Sach;
    private javax.swing.JMenuItem mTC_Tgia;
    private javax.swing.JMenu mTK;
    private javax.swing.JMenuItem mTK_MatKhau;
    private javax.swing.JMenuItem mTK_Thongtin;
    private javax.swing.JMenuItem mTK_logOut;
    private javax.swing.JMenu mTraCuu;
    private javax.swing.JPanel pfMain;
    private javax.swing.JMenu usingName;
    // End of variables declaration//GEN-END:variables

}
