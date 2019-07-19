package cn.appsys.service.developer.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.appsys.service.developer.DataDictionaryService;
import org.springframework.stereotype.Service;

import cn.appsys.dao.DataDictionaryMapper;
import cn.appsys.pojo.DataDictionary;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {
	
	@Resource
	private DataDictionaryMapper mapper;
	
	@Override
	public List<DataDictionary> getDataDictionaryList(String typeCode)
			throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDataDictionaryList(typeCode);
	}

}
