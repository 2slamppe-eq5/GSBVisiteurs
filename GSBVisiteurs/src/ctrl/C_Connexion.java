/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ctrl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modele.dao.*;
import vue.V_Connexion;

/**
 * Contrôleur de la fenêtre VuePresence
 *
 * @author nbourgeois
 * @version 1 20 novembre 2013
 */
public class C_Connexion extends C_Abstrait {
    
   private DaoVisiteur daoVisiteur = new DaoVisiteur();
 private SimpleDateFormat formatFr = new SimpleDateFormat("dd/MM/yyyy");

    public C_Connexion(C_Principal ctrlPrincipal) {
        super(ctrlPrincipal);
        vue = new V_Connexion(this);
       // actualiser();
    }
    public void seConnecter() {
        // Déclarations de variables locales
        int nb = 0; // valeur de retour de l'opération de mise à jour
        String msg = ""; // message à afficher à l'issue de la mise à jour
        int typeMsg = 0;
        String login = null;
     //   String passwordTxt =null;
      //  Date password = new Date((Date)getVue().getTxtPassword().getValue());
        //récupération des valeur du formulaire
        login = getVue().getTxtLogin().getText();
       // password = getVue().getTxtPassword().getValue();
        try{
        Date password = formatFr.parse(getVue().getTxtPassword().getText());
 


            try {
                if(!daoVisiteur.verification(login, password)){
                 msg = "mauvais login ou mot de passe";
                   typeMsg = JOptionPane.WARNING_MESSAGE;
                } else {
                 this.getCtrlPrincipal().action(EnumAction.CONNEXION);
            }
            } catch (DaoException ex) {
                msg = "CtrlConnexion - seConnecter() - " + ex.getMessage();
                typeMsg = JOptionPane.ERROR_MESSAGE;
            } 
     
            } catch (ParseException ex) { 
             msg = "le format du mot de passe est mauvais";
                typeMsg = JOptionPane.ERROR_MESSAGE;
       } 
       if(!msg.isEmpty()){
       JOptionPane.showMessageDialog(getVue(), msg, "Connexion", typeMsg);
       }
    }

  


    /**
     * presenceAnnuler réaction au clic sur le bouton ANNULER de la vue Le
     * contrôle est rendu au contrôleur frontal
     */
    public void connexionQuitter() {
        this.getCtrlPrincipal().action(EnumAction.MENU_FICHIER_QUITTER);
    }
        public void fichierQuitter() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(getVue(), "Quitter l'application\nEtes-vous sûr(e) ?", "Ambulances", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            this.getCtrlPrincipal().action(EnumAction.MENU_FICHIER_QUITTER);
        }
    }

    @Override
    public V_Connexion getVue() {
        return (V_Connexion) vue;
    }
    
}
