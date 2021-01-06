package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review_table")
public class Review {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int reviewId;
	private String message;
	@ManyToOne
	private Product product;
	public Review() {
	}
	public Review(String message) {
		this.message = message;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", message=" + message + "]";
	}
	
	
	

}
