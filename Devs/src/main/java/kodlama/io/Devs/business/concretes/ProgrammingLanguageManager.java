package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager  implements ProgrammingLanguageService {

	private  ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll()  {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(ProgrammingLanguage Language) throws Exception {
		
		if(Language.getName()!=null) {
			List<ProgrammingLanguage> languages=programmingLanguageRepository.getAll();
			for(ProgrammingLanguage language2:languages) {
				if(Language.getName().equals(language2.getName())) {
					throw new Exception("Programlama Dili Mevcut");
				}
			}
			programmingLanguageRepository.add(Language);
		}
		else {
			throw new  Exception("Program İsmi boş bırakılamaz");
		}
	}

	@Override
	public void update(ProgrammingLanguage Language) {
		
		programmingLanguageRepository.update(Language);
	}

	@Override
	public void delete(int id)  {
		
		programmingLanguageRepository.delete(id);
		
	}

}
