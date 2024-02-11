package com.restapi.restapi;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
public class putservice {
	
	@Autowired
    datarepos repository;
	
	@GetMapping("/hello")
	public String sayhello()
	{
	 return ("Heello");
	}
		
	
	@PostMapping("/creser")
	public Dataobject Item(@RequestBody Dataobject dataobject){
		return repository.save(dataobject);
	}
	
///////////////////////////////////// 	
	@GetMapping("/fetchuser/{nid}")
	public Dataobject getUser(@PathVariable int nid){
		return repository.findById(nid).get();
	}
	
////////////////////////////////
	@GetMapping("/createdummy")
		public Dataobject createdummy() {
			Dataobject dataobject = new Dataobject(0,"naam","area");
			return repository.save(dataobject); 
		}
	}
	
     

