package com.example.simpleboot.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleboot.service.Calculator;

@RestController
public class CalculatorCtrl {

	@Autowired
	private Calculator calculator;
	
	@RequestMapping("/sum")
	String sum(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}
	
}
