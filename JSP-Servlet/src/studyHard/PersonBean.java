package studyHard;

import java.io.Serializable;
import java.util.Arrays;

public class PersonBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String nickname;
	private int age;
	private String[] associatedWords;
	

	public PersonBean() {
	}
	
	public String[] getAssociatedWords() {
		return associatedWords;
	}

	public void setAssociatedWords(String[] associatedWords) {
		this.associatedWords = associatedWords;
	}	

	public int getAge() { return age; }
	public String getName() { return name; }
	public String getNickname() { return nickname; }
	
    public void setAge(int age) { this.age = age; }    
	public void setName(String name) { this.name = name; }    
	public void setNickname(String nickname) { this.nickname = nickname; }


	@Override
	public String toString() {
		return "PersonBean [name=" + name + ", nickname=" + nickname + ", age=" + age + ", associatedWords="
				+ Arrays.toString(associatedWords) + "]";
	}

	
}
