package ex1;

import java.util.Date;

public class Entreprise {


    public static final int CAPITAL_MAX = 3000000;


    private int siret;


    private String nom;

    private String adresse;

    private Date dateCreation;

    /**
     * Constructeur de la classe Entreprise.
     *
     * @param siret        Le numéro SIRET de l'entreprise.
     * @param nom          Le nom de l'entreprise.
     * @param adresse      L'adresse de l'entreprise.
     * @param dateCreation La date de création de l'entreprise.
     */
    public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
        this.siret = siret;
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = dateCreation;
    }

    /**
     * Récupère le numéro SIRET de l'entreprise.
     *
     * @return Le numéro SIRET.
     */
    public int getSiret() {
        return siret;
    }

    /**
     * Récupère le nom de l'entreprise.
     *
     * @return Le nom de l'entreprise.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère l'adresse de l'entreprise.
     *
     * @return L'adresse de l'entreprise.
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Récupère la date de création de l'entreprise.
     *
     * @return La date de création.
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println("Entreprise{" +
                "siret=" + siret +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateCreation=" + dateCreation +
                '}');
    }


}
