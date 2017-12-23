package model;

import java.util.ArrayList;
import java.util.List;
import model.Produit;

/**
 * @author Molecular
 */
public class ProduitDAO {
    
    // CONSTRUCTOR :
    
    public ProduitDAO(){}
    
    // METHODS :
    
    public List<Produit> getProduits() throws Exception{
        
        List<Produit> produits = new ArrayList<Produit>();
        
        produits.add(new Produit("PR001", "Casquette BTS", 12));
        produits.add(new Produit("PR002", "Cache bouche tokyo ghoul", 9));
        produits.add(new Produit("PR003", "Bracelet DotA", 5));
        
        return produits;
        
    }
    
}
