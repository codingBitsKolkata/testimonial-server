package com.orastays.testimonial.testimonialserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class TestimonialModel extends CommonModel {

	private String testimonialId;

	private String title;
	private String description;
	private String userId;
	private String languageId;
	private String parentId;

}
