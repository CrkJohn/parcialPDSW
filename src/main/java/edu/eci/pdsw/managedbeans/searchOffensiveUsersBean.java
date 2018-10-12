package edu.eci.pdsw.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import edu.eci.pdsw.entities.User;
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

    public List<User> getUsers() throws Exception{
        try {
            return blogServices.listUsers();
        } catch (ServicesException ex) {
            
            throw ex;
        }
        
    }

    
}
