package com.example;

import org.springframework.stereotype.Component;

/**
 * @author Endy
 * @create 2021-01-07 13:16
 **/
@Component
public class IndexDao1 {

	// @Autowired
	private IndexDao indexDao;

	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}

	public void test() {
		System.out.println("indexDao1================");
	}
}
