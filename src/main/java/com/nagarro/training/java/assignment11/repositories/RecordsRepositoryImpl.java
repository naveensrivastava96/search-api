package com.nagarro.training.java.assignment11.repositories;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.training.java.assignment11.constants.Constants;
import com.nagarro.training.java.assignment11.exceptionhandlers.RepositoryException;
import com.nagarro.training.java.assignment11.models.Record;

@Repository
public class RecordsRepositoryImpl implements RecordRepository {
	@Autowired
	SessionFactory sessionFactory;

	public RecordsRepositoryImpl() {

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Record> getAllRecords() throws RepositoryException {
		List<Record> list = null;
		try {

			Session session = sessionFactory.openSession();

			SQLQuery query = session.createSQLQuery(Constants.selectAllFlight);
			list = query.list();
			return list;
		} catch (Exception e) {
			throw new RepositoryException(Constants.errorMessage);
		}
		
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Record> getFilteredRecords(Record record) throws RepositoryException {
		List<Record> list = null;

		/*try {
			Session session = sessionFactory.openSession();
		
			String queryToSearch = Constants.selectWhereQuery;

			if (record.getDepLoc() != Constants.Empty && record.getDepLoc() != null) {
				queryToSearch = queryToSearch.concat(Constants.depLocLike + record.getDepLoc() + Constants.and);
			}

			if (record.getArrLoc() != Constants.Empty && record.getArrLoc() != null) {
				queryToSearch = queryToSearch.concat(Constants.arrLocLike + record.getArrLoc() + Constants.and);
			}

			if (record.getFlightClass() != Constants.Empty && record.getFlightClass() != null) {
				queryToSearch = queryToSearch.concat(Constants.classLike + record.getFlightClass() + Constants.and);
			}

			if (record.getValidTill() != Constants.Empty && record.getValidTill() != null) {
				queryToSearch = queryToSearch.concat(Constants.validTillLike + record.getValidTill() + Constants.and);
			}

			queryToSearch = queryToSearch.concat(Constants.whereEnd);

			SQLQuery query = session.createSQLQuery(queryToSearch);
			list = query.list();

		} catch (Exception e) {
			throw new RepositoryException(Constants.errorMessage);
 		}
		return list;
*/
		
		
		  
		  
//		  Configuration configuration = new Configuration();
//		  
//		 configuration.configure();
//		 
//		  ServiceRegistry serviceRegistry = new
//		  StandardServiceRegistryBuilder()
		  
//		  .applySettings(configuration.getProperties()).build();
		  
//		  SessionFactory sessionFactory =
//		  configuration.buildSessionFactory(serviceRegistry);
		  
		  Session session = sessionFactory.openSession();
		
		  Criteria criteria = session.createCriteria(Record.class);
		  
		  criteria.add(Restrictions.eq("depLoc", "DEL"));
		  criteria.add(Restrictions.eq("arrLoc", "MUB"));
		//  session.beginTransaction();
		  
		  List<Record> s = (List<Record>) criteria.list();
		  
		  for (Record u : s) {
		  
			  System.out.println(u.getDepLoc());
		  
		  }
		  
		 // session.getTransaction().commit();
		 return s;

	}

}
