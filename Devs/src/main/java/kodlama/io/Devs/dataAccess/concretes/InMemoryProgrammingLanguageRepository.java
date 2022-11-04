package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository  implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> programmingLanguages;
	
	@Autowired
	public InMemoryProgrammingLanguageRepository(){
		programmingLanguages=new ArrayList<>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Javascript"));
		programmingLanguages.add(new ProgrammingLanguage(4,"Php"));
		programmingLanguages.add(new ProgrammingLanguage(5,"C++"));
		programmingLanguages.add(new ProgrammingLanguage(6,"Go"));
	}
	
	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		for(ProgrammingLanguage language:programmingLanguages) {
			if(language.getId()==id) {
				return language;
			}
		}
		throw null;
	}

	@Override
	public void add(ProgrammingLanguage Language) {
		programmingLanguages.add(Language);
		
	}

	@Override
	public void update(ProgrammingLanguage Language) {
		ProgrammingLanguage updateProgrammingLanguage=getById(Language.getId());
		updateProgrammingLanguage.setName(Language.getName());
		
	}

	@Override
	public void delete(int id) {
		
		ProgrammingLanguage deleteProgrammingLanguage=getById(id);
		programmingLanguages.remove(deleteProgrammingLanguage);
		
	}

}
