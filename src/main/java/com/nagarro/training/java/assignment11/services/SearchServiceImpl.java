package com.nagarro.training.java.assignment11.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.training.java.assignment11.exceptionhandlers.RepositoryException;
import com.nagarro.training.java.assignment11.models.Record;
import com.nagarro.training.java.assignment11.repositories.RecordsRepositoryImpl;

@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	RecordsRepositoryImpl recordsRepository;

	/* (non-Javadoc)
	 * @see com.nagarro.training.java.assignment11.services.SearchService#getAllRecords()
	 */
	@Override
	public List<Record> getAllRecords() throws RepositoryException {

		return recordsRepository.getAllRecords();
	}

	/* (non-Javadoc)
	 * @see com.nagarro.training.java.assignment11.services.SearchService#getAllMatchedRecords(com.nagarro.training.java.assignment11.models.Record)
	 */
	@Override
	public List<Record> getAllMatchedRecords(Record recordTobeMatched) throws RepositoryException {

		return recordsRepository.getFilteredRecords(recordTobeMatched);

	}

}
