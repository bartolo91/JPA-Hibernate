package pl.kurs.burdel.task.service;

import pl.kurs.burdel.task.model.Prostitute;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProstituteService {

    public static List<Prostitute> getProstituteFilteredByHivAndAge(List<Prostitute> prostitutes, int maximumAge, boolean hasHiv) {
        return Optional.ofNullable(prostitutes).orElse(Collections.emptyList()).stream()
                .filter(Objects::nonNull)
                .filter(p -> p.isHasHIV() == hasHiv)
                .filter(p -> p.getAge() <= maximumAge)
                .toList();


    }
}
