/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycuahanglaptop;

import Entity.ThongTinMay;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Đức Hùng
 */
public class frmThongTinMay extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinMay
     */
    public frmThongTinMay() throws SQLException, ClassNotFoundException, ParseException {
        initComponents();
        LoadData2Table();
        LoadData2Control();
    }
    
    private void LoadData2Table() throws SQLException, ClassNotFoundException
    {
            // Lấy danh sách sinh viên
            List<ThongTinMay>  lstIn4 = DAO.DAOThongTinMay.getAllMT();
            //--- Thêm các tiêu đề cho cột của bảng hiển thị
            DefaultTableModel tblModel = new DefaultTableModel();
            tblModel.addColumn("Mã máy tính");
            tblModel.addColumn("Tên máy tính");
            tblModel.addColumn("Số lượng");
            tblModel.addColumn("Giá bán");
            //--- add lần lượt các row
           for (ThongTinMay s : lstIn4) {
                Vector<String> row = new Vector<String>();
                row.addElement(s.getMaMT());
                row.addElement(s.getTenMT());
                row.addElement(String.valueOf(s.getSoluong()));
                row.addElement(String.valueOf(s.getGia()));
               tblModel.addRow(row);
            }
            tblIn4.setModel(tblModel);
    }
    private void LoadData2Control() throws SQLException, ClassNotFoundException, ParseException
    {
        if (tblIn4.getSelectedRow() != -1) {

            int i = tblIn4.getSelectedRow();
            
            
            List<ThongTinMay> lstIn4 = DAO.DAOThongTinMay.getAllMT();
            
            
            ThongTinMay mt1 = lstIn4.get(i);
            //--- Set giá trị cho các control
            txtMamt.setText(mt1.getMaMT());
            txtTenmay.setText(mt1.getTenMT());
            txtSoluong.setText(String.valueOf(mt1.getSoluong()));
            txtGia.setText(String.valueOf(mt1.getGia()));
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMamt = new javax.swing.JTextField();
        txtTenmay = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIn4 = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        tblIn4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblIn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIn4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblIn4);

        btnThem.setText("Thêm mới");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Mã máy tính");

        btnReset.setText("Làm mới ");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tên máy tính");

        jButton3.setText("Chỉnh sửa");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Số lượng");

        btnDel.setText("Xóa");
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Giá bán");

        jLabel5.setText("Tìm kiếm");

        jButton1.setText("Tìm kiếm");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(22, 22, 22)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMamt, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenmay, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenmay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        ThongTinMay s = new ThongTinMay();
        s.setMaMT(txtMamt.getText());
        s.setTenMT(txtTenmay.getText());
        s.setSoluong(Integer.valueOf(txtSoluong.getText()));
        s.setGia(Integer.valueOf(txtGia.getText()));
        try {
            DAO.DAOThongTinMay.InsertMT(s);
            LoadData2Table();
            JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        txtMamt.setText("");
        txtTenmay.setText("");
        txtSoluong.setText("");
        txtGia.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseClicked
        // TODO add your handling code here:
        try {
            DAO.DAOThongTinMay.DeleteMT(txtMamt.getText());
            LoadData2Table();
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDelMouseClicked

    private void tblIn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIn4MouseClicked
        // TODO add your handling code here:
        try {
            try {
                // TODO add your handling code here:
                LoadData2Control();
            } catch (ParseException ex) {
                Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblIn4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        ThongTinMay s = new ThongTinMay();
        s.setMaMT(txtMamt.getText());
        s.setTenMT(txtTenmay.getText());
        s.setSoluong(s.getSoluong());
        s.setGia(s.getGia());
        try {
            DAO.DAOThongTinMay.UpdateMT(s);
            LoadData2Table();
            JOptionPane.showMessageDialog(this, "Sửa thành công!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
               
        try {
            List<ThongTinMay>  lstIn4;
            lstIn4 = DAO.DAOThongTinMay.getAllMTbyName(txtSearch.getText());
            //--- Thêm các tiêu đề cho cột của bảng hiển thị
            DefaultTableModel tblModel = new DefaultTableModel();
            tblModel.addColumn("Mã máy tính");
            tblModel.addColumn("Tên máy tính");
            tblModel.addColumn("Số lượng");
            tblModel.addColumn("Giá bán");
            //--- add lần lượt các row
           for (ThongTinMay s : lstIn4) {
                Vector<String> row = new Vector<String>();
                row.addElement(s.getMaMT());
                row.addElement(s.getTenMT());
                row.addElement(String.valueOf(s.getSoluong()));
                row.addElement(String.valueOf(s.getGia()));
               tblModel.addRow(row);
            }
            tblIn4.setModel(tblModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(frmThongTinMay.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIn4;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMamt;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTenmay;
    // End of variables declaration//GEN-END:variables
}
