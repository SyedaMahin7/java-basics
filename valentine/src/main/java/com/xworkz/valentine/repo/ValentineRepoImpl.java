package com.xworkz.valentine.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentine.entity.ValentineEntity;

@Repository
public class ValentineRepoImpl implements  ValentineRepo {

	@Autowired
	private EntityManagerFactory entityMangaerFactory;

	public ValentineRepoImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	//@Override
	public boolean save(ValentineEntity entity) {
		System.out.println("running save in repository");
		EntityManager em = this.entityMangaerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return true;
	}
	

	
}
