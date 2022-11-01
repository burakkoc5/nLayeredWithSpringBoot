package kodlama.io.Devs.dataAccess.abstracts;


import kodlama.io.Devs.entities.concretes.CodingLanguage;

import java.util.List;

public interface CodingLanguageRepository {
    List<CodingLanguage> getAll();
    void add(CodingLanguage codingLanguage);
    void delete(CodingLanguage codingLanguage);

    public void update(String languageName, int id);

    public CodingLanguage getById(int id );
}
