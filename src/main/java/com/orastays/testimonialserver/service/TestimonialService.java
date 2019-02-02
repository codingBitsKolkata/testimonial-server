package com.orastays.testimonialserver.service;

import java.util.List;

import com.orastays.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonialserver.model.TestimonialModel;

public interface TestimonialService {
	
	void addTestimonial(TestimonialModel testimonialModel) throws FormExceptions;

	List<TestimonialModel> fetchTestimonial() throws FormExceptions;

}
