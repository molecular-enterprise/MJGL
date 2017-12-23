package services;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import res.Res;
import model.Produit;
import model.ProduitDAO;

/**
 * @author Molecular
 */

@WebServlet(name = "Liste", urlPatterns = {"/Liste"})
public class Liste extends HttpServlet {

    private Res initRes(){
    
        Res resp = new Res();
        resp.error = true;
        resp.message = "Erreur inconnu !";
        resp.data = null;
        
        return resp;
    
    }
    
    private Res getResponse(Res resp) throws Exception{
        
        ProduitDAO dao = new ProduitDAO();
        List<Produit> produits = dao.getProduits();
        resp.data = produits;
        resp.message = "Donnees bien envoyees !";
        resp.error = false;
        
        return resp;
        
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        Gson gson = new Gson();
        Res resp = initRes();
        
        try{
            
            resp = getResponse(resp);
            
        } catch(Exception ex){
            
            resp.message = ex.getMessage();
            
        } out.print(gson.toJson(resp));
        
    }

}
