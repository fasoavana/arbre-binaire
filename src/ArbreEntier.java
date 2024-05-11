public class ArbreEntier {
    private int valeur;
    private ArbreEntier gauche;
    private ArbreEntier droite;
    public ArbreEntier(int valeur, ArbreEntier gauche, ArbreEntier droite){
        this.valeur = valeur;
        this.gauche = gauche;
        this.droite = droite;
    }

    public int getValeur() {
        return valeur;
    }
    public ArbreEntier getDroite() {
        return droite;
    }
    public ArbreEntier getGauche() {
        return gauche;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    public void setDroite(ArbreEntier droite) {
        this.droite = droite;
    }
    public void setGauche(ArbreEntier gauche) {
        this.gauche = gauche;
    }
    public void Prefixe(){
        System.out.print(this.valeur+" ");
        if (this.gauche != null){
            gauche.Prefixe();
        }
        if (this.droite != null) {
           droite.Prefixe();
        }
    }
    public void Infixe(){
        if (this.gauche != null){
            gauche.Infixe();
        }
        System.out.print(this.valeur+" ");
        if (this.droite != null) {
            droite.Infixe();
        }
    }
    public void Sufixe(){
        if (this.gauche != null){
            gauche.Sufixe();
        }
        if (this.droite != null){
            droite.Sufixe();
        }
        System.out.print(this.valeur+" ");
    }

}
