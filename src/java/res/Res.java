package res;

/**
 * @author Molecular
 * Cette classe a ete pensee uniquement pour du 
 * webservice base sur du RESTful ( donc utilisant du JSON )
 */

public class Res {
    
    public boolean error; // ce que le cote client va verifier en premier
    
    public String message; // ce que le cote client va afficher a l'utilisateur ( surtout en cas d'exception au niveau des servlet )
    
    public Object data; // ce que le cote serveur va passer comme donnees au cote client si tout s'est bien passe
    
}
