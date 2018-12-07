package com.orastays.testimonial.testimonialserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "quick_links")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class QuickLinksEntity extends CommonEntity {

	private static final long serialVersionUID = 3016577879808651420L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "q_link_id")
	private Long qLinkId;

	@Column(name = "link_url")
	private String linkUrl;

	@Column(name = "link_title")
	private String linkTitle;

	@Override
	public String toString() {
		return Long.toString(qLinkId);

	}
}
