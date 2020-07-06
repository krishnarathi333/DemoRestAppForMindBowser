package com.rest.demoRest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ManagerResource {
	@Autowired
	private ManagerDAOService managerData;
	
	@GetMapping(path="/getAllUser")
	public List<managesrBean> toGetData(){
		return managerData.toGetAllData();
	}
	
	@GetMapping(path="/getAllUser/{user}")
	public managesrBean toGetsingleData(@PathVariable String user){
		return managerData.toGetSingleRecord(user);
	}
	
	@DeleteMapping(path="/deleteByName/{user}")
	public void toDeleteByName(@PathVariable String user){
		managesrBean user1 = managerData.toDeleteByName(user);
		
	}
	
   
	@PostMapping(path="/postAllUser")
	public ResponseEntity<Object> tosetData(@RequestBody managesrBean mgrBean){
		//return managerData.toGetAllData();
		managesrBean savedManager = managerData.save(mgrBean);
		 
		  URI location = ServletUriComponentsBuilder.fromCurrentRequest().
		  path("/{user}").buildAndExpand(savedManager.firstName).toUri();
		  
		  return ResponseEntity.created(location).build();
		 
	}
}
