package com.sdev.springallproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdev.springallproject.model.Test;
import com.sdev.springallproject.service.TestService;

@RestController
@RequestMapping("/testapi")
public class TestController {
	@Autowired
	TestService testService;

	@GetMapping("/test")
	public List<Test> getAllTestNames() {
		return testService.getAllNames();

	}

//	//get Stock by Id
//		@GetMapping("/stocklist/{id}")
//		public ResponseEntity<Object> getStockById(@PathVariable Integer id) {
//			Optional<GoodRecordDetails> goodRecordDetails = stockService.getStockFindById(id);
//			if(!goodRecordDetails.isPresent()) throw new StockNotFoundException();
//				return new ResponseEntity<Object>(goodRecordDetails,HttpStatus.OK);
//		}
//		@GetMapping("/stocklist/test")
//		public ResponseEntity<Object> getStockById() {
//				return new ResponseEntity<Object>("Stock service Test success",HttpStatus.OK);
//		}

}
