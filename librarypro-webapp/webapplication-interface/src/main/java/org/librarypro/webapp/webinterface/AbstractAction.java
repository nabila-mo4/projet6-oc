package org.librarypro.webapp.webinterface;

import org.librarypro.webapp.business.contract.ManagerFactory;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport{
		
		private static ManagerFactory managerFactory;

	    protected static ManagerFactory getManagerFactory() {
	        return managerFactory;
	    }
	    public static void setManagerFactory(ManagerFactory pManagerFactory) {
	        managerFactory = pManagerFactory;
	    }

}
