package question1;

public class PileTest extends junit.framework.TestCase {
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test PileTest
     */
    public PileTest() {
    }

    /**
     * Met en place les engagements.
     * 
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
    }

    /**
     * Supprime les engagements
     * 
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libérez ici les ressources engagées par setUp()
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test. Ces
     * méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>). Par convention, leurs noms devraient débuter par
     * "test". Vous pouvez ébaucher le corps grâce au menu contextuel
     * "Enregistrer une méthode de test".
     */

    public void testPileVide(){
        PolygoneRegulier p=new PolygoneRegulier(10,25);
        PolygoneRegulier p1=new PolygoneRegulier(99,50);
        Pile pile=new Pile(2);
       assertTrue(pile.estVide());
            
             try{
        pile.empiler(p);
        pile.empiler(p1);
        assertTrue(!pile.estVide());
    
    }
    catch(PilePleineException ex){
        
    }
    }
   
        public void testPilePleine(){
        PolygoneRegulier p=new PolygoneRegulier(10,25);
        PolygoneRegulier p1=new PolygoneRegulier(99,50);
        Pile pile=new Pile(2);
       assertTrue(!pile.estPleine());
            
             try{
        pile.empiler(p);
        pile.empiler(p1);
        assertTrue(pile.estPleine());
    
    }
    catch(PilePleineException ex){
        
    }
    }
        
        
    }

