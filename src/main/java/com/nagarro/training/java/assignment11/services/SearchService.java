package com.nagarro.training.java.assignment11.services;

import java.util.List;

import com.nagarro.training.java.assignment11.exceptionhandlers.RepositoryException;
import com.nagarro.training.java.assignment11.models.Record;

public interface SearchService {

	List<Record> getAllRecords() throws RepositoryException;

	List<Record> getAllMatchedRecords(Record recordTobeMatched) throws RepositoryException;

}