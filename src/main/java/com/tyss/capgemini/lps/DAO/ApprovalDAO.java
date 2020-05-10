package com.tyss.capgemini.lps.DAO;

import java.util.List;

import com.tyss.capgemini.lps.beans.ApprovalTeamBean;

public interface ApprovalDAO {
	public boolean addClient(ApprovalTeamBean approvalBean);

	public List<ApprovalTeamBean> viewApplication();
}
