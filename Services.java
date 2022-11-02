package com.operation.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/new/")
public class Services {
	int value;
	String str;
	@Autowired Controller object;
	@RequestMapping(value="test",method=RequestMethod.GET)
	public ResponseEntity<?>test(@RequestParam String obj,@RequestParam int a,@RequestParam int b)throws Exception{
		switch(obj) {
		case "add":
			value=object.add(a,b);
			break;
		case "sub":
			value=object.sub(a,b);
			break;
		case "mul":
			value=object.mul(a,b);
			break;
		case "div":
			value=object.div(a,b);
			break;
			default:
				value= -1;
				break;
		}
		return new ResponseEntity<>(value,HttpStatus.OK);
	}

}
