
package tournois_classement.tournois;

import java.util.List;
import tournois_classement.match.Match;
import tournois_classement.joueurs.Joueurs;
import java.util.Random;

public class Tournois {

    public static final int NB_POINTS_VICTOIRE = 20;
    private boolean fini;
    private List<Match> lesMatchsJoues;
    private Match[] tourEnCours;
    private List<Joueurs> joueurs;


    public Tournois() {
    }
    Random joueur = new Random();
    public Tournois(List<Joueurs> joueur) {
        
        this.joueurs = joueur;
    }


   public void joueUnTour(){
       if(fini == false){
           //Match m = new Match(tourEnCours,tourEnCours,tourEnCours);
       }
       
   }

}
