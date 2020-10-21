package uk.ac.ox.ctsu.arts.addressservice.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.ac.ox.ctsu.arts.translationservice.controller.TranslationController;
import uk.ac.ox.ctsu.arts.translationservice.model.Translation;
import uk.ac.ox.ctsu.arts.translationservice.model.TranslationRepository;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TranslationControllerTest {
    private TranslationController translationController;
    @Mock
    TranslationRepository translationRepository;

    @BeforeEach
    void setUp() {
        translationController = new TranslationController(translationRepository);
    }

    @Test
    void getBundleCallsRepository() {
        String bundle = "home-screen";
        String language = "fr";
        Translation translation = new Translation();
        when(translationRepository.getByLocaleAndBundle(language, bundle)).thenReturn(asList(translation));
        translationController.getBundle(language, "home-screen");
    }

    @Test
    void getTranslationsCallsRepository() {
        String language = "fr";
        Translation translation = new Translation();
        when(translationRepository.getByLocale(language)).thenReturn(asList(translation));
        translationController.getTranslations(language);
    }
}
