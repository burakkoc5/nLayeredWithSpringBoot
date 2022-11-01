package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.CodingLanguageService;
import kodlama.io.Devs.entities.concretes.CodingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/codinglanguages")
public class CodingLanguagesController {

    private CodingLanguageService codingLanguageService;

    @Autowired
    public CodingLanguagesController(CodingLanguageService codingLanguageService) {
        this.codingLanguageService = codingLanguageService;
    }

    @GetMapping("/getall")
    public List<CodingLanguage> getAll() {
        return codingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CodingLanguage codingLanguage) {
        codingLanguageService.add(codingLanguage);

    }

    @PostMapping("/delete")
    public void delete(@RequestBody CodingLanguage codingLanguage) {
            codingLanguageService.delete(codingLanguage);
    }

    @PutMapping("/update")
    public void update(@RequestParam String languageName, int id){
        codingLanguageService.update(languageName,id);
    }
}
