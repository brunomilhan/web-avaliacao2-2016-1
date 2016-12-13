package if6ae.faces.mngbeans;

import if6ae.entity.InscricaoEntity;
import if6ae.entity.InscricaoMinicursoEntity;
import if6ae.jpa.InscricaoJpa;
import if6ae.jpa.InscricaoMinicursoJpa;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 13/12/16.
 */

@Named
@ApplicationScoped
public class InscricaoBean {
    private List<InscricaoEntity> list;

    public InscricaoBean() {
        list = new ArrayList<>();
    }

    public List<InscricaoEntity> getList() {
        InscricaoJpa jpa = new InscricaoJpa();
        list = jpa.findAll();
        return list;
    }

    public void setList(List<InscricaoEntity> list) {
        this.list = list;
    }
}
