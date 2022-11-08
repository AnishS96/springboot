package com.logtest.controlservice;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/now/")
public class Serv {
	@RequestMapping(value="tester",method=RequestMethod.GET)
	public ResponseEntity<?>testapi(@RequestParam  Map<String,String> map) throws Exception{
	
		
		try {
System.out.println(map);
Logger log = LogManager.getLogger("Serv");
log.debug("testAPI started: " + map);
log.info("testAPI started: " + map);

}
		catch(Exception e){
			e.printStackTrace();
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
}
}


