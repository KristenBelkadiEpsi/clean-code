package ex5;

import java.util.HashMap;
import java.util.Map;

public class Inventaire {
    private Map<Item, Integer> stock = new HashMap<>();

    /**
     * Ajoute une quantitée d'item dans le stock d'inventaire.
     *
     * @param item     l'item à ajouter
     * @param quantite la quantitée d'item à ajouter
     */
    public void ajouterItem(Item item, int quantite) {
        stock.put(item, stock.getOrDefault(item, 0) + quantite);
    }

    /**
     * Supprime une quantitée d'item dans le stock d'inventaire.
     *
     * @param item     l'item à supprimer
     * @param quantite la quantitée d'item à supprimer
     */
    public void supprimerItem(Item item, int quantite) {
        if (stock.containsKey(item)) {
            int nouvelleQuantite = stock.get(item) - quantite;
            if (nouvelleQuantite > 0) {
                stock.put(item, nouvelleQuantite);
            } else {
                stock.remove(item);
            }
        }
    }

    /**
     * return la quantitée d'un item
     *
     * @param item l'item dont on veut récupérer la quantitée
     * @return la quantitée  de l'item, si l'item n'existe pas renvoie la valeur 0.
     */
    public int getQuantite(Item item) {
        return stock.getOrDefault(item, 0);
    }
}

