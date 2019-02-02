package com.orastays.testimonialserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class QuickLinksModel extends CommonModel {

	@JsonProperty("qLinkId")
	private String qLinkId;
	
	@JsonProperty("linkUrl")
	private String linkUrl;
	
	@JsonProperty("linkTitle")
	private String linkTitle;
}
