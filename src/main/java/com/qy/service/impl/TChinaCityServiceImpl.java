package com.qy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qy.mapper.TChinaCityMapper;
import com.qy.po.TChinaCity;
import com.qy.service.TChinaCityService;

/**   
 * This class is used for ...   
 * @author leepon1990  
 * @version   
 *       1.0, 2016年4月18日 下午5:05:16   
 */
@Service
public class TChinaCityServiceImpl implements TChinaCityService {

	@Autowired
	TChinaCityMapper tChinaCityMapper;
	
	@Override
	public List<TChinaCity> findProvinceList(Integer id) {
		return tChinaCityMapper.findProvinceList(id);
 	}

}
