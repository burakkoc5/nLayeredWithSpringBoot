package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.CodingLanguage;

import java.util.List;

public interface CodingLanguageService {
    List<CodingLanguage> getAll();
    void add(CodingLanguage codingLanguage);
    void delete(CodingLanguage codingLanguage);
    public void update(String languageName, int id);
}
