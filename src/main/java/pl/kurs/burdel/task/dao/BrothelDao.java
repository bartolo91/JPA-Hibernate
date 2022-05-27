package pl.kurs.burdel.task.dao;

import pl.kurs.burdel.task.model.Brothel;

public interface BrothelDao {

    void save(Brothel brothel);

    Brothel getBrothel(Long id);

    void cleanUp();
}
