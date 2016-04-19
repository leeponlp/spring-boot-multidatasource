package com.qy.mapper;

import java.util.List;

import com.qy.datasource.TargetDataSource;
import com.qy.po.TChinaCity;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年4月18日 下午5:05:57   
 */
public interface TChinaCityMapper {

	@TargetDataSource("ds2")
	List<TChinaCity> findProvinceList(Integer id);
	
}
