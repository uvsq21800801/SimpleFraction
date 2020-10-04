package fr.uvsq;

public class Fraction {
    int numerateur;
    int denominateur;
    

    Fraction(int newNum, int newDenom){
        numerateur=newNum;
        denominateur=newDenom;
    }

    public String toString(){
        String resultat = numerateur+"/"+denominateur;
        return resultat;

    }
}
