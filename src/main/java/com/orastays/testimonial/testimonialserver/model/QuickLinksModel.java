package com.orastays.testimonial.testimonialserver.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class QuickLinksModel extends CommonModel {

	private String qLinkId;
	private String linkUrl;
	private String linkTitle;
}
