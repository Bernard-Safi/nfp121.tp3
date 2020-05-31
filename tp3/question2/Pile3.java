package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;

    public Pile3() {
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public Pile3(int taille) {
        if (taille <= 0)
            taille = PileI.CAPACITE_PAR_DEFAUT;
            this.v = new Vector <Object>(taille);
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        this.v.addElement(o);
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        return this.v.remove(this.taille()-1);
    }

    public Object sommet() throws PileVideException {
        if(estVide())
                   throw new PileVideException();
        return this.v.lastElement();
    }

    public int taille() {
        return this.v.size();
    }

    public int capacite() {
        return this.v.capacity();
    }

    public boolean estVide() {
        return this.taille()==0;
    }

    public boolean estPleine() {
        return this.taille()==this.capacite();
    }

    public String toString() {
         String s = "[";
        for(int i=taille()-1;i>=0;i--){
         s=s+(this.v.get(i).toString());
         if(i>0){
             s=s+", ";
            }
        }
        return s + "]";
    }

    public boolean equals(Object o) {
        if(o instanceof Pile3){
           Pile3 p=(Pile3)o;
           
               return this.capacite() == p.capacite()
                      &&this.taille()==p.taille()
                      && this.hashCode() == p.hashCode();
        }
        else{
            return false;
        }
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
