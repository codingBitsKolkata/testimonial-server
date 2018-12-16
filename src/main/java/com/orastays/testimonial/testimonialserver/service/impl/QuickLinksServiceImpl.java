package com.orastays.testimonial.testimonialserver.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.orastays.testimonial.testimonialserver.entity.QuickLinksEntity;
import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.model.QuickLinksModel;
import com.orastays.testimonial.testimonialserver.model.TestimonialModel;
import com.orastays.testimonial.testimonialserver.service.QuickLinksService;


public class QuickLinksServiceImpl extends BaseServiceImpl implements QuickLinksService{

	private static final Logger logger = LogManager.getLogger(QuickLinksServiceImpl.class);
	
	@Override
	public void addQuickLinks(QuickLinksModel quickLinksModel) throws FormExceptions {
		if (logger.isInfoEnabled()) {
			logger.info("addQuickLinks -- START");
		}
		
		quickLinksValidation.validateAddQuickLinks(quickLinksModel);
		QuickLinksEntity quickLinksEntity = quickLinksConverter.modelToEntity(quickLinksModel);
		quickLinksDAO.save(quickLinksEntity);		
				
		if (logger.isInfoEnabled()) {
			logger.info("addQuickLinks -- END");
		}
		
	}

	@Override
	public List<QuickLinksModel> fetchQuickLinks(QuickLinksModel quickLinksModel) throws FormExceptions {
		if (logger.isInfoEnabled()) {
			logger.info("fetchQuickLinks -- START");
		}
		
		List<QuickLinksModel> quickLinksModels = null;
		try {
			Map<String, String> innerMap1 = new LinkedHashMap<>();
			innerMap1.put("title", quickLinksModel.getLinkTitle());
			innerMap1.put("url", quickLinksModel.getLinkUrl());
			
			Map<String, Map<String, String>> outerMap1 = new LinkedHashMap<>();
			outerMap1.put("eq", innerMap1);
	
			Map<String, Map<String, Map<String, String>>> alliasMap = new LinkedHashMap<>();
			alliasMap.put(entitymanagerPackagesToScan+".TestimonialEntity", outerMap1);
			
			quickLinksModels = new ArrayList<>();
			quickLinksModels = quickLinksConverter.entityListToModelList(quickLinksDAO.fetchListBySubCiteria(alliasMap));
			
		} catch (Exception e) {
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchQuickLinks -- END");
		}
		
		return quickLinksModels;
	}

}
