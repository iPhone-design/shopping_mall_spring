package kr.co.shopping_mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.shopping_mall.dao.ReviewDAO;
import kr.co.shopping_mall.model.Review;

@Service
public class ReviewService {
	@Autowired
	private ReviewDAO dao;
	
	public int reviewAdd(Review review) {
		return dao.reviewAdd(review);
	}
	
	public List<Review> reviewRead(int startRow) {
		return dao.reviewRead(startRow);
	}
	
	public int reviewCount() {
		return dao.reviewCount();
	}
	
	public void reviewDelete(int num, String path) {
		dao.reviewDelete(num, path);
	}
}
