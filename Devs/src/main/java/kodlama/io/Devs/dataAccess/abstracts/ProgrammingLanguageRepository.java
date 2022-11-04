package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage Language);
	void update(ProgrammingLanguage Language);
	void delete(int id);
}
