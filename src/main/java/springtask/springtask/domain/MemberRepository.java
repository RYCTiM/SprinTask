package springtask.springtask.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Getter
@Setter
@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;
    public Long save (Member member){
        em.persist(member);
        return member.getId();
    }
    public Member find (Long id){
        return em.find(Member.class,id);
    }
}
