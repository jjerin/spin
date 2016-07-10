package com.jerin.spin.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jerin.spin.entity.customer.Country;

@Repository
public class CountryDaoImpl implements CountryDao {
    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
    

	public Country getCountryById(Integer id) {
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query = em.createQuery("select c from Country c where countryId = :countryId");
            query.setParameter("countryId", id);
            return (Country)query.getSingleResult();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}

	public List<Country> getAllCountries() {
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query = em.createQuery("select c from Country c");
            return (List<Country>)query.getResultList();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}

}
