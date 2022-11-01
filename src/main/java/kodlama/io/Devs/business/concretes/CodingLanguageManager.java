package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.CodingLanguageRepository;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CodingLanguageManager implements CodingLanguageService {

    private CodingLanguageRepository codingLanguageRepository;

    @Autowired
    public CodingLanguageManager(CodingLanguageRepository codingLanguageRepository) {
        this.codingLanguageRepository = codingLanguageRepository;
    }

    @Override
    public List<CodingLanguage> getAll() {
        return codingLanguageRepository.getAll();
    }

    @Override
    public void add(CodingLanguage codingLanguage) {
        if (codingLanguage.getName().isEmpty() || codingLanguage.getName().isBlank()){
            return;
        }

        codingLanguageRepository.add(codingLanguage);

    }

    @Override
    public void delete(CodingLanguage codingLanguage) {
        if (codingLanguageRepository.getAll().contains(codingLanguage)){
            codingLanguageRepository.delete(codingLanguage);
        }
    }
    @Override
    public void update(String languageName, int id){
        if (languageName.isEmpty() || languageName.isBlank()){
            return;
        }
        codingLanguageRepository.update(languageName,id);
    }
}
