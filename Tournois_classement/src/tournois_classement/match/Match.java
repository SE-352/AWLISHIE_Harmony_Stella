
package tournois_classement.match;

import tournois_classement.joueurs.Joueurs;

public class Match {

    private Joueurs joueur1;
    private Joueurs joueur2;
    private Joueurs vainqueur;

    public Match() {
    }

    public Match(Joueurs joueur1, Joueurs joueur2, Joueurs vainqueur) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.vainqueur = vainqueur;
    }

    public Joueurs getJoueur1() {
        return joueur1;
    }

    public Joueurs getJoueur2() {
        return joueur2;
    }

    public Joueurs getVainqueur() throws IllegalAccessException {
        
        if(this == null){
            throw new IllegalAccessException("Accès impossible: match non joué");
        }
        return vainqueur;
    }

    public void setVainqueur(Joueurs vainqueur) {
        this.vainqueur = vainqueur;
    }
    
    public Joueurs getVaincu() throws IllegalAccessException{
         if(this == null){
            throw new IllegalAccessException("Accès impossible: match non joué");
        }
        return vainqueur;
    }
    
    

}
