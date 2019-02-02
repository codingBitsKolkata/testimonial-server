package com.orastays.testimonialserver.service;

import java.util.List;

import com.orastays.testimonialserver.exceptions.FormExceptions;
import com.orastays.testimonialserver.model.QuickLinksModel;

public interface QuickLinksService {

	void addQuickLinks(QuickLinksModel quickLinksModel) throws FormExceptions;

	List<QuickLinksModel> fetchQuickLinks();

}
