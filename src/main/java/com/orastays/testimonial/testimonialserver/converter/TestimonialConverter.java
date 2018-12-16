package com.orastays.testimonial.testimonialserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.testimonial.testimonialserver.entity.TestimonialEntity;
import com.orastays.testimonial.testimonialserver.helper.Util;
import com.orastays.testimonial.testimonialserver.model.TestimonialModel;

@Component
public class TestimonialConverter extends CommonConverter
		implements BaseConverter<TestimonialEntity, TestimonialModel> {

	private static final long serialVersionUID = -2858145429908608151L;
	private static final Logger logger = LogManager.getLogger(TestimonialConverter.class);

	@Override
	public TestimonialEntity modelToEntity(TestimonialModel m) {
		return null;
	}

	@Override
	public TestimonialModel entityToModel(TestimonialEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		TestimonialModel testimonialModel = new TestimonialModel();
		testimonialModel = (TestimonialModel) Util.transform(modelMapper, e, testimonialModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return testimonialModel;
	}

	@Override
	public List<TestimonialModel> entityListToModelList(List<TestimonialEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<TestimonialModel> testimonialModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			testimonialModels = new ArrayList<>();
			for (TestimonialEntity testimonialEntity : es) {
				testimonialModels.add(entityToModel(testimonialEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return testimonialModels;
	}
}