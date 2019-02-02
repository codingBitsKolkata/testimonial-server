package com.orastays.testimonialserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.orastays.testimonialserver.converter.QuickLinksConverter;
import com.orastays.testimonialserver.converter.TestimonialConverter;
import com.orastays.testimonialserver.dao.QuickLinksDAO;
import com.orastays.testimonialserver.dao.TestimonialDAO;
import com.orastays.testimonialserver.validation.QuickLinksValidation;
import com.orastays.testimonialserver.validation.TestimonialValidation;

public abstract class BaseServiceImpl {
	@Value("${entitymanager.packagesToScan}")
	protected String entitymanagerPackagesToScan;
	
	@Autowired
	protected TestimonialValidation testimonialValidation;
	
	@Autowired
	protected QuickLinksValidation quickLinksValidation;
	
	@Autowired
	protected TestimonialConverter testimonialConverter;
	
	@Autowired
	protected QuickLinksConverter quickLinksConverter;
	
	@Autowired
	protected TestimonialDAO testimonialDAO;
	
	@Autowired
	protected QuickLinksDAO quickLinksDAO;

}
