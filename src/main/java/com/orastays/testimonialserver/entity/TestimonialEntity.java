package com.orastays.testimonialserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "master_testimonial")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class TestimonialEntity extends CommonEntity {

	private static final long serialVersionUID = -8173200790150466090L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "testimonial_id")
	@JsonProperty("testimonialId")
	private Long testimonialId;

	@Column(name = "title")
	@JsonProperty("title")
	private String title;

	@Column(name = "description", length = 65535,columnDefinition="Text" )
	@JsonProperty("description")
	private String description;

	@Column(name = "user_id")
	@JsonProperty("userId")
	private Long userId;

	@Column(name = "language_id")
	@JsonProperty("languageId")
	private Long languageId;

	@Column(name = "parent_id")
	@JsonProperty("parentId")
	private Long parentId;

	@Override
	public String toString() {
		return Long.toString(testimonialId);

	}
}
