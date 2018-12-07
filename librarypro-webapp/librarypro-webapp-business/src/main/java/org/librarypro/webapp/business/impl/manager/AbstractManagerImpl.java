package org.librarypro.webapp.business.impl.manager;

import org.librarypro.webapp.consumer.contract.DaoFactory;

public abstract class AbstractManagerImpl {
	
	private DaoFactory daoFactory; 

	public DaoFactory getDaoFactory() {
		return daoFactory;
	}

	public void setDaoFactory(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	
	

}
