package uk.ac.ox.ctsu.arts.translationservice.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Translation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "translation_sequence")
    @SequenceGenerator(name = "translation_sequence", sequenceName = "translation_sequence", allocationSize = 1)
    @Column
    private Long id;

    @Column
    private String language;

    @Column
    private String bundle;

    @Column
    private String key;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column
    private String value;

    @Column
    @CreatedDate
    private LocalDateTime changedWhen;
    @Column
    @CreatedBy
    private String changedWho;

    public LocalDateTime getChangedWhen() {
        return changedWhen;
    }

    public void setChangedWhen(LocalDateTime changedWhen) {
        this.changedWhen = changedWhen;
    }

    public String getChangedWho() {
        return changedWho;
    }

    public void setChangedWho(String changedWho) {
        this.changedWho = changedWho;
    }
}
