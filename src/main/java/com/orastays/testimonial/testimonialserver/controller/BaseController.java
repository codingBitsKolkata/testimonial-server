package com.orastays.testimonial.testimonialserver.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.orastays.testimonial.testimonialserver.helper.MessageUtil;
import com.orastays.testimonial.testimonialserver.service.TestimonialService;
import com.orastays.testimonial.testimonialserver.service.QuickLinksService;

public class BaseController {

	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected HttpServletResponse response;
	
	@Autowired
	protected TestimonialService testimonialService;
	
	@Autowired
	protected QuickLinksService quicklinksService;
	
	@Autowired
	protected MessageUtil messageUtil;
}
