package com.orastays.testimonial.testimonialserver.validation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.helper.TestimonialConstant;
import com.orastays.testimonial.testimonialserver.helper.Util;
import com.orastays.testimonial.testimonialserver.model.TestimonialModel;
import com.orastays.testimonial.testimonialserver.model.UserModel;


public class TestimonialValidation extends AuthorizeUserValidation {
	
	private static final Logger logger = LogManager.getLogger(TestimonialValidation.class);
	
	//Validation while adding review
		public TestimonialModel validateAddReview(TestimonialModel testimonialModel) throws FormExceptions {
			
			if (logger.isDebugEnabled()) {
				logger.debug("validateAddReview -- Start");
			}
			
			Util.printLog(testimonialModel, TestimonialConstant.INCOMING, "Testimonial Add", request);
			Map<String, Exception> exceptions = new LinkedHashMap<>();
			UserModel userModel = getUserDetails(testimonialModel.getUserToken());
			
			if(Objects.nonNull(testimonialModel) && Objects.nonNull(userModel)) {
				
				//Check title for null
				if(StringUtils.isBlank(testimonialModel.getTitle())) {
					exceptions.put(messageUtil.getBundle("testimonial.title.null.code"), new Exception(messageUtil.getBundle("testimonial.title.null.message")));
				}
				
				//Check bookingId for null and userId for null
				if(StringUtils.isBlank(testimonialModel.getDescription())) {
					exceptions.put(messageUtil.getBundle("testimonial.desc.null.code"), new Exception(messageUtil.getBundle("testimonial.desc.null.message")));
				} 
				if (exceptions.size() > 0)
					throw new FormExceptions(exceptions);
			}
			
			if (logger.isDebugEnabled()) {
				logger.debug("validateAddTestimonial -- End");
			}	
			return testimonialModel;
		}


}
