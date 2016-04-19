package com.qy.mapper;

import com.qy.datasource.TargetDataSource;
import com.qy.po.UserInfo;

/**
 * 
 * @ClassName: UserInfoMapper 
 * @Description: TODO
 * @author leepon1990
 * @date 2016年4月5日 下午4:02:45 
 *
 */
public interface UserInfoMapper {

	@TargetDataSource("ds1")
	UserInfo getUserInfoById(Integer id); 
}
