package com.orastays.testimonial.testimonialserver.validation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.model.QuickLinksModel;

@Component
public class QuickLinksValidation extends AuthorizeUserValidation {

	private static final Logger logger = LogManager.getLogger(TestimonialValidation.class);

	// Validation while adding QuickLinks
	public QuickLinksModel validateAddQuickLinks(QuickLinksModel quickLinksModel) throws FormExceptions {

		if (logger.isDebugEnabled()) {
			logger.debug("validateAddQuickLinks -- Start");
		}

		Map<String, Exception> exceptions = new LinkedHashMap<>();

		if (Objects.nonNull(quickLinksModel)) {
			// Check title for null
			if (StringUtils.isBlank(quickLinksModel.getLinkTitle())) {
				exceptions.put(messageUtil.getBundle("quickLinks.title.null.code"), new Exception(messageUtil.getBundle("quickLinks.title.null.message")));
			}

			// Check url for null
			if (StringUtils.isBlank(quickLinksModel.getLinkUrl())) {
				exceptions.put(messageUtil.getBundle("quickLinks.url.null.code"), new Exception(messageUtil.getBundle("testimonial.url.null.message")));
			}
			if (exceptions.size() > 0)
				throw new FormExceptions(exceptions);
		}

		if (logger.isDebugEnabled()) {
			logger.debug("validateAddQuickLinks -- End");
		}
		
		return quickLinksModel;
	}
}