package com.example.restcar;

import java.util.HashSet;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class RentController {
	
	HashSet<Car> cars = new HashSet<Car>();
	
	public RentController() {
		cars.add(new Car("AAA-333-BBB", false));
		cars.add(new Car("CCC-888-RRR", true));
		cars.add(new Car("ZZZ-111-OOO", false));
		cars.add(new Car("SSS-666-PPP", true));
		cars.add(new Car("TTT-222-NNN", false));
		cars.add(new Car("UUU-999-FFF", false));
		cars.add(new Car("DDD-999-GGG", true));
		cars.add(new Car("MMM-777-VVV", true));
	}

	@RequestMapping(value="/cars", method=RequestMethod.GET)
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	@ResponseBody
	public HashSet<Car> listOfCars() {
		return cars;
		
	}
}
