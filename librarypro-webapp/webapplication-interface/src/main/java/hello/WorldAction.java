package hello;

import org.librarypro.webapp.business.impl.ManagerFactoryImpl;
import org.librarypro.webapp.model.OuvrageDTO;
import org.librarypro.webapp.webinterface.AbstractAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorldAction extends AbstractAction {
	
	private OuvrageDTO ouvrage;
	private int idouvrage; 
	
    public String execute() throws Exception {
    	
        ouvrage=getManagerFactory().getOuvrageManager().getById(1);
        return SUCCESS;
    }

	public OuvrageDTO getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(OuvrageDTO ouvrage) {
		this.ouvrage = ouvrage;
	}

	public int getIdouvrage() {
		return idouvrage;
	}

	public void setIdouvrage(int idouvrage) {
		this.idouvrage = idouvrage;
	}
    
	
}
