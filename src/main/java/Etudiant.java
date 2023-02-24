
/**
 * Décrivez votre classe Etudiant ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Etudiant
{
    String nom, prenom;
    char promotion;
    String numEtud;
    Adresse adr;
    /** Constructeur de Etudiant sans paramètre
     */
    Etudiant (){
        this.nom = "";
        this.prenom = "";
        this.numEtud = "";
        this.promotion = 1;
        this.adr = new Adresse();
    }
    /** Constructeur avec paramètres
     * @param pfNom String : nom de l'étudiant
     * @param pfPrenom String prenom de l'etudiant
     * @param pfnumEtud String : numéro de l'étudiant
     * @param pfPromo char : promo
     * @param adr Adresse : adresse de l'étudiant
     */
    Etudiant (String pfNom, String pfPrenom, String pfnumEtud, char pfPromo, Adresse adr){
        this.nom = pfNom;
        this.prenom = pfPrenom;
        this.numEtud = pfnumEtud;
        this.promotion = pfPromo;
        this.adr = adr;
    }
}
