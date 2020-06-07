package com.tyss.capgemini.lps.DAO;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.CustomerBean;

public interface CustomerDAO {
	
		public boolean viewCustomer(String userName, String password);
} // End of interface
