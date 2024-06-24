package ex2;

public class LivretA extends CompteBancaire {

    private static final double DECOUVERT_AUTORISE = 0.0;

    public LivretA(String type, double solde, double tauxRemuneration) {
        super(type, solde, DECOUVERT_AUTORISE, tauxRemuneration);
    }

}