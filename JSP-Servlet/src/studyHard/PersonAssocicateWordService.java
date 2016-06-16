package studyHard;

import java.util.List;

/**
 * 사람에 해당하는 연관 단어를 조회 하는 클래스(Singleton)
 *  
 * @author 최희영
 */
public class PersonAssocicateWordService {


	private static PersonAssocicateWordService instance = null;

	private PersonAssocicateWordService(){}

	public static synchronized PersonAssocicateWordService getInstance() {
		if(instance == null){
			instance = new PersonAssocicateWordService();
		}		
		return instance;
	}

	/**
	 * 사람의 이름에 따른 연관 단어를 조회 한다.
	 * 
	 * @param name 사람 이름
	 * @return PersonBean
	 */
	public PersonBean getPersonBean(String name){
		final String JAMES_GOSLING = "James Gosling";
		final String GRADY_BOOCH = "Grady Booch";

		PersonBean personbean = new PersonBean();
		
		
		personbean.setName(name);

		if(name.equalsIgnoreCase(JAMES_GOSLING)) {
			personbean.setAge(49);
		
			List<String> associatedWords = getAssocicateWords(name);
			
			personbean.setAssociatedWords(associatedWords);
			
		} else if(name.equalsIgnoreCase(GRADY_BOOCH)) {
			personbean.setAge(50);
			
			List<String> associatedWords = getAssocicateWords(name);
			
			personbean.setAssociatedWords(associatedWords);
		}
		
		return personbean;
	}

	private List<String> getAssocicateWords(String name) {
		PersonAssocicateWordRepository repository = new PersonAssocicateWordRepository();
		List<String> associatedWords = repository.getAssocicateWords(name);
		return associatedWords;
	}
	
}
