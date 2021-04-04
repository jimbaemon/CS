package sample.datajpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import sample.datajpa.entity.Member;

@Repository
public class MemberJpaRepository {

	@PersistenceContext
	private EntityManager em;

	public Member save(Member member){
		em.persist(member);
		return member;
	}

	public Member find(Long id){
		return em.find(Member.class, id);
	}

}
