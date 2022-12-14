/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarpan.appspp.LuthfiDhiyaRamadhan.views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tarpan.appspp.LuthfiDhiyaRamadhan.config.Koneksi;

/**
 *
 * @author TARPAN
 */
public class TransaksiPembayaranViews extends javax.swing.JFrame {

    /**
     * Creates new form TransaksiPembayaranViews
     */
    public TransaksiPembayaranViews() {
        initComponents();
        tampilDataTransaksi();
        tampilComboPetugas();
        tampilComboNominal();
        tampilComboSiswa();
        
    }
int _siswa;
    int _petugas;
    int _nominal;
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        txtIdPembayaran = new javax.swing.JTextField();
        cbNamaPetugas = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbNamaSiswa = new javax.swing.JComboBox();
        dateTanggalBayar = new com.toedter.calendar.JDateChooser();
        txtBulanDibayar = new javax.swing.JTextField();
        txtTahunDibayar = new javax.swing.JTextField();
        cbNominal = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtJumlahBayar = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPembayaran = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setText("TRANSAKSI PEMBAYARAN");

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarpan/appspp/LuthfiDhiyaRamadhan/assets/icons8_left_arrow_32px_1.png"))); // NOI18N
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        cbNamaPetugas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih..." }));
        cbNamaPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamaPetugasActionPerformed(evt);
            }
        });

        jLabel2.setText("ID_PEMBAYARAN :");

        jLabel3.setText("NAMA PETUGAS :");

        jLabel4.setText("NAMA SISWA :");

        jLabel5.setText("TANGGAL BAYAR :");

        jLabel6.setText("BULAN DIBAYAR :");

        jLabel7.setText("TAHUN DIBAYAR :");

        cbNamaSiswa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih..." }));
        cbNamaSiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNamaSiswaActionPerformed(evt);
            }
        });

        cbNominal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih..." }));
        cbNominal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNominalActionPerformed(evt);
            }
        });

        jLabel8.setText("NOMINAL SPP :");

        jLabel9.setText("JUMLAH BAYAR :");

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblPembayaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPembayaran);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBulanDibayar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateTanggalBayar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                            .addComponent(cbNamaSiswa, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbNamaPetugas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdPembayaran)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJumlahBayar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTahunDibayar)
                                    .addComponent(cbNominal, 0, 421, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTambah, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbNamaPetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnTambah)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dateTanggalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtBulanDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTahunDibayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
        DashboardViews dashboard = new DashboardViews();
        dashboard.dashAdmin();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void cbNamaPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamaPetugasActionPerformed
        // TODO add your handling code here:
        String inputPetugas = cbNamaPetugas.getSelectedItem().toString();
        
        try {
            Connection con = new Koneksi ().konek();
            String sql = "SELECT * FROM petugas WHERE nama_petugas =?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputPetugas);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               _petugas = Integer.parseInt(rs.getString("id_petugas"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
    }//GEN-LAST:event_cbNamaPetugasActionPerformed

    private void cbNamaSiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNamaSiswaActionPerformed
        // TODO add your handling code here:
        String inputSiswa = cbNamaSiswa.getSelectedItem().toString();
        
        try {
            Connection con = new Koneksi ().konek();
            String sql = "SELECT * FROM siswa WHERE nama =?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputSiswa);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               _siswa = Integer.parseInt(rs.getString("nisn"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cbNamaSiswaActionPerformed

    private void cbNominalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNominalActionPerformed
        // TODO add your handling code here:
        String inputNominal = cbNominal.getSelectedItem().toString();
        
        try {
            Connection con = new Koneksi ().konek();
            String sql = "SELECT * FROM spp WHERE nominal =?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputNominal);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
               _nominal = Integer.parseInt(rs.getString("id_spp"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cbNominalActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        String inputId = txtIdPembayaran.getText();
        int inputNamaPetugas = _petugas;
        int inputNamaSiswa = _siswa;
        String inputTanggalBayar = sdf.format(dateTanggalBayar.getDate());
        String inputBulanDibayar = txtBulanDibayar.getText();
        String inputTahunDibayar = txtTahunDibayar.getText();
        int inputNominal = _nominal;
        String jumlahbayar = txtJumlahBayar.getText();
        try {
            Connection con = new Koneksi().konek();
            String sql = "INSERT INTO pembayaran VALUES (?,?,?,?,?,?,?,?)" ;
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputId);
            ps.setInt(2, inputNamaPetugas);
            ps.setInt(3, inputNamaSiswa);
            ps.setString(4, inputTanggalBayar);
            ps.setString(5, inputBulanDibayar);
            ps.setString(6, inputTahunDibayar);
            ps.setInt(7, inputNominal);
            ps.setString(8, jumlahbayar);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Data Berhasil Ditambahkan");
            tampilDataTransaksi();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        String inputId = txtIdPembayaran.getText();
        
        try {
            Connection con = new Koneksi ().konek();
            String sql = "DELETE FROM pembayaran WHERE id_pembayaran =?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, inputId);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Berhasil Menghapus Data");
           tampilDataTransaksi();
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransaksiPembayaranViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiPembayaranViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiPembayaranViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiPembayaranViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiPembayaranViews().setVisible(true);
            }
        });
    }
    
   
    
    public void tampilComboPetugas (){
        try {
            Connection con = new Koneksi().konek();
            String sql = "SELECT * FROM petugas ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
               cbNamaPetugas.addItem(rs.getString("nama_petugas"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }
    
    public void tampilComboSiswa (){
        try {
            Connection con = new Koneksi().konek();
            String sql = "SELECT * FROM siswa ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
               cbNamaSiswa.addItem(rs.getString("nama"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }
    
    public void tampilComboNominal (){
        try {
            Connection con = new Koneksi().konek();
            String sql = "SELECT * FROM spp ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
               cbNominal.addItem(rs.getString("nominal"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
    }
    public void tampilDataTransaksi (){
        String [] judul = {"ID_PEMBAYARAN", "NAMA PETUGAS","NAMA SISWA","TANGGAL BAYAR", "BULAN DIBAYAR","TAHUN DIBAYAR", "NOMINAL SPP", "JUMLAH BAYAR"};
        DefaultTableModel model;
        
        model = new DefaultTableModel(judul, 0);
        tblPembayaran.setModel(model);
        
        try {
            Connection con = new Koneksi().konek();
            String sql = "SELECT pembayaran.*, siswa.nama, petugas.nama_petugas, spp.nominal FROM pembayaran INNER JOIN siswa ON pembayaran.nisn = siswa.nisn INNER JOIN petugas ON pembayaran.id_petugas = petugas.id_petugas INNER JOIN spp ON spp.id_spp = siswa.id_spp;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                String id= rs.getString ("id_pembayaran");
                String nm_petugas= rs.getString("nama_petugas");
                String nama = rs.getString("nama");
                String tgl_bayar= rs.getString ("tgl_bayar");
                String bln_bayar= rs.getString("bulan_bayar");
                String thn_bayar= rs.getString("tahun_bayar");
                String nominal= rs.getString("nominal");
                 String jumlah= rs.getString("jumlah_pembayaran");
                String [] data = {id,nm_petugas,nama,tgl_bayar,bln_bayar, thn_bayar, nominal, jumlah};
                model.addRow(data);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
                
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cbNamaPetugas;
    private javax.swing.JComboBox cbNamaSiswa;
    private javax.swing.JComboBox cbNominal;
    private com.toedter.calendar.JDateChooser dateTanggalBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPembayaran;
    private javax.swing.JTextField txtBulanDibayar;
    private javax.swing.JTextField txtIdPembayaran;
    private javax.swing.JTextField txtJumlahBayar;
    private javax.swing.JTextField txtTahunDibayar;
    // End of variables declaration//GEN-END:variables
}
