/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beans.Filter;
import com.beans.Reviews;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@RequestMapping("/")
	public String welcome(HttpSession session, Map<String, Object> model) {
		Filter filter = new Filter();
		if (session.getAttribute("filter") != null) {
			filter = (Filter)session.getAttribute("filter");
			session.removeAttribute("filter");
		}
		model.put("filter", filter);
		return "welcome";
	}
	
	@RequestMapping("showFilteredJson")
	public String showFilteredJson(@ModelAttribute Filter filter, Map<String, Object> model) throws StreamReadException, DatabindException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		File file = new File("jsons/reviews.json");  
	    List<Reviews> reviews = objectMapper.readValue(file, new TypeReference<List<Reviews>>(){});  
	   
		reviews = reviews.stream().filter(review -> review.getRating() >= Integer.parseInt(filter.getMinRating()))
				.collect(Collectors.toList());

		Comparator<Reviews> revTxtComparatorLEx = (filter.getPriorText().equals("yes")
				? (revTxt1, revTxt2) -> revTxt1.getReviewText().compareTo(revTxt2.getReviewText())
				: (revTxt1, revTxt2) -> 0);

		Comparator<Reviews> ratingComparatorLEx = (filter.getRating().equals("LowestFirst")
				? (rating1, rating2) -> rating1.getRating() - (rating2.getRating())
				: (rating1, rating2) -> rating2.getRating() - (rating1.getRating()));

		Comparator<Reviews> dateComparatorLEx = (filter.getOrderDate().equals("NewestFirst")
				? (date1, date2) -> date1.getReviewCreatedOnTime() - date2.getReviewCreatedOnTime()
				: (date1, date2) -> date2.getReviewCreatedOnTime() - date1.getReviewCreatedOnTime());

		reviews = reviews.stream()
				.sorted(revTxtComparatorLEx.thenComparing(ratingComparatorLEx).thenComparing(dateComparatorLEx))
				.collect(Collectors.toList());
		
		model.put("filter", filter);
		model.put("reviews", reviews);
		return "showResults";
	}

}
