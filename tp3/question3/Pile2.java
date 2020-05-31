package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

    public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
   
    private int capacite;
    

   
    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
       if(taille<=0)
       taille=CAPACITE_PAR_DEFAUT;
       this.stk=new Stack<T>();
       this.capacite=taille;
       
    }

    public Pile2(){
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(T o) throws PilePleineException{
       if(estPleine())
           throw new PilePleineException();
           this.stk.push(o);
       
    }

    public T depiler() throws PileVideException{
        if(estVide())
           throw new PileVideException();
           return this.stk.pop();
    }

    public T sommet() throws PileVideException{
        if(estVide())
           throw new PileVideException();
           return this.stk.peek();
    }
    
    public boolean estVide(){
     return this.taille()==0;   
    }
    
     public boolean estPleine() {
        return taille()==capacite;
    }

    /**
     * Retourne une representation en String d'une pile, contenant la
     * representation en String de chaque element.
     * 
     * @return une representation en String d'une pile
     */
    public String toString() {
        String s = "[";
        for(int i=taille()-1;i>=0;i--){
         s=s+(this.stk.get(i).toString());
         if(i>0){
             s=s+", ";
            }
        }
        return s + "]";
    }

    public boolean equals(Object o) {
        if(o instanceof Pile2){
           Pile2 p=(Pile2)o;
           
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

    /**
     * Retourne le nombre d'element d'une pile.
     * 
     * @return le nombre d'element
     */
    public int taille() {
        return this.stk.size();
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        return this.capacite;
    }

} // Pile2