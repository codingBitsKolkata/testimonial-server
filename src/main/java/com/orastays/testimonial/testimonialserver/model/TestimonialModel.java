package com.orastays.testimonial.testimonialserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class TestimonialModel extends CommonModel {

	private String testimonialId;

	private String title;
	private String description;
	private String userId;
	private String languageId;
	private String parentId;

}
