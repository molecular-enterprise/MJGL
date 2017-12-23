package services;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import res.Res;

/**
 * @author Molecular
 */

@WebServlet(name = "Index", urlPatterns = {"/Index"})
public class Index extends HttpServlet {
    
    private Res initRes(){
    
        Res resp = new Res();
        resp.error = true;
        resp.message = "Erreur inconnu !";
        resp.data = null;
        
        return resp;
    
    }
    
    private Res getResponse(Res resp){
        
        resp.message = "Aucun probleme";
        resp.data = "Bienvenue sur ce framework cher internaute !";
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
