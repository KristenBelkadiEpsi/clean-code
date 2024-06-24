package ex5;
import java.util.HashMap;
import java.util.Map;

public class Caisse {
    private Map<Item, Integer> items = new HashMap<>();
    private double total = 0;

    public void ajouterItem(Item item, int quantite) {
        items.put(item, items.getOrDefault(item, 0) + quantite);
        calculerTotal();
    }

    public void supprimerItem(Item item, int quantite) {
        if (items.containsKey(item)) {
            int nouvelleQuantite = items.get(item) - quantite;
            if (nouvelleQuantite > 0) {
                items.put(item, nouvelleQuantite);
            } else {
                items.remove(item);
            }
            calculerTotal();
        }
    }

    public double getTotal() {
        return total;
    }

    private void calculerTotal() {
        total = 0;
        for (Map.Entry<Item, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrix() * entry.getValue();
        }
    }
}
