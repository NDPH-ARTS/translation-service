package uk.ac.ox.ctsu.arts.translationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.ox.ctsu.arts.translationservice.model.Translation;
import uk.ac.ox.ctsu.arts.translationservice.model.TranslationRepository;

import java.util.List;


@RestController
public class TranslationController {
    private final TranslationRepository translationRepository;

    public TranslationController(TranslationRepository translationRepository) {
        this.translationRepository = translationRepository;
    }

    @GetMapping("/translation/{language}/{bundle}")
    public List<Translation> getBundle(@PathVariable String language, @PathVariable String bundle) {
        return translationRepository.getByLocaleAndBundle(language, bundle);
    }

    @GetMapping("/translation/{language}")
    public List<Translation> getTranslations(@PathVariable String language) {
        return translationRepository.getByLocale(language);
    }
}
