package question3;

/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author à compléter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Création", le constructeur d'un auditeur avec son nom, son prénom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son prénom
     * @param matricule
     *            sur la carte d'inscription, près de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premières lettres du nom suivies de la première
     * lettre du prénom séparées de '_' . le login retourné est en minuscules,
     * le trait d'union, ou spéciaux <i>(pour unix)</i> sont remplacés par des
     * '_' pas de caractères accentués pour le login voir les classes
     * prédéfines, java.lang.String : les méthodes replaceAll, toLowerCase et
     * substring java.lang.Math : la méthode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifié, sans les adaptations dues aux
     *         homonymes...
     */
      public String login() {
      String login;
        if(nom.length()<6 && prenom.length()<1){
             login = nom + "_" + prenom;
        }
        else if(nom.length()<6 && prenom.length()>1){
             login = nom + "_" + prenom.substring(0,1);
        }
        else if(nom.length()>6 && prenom.length()<1){
             login = nom.substring(0,6) + "_" + prenom;
        }
        else{          
             login = nom.substring(0,6) + "_" + prenom.substring(0,1);
        }
        login = login.toLowerCase();
        login = login.replaceAll("ê", "e");
        login = login.replaceAll("è", "e");
        login = login.replaceAll("é","e");
        login = login.replaceAll("-","_");
        login = login.replaceAll(" ","_");
        login = login.replaceAll(",","_");
        login = login.replaceAll("â", "a");
        login = login.replaceAll("à", "a");
        return login;   
    }
    public String login() {
        return "";// à compléter
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return this.nom;// à compléter
    }

    /**
     * Lecture du prénom de l'auditeur.
     * 
     * @return son prénom
     */
    public String prenom() {
        return this.prenom;// à compléter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return this.matricule;// à compléter
    }

    /**
     * méthode toString ( méthode redéfinie de la classe Object).
     * 
     * @return la concaténation du nom, du prénom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
