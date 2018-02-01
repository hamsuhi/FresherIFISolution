package com.minato.bean.entityManager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.minato.entity.User;

@Repository
@Transactional
public class UserService {

	@PersistenceContext
	private EntityManager entityManager;

	public void insert(User user) {
		entityManager.persist(user);
	}

	public void update(User oldUser, User newUser) {
		User editUser = findUserId(oldUser.getId());
		editUser.setName(newUser.getName());
		editUser.setEmail(newUser.getEmail());
		editUser.setAge(newUser.getAge());
		insert(editUser);
	}
	
	public void delete(long id) {
		entityManager.remove(findUserId(id));
	}
	
	public User findUserId(long id) {
		return entityManager.find(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		Query query = entityManager.createNamedQuery("user", User.class);
		return query.getResultList();
	}
}
