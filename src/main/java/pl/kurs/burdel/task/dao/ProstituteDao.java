package pl.kurs.burdel.task.dao;


import pl.kurs.burdel.task.model.Prostitute;

import javax.persistence.NamedNativeQueries;
import java.util.List;

public interface ProstituteDao {
    void save(Prostitute prostitute);

    Prostitute getProstitute(Long id);

    void cleanUp();

    List<Prostitute> getAllProstitutes();
}
