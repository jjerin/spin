package com.jerin.spin.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jerin.spin.entity.customer.Address;

@Repository
public class AddressDaoImpl implements AddressDao {
    private EntityManagerFactory emf;

    @PersistenceUnit
    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
    

	public Address getAddressById(Integer id) {
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query = em.createQuery("select a from Address a where addressId = :addressId");
            query.setParameter("addressId", id);
            return (Address)query.getSingleResult();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}

	public List<Address> getAllAddress() {
        EntityManager em = this.emf.createEntityManager();
        try {
            Query query = em.createQuery("select a from Address a");
            return (List<Address>)query.getResultList();
        }
        finally {
            if (em != null) {
                em.close();
            }
        }
	}

}
