/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;


import static controleur.EnumAction.*;
import javax.swing.JOptionPane;
import modele.jdbc.Jdbc;


/**
 *
 * @author btssio
 */
public class C_Principal {
    


    private CtrlPresence ctrlPresence = null;
    private C_Menu ctrlMenu = null;

    /**
     * action par défaut action au démarrage de l'application
     */
    public void action() {
        if (ctrlMenu == null) {
            ctrlMenu = new C_Menu(this);
        }
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }

    public void action(EnumAction action) {
        switch (action) {
            case MENU_PRESENCE_AJOUTER: // activation de vuePresence depuis vueMenu
                menuPresenceAjouter();
                break;
            case PRESENCE_QUITTER:    // retour à vueMenu depuis la vuePresence
                presenceQuitter();
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
    private void menuPresenceAjouter() {
        if (ctrlPresence == null) {
            ctrlPresence = new CtrlPresence(this);
        } else {
            // si la le contrôleur et sa vue existent déjà
            // il faut rafraîchir le contenu à partir de la base de données
            ctrlPresence.actualiser();
        }
        // vuPresence est une fenêtre modale :
        // -> vueMenu reste visible, mais n'est pas active
        ctrlMenu.getVue().setEnabled(false);
        ctrlPresence.getVue().setVisible(true);
    }

    /**
     * Transition vuePresence / vueMenu
     */
    private void presenceQuitter() {
        if (ctrlMenu == null) {
            ctrlMenu = new C_Menu(this);
        }
        ctrlPresence.getVue().setVisible(false);
        ctrlMenu.getVue().setEnabled(true);
        ctrlMenu.getVue().setVisible(true);
    }
}

