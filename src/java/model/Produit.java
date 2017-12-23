package model;

/**
 * @author Molecular
 */
public class Produit {
    
    // ATTRIBUTES :
    
    private String id;
    private String nom;
    private double prix;
    
    // CONSTRUCTOR :
    
    public Produit(String id, String nom, double prix) throws Exception{
        
        this.setId(id);
        this.setNom(nom);
        this.setPrix(prix);
        
    }
    
    // SETTERS :
    
    public void setId(String id){ this.id = id; }
    
    public void setNom(String nom){ this.nom = nom; }
    
    public void setPrix(double prix) throws Exception{
    
        if(prix >= 0){
            this.prix = prix;
        } else{
            throw new Exception("Un prix doit etre positif ou null !");
        }
    
    }
    
    // GETTERS :
    
    public String getId(){ return id; }
    
    public String getNom(){ return nom; }
    
    public double getPrix(){ return prix; }
    
}
