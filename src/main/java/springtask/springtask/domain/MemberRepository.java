package springtask.springtask.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;


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
