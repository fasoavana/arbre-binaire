//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArbreEntier a = new ArbreEntier(0, null, null);
        ArbreEntier b = new ArbreEntier(10, null, null);
        ArbreEntier c = new ArbreEntier(8, a, b);
        ArbreEntier d = new ArbreEntier(-3,null,null);
        ArbreEntier e = new ArbreEntier(-1,c,d);
        ArbreEntier f = new ArbreEntier(4, null, null);
        ArbreEntier g = new ArbreEntier(-7, f, e);
        g.Infixe();
    }
}
/*********************
        TRAVAIL A FAIRE:
      (FILTRES): 
 **Travail de recherche:
      --Structure de Rauch: Passe bas, haut, coupe bande, passe bande;
      --Structure de Sallen-Key: Passe bas, haut, coupe bande, passe bande;
    Anomezana ex de montage tsirairay d atao calcul : w0, k, H0;
    Atao montage sous Proteus d determiner-na ny Fq de coupure par calcul et par simulation;

      (SDD):
 **1/Pour les classes PileEntier, FileEntier, ListeEntier, créer des méthodes permettant de:
         - trier les elements
         - ajoputer une valeur à l'indice donnée en paramètre;
 **2/Recherche : pour la classe ArbreEntier, créer les méthodes permettant de faire le parcour:
         - préfixé
         - infixé
         - sufixé;
 **3/Recherche : Créer une classe qui represente une "table de charge"
 *************************/