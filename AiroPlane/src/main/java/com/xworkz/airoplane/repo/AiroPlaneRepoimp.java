package com.xworkz.airoplane.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.airoplane.entity.AiroPlaneEntity;
@Repository
public class AiroPlaneRepoimp implements AiroPlaneRepo{
	@Autowired
	private EntityManagerFactory entityMangaerFactory;

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AiroPlaneRepoimp() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(AiroPlaneEntity entity) {
		System.out.println("Running save in Repository");
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}
    @Override
	public AiroPlaneEntity findById(int id) {
		System.out.println("find by id in repo " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AiroPlaneEntity fromDb = entityManager.find(AiroPlaneEntity.class, id);
		entityManager.close();
		return fromDb;
	}

	


	
}
