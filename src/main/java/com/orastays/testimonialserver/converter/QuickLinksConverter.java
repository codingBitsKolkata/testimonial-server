package com.orastays.testimonialserver.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.orastays.testimonialserver.entity.QuickLinksEntity;
import com.orastays.testimonialserver.helper.Util;
import com.orastays.testimonialserver.model.QuickLinksModel;

@Component
public class QuickLinksConverter extends CommonConverter implements BaseConverter<QuickLinksEntity, QuickLinksModel> {

	private static final long serialVersionUID = -3505784613511453950L;
	private static final Logger logger = LogManager.getLogger(QuickLinksConverter.class);

	@Override
	public QuickLinksEntity modelToEntity(QuickLinksModel m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QuickLinksModel entityToModel(QuickLinksEntity e) {

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- START");
		}

		QuickLinksModel quickLinksModel = new QuickLinksModel();
		quickLinksModel = (QuickLinksModel) Util.transform(modelMapper, e, quickLinksModel);

		if (logger.isInfoEnabled()) {
			logger.info("entityToModel -- END");
		}

		return quickLinksModel;
	}

	@Override
	public List<QuickLinksModel> entityListToModelList(List<QuickLinksEntity> es) {

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- START");
		}

		List<QuickLinksModel> quickLinksModels = null;
		if (!CollectionUtils.isEmpty(es)) {
			quickLinksModels = new ArrayList<>();
			for (QuickLinksEntity quickLinksEntity : es) {
				quickLinksModels.add(entityToModel(quickLinksEntity));
			}
		}

		if (logger.isInfoEnabled()) {
			logger.info("entityListToModelList -- END");
		}

		return quickLinksModels;
	}
}