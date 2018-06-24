/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dal.MuonTraDAO;
import dal.NhanVienDAO;
import dal.SachDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author hiep.tt166077
 */
public class GUIThongKeNV extends javax.swing.JFrame {

    /**
     * Creates new form GUIThongKeNV
     */
    int xx;
    int xy;
    int clickedButt = 0;
    
    public GUIThongKeNV() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(0, 150, 62));
    }

    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(1, 198, 83));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTK = new javax.swing.JTable();
        btn_dt = new javax.swing.JLabel();
        btn_gt = new javax.swing.JLabel();
        btn_ns = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(1, 198, 83));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel3MouseReleased(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tableTK.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableTK.setForeground(new java.awt.Color(51, 51, 51));
        tableTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableTK.setGridColor(new java.awt.Color(255, 255, 255));
        tableTK.setRowHeight(20);
        tableTK.setSelectionBackground(new java.awt.Color(1, 198, 83));
        jScrollPane1.setViewportView(tableTK);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 430, 360));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 159, -1, 370));

        btn_dt.setBackground(new java.awt.Color(1, 198, 83));
        btn_dt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_dt.setForeground(new java.awt.Color(255, 255, 255));
        btn_dt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_dt.setText("số đơn lập");
        btn_dt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dt.setOpaque(true);
        btn_dt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dtMouseClicked(evt);
            }
        });
        jPanel3.add(btn_dt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 130, 30));

        btn_gt.setBackground(new java.awt.Color(1, 198, 83));
        btn_gt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_gt.setForeground(new java.awt.Color(255, 255, 255));
        btn_gt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_gt.setText("giới tính");
        btn_gt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gt.setOpaque(true);
        btn_gt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gtMouseClicked(evt);
            }
        });
        jPanel3.add(btn_gt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 30));

        btn_ns.setBackground(new java.awt.Color(1, 198, 83));
        btn_ns.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_ns.setForeground(new java.awt.Color(255, 255, 255));
        btn_ns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ns.setText("nơi sống");
        btn_ns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ns.setOpaque(true);
        btn_ns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nsMouseClicked(evt);
            }
        });
        jPanel3.add(btn_ns, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thống kê");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(1, 198, 83));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_30px.png"))); // NOI18N
        jLabel3.setToolTipText("đóng chương trình");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Print_30px.png"))); // NOI18N
        jLabel4.setToolTipText("lưu/ in báo cáo");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons8_Reply_Arrow_30px_1.png"))); // NOI18N
        jLabel5.setToolTipText("quay lại");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dtMouseClicked
        // TODO add your handling code here:
        setLblColor(btn_dt);
        resetLblColor(btn_gt);
        resetLblColor(btn_ns);
        clickedButt = 3;
        try {
            MuonTraDAO.TK(tableTK, "SELECT MUON_TRA.MA_NHAN_VIEN AS [Mã nhân viên], NHAN_VIEN.TEN_NHAN_VIEN AS [Tên nhân viên], COUNT (MA_MUON_TRA) AS [Số lượng đơn cho mượn] FROM MUON_TRA, NHAN_VIEN WHERE NHAN_VIEN.MA_NHAN_VIEN = MUON_TRA.MA_NHAN_VIEN GROUP BY MUON_TRA.MA_NHAN_VIEN, NHAN_VIEN.TEN_NHAN_VIEN");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GUIThongKeNV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_dtMouseClicked

    private void btn_gtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gtMouseClicked
        try {
            // TODO add your handling code here:
            setLblColor(btn_gt);
            resetLblColor(btn_dt);
            resetLblColor(btn_ns);
            NhanVienDAO.TK(tableTK, "GIOI_TINH", "Giới tính");
            clickedButt = 1;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GUIThongKeDG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_gtMouseClicked

    private void btn_nsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nsMouseClicked
        // TODO add your handling code here:
//        setLblColor(btn_ns);
//        resetLblColor(btn_dt);
//        resetLblColor(btn_gt);
        
        try {
            // TODO add your handling code here:
            setLblColor(btn_ns);
            resetLblColor(btn_dt);
            resetLblColor(btn_gt);
            NhanVienDAO.TK(tableTK, "DIA_CHI", "Nơi sống");
            clickedButt = 2;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GUIThongKeNV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_nsMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:S
        if (clickedButt == 1)
            NhanVienDAO.TK_The_loai(tableTK, "Giới tính", "THỐNG KÊ SỐ LƯỢNG NHÂN VIÊN THEO GIỚI TÍNH");
        if (clickedButt == 2)
            NhanVienDAO.TK_The_loai(tableTK, "Nơi sống", "THỐNG KÊ SỐ LƯỢNG NHÂN VIÊN THEO NƠI SÔNG");
        if (clickedButt == 3)
            MuonTraDAO.InBieuMauThK(tableTK, "THỐNG KÊ SỐ LƯỢNG ĐƠN ĐÃ CHO MƯỢN THEO NHÂN VIÊN", "Mã nhân viên","Tên nhân viên", "Số đơn đã cho mượn");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        setOpacity((float)0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseReleased
        // TODO add your handling code here:
        setOpacity((float)1.0);
    }//GEN-LAST:event_jPanel3MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIThongKeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIThongKeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIThongKeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIThongKeNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIThongKeNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_dt;
    private javax.swing.JLabel btn_gt;
    private javax.swing.JLabel btn_ns;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTK;
    // End of variables declaration//GEN-END:variables
}
