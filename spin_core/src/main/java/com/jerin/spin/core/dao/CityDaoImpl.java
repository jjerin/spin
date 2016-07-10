package com.jerin.spin.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jerin.spin.entity.customer.City;

@Repository
public class CityDaoImpl implements CityDao {
    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
    

	public City getCityById(Integer id) {
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query = em.createQuery("select a from City a where cityId = :cityId");
            query.setParameter("cityId", id);
            return (City)query.getSingleResult();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}

	public List<City> getAllCities() {
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query = em.createQuery("select c from City c");
            return (List<City>)query.getResultList();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}

}
