package com.beans;

public class Filter {
	private String rating, minRating, orderDate, priorText;
	
	public Filter() {}
	public Filter(String rating, String minRating, String orderDate, String priorText){
		this.rating = rating;
		this.minRating = minRating;
		this.orderDate = orderDate;
		this.priorText = priorText;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getMinRating() {
		return minRating;
	}

	public void setMinRating(String minRating) {
		this.minRating = minRating;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getPriorText() {
		return priorText;
	}

	public void setPriorText(String priorText) {
		this.priorText = priorText;
	}

}
