/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Logic.Global;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Fernanda and Karla
 */
public class FrmSettingsNew extends javax.swing.JFrame {

    /**
     * Creates new form FrmSettingsNew
     */
    public FrmSettingsNew() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WallpaperLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnApply = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSize = new javax.swing.JLabel();
        lblNumberSugarCubes = new javax.swing.JLabel();
        lblRows = new javax.swing.JLabel();
        lblColumnes = new javax.swing.JLabel();
        txtFiles = new javax.swing.JTextField();
        txtColumnes = new javax.swing.JTextField();
        cbxSugarCubes = new javax.swing.JComboBox<>();
        cbxSugarWine = new javax.swing.JComboBox<>();
        lblSugarWine = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNickname = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        lblSugarPoison = new javax.swing.JLabel();
        cbxSugarPoison = new javax.swing.JComboBox<>();
        btnCharge = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        WallpaperLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Fondo 5 .jpg"))); // NOI18N

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnApply.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        btnApply.setText("APPLY");
        btnApply.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApply.setBorderPainted(false);
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 110, -1));

        btnBack.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 110, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        lblSize.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSize.setForeground(new java.awt.Color(255, 255, 255));
        lblSize.setText("Size:");

        lblNumberSugarCubes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumberSugarCubes.setForeground(new java.awt.Color(255, 255, 255));
        lblNumberSugarCubes.setText("Number of Sugar Cubes:");

        lblRows.setForeground(new java.awt.Color(255, 255, 255));
        lblRows.setText("Rows:");

        lblColumnes.setForeground(new java.awt.Color(255, 255, 255));
        lblColumnes.setText("Columns:");

        cbxSugarCubes.setBackground(new java.awt.Color(214, 151, 21));
        cbxSugarCubes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxSugarCubes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbxSugarCubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSugarCubesActionPerformed(evt);
            }
        });

        cbxSugarWine.setBackground(new java.awt.Color(214, 151, 21));
        cbxSugarWine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxSugarWine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblSugarWine.setForeground(new java.awt.Color(255, 255, 255));
        lblSugarWine.setText("Sugar cube with wine:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Normal sugar cube:");

        lblNickname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNickname.setForeground(new java.awt.Color(255, 255, 255));
        lblNickname.setText("Nickname:");

        lblSugarPoison.setForeground(new java.awt.Color(255, 255, 255));
        lblSugarPoison.setText("Sugar cube with poison:");

        cbxSugarPoison.setBackground(new java.awt.Color(214, 151, 21));
        cbxSugarPoison.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxSugarPoison.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "6", "7", "8", "9", "10", "11", "12" }));

        btnCharge.setFont(new java.awt.Font("Chiller", 1, 18)); // NOI18N
        btnCharge.setText("CHARGE");
        btnCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChargeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblRows)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblColumnes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColumnes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSugarWine)
                            .addComponent(jLabel2)
                            .addComponent(lblSugarPoison))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSugarPoison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSugarWine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSugarCubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNickname)
                            .addComponent(lblSize)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblNumberSugarCubes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnCharge)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblNickname)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSize)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColumnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColumnes)
                            .addComponent(lblRows))))
                .addGap(27, 27, 27)
                .addComponent(lblNumberSugarCubes)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxSugarCubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSugarWine)
                    .addComponent(cbxSugarWine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSugarPoison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSugarPoison))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 330, 310));

        jButton1.setFont(new java.awt.Font("Chiller", 1, 24)); // NOI18N
        jButton1.setText("SETTINGS");
        jButton1.setActionCommand("[204,102,0]");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 170, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Fondo 5 .jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 540, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        String nickname = txtNickname.getText();
        String columneSize = (txtColumnes.getText());
        String fileSize = (txtFiles.getText());
        String sugarCubes = (cbxSugarCubes.getItemAt(cbxSugarCubes.getSelectedIndex()));
        String sugarWine = (cbxSugarWine.getItemAt(cbxSugarWine.getSelectedIndex()));
        String sugarPoisson = (cbxSugarPoison.getItemAt(cbxSugarPoison.getSelectedIndex()));

        try { //In this Try, the data is stored in the binary files
            ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(nickname));
            save.writeObject(nickname);
            save.writeObject(columneSize);
            save.writeObject(fileSize);
            save.writeObject(sugarCubes);
            save.writeObject(sugarWine);
            save.writeObject(sugarPoisson);

            Global oGlobal = new Global();
            oGlobal.setNickName(nickname.toString());
            oGlobal.setColumns(Integer.valueOf(columneSize.toString()));
            oGlobal.setPosion(Integer.valueOf(sugarPoisson.toString()));
            oGlobal.setSugar(Integer.valueOf(sugarCubes.toString()));
            oGlobal.setWine(Integer.valueOf(sugarWine.toString()));
            oGlobal.setRows(Integer.valueOf(fileSize.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //After configurations go to game window
        FrmGame game = new FrmGame();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnApplyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxSugarCubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSugarCubesActionPerformed
    }//GEN-LAST:event_cbxSugarCubesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //To open the main window
        FrmStart start = new FrmStart();
        start.setLocationRelativeTo(null);
        start.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChargeActionPerformed
        //With the nickname it searches the data saved according to the player
        String nickname = txtNickname.getText();

        try { //In this Try, the data is searched in binary files and displayed
            ObjectInputStream find = new ObjectInputStream(new FileInputStream(nickname));
            Object nick = find.readObject();
            Object columne = find.readObject();
            Object file = find.readObject();
            Object sugar = find.readObject();
            Object wine = find.readObject();
            Object poisson = find.readObject();
            txtNickname.setText(nick.toString());
            txtColumnes.setText(columne.toString());
            txtFiles.setText(file.toString());
            cbxSugarCubes.setSelectedItem(sugar.toString());
            cbxSugarWine.setSelectedItem(wine.toString());
            cbxSugarPoison.setSelectedItem(poisson.toString());
            //

            //
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnChargeActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSettingsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSettingsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSettingsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSettingsNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSettingsNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallpaperLabel1;
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCharge;
    private javax.swing.JComboBox<String> cbxSugarCubes;
    private javax.swing.JComboBox<String> cbxSugarPoison;
    private javax.swing.JComboBox<String> cbxSugarWine;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblColumnes;
    private javax.swing.JLabel lblNickname;
    private javax.swing.JLabel lblNumberSugarCubes;
    private javax.swing.JLabel lblRows;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblSugarPoison;
    private javax.swing.JLabel lblSugarWine;
    private javax.swing.JTextField txtColumnes;
    private javax.swing.JTextField txtFiles;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
