package uk.ac.ox.ctsu.arts.translationservice.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TranslationRepository extends JpaRepository<Translation, Long> {
    List<Translation> getByLocaleAndBundle(String locale, String bundle);
    List<Translation> getByLocale(String locale);
}

