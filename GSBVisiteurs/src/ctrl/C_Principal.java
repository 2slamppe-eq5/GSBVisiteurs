/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;


import static ctrl.EnumAction.*;
import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;
import vue.Fenetre;


/**
 *
 * @author btssio
 */
public class C_Principal {
    

    private Fenetre fenetre =  new Fenetre();
    private C_Medicament ctrlMedicament = null;
    private C_Menu ctrlMenu = null;
    

    /**
     * action par défaut action au démarrage de l'application
     */
    public void action() {
        if (ctrlMenu == null) {
            ctrlMenu = new C_Menu(this);
        }
        fenetre.setEnabled(true);
        fenetre.setContentPane(ctrlMenu.getVue());
        fenetre.setVisible(true);
   //     ctrlMenu.getVue().setEnabled(true);
    //    ctrlMenu.getVue().setVisible(true);
    }

    public void action(EnumAction action) {
        switch (action) {
            case MENU_MEDICAMENT: // activation de vueMedicament depuis vueMenu
                menuMedicament();
                break;
            case MEDICAMENT_QUITTER:    // retour à vueMenu depuis la vueMedicament
                medicamentQuitter();
                break;
            case MENU_PRATICIEN: 
                menuMedicament();
                break;
            case PRATICIEN_QUITTER:   
                medicamentQuitter();
                break;
           case MENU_VISITEUR: 
                menuMedicament();
                break;
            case VISITEUR_QUITTER:   
                medicamentQuitter();
                break;
             case MENU_RAPPORT: 
                menuMedicament();
                break;
            case RAPPORT_QUITTER:   
                medicamentQuitter();
                break;
            case MENU_FICHIER_QUITTER: // fin de l'application depuis vueMenu
                menuFichierQuitter();
                break;
        }

    }

    /**
     * Fin définitive de l'application La demande de confirmation est gérée par
     * le contrôleur spécialisé
     */
    private void menuFichierQuitter() {
        try {
            Jdbc.getInstance().deconnecter();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "CtrlPrincipal - fermeture connexion BD", JOptionPane.ERROR_MESSAGE);
        } finally {
            System.exit(0);
        }
    }

    /**
     * Transition vueMenu / vuePresence
     */
    private void menuMedicament() {
        if (ctrlMedicament == null) {
            ctrlMedicament = new C_Medicament(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlMedicament.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlMedicament.getVue().setVisible(true);
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void medicamentQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new C_Menu(this);
        }
        ctrlMedicament.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
}

