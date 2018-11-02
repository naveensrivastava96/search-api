package com.nagarro.training.java.assignment11.controllers;

import java.util.List;

import com.nagarro.training.java.assignment11.exceptionhandlers.RepositoryException;
import com.nagarro.training.java.assignment11.models.Record;

public interface SearchController {

	List<Record> getallRecords();

	List<Record> searchRecord(Record record);

}