package question2;

import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile implements PileI {

    private Object[] zone;
    private int ptr;

    public Pile(int taille) {
        if (taille < 0)
            taille = PileI.CAPACITE_PAR_DEFAUT;
        this.zone = new Object[taille];
        this.ptr = 0;
    }

    public Pile() {
        this(PileI.CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        if (estPleine())
            throw new PilePleineException();
        this.zone[this.ptr] = o;
        this.ptr++;
    }

    public Object depiler() throws PileVideException {
         if (estVide())
            throw new PileVideException();
        this.ptr--;
        return zone[ptr];
    
    }

    public Object sommet() throws PileVideException {
        if(estVide())
            throw new PileVideException();
        return zone[0];
    }

    public int capacite() {
            return zone.length;
    }

    public int taille() {
                    if(estVide()){
            return 0;
        }
        else if(estPleine()){
            return zone.length;
        }
        else 
            return this.ptr;
    }

    public boolean estVide() {
        return ptr == 0;
    }

    public boolean estPleine() {
       return ptr == zone.length;
    }

    public boolean equals(Object o) {
          if (o instanceof PileI) {
      PileI p = (PileI) o;
      return this.capacite() == p.capacite()
          && this.hashCode() == p.hashCode();
    } else
      return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = ptr - 1; i >= 0; i--) {
            sb.append(zone[i].toString());
            if (i > 0)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}