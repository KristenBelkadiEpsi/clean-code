package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<>();
    }

    /**
     * Affichage des animaux dans la console
     */
    public void ajouterAnimal(String nomAnimal, String typeAnimal, String comportement) {
        Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
        animaux.add(animal);

    }

    /**
     * Affichage des animaux dans la console
     */
    public void afficherListeAnimaux() {
        this.animaux.stream().forEach(animal -> System.out.println(animal));
    }

    /**
     * Getter pour le nombre d'animaux
     *
     * @return le nombre d'animaux
     */
    public int getNombreAnimaux() {
        return animaux.size();
    }

    /**
     * Getter pour le nom du zoo
     *
     * @return le nom du zoo
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom du zoo
     *
     * @param nom le nouveau nom du zoo
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
