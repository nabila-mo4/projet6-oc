package org.batchemail;

import org.librarypro.webapp.business.contract.ManagerFactory;

public abstract class AbstractJob {

	private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
