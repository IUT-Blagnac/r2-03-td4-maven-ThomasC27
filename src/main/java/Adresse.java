
/**
 * Décrivez votre classe Adresse ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Adresse
{
    int numRue;
    String nomRue, codeP, nomVille;
    /** Constructeur de adresse sans parametres
     */
    Adresse (){
        this.numRue = 1;
        this.nomRue = "";
        this.codeP = "";
        this.nomVille = "";
    }
    /** Constructeur de adresse avec parametres
     * @param pfnumRue int : numéro de rue
     * @param pfnomRue String : nom de la rue
     * @param  pfcodeP String : code postal
     * @param pfnomVille String : nom de la ville
     */
    Adresse (int pfnumRue, String pfnomRue, String pfcodeP, String pfnomVille){
        this.numRue = pfnumRue;
        this.nomRue = pfnomRue;
        this.codeP = pfcodeP;
        this.nomVille = pfnomVille;
    }
}
