package com.example;

import org.springframework.stereotype.Component;

/**
 * @author Endy
 * @create 2021-01-07 13:16
 **/
@Component
public class IndexDao {

	// @Autowired
	// private IndexDao1 indexDao1;

	// public IndexDao() {
	// 	System.out.println("IndexDao init");
	// }

	public IndexDao(IndexDao1 indexDao1) {

	}

	// @Autowired(required = false)
	// public IndexDao(MyImport myImport, IndexDao1 indexDao1) {
	// }

	public void test() {
		System.out.println("indexDao================");
	}
}
