/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisteminformasipuskesmas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class BerandaFormPetugas extends javax.swing.JFrame {

    /**
     * Creates new form BerandaFormPetugas
     */
    public BerandaFormPetugas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlBeranda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlPasien = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlDokter = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlPetugas = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnlFarmasi = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pnlKeluar = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        pnlRekamMedis = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblInfoAplikasi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(228, 241, 254));
        panel1.setMinimumSize(new java.awt.Dimension(1680, 945));
        panel1.setPreferredSize(new java.awt.Dimension(1680, 945));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(10, 61, 98));

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/closeicon.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minimizeicon.png"))); // NOI18N
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClose)
                    .addComponent(lblMinimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, -1));

        jPanel1.setBackground(new java.awt.Color(54, 70, 78));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBeranda.setBackground(new java.awt.Color(47, 54, 64));
        pnlBeranda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBeranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBerandaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBerandaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBerandaMouseExited(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-beranda.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Beranda");

        javax.swing.GroupLayout pnlBerandaLayout = new javax.swing.GroupLayout(pnlBeranda);
        pnlBeranda.setLayout(pnlBerandaLayout);
        pnlBerandaLayout.setHorizontalGroup(
            pnlBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBerandaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBerandaLayout.setVerticalGroup(
            pnlBerandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlBerandaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(pnlBeranda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 80));

        pnlPasien.setBackground(new java.awt.Color(54, 70, 78));
        pnlPasien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPasien.setPreferredSize(new java.awt.Dimension(240, 80));
        pnlPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPasienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPasienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPasienMouseExited(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-pasien.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pasien");

        javax.swing.GroupLayout pnlPasienLayout = new javax.swing.GroupLayout(pnlPasien);
        pnlPasien.setLayout(pnlPasienLayout);
        pnlPasienLayout.setHorizontalGroup(
            pnlPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPasienLayout.setVerticalGroup(
            pnlPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasienLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnlPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 240, 80));

        pnlDokter.setBackground(new java.awt.Color(54, 70, 78));
        pnlDokter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDokter.setPreferredSize(new java.awt.Dimension(240, 80));
        pnlDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDokterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDokterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDokterMouseExited(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-dokter.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dokter");

        javax.swing.GroupLayout pnlDokterLayout = new javax.swing.GroupLayout(pnlDokter);
        pnlDokter.setLayout(pnlDokterLayout);
        pnlDokterLayout.setHorizontalGroup(
            pnlDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDokterLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDokterLayout.setVerticalGroup(
            pnlDokterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDokterLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnlDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 80));

        pnlPetugas.setBackground(new java.awt.Color(54, 70, 78));
        pnlPetugas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPetugas.setPreferredSize(new java.awt.Dimension(240, 80));
        pnlPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPetugasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPetugasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPetugasMouseExited(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-petugas.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Petugas");

        javax.swing.GroupLayout pnlPetugasLayout = new javax.swing.GroupLayout(pnlPetugas);
        pnlPetugas.setLayout(pnlPetugasLayout);
        pnlPetugasLayout.setHorizontalGroup(
            pnlPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPetugasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        pnlPetugasLayout.setVerticalGroup(
            pnlPetugasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(pnlPetugasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 80));

        pnlFarmasi.setBackground(new java.awt.Color(54, 70, 78));
        pnlFarmasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFarmasi.setPreferredSize(new java.awt.Dimension(240, 80));
        pnlFarmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlFarmasiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlFarmasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlFarmasiMouseExited(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-farmasi.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Farmasi");

        javax.swing.GroupLayout pnlFarmasiLayout = new javax.swing.GroupLayout(pnlFarmasi);
        pnlFarmasi.setLayout(pnlFarmasiLayout);
        pnlFarmasiLayout.setHorizontalGroup(
            pnlFarmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFarmasiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFarmasiLayout.setVerticalGroup(
            pnlFarmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFarmasiLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnlFarmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 80));

        pnlKeluar.setBackground(new java.awt.Color(54, 70, 78));
        pnlKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlKeluar.setPreferredSize(new java.awt.Dimension(240, 80));
        pnlKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlKeluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlKeluarMouseExited(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-keluar.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Keluar");

        javax.swing.GroupLayout pnlKeluarLayout = new javax.swing.GroupLayout(pnlKeluar);
        pnlKeluar.setLayout(pnlKeluarLayout);
        pnlKeluarLayout.setHorizontalGroup(
            pnlKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKeluarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKeluarLayout.setVerticalGroup(
            pnlKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKeluarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel18)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(pnlKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 240, 80));

        pnlRekamMedis.setBackground(new java.awt.Color(54, 70, 78));
        pnlRekamMedis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRekamMedis.setPreferredSize(new java.awt.Dimension(240, 80));
        pnlRekamMedis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRekamMedisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRekamMedisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRekamMedisMouseExited(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-rekammedis.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rekam Medis");

        javax.swing.GroupLayout pnlRekamMedisLayout = new javax.swing.GroupLayout(pnlRekamMedis);
        pnlRekamMedis.setLayout(pnlRekamMedisLayout);
        pnlRekamMedisLayout.setHorizontalGroup(
            pnlRekamMedisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRekamMedisLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRekamMedisLayout.setVerticalGroup(
            pnlRekamMedisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(pnlRekamMedisLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pnlRekamMedis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 240, 80));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 240, 820));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("INFO APLIKASI");

        jPanel4.setPreferredSize(new java.awt.Dimension(700, 300));

        lblInfoAplikasi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfoAplikasi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInfoAplikasi.setText("<html>\n<p>Sistem Informasi Puskesmas atau SIP merupakan sebuah aplikasi desktop yang digunakan oleh petugas puskesmas sehingga akan mempermudah dan mempercepat pekerjaannya dalam mengolah data-data puskesmas.</p>\n<br>\nManfaat Sistem Informasi Puskesmas\n<ol>\n<li>Mempermudah petugas  untuk mendata pasien yang ada di puskesmas.</li>\n<li>Memudahkan dalam pembuatan laporan-laporan seperti rekam medis, obat-obatan dan sebagainya.</li>\n<li>Mengurangi kesalahan saat proses penginputan data dan lebih efektif dan efesien.</li>\n<li>Menangani masalah pengolahan data pasien di puskesmas.</li>\n<li>Mempermudah Pengolahan Data data di puskesmas.</li>\n</ol>\n</html>");
        lblInfoAplikasi.setToolTipText("");
        lblInfoAplikasi.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfoAplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInfoAplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(442, Short.MAX_VALUE))
        );

        panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 128, 1440, 820));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo-SIP_Menu.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 70));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 117, 188));
        jLabel2.setText("SISTEM INFORMASI PUSKESMAS");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 62, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        int answer = JOptionPane.showOptionDialog(this, "Ingin keluar aplikasi?", "Keluar Aplikasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(answer==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void pnlBerandaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBerandaMouseClicked
        // TODO add your handling code here:
        BerandaFormPetugas brdfp = new BerandaFormPetugas();
        brdfp.setVisible(true);
        brdfp.pack();
        brdfp.setLocationRelativeTo(null);
        brdfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pnlBerandaMouseClicked

    private void pnlBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBerandaMouseEntered
        // TODO add your handling code here:
        pnlBeranda.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlBerandaMouseEntered

    private void pnlBerandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBerandaMouseExited
        // TODO add your handling code here:
        pnlBeranda.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlBerandaMouseExited

    private void pnlPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPasienMouseClicked
        // TODO add your handling code here:
        PasienFormPetugas psnfp = new PasienFormPetugas();
        psnfp.setVisible(true);
        psnfp.pack();
        psnfp.setLocationRelativeTo(null);
        psnfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pnlPasienMouseClicked

    private void pnlPasienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPasienMouseEntered
        // TODO add your handling code here:
        pnlPasien.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlPasienMouseEntered

    private void pnlPasienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPasienMouseExited
        // TODO add your handling code here:
        pnlPasien.setBackground(new Color(54,70,78));
    }//GEN-LAST:event_pnlPasienMouseExited

    private void pnlDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDokterMouseClicked
        // TODO add your handling code here:
        DokterFormPetugas dtrfp = new DokterFormPetugas();
        dtrfp.setVisible(true);
        dtrfp.pack();
        dtrfp.setLocationRelativeTo(null);
        dtrfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pnlDokterMouseClicked

    private void pnlDokterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDokterMouseEntered
        // TODO add your handling code here:
        pnlDokter.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlDokterMouseEntered

    private void pnlDokterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDokterMouseExited
        // TODO add your handling code here:
        pnlDokter.setBackground(new Color(54,70,78));
    }//GEN-LAST:event_pnlDokterMouseExited

    private void pnlPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPetugasMouseClicked
        // TODO add your handling code here:
        PetugasFormPetugas ptgfp = new PetugasFormPetugas();
        ptgfp.setVisible(true);
        ptgfp.pack();
        ptgfp.setLocationRelativeTo(null);
        ptgfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pnlPetugasMouseClicked

    private void pnlPetugasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPetugasMouseEntered
        // TODO add your handling code here:
        pnlPetugas.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlPetugasMouseEntered

    private void pnlPetugasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPetugasMouseExited
        // TODO add your handling code here:
        pnlPetugas.setBackground(new Color(54,70,78));
    }//GEN-LAST:event_pnlPetugasMouseExited

    private void pnlFarmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFarmasiMouseClicked
        // TODO add your handling code here:
        FarmasiFormPetugas fmsfp = new FarmasiFormPetugas();
        fmsfp.setVisible(true);
        fmsfp.pack();
        fmsfp.setLocationRelativeTo(null);
        fmsfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pnlFarmasiMouseClicked

    private void pnlFarmasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFarmasiMouseEntered
        // TODO add your handling code here:
        pnlFarmasi.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlFarmasiMouseEntered

    private void pnlFarmasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlFarmasiMouseExited
        // TODO add your handling code here:
        pnlFarmasi.setBackground(new Color(54,70,78));
    }//GEN-LAST:event_pnlFarmasiMouseExited

    private void pnlKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKeluarMouseClicked
        // TODO add your handling code here:
        int answer = JOptionPane.showOptionDialog(this, "Ingin keluar akun?", "Keluar Akun", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if(answer==JOptionPane.YES_OPTION)
        {
            LoginForm lgf = new LoginForm();
            lgf.setVisible(true);
            lgf.pack();
            lgf.setLocationRelativeTo(null);
            lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_pnlKeluarMouseClicked

    private void pnlKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKeluarMouseEntered
        // TODO add your handling code here:
        pnlKeluar.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlKeluarMouseEntered

    private void pnlKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlKeluarMouseExited
        // TODO add your handling code here:
        pnlKeluar.setBackground(new Color(54,70,78));
    }//GEN-LAST:event_pnlKeluarMouseExited

    private void pnlRekamMedisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRekamMedisMouseClicked
        // TODO add your handling code here:
        RekamMedisFormPetugas rmfp = new RekamMedisFormPetugas();
        rmfp.setVisible(true);
        rmfp.pack();
        rmfp.setLocationRelativeTo(null);
        rmfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_pnlRekamMedisMouseClicked

    private void pnlRekamMedisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRekamMedisMouseEntered
        // TODO add your handling code here:
        pnlRekamMedis.setBackground(new Color(47,54,64));
    }//GEN-LAST:event_pnlRekamMedisMouseEntered

    private void pnlRekamMedisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRekamMedisMouseExited
        // TODO add your handling code here:
        pnlRekamMedis.setBackground(new Color(54,70,78));
    }//GEN-LAST:event_pnlRekamMedisMouseExited

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
            java.util.logging.Logger.getLogger(BerandaFormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BerandaFormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BerandaFormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BerandaFormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BerandaFormPetugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblInfoAplikasi;
    private javax.swing.JLabel lblMinimize;
    private java.awt.Panel panel1;
    private javax.swing.JPanel pnlBeranda;
    private javax.swing.JPanel pnlDokter;
    private javax.swing.JPanel pnlFarmasi;
    private javax.swing.JPanel pnlKeluar;
    private javax.swing.JPanel pnlPasien;
    private javax.swing.JPanel pnlPetugas;
    private javax.swing.JPanel pnlRekamMedis;
    // End of variables declaration//GEN-END:variables
}
