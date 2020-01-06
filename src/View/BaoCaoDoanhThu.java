/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConnectSQL;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class BaoCaoDoanhThu extends javax.swing.JFrame {

 
    public BaoCaoDoanhThu() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spThang = new com.toedter.components.JSpinField();
        jLabel3 = new javax.swing.JLabel();
        cYear = new com.toedter.calendar.JYearChooser();
        btXem = new javax.swing.JButton();
        btPDF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDThu = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbTong = new javax.swing.JLabel();
        btAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Báo Cáo");
        setLocation(new java.awt.Point(500, 80));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Tháng");

        spThang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Năm");

        cYear.setBackground(new java.awt.Color(255, 255, 255));

        btXem.setBackground(new java.awt.Color(0, 153, 153));
        btXem.setForeground(new java.awt.Color(255, 255, 255));
        btXem.setText("Xem");
        btXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemActionPerformed(evt);
            }
        });

        btPDF.setBackground(new java.awt.Color(255, 255, 255));
        btPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pdf.png"))); // NOI18N
        btPDF.setText("Xuất");
        btPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spThang, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cYear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btPDF)
                .addGap(18, 18, 18)
                .addComponent(btXem)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btXem)
                        .addComponent(btPDF))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spThang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tbDThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Tên Sách", "Số Lượng Bán", "Giá", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tbDThu);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("THỐNG KÊ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("DOANH THU");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tổng :");

        lbTong.setText("0 ");

        btAll.setBackground(new java.awt.Color(0, 204, 102));
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAll)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbTong))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btAll)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemActionPerformed
        try {
            tbDThu.removeAll();
            String[] arr = { "Mã Sách","Tên Sách","Số Lượng Bán","Giá","Thành Tiền","Ngày Bán"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            Connection connect = ConnectSQL.getConnection();

            String thang = Integer.toString(spThang.getValue());
            String nam = Integer.toString(cYear.getValue());
            String query = "select CT_HOADON.MaSach, TenSach, SoLuong, DonGiaBan, ThanhTien, NgayLap\n" +
                "from SACH, CT_HOADON, HOADON\n" +
                "where CT_HOADON.MaSach= SACH.MaSach and CT_HOADON.SoHoaDon= HOADON.SoHoaDon\n" +
                "and Year(NgayLap)="+nam+"and Month(NgayLap)="+thang;
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("TenSach"));
                vector.add(rs.getString("SoLuong"));
                vector.add(rs.getString("DonGiaBan"));
                vector.add(rs.getString("ThanhTien"));
                vector.add(rs.getString("NgayLap"));
                model.addRow(vector);
            }
            tbDThu.setModel(model);
            float sum = 0; 
            for(int i =0 ; i< tbDThu.getRowCount();i++){
               sum += Float.parseFloat(tbDThu.getModel().getValueAt(i, 4).toString());
            }
            lbTong.setText(Float.toString(sum));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btXemActionPerformed

    private void btPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPDFActionPerformed
       
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x= j.showSaveDialog(this);
        
        if(x==JFileChooser.APPROVE_OPTION){
            path = j.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        String thang = Integer.toString(spThang.getValue());
        String nam = Integer.toString(cYear.getValue());
        String title = "Report month: "+thang +", year:"+nam +"\n";
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"report123.pdf"));
            
            doc.open();
            doc.add(new Paragraph(title));
            doc.add(new Paragraph(" "));
            doc.add(new Paragraph(" "));
          
            
            PdfPTable tb1 = new PdfPTable(6);
            
            //Them header
            tb1.addCell("Mã Sách");
            tb1.addCell("Tên Sách");
            tb1.addCell("SL");
            tb1.addCell("Giá");
            tb1.addCell("Thanh toán");
            tb1.addCell("Ngày bán");
            
            for(int i=0; i< tbDThu.getRowCount();i++){
                String maSach = tbDThu.getValueAt(i, 0).toString();
                String tenSach = tbDThu.getValueAt(i, 1).toString();
                String soLuong = tbDThu.getValueAt(i, 2).toString();
                String gia = tbDThu.getValueAt(i, 3).toString();
                String thanhTien = tbDThu.getValueAt(i, 4).toString();
                String ngayLap = tbDThu.getValueAt(i, 5).toString();
                
                tb1.addCell(maSach);
                tb1.addCell(tenSach);
                tb1.addCell(soLuong);
                tb1.addCell(gia);
                tb1.addCell(thanhTien);
                tb1.addCell(ngayLap);
                
            }
            
            doc.add(tb1);
            String tong = "Total: "+ lbTong.getText()+"dong";
            doc.add(new Paragraph(tong));
            JOptionPane.showMessageDialog(null, "Xuất pdf thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        doc.close();
    }//GEN-LAST:event_btPDFActionPerformed

    private void btAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllActionPerformed
        
        try {
            tbDThu.removeAll();
            String[] arr = { "Mã Sách","Tên Sách","Số Lượng Bán","Giá","Thành Tiền","Ngày Bán"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            Connection connect = ConnectSQL.getConnection();
            String query = "select CT_HOADON.MaSach, TenSach, SoLuong, DonGiaBan, ThanhTien, NgayLap\n" +
                "from SACH, CT_HOADON, HOADON\n" +
                "where CT_HOADON.MaSach= SACH.MaSach and CT_HOADON.SoHoaDon= HOADON.SoHoaDon";
                
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("TenSach"));
                vector.add(rs.getString("SoLuong"));
                vector.add(rs.getString("DonGiaBan"));
                vector.add(rs.getString("ThanhTien"));
                vector.add(rs.getString("NgayLap"));
                model.addRow(vector);
            }
            tbDThu.setModel(model);
            float sum = 0; 
            for(int i =0 ; i< tbDThu.getRowCount();i++){
               sum += Float.parseFloat(tbDThu.getModel().getValueAt(i, 4).toString());
            }
            lbTong.setText(Float.toString(sum));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btAllActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoCaoDoanhThu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAll;
    private javax.swing.JButton btPDF;
    private javax.swing.JButton btXem;
    private com.toedter.calendar.JYearChooser cYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTong;
    private com.toedter.components.JSpinField spThang;
    private javax.swing.JTable tbDThu;
    // End of variables declaration//GEN-END:variables
}
