package if6ae.jpa;

import if6ae.entity.InscricaoEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by bruno on 13/12/16.
 */
public class InscricaoJpa {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna uma inscrições pelo numero
     */
    public InscricaoEntity findByNumero(int numero) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<InscricaoEntity> cq = cb.createQuery(InscricaoEntity.class);
        Root<InscricaoEntity> rt = cq.from(InscricaoEntity.class);
        cq.where(cb.equal(rt.get("numero"), numero));
        TypedQuery<InscricaoEntity> q = em.createQuery(cq);
        return q.getSingleResult();
    }

    /**
     * Retorna uma inscrições pelo cpf
     */
    public InscricaoEntity findByCpf(int cpf) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<InscricaoEntity> cq = cb.createQuery(InscricaoEntity.class);
        Root<InscricaoEntity> rt = cq.from(InscricaoEntity.class);
        cq.where(cb.equal(rt.get("cpf"), cpf));
        TypedQuery<InscricaoEntity> q = em.createQuery(cq);
        return q.getSingleResult();
    }

    /**
     * Retorna todas inscrições
     */
    public List<InscricaoEntity> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<InscricaoEntity> cq = cb.createQuery(InscricaoEntity.class);
        TypedQuery<InscricaoEntity> q = em.createQuery(cq);
        return q.getResultList();
    }


}
