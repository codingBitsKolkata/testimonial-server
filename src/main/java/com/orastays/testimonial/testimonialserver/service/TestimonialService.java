package com.orastays.testimonial.testimonialserver.service;

import java.util.List;

import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.model.TestimonialModel;

public interface TestimonialService {
	void addTestimonial(TestimonialModel testimonialModel) throws FormExceptions;

	List<TestimonialModel> fetchTestimonial(TestimonialModel testimonialModel) throws FormExceptions;

}
