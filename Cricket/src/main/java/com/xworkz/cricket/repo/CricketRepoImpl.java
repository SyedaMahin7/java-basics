package com.xworkz.cricket.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.xworkz.cricket.entity.CricketEntity;


@Repository
public class CricketRepoImpl implements CricketRepo {
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	public CricketRepoImpl() {
		System.out.println(" repo methos is created");
	}

	@Override
	public boolean save(CricketEntity entity) {
		System.out.println("Running save in repository:" + entity);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(entity);
		entityTransaction.commit();
		entityManager.close();
		return true;
	}
	@Override
	public CricketEntity findById(int id) {
		System.out.println("Running find by id :" + id);

		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		CricketEntity fromDb = entityManager.find(CricketEntity.class, id);
		entityManager.close();
		return fromDb;
	}
	
	public List<CricketEntity> findByName(String name) {
		System.out.println("Running Find by name in repo:" + name);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName");

			query.setParameter("nam", name);

			List<CricketEntity> list = query.getResultList();

			System.out.println("Total list found in repo:" + list.size());

			return list;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean update(CricketEntity entity) {
		System.out.println("Running update in repo:" + entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();

		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
		} finally {
			manager.close();
		}
		return true;
	}
	@Override
	public CricketEntity deleteById(int id) {
		EntityManager manager=this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		CricketEntity delete=manager.find(CricketEntity.class, id);
		transaction.begin();
		manager.remove(delete);
		transaction.commit();
		manager.close();
		return delete;
	}

	

}
