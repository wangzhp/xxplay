package com.xxplay.service.gameCenter.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xxplay.dao.app.IAppBathInfoDao;
import com.xxplay.model.persistent.app.AppBathInfo;
import com.xxplay.service.gameCenter.IAppBathInfoService;

/**
 * 增加游戏批量任务服务 实现接口
 * 
 * @Author:chenssy
 * @date:2016年5月14日 下午12:41:44
 * 
 */
@Service("appBathInfoService")
public class AppBathInfoServiceImpl implements IAppBathInfoService{
	@Resource
	private IAppBathInfoDao appBathInfoDao;

	@Override
	public void saveBathInfo(AppBathInfo bathInfo) {
		appBathInfoDao.insertSelective(bathInfo);
	}

	@Override
	public List<AppBathInfo> getAppBathInfoByCondition(Map<String, Object> params) {
		return appBathInfoDao.selectByCondition(params);
	}

	@Override
	public void updateAppBathInfo(AppBathInfo bathInfo) {
		appBathInfoDao.updateByPrimaryKey(bathInfo);
	}
	
}
