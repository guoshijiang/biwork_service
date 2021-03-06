package com.biwork.service;

import java.util.List;

import com.biwork.entity.Currency;
import com.biwork.entity.Service;
import com.biwork.entity.User;
import com.biwork.entity.Version;
import com.biwork.vo.MeVo;
import com.biwork.vo.ServiceVo;
import com.biwork.vo.TeamVo;

public interface MyService {	 
	Service query();
	List<ServiceVo> getServiceList( Integer userId);
	Service getService( Integer userId);
	User getUser(String userId);
	MeVo getMe(String userId);
	List<Currency> getCurrency();
	List<TeamVo> getApprovalCategoryList(String teamId,String userId);
	List<TeamVo> getDepartmentList(String teamId,String userId);
	Version getCurrentVersion(String type);
	 List<Version> getCurrentVersionBoth();
}
