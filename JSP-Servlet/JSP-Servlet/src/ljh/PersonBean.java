package ljh;

import java.io.Serializable;

/**
 * 사람의 신상 정보를 담는 클래스
 * (ctrl+alt+shift+j)
 * @author 임지현
 */
public class PersonBean implements Serializable {	
	private static final long serialVersionUID = 6842202353402603963L;
	
	private String name, nickname;
	private int age = 0;
	
	public PersonBean() {
	}
	
	/**
	 * 이름을 조회 하여 반환 한다.
	 * @return 이름
	 */
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
