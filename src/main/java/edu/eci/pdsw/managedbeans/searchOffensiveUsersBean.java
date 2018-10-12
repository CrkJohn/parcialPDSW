package edu.eci.pdsw.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.entities.*;
import edu.eci.pdsw.services.BlogServices;
import edu.eci.pdsw.services.ServicesException;

/**
 *
 * @author salzate
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "offensiveUsersBean")
@SessionScoped
public class searchOffensiveUsersBean extends BasePageBean {

	/**
	 * 
	 */
    private static final long serialVersionUID = 3594009161252782831L;
	
    @Inject
    private BlogServices blogServices;
    private List<Comment> comentarios;

    public List<Blog> getData() throws Exception{
        try {
            return blogServices.searchOffensiveLanguageComments();
        } catch (ServicesException ex) {
            throw ex;
        }
    }
    
    public List<Comment> getComment(int id)throws Exception{
        List<Blog>  listBlogs= blogServices.searchOffensiveLanguageComments();
        for (Blog b : listBlogs) {
            if(b.getId() == id){
                comentarios = b.getComments();
                break;
            }
        }       
        return comentarios;
    }

    
}
