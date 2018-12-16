package com.orastays.testimonial.testimonialserver.validation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.model.TestimonialModel;
import com.orastays.testimonial.testimonialserver.model.UserModel;

@Component
public class TestimonialValidation extends AuthorizeUserValidation {

	private static final Logger logger = LogManager.getLogger(TestimonialValidation.class);

	// Validation while adding review
	public TestimonialModel validateAddTestimonial(TestimonialModel testimonialModel) throws FormExceptions {

		if (logger.isDebugEnabled()) {
			logger.debug("validateAddTestimonial -- Start");
		}

		Map<String, Exception> exceptions = new LinkedHashMap<>();
		UserModel userModel = getUserDetails(testimonialModel.getUserToken());

		if (Objects.nonNull(testimonialModel) && Objects.nonNull(userModel)) {

			testimonialModel.setUserId(userModel.getUserId());
			// Check title for null
			if (StringUtils.isBlank(testimonialModel.getTitle())) {
				exceptions.put(messageUtil.getBundle("testimonial.title.null.code"), new Exception(messageUtil.getBundle("testimonial.title.null.message")));
			}

			// Check description for null
			if (StringUtils.isBlank(testimonialModel.getDescription())) {
				exceptions.put(messageUtil.getBundle("testimonial.desc.null.code"), new Exception(messageUtil.getBundle("testimonial.desc.null.message")));
			}
			
			//validate languageID
			validateLanguage(testimonialModel.getLanguageId());
			
			if (exceptions.size() > 0)
				throw new FormExceptions(exceptions);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("validateAddTestimonial -- End");
		}
		return testimonialModel;
	}
}