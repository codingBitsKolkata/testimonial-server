package com.orastays.testimonial.testimonialserver.dao;

import org.springframework.stereotype.Repository;

import com.orastays.testimonial.testimonialserver.entity.TestimonialEntity;

@Repository
public class TestimonialDAO extends GenericDAO<TestimonialEntity, Long> {

	private static final long serialVersionUID = 6760140760857970903L;

	public TestimonialDAO() {
		super(TestimonialEntity.class);
	}
}