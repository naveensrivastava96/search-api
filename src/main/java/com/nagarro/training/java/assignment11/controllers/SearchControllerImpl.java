package com.nagarro.training.java.assignment11.controllers;

import java.util.List;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.java.assignment11.models.Record;
import com.nagarro.training.java.assignment11.services.SearchService;
import com.nagarro.training.java.assignment11.constants.Constants;
import com.nagarro.training.java.assignment11.exceptionhandlers.RepositoryException;


@RestController
public class SearchControllerImpl implements SearchController {

	@Autowired
	SearchService searchService;
	
	/* (non-Javadoc)
	 * @see com.nagarro.training.java.assignment11.controllers.SearchController#getallRecords()
	 */
//	@Override
	@RequestMapping(value="/getallRecordsA", method=RequestMethod.GET)
	public ResponseEntity getallRecordsA()
	{
		try {
			return new ResponseEntity(searchService.getAllRecords(),HttpStatus.OK);
		} catch (RepositoryException e) {
			
			System.out.println(e.getMessage());
			
			return new ResponseEntity("error",HttpStatus.BAD_REQUEST);
 		}
		
	}
	
	

	/* (non-Javadoc)
	 * @see com.nagarro.training.java.assignment11.controllers.SearchController#searchRecord(com.nagarro.training.java.assignment11.models.Record)
	 */
	@Override
	@RequestMapping(value=Constants.searchRecord, method=RequestMethod.POST)
	public List<Record> searchRecord(@RequestBody Record record)
	{
		try {
			return searchService.getAllMatchedRecords(record);
		} catch (RepositoryException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}



	@Override
	public List<Record> getallRecords() {
		// TODO Auto-generated method stub
		return null;
	}

}
