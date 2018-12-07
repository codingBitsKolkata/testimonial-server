package com.orastays.testimonial.testimonialserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.testimonial.testimonialserver.entity.QuickLinksEntity;

@Repository
public class QuickLinksDAO extends GenericDAO<QuickLinksEntity, Long> {

	private static final long serialVersionUID = 858449001215746433L;

	public QuickLinksDAO() {
		super(QuickLinksEntity.class);
	}
}