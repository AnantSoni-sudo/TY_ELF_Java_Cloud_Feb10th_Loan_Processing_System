package com.tyss.capgemini.lps.service;

import java.util.List;

import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.DAO.ApprovalDAO;
import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;

public class ApprovalServiceImpl implements ApprovalService {
	private ApprovalDAO dao = FactoryDAO.getApprovalDAO();

	@Override
	public boolean addClient(ApprovalTeamBean approvalBean) {
		return dao.addClient(approvalBean);
	}

	@Override
	public List<ApprovalTeamBean> viewApplication() {
		return dao.viewApplication();
	}

}
