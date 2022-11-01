package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCodingLanguageRepository implements CodingLanguageRepository {

    private List<CodingLanguage> codingLanguages;

    public InMemoryCodingLanguageRepository() {
        this.codingLanguages = new ArrayList<CodingLanguage>();
        codingLanguages.add(new CodingLanguage(1,"Java"));
        codingLanguages.add(new CodingLanguage(2,"C#"));
        codingLanguages.add(new CodingLanguage(3,"C"));
        codingLanguages.add(new CodingLanguage(4,"C++"));

    }

    public CodingLanguage getById(int id ){
        for (CodingLanguage codingLanguage:
             codingLanguages) {
            if (codingLanguage.getId()==id){
                return codingLanguage;
            }

        }
        return null;
    }

    @Override
    public List<CodingLanguage> getAll() {
        return codingLanguages;
    }

    @Override
    public void add(CodingLanguage codingLanguage) {
        codingLanguages.add(codingLanguage);
    }

    @Override
    public void delete(CodingLanguage codingLanguage) {
        codingLanguages.remove(codingLanguage);
    }

    @Override
    public void update(String languageName, int id){
        CodingLanguage givenLanguage = getById(id);
        givenLanguage.setName(languageName);
    }
}
