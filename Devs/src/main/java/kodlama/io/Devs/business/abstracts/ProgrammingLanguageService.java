package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll() ;
	ProgrammingLanguage getById(int id) ;
	void add(ProgrammingLanguage Language) throws Exception;
	void update(ProgrammingLanguage Language);
	void delete(int id) ;
}
