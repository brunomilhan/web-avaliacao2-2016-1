package if6ae.jpa;

import if6ae.entity.InscricaoMinicursoEntity;

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
public class InscricaoMinicursoJpa {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna todas as inscrições de minicurso por numero
     */
    public List<InscricaoMinicursoEntity> findInscricaoMinicursoByNumero(int numero) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<InscricaoMinicursoEntity> cq = cb.createQuery(InscricaoMinicursoEntity.class);
        Root<InscricaoMinicursoEntity> rt = cq.from(InscricaoMinicursoEntity.class);
        cq.where(cb.equal(rt.get("numeroInscricao"), numero));
        TypedQuery<InscricaoMinicursoEntity> q = em.createQuery(cq);
        return q.getResultList();
    }

}
