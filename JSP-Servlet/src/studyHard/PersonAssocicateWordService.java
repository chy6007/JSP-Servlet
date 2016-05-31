package studyHard;

// TODO PersonAssocicateWordService를 Singleton Pattern 적용해 보기
public class PersonAssocicateWordService {
	
	private static PersonBean personbean = new PersonBean();	
	private PersonAssocicateWordService(){}	
	
	public static synchronized PersonBean getPersonBean(String name){
		final String JAMES_GOSLING = "James Gosling";
		final String GRADY_BOOCH = "Grady Booch";
				
		if(personbean==null){
			personbean = new PersonBean();
		}
		
		//PersonBean personbean = new PersonBean();		
		personbean.setName(name);
		
		if(name.equalsIgnoreCase(JAMES_GOSLING)) {
			personbean.setAge(49);
			String[] associatedWord = {"카네기 메론 대학교", "썬 마이크로 시스템", "Java", "Coffee", "Google"};
			personbean.setAssociatedWords(associatedWord);
			
		} else if(name.equalsIgnoreCase(GRADY_BOOCH)) { 
			personbean.setAge(50);	
			String[] associatedWord = {" "};
			personbean.setAssociatedWords(associatedWord);
		}
		else{
			personbean.setAge(0);	
			String[] associatedWord = {" "};
			personbean.setAssociatedWords(associatedWord);
		}

		return personbean;
	}
}
