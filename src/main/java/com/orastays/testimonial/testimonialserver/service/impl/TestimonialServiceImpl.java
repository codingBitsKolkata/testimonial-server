package com.orastays.testimonial.testimonialserver.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.orastays.testimonial.testimonialserver.entity.TestimonialEntity;
import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.model.TestimonialModel;
import com.orastays.testimonial.testimonialserver.service.TestimonialService;


@Service
@Transactional
public class TestimonialServiceImpl extends BaseServiceImpl implements TestimonialService {
	
	private static final Logger logger = LogManager.getLogger(TestimonialServiceImpl.class);

	@Override
	public void addTestimonial(TestimonialModel testimonialModel) throws FormExceptions {

		if (logger.isInfoEnabled()) {
			logger.info("addTestimonial -- START");
		}
		
		testimonialValidation.validateAddReview(testimonialModel);
		TestimonialEntity testimonialEntity = testimonialConverter.modelToEntity(testimonialModel);
		testimonialDAO.save(testimonialEntity);		
				
		if (logger.isInfoEnabled()) {
			logger.info("addTestimonial -- END");
		}
	}

	@Override
	public List<TestimonialModel> fetchTestimonial(TestimonialModel testimonialModel) throws FormExceptions {
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchTestimonial -- START");
		}
		
		List<TestimonialModel> testimonialModels = null;
		try {
			Map<String, String> innerMap1 = new LinkedHashMap<>();
			innerMap1.put("testimonialId", testimonialModel.getTestimonialId());
			innerMap1.put("title", testimonialModel.getTitle());
			innerMap1.put("description", testimonialModel.getDescription());
	
			Map<String, Map<String, String>> outerMap1 = new LinkedHashMap<>();
			outerMap1.put("eq", innerMap1);
	
			Map<String, Map<String, Map<String, String>>> alliasMap = new LinkedHashMap<>();
			alliasMap.put(entitymanagerPackagesToScan+".TestimonialEntity", outerMap1);
			
			testimonialModels = new ArrayList<>();
			testimonialModels = testimonialConverter.entityListToModelList(testimonialDAO.fetchListBySubCiteria(alliasMap));
			
		} catch (Exception e) {
		}
		
		if (logger.isInfoEnabled()) {
			logger.info("fetchTestimonial -- END");
		}
		
		return testimonialModels;
	}

}