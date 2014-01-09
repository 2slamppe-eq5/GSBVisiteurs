/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import ctrl.C_Abstrait;
import ctrl.C_Visiteur;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author btssio
 */
public class V_Visiteur extends V_Abstraite {
DefaultComboBoxModel mcbChercher;
DefaultComboBoxModel mcbLabo;
    /**
     * Creates new form V_Connexion
     */
    public V_Visiteur(C_Abstrait ctrlAbstrait) {
        super(ctrlAbstrait);
        initComponents();
        mcbChercher= new DefaultComboBoxModel();
        cbChercher.setModel(mcbChercher);
        mcbLabo= new DefaultComboBoxModel();
        cbLabo.setModel(mcbLabo);
    }

    public DefaultComboBoxModel getMcbLabo() {
        return mcbLabo;
    }

    public void setMcbLabo(DefaultComboBoxModel mcbLabo) {
        this.mcbLabo = mcbLabo;
    }

    public DefaultComboBoxModel getMcbChercher() {
        return mcbChercher;
    }

    public void setMcbChercher(DefaultComboBoxModel mcbChercher) {
        this.mcbChercher = mcbChercher;
    }

    public JComboBox getCbChercher() {
        return cbChercher;
    }

    public void setCbChercher(JComboBox cbChercher) {
        this.cbChercher = cbChercher;
    }

    public JComboBox getCbLabo() {
        return cbLabo;
    }

    public void setCbLabo(JComboBox cbLabo) {
        this.cbLabo = cbLabo;
    }

    public JTextField getTxtAdresse() {
        return txtAdresse;
    }

    public void setTxtAdresse(JTextField txtAdresse) {
        this.txtAdresse = txtAdresse;
    }

    public JTextField getTxtCodePostal() {
        return txtCodePostal;
    }

    public void setTxtCodePostal(JTextField txtCodePostal) {
        this.txtCodePostal = txtCodePostal;
    }

    public JTextField getTxtNom() {
        return txtNom;
    }

    public void setTxtNom(JTextField txtNom) {
        this.txtNom = txtNom;
    }

    public JTextField getTxtPrenom() {
        return txtPrenom;
    }

    public void setTxtPrenom(JTextField txtPrenom) {
        this.txtPrenom = txtPrenom;
    }

    public JTextField getTxtSecteur() {
        return txtSecteur;
    }

    public void setTxtSecteur(JTextField txtSecteur) {
        this.txtSecteur = txtSecteur;
    }

    public JTextField getTxtVille() {
        return txtVille;
    }

    public void setTxtVille(JTextField txtVille) {
        this.txtVille = txtVille;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFermer = new javax.swing.JToggleButton();
        lbVisiteurs = new javax.swing.JLabel();
        lbChercher = new javax.swing.JLabel();
        lbNom = new javax.swing.JLabel();
        lbPrenom = new javax.swing.JLabel();
        lbAdresse = new javax.swing.JLabel();
        lbVille = new javax.swing.JLabel();
        lbSecteur = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        cbChercher = new javax.swing.JComboBox();
        txtCodePostal = new javax.swing.JTextField();
        btnOk = new javax.swing.JToggleButton();
        txtNom = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtSecteur = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        lbLabo = new javax.swing.JLabel();
        btnPrecedent = new javax.swing.JToggleButton();
        btnSuivant = new javax.swing.JToggleButton();
        cbLabo = new javax.swing.JComboBox();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        btnFermer.setText("fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        lbVisiteurs.setText("Visiteurs");

        lbChercher.setText("Chercher");

        lbNom.setText("nom");

        lbPrenom.setText("prenom");

        lbAdresse.setText("adresse");

        lbVille.setText("ville");

        lbSecteur.setText("secteur");

        cbChercher.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChercherActionPerformed(evt);
            }
        });

        btnOk.setText("ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lbLabo.setText("labo");

        btnPrecedent.setText("precedent");
        btnPrecedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecedentActionPerformed(evt);
            }
        });

        btnSuivant.setText("suivant");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });

        cbLabo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLabo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLaboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(lbVisiteurs)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbChercher)
                    .addComponent(lbSecteur)
                    .addComponent(lbVille, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLabo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbNom)
                        .addComponent(lbPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPrecedent, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                        .addComponent(btnFermer, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLabo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSecteur)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(250, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbVisiteurs)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbChercher)
                    .addComponent(cbChercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNom)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrenom)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAdresse)
                    .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbVille)
                            .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSecteur)
                    .addComponent(txtSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLabo)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFermer)
                            .addComponent(btnPrecedent)
                            .addComponent(btnSuivant)))
                    .addComponent(cbLabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
         ((C_Visiteur)controleur).suivant();
    }//GEN-LAST:event_btnSuivantActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
          ((C_Visiteur)controleur).visiteurQuitter();
        
        
    }//GEN-LAST:event_btnFermerActionPerformed

    private void cbChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChercherActionPerformed
        ((C_Visiteur)controleur).visiteurSelectionner();
    }//GEN-LAST:event_cbChercherActionPerformed

    private void cbLaboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLaboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLaboActionPerformed

    private void btnPrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecedentActionPerformed
          ((C_Visiteur)controleur).precedant();
    }//GEN-LAST:event_btnPrecedentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFermer;
    private javax.swing.JToggleButton btnOk;
    private javax.swing.JToggleButton btnPrecedent;
    private javax.swing.JToggleButton btnSuivant;
    private javax.swing.JComboBox cbChercher;
    private javax.swing.JComboBox cbLabo;
    private javax.swing.JLabel lbAdresse;
    private javax.swing.JLabel lbChercher;
    private javax.swing.JLabel lbLabo;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbSecteur;
    private javax.swing.JLabel lbVille;
    private javax.swing.JLabel lbVisiteurs;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtSecteur;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
