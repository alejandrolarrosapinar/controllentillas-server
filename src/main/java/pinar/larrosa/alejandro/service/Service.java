package pinar.larrosa.alejandro.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import pinar.larrosa.alejandro.domain.Tusuario;


@Repository
@Transactional
public class Service {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Tusuario> logging(Tusuario usuario) {
		Query query = entityManager.createQuery("select u from Tusuario u where u.login = :login and u.pass = :pass");
		query.setParameter("login", usuario.getLogin());
		query.setParameter("pass", usuario.getPass());
		List<Tusuario> usu =query.getResultList();
		System.out.println(usu);
		return usu;
	}
	
	public Tusuario loggup(Tusuario usuario) {
		entityManager.persist(usuario);
		return usuario;
	}
}
