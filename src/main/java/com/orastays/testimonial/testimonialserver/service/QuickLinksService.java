package com.orastays.testimonial.testimonialserver.service;

import java.util.List;

import com.orastays.testimonial.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonial.testimonialserver.model.QuickLinksModel;

public interface QuickLinksService {

	void addQuickLinks(QuickLinksModel quickLinksModel) throws FormExceptions;

	List<QuickLinksModel> fetchQuickLinks(QuickLinksModel quickLinksModel) throws FormExceptions;

}
