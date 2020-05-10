package com.tyss.capgemini.lps.DAO;

import java.util.List;
import org.apache.log4j.Logger;

import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;

public class ApprovalDAOImpl implements ApprovalDAO {
	Logger log = Logger.getLogger(LoanDAOImpl.class);

	@Override
	public boolean addClient(ApprovalTeamBean approvalBean) {
		for (ApprovalTeamBean approvalBean1 : LoanProcessingSystemDB.APPROVAL_TEAM_BEANS) {
			log.info(approvalBean);
			return true; // false
		}

		LoanProcessingSystemDB.APPROVAL_TEAM_BEANS.add(approvalBean);
		return false; // true
	}

	@Override
	public List<ApprovalTeamBean> viewApplication() {
		List<ApprovalTeamBean> approvalBean = LoanProcessingSystemDB.APPROVAL_TEAM_BEANS;
		return approvalBean;
	}

}
