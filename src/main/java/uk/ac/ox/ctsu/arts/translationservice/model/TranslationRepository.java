package uk.ac.ox.ctsu.arts.translationservice.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TranslationRepository extends JpaRepository<Translation, Long> {
    List<Translation> getByLanguageAndBundle(String language, String bundle);
    List<Translation> getByLanguage(String language);
}

