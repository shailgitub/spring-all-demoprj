package com.sdev.springallproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sdev.springallproject.model.Test;

@Service
public class TestService {

	Test test;

	public List<Test> getAllNames() {
		List testList = new ArrayList<Test>();
		testList.add(new Test("test1"));
		testList.add(new Test("test22"));
		testList.add(new Test("test3"));
		testList.add(new Test("test4"));
		return testList;
	}
}
