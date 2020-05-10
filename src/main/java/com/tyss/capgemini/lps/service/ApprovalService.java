package com.tyss.capgemini.lps.service;

import java.util.List;

import com.tyss.capgemini.lps.beans.ApprovalTeamBean;

public interface ApprovalService {
	public boolean addClient(ApprovalTeamBean approvalBean);

	public List<ApprovalTeamBean> viewApplication();
}
