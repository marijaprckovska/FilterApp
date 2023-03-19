package com.beans;

import java.util.List;

public class Reviews {
	private int id;
    public String reviewId;
    public String reviewFullText;
    public String reviewText;
    private int numLikes;
	private int numComments;
	private int numShares;
	private int rating;
    public String reviewCreatedOn;
    public String reviewCreatedOnDate;
    private int reviewCreatedOnTime;
    public String reviewerId;
    public String reviewerUrl;
    public String reviewerName;
    public String reviewerEmail;
    public String sourceType;
    public String isVerified;
    public String source;
    public String sourceName;
    public String sourceId;
    public List<String> tags;
    public String href;
    public String logoHref;
    public List<String> photos;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewFullText() {
		return reviewFullText;
	}
	public void setReviewFullText(String reviewFullText) {
		this.reviewFullText = reviewFullText;
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public int getNumLikes() {
		return numLikes;
	}
	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}
	public int getNumComments() {
		return numComments;
	}
	public void setNumComments(int numComments) {
		this.numComments = numComments;
	}
	public int getNumShares() {
		return numShares;
	}
	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReviewCreatedOn() {
		return reviewCreatedOn;
	}
	public void setReviewCreatedOn(String reviewCreatedOn) {
		this.reviewCreatedOn = reviewCreatedOn;
	}
	public String getReviewCreatedOnDate() {
		return reviewCreatedOnDate;
	}
	public void setReviewCreatedOnDate(String reviewCreatedOnDate) {
		this.reviewCreatedOnDate = reviewCreatedOnDate;
	}
	public int getReviewCreatedOnTime() {
		return reviewCreatedOnTime;
	}
	public void setReviewCreatedOnTime(int reviewCreatedOnTime) {
		this.reviewCreatedOnTime = reviewCreatedOnTime;
	}
	public String getReviewerId() {
		return reviewerId;
	}
	public void setReviewerId(String reviewerId) {
		this.reviewerId = reviewerId;
	}
	public String getReviewerUrl() {
		return reviewerUrl;
	}
	public void setReviewerUrl(String reviewerUrl) {
		this.reviewerUrl = reviewerUrl;
	}
	public String getReviewerName() {
		return reviewerName;
	}
	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	public String getReviewerEmail() {
		return reviewerEmail;
	}
	public void setReviewerEmail(String reviewerEmail) {
		this.reviewerEmail = reviewerEmail;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getLogoHref() {
		return logoHref;
	}
	public void setLogoHref(String logoHref) {
		this.logoHref = logoHref;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
        
}
