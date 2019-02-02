package com.orastays.testimonialserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.testimonialserver.entity.QuickLinksEntity;

@Repository
public class QuickLinksDAO extends GenericDAO<QuickLinksEntity, Long> {

	private static final long serialVersionUID = 858449001215746433L;

	public QuickLinksDAO() {
		super(QuickLinksEntity.class);
	}
}