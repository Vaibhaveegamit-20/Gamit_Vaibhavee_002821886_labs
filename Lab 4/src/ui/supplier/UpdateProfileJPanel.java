/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.supplier;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import model.Supplier;
import ui.admin.ManageSuppliers;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**d
 *
 * @author vaibhaveegamit
 */
public class UpdateProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateProfileJPanel
     */
    JPanel workArea;
    Supplier supplier;
    
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;
    
    public UpdateProfileJPanel(JPanel workArea, Supplier supplier) {
        initComponents();
        this.workArea = workArea;
        this.supplier = supplier;
        
        FileFilter jpegFilter =  new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        FileFilter pngFilter = new FileNameExtensionFilter("PNG file", "png", "png");
        
        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.addChoosableFileFilter(pngFilter);
        fileChooser.setFileFilter(pngFilter);
        
        setSupplierProfile();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }

    private void setSupplierProfile(){
        txtName.setText(supplier.getSupplyName());
        txtDesc.setText(supplier.getDesc());
        if(supplier.getLogoImage() != null) imgLogo.setIcon(supplier.getLogoImage());
        else imgLogo.setText("No Logo");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        lblDescription.setText("Description:");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        jScrollPane1.setViewportView(txtDesc);

        lblLogo.setText("Logo:");

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAttach.setText("Attach");
        btnAttach.setEnabled(false);
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        btnRemove.setText("Remove");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setText("Update Supplier Profile");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescription)
                            .addComponent(lblName)
                            .addComponent(lblLogo))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(lblTitle)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAttach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove))
                    .addComponent(lblLogo)
                    .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addGap(87, 87, 87))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            URL url;
            try {
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                imgLogo.setIcon(logoImage);
            } catch(MalformedURLException ex){
                Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        logoImage = null;
        imgLogo.setIcon(logoImage);

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String Description = txtDesc.getText();
        supplier.setDesc(Description);
        supplier.setLogoImage(logoImage);
        
        if(supplier.getLogoImage() != null) imgLogo.setIcon(supplier.getLogoImage());
        else imgLogo.setText("No Logo");
        JOptionPane.showMessageDialog(null, "Supplier Profile Updated successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(false);
        txtDesc.setEditable(true);
       // imgLogo.setIcon(logoImage);
       
        btnAttach.setEnabled(true);
        btnRemove.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}