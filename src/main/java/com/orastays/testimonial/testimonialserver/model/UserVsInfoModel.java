/**
 * @author Krishanu
 */
package com.orastays.testimonial.testimonialserver.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
@JsonInclude(Include.NON_NULL)
public class UserVsInfoModel extends CommonModel {
	
	@JsonProperty("userVsInfoId")
	private String userVsInfoId;
	
	@JsonProperty("user")
	private UserModel userModel;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("imageUrl")
	private String imageUrl;
}
